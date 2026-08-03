package com.inmobi.media;

/* renamed from: com.inmobi.media.id, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C2485id extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1 {
    public C2485id(com.inmobi.media.C2510jd c2510jd) {
        super(1, c2510jd, com.inmobi.media.C2510jd.class, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        short shortValue = ((java.lang.Number) obj).shortValue();
        com.inmobi.media.C2510jd c2510jd = (com.inmobi.media.C2510jd) this.receiver;
        c2510jd.getClass();
        c2510jd.a(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), shortValue);
        return kotlin.Unit.INSTANCE;
    }
}
