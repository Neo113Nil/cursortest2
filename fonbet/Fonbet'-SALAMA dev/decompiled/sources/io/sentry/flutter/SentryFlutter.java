package io.sentry.flutter;

import C6.o;
import R5.F;
import g6.C1168q;
import io.sentry.Hint;
import io.sentry.ReplayRecording;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryReplayEvent;
import io.sentry.SentryReplayOptions;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.SdkVersion;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t6.e;
import t6.h;
import t6.p;

/* loaded from: classes2.dex */
public final class SentryFlutter {
    public static final String ANDROID_SDK = "sentry.java.android.flutter";
    public static final Companion Companion = new Companion(null);
    public static final String FLUTTER_SDK = "sentry.dart.flutter";
    public static final String NATIVE_SDK = "sentry.native.android.flutter";
    private boolean autoPerformanceTracingEnabled;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateReplayOptions(SentryAndroidOptions sentryAndroidOptions, Map<String, ? extends Object> map) {
        SentryReplayOptions sessionReplay = sentryAndroidOptions.getSessionReplay();
        h.d(sessionReplay, "options.sessionReplay");
        Object obj = map.get("quality");
        String str = obj instanceof String ? (String) obj : null;
        sessionReplay.setQuality(h.a(str, "low") ? SentryReplayOptions.SentryReplayQuality.LOW : h.a(str, "high") ? SentryReplayOptions.SentryReplayQuality.HIGH : SentryReplayOptions.SentryReplayQuality.MEDIUM);
        Object obj2 = map.get("sessionSampleRate");
        Number number = obj2 instanceof Number ? (Number) obj2 : null;
        sessionReplay.setSessionSampleRate(number != null ? Double.valueOf(number.doubleValue()) : null);
        Object obj3 = map.get("onErrorSampleRate");
        Number number2 = obj3 instanceof Number ? (Number) obj3 : null;
        sessionReplay.setOnErrorSampleRate(number2 != null ? Double.valueOf(number2.doubleValue()) : null);
        sessionReplay.setTrackConfiguration(false);
        Object obj4 = map.get("tags");
        Map map2 = obj4 instanceof Map ? (Map) obj4 : null;
        if (map2 == null) {
            map2 = C1168q.f13303a;
        }
        sentryAndroidOptions.setBeforeSendReplay(new F(map2, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SentryReplayEvent updateReplayOptions$lambda$4(Map map, SentryReplayEvent sentryReplayEvent, Hint hint) {
        List<? extends RRWebEvent> payload;
        Object obj;
        h.e(sentryReplayEvent, "event");
        h.e(hint, "hint");
        ReplayRecording replayRecording = hint.getReplayRecording();
        if (replayRecording != null && (payload = replayRecording.getPayload()) != null) {
            Iterator<T> it = payload.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((RRWebEvent) obj) instanceof RRWebOptionsEvent) {
                    break;
                }
            }
            RRWebEvent rRWebEvent = (RRWebEvent) obj;
            if (rRWebEvent != null) {
                Map<String, Object> optionsPayload = ((RRWebOptionsEvent) rRWebEvent).getOptionsPayload();
                h.d(optionsPayload, "optionsEvent as RRWebOptionsEvent).optionsPayload");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : optionsPayload.entrySet()) {
                    String key = entry.getKey();
                    h.d(key, "it");
                    if (o.p0(key, "mask", false)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    optionsPayload.remove((String) ((Map.Entry) it2.next()).getKey());
                }
                optionsPayload.putAll(map);
            }
        }
        return sentryReplayEvent;
    }

    public final boolean getAutoPerformanceTracingEnabled() {
        return this.autoPerformanceTracingEnabled;
    }

    public final void setAutoPerformanceTracingEnabled(boolean z4) {
        this.autoPerformanceTracingEnabled = z4;
    }

    public final void updateOptions(SentryAndroidOptions sentryAndroidOptions, Map<String, ? extends Object> map) {
        h.e(sentryAndroidOptions, RRWebOptionsEvent.EVENT_TAG);
        h.e(map, "data");
        SentryFlutterKt.getIfNotNull(map, "dsn", new SentryFlutter$updateOptions$1(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "debug", new SentryFlutter$updateOptions$2(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "environment", new SentryFlutter$updateOptions$3(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "release", new SentryFlutter$updateOptions$4(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, SentryBaseEvent.JsonKeys.DIST, new SentryFlutter$updateOptions$5(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "enableAutoSessionTracking", new SentryFlutter$updateOptions$6(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "autoSessionTrackingIntervalMillis", new SentryFlutter$updateOptions$7(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "anrTimeoutIntervalMillis", new SentryFlutter$updateOptions$8(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "attachThreads", new SentryFlutter$updateOptions$9(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "attachStacktrace", new SentryFlutter$updateOptions$10(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "enableAutoNativeBreadcrumbs", new SentryFlutter$updateOptions$11(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "maxBreadcrumbs", new SentryFlutter$updateOptions$12(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "maxCacheItems", new SentryFlutter$updateOptions$13(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "diagnosticLevel", new SentryFlutter$updateOptions$14(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "anrEnabled", new SentryFlutter$updateOptions$15(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "sendDefaultPii", new SentryFlutter$updateOptions$16(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "enableNdkScopeSync", new SentryFlutter$updateOptions$17(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "proguardUuid", new SentryFlutter$updateOptions$18(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "enableSpotlight", new SentryFlutter$updateOptions$19(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "spotlightUrl", new SentryFlutter$updateOptions$20(sentryAndroidOptions));
        Object obj = map.get("enableNativeCrashHandling");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (!(bool != null ? bool.booleanValue() : true)) {
            sentryAndroidOptions.setEnableUncaughtExceptionHandler(false);
            sentryAndroidOptions.setAnrEnabled(false);
        }
        SentryFlutterKt.getIfNotNull(map, "enableAutoPerformanceTracing", new SentryFlutter$updateOptions$21(this));
        SentryFlutterKt.getIfNotNull(map, "sendClientReports", new SentryFlutter$updateOptions$22(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "maxAttachmentSize", new SentryFlutter$updateOptions$23(sentryAndroidOptions));
        p pVar = new p();
        SdkVersion sdkVersion = sentryAndroidOptions.getSdkVersion();
        pVar.f16472a = sdkVersion;
        if (sdkVersion == null) {
            pVar.f16472a = new SdkVersion(ANDROID_SDK, "8.17.0");
        } else {
            sdkVersion.setName(ANDROID_SDK);
        }
        sentryAndroidOptions.setSdkVersion((SdkVersion) pVar.f16472a);
        sentryAndroidOptions.setSentryClientName("sentry.java.android.flutter/8.17.0");
        sentryAndroidOptions.setNativeSdkName(NATIVE_SDK);
        SentryFlutterKt.getIfNotNull(map, "sdk", new SentryFlutter$updateOptions$24(pVar));
        sentryAndroidOptions.setBeforeSend(new BeforeSendCallbackImpl());
        SentryFlutterKt.getIfNotNull(map, "connectionTimeoutMillis", new SentryFlutter$updateOptions$25(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "readTimeoutMillis", new SentryFlutter$updateOptions$26(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "proxy", new SentryFlutter$updateOptions$27(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "replay", new SentryFlutter$updateOptions$28(this, sentryAndroidOptions, map));
    }
}
