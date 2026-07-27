package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.pj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907pj {

    /* renamed from: a, reason: collision with root package name */
    public final String f9028a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9029b;

    /* renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f9030c;

    /* renamed from: d, reason: collision with root package name */
    public final C0984sj f9031d;

    public C0907pj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C0984sj c0984sj) {
        this.f9028a = str;
        this.f9029b = context;
        int i2 = AbstractC0881oj.f8948a[counterConfigurationReporterType.ordinal()];
        if (i2 == 1) {
            this.f9030c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i2 != 2) {
            this.f9030c = null;
        } else {
            this.f9030c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f9031d = c0984sj;
    }
}
