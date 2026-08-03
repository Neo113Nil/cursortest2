package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public interface v {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.services.bidtoken.v.a f7251a = com.moloco.sdk.internal.services.bidtoken.v.a.f7252a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ com.moloco.sdk.internal.services.bidtoken.v.a f7252a = new com.moloco.sdk.internal.services.bidtoken.v.a();

        public final com.moloco.sdk.internal.services.bidtoken.v a(com.moloco.sdk.internal.bidtoken.b bidTokenParser, com.moloco.sdk.internal.services.J timeProviderService) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidTokenParser, "bidTokenParser");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
            return new com.moloco.sdk.internal.services.bidtoken.w(bidTokenParser, timeProviderService);
        }
    }

    com.moloco.sdk.internal.services.bidtoken.k a();

    java.lang.Object a(com.moloco.sdk.internal.services.bidtoken.k kVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object a(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.B> continuation);

    void b();
}
