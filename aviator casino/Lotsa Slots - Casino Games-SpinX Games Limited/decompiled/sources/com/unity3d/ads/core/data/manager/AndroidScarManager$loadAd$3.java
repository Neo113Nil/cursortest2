package com.unity3d.ads.core.data.manager;

/* compiled from: AndroidScarManager.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3", f = "AndroidScarManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidScarManager$loadAd$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.unity3d.ads.core.domain.scar.GmaEventData, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ java.lang.String $placementId;
    /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidScarManager$loadAd$3(java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3> continuation) {
        super(2, continuation);
        this.$placementId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3 androidScarManager$loadAd$3 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3(this.$placementId, continuation);
        androidScarManager$loadAd$3.L$0 = obj;
        return androidScarManager$loadAd$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(com.unity3d.ads.core.domain.scar.GmaEventData gmaEventData, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3) create(gmaEventData, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.unity3d.ads.core.domain.scar.GmaEventData gmaEventData = (com.unity3d.ads.core.domain.scar.GmaEventData) this.L$0;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean((kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.unity3d.scar.adapter.common.GMAEvent[]{com.unity3d.scar.adapter.common.GMAEvent.AD_LOADED, com.unity3d.scar.adapter.common.GMAEvent.LOAD_ERROR}).contains(gmaEventData.getGmaEvent()) && kotlin.jvm.internal.Intrinsics.areEqual(gmaEventData.getPlacementId(), this.$placementId)) || kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.unity3d.scar.adapter.common.GMAEvent[]{com.unity3d.scar.adapter.common.GMAEvent.METHOD_ERROR, com.unity3d.scar.adapter.common.GMAEvent.SCAR_NOT_PRESENT, com.unity3d.scar.adapter.common.GMAEvent.INTERNAL_LOAD_ERROR}).contains(gmaEventData.getGmaEvent()));
    }
}
