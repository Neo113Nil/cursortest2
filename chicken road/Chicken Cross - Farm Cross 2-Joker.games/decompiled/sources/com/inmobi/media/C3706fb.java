package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.inmobi.media.fb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3706fb implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final C3706fb f7104a = new C3706fb();

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        B6 a2 = Sf.a();
        if (a2 != null) {
            new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(a2.f6470a).message(a2.toString()).body(ResponseBody.create((MediaType) null, "")).build();
        }
        Response proceed = chain.proceed(chain.request());
        Intrinsics.checkNotNullExpressionValue(proceed, "proceed(...)");
        return proceed;
    }
}
