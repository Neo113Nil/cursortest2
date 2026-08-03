package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.kd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0485kd extends io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0563nd f6281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6282b;

    public C0485kd(io.appmetrica.analytics.impl.C0563nd c0563nd, boolean z2) {
        this.f6281a = c0563nd;
        this.f6282b = z2;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        io.appmetrica.analytics.impl.C0563nd.a(this.f6281a).a(this.f6282b, false);
    }
}
