package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.pj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758pj {

    /* renamed from: a, reason: collision with root package name */
    public final String f8091a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8092b;

    /* renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f8093c;

    /* renamed from: d, reason: collision with root package name */
    public final C0835sj f8094d;

    public C0758pj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C0835sj c0835sj) {
        this.f8091a = str;
        this.f8092b = context;
        int i3 = AbstractC0732oj.f8015a[counterConfigurationReporterType.ordinal()];
        if (i3 == 1) {
            this.f8093c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i3 != 2) {
            this.f8093c = null;
        } else {
            this.f8093c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f8094d = c0835sj;
    }
}
