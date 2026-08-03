package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.rj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0672rj implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f6753a;

    public C0672rj(java.lang.Throwable th) {
        this.f6753a = th;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.reportUnhandledException(this.f6753a);
    }
}
