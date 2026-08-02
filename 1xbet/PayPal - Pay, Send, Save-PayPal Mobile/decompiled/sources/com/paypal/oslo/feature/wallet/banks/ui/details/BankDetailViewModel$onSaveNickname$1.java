package com.paypal.oslo.feature.wallet.banks.ui.details;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel$onSaveNickname$1", f = "BankDetailViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m = "invokeSuspend", n = {}, nl = {192}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class BankDetailViewModel$onSaveNickname$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.wallet.banks.domain.usecase.UpdateBankAccountNicknameUseCase updateBankAccountNicknameUseCase;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        android.content.Context context;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow7;
        com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailInfo copy;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor;
            mutableStateFlow.setValue(null);
            mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
            mutableStateFlow2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Saving bank account nickname", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountId", this.getHighSpeedVideoFpsRangesFor.getBankAccountId()), kotlin.TuplesKt.to("hasNickname", java.lang.String.valueOf(!kotlin.text.StringsKt.isBlank(this.getHighSpeedVideoFpsRanges)))), null, 4, null);
            updateBankAccountNicknameUseCase = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            invoke = updateBankAccountNicknameUseCase.invoke(this.getHighSpeedVideoFpsRangesFor.getBankAccountId(), this.getHighSpeedVideoFpsRanges, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel bankDetailViewModel = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Successfully updated bank account nickname", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountId", bankDetailViewModel.getBankAccountId())), null, 4, null);
            mutableStateFlow5 = bankDetailViewModel.getOutputFormats;
            com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState bankDetailUiState = (com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState) mutableStateFlow5.getValue();
            if (bankDetailUiState instanceof com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Success) {
                java.lang.String str2 = str;
                java.lang.String str3 = kotlin.text.StringsKt.isBlank(str2) ? null : str2;
                mutableStateFlow7 = bankDetailViewModel.getOutputFormats;
                copy = r7.copy((r22 & 1) != 0 ? r7.banners : null, (r22 & 2) != 0 ? r7.bankIcon : null, (r22 & 4) != 0 ? r7.iconDescription : null, (r22 & 8) != 0 ? r7.bankImageUrl : null, (r22 & 16) != 0 ? r7.bankName : null, (r22 & 32) != 0 ? r7.nickname : str3, (r22 & 64) != 0 ? r7.accountType : null, (r22 & 128) != 0 ? r7.routingNumber : null, (r22 & 256) != 0 ? r7.accountNumber : null, (r22 & 512) != 0 ? ((com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Success) bankDetailUiState).getData().confirmationStatus : null);
                mutableStateFlow7.setValue(new com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailUiState.Success(copy));
            }
            mutableStateFlow6 = bankDetailViewModel.getOutputMinFrameDuration;
            mutableStateFlow6.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to update bank account nickname", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountId", bankDetailViewModel.getBankAccountId()), kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError) ((arrow.core.Either.Left) either).getValue()).toString())), null, null, 12, null);
            mutableStateFlow3 = bankDetailViewModel.getHighSpeedVideoSizesFor;
            context = bankDetailViewModel.getHighSpeedVideoSizes;
            mutableStateFlow3.setValue(context.getString(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_something_went_wrong_please_try_again));
            mutableStateFlow4 = bankDetailViewModel.getOutputMinFrameDuration;
            mutableStateFlow4.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel$onSaveNickname$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel$onSaveNickname$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankDetailViewModel$onSaveNickname$1(com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel bankDetailViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailViewModel$onSaveNickname$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = bankDetailViewModel;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
