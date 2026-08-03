package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.jo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470jo implements io.appmetrica.analytics.impl.InterfaceC0494km {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider f6240a;

    public C0470jo(io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider utilityServiceProvider) {
        this.f6240a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0494km
    public final void a(io.appmetrica.analytics.impl.C0365fm c0365fm) {
        this.f6240a.updateConfiguration(new io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration(c0365fm.f5931v, c0365fm.f5930u));
    }
}
