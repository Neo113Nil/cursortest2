package com.unity3d.ads.adplayer;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidFullscreenWebViewAdPlayer$show$9 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Intent $intent;
    final /* synthetic */ kotlinx.coroutines.CompletableDeferred<kotlin.Unit> $listenerStarted;
    int label;
    final /* synthetic */ com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFullscreenWebViewAdPlayer$show$9(kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred, com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, android.content.Intent intent, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9> continuation) {
        super(2, continuation);
        this.$listenerStarted = completableDeferred;
        this.this$0 = androidFullscreenWebViewAdPlayer;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9(this.$listenerStarted, this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.$listenerStarted.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        context = this.this$0.context;
        context.startActivity(this.$intent);
        return kotlin.Unit.INSTANCE;
    }
}
