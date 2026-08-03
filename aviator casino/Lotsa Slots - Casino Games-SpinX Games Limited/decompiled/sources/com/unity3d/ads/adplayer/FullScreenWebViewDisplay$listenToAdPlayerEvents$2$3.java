package com.unity3d.ads.adplayer;

/* compiled from: FullScreenWebViewDisplay.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/adplayer/DisplayMessage;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3", f = "FullScreenWebViewDisplay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.unity3d.ads.adplayer.DisplayMessage, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.unity3d.ads.adplayer.FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(com.unity3d.ads.adplayer.FullScreenWebViewDisplay fullScreenWebViewDisplay, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3> continuation) {
        super(2, continuation);
        this.this$0 = fullScreenWebViewDisplay;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 = new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this.this$0, continuation);
        fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3.L$0 = obj;
        return fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(com.unity3d.ads.adplayer.DisplayMessage displayMessage, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3) create(displayMessage, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m10798constructorimpl;
        com.unity3d.services.core.domain.ISDKDispatchers dispatchers;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.unity3d.ads.adplayer.DisplayMessage displayMessage = (com.unity3d.ads.adplayer.DisplayMessage) this.L$0;
        com.unity3d.ads.adplayer.FullScreenWebViewDisplay fullScreenWebViewDisplay = this.this$0;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.DisplayFinishRequest) {
                fullScreenWebViewDisplay.finish();
            } else if (displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.WebViewInstanceResponse) {
                fullScreenWebViewDisplay.loadWebView(((com.unity3d.ads.adplayer.DisplayMessage.WebViewInstanceResponse) displayMessage).getWebView());
            } else if (displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.SetOrientation) {
                fullScreenWebViewDisplay.setRequestedOrientation(((com.unity3d.ads.adplayer.DisplayMessage.SetOrientation) displayMessage).getOrientation());
            } else if (displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.OpenUrl) {
                fullScreenWebViewDisplay.openUrl(displayMessage.getOpportunityId(), ((com.unity3d.ads.adplayer.DisplayMessage.OpenUrl) displayMessage).getIntent(), ((com.unity3d.ads.adplayer.DisplayMessage.OpenUrl) displayMessage).getUseActivityForResult());
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        com.unity3d.ads.adplayer.FullScreenWebViewDisplay fullScreenWebViewDisplay2 = this.this$0;
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl != null) {
            androidx.lifecycle.LifecycleCoroutineScope lifecycleScope = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(fullScreenWebViewDisplay2);
            dispatchers = fullScreenWebViewDisplay2.getDispatchers();
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(lifecycleScope, dispatchers.getDefault(), null, new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1(fullScreenWebViewDisplay2, m10801exceptionOrNullimpl, null), 2, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
