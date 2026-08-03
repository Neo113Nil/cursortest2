package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408hd extends io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0563nd f6051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.AdRevenue f6052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6053c;

    public C0408hd(io.appmetrica.analytics.impl.C0563nd c0563nd, io.appmetrica.analytics.AdRevenue adRevenue, boolean z2) {
        this.f6051a = c0563nd;
        this.f6052b = adRevenue;
        this.f6053c = z2;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        io.appmetrica.analytics.impl.C0563nd.a(this.f6051a).reportAdRevenue(this.f6052b, this.f6053c);
    }
}
