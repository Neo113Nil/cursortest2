package com.tiktok.appevents;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.adjust.sdk.Constants;
import com.ironsource.U3;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.TTAppEvent;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import com.tiktok.appevents.edp.EDPConfig;
import com.tiktok.appevents.edp.TTEDPEventTrack;
import com.tiktok.iap.TTInAppPurchaseWrapper;
import com.tiktok.unity.TTUnityBridge;
import com.tiktok.util.HttpRequestUtil;
import com.tiktok.util.JSON;
import com.tiktok.util.NetworkTimeout;
import com.tiktok.util.SystemInfoUtil;
import com.tiktok.util.TTConst;
import com.tiktok.util.TTHandlerUtil;
import com.tiktok.util.TTLogger;
import com.tiktok.util.TTUtil;
import io.ktor.http.ContentDisposition;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TTAppEventLogger {
    public static final String NETWORK_IS_TURNED_OFF = "SDK can't send tracking events to server, it will be cached locally, and will be sent in batches only after startTracking";
    static final String SKIP_FLUSHING_BECAUSE_GLOBAL_CONFIG_IS_NOT_FETCHED = "Skip flushing because global config is not fetched";
    static final String SKIP_FLUSHING_BECAUSE_GLOBAL_SWITCH_IS_TURNED_OFF = "Skip flushing because global switch is turned off";
    static final String TAG = "TTAppEventLogger";
    static final int THRESHOLD = 100;
    private static int TIME_BUFFER = 0;
    public static volatile boolean autoTrackRetentionEnable = true;
    static int totalDumped;
    final TTAutoEventsManager autoEventsManager;
    int counter;
    final List<TTConst.AutoEvents> disabledEvents;
    private final Runnable heartRunnable;
    Lifecycle lifecycle;
    final boolean lifecycleTrackEnable;
    TTLogger logger;
    final Handler uiThreadHandler;
    static final ScheduledExecutorService eventLoop = Executors.newSingleThreadScheduledExecutor(new TTThreadFactory());
    static final ScheduledExecutorService timerService = Executors.newSingleThreadScheduledExecutor(new TTThreadFactory());
    static boolean metricsEnabled = true;
    private static final TTLifecycleListener mLifecycleListener = new TTLifecycleListener();
    int flushId = 0;
    ScheduledFuture<?> future = null;
    ScheduledFuture<?> timeFuture = null;
    private final Runnable batchFlush = new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda9
        @Override // java.lang.Runnable
        public final void run() {
            TTAppEventLogger.this.m7579lambda$new$0$comtiktokappeventsTTAppEventLogger();
        }
    };

    public enum FlushReason {
        THRESHOLD,
        TIMER,
        START_UP,
        FORCE_FLUSH,
        IDENTIFY,
        LOGOUT
    }

    /* renamed from: lambda$new$0$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m7579lambda$new$0$comtiktokappeventsTTAppEventLogger() {
        m7577lambda$flushWithReason$6$comtiktokappeventsTTAppEventLogger(FlushReason.TIMER);
    }

    public static List<TTAppEvent> getSuccessfulEvents() {
        return TTRequest.getSuccessfullySentRequests();
    }

    public TTAppEventLogger(boolean lifecycleTrackEnable, List<TTConst.AutoEvents> disabledEvents, int flushTime, boolean monitorDisable) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.uiThreadHandler = handler;
        this.heartRunnable = new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTAppEventLogger.this.startHeart();
                    if (!TTActivityLifecycleCallbacksListener.isBackground() && TikTokBusinessSdk.isGlobalConfigFetched().booleanValue() && TikTokBusinessSdk.isSystemActivated()) {
                        TikTokBusinessSdk.getAppEventLogger().monitorMetric("session_activity", TTUtil.getMetaWithTS(Long.valueOf(System.currentTimeMillis())), null);
                    }
                } catch (Throwable unused) {
                }
            }
        };
        this.logger = new TTLogger(TAG, TikTokBusinessSdk.getLogLevel());
        this.lifecycleTrackEnable = lifecycleTrackEnable;
        this.disabledEvents = disabledEvents;
        TIME_BUFFER = flushTime;
        this.counter = flushTime;
        this.lifecycle = ProcessLifecycleOwner.get().getLifecycle();
        if (monitorDisable) {
            metricsEnabled = false;
        }
        Runnable runnable = new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTAppEventLogger.this.lifecycle.addObserver(new TTActivityLifecycleCallbacksListener(TTAppEventLogger.this));
                    TikTokBusinessSdk.getApplicationContext().registerActivityLifecycleCallbacks(TTAppEventLogger.mLifecycleListener);
                } catch (Throwable unused) {
                }
            }
        };
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        } catch (Throwable unused) {
        }
        this.autoEventsManager = new TTAutoEventsManager(this);
    }

    public void initConfig(long initTimeMS, final TikTokBusinessSdk.TTInitCallback callback, final AtomicBoolean sdkInitialized) {
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventLogger.this.m7578lambda$initConfig$1$comtiktokappeventsTTAppEventLogger(sdkInitialized, callback);
            }
        });
        fetchGlobalConfig(0);
        monitorMetric("init_start", TTUtil.getMetaWithTS(Long.valueOf(initTimeMS)), null);
    }

    /* renamed from: lambda$initConfig$1$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m7578lambda$initConfig$1$comtiktokappeventsTTAppEventLogger(final AtomicBoolean sdkInitialized, final TikTokBusinessSdk.TTInitCallback callback) {
        try {
            startHeart();
            SystemInfoUtil.initAppSessionId();
            SystemInfoUtil.initInstallReferrer();
            SystemInfoUtil.updateSensigInfo();
            SystemInfoUtil.initUserAgent();
            TTAppEventsQueue.clearAll();
            TTEdpAppEventsQueue.clearAll();
            sdkInitialized.set(true);
            if (callback != null) {
                callback.success();
            }
        } catch (Throwable th) {
            this.logger.error(th, "init error", new Object[0]);
        }
    }

    void persistEvents() {
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventStorage.persist(null);
            }
        });
    }

    public void trackPurchase(List<TTPurchaseInfo> purchaseInfos) {
        trackPurchase(false, purchaseInfos);
    }

    public void trackPurchase(final boolean isHistory, final List<TTPurchaseInfo> purchaseInfos) {
        if (!TikTokBusinessSdk.isSystemActivated()) {
            this.logger.info("Global switch is off, ignore track purchase", new Object[0]);
        } else {
            addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TTAppEventLogger.this.m7580lambda$trackPurchase$3$comtiktokappeventsTTAppEventLogger(purchaseInfos, isHistory);
                }
            });
        }
    }

    /* renamed from: lambda$trackPurchase$3$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m7580lambda$trackPurchase$3$comtiktokappeventsTTAppEventLogger(final List purchaseInfos, final boolean isHistory) {
        if (purchaseInfos.isEmpty()) {
            return;
        }
        Iterator it = purchaseInfos.iterator();
        while (it.hasNext()) {
            TTPurchaseInfo tTPurchaseInfo = (TTPurchaseInfo) it.next();
            JSONObject purchaseProps = TTInAppPurchaseManager.getPurchaseProps(tTPurchaseInfo);
            if (purchaseProps != null) {
                track(isHistory ? "__purchase_history" : TTContentsEventConstants.ContentsEventName.EVENT_NAME_PURCHASE, purchaseProps, tTPurchaseInfo.getEventId());
            }
        }
    }

    public void startHeart() {
        try {
            TTHandlerUtil.getInstance().removeCallbacks(this.heartRunnable);
            TTHandlerUtil.getInstance().postDelayed(this.heartRunnable, 60000L);
        } catch (Throwable unused) {
        }
    }

    public void closeHeart() {
        TTHandlerUtil.getInstance().removeCallbacks(this.heartRunnable);
    }

    void startScheduler() {
        int i = TIME_BUFFER;
        if (i != 0) {
            doStartScheduler(i, false);
        }
    }

    void restartScheduler() {
        int i = TIME_BUFFER;
        if (i != 0) {
            doStartScheduler(i, true);
        }
    }

    private void doStartScheduler(final int interval, boolean immediate) {
        try {
            if (this.future == null) {
                this.future = eventLoop.scheduleWithFixedDelay(this.batchFlush, immediate ? 0L : interval, interval, TimeUnit.SECONDS);
            }
            if (this.timeFuture != null || TikTokBusinessSdk.nextTimeFlushListener == null) {
                return;
            }
            this.counter = interval;
            this.timeFuture = timerService.scheduleWithFixedDelay(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    TTAppEventLogger.this.m7575lambda$doStartScheduler$4$comtiktokappeventsTTAppEventLogger(interval);
                }
            }, 0L, 1L, TimeUnit.SECONDS);
        } catch (Throwable unused) {
            TikTokBusinessSdk.setSdkGlobalSwitch(false);
        }
    }

    /* renamed from: lambda$doStartScheduler$4$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m7575lambda$doStartScheduler$4$comtiktokappeventsTTAppEventLogger(final int interval) {
        TikTokBusinessSdk.nextTimeFlushListener.timeLeft(this.counter);
        if (this.counter == 0) {
            this.counter = interval;
        }
        this.counter--;
    }

    void stopScheduler() {
        try {
            ScheduledFuture<?> scheduledFuture = this.future;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.future = null;
            }
            ScheduledFuture<?> scheduledFuture2 = this.timeFuture;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.timeFuture = null;
            }
        } catch (Throwable th) {
            this.logger.error(th, "stop scheduler exception", new Object[0]);
        }
    }

    public boolean identify(String externalId, String externalUserName, String phoneNumber, String email) {
        try {
            TTUserInfo tTUserInfo = TTUserInfo.sharedInstance;
            if (tTUserInfo.isIdentified()) {
                this.logger.warn("SDK is already identified, if you want to switch to anotheruser account, plz call TiktokBusinessSDK.logout() first and then identify", new Object[0]);
                return false;
            }
            tTUserInfo.setIdentified();
            if (!TextUtils.isEmpty(externalId)) {
                tTUserInfo.setExternalId(externalId);
            }
            if (!TextUtils.isEmpty(externalUserName)) {
                tTUserInfo.setExternalUserName(externalUserName);
            }
            if (!TextUtils.isEmpty(phoneNumber)) {
                tTUserInfo.setPhoneNumber(phoneNumber);
            }
            if (!TextUtils.isEmpty(email)) {
                tTUserInfo.setEmail(email);
            }
            trackEvent(TTAppEvent.TTAppEventType.identify, null, null, null, false);
            flushWithReason(FlushReason.IDENTIFY);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void logout() {
        TTUserInfo.reset(TikTokBusinessSdk.getApplicationContext(), true);
        flushWithReason(FlushReason.LOGOUT);
    }

    public void track(String event, JSONObject props) {
        trackEvent(TTAppEvent.TTAppEventType.track, event, props, null, false);
    }

    public void track(String event, JSONObject props, String eventId) {
        trackEvent(TTAppEvent.TTAppEventType.track, event, props, eventId, false);
    }

    public void trackEdp(String event, JSONObject props, String eventId) {
        trackEvent(TTAppEvent.TTAppEventType.track, event, props, eventId, true);
    }

    private void trackEvent(final TTAppEvent.TTAppEventType type, final String event, JSONObject props, final String eventId, final boolean edp) {
        if (!TikTokBusinessSdk.isSystemActivated() || TextUtils.isEmpty(TikTokBusinessSdk.getAppId())) {
            return;
        }
        try {
            if ("enhanced_data_postback".equals(JSON.getString(props, "monitor_type", ""))) {
                TTEDPEventTrack.trackUnityEvent(event, props);
                return;
            }
        } catch (Throwable unused) {
        }
        if (props == null) {
            props = JSON.build();
        }
        final JSONObject jSONObject = props;
        if (TikTokBusinessSdk.isEnableDebugMode().booleanValue()) {
            this.uiThreadHandler.post(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (edp) {
                            JSON.putObject(jSONObject, "track_source", "edp");
                        }
                        TTAppEvent tTAppEvent = new TTAppEvent(type, event, jSONObject.toString(), eventId, TikTokBusinessSdk.getTTAppIds());
                        tTAppEvent.setScreenShot();
                        TTAppEventLogger.this.addToTask(tTAppEvent, null, null, null, null, edp);
                    } catch (Throwable unused2) {
                    }
                }
            });
        } else {
            addToTask(null, type, event, jSONObject, eventId, edp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addToTask(final TTAppEvent appEvent, final TTAppEvent.TTAppEventType type, final String event, final JSONObject props, final String eventId, final boolean edp) {
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventLogger.this.m7574lambda$addToTask$5$comtiktokappeventsTTAppEventLogger(appEvent, edp, props, type, event, eventId);
            }
        });
    }

    /* renamed from: lambda$addToTask$5$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m7574lambda$addToTask$5$comtiktokappeventsTTAppEventLogger(final TTAppEvent appEvent, final boolean edp, final JSONObject props, final TTAppEvent.TTAppEventType type, final String event, final String eventId) {
        if (appEvent == null) {
            if (edp) {
                try {
                    JSON.putObject(props, "track_source", "edp");
                } catch (Throwable unused) {
                    return;
                }
            }
            appEvent = new TTAppEvent(type, event, props == null ? "" : props.toString(), eventId, TikTokBusinessSdk.getTTAppIds());
        }
        if (edp) {
            TTEdpAppEventsQueue.addEvent(appEvent);
        } else {
            TTAppEventsQueue.addEvent(appEvent);
        }
        if (TTAppEventsQueue.size() + TTEdpAppEventsQueue.size() > 100) {
            m7577lambda$flushWithReason$6$comtiktokappeventsTTAppEventLogger(FlushReason.THRESHOLD);
        }
    }

    public void forceFlush() {
        flushWithReason(FlushReason.FORCE_FLUSH);
    }

    public void flushWithReason(final FlushReason reason) {
        this.logger.debug(reason.name() + " triggered flush", new Object[0]);
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventLogger.this.m7577lambda$flushWithReason$6$comtiktokappeventsTTAppEventLogger(reason);
            }
        });
    }

    private void activateSdk() {
        this.autoEventsManager.trackOnAppOpenEvents();
        startScheduler();
        m7577lambda$flushWithReason$6$comtiktokappeventsTTAppEventLogger(FlushReason.START_UP);
        TTEDPEventTrack.trackFirstAppLaunch();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: flush, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m7577lambda$flushWithReason$6$comtiktokappeventsTTAppEventLogger(FlushReason reason) {
        int i;
        Throwable th;
        long currentTimeMillis = System.currentTimeMillis();
        TTUtil.checkThread(TAG);
        int i2 = 0;
        if (!TikTokBusinessSdk.isGlobalConfigFetched().booleanValue()) {
            this.logger.info(SKIP_FLUSHING_BECAUSE_GLOBAL_CONFIG_IS_NOT_FETCHED, new Object[0]);
            return;
        }
        if (!TikTokBusinessSdk.isSystemActivated()) {
            this.logger.info(SKIP_FLUSHING_BECAUSE_GLOBAL_SWITCH_IS_TURNED_OFF, new Object[0]);
            return;
        }
        try {
        } catch (Throwable th2) {
            i = 0;
            th = th2;
        }
        if (TikTokBusinessSdk.getNetworkSwitch()) {
            this.logger.debug("Start flush, version %d reason is %s", Integer.valueOf(this.flushId), reason.name());
            TTAppEventPersist readFromDisk = TTAppEventStorage.readFromDisk();
            readFromDisk.addEvents(TTAppEventsQueue.exportAllEvents());
            i = readFromDisk.getAppEvents().size() + TTEdpAppEventsQueue.size();
            try {
                List<TTAppEvent> reportAppEvent = TTRequest.reportAppEvent(TTRequestBuilder.getBasePayloadWithTs(), readFromDisk.getAppEvents(), false);
                TTRequest.reportAppEvent(TTRequestBuilder.getBasePayloadWithTs(), TTEdpAppEventsQueue.exportAllEvents(), true);
                if (reportAppEvent != null && !reportAppEvent.isEmpty()) {
                    this.logger.debug("Failed to send %d events, will save to disk", Integer.valueOf(reportAppEvent.size()));
                    TTAppEventStorage.persist(reportAppEvent);
                }
                this.logger.debug("END flush, version %d reason is %s", Integer.valueOf(this.flushId), reason.name());
                this.flushId++;
            } catch (Throwable th3) {
                th = th3;
                try {
                    TTEdpAppEventsQueue.clearAll();
                    TTCrashHandler.handleCrash(TAG, th, 2);
                } catch (Throwable unused) {
                }
                i2 = i;
                if (i2 != 0) {
                }
                addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        TTCrashHandler.initCrashReporter();
                    }
                });
            }
            i2 = i;
            if (i2 != 0) {
                try {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    JSONObject metaWithTS = TTUtil.getMetaWithTS(Long.valueOf(currentTimeMillis));
                    JSON.putLong(metaWithTS, "latency", currentTimeMillis2 - currentTimeMillis);
                    JSON.putObject(metaWithTS, "type", reason.name());
                    JSON.putInt(metaWithTS, "interval", TIME_BUFFER);
                    JSON.putInt(metaWithTS, ContentDisposition.Parameters.Size, i2);
                    monitorMetric("flush", metaWithTS, null);
                } catch (Throwable unused2) {
                }
            }
            addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    TTCrashHandler.initCrashReporter();
                }
            });
        }
        this.logger.info(NETWORK_IS_TURNED_OFF, new Object[0]);
        TTAppEventStorage.persist(null);
        if (i2 != 0) {
        }
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                TTCrashHandler.initCrashReporter();
            }
        });
    }

    public void destroy() {
        TTAppEventsQueue.clearAll();
        TTEdpAppEventsQueue.clearAll();
        stopScheduler();
    }

    public void addToQ(Runnable task) {
        try {
            eventLoop.execute(task);
        } catch (Throwable th) {
            onExecuteFailed(task, th);
        }
    }

    private void onExecuteFailed(Runnable runnable, Throwable e) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.logger.error(e, "Runnable execute error", new Object[0]);
        }
    }

    private void addToLater(Runnable task, int seconds) {
        try {
            eventLoop.schedule(task, seconds, TimeUnit.SECONDS);
        } catch (Throwable th) {
            onExecuteFailed(task, th);
        }
    }

    public void clearAll() {
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventLogger.this.clearAllImmediately();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllImmediately() {
        TTAppEventsQueue.clearAll();
        TTEdpAppEventsQueue.clearAll();
        TTAppEventStorage.clearAll();
    }

    public void fetchGlobalConfig(int delaySeconds) {
        addToLater(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventLogger.this.m7576lambda$fetchGlobalConfig$7$comtiktokappeventsTTAppEventLogger();
            }
        }, delaySeconds);
    }

    /* renamed from: lambda$fetchGlobalConfig$7$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m7576lambda$fetchGlobalConfig$7$comtiktokappeventsTTAppEventLogger() {
        boolean z;
        Runnable runnable;
        try {
            this.logger.info("Fetching global config....", new Object[0]);
            JSONObject businessSDKConfig = TTRequest.getBusinessSDKConfig();
            if (businessSDKConfig == null) {
                this.logger.info("config is null, api returns error", new Object[0]);
                businessSDKConfig = TTRequest.getBusinessSDKConfig();
                if (businessSDKConfig == null) {
                    this.logger.info("config is null, api returns error2", new Object[0]);
                    if (!TikTokBusinessSdk.isSystemActivated() || TikTokBusinessSdk.isActivatedLogicRun) {
                        return;
                    }
                    TikTokBusinessSdk.isActivatedLogicRun = true;
                    activateSdk();
                    return;
                }
            }
            JSONObject jsonObject = JSON.getJsonObject(businessSDKConfig, "business_sdk_config");
            z = JSON.getBoolean(jsonObject, EDPConfig.ConfigConst.ENABLE_SDK, false);
            try {
                String string = JSON.getString(jsonObject, "available_version");
                String string2 = JSON.getString(jsonObject, U3.j.D);
                NetworkTimeout.updateConfig(jsonObject);
                TikTokBusinessSdk.setSdkGlobalSwitch(Boolean.valueOf(z));
                this.logger.debug("enable_sdk=" + z, new Object[0]);
                if (!z) {
                    this.logger.info("Clear all events and stop timers because global switch is not turned on", new Object[0]);
                    clearAllImmediately();
                }
                TikTokBusinessSdk.setApiAvailableVersion(string);
                TikTokBusinessSdk.setApiTrackDomain(string2);
                this.logger.debug("available_version=" + string, new Object[0]);
                TikTokBusinessSdk.setGlobalConfigFetched();
                autoTrackRetentionEnable = JSON.getBoolean(jsonObject, "auto_track_Retention_enable");
                TTInAppPurchaseWrapper.updateConfig(jsonObject);
                TTUnityBridge.setConfigCallback(businessSDKConfig);
                EDPConfig.optConfig(JSON.getJsonObject(jsonObject, EDPConfig.ConfigConst.EDP_NATIVE_SDK_CONFIG));
                if (TikTokBusinessSdk.isSystemActivated() && !TikTokBusinessSdk.isActivatedLogicRun) {
                    TikTokBusinessSdk.isActivatedLogicRun = true;
                    activateSdk();
                }
            } catch (Throwable th) {
                th = th;
                try {
                    this.logger.error(th, "Errors occurred during initGlobalConfig", new Object[0]);
                    if (TikTokBusinessSdk.isSystemActivated() && !TikTokBusinessSdk.isActivatedLogicRun) {
                        TikTokBusinessSdk.isActivatedLogicRun = true;
                        activateSdk();
                    }
                    if (!z || DebugModeHelper.isSuccess()) {
                        return;
                    }
                    runnable = new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda8
                        @Override // java.lang.Runnable
                        public final void run() {
                            DebugModeHelper.tryRequestConfig();
                        }
                    };
                    addToQ(runnable);
                } catch (Throwable th2) {
                    if (TikTokBusinessSdk.isSystemActivated() && !TikTokBusinessSdk.isActivatedLogicRun) {
                        TikTokBusinessSdk.isActivatedLogicRun = true;
                        activateSdk();
                    }
                    if (z && !DebugModeHelper.isSuccess()) {
                        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda8
                            @Override // java.lang.Runnable
                            public final void run() {
                                DebugModeHelper.tryRequestConfig();
                            }
                        });
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        if (!z || DebugModeHelper.isSuccess()) {
            return;
        }
        runnable = new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                DebugModeHelper.tryRequestConfig();
            }
        };
        addToQ(runnable);
    }

    public void monitorMetric(final String name, final JSONObject meta, final JSONObject extra) {
        if (metricsEnabled) {
            addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    TTAppEventLogger.lambda$monitorMetric$8(name, meta, extra);
                }
            });
        }
    }

    static /* synthetic */ void lambda$monitorMetric$8(final String name, final JSONObject meta, final JSONObject extra) {
        JSONObject build;
        if (metricsEnabled) {
            try {
                build = TTRequestBuilder.getHealthMonitorBase();
            } catch (Throwable unused) {
                build = JSON.build();
            }
            JSONObject build2 = JSON.build();
            JSON.putObject(build2, "type", "metric");
            JSON.putObject(build2, "name", name);
            if (meta != null) {
                JSON.putObject(build2, Constants.REFERRER_API_META, meta);
            }
            if (extra != null) {
                JSON.putObject(build2, "extra", extra);
            }
            JSON.putObject(build, "monitor", build2);
            TTCrashHandler.retryLater(build);
        }
    }

    public void fetchDeferredDeeplinkWithCompletion(TikTokBusinessSdk.FetchDeferredDeeplinkCompletion callback) {
        final DeeplinkCallbackWrapper deeplinkCallbackWrapper = new DeeplinkCallbackWrapper(callback);
        deeplinkCallbackWrapper.markInit();
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventLogger.lambda$fetchDeferredDeeplinkWithCompletion$9(DeeplinkCallbackWrapper.this);
            }
        });
    }

    static /* synthetic */ void lambda$fetchDeferredDeeplinkWithCompletion$9(final DeeplinkCallbackWrapper wrapper) {
        ErrorData errorData;
        HttpRequestUtil.HttpResponse fetchDeferredDeeplinkWithCompletion;
        String string;
        String str = "";
        wrapper.markThread();
        try {
            fetchDeferredDeeplinkWithCompletion = TTRequest.fetchDeferredDeeplinkWithCompletion();
            string = JSON.getString(JSON.getJsonObject(fetchDeferredDeeplinkWithCompletion.body, "data"), "ddl");
            wrapper.markRequest();
        } catch (Throwable th) {
            errorData = new ErrorData(-2, th.getMessage());
        }
        if (fetchDeferredDeeplinkWithCompletion.isOK() && !TextUtils.isEmpty(string)) {
            errorData = null;
            str = string;
            wrapper.markEnd();
            wrapper.completion(str, errorData);
        }
        errorData = new ErrorData(fetchDeferredDeeplinkWithCompletion.getErrCode(), fetchDeferredDeeplinkWithCompletion.getErrMsg());
        wrapper.markEnd();
        wrapper.completion(str, errorData);
    }

    void persistMonitor() {
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                TTCrashHandler.persistToFile();
            }
        });
    }
}
