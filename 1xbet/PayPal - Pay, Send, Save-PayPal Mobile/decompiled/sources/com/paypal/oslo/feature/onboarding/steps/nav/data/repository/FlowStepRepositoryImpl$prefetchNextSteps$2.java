package com.paypal.oslo.feature.onboarding.steps.nav.data.repository;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl$prefetchNextSteps$2", f = "FlowStepRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class FlowStepRepositoryImpl$prefetchNextSteps$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.onboarding.steps.nav.domain.Step Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Set<com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition> supportedTransitions = this.Camera2StreamConfigurationMap.getSupportedTransitions();
        com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl flowStepRepositoryImpl = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step = this.Camera2StreamConfigurationMap;
        java.util.ArrayList<com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : supportedTransitions) {
            com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition = (com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition) obj2;
            if (transition.getPrefetchable()) {
                concurrentHashMap = flowStepRepositoryImpl.getHighSpeedVideoFpsRangesFor;
                if (!concurrentHashMap.containsKey(new com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey(step.m16522getFlowId8NcbBzM(), step.m16524getStepIdeVUBM90(), transition.sanitize(), null))) {
                    arrayList.add(obj2);
                }
            }
        }
        com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step2 = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl flowStepRepositoryImpl2 = this.getHighSpeedVideoFpsRanges;
        for (com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition2 : arrayList) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl$prefetchNextSteps$2$2$1(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16020boximpl(step2.m16522getFlowId8NcbBzM())), kotlin.TuplesKt.to("stepId", com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16029boximpl(step2.m16524getStepIdeVUBM90())), kotlin.TuplesKt.to("transition", transition2)), flowStepRepositoryImpl2, step2, transition2, null), 3, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl$prefetchNextSteps$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl$prefetchNextSteps$2 flowStepRepositoryImpl$prefetchNextSteps$2 = new com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl$prefetchNextSteps$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        flowStepRepositoryImpl$prefetchNextSteps$2.getHighResolutionOutputSizeshNQ4ISI = obj;
        return flowStepRepositoryImpl$prefetchNextSteps$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowStepRepositoryImpl$prefetchNextSteps$2(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step, com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl flowStepRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl$prefetchNextSteps$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = step;
        this.getHighSpeedVideoFpsRanges = flowStepRepositoryImpl;
    }
}
