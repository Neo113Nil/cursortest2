package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.DnsTxtQueryKt$fetchTxtRecords$2", f = "DnsTxtQuery.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class DnsTxtQueryKt$fetchTxtRecords$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends java.lang.String>>, java.lang.Object> {
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        okhttp3.Response execute = com.statsig.androidsdk.HttpUtils.INSTANCE.getHttpClient$android_sdk_release().newCall(new okhttp3.Request.Builder().url(com.statsig.androidsdk.DnsTxtQueryKt.DNS_QUERY_ENDPOINT).post(okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody.INSTANCE, com.statsig.androidsdk.DnsTxtQueryKt.getFEATURE_ASSETS_DNS_QUERY(), (okhttp3.MediaType) null, 0, 0, 7, (java.lang.Object) null)).addHeader("Content-Type", "application/dns-message").addHeader("Accept", "application/dns-message").addHeader(com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_KEY, com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE).build()).execute();
        try {
            try {
                okhttp3.ResponseBody body = execute.body();
                kotlin.jvm.internal.Intrinsics.checkNotNull(body);
                return com.statsig.androidsdk.DnsTxtQueryKt.parseDnsResponse(body.bytes());
            } catch (java.lang.Exception unused) {
                throw new com.statsig.androidsdk.DnsTxtFetchError("Request timed out while fetching TXT records");
            }
        } finally {
            execute.close();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> continuation) {
        return ((com.statsig.androidsdk.DnsTxtQueryKt$fetchTxtRecords$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends java.lang.String>> continuation) {
        return invoke2(coroutineScope, (kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.DnsTxtQueryKt$fetchTxtRecords$2(continuation);
    }

    DnsTxtQueryKt$fetchTxtRecords$2(kotlin.coroutines.Continuation<? super com.statsig.androidsdk.DnsTxtQueryKt$fetchTxtRecords$2> continuation) {
        super(2, continuation);
    }
}
