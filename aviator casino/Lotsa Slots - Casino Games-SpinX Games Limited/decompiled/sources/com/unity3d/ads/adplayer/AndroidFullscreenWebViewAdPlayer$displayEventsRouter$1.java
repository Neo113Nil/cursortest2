package com.unity3d.ads.adplayer;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 211, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.unity3d.ads.adplayer.DisplayMessage $displayMessage;
    int label;
    final /* synthetic */ com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(com.unity3d.ads.adplayer.DisplayMessage displayMessage, com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1> continuation) {
        super(2, continuation);
        this.$displayMessage = displayMessage;
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1(this.$displayMessage, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer;
        com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer2;
        com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer3;
        com.unity3d.ads.adplayer.WebViewAdPlayer webViewAdPlayer4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                com.unity3d.ads.adplayer.DisplayMessage displayMessage = this.$displayMessage;
                if (displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.DisplayReady) {
                    webViewAdPlayer4 = this.this$0.webViewAdPlayer;
                    this.label = 1;
                    if (webViewAdPlayer4.requestShow(((com.unity3d.ads.adplayer.DisplayMessage.DisplayReady) this.$displayMessage).getShowOptions(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.WebViewInstanceRequest) {
                    this.label = 2;
                    if (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages().emit(new com.unity3d.ads.adplayer.DisplayMessage.WebViewInstanceResponse(this.$displayMessage.getOpportunityId(), this.this$0.getWebViewContainer().getWebView()), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.VisibilityChanged) {
                    webViewAdPlayer3 = this.this$0.webViewAdPlayer;
                    this.label = 3;
                    if (webViewAdPlayer3.sendVisibilityChange(((com.unity3d.ads.adplayer.DisplayMessage.VisibilityChanged) this.$displayMessage).getIsVisible(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.FocusChanged) {
                    webViewAdPlayer2 = this.this$0.webViewAdPlayer;
                    this.label = 4;
                    if (webViewAdPlayer2.sendFocusChange(((com.unity3d.ads.adplayer.DisplayMessage.FocusChanged) this.$displayMessage).getIsFocused(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.DisplayDestroyed) {
                    webViewAdPlayer = this.this$0.webViewAdPlayer;
                    this.label = 5;
                    if (webViewAdPlayer.sendActivityDestroyed(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (displayMessage instanceof com.unity3d.ads.adplayer.DisplayMessage.DisplayError) {
                    this.label = 6;
                    if (this.this$0.destroy(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                break;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return kotlin.Unit.INSTANCE;
    }
}
