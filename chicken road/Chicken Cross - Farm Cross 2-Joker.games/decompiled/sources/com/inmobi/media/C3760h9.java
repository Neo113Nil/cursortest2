package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.inmobi.media.h9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3760h9 implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final long f7137a;

    public C3760h9(long j) {
        this.f7137a = j;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Response proceed = chain.proceed(chain.request());
        ResponseBody body = proceed.body();
        long contentLength = body != null ? body.getContentLength() : 0L;
        if (contentLength <= this.f7137a) {
            Intrinsics.checkNotNull(proceed);
            return proceed;
        }
        proceed.close();
        throw new C3566ac("Image size exceeds limit: " + contentLength + " Bytes");
    }
}
