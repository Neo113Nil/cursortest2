package com.paypal.oslo.feature.wallet.banks.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/FetchAndUpdateForPlaidUseCase;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/ExternalBankAccessRepository;", "externalBankAccessRepository", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/repository/ExternalBankAccessRepository;)V", "", "credentialToken", "externalBankId", "bankName", "countryCode", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkExternalBankAccountsResult;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "p2", "p3", "p4", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/ExternalBankAccessRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FetchAndUpdateForPlaidUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public FetchAndUpdateForPlaidUseCase(com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository externalBankAccessRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessRepository, "");
        this.getHighSpeedVideoFpsRangesFor = externalBankAccessRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase fetchAndUpdateForPlaidUseCase, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = "US";
        }
        java.lang.String str5 = str4;
        if ((i & 16) != 0) {
            addFIFlow = com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET;
        }
        return fetchAndUpdateForPlaidUseCase.invoke(str, str2, str3, str5, addFIFlow, continuation);
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult> continuation) {
        com.paypal.oslo.feature.wallet.LoggerKt.log.i("[PlaidFetchAndUpdate] Starting fetch and update flow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankName", str3), kotlin.TuplesKt.to("countryCode", str4)), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("externalBankId", str2)));
        return getHighSpeedVideoFpsRanges(str, str2, str3, str4, addFIFlow, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult> continuation) {
        com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1 fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1;
        int i;
        com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult linkExternalBankAccountsResult;
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError externalBankAccessError;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> emptyList;
        java.lang.String bankLogoImageBase64;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1) {
            fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1 = (com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1) continuation;
            if ((fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsParams linkExternalBankAccountsParams = new com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsParams(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.PLAID, str4, str, str2, str3, addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode.FULL_MODE, kotlin.collections.CollectionsKt.emptyList(), null, null, com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType.TEMPORARY, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS, null);
                    com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository externalBankAccessRepository = this.getHighSpeedVideoFpsRangesFor;
                    fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                    fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addFIFlow);
                    fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkExternalBankAccountsParams);
                    fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1.getInputSizeshNQ4ISI = 1;
                    obj = externalBankAccessRepository.linkExternalBankAccounts(linkExternalBankAccountsParams, fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                arrow.core.Ior ior = (arrow.core.Ior) obj;
                linkExternalBankAccountsResult = (com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult) ior.getOrNull();
                externalBankAccessError = (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) ior.leftOrNull();
                if (linkExternalBankAccountsResult != null || (r3 = linkExternalBankAccountsResult.getLinkedAccounts()) == null) {
                    java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> emptyList2 = kotlin.collections.CollectionsKt.emptyList();
                }
                if (linkExternalBankAccountsResult != null || (emptyList = linkExternalBankAccountsResult.getFailedAccounts()) == null) {
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                }
                if (linkExternalBankAccountsResult != null || (r5 = linkExternalBankAccountsResult.getExistingAccounts()) == null) {
                    java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo> emptyList3 = kotlin.collections.CollectionsKt.emptyList();
                }
                bankLogoImageBase64 = linkExternalBankAccountsResult == null ? linkExternalBankAccountsResult.getBankLogoImageBase64() : null;
                if (bankLogoImageBase64 == null) {
                    bankLogoImageBase64 = "";
                }
                if (externalBankAccessError != null) {
                    emptyList = com.paypal.oslo.feature.wallet.banks.domain.model.ErrorExtensionsMapperKt.mapErrorTypes(emptyList, externalBankAccessError);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(externalBankAccessError.getClass()).getSimpleName();
                    com.paypal.android.logger.Logger.w$default(logger, "Error during Plaid fetch and update", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", simpleName != null ? simpleName : "")), null, 4, null);
                }
                return new com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult(kotlin.collections.CollectionsKt.plus((java.util.Collection) emptyList2, (java.lang.Iterable) com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCaseKt.access$toLinkedAccounts(emptyList3)), emptyList, kotlin.collections.CollectionsKt.emptyList(), bankLogoImageBase64);
            }
        }
        fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1 = new com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1(this, continuation);
        java.lang.Object obj2 = fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        arrow.core.Ior ior2 = (arrow.core.Ior) obj2;
        linkExternalBankAccountsResult = (com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult) ior2.getOrNull();
        externalBankAccessError = (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) ior2.leftOrNull();
        if (linkExternalBankAccountsResult != null) {
        }
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> emptyList22 = kotlin.collections.CollectionsKt.emptyList();
        if (linkExternalBankAccountsResult != null) {
        }
        emptyList = kotlin.collections.CollectionsKt.emptyList();
        if (linkExternalBankAccountsResult != null) {
        }
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo> emptyList32 = kotlin.collections.CollectionsKt.emptyList();
        if (linkExternalBankAccountsResult == null) {
        }
        if (bankLogoImageBase64 == null) {
        }
        if (externalBankAccessError != null) {
        }
        return new com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult(kotlin.collections.CollectionsKt.plus((java.util.Collection) emptyList22, (java.lang.Iterable) com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCaseKt.access$toLinkedAccounts(emptyList32)), emptyList, kotlin.collections.CollectionsKt.emptyList(), bankLogoImageBase64);
    }
}
