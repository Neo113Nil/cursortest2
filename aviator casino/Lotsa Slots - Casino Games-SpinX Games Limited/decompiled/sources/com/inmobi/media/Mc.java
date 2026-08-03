package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Mc {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2867x f4836a;
    public final com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse b;
    public final com.inmobi.media.Ic c;
    public final com.inmobi.media.Qc d;
    public com.inmobi.media.Cl e;
    public final kotlin.Lazy f;
    public final kotlin.Lazy g;

    public Mc(com.inmobi.media.C2867x adComponent, com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse inMobiJsonResponse, com.inmobi.media.Ic adUnitCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiJsonResponse, "inMobiJsonResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f4836a = adComponent;
        this.b = inMobiJsonResponse;
        this.c = adUnitCallback;
        this.d = new com.inmobi.media.Qc(adComponent);
        this.f = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Mc$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Mc.b(com.inmobi.media.Mc.this);
            }
        });
        this.g = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Mc$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Mc.a(com.inmobi.media.Mc.this);
            }
        });
    }

    public static final com.inmobi.media.C2775tc a(com.inmobi.media.Mc mc) {
        com.inmobi.media.C2631o1 c2631o1 = mc.d.f4916a.f5538a;
        return new com.inmobi.media.C2775tc(c2631o1.b, c2631o1.e, c2631o1.c);
    }

    public static final com.inmobi.media.Lc b(com.inmobi.media.Mc mc) {
        return (com.inmobi.media.Lc) mc.d.b.getValue();
    }
}
