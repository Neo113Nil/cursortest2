package coil3.content.okhttp.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0082@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcoil3/network/NetworkRequestBody;", "Lokio/ByteString;", "getHighSpeedVideoFpsRangesFor", "(Lcoil3/network/NetworkRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CallFactoryNetworkClientKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$toRequest(coil3.content.NetworkRequest networkRequest, kotlin.coroutines.Continuation continuation) {
        coil3.content.okhttp.internal.CallFactoryNetworkClientKt$toRequest$1 callFactoryNetworkClientKt$toRequest$1;
        int i;
        okhttp3.Request.Builder builder;
        java.lang.String str;
        okhttp3.Request.Builder builder2;
        okhttp3.Request.Builder builder3;
        coil3.content.NetworkRequest networkRequest2;
        java.lang.String str2;
        okio.ByteString byteString;
        if (continuation instanceof coil3.content.okhttp.internal.CallFactoryNetworkClientKt$toRequest$1) {
            callFactoryNetworkClientKt$toRequest$1 = (coil3.content.okhttp.internal.CallFactoryNetworkClientKt$toRequest$1) continuation;
            if ((callFactoryNetworkClientKt$toRequest$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                callFactoryNetworkClientKt$toRequest$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = callFactoryNetworkClientKt$toRequest$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = callFactoryNetworkClientKt$toRequest$1.getHighSpeedVideoFpsRangesFor;
                okhttp3.RequestBody requestBody = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    builder = new okhttp3.Request.Builder();
                    builder.url(networkRequest.getUrl());
                    java.lang.String method = networkRequest.getMethod();
                    coil3.content.NetworkRequestBody body = networkRequest.getBody();
                    if (body == null) {
                        str = method;
                        builder2 = builder;
                        builder3 = builder;
                        java.lang.String str3 = str;
                        networkRequest2 = networkRequest;
                        str2 = str3;
                        builder3.method(str2, requestBody);
                        coil3.content.NetworkHeaders headers = networkRequest2.getHeaders();
                        okhttp3.Headers.Builder builder4 = new okhttp3.Headers.Builder();
                        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : headers.asMap().entrySet()) {
                            java.lang.String key = entry.getKey();
                            java.util.Iterator<java.lang.String> it = entry.getValue().iterator();
                            while (it.hasNext()) {
                                builder4.addUnsafeNonAscii(key, it.next());
                            }
                        }
                        builder2.headers(builder4.build());
                        return builder2.build();
                    }
                    callFactoryNetworkClientKt$toRequest$1.getHighSpeedVideoFpsRanges = networkRequest;
                    callFactoryNetworkClientKt$toRequest$1.getHighResolutionOutputSizeshNQ4ISI = builder;
                    callFactoryNetworkClientKt$toRequest$1.Camera2StreamConfigurationMap = builder;
                    callFactoryNetworkClientKt$toRequest$1.getHighSpeedVideoSizes = method;
                    callFactoryNetworkClientKt$toRequest$1.getHighSpeedVideoFpsRangesFor = 1;
                    java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(body, callFactoryNetworkClientKt$toRequest$1);
                    if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    builder3 = builder;
                    obj = highSpeedVideoFpsRangesFor;
                    networkRequest2 = networkRequest;
                    str2 = method;
                    builder2 = builder3;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) callFactoryNetworkClientKt$toRequest$1.getHighSpeedVideoSizes;
                    builder3 = (okhttp3.Request.Builder) callFactoryNetworkClientKt$toRequest$1.Camera2StreamConfigurationMap;
                    builder2 = (okhttp3.Request.Builder) callFactoryNetworkClientKt$toRequest$1.getHighResolutionOutputSizeshNQ4ISI;
                    networkRequest2 = (coil3.content.NetworkRequest) callFactoryNetworkClientKt$toRequest$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                byteString = (okio.ByteString) obj;
                if (byteString == null) {
                    requestBody = okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody.INSTANCE, byteString, (okhttp3.MediaType) null, 1, (java.lang.Object) null);
                    builder3.method(str2, requestBody);
                    coil3.content.NetworkHeaders headers2 = networkRequest2.getHeaders();
                    okhttp3.Headers.Builder builder42 = new okhttp3.Headers.Builder();
                    while (r7.hasNext()) {
                    }
                    builder2.headers(builder42.build());
                    return builder2.build();
                }
                builder = builder3;
                coil3.content.NetworkRequest networkRequest3 = networkRequest2;
                str = str2;
                networkRequest = networkRequest3;
                builder3 = builder;
                java.lang.String str32 = str;
                networkRequest2 = networkRequest;
                str2 = str32;
                builder3.method(str2, requestBody);
                coil3.content.NetworkHeaders headers22 = networkRequest2.getHeaders();
                okhttp3.Headers.Builder builder422 = new okhttp3.Headers.Builder();
                while (r7.hasNext()) {
                }
                builder2.headers(builder422.build());
                return builder2.build();
            }
        }
        callFactoryNetworkClientKt$toRequest$1 = new coil3.content.okhttp.internal.CallFactoryNetworkClientKt$toRequest$1(continuation);
        java.lang.Object obj2 = callFactoryNetworkClientKt$toRequest$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = callFactoryNetworkClientKt$toRequest$1.getHighSpeedVideoFpsRangesFor;
        okhttp3.RequestBody requestBody2 = null;
        if (i != 0) {
        }
        byteString = (okio.ByteString) obj2;
        if (byteString == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getHighSpeedVideoFpsRangesFor(coil3.content.NetworkRequestBody networkRequestBody, kotlin.coroutines.Continuation<? super okio.ByteString> continuation) {
        coil3.content.okhttp.internal.CallFactoryNetworkClientKt$readByteString$1 callFactoryNetworkClientKt$readByteString$1;
        int i;
        okio.Buffer buffer;
        if (continuation instanceof coil3.content.okhttp.internal.CallFactoryNetworkClientKt$readByteString$1) {
            callFactoryNetworkClientKt$readByteString$1 = (coil3.content.okhttp.internal.CallFactoryNetworkClientKt$readByteString$1) continuation;
            if ((callFactoryNetworkClientKt$readByteString$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                callFactoryNetworkClientKt$readByteString$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = callFactoryNetworkClientKt$readByteString$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = callFactoryNetworkClientKt$readByteString$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    okio.Buffer buffer2 = new okio.Buffer();
                    callFactoryNetworkClientKt$readByteString$1.getHighSpeedVideoFpsRanges = buffer2;
                    callFactoryNetworkClientKt$readByteString$1.getHighSpeedVideoSizes = 1;
                    if (networkRequestBody.writeTo(buffer2, callFactoryNetworkClientKt$readByteString$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    buffer = buffer2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    buffer = (okio.Buffer) callFactoryNetworkClientKt$readByteString$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return buffer.readByteString();
            }
        }
        callFactoryNetworkClientKt$readByteString$1 = new coil3.content.okhttp.internal.CallFactoryNetworkClientKt$readByteString$1(continuation);
        java.lang.Object obj2 = callFactoryNetworkClientKt$readByteString$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = callFactoryNetworkClientKt$readByteString$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return buffer.readByteString();
    }

    public static final /* synthetic */ coil3.content.NetworkResponse access$toNetworkResponse(okhttp3.Response response) {
        okio.BufferedSource getHighResolutionOutputSizeshNQ4ISI;
        int code = response.code();
        long sentRequestAtMillis = response.sentRequestAtMillis();
        long receivedResponseAtMillis = response.receivedResponseAtMillis();
        okhttp3.Headers headers = response.headers();
        coil3.network.NetworkHeaders.Builder builder = new coil3.network.NetworkHeaders.Builder();
        java.util.Iterator<kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>> it = headers.iterator();
        while (it.hasNext()) {
            kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> next = it.next();
            builder.add(next.component1(), next.component2());
        }
        coil3.content.NetworkHeaders build = builder.build();
        okhttp3.ResponseBody body = response.body();
        return new coil3.content.NetworkResponse(code, sentRequestAtMillis, receivedResponseAtMillis, build, (body == null || (getHighResolutionOutputSizeshNQ4ISI = body.getGetHighResolutionOutputSizeshNQ4ISI()) == null) ? null : coil3.content.NetworkClientKt.NetworkResponseBody(getHighResolutionOutputSizeshNQ4ISI), response);
    }
}
