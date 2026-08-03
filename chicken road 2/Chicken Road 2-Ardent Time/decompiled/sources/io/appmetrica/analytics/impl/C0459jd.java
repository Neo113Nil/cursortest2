package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.jd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0459jd extends io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0563nd f6188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f6190c;

    public C0459jd(io.appmetrica.analytics.impl.C0563nd c0563nd, int i2, java.lang.String str) {
        this.f6188a = c0563nd;
        this.f6189b = i2;
        this.f6190c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        io.appmetrica.analytics.impl.C0563nd.a(this.f6188a).a(new io.appmetrica.analytics.impl.F9(this.f6189b, this.f6190c));
    }
}
