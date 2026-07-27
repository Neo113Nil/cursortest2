package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0913vj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f8524c;

    public C0913vj(String str, String str2, Throwable th) {
        this.f8522a = str;
        this.f8523b = str2;
        this.f8524c = th;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportError(this.f8522a, this.f8523b, this.f8524c);
    }
}
