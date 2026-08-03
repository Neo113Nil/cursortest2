package com.unity3d.ads.adplayer;

/* compiled from: AndroidWebViewContainer.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$applySafeAreaInsets$1$1", f = "AndroidWebViewContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidWebViewContainer$applySafeAreaInsets$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $js;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.unity3d.ads.adplayer.AndroidWebViewContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidWebViewContainer$applySafeAreaInsets$1$1(com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer, java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidWebViewContainer$applySafeAreaInsets$1$1> continuation) {
        super(2, continuation);
        this.this$0 = androidWebViewContainer;
        this.$js = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.adplayer.AndroidWebViewContainer$applySafeAreaInsets$1$1 androidWebViewContainer$applySafeAreaInsets$1$1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$applySafeAreaInsets$1$1(this.this$0, this.$js, continuation);
        androidWebViewContainer$applySafeAreaInsets$1$1.L$0 = obj;
        return androidWebViewContainer$applySafeAreaInsets$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.adplayer.AndroidWebViewContainer$applySafeAreaInsets$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer = this.this$0;
        java.lang.String str = this.$js;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            androidWebViewContainer.getWebView().evaluateJavascript(str, null);
            kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        return kotlin.Unit.INSTANCE;
    }
}
