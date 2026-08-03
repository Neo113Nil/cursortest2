package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ld, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511ld extends io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0563nd f6354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f6355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f6356c;

    public C0511ld(io.appmetrica.analytics.impl.C0563nd c0563nd, java.lang.String str, byte[] bArr) {
        this.f6354a = c0563nd;
        this.f6355b = str;
        this.f6356c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        io.appmetrica.analytics.impl.C0563nd.a(this.f6354a).setSessionExtra(this.f6355b, this.f6356c);
    }
}
