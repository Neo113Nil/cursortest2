package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Gj implements io.appmetrica.analytics.impl.Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f4342b;

    public Gj(java.lang.String str, byte[] bArr) {
        this.f4341a = str;
        this.f4342b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(io.appmetrica.analytics.impl.Ra ra) {
        ra.setSessionExtra(this.f4341a, this.f4342b);
    }
}
