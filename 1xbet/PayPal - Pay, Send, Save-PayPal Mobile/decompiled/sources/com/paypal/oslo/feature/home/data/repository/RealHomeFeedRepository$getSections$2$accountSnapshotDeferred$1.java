package com.paypal.oslo.feature.home.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository$getSections$2$accountSnapshotDeferred$1", f = "RealHomeFeedRepository.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class RealHomeFeedRepository$getSections$2$accountSnapshotDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem>>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object fetchAccountSnapshot = this.Camera2StreamConfigurationMap.fetchAccountSnapshot(this);
        return fetchAccountSnapshot == coroutine_suspended ? coroutine_suspended : fetchAccountSnapshot;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem>>> continuation) {
        return ((com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository$getSections$2$accountSnapshotDeferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository$getSections$2$accountSnapshotDeferred$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealHomeFeedRepository$getSections$2$accountSnapshotDeferred$1(com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository realHomeFeedRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository$getSections$2$accountSnapshotDeferred$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = realHomeFeedRepository;
    }
}
