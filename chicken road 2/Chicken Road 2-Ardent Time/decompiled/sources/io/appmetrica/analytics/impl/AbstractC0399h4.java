package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0399h4 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6026a;

    static {
        int[] iArr = new int[io.appmetrica.analytics.internal.CounterConfigurationReporterType.values().length];
        iArr[io.appmetrica.analytics.internal.CounterConfigurationReporterType.COMMUTATION.ordinal()] = 1;
        iArr[io.appmetrica.analytics.internal.CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN.ordinal()] = 2;
        iArr[io.appmetrica.analytics.internal.CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL.ordinal()] = 3;
        iArr[io.appmetrica.analytics.internal.CounterConfigurationReporterType.MANUAL.ordinal()] = 4;
        iArr[io.appmetrica.analytics.internal.CounterConfigurationReporterType.SELF_SDK.ordinal()] = 5;
        iArr[io.appmetrica.analytics.internal.CounterConfigurationReporterType.MAIN.ordinal()] = 6;
        iArr[io.appmetrica.analytics.internal.CounterConfigurationReporterType.CRASH.ordinal()] = 7;
        f6026a = iArr;
    }
}
