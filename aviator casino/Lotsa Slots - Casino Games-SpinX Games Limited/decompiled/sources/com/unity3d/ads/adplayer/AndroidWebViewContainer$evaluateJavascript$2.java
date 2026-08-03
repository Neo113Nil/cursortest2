package com.unity3d.ads.adplayer;

/* compiled from: AndroidWebViewContainer.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2", f = "AndroidWebViewContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidWebViewContainer$evaluateJavascript$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ org.json.JSONArray $arguments;
    final /* synthetic */ com.unity3d.ads.adplayer.HandlerType $handlerType;
    int label;
    final /* synthetic */ com.unity3d.ads.adplayer.AndroidWebViewContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidWebViewContainer$evaluateJavascript$2(org.json.JSONArray jSONArray, com.unity3d.ads.adplayer.HandlerType handlerType, com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2> continuation) {
        super(2, continuation);
        this.$arguments = jSONArray;
        this.$handlerType = handlerType;
        this.this$0 = androidWebViewContainer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2(this.$arguments, this.$handlerType, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.StringBuilder shared_string_builder;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String jSONArray = this.$arguments.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray, "arguments.toString()");
        int length = this.$handlerType.getJsPath().length() + 32 + jSONArray.length() + 2;
        if (length > com.unity3d.ads.adplayer.AndroidWebViewContainer.INSTANCE.getSHARED_STRING_BUILDER().capacity()) {
            shared_string_builder = new java.lang.StringBuilder(length);
        } else {
            shared_string_builder = com.unity3d.ads.adplayer.AndroidWebViewContainer.INSTANCE.getSHARED_STRING_BUILDER();
            kotlin.text.StringsKt.clear(shared_string_builder);
        }
        com.unity3d.ads.adplayer.HandlerType handlerType = this.$handlerType;
        shared_string_builder.append("javascript:window.nativebridge.");
        shared_string_builder.append(handlerType.getJsPath());
        shared_string_builder.append("(");
        shared_string_builder.append(jSONArray);
        shared_string_builder.append(");");
        this.this$0.getWebView().evaluateJavascript(shared_string_builder.toString(), null);
        return kotlin.Unit.INSTANCE;
    }
}
