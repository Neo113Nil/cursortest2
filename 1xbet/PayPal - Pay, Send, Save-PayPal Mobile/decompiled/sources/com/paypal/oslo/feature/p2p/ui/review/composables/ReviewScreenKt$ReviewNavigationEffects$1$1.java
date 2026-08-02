package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ReviewNavigationEffects$1$1", f = "ReviewScreen.kt", i = {}, l = {1089}, m = "invokeSuspend", n = {}, nl = {1127}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ReviewScreenKt$ReviewNavigationEffects$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.domain.model.FundingSource, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function4<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult, com.paypal.oslo.feature.p2p.domain.model.Amount, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, java.lang.String, kotlin.Unit> getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels getInputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent, kotlin.Unit> getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel getOutputMinFrameDuration;
    int getOutputStallDuration;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/ReviewEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ReviewNavigationEffects$1$1$1", f = "ReviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ReviewNavigationEffects$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.domain.model.FundingSource, kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoSizesFor;
        final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels getInputFormats;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent, kotlin.Unit> getInputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getOutputFormats;
        final /* synthetic */ kotlin.jvm.functions.Function4<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult, com.paypal.oslo.feature.p2p.domain.model.Amount, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, java.lang.String, kotlin.Unit> getOutputMinFrameDuration;
        int getOutputStallDurationlomOqCM;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect reviewEffect = (com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect) this.getOutputFormats;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getOutputStallDurationlomOqCM != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (reviewEffect instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateBack) {
                this.getHighSpeedVideoFpsRangesFor.invoke();
            } else if (reviewEffect instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToConversionOptions) {
                this.getHighSpeedVideoFpsRanges.invoke();
            } else if (reviewEffect instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSearchContacts) {
                this.getInputSizeshNQ4ISI.invoke(((com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSearchContacts) reviewEffect).getIntent());
            } else if (reviewEffect instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSuccess) {
                kotlin.jvm.functions.Function4<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult, com.paypal.oslo.feature.p2p.domain.model.Amount, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, java.lang.String, kotlin.Unit> function4 = this.getOutputMinFrameDuration;
                com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSuccess navigateToSuccess = (com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToSuccess) reviewEffect;
                com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult result = navigateToSuccess.getResult();
                com.paypal.oslo.feature.p2p.domain.model.Amount transferAmount = navigateToSuccess.getTransferAmount();
                com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem contact = navigateToSuccess.getContact();
                com.paypal.oslo.feature.p2p.domain.model.NoteDetails savedNoteDetails = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$ReviewNavigationEffects$lambda$0(this.getHighResolutionOutputSizeshNQ4ISI).getSavedNoteDetails();
                function4.invoke(result, transferAmount, contact, savedNoteDetails != null ? savedNoteDetails.getMemo() : null);
            } else if (!(reviewEffect instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.ShowError)) {
                if (reviewEffect instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToNetworkError) {
                    this.getHighSpeedVideoSizes.invoke();
                } else if (reviewEffect instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToConfirmBank) {
                    this.Camera2StreamConfigurationMap.invoke(((com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.NavigateToConfirmBank) reviewEffect).getBankFundingSource());
                } else if (reviewEffect instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.FundingOptionsRefreshed) {
                    this.getInputFormats.getPaymentMethodAccordionViewModel().updateFundingOptions(((com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.FundingOptionsRefreshed) reviewEffect).getFundingOptions());
                } else {
                    if (!(reviewEffect instanceof com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.OpenDisclosureLink)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.getHighSpeedVideoSizesFor.invoke(((com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect.OpenDisclosureLink) reviewEffect).getLinkUrl());
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.p2p.ui.review.effects.ReviewEffect reviewEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ReviewNavigationEffects$1$1.AnonymousClass1) create(reviewEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ReviewNavigationEffects$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ReviewNavigationEffects$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getOutputFormats = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent, kotlin.Unit> function1, kotlin.jvm.functions.Function4<? super com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult, ? super com.paypal.oslo.feature.p2p.domain.model.Amount, ? super com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, ? super java.lang.String, kotlin.Unit> function4, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.domain.model.FundingSource, kotlin.Unit> function12, com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13, androidx.compose.runtime.State<com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ReviewNavigationEffects$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = function0;
            this.getHighSpeedVideoFpsRanges = function02;
            this.getInputSizeshNQ4ISI = function1;
            this.getOutputMinFrameDuration = function4;
            this.getHighSpeedVideoSizes = function03;
            this.Camera2StreamConfigurationMap = function12;
            this.getInputFormats = reviewScreenViewModels;
            this.getHighSpeedVideoSizesFor = function13;
            this.getHighResolutionOutputSizeshNQ4ISI = state;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputStallDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputStallDuration = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getOutputMinFrameDuration.getUiEffect(), new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ReviewNavigationEffects$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ReviewNavigationEffects$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ReviewNavigationEffects$1$1(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewScreenKt$ReviewNavigationEffects$1$1(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel reviewViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent, kotlin.Unit> function1, kotlin.jvm.functions.Function4<? super com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult, ? super com.paypal.oslo.feature.p2p.domain.model.Amount, ? super com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, ? super java.lang.String, kotlin.Unit> function4, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.domain.model.FundingSource, kotlin.Unit> function12, com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13, androidx.compose.runtime.State<com.paypal.oslo.feature.p2p.ui.review.state.NoteUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ReviewNavigationEffects$1$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = reviewViewModel;
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighSpeedVideoSizes = function02;
        this.getOutputFormats = function1;
        this.getInputFormats = function4;
        this.getHighSpeedVideoFpsRanges = function03;
        this.getHighResolutionOutputSizeshNQ4ISI = function12;
        this.getInputSizeshNQ4ISI = reviewScreenViewModels;
        this.getHighSpeedVideoSizesFor = function13;
        this.Camera2StreamConfigurationMap = state;
    }
}
