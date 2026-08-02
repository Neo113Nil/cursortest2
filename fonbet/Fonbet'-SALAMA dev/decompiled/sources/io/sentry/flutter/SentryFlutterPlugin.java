package io.sentry.flutter;

import A5.o;
import A5.q;
import A5.r;
import A5.s;
import B1.c;
import B4.E;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import f6.C1111d;
import g6.AbstractC1159h;
import g6.AbstractC1161j;
import g6.AbstractC1165n;
import g6.AbstractC1170s;
import g6.C1167p;
import g6.C1168q;
import io.sentry.Breadcrumb;
import io.sentry.DateUtils;
import io.sentry.HubAdapter;
import io.sentry.IScope;
import io.sentry.Integration;
import io.sentry.Sentry;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryDate;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.android.core.InternalSentrySdk;
import io.sentry.android.core.SentryAndroid;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.performance.ActivityLifecycleTimeSpan;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.User;
import io.sentry.rrweb.RRWebBreadcrumbEvent;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import io.sentry.transport.CurrentDateProvider;
import io.sentry.transport.ICurrentDateProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q2.g;
import q5.AbstractActivityC1559c;
import t6.e;
import t6.h;
import w5.C1782b;
import w5.InterfaceC1783c;
import x5.InterfaceC1789a;
import x5.InterfaceC1790b;

/* loaded from: classes2.dex */
public final class SentryFlutterPlugin implements InterfaceC1783c, q, InterfaceC1789a {
    public static final Companion Companion = new Companion(null);
    private static final long NATIVE_CRASH_WAIT_TIME = 500;
    private static ReplayIntegration replay;
    private WeakReference<Activity> activity;
    private s channel;
    private Context context;
    private Long pluginRegistrationTime;
    private SentryFlutter sentryFlutter;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final double adjustReplaySizeToBlockSize(double d7) {
            double d8 = 16;
            double d9 = d7 % d8;
            return d9 <= 8.0d ? d7 - d9 : d7 + (d8 - d9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void crash() {
            RuntimeException runtimeException = new RuntimeException("FlutterSentry Native Integration: Sample RuntimeException");
            Thread thread = Looper.getMainLooper().getThread();
            h.d(thread, "getMainLooper().thread");
            thread.getUncaughtExceptionHandler().uncaughtException(thread, runtimeException);
            thread.join(SentryFlutterPlugin.NATIVE_CRASH_WAIT_TIME);
        }

        public final ReplayIntegration privateSentryGetReplayIntegration() {
            return SentryFlutterPlugin.replay;
        }

        private Companion() {
        }
    }

    private final void addBreadcrumb(Map<String, ? extends Object> map, r rVar) {
        if (map != null) {
            SentryOptions options = HubAdapter.getInstance().getOptions();
            h.d(options, "getInstance().options");
            Sentry.addBreadcrumb(Breadcrumb.fromMap(map, options));
        }
        rVar.success("");
    }

    private final void addToMap(TimeSpan timeSpan, Map<String, Object> map) {
        String description;
        if (timeSpan.getStartTimestamp() == null || (description = timeSpan.getDescription()) == null) {
            return;
        }
        map.put(description, AbstractC1170s.M0(new C1111d("startTimestampMsSinceEpoch", Long.valueOf(timeSpan.getStartTimestampMs())), new C1111d("stopTimestampMsSinceEpoch", Long.valueOf(timeSpan.getProjectedStopTimestampMs()))));
    }

    private final void captureEnvelope(o oVar, r rVar) {
        if (!Sentry.isEnabled()) {
            rVar.error("1", "The Sentry Android SDK is disabled", null);
            return;
        }
        List list = (List) oVar.f677b;
        if (list == null) {
            list = C1167p.f13302a;
        }
        if (!list.isEmpty()) {
            byte[] bArr = (byte[]) AbstractC1159h.Q0(list);
            Object obj = list.get(1);
            h.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (bArr != null && bArr.length != 0) {
                if (InternalSentrySdk.captureEnvelope(bArr, booleanValue) != null) {
                    rVar.success("");
                    return;
                } else {
                    rVar.error("2", "Failed to capture envelope", null);
                    return;
                }
            }
        }
        rVar.error("3", "Envelope is null or empty", null);
    }

    private final void captureReplay(r rVar) {
        ReplayIntegration replayIntegration = replay;
        h.b(replayIntegration);
        replayIntegration.captureReplay(Boolean.FALSE);
        ReplayIntegration replayIntegration2 = replay;
        h.b(replayIntegration2);
        rVar.success(replayIntegration2.getReplayId().toString());
    }

    private final void clearBreadcrumbs(r rVar) {
        Sentry.clearBreadcrumbs();
        rVar.success("");
    }

    private final void closeNativeSdk(r rVar) {
        HubAdapter.getInstance().close();
        rVar.success("");
    }

    private final void displayRefreshRate(r rVar) {
        Activity activity;
        Window window;
        WindowManager windowManager;
        Activity activity2;
        Integer num = null;
        if (Build.VERSION.SDK_INT >= 30) {
            WeakReference<Activity> weakReference = this.activity;
            Display display = (weakReference == null || (activity2 = weakReference.get()) == null) ? null : activity2.getDisplay();
            if (display != null) {
                num = Integer.valueOf((int) display.getRefreshRate());
            }
        } else {
            WeakReference<Activity> weakReference2 = this.activity;
            Display defaultDisplay = (weakReference2 == null || (activity = weakReference2.get()) == null || (window = activity.getWindow()) == null || (windowManager = window.getWindowManager()) == null) ? null : windowManager.getDefaultDisplay();
            if (defaultDisplay != null) {
                num = Integer.valueOf((int) defaultDisplay.getRefreshRate());
            }
        }
        rVar.success(num);
    }

    private final void fetchNativeAppStart(r rVar) {
        SentryFlutter sentryFlutter = this.sentryFlutter;
        if (sentryFlutter == null) {
            h.h("sentryFlutter");
            throw null;
        }
        if (!sentryFlutter.getAutoPerformanceTracingEnabled()) {
            rVar.success(null);
            return;
        }
        AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
        h.d(appStartMetrics, "getInstance()");
        if (!appStartMetrics.isAppLaunchedInForeground() || appStartMetrics.getAppStartTimeSpan().getDurationMs() > 60000) {
            Log.w("Sentry", "Invalid app start data: app not launched in foreground or app start took too long (>60s)");
            rVar.success(null);
            return;
        }
        TimeSpan appStartTimeSpan = appStartMetrics.getAppStartTimeSpan();
        h.d(appStartTimeSpan, "appStartMetrics.appStartTimeSpan");
        SentryDate startTimestamp = appStartTimeSpan.getStartTimestamp();
        boolean z4 = appStartMetrics.getAppStartType() == AppStartMetrics.AppStartType.COLD;
        if (startTimestamp == null) {
            Log.w("Sentry", "App start won't be sent due to missing appStartTime");
            rVar.success(null);
            return;
        }
        LinkedHashMap N02 = AbstractC1170s.N0(new C1111d("pluginRegistrationTime", this.pluginRegistrationTime), new C1111d("appStartTime", Double.valueOf(DateUtils.nanosToMillis(startTimestamp.nanoTimestamp()))), new C1111d("isColdStart", Boolean.valueOf(z4)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TimeSpan timeSpan = new TimeSpan();
        timeSpan.setDescription("Process Initialization");
        timeSpan.setStartUnixTimeMs(appStartTimeSpan.getStartTimestampMs());
        timeSpan.setStartedAt(appStartTimeSpan.getStartUptimeMs());
        timeSpan.setStoppedAt(appStartMetrics.getClassLoadedUptimeMs());
        addToMap(timeSpan, linkedHashMap);
        TimeSpan applicationOnCreateTimeSpan = appStartMetrics.getApplicationOnCreateTimeSpan();
        h.d(applicationOnCreateTimeSpan, "appStartMetrics.applicationOnCreateTimeSpan");
        addToMap(applicationOnCreateTimeSpan, linkedHashMap);
        List<TimeSpan> contentProviderOnCreateTimeSpans = appStartMetrics.getContentProviderOnCreateTimeSpans();
        h.d(contentProviderOnCreateTimeSpans, "appStartMetrics.contentProviderOnCreateTimeSpans");
        for (TimeSpan timeSpan2 : contentProviderOnCreateTimeSpans) {
            h.d(timeSpan2, "span");
            addToMap(timeSpan2, linkedHashMap);
        }
        List<ActivityLifecycleTimeSpan> activityLifecycleTimeSpans = appStartMetrics.getActivityLifecycleTimeSpans();
        h.d(activityLifecycleTimeSpans, "appStartMetrics.activityLifecycleTimeSpans");
        for (ActivityLifecycleTimeSpan activityLifecycleTimeSpan : activityLifecycleTimeSpans) {
            TimeSpan onCreate = activityLifecycleTimeSpan.getOnCreate();
            h.d(onCreate, "span.onCreate");
            addToMap(onCreate, linkedHashMap);
            TimeSpan onStart = activityLifecycleTimeSpan.getOnStart();
            h.d(onStart, "span.onStart");
            addToMap(onStart, linkedHashMap);
        }
        N02.put("nativeSpanTimes", linkedHashMap);
        rVar.success(N02);
    }

    private final void initNativeSdk(o oVar, r rVar) {
        if (this.context == null) {
            rVar.error("1", "Context is null", null);
            return;
        }
        Map map = (Map) oVar.f677b;
        if (map == null) {
            map = C1168q.f13303a;
        }
        if (map.isEmpty()) {
            rVar.error("4", "Arguments is null or empty", null);
            return;
        }
        Context context = this.context;
        if (context == null) {
            h.h("context");
            throw null;
        }
        SentryAndroid.init(context, new c(20, this, map));
        rVar.success("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initNativeSdk$lambda$0(SentryFlutterPlugin sentryFlutterPlugin, Map map, SentryAndroidOptions sentryAndroidOptions) {
        h.e(sentryAndroidOptions, RRWebOptionsEvent.EVENT_TAG);
        SentryFlutter sentryFlutter = sentryFlutterPlugin.sentryFlutter;
        if (sentryFlutter == null) {
            h.h("sentryFlutter");
            throw null;
        }
        sentryFlutter.updateOptions(sentryAndroidOptions, map);
        sentryFlutterPlugin.setupReplay(sentryAndroidOptions);
    }

    private final void loadContexts(r rVar) {
        SentryOptions options = HubAdapter.getInstance().getOptions();
        h.d(options, "getInstance().options");
        if (!(options instanceof SentryAndroidOptions)) {
            rVar.success(null);
            return;
        }
        IScope currentScope = InternalSentrySdk.getCurrentScope();
        Context context = this.context;
        if (context == null) {
            h.h("context");
            throw null;
        }
        Map<String, Object> serializeScope = InternalSentrySdk.serializeScope(context, (SentryAndroidOptions) options, currentScope);
        h.d(serializeScope, "serializeScope(\n        …    currentScope,\n      )");
        rVar.success(serializeScope);
    }

    private final void loadImageList(o oVar, r rVar) {
        List<Map<String, Object>> serialize;
        SentryOptions options = HubAdapter.getInstance().getOptions();
        h.c(options, "null cannot be cast to non-null type io.sentry.android.core.SentryAndroidOptions");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) options;
        List list = (List) oVar.f677b;
        if (list == null) {
            list = C1167p.f13302a;
        }
        if (list.isEmpty()) {
            List<DebugImage> loadDebugImages = sentryAndroidOptions.getDebugImagesLoader().loadDebugImages();
            serialize = serialize(loadDebugImages != null ? AbstractC1159h.a1(loadDebugImages) : null);
        } else {
            Collection loadDebugImagesForAddresses = sentryAndroidOptions.getDebugImagesLoader().loadDebugImagesForAddresses(AbstractC1159h.e1(list));
            if (loadDebugImagesForAddresses != null) {
                if (loadDebugImagesForAddresses.isEmpty()) {
                    loadDebugImagesForAddresses = sentryAndroidOptions.getDebugImagesLoader().loadDebugImages();
                }
                if (loadDebugImagesForAddresses != null) {
                    r2 = AbstractC1159h.a1(loadDebugImagesForAddresses);
                }
            }
            serialize = serialize(r2);
        }
        rVar.success(serialize);
    }

    public static final ReplayIntegration privateSentryGetReplayIntegration() {
        return Companion.privateSentryGetReplayIntegration();
    }

    private final void removeContexts(String str, r rVar) {
        if (str == null) {
            rVar.success("");
        } else {
            Sentry.configureScope(new c(19, str, rVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeContexts$lambda$6(String str, r rVar, IScope iScope) {
        h.e(iScope, "scope");
        iScope.removeContexts(str);
        rVar.success("");
    }

    private final void removeExtra(String str, r rVar) {
        if (str == null) {
            rVar.success("");
        } else {
            Sentry.removeExtra(str);
            rVar.success("");
        }
    }

    private final void removeTag(String str, r rVar) {
        if (str == null) {
            rVar.success("");
        } else {
            Sentry.removeTag(str);
            rVar.success("");
        }
    }

    private final Map<String, Object> serialize(DebugImage debugImage) {
        return AbstractC1170s.M0(new C1111d("image_addr", debugImage.getImageAddr()), new C1111d(DebugImage.JsonKeys.IMAGE_SIZE, debugImage.getImageSize()), new C1111d(DebugImage.JsonKeys.CODE_FILE, debugImage.getCodeFile()), new C1111d("type", debugImage.getType()), new C1111d(DebugImage.JsonKeys.DEBUG_ID, debugImage.getDebugId()), new C1111d(DebugImage.JsonKeys.CODE_ID, debugImage.getCodeId()), new C1111d(DebugImage.JsonKeys.DEBUG_FILE, debugImage.getDebugFile()));
    }

    private final void setContexts(String str, Object obj, r rVar) {
        if (str == null || obj == null) {
            rVar.success("");
        } else {
            Sentry.configureScope(new E(str, obj, rVar, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setContexts$lambda$5(String str, Object obj, r rVar, IScope iScope) {
        h.e(iScope, "scope");
        iScope.setContexts(str, obj);
        rVar.success("");
    }

    private final void setExtra(String str, String str2, r rVar) {
        if (str == null || str2 == null) {
            rVar.success("");
        } else {
            Sentry.setExtra(str, str2);
            rVar.success("");
        }
    }

    private final void setReplayConfig(o oVar, r rVar) {
        double d7;
        double d8;
        Object a2 = oVar.a("windowWidth");
        Double d9 = a2 instanceof Double ? (Double) a2 : null;
        double doubleValue = d9 != null ? d9.doubleValue() : 0.0d;
        Object a4 = oVar.a("windowHeight");
        Double d10 = a4 instanceof Double ? (Double) a4 : null;
        double doubleValue2 = d10 != null ? d10.doubleValue() : 0.0d;
        Object a7 = oVar.a("width");
        Double d11 = a7 instanceof Double ? (Double) a7 : null;
        double doubleValue3 = d11 != null ? d11.doubleValue() : 0.0d;
        Object a8 = oVar.a("height");
        Double d12 = a8 instanceof Double ? (Double) a8 : null;
        double doubleValue4 = d12 != null ? d12.doubleValue() : 0.0d;
        if (doubleValue3 == 0.0d || doubleValue4 == 0.0d || doubleValue == 0.0d || doubleValue2 == 0.0d) {
            rVar.error("5", "Replay config is not valid: width: " + doubleValue3 + ", height: " + doubleValue4 + ", windowWidth: " + doubleValue + ", windowHeight: " + doubleValue2, null);
            return;
        }
        if (doubleValue3 < doubleValue4) {
            Companion companion = Companion;
            d8 = companion.adjustReplaySizeToBlockSize(doubleValue3);
            d7 = companion.adjustReplaySizeToBlockSize((d8 / doubleValue3) * doubleValue4);
        } else {
            Companion companion2 = Companion;
            double adjustReplaySizeToBlockSize = companion2.adjustReplaySizeToBlockSize(doubleValue4);
            double adjustReplaySizeToBlockSize2 = companion2.adjustReplaySizeToBlockSize((adjustReplaySizeToBlockSize / doubleValue4) * doubleValue3);
            d7 = adjustReplaySizeToBlockSize;
            d8 = adjustReplaySizeToBlockSize2;
        }
        int c3 = g.c(d8);
        int c4 = g.c(d7);
        float f7 = ((float) d8) / ((float) doubleValue);
        float f8 = ((float) d7) / ((float) doubleValue2);
        Object a9 = oVar.a(RRWebVideoEvent.JsonKeys.FRAME_RATE);
        Integer num = a9 instanceof Integer ? (Integer) a9 : null;
        int intValue = num != null ? num.intValue() : 0;
        Object a10 = oVar.a("bitRate");
        Integer num2 = a10 instanceof Integer ? (Integer) a10 : null;
        ScreenshotRecorderConfig screenshotRecorderConfig = new ScreenshotRecorderConfig(c3, c4, f7, f8, intValue, num2 != null ? num2.intValue() : 0);
        Log.i("Sentry", String.format("Configuring replay: %dx%d at %d FPS, %d BPS", Arrays.copyOf(new Object[]{Integer.valueOf(screenshotRecorderConfig.getRecordingWidth()), Integer.valueOf(screenshotRecorderConfig.getRecordingHeight()), Integer.valueOf(screenshotRecorderConfig.getFrameRate()), Integer.valueOf(screenshotRecorderConfig.getBitRate())}, 4)));
        ReplayIntegration replayIntegration = replay;
        if (replayIntegration != null) {
            replayIntegration.onConfigurationChanged(screenshotRecorderConfig);
        }
        rVar.success("");
    }

    private final void setTag(String str, String str2, r rVar) {
        if (str == null || str2 == null) {
            rVar.success("");
        } else {
            Sentry.setTag(str, str2);
            rVar.success("");
        }
    }

    private final void setUser(Map<String, ? extends Object> map, r rVar) {
        if (map != null) {
            SentryOptions options = HubAdapter.getInstance().getOptions();
            h.d(options, "getInstance().options");
            Sentry.setUser(User.fromMap(map, options));
        } else {
            Sentry.setUser(null);
        }
        rVar.success("");
    }

    private final void setupReplay(SentryAndroidOptions sentryAndroidOptions) {
        List<Integration> integrations = sentryAndroidOptions.getIntegrations();
        h.d(integrations, "options.integrations");
        AbstractC1165n.P0(integrations, SentryFlutterPlugin$setupReplay$1.INSTANCE);
        SentryReplayOptions sessionReplay = sentryAndroidOptions.getSessionReplay();
        h.d(sessionReplay, "options.sessionReplay");
        if (!sessionReplay.isSessionReplayEnabled() && !sessionReplay.isSessionReplayForErrorsEnabled()) {
            sentryAndroidOptions.setReplayController(null);
            return;
        }
        Context context = this.context;
        if (context == null) {
            h.h("context");
            throw null;
        }
        Context applicationContext = context.getApplicationContext();
        h.d(applicationContext, "context.applicationContext");
        ICurrentDateProvider currentDateProvider = CurrentDateProvider.getInstance();
        h.d(currentDateProvider, "getInstance()");
        ReplayIntegration replayIntegration = new ReplayIntegration(applicationContext, currentDateProvider, new SentryFlutterPlugin$setupReplay$2(this), null);
        replay = replayIntegration;
        replayIntegration.setBreadcrumbConverter(new SentryFlutterReplayBreadcrumbConverter());
        ReplayIntegration replayIntegration2 = replay;
        h.b(replayIntegration2);
        sentryAndroidOptions.addIntegration(replayIntegration2);
        sentryAndroidOptions.setReplayController(replay);
    }

    @Override // x5.InterfaceC1789a
    public void onAttachedToActivity(InterfaceC1790b interfaceC1790b) {
        h.e(interfaceC1790b, "binding");
        this.activity = new WeakReference<>((AbstractActivityC1559c) ((Q3.o) interfaceC1790b).f5822a);
    }

    @Override // w5.InterfaceC1783c
    public void onAttachedToEngine(C1782b c1782b) {
        h.e(c1782b, "flutterPluginBinding");
        this.pluginRegistrationTime = Long.valueOf(System.currentTimeMillis());
        Context context = c1782b.f18075a;
        h.d(context, "flutterPluginBinding.applicationContext");
        this.context = context;
        s sVar = new s(c1782b.f18077c, "sentry_flutter");
        this.channel = sVar;
        sVar.b(this);
        this.sentryFlutter = new SentryFlutter();
    }

    @Override // x5.InterfaceC1789a
    public void onDetachedFromActivity() {
        this.activity = null;
    }

    @Override // x5.InterfaceC1789a
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // w5.InterfaceC1783c
    public void onDetachedFromEngine(C1782b c1782b) {
        h.e(c1782b, "binding");
        s sVar = this.channel;
        if (sVar == null) {
            return;
        }
        if (sVar != null) {
            sVar.b(null);
        } else {
            h.h("channel");
            throw null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // A5.q
    public void onMethodCall(o oVar, r rVar) {
        h.e(oVar, "call");
        h.e(rVar, "result");
        String str = oVar.f676a;
        if (str != null) {
            switch (str.hashCode()) {
                case -905799720:
                    if (str.equals("setTag")) {
                        setTag((String) oVar.a("key"), (String) oVar.a("value"), rVar);
                        return;
                    }
                    break;
                case -853417589:
                    if (str.equals("closeNativeSdk")) {
                        closeNativeSdk(rVar);
                        return;
                    }
                    break;
                case -535605191:
                    if (str.equals("displayRefreshRate")) {
                        displayRefreshRate(rVar);
                        return;
                    }
                    break;
                case -366888622:
                    if (str.equals("fetchNativeAppStart")) {
                        fetchNativeAppStart(rVar);
                        return;
                    }
                    break;
                case -317432340:
                    if (str.equals("removeExtra")) {
                        removeExtra((String) oVar.a("key"), rVar);
                        return;
                    }
                    break;
                case 89815947:
                    if (str.equals("setReplayConfig")) {
                        setReplayConfig(oVar, rVar);
                        return;
                    }
                    break;
                case 145462582:
                    if (str.equals("captureEnvelope")) {
                        captureEnvelope(oVar, rVar);
                        return;
                    }
                    break;
                case 263988819:
                    if (str.equals("loadImageList")) {
                        loadImageList(oVar, rVar);
                        return;
                    }
                    break;
                case 545314163:
                    if (str.equals("initNativeSdk")) {
                        initNativeSdk(oVar, rVar);
                        return;
                    }
                    break;
                case 716465066:
                    if (str.equals("loadContexts")) {
                        loadContexts(rVar);
                        return;
                    }
                    break;
                case 1126756228:
                    if (str.equals("addBreadcrumb")) {
                        addBreadcrumb((Map) oVar.a(RRWebBreadcrumbEvent.EVENT_TAG), rVar);
                        return;
                    }
                    break;
                case 1282363510:
                    if (str.equals("removeTag")) {
                        removeTag((String) oVar.a("key"), rVar);
                        return;
                    }
                    break;
                case 1391678670:
                    if (str.equals("setExtra")) {
                        setExtra((String) oVar.a("key"), (String) oVar.a("value"), rVar);
                        return;
                    }
                    break;
                case 1422008102:
                    if (str.equals("setContexts")) {
                        setContexts((String) oVar.a("key"), oVar.a("value"), rVar);
                        return;
                    }
                    break;
                case 1725209040:
                    if (str.equals("nativeCrash")) {
                        Companion.crash();
                        return;
                    }
                    break;
                case 1838399555:
                    if (str.equals("clearBreadcrumbs")) {
                        clearBreadcrumbs(rVar);
                        return;
                    }
                    break;
                case 1919151821:
                    if (str.equals("captureReplay")) {
                        captureReplay(rVar);
                        return;
                    }
                    break;
                case 1985026893:
                    if (str.equals("setUser")) {
                        setUser((Map) oVar.a(SentryBaseEvent.JsonKeys.USER), rVar);
                        return;
                    }
                    break;
                case 2133203272:
                    if (str.equals("removeContexts")) {
                        removeContexts((String) oVar.a("key"), rVar);
                        return;
                    }
                    break;
            }
        }
        rVar.notImplemented();
    }

    @Override // x5.InterfaceC1789a
    public void onReattachedToActivityForConfigChanges(InterfaceC1790b interfaceC1790b) {
        h.e(interfaceC1790b, "binding");
    }

    private final List<Map<String, Object>> serialize(List<DebugImage> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC1161j.N0(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(serialize((DebugImage) it.next()));
        }
        return arrayList;
    }
}
