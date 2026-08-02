package com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel$loadBankAccounts$2", f = "ChooseAccountsViewModel.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"aggregator", "params"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class ChooseAccountsViewModel$loadBankAccounts$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        com.paypal.oslo.feature.wallet.banks.domain.usecase.GetExternalBankAccountsUseCase getExternalBankAccountsUseCase;
        java.lang.Object invoke;
        java.lang.String str7;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> entries = com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.getEntries();
            com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel chooseAccountsViewModel = this.Camera2StreamConfigurationMap;
            java.util.Iterator<E> it = entries.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                java.lang.String name2 = ((com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator) obj2).name();
                str7 = chooseAccountsViewModel.getHighSpeedVideoFpsRangesFor;
                if (kotlin.jvm.internal.Intrinsics.areEqual(name2, str7)) {
                    break;
                }
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator) obj2;
            if (bankAggregator == null) {
                bankAggregator = com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.FINICITY;
            }
            str = this.Camera2StreamConfigurationMap.getOutputFormats;
            str2 = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
            str3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor;
            com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsParams externalBankAccountsParams = new com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsParams(bankAggregator, str, str2, str3, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
            str4 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor;
            java.util.Map<java.lang.String, ? extends java.lang.Object> mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("externalBankId", str4));
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            str5 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            pairArr[0] = kotlin.TuplesKt.to("aggregator", str5);
            str6 = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
            pairArr[1] = kotlin.TuplesKt.to("hasCredentialToken", java.lang.String.valueOf(str6.length() > 0));
            logger.i("[ChooseAccounts] Fetching bank accounts", kotlin.collections.MapsKt.mapOf(pairArr), mapOf);
            getExternalBankAccountsUseCase = this.Camera2StreamConfigurationMap.getInputFormats;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bankAggregator);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(externalBankAccountsParams);
            this.getHighSpeedVideoFpsRangesFor = 1;
            invoke = getExternalBankAccountsUseCase.invoke(externalBankAccountsParams, this);
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
        arrow.core.Ior ior = (arrow.core.Ior) invoke;
        if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel.access$handleSuccess(this.Camera2StreamConfigurationMap, (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsResult) ((arrow.core.Ior.Right) ior).getValue());
        } else if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel.access$handleError(this.Camera2StreamConfigurationMap, (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) ((arrow.core.Ior.Left) ior).getValue());
        } else {
            if (!(ior instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel.access$handleSuccess(this.Camera2StreamConfigurationMap, (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsResult) both.getRightValue());
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "[ChooseAccounts] Partial success with warnings", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) both.getLeftValue()).toString())), null, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel$loadBankAccounts$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel$loadBankAccounts$2(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChooseAccountsViewModel$loadBankAccounts$2(com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel chooseAccountsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel$loadBankAccounts$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = chooseAccountsViewModel;
    }
}
