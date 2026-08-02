package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u001b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJl\u0010&\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u001e2\"\u0010$\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\"\u0012\u0006\u0012\u0004\u0018\u00010#0 2\u001c\u0010%\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\"\u0012\u0006\u0012\u0004\u0018\u00010#0\u000fH\u0082@¢\u0006\u0004\b&\u0010'R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010(R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingSideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetSpecialFinancingPageUseCase;", "getSpecialFinancingPage", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/SpecialFinancingMapper;", "mapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "creditAccountId", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetSpecialFinancingPageUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/SpecialFinancingMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingState$InitializingUiModel;", "p1", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingState$InitializingUiModel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingState$Ready;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingState$Ready;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p2", "Lkotlin/Function2;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/specialfinancing/SpecialFinancingPage;", "Lkotlin/coroutines/Continuation;", "", "p3", "p4", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetSpecialFinancingPageUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/SpecialFinancingMapper;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SpecialFinancingSideEffectMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetSpecialFinancingPageUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    public SpecialFinancingSideEffectMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetSpecialFinancingPageUseCase getSpecialFinancingPageUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper specialFinancingMapper, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSpecialFinancingPageUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        this.getHighSpeedVideoSizes = getSpecialFinancingPageUseCase;
        this.getHighSpeedVideoFpsRanges = specialFinancingMapper;
        this.getHighSpeedVideoFpsRangesFor = creditProductIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState specialFinancingState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(specialFinancingState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState specialFinancingState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (specialFinancingState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Loading) {
            java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(function1, continuation);
            return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
        }
        if (specialFinancingState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.InitializingUiModel) {
            java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.InitializingUiModel) specialFinancingState, function1, continuation);
            return highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges : kotlin.Unit.INSTANCE;
        }
        if (!(specialFinancingState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Ready)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes((com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Ready) specialFinancingState, function1, continuation);
        return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, 0, new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$loadInitialPage$2(function1, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$loadInitialPage$3(function1, null), continuation);
        return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.InitializingUiModel initializingUiModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$mapToUiModel$1 specialFinancingSideEffectMiddleware$mapToUiModel$1;
        int i;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> list;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.CategorizedSpecialFinancingItems categorizedSpecialFinancingItems;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$mapToUiModel$1) {
            specialFinancingSideEffectMiddleware$mapToUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$mapToUiModel$1) continuation;
            if ((specialFinancingSideEffectMiddleware$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                specialFinancingSideEffectMiddleware$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = specialFinancingSideEffectMiddleware$mapToUiModel$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = specialFinancingSideEffectMiddleware$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> promotionalActivities = initializingUiModel.getPage().getPromotionalActivities();
                    if (promotionalActivities == null) {
                        promotionalActivities = kotlin.collections.CollectionsKt.emptyList();
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper specialFinancingMapper = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.getHighSpeedVideoFpsRangesFor;
                    specialFinancingSideEffectMiddleware$mapToUiModel$1.Camera2StreamConfigurationMap = initializingUiModel;
                    specialFinancingSideEffectMiddleware$mapToUiModel$1.getHighSpeedVideoFpsRangesFor = function1;
                    specialFinancingSideEffectMiddleware$mapToUiModel$1.getHighSpeedVideoFpsRanges = promotionalActivities;
                    specialFinancingSideEffectMiddleware$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    java.lang.Object categorizeItems = specialFinancingMapper.categorizeItems(promotionalActivities, creditProductIdentifier, specialFinancingSideEffectMiddleware$mapToUiModel$1);
                    if (categorizeItems == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = promotionalActivities;
                    obj = categorizeItems;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity> list2 = (java.util.List) specialFinancingSideEffectMiddleware$mapToUiModel$1.getHighSpeedVideoFpsRanges;
                    function1 = (kotlin.jvm.functions.Function1) specialFinancingSideEffectMiddleware$mapToUiModel$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.InitializingUiModel initializingUiModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.InitializingUiModel) specialFinancingSideEffectMiddleware$mapToUiModel$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    list = list2;
                    initializingUiModel = initializingUiModel2;
                }
                categorizedSpecialFinancingItems = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.CategorizedSpecialFinancingItems) obj;
                if (categorizedSpecialFinancingItems.getExpiring().isEmpty() || !categorizedSpecialFinancingItems.getActive().isEmpty() || !categorizedSpecialFinancingItems.getPaidOff().isEmpty()) {
                    function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnUiModelInitialized(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingUiModel(categorizedSpecialFinancingItems.getExpiring(), categorizedSpecialFinancingItems.getActive(), categorizedSpecialFinancingItems.getPaidOff(), com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.INSTANCE.create(initializingUiModel.getPage().getHasNextPage(), initializingUiModel.getPage().getNextOffset())), new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs(this.getHighSpeedVideoFpsRangesFor, list, this.getHighResolutionOutputSizeshNQ4ISI, (java.lang.String) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                } else {
                    function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnNoSpecialFinancingPlans.INSTANCE);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        specialFinancingSideEffectMiddleware$mapToUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$mapToUiModel$1(this, continuation);
        java.lang.Object obj2 = specialFinancingSideEffectMiddleware$mapToUiModel$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = specialFinancingSideEffectMiddleware$mapToUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        categorizedSpecialFinancingItems = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.CategorizedSpecialFinancingItems) obj2;
        if (categorizedSpecialFinancingItems.getExpiring().isEmpty()) {
        }
        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnUiModelInitialized(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingUiModel(categorizedSpecialFinancingItems.getExpiring(), categorizedSpecialFinancingItems.getActive(), categorizedSpecialFinancingItems.getPaidOff(), com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.INSTANCE.create(initializingUiModel.getPage().getHasNextPage(), initializingUiModel.getPage().getNextOffset())), new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs(this.getHighSpeedVideoFpsRangesFor, list, this.getHighResolutionOutputSizeshNQ4ISI, (java.lang.String) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Ready ready, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel paginationState = ready.getUiModel().getPaginationState();
        if (!(paginationState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.ShouldLoadMore)) {
            return kotlin.Unit.INSTANCE;
        }
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnLoadingMorePromotionalActivities.INSTANCE);
        java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(ready.getSpecialFinancingArgs().getCreditProductIdentifier(), ready.getSpecialFinancingArgs().getCreditAccountId(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.ShouldLoadMore) paginationState).getNextOffset().intValue(), new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$handlePagination$2(this, function1, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$handlePagination$3(function1, paginationState, null), continuation);
        return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00fa, code lost:
    
        if (r12.invoke(r3, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x014c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0140, code lost:
    
        if (r13.invoke(r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        if (r2 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, int i, kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$loadPage$1 specialFinancingSideEffectMiddleware$loadPage$1;
        int i2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.SpecialFinancingRequest specialFinancingRequest;
        java.lang.Object invoke;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$loadPage$1) {
            specialFinancingSideEffectMiddleware$loadPage$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$loadPage$1) continuation;
            if ((specialFinancingSideEffectMiddleware$loadPage$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                specialFinancingSideEffectMiddleware$loadPage$1.getOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = specialFinancingSideEffectMiddleware$loadPage$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = specialFinancingSideEffectMiddleware$loadPage$1.getOutputSizeshNQ4ISI;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    specialFinancingRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.SpecialFinancingRequest(creditProductIdentifier, str, i);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetSpecialFinancingPageUseCase getSpecialFinancingPageUseCase = this.getHighSpeedVideoSizes;
                    specialFinancingSideEffectMiddleware$loadPage$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    specialFinancingSideEffectMiddleware$loadPage$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    specialFinancingSideEffectMiddleware$loadPage$1.getInputSizeshNQ4ISI = function2;
                    specialFinancingSideEffectMiddleware$loadPage$1.getOutputFormats = function1;
                    specialFinancingSideEffectMiddleware$loadPage$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(specialFinancingRequest);
                    specialFinancingSideEffectMiddleware$loadPage$1.getHighResolutionOutputSizeshNQ4ISI = i;
                    specialFinancingSideEffectMiddleware$loadPage$1.getOutputSizeshNQ4ISI = 1;
                    invoke = getSpecialFinancingPageUseCase.invoke(specialFinancingRequest, specialFinancingSideEffectMiddleware$loadPage$1);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            int i3 = specialFinancingSideEffectMiddleware$loadPage$1.getHighSpeedVideoSizes;
                            int i4 = specialFinancingSideEffectMiddleware$loadPage$1.getHighSpeedVideoFpsRanges;
                            int i5 = specialFinancingSideEffectMiddleware$loadPage$1.getHighResolutionOutputSizeshNQ4ISI;
                        } else {
                            if (i2 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i6 = specialFinancingSideEffectMiddleware$loadPage$1.getHighSpeedVideoSizes;
                            int i7 = specialFinancingSideEffectMiddleware$loadPage$1.getHighSpeedVideoFpsRanges;
                            int i8 = specialFinancingSideEffectMiddleware$loadPage$1.getHighResolutionOutputSizeshNQ4ISI;
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    i = specialFinancingSideEffectMiddleware$loadPage$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.request.SpecialFinancingRequest specialFinancingRequest2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.SpecialFinancingRequest) specialFinancingSideEffectMiddleware$loadPage$1.getOutputMinFrameDuration;
                    function1 = (kotlin.jvm.functions.Function1) specialFinancingSideEffectMiddleware$loadPage$1.getOutputFormats;
                    function2 = (kotlin.jvm.functions.Function2) specialFinancingSideEffectMiddleware$loadPage$1.getInputSizeshNQ4ISI;
                    str = (java.lang.String) specialFinancingSideEffectMiddleware$loadPage$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) specialFinancingSideEffectMiddleware$loadPage$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    specialFinancingRequest = specialFinancingRequest2;
                    creditProductIdentifier = creditProductIdentifier2;
                    invoke = obj;
                }
                either = ((arrow.core.Ior) invoke).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage specialFinancingPage = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingPage) ((arrow.core.Either.Right) either).getValue();
                    specialFinancingSideEffectMiddleware$loadPage$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    specialFinancingSideEffectMiddleware$loadPage$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    specialFinancingSideEffectMiddleware$loadPage$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function2);
                    specialFinancingSideEffectMiddleware$loadPage$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                    specialFinancingSideEffectMiddleware$loadPage$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(specialFinancingRequest);
                    specialFinancingSideEffectMiddleware$loadPage$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    specialFinancingSideEffectMiddleware$loadPage$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(specialFinancingPage);
                    specialFinancingSideEffectMiddleware$loadPage$1.getHighResolutionOutputSizeshNQ4ISI = i;
                    specialFinancingSideEffectMiddleware$loadPage$1.getHighSpeedVideoFpsRanges = 0;
                    specialFinancingSideEffectMiddleware$loadPage$1.getHighSpeedVideoSizes = 0;
                    specialFinancingSideEffectMiddleware$loadPage$1.getOutputSizeshNQ4ISI = 2;
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingError specialFinancingError = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.specialfinancing.SpecialFinancingError) ((arrow.core.Either.Left) either).getValue();
                    specialFinancingSideEffectMiddleware$loadPage$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    specialFinancingSideEffectMiddleware$loadPage$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    specialFinancingSideEffectMiddleware$loadPage$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function2);
                    specialFinancingSideEffectMiddleware$loadPage$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                    specialFinancingSideEffectMiddleware$loadPage$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(specialFinancingRequest);
                    specialFinancingSideEffectMiddleware$loadPage$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    specialFinancingSideEffectMiddleware$loadPage$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(specialFinancingError);
                    specialFinancingSideEffectMiddleware$loadPage$1.getHighResolutionOutputSizeshNQ4ISI = i;
                    specialFinancingSideEffectMiddleware$loadPage$1.getHighSpeedVideoFpsRanges = 0;
                    specialFinancingSideEffectMiddleware$loadPage$1.getHighSpeedVideoSizes = 0;
                    specialFinancingSideEffectMiddleware$loadPage$1.getOutputSizeshNQ4ISI = 3;
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        specialFinancingSideEffectMiddleware$loadPage$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingSideEffectMiddleware$loadPage$1(this, continuation);
        java.lang.Object obj2 = specialFinancingSideEffectMiddleware$loadPage$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = specialFinancingSideEffectMiddleware$loadPage$1.getOutputSizeshNQ4ISI;
        if (i2 != 0) {
        }
        either = ((arrow.core.Ior) invoke).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
