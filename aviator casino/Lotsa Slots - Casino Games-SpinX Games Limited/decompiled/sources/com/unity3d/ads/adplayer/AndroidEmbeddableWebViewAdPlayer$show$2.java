package com.unity3d.ads.adplayer;

/* compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2", f = "AndroidEmbeddableWebViewAdPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidEmbeddableWebViewAdPlayer$show$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.unity3d.services.banners.BannerView $bannerView;
    int label;
    final /* synthetic */ com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidEmbeddableWebViewAdPlayer$show$2(com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, com.unity3d.services.banners.BannerView bannerView, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2> continuation) {
        super(2, continuation);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$bannerView = bannerView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2(this.this$0, this.$bannerView, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        android.content.Context context2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        android.webkit.WebView webView = this.this$0.getWebViewContainer().getWebView();
        context = this.this$0.context;
        int pxFromDp = (int) com.unity3d.services.core.misc.ViewUtilities.pxFromDp(context, this.$bannerView.getSize().getWidth());
        context2 = this.this$0.context;
        webView.setLayoutParams(new android.view.ViewGroup.LayoutParams(pxFromDp, (int) com.unity3d.services.core.misc.ViewUtilities.pxFromDp(context2, this.$bannerView.getSize().getHeight())));
        return kotlin.Unit.INSTANCE;
    }
}
