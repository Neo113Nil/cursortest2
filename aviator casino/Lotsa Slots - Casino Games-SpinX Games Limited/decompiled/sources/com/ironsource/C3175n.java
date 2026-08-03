package com.ironsource;

/* renamed from: com.ironsource.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3175n extends com.ironsource.E5 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.IronSource.a f6473a;
    private final java.util.UUID b;
    private final java.lang.String c;

    public C3175n(com.ironsource.mediationsdk.IronSource.a adFormat, java.util.UUID adId, java.lang.String adUnitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f6473a = adFormat;
        this.b = adId;
        this.c = adUnitId;
    }

    @Override // com.ironsource.E0
    public java.util.Map<java.lang.String, java.lang.Object> a(com.ironsource.C0 c0) {
        return a(new com.ironsource.C3069h0(this.f6473a, this.b, this.c, null, null, null, 56, null));
    }
}
