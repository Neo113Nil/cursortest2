package com.inmobi.media;

/* renamed from: com.inmobi.media.na, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2614na implements okhttp3.Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.C2614na f5355a = new com.inmobi.media.C2614na();

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        com.inmobi.media.EnumC2372e6 a2 = com.inmobi.media.Ze.a();
        if (a2 != null) {
            new okhttp3.Response.Builder().request(chain.request()).protocol(okhttp3.Protocol.HTTP_1_1).code(a2.f5171a).message(a2.toString()).body(okhttp3.ResponseBody.create((okhttp3.MediaType) null, "")).build();
        }
        okhttp3.Response proceed = chain.proceed(chain.request());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(proceed, "proceed(...)");
        return proceed;
    }
}
