package com.unity3d.services.core.network.core;

/* compiled from: LegacyHttpClient.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.network.core.LegacyHttpClient$execute$2", f = "LegacyHttpClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class LegacyHttpClient$execute$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse>, java.lang.Object> {
    final /* synthetic */ com.unity3d.services.core.network.model.HttpRequest $request;
    final /* synthetic */ boolean $withInputStream;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyHttpClient$execute$2(com.unity3d.services.core.network.model.HttpRequest httpRequest, boolean z, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.LegacyHttpClient$execute$2> continuation) {
        super(2, continuation);
        this.$request = httpRequest;
        this.$withInputStream = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.core.network.core.LegacyHttpClient$execute$2(this.$request, this.$withInputStream, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) {
        return ((com.unity3d.services.core.network.core.LegacyHttpClient$execute$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.unity3d.services.core.request.WebRequest webRequest = com.unity3d.services.core.network.mapper.HttpRequestToWebRequestKt.toWebRequest(this.$request);
        java.lang.String makeRequest = webRequest.makeRequest();
        if (makeRequest == null) {
            makeRequest = "";
        }
        if (this.$withInputStream) {
            byte[] bytes = makeRequest.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            obj2 = new java.io.ByteArrayInputStream(bytes);
        } else {
            obj2 = makeRequest;
        }
        int responseCode = webRequest.getResponseCode();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers = webRequest.getHeaders();
        java.lang.String url = webRequest.getUrl().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "toString()");
        return new com.unity3d.services.core.network.model.HttpResponse(obj2, responseCode, headers, url, null, "legacy", 0L, 80, null);
    }
}
