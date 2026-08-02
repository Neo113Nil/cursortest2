package com.paypal.oslo.feature.businesshome.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/businesshome/domain/model/BusinessHomeFeed;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase$invoke$2", f = "GetBusinessHomeFeedUseCase.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {29, 35}, m = "invokeSuspend", n = {"$this$coroutineScope", "insights", "accountSetup", "$this$coroutineScope", "insights", "accountSetup", "showAccountSetupCard"}, nl = {42, 36}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "Z$0"}, v = 2)
/* loaded from: classes11.dex */
final class GetBusinessHomeFeedUseCase$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.domain.model.BusinessHomeFeed>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.Deferred async$default2;
        kotlinx.coroutines.Deferred deferred;
        boolean z;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        boolean z2 = true;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase$invoke$2$insights$1(this.Camera2StreamConfigurationMap, null), 3, null);
            async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase$invoke$2$accountSetup$1(this.Camera2StreamConfigurationMap, null), 3, null);
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoFpsRangesFor = async$default;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default2);
            this.getHighSpeedVideoSizes = 1;
            java.lang.Object await = async$default2.await(this);
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
            z = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            return new com.paypal.oslo.feature.businesshome.domain.model.BusinessHomeFeed((arrow.core.Either) obj, z);
        }
        async$default2 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRanges;
        deferred = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        arrow.core.Either either = (arrow.core.Either) obj;
        if (either instanceof arrow.core.Either.Right) {
            z2 = ((com.paypal.oslo.feature.businesshome.domain.usecase.AccountSetupResult) ((arrow.core.Either.Right) either).getValue()) instanceof com.paypal.oslo.feature.businesshome.domain.usecase.AccountSetupResult.NeedsSetup;
        } else {
            if (!(either instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default2);
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
        this.getHighSpeedVideoSizes = 2;
        obj = deferred.await(this);
        if (obj != coroutine_suspended) {
            z = z2;
            return new com.paypal.oslo.feature.businesshome.domain.model.BusinessHomeFeed((arrow.core.Either) obj, z);
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.domain.model.BusinessHomeFeed> continuation) {
        return ((com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase$invoke$2 getBusinessHomeFeedUseCase$invoke$2 = new com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase$invoke$2(this.Camera2StreamConfigurationMap, continuation);
        getBusinessHomeFeedUseCase$invoke$2.getInputSizeshNQ4ISI = obj;
        return getBusinessHomeFeedUseCase$invoke$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetBusinessHomeFeedUseCase$invoke$2(com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase getBusinessHomeFeedUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = getBusinessHomeFeedUseCase;
    }
}
