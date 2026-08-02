package com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/preferred/domain/model/instore/InStorePaymentError;", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase$invoke$1", f = "UpdateInstorePaymentPreferenceUseCase.kt", i = {0, 1}, l = {28, 28}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, nl = {28, 29}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes16.dex */
final class UpdateInstorePaymentPreferenceUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError, ? extends java.lang.Boolean>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.domain.model.instore.UpdateInStorePreferenceParams getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r2.emit(r8, r7) == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.preferred.domain.repository.instore.InStorePaymentRepository inStorePaymentRepository;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            inStorePaymentRepository = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
            this.getHighSpeedVideoFpsRangesFor = flowCollector2;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = inStorePaymentRepository.updatePaymentPreference(this.getHighSpeedVideoSizes, this);
            if (obj != coroutine_suspended) {
                flowCollector = flowCollector2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError, ? extends java.lang.Boolean>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase$invoke$1 updateInstorePaymentPreferenceUseCase$invoke$1 = new com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase$invoke$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        updateInstorePaymentPreferenceUseCase$invoke$1.Camera2StreamConfigurationMap = obj;
        return updateInstorePaymentPreferenceUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateInstorePaymentPreferenceUseCase$invoke$1(com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase updateInstorePaymentPreferenceUseCase, com.paypal.oslo.feature.wallet.preferred.domain.model.instore.UpdateInStorePreferenceParams updateInStorePreferenceParams, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.preferred.domain.usecase.instore.UpdateInstorePaymentPreferenceUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = updateInstorePaymentPreferenceUseCase;
        this.getHighSpeedVideoSizes = updateInStorePreferenceParams;
    }
}
