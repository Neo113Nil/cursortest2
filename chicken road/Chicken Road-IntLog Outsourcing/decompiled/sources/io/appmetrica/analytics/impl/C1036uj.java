package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.uj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1036uj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f9415b;

    public C1036uj(String str, Throwable th) {
        this.f9414a = str;
        this.f9415b = th;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportError(this.f9414a, this.f9415b);
    }
}
