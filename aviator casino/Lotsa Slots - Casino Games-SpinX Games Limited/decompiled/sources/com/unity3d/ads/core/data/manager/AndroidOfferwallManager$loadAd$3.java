package com.unity3d.ads.core.data.manager;

/* compiled from: AndroidOfferwallManager.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3", f = "AndroidOfferwallManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidOfferwallManager$loadAd$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.unity3d.ads.core.domain.offerwall.OfferwallEventData, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ java.lang.String $placementName;
    /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidOfferwallManager$loadAd$3(java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3> continuation) {
        super(2, continuation);
        this.$placementName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3 androidOfferwallManager$loadAd$3 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3(this.$placementName, continuation);
        androidOfferwallManager$loadAd$3.L$0 = obj;
        return androidOfferwallManager$loadAd$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(com.unity3d.ads.core.domain.offerwall.OfferwallEventData offerwallEventData, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3) create(offerwallEventData, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.unity3d.ads.core.domain.offerwall.OfferwallEventData offerwallEventData = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) this.L$0;
        boolean z = false;
        if (kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.unity3d.services.ads.offerwall.OfferwallEvent[]{com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_SUCCESS, com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_FAILED}).contains(offerwallEventData.getOfferwallEvent()) && kotlin.jvm.internal.Intrinsics.areEqual(offerwallEventData.getPlacementName(), this.$placementName)) {
            z = true;
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
    }
}
