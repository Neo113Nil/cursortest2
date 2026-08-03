package com.inmobi.media;

/* renamed from: com.inmobi.media.b7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2294b7 implements okhttp3.Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.C2294b7 f5117a = new com.inmobi.media.C2294b7();

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        com.inmobi.media.AbstractC2268a7.a();
        java.util.Objects.toString(chain.request());
        if (com.inmobi.media.AbstractC2268a7.a()) {
            okhttp3.Response proceed = chain.proceed(chain.request());
            kotlin.jvm.internal.Intrinsics.checkNotNull(proceed);
            return proceed;
        }
        okhttp3.Response.Builder protocol = new okhttp3.Response.Builder().request(chain.request()).protocol(okhttp3.Protocol.HTTP_1_1);
        com.inmobi.media.C2320c6 c2320c6 = com.inmobi.media.EnumC2372e6.b;
        okhttp3.Response build = protocol.code(192).message("GDPR_COMPLIANCE_ENFORCED").body(okhttp3.ResponseBody.create((okhttp3.MediaType) null, "")).build();
        kotlin.jvm.internal.Intrinsics.checkNotNull(build);
        return build;
    }
}
