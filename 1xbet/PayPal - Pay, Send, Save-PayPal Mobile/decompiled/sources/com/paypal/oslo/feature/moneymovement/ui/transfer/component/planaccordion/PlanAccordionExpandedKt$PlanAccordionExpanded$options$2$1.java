package com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", "", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/internal/UIPlanOption;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$PlanAccordionExpanded$options$2$1", f = "PlanAccordionExpanded.kt", i = {0}, l = {100}, m = "invokeSuspend", n = {"$this$produceState"}, nl = {101}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class PlanAccordionExpandedKt$PlanAccordionExpanded$options$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<java.util.List<? extends com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.UIPlanOption>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionConfig getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.ProduceStateScope produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getOutputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(produceStateScope);
            this.getHighSpeedVideoSizes = produceStateScope;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = this.getHighSpeedVideoFpsRanges.mapToOptions(this.Camera2StreamConfigurationMap.getPlans(), this.getHighSpeedVideoFpsRangesFor.isInternationalFormat(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        produceStateScope.setValue(obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.runtime.ProduceStateScope<java.util.List<? extends com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.UIPlanOption>> produceStateScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$PlanAccordionExpanded$options$2$1) create(produceStateScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$PlanAccordionExpanded$options$2$1 planAccordionExpandedKt$PlanAccordionExpanded$options$2$1 = new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$PlanAccordionExpanded$options$2$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        planAccordionExpandedKt$PlanAccordionExpanded$options$2$1.getOutputFormats = obj;
        return planAccordionExpandedKt$PlanAccordionExpanded$options$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanAccordionExpandedKt$PlanAccordionExpanded$options$2$1(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper planAccordionMapper, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready ready, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionConfig planAccordionConfig, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionExpandedKt$PlanAccordionExpanded$options$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = planAccordionMapper;
        this.Camera2StreamConfigurationMap = ready;
        this.getHighSpeedVideoFpsRangesFor = planAccordionConfig;
    }
}
