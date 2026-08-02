package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$AmountInputScreen$1$1", f = "AmountInputScreen.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class AmountInputScreenKt$AmountInputScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "submitData", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/AmountInputSubmitData;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$AmountInputScreen$1$1$1", f = "AmountInputScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$AmountInputScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState> Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData, kotlin.Unit> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType;
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData amountInputSubmitData = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState access$AmountInputScreen$lambda$8 = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.access$AmountInputScreen$lambda$8(this.Camera2StreamConfigurationMap);
            java.lang.String calculateStartDate = access$AmountInputScreen$lambda$8 != null ? com.paypal.oslo.feature.savings.common.FrequencyDisplayUtilsKt.calculateStartDate(access$AmountInputScreen$lambda$8) : null;
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState access$AmountInputScreen$lambda$82 = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.access$AmountInputScreen$lambda$8(this.Camera2StreamConfigurationMap);
            if (access$AmountInputScreen$lambda$82 == null || (frequencyType = access$AmountInputScreen$lambda$82.getSelectedFrequency()) == null) {
                frequencyType = com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.ONE_TIME;
            }
            function1.invoke(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData.copy$default(amountInputSubmitData, null, this.getHighSpeedVideoFpsRanges, frequencyType, calculateStartDate, null, 17, null));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData amountInputSubmitData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$AmountInputScreen$1$1.AnonymousClass1) create(amountInputSubmitData, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$AmountInputScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$AmountInputScreen$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData, kotlin.Unit> function1, java.lang.String str, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$AmountInputScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = function1;
            this.getHighSpeedVideoFpsRanges = str;
            this.Camera2StreamConfigurationMap = mutableState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRanges.getSubmitEvent(), new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$AmountInputScreen$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$AmountInputScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$AmountInputScreen$1$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AmountInputScreenKt$AmountInputScreen$1$1(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData, kotlin.Unit> function1, java.lang.String str, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$AmountInputScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = amountInputViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
    }
}
