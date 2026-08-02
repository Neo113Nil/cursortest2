package io.ktor.client.engine.okhttp;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "Lkotlin/coroutines/CoroutineContext;", "callContext", "Lokhttp3/RequestBody;", "convertToOkHttpBody", "(Lio/ktor/http/content/OutgoingContent;Lkotlin/coroutines/CoroutineContext;)Lokhttp3/RequestBody;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OkHttpEngineKt {
    public static final okhttp3.RequestBody convertToOkHttpBody(final io.ktor.http.content.OutgoingContent outgoingContent, final kotlin.coroutines.CoroutineContext coroutineContext) {
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoingContent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
            if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ByteArrayContent) {
                byte[] getHighResolutionOutputSizeshNQ4ISI = ((io.ktor.http.content.OutgoingContent.ByteArrayContent) outgoingContent).getGetHighResolutionOutputSizeshNQ4ISI();
                return okhttp3.RequestBody.INSTANCE.create(getHighResolutionOutputSizeshNQ4ISI, okhttp3.MediaType.INSTANCE.parse(java.lang.String.valueOf(outgoingContent.getContentType())), 0, getHighResolutionOutputSizeshNQ4ISI.length);
            }
            if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ReadChannelContent) {
                return new io.ktor.client.engine.okhttp.StreamRequestBody(outgoingContent.getContentLength(), new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.engine.okhttp.OkHttpEngineKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        io.ktor.utils.io.ByteReadChannel getHighSpeedVideoFpsRanges;
                        getHighSpeedVideoFpsRanges = ((io.ktor.http.content.OutgoingContent.ReadChannelContent) io.ktor.http.content.OutgoingContent.this).getGetHighSpeedVideoFpsRanges();
                        return getHighSpeedVideoFpsRanges;
                    }
                });
            }
            if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.WriteChannelContent) {
                return new io.ktor.client.engine.okhttp.StreamRequestBody(outgoingContent.getContentLength(), new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.engine.okhttp.OkHttpEngineKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        io.ktor.utils.io.ByteReadChannel channel;
                        channel = io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$default((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, kotlin.coroutines.CoroutineContext.this, false, (kotlin.jvm.functions.Function2) new io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3$1(outgoingContent, null), 2, (java.lang.Object) null).getChannel();
                        return channel;
                    }
                });
            }
            if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.NoContent) {
                return okhttp3.RequestBody.INSTANCE.create(new byte[0], (okhttp3.MediaType) null, 0, 0);
            }
            if (!(outgoingContent instanceof io.ktor.http.content.OutgoingContent.ContentWrapper)) {
                if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ProtocolUpgrade) {
                    throw new io.ktor.client.call.UnsupportedContentTypeException(outgoingContent);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
            outgoingContent = ((io.ktor.http.content.OutgoingContent.ContentWrapper) outgoingContent).getGetHighSpeedVideoFpsRanges();
        }
    }

    public static final /* synthetic */ okhttp3.Request access$convertToOkHttpRequest(io.ktor.client.request.HttpRequestData httpRequestData, kotlin.coroutines.CoroutineContext coroutineContext) {
        final okhttp3.Request.Builder builder = new okhttp3.Request.Builder();
        builder.url(httpRequestData.getUrl().toString());
        final boolean z = !io.ktor.http.HttpMethodKt.getSupportsRequestBody(httpRequestData.getMethod()) && io.ktor.http.content.OutgoingContentKt.isEmpty(httpRequestData.getBody());
        io.ktor.client.engine.UtilsKt.mergeHeaders(httpRequestData.getHeaders(), httpRequestData.getBody(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit>() { // from class: io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpRequest$lambda$0$$inlined$forEachHeader$1
            @Override // kotlin.jvm.functions.Function2
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str, java.lang.String str2) {
                invoke2(str, str2);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.String str, java.lang.String str2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                if (z && kotlin.jvm.internal.Intrinsics.areEqual(str, io.ktor.http.HttpHeaders.INSTANCE.getContentLength())) {
                    return;
                }
                builder.addHeader(str, str2);
            }
        });
        builder.method(httpRequestData.getMethod().getValue(), okhttp3.internal.http.HttpMethod.permitsRequestBody(httpRequestData.getMethod().getValue()) ? convertToOkHttpBody(httpRequestData.getBody(), coroutineContext) : null);
        return builder.build();
    }

    public static final /* synthetic */ java.lang.Throwable access$mapExceptions(java.lang.Throwable th, io.ktor.client.request.HttpRequestData httpRequestData) {
        return th instanceof java.net.SocketTimeoutException ? io.ktor.client.plugins.HttpTimeoutKt.SocketTimeoutException(httpRequestData, th) : th;
    }

    public static final /* synthetic */ okhttp3.OkHttpClient.Builder access$setupTimeoutAttributes(okhttp3.OkHttpClient.Builder builder, io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig) {
        java.lang.Long getHighSpeedVideoFpsRangesFor = httpTimeoutConfig.getGetHighSpeedVideoFpsRangesFor();
        if (getHighSpeedVideoFpsRangesFor != null) {
            builder.connectTimeout(io.ktor.client.plugins.HttpTimeoutKt.convertLongTimeoutToLongWithInfiniteAsZero(getHighSpeedVideoFpsRangesFor.longValue()), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        java.lang.Long getHighSpeedVideoSizes = httpTimeoutConfig.getGetHighSpeedVideoSizes();
        if (getHighSpeedVideoSizes != null) {
            long longValue = getHighSpeedVideoSizes.longValue();
            builder.readTimeout(io.ktor.client.plugins.HttpTimeoutKt.convertLongTimeoutToLongWithInfiniteAsZero(longValue), java.util.concurrent.TimeUnit.MILLISECONDS);
            builder.writeTimeout(io.ktor.client.plugins.HttpTimeoutKt.convertLongTimeoutToLongWithInfiniteAsZero(longValue), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        return builder;
    }
}
