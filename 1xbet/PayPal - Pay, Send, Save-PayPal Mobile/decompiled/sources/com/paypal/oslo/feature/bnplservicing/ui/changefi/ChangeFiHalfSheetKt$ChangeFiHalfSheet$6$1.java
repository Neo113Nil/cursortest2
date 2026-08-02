package com.paypal.oslo.feature.bnplservicing.ui.changefi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetKt$ChangeFiHalfSheet$6$1", f = "ChangeFiHalfSheet.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, nl = {171}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class ChangeFiHalfSheetKt$ChangeFiHalfSheet$6$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function4<java.lang.Boolean, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel, java.lang.Boolean, java.util.List<com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel>, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel getInputFormats;
    int getOutputFormats;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetKt$ChangeFiHalfSheet$6$1$1", f = "ChangeFiHalfSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetKt$ChangeFiHalfSheet$6$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function4<java.lang.Boolean, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel, java.lang.Boolean, java.util.List<com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel>, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizes;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
        int getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect changeFiUiEffect = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect) this.getHighSpeedVideoSizesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getOutputMinFrameDuration != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (changeFiUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.DismissChangeFiHalfSheet) {
                com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.DismissChangeFiHalfSheet dismissChangeFiHalfSheet = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.DismissChangeFiHalfSheet) changeFiUiEffect;
                this.getHighSpeedVideoFpsRangesFor.invoke(dismissChangeFiHalfSheet.getNewFiAdded(), dismissChangeFiHalfSheet.getSelectedFundingInstrument(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(dismissChangeFiHalfSheet.getPaymentUpdated()), dismissChangeFiHalfSheet.getUpdatedFundingInstruments());
            } else if (changeFiUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToAddFundingInstrument) {
                this.getHighResolutionOutputSizeshNQ4ISI.invoke(((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToAddFundingInstrument) changeFiUiEffect).getType());
            } else if (changeFiUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateBackWithNewFiAdded) {
                this.getHighSpeedVideoSizes.hideSheet();
                this.getHighSpeedVideoFpsRangesFor.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateBackWithNewFiAdded) changeFiUiEffect).getNewFiAdded()), null, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false), kotlin.collections.CollectionsKt.emptyList());
            } else if (!(changeFiUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToUpdatePaymentMethodSuccess)) {
                if (!(changeFiUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.OpenAgreementLink)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.Camera2StreamConfigurationMap.invoke(((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.OpenAgreementLink) changeFiUiEffect).getUrl());
            } else {
                this.getHighSpeedVideoFpsRanges.setValue(((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToUpdatePaymentMethodSuccess) changeFiUiEffect).getUiModel());
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect changeFiUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetKt$ChangeFiHalfSheet$6$1.AnonymousClass1) create(changeFiUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetKt$ChangeFiHalfSheet$6$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetKt$ChangeFiHalfSheet$6$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getHighSpeedVideoSizesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel, ? super java.lang.Boolean, ? super java.util.List<com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel>, kotlin.Unit> function4, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType, kotlin.Unit> function1, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetKt$ChangeFiHalfSheet$6$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = function4;
            this.getHighResolutionOutputSizeshNQ4ISI = function1;
            this.getHighSpeedVideoSizes = bottomSheetController;
            this.Camera2StreamConfigurationMap = function12;
            this.getHighSpeedVideoFpsRanges = mutableState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputFormats = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getInputFormats.getUiEffect$bnpl_servicing_prodRelease(), new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetKt$ChangeFiHalfSheet$6$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetKt$ChangeFiHalfSheet$6$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetKt$ChangeFiHalfSheet$6$1(this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChangeFiHalfSheetKt$ChangeFiHalfSheet$6$1(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel, kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel, ? super java.lang.Boolean, ? super java.util.List<com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel>, kotlin.Unit> function4, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType, kotlin.Unit> function1, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.bnplservicing.ui.changefi.UpdatePaymentSuccessUiModel> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetKt$ChangeFiHalfSheet$6$1> continuation) {
        super(2, continuation);
        this.getInputFormats = changeFiViewModel;
        this.Camera2StreamConfigurationMap = function4;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRangesFor = bottomSheetController;
        this.getHighSpeedVideoSizes = function12;
        this.getHighSpeedVideoFpsRanges = mutableState;
    }
}
