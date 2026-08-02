package com.paypal.oslo.feature.taptopay.ui.paymode;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeCardListForPromoData$1", f = "PayModeActivity.kt", i = {}, l = {313}, m = "invokeSuspend", n = {}, nl = {com.visa.cbp.getCertUsage.setAucAID}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PayModeActivity$observeCardListForPromoData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeCardListForPromoData$1$1", f = "PayModeActivity.kt", i = {}, l = {314}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeCardListForPromoData$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity Camera2StreamConfigurationMap;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState> state = com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.access$getViewModel(this.Camera2StreamConfigurationMap).getState();
                final com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoSizes = 1;
                if (state.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.observeCardListForPromoData.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> cardList;
                        com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState payModeDataState = (com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState) obj2;
                        com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState uiState = payModeDataState != null ? payModeDataState.getUiState() : null;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(uiState, com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.ReadyForPaymentState.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(uiState, com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.ReadyForSecondTap.INSTANCE)) {
                            com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.access$getPromoCardViewModel(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.this).hidePromoCard$taptopay_prodRelease();
                            return kotlin.Unit.INSTANCE;
                        }
                        if (payModeDataState == null || (cardList = payModeDataState.getCardList()) == null) {
                            return kotlin.Unit.INSTANCE;
                        }
                        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> list = cardList;
                        boolean z = true;
                        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                            java.util.Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo = ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) it.next()).getCardInfo();
                                if ((cardInfo != null ? cardInfo.getType() : null) == com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayLaterToGo) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        if (!cardList.isEmpty() && z && com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.access$getPromoCardViewModel(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.this).isPromoCardVisible().getValue().booleanValue()) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayModeActivity loading promo data", null, null, 6, null);
                            com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.access$getPromoCardViewModel(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.this).loadPromoData();
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeCardListForPromoData$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeCardListForPromoData$1.AnonymousClass1(this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeCardListForPromoData$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = payModeActivity;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (androidx.view.RepeatOnLifecycleKt.repeatOnLifecycle(this.getHighSpeedVideoFpsRanges, androidx.lifecycle.Lifecycle.State.STARTED, new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeCardListForPromoData$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeCardListForPromoData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeCardListForPromoData$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayModeActivity$observeCardListForPromoData$1(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeCardListForPromoData$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = payModeActivity;
    }
}
