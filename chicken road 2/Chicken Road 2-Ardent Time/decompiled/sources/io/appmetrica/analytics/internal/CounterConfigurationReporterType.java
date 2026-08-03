package io.appmetrica.analytics.internal;

/* loaded from: classes.dex */
public enum CounterConfigurationReporterType {
    MAIN("main"),
    MANUAL("manual"),
    SELF_SDK("self_sdk"),
    COMMUTATION("commutation"),
    SELF_DIAGNOSTIC_MAIN("self_diagnostic_main"),
    SELF_DIAGNOSTIC_MANUAL("self_diagnostic_manual"),
    CRASH("crash");

    public static final io.appmetrica.analytics.internal.CounterConfigurationReporterType.Companion Companion = new io.appmetrica.analytics.internal.CounterConfigurationReporterType.Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f7198a;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final io.appmetrica.analytics.internal.CounterConfigurationReporterType fromStringValue(java.lang.String str) {
            io.appmetrica.analytics.internal.CounterConfigurationReporterType counterConfigurationReporterType;
            io.appmetrica.analytics.internal.CounterConfigurationReporterType[] values = io.appmetrica.analytics.internal.CounterConfigurationReporterType.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    counterConfigurationReporterType = null;
                    break;
                }
                counterConfigurationReporterType = values[i2];
                if (kotlin.jvm.internal.i.a(counterConfigurationReporterType.getStringValue(), str)) {
                    break;
                }
                i2++;
            }
            return counterConfigurationReporterType == null ? io.appmetrica.analytics.internal.CounterConfigurationReporterType.MAIN : counterConfigurationReporterType;
        }

        private Companion() {
        }
    }

    CounterConfigurationReporterType(java.lang.String str) {
        this.f7198a = str;
    }

    public static final io.appmetrica.analytics.internal.CounterConfigurationReporterType fromStringValue(java.lang.String str) {
        return Companion.fromStringValue(str);
    }

    public final java.lang.String getStringValue() {
        return this.f7198a;
    }
}
