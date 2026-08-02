package com.paypal.oslo.feature.wallet.banks.ui.details;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel$loadBankDetails$1", f = "BankDetailViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m = "invokeSuspend", n = {}, nl = {336}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class BankDetailViewModel$loadBankDetails$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankAccountDetailsUseCase getBankAccountDetailsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        android.content.Context context;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        android.content.Context context2;
        com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtil getBankBannersUiUtil;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getOutputFormats;
            mutableStateFlow.setValue(com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Loading.INSTANCE);
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Loading bank account details", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankInstrumentId", this.getHighSpeedVideoSizes)), 2, null);
            getBankAccountDetailsUseCase = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = getBankAccountDetailsUseCase.invoke(this.getHighSpeedVideoSizes, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        java.lang.String str = this.getHighSpeedVideoSizes;
        final com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel bankDetailViewModel = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails) ((arrow.core.Either.Right) either).getValue();
            com.paypal.oslo.feature.wallet.LoggerKt.log.i("Successfully loaded bank account details", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankName", bankAccountDetails.getIssuer().getName())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankInstrumentId", str)));
            mutableStateFlow3 = bankDetailViewModel.getOutputFormats;
            context2 = bankDetailViewModel.getHighSpeedVideoSizes;
            getBankBannersUiUtil = bankDetailViewModel.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow3.setValue(new com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Success(com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModelKt.access$toUiState(bankAccountDetails, context2, getBankBannersUiUtil, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel$loadBankDetails$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel$loadBankDetails$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel.this, (androidx.navigation3.runtime.NavKey) obj2);
                }
            })));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError bankAccountDetailsError = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to load bank account details", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", bankAccountDetailsError.toString())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankInstrumentId", str)), null, 8, null);
            mutableStateFlow2 = bankDetailViewModel.getOutputFormats;
            context = bankDetailViewModel.getHighSpeedVideoSizes;
            mutableStateFlow2.setValue(new com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Error(context.getString(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_details_error_loading)));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel bankDetailViewModel, androidx.navigation3.runtime.NavKey navKey) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        mutableStateFlow = bankDetailViewModel.getHighSpeedVideoFpsRanges;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, new com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailsNavigateState.NavigateTo(navKey)));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel$loadBankDetails$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel$loadBankDetails$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankDetailViewModel$loadBankDetails$1(com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel bankDetailViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel$loadBankDetails$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = bankDetailViewModel;
        this.getHighSpeedVideoSizes = str;
    }
}
