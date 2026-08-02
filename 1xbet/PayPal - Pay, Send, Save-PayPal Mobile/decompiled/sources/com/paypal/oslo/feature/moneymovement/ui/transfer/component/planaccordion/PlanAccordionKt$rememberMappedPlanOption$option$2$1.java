package com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/internal/UIPlanOption;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionKt$rememberMappedPlanOption$option$2$1", f = "PlanAccordion.kt", i = {0, 0, 0}, l = {373}, m = "invokeSuspend", n = {"$this$produceState", "it", "$i$a$-let-PlanAccordionKt$rememberMappedPlanOption$option$2$1$1"}, nl = {373}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes13.dex */
final class PlanAccordionKt$rememberMappedPlanOption$option$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.UIPlanOption>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.UIPlanOption uIPlanOption;
        androidx.compose.runtime.ProduceStateScope produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan = this.Camera2StreamConfigurationMap;
            if (paymentPlan == null) {
                uIPlanOption = null;
                produceStateScope.setValue(uIPlanOption);
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper planAccordionMapper = this.getHighResolutionOutputSizeshNQ4ISI;
            boolean z = this.getHighSpeedVideoFpsRanges;
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(produceStateScope);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentPlan);
            this.getHighSpeedVideoSizesFor = produceStateScope;
            this.getHighSpeedVideoSizes = 0;
            this.getInputFormats = 1;
            obj = planAccordionMapper.mapToOption(paymentPlan, z, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getHighSpeedVideoSizesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        uIPlanOption = (com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.UIPlanOption) obj;
        produceStateScope.setValue(uIPlanOption);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.runtime.ProduceStateScope<com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.UIPlanOption> produceStateScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionKt$rememberMappedPlanOption$option$2$1) create(produceStateScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionKt$rememberMappedPlanOption$option$2$1 planAccordionKt$rememberMappedPlanOption$option$2$1 = new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionKt$rememberMappedPlanOption$option$2$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        planAccordionKt$rememberMappedPlanOption$option$2$1.getOutputMinFrameDuration = obj;
        return planAccordionKt$rememberMappedPlanOption$option$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanAccordionKt$rememberMappedPlanOption$option$2$1(com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan, com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper planAccordionMapper, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionKt$rememberMappedPlanOption$option$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = paymentPlan;
        this.getHighResolutionOutputSizeshNQ4ISI = planAccordionMapper;
        this.getHighSpeedVideoFpsRanges = z;
    }
}
