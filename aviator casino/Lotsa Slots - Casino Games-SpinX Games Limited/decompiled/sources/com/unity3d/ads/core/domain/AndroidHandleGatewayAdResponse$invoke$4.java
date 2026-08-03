package com.unity3d.ads.core.domain;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4", f = "AndroidHandleGatewayAdResponse.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidHandleGatewayAdResponse$invoke$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.ads.adplayer.AdPlayer> $adPlayer;
    final /* synthetic */ com.unity3d.ads.adplayer.model.LoadEvent $loadEvent;
    final /* synthetic */ com.google.protobuf.ByteString $opportunityId;
    final /* synthetic */ gatewayprotocol.v1.AdResponseOuterClass.AdResponse $response;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHandleGatewayAdResponse$invoke$4(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, com.unity3d.ads.adplayer.model.LoadEvent loadEvent, com.google.protobuf.ByteString byteString, gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse, kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.ads.adplayer.AdPlayer> objectRef, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4> continuation) {
        super(2, continuation);
        this.this$0 = androidHandleGatewayAdResponse;
        this.$loadEvent = loadEvent;
        this.$opportunityId = byteString;
        this.$response = adResponse;
        this.$adPlayer = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4(this.this$0, this.$loadEvent, this.$opportunityId, this.$response, this.$adPlayer, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object cleanup;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            cleanup = this.this$0.cleanup(new java.lang.Error(((com.unity3d.ads.adplayer.model.LoadEvent.Error) this.$loadEvent).getMessage()), this.$opportunityId, this.$response, this.$adPlayer.element, this);
            if (cleanup == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
