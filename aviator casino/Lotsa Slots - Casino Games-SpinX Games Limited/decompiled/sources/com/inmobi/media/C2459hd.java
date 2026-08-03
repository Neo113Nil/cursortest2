package com.inmobi.media;

/* renamed from: com.inmobi.media.hd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C2459hd extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2 {
    public C2459hd(com.inmobi.media.C2510jd c2510jd) {
        super(2, c2510jd, com.inmobi.media.C2510jd.class, "transitionToFetchedState", "transitionToFetchedState(Lcom/inmobi/media/ads/context/AdComponent;Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.C2867x p0 = (com.inmobi.media.C2867x) obj;
        com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse p1 = (com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse) obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "p1");
        com.inmobi.media.C2510jd c2510jd = (com.inmobi.media.C2510jd) this.receiver;
        com.inmobi.media.C2799u9 c2799u9 = c2510jd.e;
        if (c2799u9 != null) {
            c2799u9.a("AUM-NativeFetchingState", "transitionToFetchedState");
        }
        c2510jd.r.a(new com.inmobi.media.C2433gd(p0, p1, c2510jd.p, c2510jd.q, c2510jd.r), c2510jd);
        return kotlin.Unit.INSTANCE;
    }
}
