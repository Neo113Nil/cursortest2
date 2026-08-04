package io.sentry.flutter;

import A5.o;
import A5.q;
import A5.r;
import A5.s;
import B4.E;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
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
import io.sentry.android.replay.Recorder;
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
import kotlin.jvm.functions.Function1;
import p044f6.d;
import p050g6.j;
import p050g6.n;
import p050g6.p;
import p118q2.g;
import p159w5.c;
import p164x5.b;
import t6.e;
import t6.h;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class SentryFlutterPlugin implements c, q, p164x5.a {
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
        public final void crash() throws InterruptedException {
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

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutterPlugin$setupReplay$1, reason: invalid class name */
    public static final class AnonymousClass1 extends i implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Integration integration) {
            return Boolean.valueOf(integration instanceof ReplayIntegration);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutterPlugin$setupReplay$2, reason: invalid class name */
    public static final class AnonymousClass2 extends i implements s6.a {
        public AnonymousClass2() {
            super(0);
        }

        @Override // s6.a
        public final Recorder invoke() {
            s sVar = SentryFlutterPlugin.this.channel;
            if (sVar == null) {
                h.h("channel");
                throw null;
            }
            ReplayIntegration replayIntegration = SentryFlutterPlugin.replay;
            h.b(replayIntegration);
            return new SentryFlutterReplayRecorder(sVar, replayIntegration);
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
        map.put(description, p050g6.s.M0(new d("startTimestampMsSinceEpoch", Long.valueOf(timeSpan.getStartTimestampMs())), new d("stopTimestampMsSinceEpoch", Long.valueOf(timeSpan.getProjectedStopTimestampMs()))));
    }

    private final void captureEnvelope(o oVar, r rVar) {
        if (!Sentry.isEnabled()) {
            rVar.error("1", "The Sentry Android SDK is disabled", null);
            return;
        }
        List list = (List) oVar.f677b;
        if (list == null) {
            list = p.f13308a;
        }
        if (!list.isEmpty()) {
            byte[] bArr = (byte[]) p050g6.h.Q0(list);
            Object obj = list.get(1);
            h.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (bArr != null && bArr.length != 0) {
                if (InternalSentrySdk.captureEnvelope(bArr, zBooleanValue) != null) {
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
        Integer numValueOf = null;
        if (Build.VERSION.SDK_INT >= 30) {
            WeakReference<Activity> weakReference = this.activity;
            Display display = (weakReference == null || (activity2 = weakReference.get()) == null) ? null : activity2.getDisplay();
            if (display != null) {
                numValueOf = Integer.valueOf((int) display.getRefreshRate());
            }
        } else {
            WeakReference<Activity> weakReference2 = this.activity;
            Display defaultDisplay = (weakReference2 == null || (activity = weakReference2.get()) == null || (window = activity.getWindow()) == null || (windowManager = window.getWindowManager()) == null) ? null : windowManager.getDefaultDisplay();
            if (defaultDisplay != null) {
                numValueOf = Integer.valueOf((int) defaultDisplay.getRefreshRate());
            }
        }
        rVar.success(numValueOf);
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
        LinkedHashMap linkedHashMapN0 = p050g6.s.N0(new d("pluginRegistrationTime", this.pluginRegistrationTime), new d("appStartTime", Double.valueOf(DateUtils.nanosToMillis(startTimestamp.nanoTimestamp()))), new d("isColdStart", Boolean.valueOf(z4)));
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
        linkedHashMapN0.put("nativeSpanTimes", linkedHashMap);
        rVar.success(linkedHashMapN0);
    }

    private final void initNativeSdk(o oVar, r rVar) {
        if (this.context == null) {
            rVar.error("1", "Context is null", null);
            return;
        }
        Map map = (Map) oVar.f677b;
        if (map == null) {
            map = p050g6.q.f13309a;
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
        SentryAndroid.init(context, new B1.c(20, this, map));
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
        Map<String, Object> mapSerializeScope = InternalSentrySdk.serializeScope(context, (SentryAndroidOptions) options, currentScope);
        h.d(mapSerializeScope, "serializeScope(\n        …    currentScope,\n      )");
        rVar.success(mapSerializeScope);
    }

    private final void loadImageList(o oVar, r rVar) {
        List<Map<String, Object>> listSerialize;
        SentryOptions options = HubAdapter.getInstance().getOptions();
        h.c(options, "null cannot be cast to non-null type io.sentry.android.core.SentryAndroidOptions");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) options;
        List list = (List) oVar.f677b;
        if (list == null) {
            list = p.f13308a;
        }
        List<DebugImage> listA1 = null;
        if (list.isEmpty()) {
            List<DebugImage> listLoadDebugImages = sentryAndroidOptions.getDebugImagesLoader().loadDebugImages();
            listSerialize = serialize(listLoadDebugImages != null ? p050g6.h.a1(listLoadDebugImages) : null);
        } else {
            Collection collectionLoadDebugImagesForAddresses = sentryAndroidOptions.getDebugImagesLoader().loadDebugImagesForAddresses(p050g6.h.e1(list));
            if (collectionLoadDebugImagesForAddresses != null) {
                if (collectionLoadDebugImagesForAddresses.isEmpty()) {
                    collectionLoadDebugImagesForAddresses = sentryAndroidOptions.getDebugImagesLoader().loadDebugImages();
                }
                if (collectionLoadDebugImagesForAddresses != null) {
                    listA1 = p050g6.h.a1(collectionLoadDebugImagesForAddresses);
                }
            }
            listSerialize = serialize(listA1);
        }
        rVar.success(listSerialize);
    }

    public static final ReplayIntegration privateSentryGetReplayIntegration() {
        return Companion.privateSentryGetReplayIntegration();
    }

    private final void removeContexts(String str, r rVar) {
        if (str == null) {
            rVar.success("");
        } else {
            Sentry.configureScope(new B1.c(19, str, rVar));
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
        return p050g6.s.M0(new d("image_addr", debugImage.getImageAddr()), new d(DebugImage.JsonKeys.IMAGE_SIZE, debugImage.getImageSize()), new d(DebugImage.JsonKeys.CODE_FILE, debugImage.getCodeFile()), new d("type", debugImage.getType()), new d(DebugImage.JsonKeys.DEBUG_ID, debugImage.getDebugId()), new d(DebugImage.JsonKeys.CODE_ID, debugImage.getCodeId()), new d(DebugImage.JsonKeys.DEBUG_FILE, debugImage.getDebugFile()));
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
        double dAdjustReplaySizeToBlockSize;
        double dAdjustReplaySizeToBlockSize2;
        Object objA = oVar.a("windowWidth");
        Double d7 = objA instanceof Double ? (Double) objA : null;
        double dDoubleValue = d7 != null ? d7.doubleValue() : 0.0d;
        Object objA2 = oVar.a("windowHeight");
        Double d8 = objA2 instanceof Double ? (Double) objA2 : null;
        double dDoubleValue2 = d8 != null ? d8.doubleValue() : 0.0d;
        Object objA3 = oVar.a("width");
        Double d9 = objA3 instanceof Double ? (Double) objA3 : null;
        double dDoubleValue3 = d9 != null ? d9.doubleValue() : 0.0d;
        Object objA4 = oVar.a("height");
        Double d10 = objA4 instanceof Double ? (Double) objA4 : null;
        double dDoubleValue4 = d10 != null ? d10.doubleValue() : 0.0d;
        if (dDoubleValue3 == 0.0d || dDoubleValue4 == 0.0d || dDoubleValue == 0.0d || dDoubleValue2 == 0.0d) {
            rVar.error("5", "Replay config is not valid: width: " + dDoubleValue3 + ", height: " + dDoubleValue4 + ", windowWidth: " + dDoubleValue + ", windowHeight: " + dDoubleValue2, null);
            return;
        }
        if (dDoubleValue3 < dDoubleValue4) {
            Companion companion = Companion;
            dAdjustReplaySizeToBlockSize2 = companion.adjustReplaySizeToBlockSize(dDoubleValue3);
            dAdjustReplaySizeToBlockSize = companion.adjustReplaySizeToBlockSize((dAdjustReplaySizeToBlockSize2 / dDoubleValue3) * dDoubleValue4);
        } else {
            Companion companion2 = Companion;
            double dAdjustReplaySizeToBlockSize3 = companion2.adjustReplaySizeToBlockSize(dDoubleValue4);
            double dAdjustReplaySizeToBlockSize4 = companion2.adjustReplaySizeToBlockSize((dAdjustReplaySizeToBlockSize3 / dDoubleValue4) * dDoubleValue3);
            dAdjustReplaySizeToBlockSize = dAdjustReplaySizeToBlockSize3;
            dAdjustReplaySizeToBlockSize2 = dAdjustReplaySizeToBlockSize4;
        }
        int iC = g.c(dAdjustReplaySizeToBlockSize2);
        int iC2 = g.c(dAdjustReplaySizeToBlockSize);
        float f7 = ((float) dAdjustReplaySizeToBlockSize2) / ((float) dDoubleValue);
        float f8 = ((float) dAdjustReplaySizeToBlockSize) / ((float) dDoubleValue2);
        Object objA5 = oVar.a(RRWebVideoEvent.JsonKeys.FRAME_RATE);
        Integer num = objA5 instanceof Integer ? (Integer) objA5 : null;
        int iIntValue = num != null ? num.intValue() : 0;
        Object objA6 = oVar.a("bitRate");
        Integer num2 = objA6 instanceof Integer ? (Integer) objA6 : null;
        ScreenshotRecorderConfig screenshotRecorderConfig = new ScreenshotRecorderConfig(iC, iC2, f7, f8, iIntValue, num2 != null ? num2.intValue() : 0);
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
        n.P0(integrations, AnonymousClass1.INSTANCE);
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
        ReplayIntegration replayIntegration = new ReplayIntegration(applicationContext, currentDateProvider, new AnonymousClass2(), null);
        replay = replayIntegration;
        replayIntegration.setBreadcrumbConverter(new SentryFlutterReplayBreadcrumbConverter());
        ReplayIntegration replayIntegration2 = replay;
        h.b(replayIntegration2);
        sentryAndroidOptions.addIntegration(replayIntegration2);
        sentryAndroidOptions.setReplayController(replay);
    }

    @Override // p164x5.a
    public void onAttachedToActivity(b bVar) {
        h.e(bVar, "binding");
        this.activity = new WeakReference<>((p121q5.c) ((Q3.o) bVar).f5822a);
    }

    @Override // p159w5.c
    public void onAttachedToEngine(p159w5.b bVar) {
        h.e(bVar, "flutterPluginBinding");
        this.pluginRegistrationTime = Long.valueOf(System.currentTimeMillis());
        Context context = bVar.f18081a;
        h.d(context, "flutterPluginBinding.applicationContext");
        this.context = context;
        s sVar = new s(bVar.f18083c, "sentry_flutter");
        this.channel = sVar;
        sVar.b(this);
        this.sentryFlutter = new SentryFlutter();
    }

    @Override // p164x5.a
    public void onDetachedFromActivity() {
        this.activity = null;
    }

    @Override // p164x5.a
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // p159w5.c
    public void onDetachedFromEngine(p159w5.b bVar) {
        h.e(bVar, "binding");
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // A5.q
    public void onMethodCall(o oVar, r rVar) throws InterruptedException {
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

    @Override // p164x5.a
    public void onReattachedToActivityForConfigChanges(b bVar) {
        h.e(bVar, "binding");
    }

    private final List<Map<String, Object>> serialize(List<DebugImage> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(j.N0(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(serialize((DebugImage) it.next()));
        }
        return arrayList;
    }
}
