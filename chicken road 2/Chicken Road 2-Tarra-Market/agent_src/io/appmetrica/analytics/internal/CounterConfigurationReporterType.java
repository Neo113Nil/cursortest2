package io.appmetrica.analytics.internal;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public enum CounterConfigurationReporterType {
    MAIN("main"),
    MANUAL("manual"),
    SELF_SDK("self_sdk"),
    COMMUTATION("commutation"),
    SELF_DIAGNOSTIC_MAIN("self_diagnostic_main"),
    SELF_DIAGNOSTIC_MANUAL("self_diagnostic_manual"),
    CRASH("crash");

    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f5320a;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final CounterConfigurationReporterType fromStringValue(String str) {
            CounterConfigurationReporterType counterConfigurationReporterType;
            CounterConfigurationReporterType[] values = CounterConfigurationReporterType.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    counterConfigurationReporterType = null;
                    break;
                }
                counterConfigurationReporterType = values[i2];
                if (j.a(counterConfigurationReporterType.getStringValue(), str)) {
                    break;
                }
                i2++;
            }
            return counterConfigurationReporterType == null ? CounterConfigurationReporterType.MAIN : counterConfigurationReporterType;
        }

        private Companion() {
        }
    }

    CounterConfigurationReporterType(String str) {
        this.f5320a = str;
    }

    public static final CounterConfigurationReporterType fromStringValue(String str) {
        return Companion.fromStringValue(str);
    }

    public final String getStringValue() {
        return this.f5320a;
    }
}
