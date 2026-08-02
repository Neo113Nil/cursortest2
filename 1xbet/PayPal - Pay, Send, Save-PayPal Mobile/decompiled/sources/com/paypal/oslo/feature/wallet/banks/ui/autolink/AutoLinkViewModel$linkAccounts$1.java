package com.paypal.oslo.feature.wallet.banks.ui.autolink;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel$linkAccounts$1", f = "AutoLinkViewModel.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE}, m = "invokeSuspend", n = {"aggregator", "linkParams"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class AutoLinkViewModel$linkAccounts$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow;
        com.paypal.oslo.feature.wallet.banks.domain.usecase.LinkExternalBankAccountsUseCase linkExternalBankAccountsUseCase;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator access$resolveAggregator = com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel.access$resolveAggregator(this.getHighSpeedVideoFpsRanges);
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
            str = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            kotlin.Pair pair = kotlin.TuplesKt.to("aggregator", str);
            str2 = this.getHighSpeedVideoFpsRanges.getOutputFormats;
            com.paypal.android.logger.Logger.i$default(logger, "Linking bank accounts directly (OAuth2 flow)", kotlin.collections.MapsKt.mapOf(pair, kotlin.TuplesKt.to("external_bank_id", str2)), null, 4, null);
            str3 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor;
            str4 = this.getHighSpeedVideoFpsRanges.getOutputFormats;
            str5 = this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI;
            if (str5 == null) {
                str5 = this.getHighSpeedVideoFpsRanges.getOutputFormats;
            }
            java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
            integrationType = this.getHighSpeedVideoFpsRanges.getOutputSizes;
            addFIFlow = this.getHighSpeedVideoFpsRanges.getOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsParams linkExternalBankAccountsParams = new com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsParams(access$resolveAggregator, str3, this.getHighSpeedVideoFpsRangesFor, str4, str5, addFIFlow, null, emptyList, null, integrationType, null, 1344, null);
            linkExternalBankAccountsUseCase = this.getHighSpeedVideoFpsRanges.getOutputMinFrameDurationlomOqCM;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$resolveAggregator);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkExternalBankAccountsParams);
            this.Camera2StreamConfigurationMap = 1;
            invoke = linkExternalBankAccountsUseCase.invoke(linkExternalBankAccountsParams, this);
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
        if (!(ior instanceof arrow.core.Ior.Right)) {
            if (ior instanceof arrow.core.Ior.Left) {
                mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, new com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Outcome(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessErrorExtKt.toDisplayMessage((com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) ((arrow.core.Ior.Left) ior).getValue()), (java.lang.String) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null))));
            } else if (ior instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult) both.getRightValue(), (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) both.getLeftValue());
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Partial linking success with warnings", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("partial_error", ((com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) both.getLeftValue()).toString())), null, 4, null);
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult) ((arrow.core.Ior.Right) ior).getValue(), null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel$linkAccounts$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel$linkAccounts$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoLinkViewModel$linkAccounts$1(com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel autoLinkViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel$linkAccounts$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = autoLinkViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
