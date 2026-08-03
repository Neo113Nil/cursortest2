package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621pj implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f6660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f6661b;

    public C0621pj(java.lang.String str, java.lang.Throwable th) {
        this.f6660a = str;
        this.f6661b = th;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.reportError(this.f6660a, this.f6661b);
    }
}
