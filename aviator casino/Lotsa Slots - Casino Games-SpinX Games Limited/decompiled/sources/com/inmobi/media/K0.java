package com.inmobi.media;

/* loaded from: classes5.dex */
public final class K0 implements com.inmobi.media.Ng {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.L0 f4791a;
    public final /* synthetic */ com.inmobi.media.AbstractC2792u2 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ com.inmobi.media.Zh d;

    public K0(com.inmobi.media.L0 l0, com.inmobi.media.AbstractC2792u2 abstractC2792u2, boolean z, com.inmobi.media.Zh zh) {
        this.f4791a = l0;
        this.b = abstractC2792u2;
        this.c = z;
        this.d = zh;
    }

    @Override // com.inmobi.media.Ng
    public final void a(java.lang.Object obj) {
        this.f4791a.a((android.graphics.Bitmap) obj, this.b, this.c, this.d);
    }

    @Override // com.inmobi.media.Ng
    public final void onError(java.lang.Exception exc) {
        this.f4791a.a(exc, this.b);
    }
}
