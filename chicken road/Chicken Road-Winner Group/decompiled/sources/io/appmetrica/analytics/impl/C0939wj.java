package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0939wj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f8591a;

    public C0939wj(Throwable th) {
        this.f8591a = th;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportUnhandledException(this.f8591a);
    }
}
