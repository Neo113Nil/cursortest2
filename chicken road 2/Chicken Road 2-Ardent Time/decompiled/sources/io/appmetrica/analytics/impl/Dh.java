package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Dh extends io.appmetrica.analytics.impl.X4 {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f4212w;

    /* renamed from: x, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.E6 f4213x;

    public Dh(android.content.Context context, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.C0580o4 c0580o4, io.appmetrica.analytics.impl.E6 e6, io.appmetrica.analytics.impl.C0365fm c0365fm, io.appmetrica.analytics.impl.V4 v4, io.appmetrica.analytics.impl.InterfaceC0688s9 interfaceC0688s9) {
        this(context, q4, new io.appmetrica.analytics.impl.C0472k0(), new io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker(), new io.appmetrica.analytics.impl.C0271c5(context, q4, c0580o4, v4, c0365fm, new io.appmetrica.analytics.impl.C0852yh(e6), io.appmetrica.analytics.impl.C0560na.k().w().c(), io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils.getAppVersionCodeInt(context), io.appmetrica.analytics.impl.C0560na.k().l(), interfaceC0688s9), e6, c0580o4);
    }

    @Override // io.appmetrica.analytics.impl.X4, io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ea
    public final synchronized void a(io.appmetrica.analytics.impl.C0580o4 c0580o4) {
        super.a(c0580o4);
        this.f4213x.a(this.f4212w, c0580o4.f6561i);
    }

    public Dh(android.content.Context context, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.C0472k0 c0472k0, io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker timePassedChecker, io.appmetrica.analytics.impl.C0271c5 c0271c5, io.appmetrica.analytics.impl.E6 e6, io.appmetrica.analytics.impl.C0580o4 c0580o4) {
        super(context, q4, c0472k0, timePassedChecker, c0271c5, c0580o4);
        this.f4212w = q4.b();
        this.f4213x = e6;
    }
}
