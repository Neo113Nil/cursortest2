package com.paypal.oslo.feature.home.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00030\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository$getSections$2", f = "RealHomeFeedRepository.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {115, 116}, m = "invokeSuspend", n = {"$this$coroutineScope", "accountSnapshotDeferred", "homeFeedDeferred", "$this$coroutineScope", "accountSnapshotDeferred", "homeFeedDeferred", "accountSnapshotResult"}, nl = {116, 118}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes12.dex */
final class RealHomeFeedRepository$getSections$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>>>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.Deferred async$default2;
        kotlinx.coroutines.Deferred deferred;
        arrow.core.Ior ior;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository$getSections$2$accountSnapshotDeferred$1(this.getHighSpeedVideoSizes, null), 3, null);
            async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository$getSections$2$homeFeedDeferred$1(this.getHighSpeedVideoSizes, null), 3, null);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default);
            this.Camera2StreamConfigurationMap = async$default2;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            java.lang.Object await = async$default.await(this);
            if (await != coroutine_suspended) {
                deferred = async$default;
                obj = await;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ior = (arrow.core.Ior) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            return com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository.access$combineResults(this.getHighSpeedVideoSizes, ior, (arrow.core.Ior) obj);
        }
        async$default2 = (kotlinx.coroutines.Deferred) this.Camera2StreamConfigurationMap;
        deferred = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        arrow.core.Ior ior2 = (arrow.core.Ior) obj;
        this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default2);
        this.getHighSpeedVideoFpsRanges = ior2;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
        java.lang.Object await2 = async$default2.await(this);
        if (await2 != coroutine_suspended) {
            ior = ior2;
            obj = await2;
            return com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository.access$combineResults(this.getHighSpeedVideoSizes, ior, (arrow.core.Ior) obj);
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>>>> continuation) {
        return ((com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository$getSections$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository$getSections$2 realHomeFeedRepository$getSections$2 = new com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository$getSections$2(this.getHighSpeedVideoSizes, continuation);
        realHomeFeedRepository$getSections$2.getOutputFormats = obj;
        return realHomeFeedRepository$getSections$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealHomeFeedRepository$getSections$2(com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository realHomeFeedRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository$getSections$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = realHomeFeedRepository;
    }
}
