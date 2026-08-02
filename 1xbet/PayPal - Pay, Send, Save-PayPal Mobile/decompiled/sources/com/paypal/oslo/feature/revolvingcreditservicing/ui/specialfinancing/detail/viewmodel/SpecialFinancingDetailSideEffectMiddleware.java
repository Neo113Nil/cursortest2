package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/detail/viewmodel/SpecialFinancingDetailSideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/detail/viewmodel/SpecialFinancingDetailState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/detail/viewmodel/SpecialFinancingDetailEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/detail/mapper/SpecialFinancingDetailMapper;", "specialFinancingDetailMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/detail/mapper/SpecialFinancingDetailMapper;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/detail/viewmodel/SpecialFinancingDetailState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/detail/viewmodel/SpecialFinancingDetailState$InitializingUiModel;", "p0", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/detail/viewmodel/SpecialFinancingDetailState$InitializingUiModel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/detail/mapper/SpecialFinancingDetailMapper;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SpecialFinancingDetailSideEffectMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailState, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailEvent> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper.SpecialFinancingDetailMapper getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public SpecialFinancingDetailSideEffectMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper.SpecialFinancingDetailMapper specialFinancingDetailMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingDetailMapper, "");
        this.getHighSpeedVideoFpsRanges = specialFinancingDetailMapper;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailState specialFinancingDetailState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(specialFinancingDetailState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailState specialFinancingDetailState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (specialFinancingDetailState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailState.InitializingUiModel) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes((com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailState.InitializingUiModel) specialFinancingDetailState, function1, continuation);
            return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
        }
        if (!(specialFinancingDetailState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailState.Initial) && !(specialFinancingDetailState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailState.Ready)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailState.InitializingUiModel initializingUiModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailSideEffectMiddleware$mapToUiModel$1 specialFinancingDetailSideEffectMiddleware$mapToUiModel$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailSideEffectMiddleware$mapToUiModel$1) {
            specialFinancingDetailSideEffectMiddleware$mapToUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailSideEffectMiddleware$mapToUiModel$1) continuation;
            if ((specialFinancingDetailSideEffectMiddleware$mapToUiModel$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                specialFinancingDetailSideEffectMiddleware$mapToUiModel$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = specialFinancingDetailSideEffectMiddleware$mapToUiModel$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = specialFinancingDetailSideEffectMiddleware$mapToUiModel$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper.SpecialFinancingDetailMapper specialFinancingDetailMapper = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity = initializingUiModel.getPromotionalActivity();
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi = initializingUiModel.getCpi();
                    specialFinancingDetailSideEffectMiddleware$mapToUiModel$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(initializingUiModel);
                    specialFinancingDetailSideEffectMiddleware$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    specialFinancingDetailSideEffectMiddleware$mapToUiModel$1.getHighSpeedVideoFpsRanges = 1;
                    obj = specialFinancingDetailMapper.toDetailUiModel(promotionalActivity, cpi, specialFinancingDetailSideEffectMiddleware$mapToUiModel$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) specialFinancingDetailSideEffectMiddleware$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailEvent.OnUiModelInitialized((com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.uimodel.SpecialFinancingDetailUiModel) obj));
                return kotlin.Unit.INSTANCE;
            }
        }
        specialFinancingDetailSideEffectMiddleware$mapToUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailSideEffectMiddleware$mapToUiModel$1(this, continuation);
        java.lang.Object obj2 = specialFinancingDetailSideEffectMiddleware$mapToUiModel$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = specialFinancingDetailSideEffectMiddleware$mapToUiModel$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailEvent.OnUiModelInitialized((com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.uimodel.SpecialFinancingDetailUiModel) obj2));
        return kotlin.Unit.INSTANCE;
    }
}
