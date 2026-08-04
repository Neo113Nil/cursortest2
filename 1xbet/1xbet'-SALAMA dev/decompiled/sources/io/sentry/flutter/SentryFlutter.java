package io.sentry.flutter;

import C6.o;
import R5.F;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import io.sentry.Hint;
import io.sentry.ReplayRecording;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.SentryReplayOptions;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.SdkVersion;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.net.Proxy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import p050g6.q;
import t6.e;
import t6.h;
import t6.i;
import t6.p;

/* JADX INFO: loaded from: classes2.dex */
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

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$1, reason: invalid class name */
    public static final class AnonymousClass1 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return p044f6.i.f13014a;
        }

        public final void invoke(String str) {
            h.e(str, "it");
            this.$options.setDsn(str);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$10, reason: invalid class name */
    public static final class AnonymousClass10 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(boolean z4) {
            this.$options.setAttachStacktrace(z4);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$11, reason: invalid class name */
    public static final class AnonymousClass11 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(boolean z4) {
            this.$options.setEnableActivityLifecycleBreadcrumbs(z4);
            this.$options.setEnableAppLifecycleBreadcrumbs(z4);
            this.$options.setEnableSystemEventBreadcrumbs(z4);
            this.$options.setEnableAppComponentBreadcrumbs(z4);
            this.$options.setEnableUserInteractionBreadcrumbs(z4);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$12, reason: invalid class name */
    public static final class AnonymousClass12 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(int i7) {
            this.$options.setMaxBreadcrumbs(i7);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$13, reason: invalid class name */
    public static final class AnonymousClass13 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(int i7) {
            this.$options.setMaxCacheItems(i7);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$14, reason: invalid class name */
    public static final class AnonymousClass14 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return p044f6.i.f13014a;
        }

        public final void invoke(String str) {
            h.e(str, "it");
            if (this.$options.isDebug()) {
                Locale locale = Locale.ROOT;
                h.d(locale, "ROOT");
                String upperCase = str.toUpperCase(locale);
                h.d(upperCase, "toUpperCase(...)");
                this.$options.setDiagnosticLevel(SentryLevel.valueOf(upperCase));
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$15, reason: invalid class name */
    public static final class AnonymousClass15 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(boolean z4) {
            this.$options.setAnrEnabled(z4);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$16, reason: invalid class name */
    public static final class AnonymousClass16 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass16(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(boolean z4) {
            this.$options.setSendDefaultPii(z4);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$17, reason: invalid class name */
    public static final class AnonymousClass17 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass17(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(boolean z4) {
            this.$options.setEnableScopeSync(z4);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$18, reason: invalid class name */
    public static final class AnonymousClass18 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass18(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return p044f6.i.f13014a;
        }

        public final void invoke(String str) {
            h.e(str, "it");
            this.$options.setProguardUuid(str);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$19, reason: invalid class name */
    public static final class AnonymousClass19 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass19(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(boolean z4) {
            this.$options.setEnableSpotlight(z4);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$2, reason: invalid class name */
    public static final class AnonymousClass2 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(boolean z4) {
            this.$options.setDebug(z4);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$20, reason: invalid class name */
    public static final class AnonymousClass20 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass20(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return p044f6.i.f13014a;
        }

        public final void invoke(String str) {
            h.e(str, "it");
            this.$options.setSpotlightConnectionUrl(str);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$21, reason: invalid class name */
    public static final class AnonymousClass21 extends i implements Function1 {
        public AnonymousClass21() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(boolean z4) {
            if (z4) {
                SentryFlutter.this.setAutoPerformanceTracingEnabled(true);
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$22, reason: invalid class name */
    public static final class AnonymousClass22 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass22(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(boolean z4) {
            this.$options.setSendClientReports(z4);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$23, reason: invalid class name */
    public static final class AnonymousClass23 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass23(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(long j) {
            this.$options.setMaxAttachmentSize(j);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$24, reason: invalid class name */
    public static final class AnonymousClass24 extends i implements Function1 {
        final /* synthetic */ p $sdkVersion;

        /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$24$1, reason: invalid class name */
        public static final class AnonymousClass1 extends i implements Function1 {
            final /* synthetic */ p $sdkVersion;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(p pVar) {
                super(1);
                this.$sdkVersion = pVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<String>) obj);
                return p044f6.i.f13014a;
            }

            public final void invoke(List<String> list) {
                h.e(list, "it");
                p pVar = this.$sdkVersion;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((SdkVersion) pVar.f16478a).addIntegration((String) it.next());
                }
            }
        }

        /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$24$2, reason: invalid class name */
        public static final class AnonymousClass2 extends i implements Function1 {
            final /* synthetic */ p $sdkVersion;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(p pVar) {
                super(1);
                this.$sdkVersion = pVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends Map<String, String>>) obj);
                return p044f6.i.f13014a;
            }

            public final void invoke(List<? extends Map<String, String>> list) {
                h.e(list, "it");
                p pVar = this.$sdkVersion;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Map map = (Map) it.next();
                    SdkVersion sdkVersion = (SdkVersion) pVar.f16478a;
                    Object obj = map.get("name");
                    h.c(obj, "null cannot be cast to non-null type kotlin.String");
                    Object obj2 = map.get("version");
                    h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                    sdkVersion.addPackage((String) obj, (String) obj2);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass24(p pVar) {
            super(1);
            this.$sdkVersion = pVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, ? extends Object>) obj);
            return p044f6.i.f13014a;
        }

        public final void invoke(Map<String, ? extends Object> map) {
            h.e(map, "flutterSdk");
            SentryFlutterKt.getIfNotNull(map, SdkVersion.JsonKeys.INTEGRATIONS, new AnonymousClass1(this.$sdkVersion));
            SentryFlutterKt.getIfNotNull(map, SdkVersion.JsonKeys.PACKAGES, new AnonymousClass2(this.$sdkVersion));
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$25, reason: invalid class name */
    public static final class AnonymousClass25 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass25(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(int i7) {
            this.$options.setConnectionTimeoutMillis(i7);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$26, reason: invalid class name */
    public static final class AnonymousClass26 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass26(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(int i7) {
            this.$options.setReadTimeoutMillis(i7);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$27, reason: invalid class name */
    public static final class AnonymousClass27 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass27(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, ? extends Object>) obj);
            return p044f6.i.f13014a;
        }

        public final void invoke(Map<String, ? extends Object> map) {
            Proxy.Type typeValueOf;
            h.e(map, "proxyJson");
            SentryAndroidOptions sentryAndroidOptions = this.$options;
            SentryOptions.Proxy proxy = new SentryOptions.Proxy();
            Object obj = map.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
            proxy.setHost(obj instanceof String ? (String) obj : null);
            Object obj2 = map.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT);
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            proxy.setPort(num != null ? String.valueOf(num.intValue()) : null);
            Object obj3 = map.get("type");
            String str = obj3 instanceof String ? (String) obj3 : null;
            if (str != null) {
                try {
                    Locale locale = Locale.ROOT;
                    h.d(locale, "ROOT");
                    String upperCase = str.toUpperCase(locale);
                    h.d(upperCase, "toUpperCase(...)");
                    typeValueOf = Proxy.Type.valueOf(upperCase);
                } catch (IllegalArgumentException unused) {
                    Log.w("Sentry", "Could not parse `type` from proxy json: " + map);
                    typeValueOf = null;
                }
                proxy.setType(typeValueOf);
            }
            Object obj4 = map.get(SentryBaseEvent.JsonKeys.USER);
            proxy.setUser(obj4 instanceof String ? (String) obj4 : null);
            Object obj5 = map.get("pass");
            proxy.setPass(obj5 instanceof String ? (String) obj5 : null);
            sentryAndroidOptions.setProxy(proxy);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$28, reason: invalid class name */
    public static final class AnonymousClass28 extends i implements Function1 {
        final /* synthetic */ Map<String, Object> $data;
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$28$1, reason: invalid class name */
        public static final class AnonymousClass1 extends i implements Function1 {
            final /* synthetic */ SentryAndroidOptions $options;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SentryAndroidOptions sentryAndroidOptions) {
                super(1);
                this.$options = sentryAndroidOptions;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map<String, ? extends Object>) obj);
                return p044f6.i.f13014a;
            }

            public final void invoke(Map<String, ? extends Object> map) {
                h.e(map, "it");
                SentryReplayOptions sessionReplay = this.$options.getSessionReplay();
                Object obj = map.get("name");
                h.c(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = map.get("version");
                h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                sessionReplay.setSdkVersion(new SdkVersion((String) obj, (String) obj2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass28(SentryAndroidOptions sentryAndroidOptions, Map<String, ? extends Object> map) {
            super(1);
            this.$options = sentryAndroidOptions;
            this.$data = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, ? extends Object>) obj);
            return p044f6.i.f13014a;
        }

        public final void invoke(Map<String, ? extends Object> map) {
            h.e(map, "replayArgs");
            SentryFlutter.this.updateReplayOptions(this.$options, map);
            SentryFlutterKt.getIfNotNull(this.$data, "sdk", new AnonymousClass1(this.$options));
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$3, reason: invalid class name */
    public static final class AnonymousClass3 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return p044f6.i.f13014a;
        }

        public final void invoke(String str) {
            h.e(str, "it");
            this.$options.setEnvironment(str);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$4, reason: invalid class name */
    public static final class AnonymousClass4 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return p044f6.i.f13014a;
        }

        public final void invoke(String str) {
            h.e(str, "it");
            this.$options.setRelease(str);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$5, reason: invalid class name */
    public static final class AnonymousClass5 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return p044f6.i.f13014a;
        }

        public final void invoke(String str) {
            h.e(str, "it");
            this.$options.setDist(str);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$6, reason: invalid class name */
    public static final class AnonymousClass6 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(boolean z4) {
            this.$options.setEnableAutoSessionTracking(z4);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$7, reason: invalid class name */
    public static final class AnonymousClass7 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(long j) {
            this.$options.setSessionTrackingIntervalMillis(j);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$8, reason: invalid class name */
    public static final class AnonymousClass8 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(long j) {
            this.$options.setAnrTimeoutIntervalMillis(j);
        }
    }

    /* JADX INFO: renamed from: io.sentry.flutter.SentryFlutter$updateOptions$9, reason: invalid class name */
    public static final class AnonymousClass9 extends i implements Function1 {
        final /* synthetic */ SentryAndroidOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(SentryAndroidOptions sentryAndroidOptions) {
            super(1);
            this.$options = sentryAndroidOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return p044f6.i.f13014a;
        }

        public final void invoke(boolean z4) {
            this.$options.setAttachThreads(z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateReplayOptions(SentryAndroidOptions sentryAndroidOptions, Map<String, ? extends Object> map) {
        SentryReplayOptions.SentryReplayQuality sentryReplayQuality;
        SentryReplayOptions sessionReplay = sentryAndroidOptions.getSessionReplay();
        h.d(sessionReplay, "options.sessionReplay");
        Object obj = map.get("quality");
        String str = obj instanceof String ? (String) obj : null;
        if (h.a(str, "low")) {
            sentryReplayQuality = SentryReplayOptions.SentryReplayQuality.LOW;
        } else {
            sentryReplayQuality = h.a(str, "high") ? SentryReplayOptions.SentryReplayQuality.HIGH : SentryReplayOptions.SentryReplayQuality.MEDIUM;
        }
        sessionReplay.setQuality(sentryReplayQuality);
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
            map2 = q.f13309a;
        }
        sentryAndroidOptions.setBeforeSendReplay(new F(map2, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SentryReplayEvent updateReplayOptions$lambda$4(Map map, SentryReplayEvent sentryReplayEvent, Hint hint) {
        List<? extends RRWebEvent> payload;
        Object next;
        h.e(sentryReplayEvent, "event");
        h.e(hint, "hint");
        ReplayRecording replayRecording = hint.getReplayRecording();
        if (replayRecording != null && (payload = replayRecording.getPayload()) != null) {
            Iterator<T> it = payload.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((RRWebEvent) next) instanceof RRWebOptionsEvent));
            RRWebEvent rRWebEvent = (RRWebEvent) next;
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
        SentryFlutterKt.getIfNotNull(map, "dsn", new AnonymousClass1(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "debug", new AnonymousClass2(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "environment", new AnonymousClass3(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "release", new AnonymousClass4(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, SentryBaseEvent.JsonKeys.DIST, new AnonymousClass5(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "enableAutoSessionTracking", new AnonymousClass6(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "autoSessionTrackingIntervalMillis", new AnonymousClass7(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "anrTimeoutIntervalMillis", new AnonymousClass8(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "attachThreads", new AnonymousClass9(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "attachStacktrace", new AnonymousClass10(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "enableAutoNativeBreadcrumbs", new AnonymousClass11(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "maxBreadcrumbs", new AnonymousClass12(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "maxCacheItems", new AnonymousClass13(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "diagnosticLevel", new AnonymousClass14(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "anrEnabled", new AnonymousClass15(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "sendDefaultPii", new AnonymousClass16(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "enableNdkScopeSync", new AnonymousClass17(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "proguardUuid", new AnonymousClass18(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "enableSpotlight", new AnonymousClass19(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "spotlightUrl", new AnonymousClass20(sentryAndroidOptions));
        Object obj = map.get("enableNativeCrashHandling");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (!(bool != null ? bool.booleanValue() : true)) {
            sentryAndroidOptions.setEnableUncaughtExceptionHandler(false);
            sentryAndroidOptions.setAnrEnabled(false);
        }
        SentryFlutterKt.getIfNotNull(map, "enableAutoPerformanceTracing", new AnonymousClass21());
        SentryFlutterKt.getIfNotNull(map, "sendClientReports", new AnonymousClass22(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "maxAttachmentSize", new AnonymousClass23(sentryAndroidOptions));
        p pVar = new p();
        SdkVersion sdkVersion = sentryAndroidOptions.getSdkVersion();
        pVar.f16478a = sdkVersion;
        if (sdkVersion == null) {
            pVar.f16478a = new SdkVersion(ANDROID_SDK, "8.17.0");
        } else {
            sdkVersion.setName(ANDROID_SDK);
        }
        sentryAndroidOptions.setSdkVersion((SdkVersion) pVar.f16478a);
        sentryAndroidOptions.setSentryClientName("sentry.java.android.flutter/8.17.0");
        sentryAndroidOptions.setNativeSdkName(NATIVE_SDK);
        SentryFlutterKt.getIfNotNull(map, "sdk", new AnonymousClass24(pVar));
        sentryAndroidOptions.setBeforeSend(new BeforeSendCallbackImpl());
        SentryFlutterKt.getIfNotNull(map, "connectionTimeoutMillis", new AnonymousClass25(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "readTimeoutMillis", new AnonymousClass26(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "proxy", new AnonymousClass27(sentryAndroidOptions));
        SentryFlutterKt.getIfNotNull(map, "replay", new AnonymousClass28(sentryAndroidOptions, map));
    }
}
