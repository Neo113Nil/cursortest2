package com.paypal.oslo.feature.businesshome.ui.home;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel$dismissEngagementCard$1", f = "BusinessHomeViewModel.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, nl = {203}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BusinessHomeViewModel$dismissEngagementCard$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.businesshome.domain.usecase.DismissEngagementCardUseCase dismissEngagementCardUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Success success;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                dismissEngagementCardUseCase = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (com.paypal.oslo.feature.businesshome.domain.usecase.DismissEngagementCardUseCase.invoke$default(dismissEngagementCardUseCase, this.Camera2StreamConfigurationMap, 0L, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            mutableStateFlow = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            java.lang.String str = this.Camera2StreamConfigurationMap;
            do {
                value = mutableStateFlow.getValue();
                success = (com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState) value;
                if (success instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Success) {
                    java.util.List<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card> cards = ((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Success) success).getData().getCards();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(cards, 10));
                    for (com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.EngagementCards engagementCards : cards) {
                        if (engagementCards instanceof com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.EngagementCards) {
                            java.util.List<com.paypal.oslo.feature.businesshome.ui.home.EngagementCardUiData> data = ((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.EngagementCards) engagementCards).getData();
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            for (java.lang.Object obj2 : data) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.businesshome.ui.home.EngagementCardUiData) obj2).getId(), str)) {
                                    arrayList2.add(obj2);
                                }
                            }
                            engagementCards = new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.EngagementCards(arrayList2, null, 2, null);
                        }
                        arrayList.add(engagementCards);
                    }
                    success = new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Success(((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Success) success).getData().copy(arrayList));
                }
            } while (!mutableStateFlow.compareAndSet(value, success));
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.businesshome.LoggerKt.log.e("Failed to dismiss engagement card", e);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel$dismissEngagementCard$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel$dismissEngagementCard$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessHomeViewModel$dismissEngagementCard$1(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel businessHomeViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel$dismissEngagementCard$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = businessHomeViewModel;
        this.Camera2StreamConfigurationMap = str;
    }
}
