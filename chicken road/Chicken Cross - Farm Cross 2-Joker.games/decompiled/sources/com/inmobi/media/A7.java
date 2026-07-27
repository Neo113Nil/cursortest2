package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes6.dex */
public final class A7 implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final A7 f6450a = new A7();

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        String str = "Gdpr " + AbstractC4263z7.a() + " Intercepting request " + chain.request();
        if (AbstractC4263z7.a()) {
            Response proceed = chain.proceed(chain.request());
            Intrinsics.checkNotNull(proceed);
            return proceed;
        }
        Response.Builder protocol = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1);
        C4262z6 c4262z6 = B6.b;
        Response build = protocol.code(192).message("GDPR_COMPLIANCE_ENFORCED").body(ResponseBody.create((MediaType) null, "")).build();
        Intrinsics.checkNotNull(build);
        return build;
    }
}
