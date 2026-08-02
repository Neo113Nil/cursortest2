package com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JD\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0086B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/aggregator/plaid/GetPlaidTokenUseCase;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/ExternalBankAccessRepository;", "externalBankAccessRepositoryImpl", "Landroid/content/Context;", "context", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/repository/ExternalBankAccessRepository;Landroid/content/Context;)V", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "action", "", "countryCode", "Ljava/util/Locale;", "locale", "instrumentId", "invoke", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/ExternalBankAccessRepository;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetPlaidTokenUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetPlaidTokenUseCase(com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository externalBankAccessRepository, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = externalBankAccessRepository;
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, java.lang.String str, java.util.Locale locale, java.lang.String str2, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase$invoke$1 getPlaidTokenUseCase$invoke$1;
        int i;
        java.lang.String str3;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError externalBankAccessError;
        java.lang.String str4;
        java.lang.String access$toStringError;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase$invoke$1) {
            getPlaidTokenUseCase$invoke$1 = (com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase$invoke$1) continuation;
            if ((getPlaidTokenUseCase$invoke$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                getPlaidTokenUseCase$invoke$1.getOutputMinFrameDuration -= 2147483648;
                com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase$invoke$1 getPlaidTokenUseCase$invoke$12 = getPlaidTokenUseCase$invoke$1;
                java.lang.Object obj = getPlaidTokenUseCase$invoke$12.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getPlaidTokenUseCase$invoke$12.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if ((externalBankAccessAction == com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.RECONSENT || externalBankAccessAction == com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.CONFIRM) && ((str3 = str2) == null || str3.length() == 0)) {
                        throw new java.lang.IllegalArgumentException("Instrument ID is required for RECONSENT/CONFIRM.".toString());
                    }
                    com.paypal.oslo.feature.wallet.banks.domain.model.InitiateExternalBankAccessParams initiateExternalBankAccessParams = new com.paypal.oslo.feature.wallet.banks.domain.model.InitiateExternalBankAccessParams(externalBankAccessAction, com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.PLAID, str, locale, null, str2, null, addFIFlow, false, this.getHighSpeedVideoFpsRangesFor.getPackageName(), 336, null);
                    com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository externalBankAccessRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    getPlaidTokenUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addFIFlow);
                    getPlaidTokenUseCase$invoke$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(externalBankAccessAction);
                    getPlaidTokenUseCase$invoke$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    getPlaidTokenUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                    getPlaidTokenUseCase$invoke$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    getPlaidTokenUseCase$invoke$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(initiateExternalBankAccessParams);
                    getPlaidTokenUseCase$invoke$12.getOutputMinFrameDuration = 1;
                    obj = externalBankAccessRepository.initiateExternalBankAccess(initiateExternalBankAccessParams, getPlaidTokenUseCase$invoke$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                externalBankAccessError = null;
                externalBankAccessError = null;
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError externalBankAccessError2 = (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) ior.leftOrNull();
                    com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessResult externalBankAccessResult = (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessResult) ior.getOrNull();
                    str4 = externalBankAccessResult != null ? externalBankAccessResult.getExternalReferenceId() : null;
                    externalBankAccessError = externalBankAccessError2;
                } else if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessResult externalBankAccessResult2 = (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessResult) ior.getOrNull();
                    str4 = externalBankAccessResult2 != null ? externalBankAccessResult2.getExternalReferenceId() : null;
                } else {
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    externalBankAccessError = (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) ior.leftOrNull();
                    str4 = null;
                }
                if (externalBankAccessError != null && (access$toStringError = com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCaseKt.access$toStringError(externalBankAccessError)) != null) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, access$toStringError, null, null, null, 14, null);
                }
                return str4;
            }
        }
        getPlaidTokenUseCase$invoke$1 = new com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase$invoke$1(this, continuation);
        com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase$invoke$1 getPlaidTokenUseCase$invoke$122 = getPlaidTokenUseCase$invoke$1;
        java.lang.Object obj2 = getPlaidTokenUseCase$invoke$122.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getPlaidTokenUseCase$invoke$122.getOutputMinFrameDuration;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        externalBankAccessError = null;
        externalBankAccessError = null;
        if (!(ior instanceof arrow.core.Ior.Both)) {
        }
        if (externalBankAccessError != null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, access$toStringError, null, null, null, 14, null);
        }
        return str4;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase getPlaidTokenUseCase, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, java.lang.String str, java.util.Locale locale, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            addFIFlow = com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET;
        }
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow2 = addFIFlow;
        if ((i & 2) != 0) {
            externalBankAccessAction = com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.ADD;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction2 = externalBankAccessAction;
        if ((i & 4) != 0) {
            str = "US";
        }
        java.lang.String str3 = str;
        if ((i & 8) != 0) {
            locale = java.util.Locale.ENGLISH;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        return getPlaidTokenUseCase.invoke(addFIFlow2, externalBankAccessAction2, str3, locale, str2, continuation);
    }
}
