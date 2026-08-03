package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.kj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0491kj {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6304a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f6305b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.CounterConfigurationReporterType f6306c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0569nj f6307d;

    public C0491kj(java.lang.String str, android.content.Context context, io.appmetrica.analytics.internal.CounterConfigurationReporterType counterConfigurationReporterType, io.appmetrica.analytics.impl.C0569nj c0569nj) {
        this.f6304a = str;
        this.f6305b = context;
        int i2 = io.appmetrica.analytics.impl.AbstractC0465jj.f6212a[counterConfigurationReporterType.ordinal()];
        if (i2 == 1) {
            this.f6306c = io.appmetrica.analytics.internal.CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i2 != 2) {
            this.f6306c = null;
        } else {
            this.f6306c = io.appmetrica.analytics.internal.CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f6307d = c0569nj;
    }
}
