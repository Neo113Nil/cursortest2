package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "page", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/specialfinancing/SpecialFinancingPage;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$handlePagination$2", f = "SpecialFinancingSideEffectMiddleware.kt", i = {0, 0}, l = {111}, m = "invokeSuspend", n = {"page", "activities"}, nl = {112}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class SpecialFinancingSideEffectMiddleware$handlePagination$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent, kotlin.Unit> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper specialFinancingMapper;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage specialFinancingPage = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage) this.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> promotionalActivities = specialFinancingPage.getPromotionalActivities();
            if (promotionalActivities == null) {
                promotionalActivities = kotlin.collections.CollectionsKt.emptyList();
            }
            specialFinancingMapper = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            creditProductIdentifier = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = specialFinancingPage;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(promotionalActivities);
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = specialFinancingMapper.categorizeItems(promotionalActivities, creditProductIdentifier, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.CategorizedSpecialFinancingItems categorizedSpecialFinancingItems = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.CategorizedSpecialFinancingItems) obj;
        this.getHighSpeedVideoFpsRanges.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnAddingMorePromotionalActivities(categorizedSpecialFinancingItems.getExpiring(), categorizedSpecialFinancingItems.getActive(), categorizedSpecialFinancingItems.getPaidOff(), specialFinancingPage.getHasNextPage(), specialFinancingPage.getNextOffset()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage specialFinancingPage, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$handlePagination$2) create(specialFinancingPage, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$handlePagination$2 specialFinancingSideEffectMiddleware$handlePagination$2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$handlePagination$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        specialFinancingSideEffectMiddleware$handlePagination$2.getHighSpeedVideoSizes = obj;
        return specialFinancingSideEffectMiddleware$handlePagination$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SpecialFinancingSideEffectMiddleware$handlePagination$2(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware specialFinancingSideEffectMiddleware, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$handlePagination$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = specialFinancingSideEffectMiddleware;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
