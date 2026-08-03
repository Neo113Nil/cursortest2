package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f7230a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.services.bidtoken.n$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.moloco.sdk.internal.services.bidtoken.n.b();
        }
    });

    public static final com.moloco.sdk.internal.services.bidtoken.l a() {
        return c();
    }

    public static final com.moloco.sdk.internal.services.bidtoken.m b() {
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "BidTokenService", "Creating BidTokenService instance", null, false, 12, null);
        return new com.moloco.sdk.internal.services.bidtoken.m(com.moloco.sdk.internal.services.bidtoken.y.f7255a.a(), com.moloco.sdk.internal.services.bidtoken.q.f7246a.a());
    }

    public static final com.moloco.sdk.internal.services.bidtoken.m c() {
        return (com.moloco.sdk.internal.services.bidtoken.m) f7230a.getValue();
    }
}
