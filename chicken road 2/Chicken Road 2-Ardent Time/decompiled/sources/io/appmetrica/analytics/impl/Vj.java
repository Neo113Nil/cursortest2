package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Vj extends io.appmetrica.analytics.impl.X4 {
    public Vj(android.content.Context context, io.appmetrica.analytics.impl.C0365fm c0365fm, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.C0580o4 c0580o4, io.appmetrica.analytics.impl.InterfaceC0412hh interfaceC0412hh, io.appmetrica.analytics.impl.V4 v4, io.appmetrica.analytics.impl.P4 p4) {
        this(context, q4, new io.appmetrica.analytics.impl.C0472k0(), new io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker(), new io.appmetrica.analytics.impl.C0271c5(context, q4, c0580o4, v4, c0365fm, interfaceC0412hh, io.appmetrica.analytics.impl.C0560na.k().w().c(), io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils.getAppVersionCodeInt(context), io.appmetrica.analytics.impl.C0560na.k().l(), p4), c0580o4);
    }

    @Override // io.appmetrica.analytics.impl.X4, io.appmetrica.analytics.impl.Ea
    public final io.appmetrica.analytics.internal.CounterConfigurationReporterType c() {
        return io.appmetrica.analytics.internal.CounterConfigurationReporterType.SELF_SDK;
    }

    public Vj(android.content.Context context, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.C0472k0 c0472k0, io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker timePassedChecker, io.appmetrica.analytics.impl.C0271c5 c0271c5, io.appmetrica.analytics.impl.C0580o4 c0580o4) {
        super(context, q4, c0472k0, timePassedChecker, c0271c5, c0580o4);
    }
}
