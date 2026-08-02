package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveAmountUpdateSuccess$1$1", f = "ReviewScreen.kt", i = {}, l = {1797}, m = "invokeSuspend", n = {}, nl = {1817}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ReviewScreenKt$ObserveAmountUpdateSuccess$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/EditAmountEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveAmountUpdateSuccess$1$1$1", f = "ReviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveAmountUpdateSuccess$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect editAmountEffect = (com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect) this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!(editAmountEffect instanceof com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect.AmountUpdateSuccess)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect.AmountUpdateSuccess amountUpdateSuccess = (com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect.AmountUpdateSuccess) editAmountEffect;
            com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = amountUpdateSuccess.getFundingOptions();
            if (fundingOptions != null) {
                this.getHighSpeedVideoFpsRangesFor.getPaymentMethodAccordionViewModel().updateFundingOptions(fundingOptions);
            }
            if (amountUpdateSuccess.getFxQuote() != null) {
                this.getHighSpeedVideoFpsRangesFor.getCurrencyConversionViewModel().processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CacheFxQuote(amountUpdateSuccess.getFxQuote()));
            } else {
                this.getHighSpeedVideoFpsRangesFor.getCurrencyConversionViewModel().processEvent(com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ClearCachedFxQuote.INSTANCE);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect editAmountEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveAmountUpdateSuccess$1$1.AnonymousClass1) create(editAmountEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveAmountUpdateSuccess$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveAmountUpdateSuccess$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveAmountUpdateSuccess$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = reviewScreenViewModels;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRanges.getEditAmountViewModel().getUiEffect(), new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveAmountUpdateSuccess$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveAmountUpdateSuccess$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveAmountUpdateSuccess$1$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewScreenKt$ObserveAmountUpdateSuccess$1$1(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveAmountUpdateSuccess$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = reviewScreenViewModels;
    }
}
