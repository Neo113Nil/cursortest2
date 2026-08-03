package com.unity3d.ads.core.data.repository;

/* compiled from: AndroidOpenMeasurementRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/OMResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2", f = "AndroidOpenMeasurementRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidOpenMeasurementRepository$impressionOccurred$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult>, java.lang.Object> {
    final /* synthetic */ com.google.protobuf.ByteString $opportunityId;
    final /* synthetic */ boolean $signalLoaded;
    int label;
    final /* synthetic */ com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidOpenMeasurementRepository$impressionOccurred$2(com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository androidOpenMeasurementRepository, com.google.protobuf.ByteString byteString, boolean z, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2> continuation) {
        super(2, continuation);
        this.this$0 = androidOpenMeasurementRepository;
        this.$opportunityId = byteString;
        this.$signalLoaded = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2(this.this$0, this.$opportunityId, this.$signalLoaded, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.OMResult> continuation) {
        return ((com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.iab.omid.library.unity3d.adsession.AdSession session;
        com.unity3d.ads.core.data.manager.OmidManager omidManager;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            session = this.this$0.getSession(this.$opportunityId);
            if (session == null) {
                return new com.unity3d.ads.core.data.model.OMResult.Failure("om_session_not_found", null, 2, null);
            }
            omidManager = this.this$0.omidManager;
            com.iab.omid.library.unity3d.adsession.AdEvents createAdEvents = omidManager.createAdEvents(session);
            if (this.$signalLoaded) {
                createAdEvents.loaded();
            }
            createAdEvents.impressionOccurred();
            return com.unity3d.ads.core.data.model.OMResult.Success.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
