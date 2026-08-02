package com.zettle.sdk.interceptors;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/interceptors/OneShotBodyTransformerInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lokhttp3/Request;", "getHighSpeedVideoFpsRanges", "(Lokhttp3/Request;)Lokhttp3/Request;", "Lcom/zettle/sdk/commons/util/Log;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/commons/util/Log;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OneShotBodyTransformerInterceptor implements okhttp3.Interceptor {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.util.Log getHighSpeedVideoSizes = com.zettle.sdk.commons.util.Log.INSTANCE.get("OkHttpOneShotBodyTransformerInterceptor");

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        return chain.proceed(getHighSpeedVideoFpsRanges(chain.request()));
    }

    private final okhttp3.Request getHighSpeedVideoFpsRanges(okhttp3.Request request) {
        okhttp3.RequestBody body = request.body();
        if (body != null && body.isOneShot()) {
            okhttp3.MediaType contentType = body.getContentType();
            if (kotlin.jvm.internal.Intrinsics.areEqual(contentType != null ? contentType.subtype() : null, "json")) {
                com.zettle.sdk.commons.util.Log.DefaultImpls.d$default(this.getHighSpeedVideoSizes, "Transforming one-shot request body to enable retry support for: ".concat(java.lang.String.valueOf(request.url())), null, 2, null);
                okio.Buffer buffer = new okio.Buffer();
                try {
                    okio.Buffer buffer2 = buffer;
                    body.writeTo(buffer2);
                    okhttp3.RequestBody create$default = okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody.INSTANCE, buffer2.readByteArray(), contentType, 0, 0, 6, (java.lang.Object) null);
                    kotlin.io.CloseableKt.closeFinally(buffer, null);
                    return request.newBuilder().post(create$default).build();
                } finally {
                }
            }
        }
        return request;
    }
}
