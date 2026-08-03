package com.inmobi.media;

/* loaded from: classes5.dex */
public final class J0 implements com.inmobi.media.Ng {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.L0 f4772a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ com.inmobi.media.Vj c;
    public final /* synthetic */ java.lang.String d;

    public J0(com.inmobi.media.L0 l0, boolean z, com.inmobi.media.Vj vj, java.lang.String str) {
        this.f4772a = l0;
        this.b = z;
        this.c = vj;
        this.d = str;
    }

    @Override // com.inmobi.media.Ng
    public final void onError(java.lang.Exception exc) {
        this.f4772a.a(exc, this.c);
    }

    @Override // com.inmobi.media.Ng
    public final void a(java.lang.String result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        this.f4772a.a("file saved - " + result + " , isReporting - " + this.b);
        this.f4772a.a(result, this.c, this.d, this.b);
    }
}
