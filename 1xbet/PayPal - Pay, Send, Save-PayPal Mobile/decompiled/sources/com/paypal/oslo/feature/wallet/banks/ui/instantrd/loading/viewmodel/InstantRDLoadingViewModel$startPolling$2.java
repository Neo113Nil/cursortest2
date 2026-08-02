package com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel$startPolling$2", f = "InstantRDLoadingViewModel.kt", i = {0, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 205, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "invokeSuspend", n = {"exitEmitted", "result", "exitEmitted"}, nl = {193, 206, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE}, s = {"Z$0", "L$0", "Z$0"}, v = 2)
/* loaded from: classes15.dex */
final class InstantRDLoadingViewModel$startPolling$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
    
        if (r2 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005e, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(3000, r20) != r1) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x013f -> B:23:0x0060). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i;
        boolean z;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value;
        int i2;
        int i3;
        com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase getBankAccountDetailsUseCase;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        int i4;
        int i5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object obj2 = null;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    invoke = obj;
                    arrow.core.Either either = (arrow.core.Either) invoke;
                    if (either instanceof arrow.core.Either.Right) {
                        arrow.core.Either.Right right = (arrow.core.Either.Right) either;
                        boolean access$evaluateAndEmitIfTerminal = com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.access$evaluateAndEmitIfTerminal(this.getOutputFormats, (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails) right.getValue());
                        if (access$evaluateAndEmitIfTerminal) {
                            return kotlin.Unit.INSTANCE;
                        }
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[3];
                        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation confirmation = ((com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails) right.getValue()).getConfirmation();
                        pairArr[0] = kotlin.TuplesKt.to("rtpStatus", confirmation != null ? confirmation.getRealTimePaymentsDepositStatus() : null);
                        i4 = this.getOutputFormats.getOutputMinFrameDuration;
                        pairArr[1] = kotlin.TuplesKt.to("attempt", kotlin.coroutines.jvm.internal.Boxing.boxInt(i4));
                        i5 = this.getOutputFormats.getOutputMinFrameDuration;
                        pairArr[2] = kotlin.TuplesKt.to("remainingAttempts", kotlin.coroutines.jvm.internal.Boxing.boxLong(10 - i5));
                        com.paypal.android.logger.Logger.d$default(logger, "No exit condition met, continuing to poll", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        this.getHighResolutionOutputSizeshNQ4ISI = access$evaluateAndEmitIfTerminal;
                        this.getHighSpeedVideoFpsRangesFor = 3;
                        if (kotlinx.coroutines.DelayKt.delay(3000L, this) != coroutine_suspended) {
                            obj2 = null;
                        }
                        return coroutine_suspended;
                    }
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError bankAccountDetailsError = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Error fetching bank account details during polling", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(bankAccountDetailsError.getClass()).getSimpleName())), null, 4, null);
                    mutableStateFlow3 = this.getOutputFormats.getHighSpeedVideoSizes;
                    mutableStateFlow3.setValue(new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Error(bankAccountDetailsError.toString()));
                    return kotlin.Unit.INSTANCE;
                }
                if (i6 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails = this.Camera2StreamConfigurationMap;
            if (bankAccountDetails != null) {
                boolean access$evaluateAndEmitIfTerminal2 = com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.access$evaluateAndEmitIfTerminal(this.getOutputFormats, bankAccountDetails);
                if (access$evaluateAndEmitIfTerminal2) {
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Initial details present but no terminal condition — entering polling loop", null, null, 6, null);
                this.getHighResolutionOutputSizeshNQ4ISI = access$evaluateAndEmitIfTerminal2;
                this.getHighSpeedVideoFpsRangesFor = 1;
            }
        }
        i = this.getOutputFormats.getOutputMinFrameDuration;
        if (i < 10) {
            i2 = this.getOutputFormats.getOutputMinFrameDuration;
            this.getOutputFormats.getOutputMinFrameDuration = i2 + 1;
            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
            i3 = this.getOutputFormats.getOutputMinFrameDuration;
            com.paypal.android.logger.Logger.d$default(logger2, "Polling attempt started", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attempt", kotlin.coroutines.jvm.internal.Boxing.boxInt(i3)), kotlin.TuplesKt.to("maxAttempts", kotlin.coroutines.jvm.internal.Boxing.boxLong(10L))), null, 4, null);
            getBankAccountDetailsUseCase = this.getOutputFormats.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = obj2;
            this.getHighSpeedVideoFpsRangesFor = 2;
            invoke = getBankAccountDetailsUseCase.invoke(this.getHighSpeedVideoFpsRanges, this);
        } else {
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            z = this.getOutputFormats.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions randomDepositInstructions = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions(str, z, this.Camera2StreamConfigurationMap);
            mutableStateFlow = this.getOutputFormats.getHighSpeedVideoSizes;
            mutableStateFlow.setValue(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.RtpDepositState.Timeout.INSTANCE);
            mutableStateFlow2 = this.getOutputFormats.Camera2StreamConfigurationMap;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.NavigateTo.NextScreen(randomDepositInstructions)));
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Timeout state set - navigating to instruction screen", null, null, 6, null);
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel$startPolling$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel$startPolling$2(this.Camera2StreamConfigurationMap, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstantRDLoadingViewModel$startPolling$2(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel instantRDLoadingViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel$startPolling$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = bankAccountDetails;
        this.getOutputFormats = instantRDLoadingViewModel;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
