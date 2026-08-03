package com.ironsource;

/* renamed from: com.ironsource.o2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3196o2 implements com.ironsource.InterfaceC3214p2 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6532a;
    private final com.ironsource.Ed b;

    public C3196o2(java.lang.String encryptedAuctionResponse, com.ironsource.Ed providerName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedAuctionResponse, "encryptedAuctionResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.f6532a = encryptedAuctionResponse;
        this.b = providerName;
    }

    @Override // com.ironsource.InterfaceC3214p2
    public java.lang.Object a() {
        java.lang.Object m10798constructorimpl;
        java.lang.String c = com.ironsource.C3127k5.b().c();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c, "getInstance().mediationKey");
        com.ironsource.C3222pa c3222pa = new com.ironsource.C3222pa(new com.ironsource.F4(this.f6532a, c));
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(c3222pa.a());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl == null) {
            return com.ironsource.C3160m2.h.a((org.json.JSONObject) m10798constructorimpl, this.b.value());
        }
        com.ironsource.C3180n4.d().a(m10801exceptionOrNullimpl);
        if (m10801exceptionOrNullimpl instanceof java.lang.IllegalArgumentException) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new com.ironsource.C2951a8(com.ironsource.C3306u5.f6757a.d())));
        }
        kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
        return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new com.ironsource.C2951a8(com.ironsource.C3306u5.f6757a.h())));
    }
}
