package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.services.bidtoken.f f7221a;
    public static final com.moloco.sdk.internal.services.bidtoken.k b;

    static {
        com.moloco.sdk.internal.services.bidtoken.f fVar = new com.moloco.sdk.internal.services.bidtoken.f(false);
        f7221a = fVar;
        b = new com.moloco.sdk.internal.services.bidtoken.k("", "", fVar);
    }

    public static final com.moloco.sdk.internal.services.bidtoken.f a() {
        return f7221a;
    }

    public static final com.moloco.sdk.internal.services.bidtoken.k b() {
        return b;
    }

    public static final com.moloco.sdk.internal.services.bidtoken.f a(com.moloco.sdk.BidToken.BidTokenResponseV3 bidTokenResponseV3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidTokenResponseV3, "<this>");
        return bidTokenResponseV3.hasClientTokenConfigs() ? new com.moloco.sdk.internal.services.bidtoken.f(bidTokenResponseV3.getClientTokenConfigs().getEnableDbt()) : f7221a;
    }
}
