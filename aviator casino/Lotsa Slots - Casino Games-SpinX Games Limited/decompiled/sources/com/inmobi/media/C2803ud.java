package com.inmobi.media;

/* renamed from: com.inmobi.media.ud, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C2803ud extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1 {
    public C2803ud(com.inmobi.media.C2829vd c2829vd) {
        super(1, c2829vd, com.inmobi.media.C2829vd.class, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        short shortValue = ((java.lang.Number) obj).shortValue();
        com.inmobi.media.C2829vd c2829vd = (com.inmobi.media.C2829vd) this.receiver;
        c2829vd.getClass();
        c2829vd.a(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", java.lang.Short.valueOf(shortValue))), new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        return kotlin.Unit.INSTANCE;
    }
}
