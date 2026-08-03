package com.inmobi.media;

/* renamed from: com.inmobi.media.td, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C2776td extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2 {
    public C2776td(com.inmobi.media.C2829vd c2829vd) {
        super(2, c2829vd, com.inmobi.media.C2829vd.class, "transitionToFetchedState", "transitionToFetchedState(Lcom/inmobi/media/ads/context/AdComponent;Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.C2867x p0 = (com.inmobi.media.C2867x) obj;
        com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse p1 = (com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse) obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "p1");
        com.inmobi.media.C2829vd c2829vd = (com.inmobi.media.C2829vd) this.receiver;
        com.inmobi.media.C2799u9 c2799u9 = c2829vd.e;
        if (c2799u9 != null) {
            c2799u9.a("AUM-NativeLoadResponseState", "transitionToFetchedState - validation successful, transitioning to fetched state");
        }
        c2829vd.r.a(new com.inmobi.media.C2433gd(p0, p1, c2829vd.p, c2829vd.q, c2829vd.r), c2829vd);
        return kotlin.Unit.INSTANCE;
    }
}
