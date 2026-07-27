package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Lj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f7098b;

    public Lj(String str, byte[] bArr) {
        this.f7097a = str;
        this.f7098b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.setSessionExtra(this.f7097a, this.f7098b);
    }
}
