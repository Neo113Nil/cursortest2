package com.inmobi.media;

/* renamed from: com.inmobi.media.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2762t implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2841w f5454a;

    public C2762t(com.inmobi.media.C2841w c2841w) {
        this.f5454a = c2841w;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.inmobi.media.C2799u9 c2799u9 = this.f5454a.d;
        if (c2799u9 != null) {
            c2799u9.a("AdChoiceViewManager", "invokeOnCancellation Called");
        }
        com.inmobi.media.C2841w c2841w = this.f5454a;
        com.inmobi.media.C2799u9 c2799u92 = c2841w.d;
        if (c2799u92 != null) {
            c2799u92.a("AdChoiceViewManager", "destroy called");
        }
        com.squareup.picasso.Picasso picasso = com.inmobi.media.Yf.f5066a;
        com.inmobi.media.Yf.b(c2841w.f5518a).cancelTag(c2841w.e);
        return kotlin.Unit.INSTANCE;
    }
}
