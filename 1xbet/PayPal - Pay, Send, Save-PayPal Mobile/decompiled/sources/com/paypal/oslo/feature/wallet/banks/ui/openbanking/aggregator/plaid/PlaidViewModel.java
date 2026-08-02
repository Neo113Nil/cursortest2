package com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003HIJB_\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!*\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0017¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0017¢\u0006\u0004\b'\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u00103R\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b4\u00100R\u0014\u00106\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u00105R\u0014\u00109\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010:R\u0014\u0010#\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010<R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010?R \u0010A\u001a\b\u0012\u0004\u0012\u00020>0@8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010?R\"\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0@8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010D"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "action", "", "instrumentId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "bank", "countryCode", "Landroid/app/Application;", "application", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/aggregator/plaid/GetPlaidTokenUseCase;", "getPlaidTokenUseCase", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/FetchAndUpdateForPlaidUseCase;", "fetchAndUpdateForPlaidUseCase", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/addmanualbank/ConfirmBankAccountUseCase;", "confirmBankAccountUseCase", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;Ljava/lang/String;Landroid/app/Application;Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/aggregator/plaid/GetPlaidTokenUseCase;Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/FetchAndUpdateForPlaidUseCase;Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/addmanualbank/ConfirmBankAccountUseCase;)V", "Lcom/plaid/link/result/LinkSuccessMetadata;", "successMetadata", "", "successHandler", "(Lcom/plaid/link/result/LinkSuccessMetadata;)V", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountResult;", "p0", "p1", "p2", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/ConfirmBankAccountResult;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;", "", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/LinkedBankAccount;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccount;)Ljava/util/List;", "exitHandler", "()V", "retry", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "getFlow", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "getAction", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "Ljava/lang/String;", "getInstrumentId", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "getBank", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "getCountryCode", "Landroid/app/Application;", "Camera2StreamConfigurationMap", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/aggregator/plaid/GetPlaidTokenUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/FetchAndUpdateForPlaidUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/addmanualbank/ConfirmBankAccountUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$NavigateTo;", "navigateToDestination", "getNavigateToDestination", "Factory", "State", "NavigateTo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PlaidViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction action;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails bank;
    private final java.lang.String countryCode;
    private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow flow;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo> getInputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.app.Application Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String instrumentId;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo> navigateToDestination;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State> uiState;

    @dagger.assisted.AssistedInject
    public PlaidViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, @dagger.assisted.Assisted com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, @dagger.assisted.Assisted("instrumentId") java.lang.String str, @dagger.assisted.Assisted com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, @dagger.assisted.Assisted("countryCode") java.lang.String str2, android.app.Application application, com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase getPlaidTokenUseCase, com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase fetchAndUpdateForPlaidUseCase, com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase confirmBankAccountUseCase) {
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPlaidTokenUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchAndUpdateForPlaidUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmBankAccountUseCase, "");
        this.flow = addFIFlow;
        this.action = externalBankAccessAction;
        this.instrumentId = str;
        this.bank = instantBankConfirmationBankDetails;
        this.countryCode = str2;
        this.Camera2StreamConfigurationMap = application;
        this.getHighResolutionOutputSizeshNQ4ISI = getPlaidTokenUseCase;
        this.getHighSpeedVideoSizes = fetchAndUpdateForPlaidUseCase;
        this.getHighSpeedVideoFpsRanges = confirmBankAccountUseCase;
        boolean z = false;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Loading(z, z, 3, null));
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getInputSizeshNQ4ISI = MutableStateFlow2;
        this.navigateToDestination = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        if ((externalBankAccessAction != com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.RECONSENT && externalBankAccessAction != com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.CONFIRM) || ((str3 = str) != null && str3.length() != 0)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$createPlaidHandler$1(this, null), 3, null);
            return;
        }
        java.lang.String name2 = externalBankAccessAction.name();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Instrument ID cannot be null or empty for ");
        sb.append(name2);
        sb.append(" action.");
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleAddAction(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel plaidViewModel, kotlinx.serialization.json.JsonObject jsonObject, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$handleAddAction$1 plaidViewModel$handleAddAction$1;
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        kotlinx.serialization.json.JsonObject jsonObject2;
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        kotlinx.serialization.json.JsonObject jsonObject3;
        kotlinx.serialization.json.JsonElement jsonElement2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive2;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive3;
        com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult linkExternalBankAccountsResult;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo> mutableStateFlow;
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo value;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> emptyList;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> emptyList2;
        java.lang.String bankLogoImageBase64;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$handleAddAction$1) {
            plaidViewModel$handleAddAction$1 = (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$handleAddAction$1) continuation;
            if ((plaidViewModel$handleAddAction$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                plaidViewModel$handleAddAction$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$handleAddAction$1 plaidViewModel$handleAddAction$12 = plaidViewModel$handleAddAction$1;
                java.lang.Object obj = plaidViewModel$handleAddAction$12.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = plaidViewModel$handleAddAction$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State> mutableStateFlow2 = plaidViewModel.getHighSpeedVideoFpsRangesFor;
                    while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Loading(true, true))) {
                    }
                    if (jsonObject == null) {
                        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo> mutableStateFlow3 = plaidViewModel.getInputSizeshNQ4ISI;
                        while (!mutableStateFlow3.compareAndSet(mutableStateFlow3.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.AddBankSummary(null, null, null, null, 15, null))) {
                        }
                    } else {
                        kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) jsonObject.get("public_token");
                        java.lang.String content = (jsonElement3 == null || (jsonPrimitive3 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement3)) == null) ? null : jsonPrimitive3.getContent();
                        kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) jsonObject.get("institution");
                        java.lang.String content2 = (jsonElement4 == null || (jsonObject3 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement4)) == null || (jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject3.get((java.lang.Object) "institution_id")) == null || (jsonPrimitive2 = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : jsonPrimitive2.getContent();
                        kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) jsonObject.get("institution");
                        java.lang.String content3 = (jsonElement5 == null || (jsonObject2 = kotlinx.serialization.json.JsonElementKt.getJsonObject(jsonElement5)) == null || (jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject2.get((java.lang.Object) "name")) == null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive.getContent();
                        java.lang.String str4 = content;
                        if (str4 == null || str4.length() == 0 || (str = content2) == null || str.length() == 0 || (str2 = content3) == null || str2.length() == 0) {
                            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo> mutableStateFlow4 = plaidViewModel.getInputSizeshNQ4ISI;
                            while (!mutableStateFlow4.compareAndSet(mutableStateFlow4.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.AddBankSummary(null, null, null, null, 15, null))) {
                            }
                        } else {
                            com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase fetchAndUpdateForPlaidUseCase = plaidViewModel.getHighSpeedVideoSizes;
                            plaidViewModel$handleAddAction$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(jsonObject);
                            plaidViewModel$handleAddAction$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(content);
                            plaidViewModel$handleAddAction$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(content2);
                            plaidViewModel$handleAddAction$12.Camera2StreamConfigurationMap = content3;
                            plaidViewModel$handleAddAction$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                            obj = com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase.invoke$default(fetchAndUpdateForPlaidUseCase, content, content2, content3, null, null, plaidViewModel$handleAddAction$12, 24, null);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str3 = content3;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (java.lang.String) plaidViewModel$handleAddAction$12.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                linkExternalBankAccountsResult = (com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult) obj;
                mutableStateFlow = plaidViewModel.getInputSizeshNQ4ISI;
                do {
                    value = mutableStateFlow.getValue();
                    if (linkExternalBankAccountsResult != null || (emptyList = linkExternalBankAccountsResult.getLinkedAccounts()) == null) {
                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    if (linkExternalBankAccountsResult != null || (emptyList2 = linkExternalBankAccountsResult.getFailedAccounts()) == null) {
                        emptyList2 = kotlin.collections.CollectionsKt.emptyList();
                    }
                    bankLogoImageBase64 = linkExternalBankAccountsResult == null ? linkExternalBankAccountsResult.getBankLogoImageBase64() : null;
                    if (bankLogoImageBase64 == null) {
                        bankLogoImageBase64 = "";
                    }
                } while (!mutableStateFlow.compareAndSet(value, new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.AddBankSummary(emptyList, emptyList2, str3, bankLogoImageBase64)));
                return kotlin.Unit.INSTANCE;
            }
        }
        plaidViewModel$handleAddAction$1 = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$handleAddAction$1(plaidViewModel, continuation);
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$handleAddAction$1 plaidViewModel$handleAddAction$122 = plaidViewModel$handleAddAction$1;
        java.lang.Object obj2 = plaidViewModel$handleAddAction$122.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = plaidViewModel$handleAddAction$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        linkExternalBankAccountsResult = (com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult) obj2;
        mutableStateFlow = plaidViewModel.getInputSizeshNQ4ISI;
        do {
            value = mutableStateFlow.getValue();
            if (linkExternalBankAccountsResult != null) {
            }
            emptyList = kotlin.collections.CollectionsKt.emptyList();
            if (linkExternalBankAccountsResult != null) {
            }
            emptyList2 = kotlin.collections.CollectionsKt.emptyList();
            if (linkExternalBankAccountsResult == null) {
            }
            if (bankLogoImageBase64 == null) {
            }
        } while (!mutableStateFlow.compareAndSet(value, new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.AddBankSummary(emptyList, emptyList2, str3, bankLogoImageBase64)));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleConfirmationAction(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel plaidViewModel, kotlinx.serialization.json.JsonObject jsonObject, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$handleConfirmationAction$1 plaidViewModel$handleConfirmationAction$1;
        int i;
        java.lang.String str3;
        java.lang.String str4;
        kotlinx.serialization.json.JsonElement jsonElement;
        kotlinx.serialization.json.JsonPrimitive jsonPrimitive;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$handleConfirmationAction$1) {
            plaidViewModel$handleConfirmationAction$1 = (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$handleConfirmationAction$1) continuation;
            if ((plaidViewModel$handleConfirmationAction$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                plaidViewModel$handleConfirmationAction$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = plaidViewModel$handleConfirmationAction$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = plaidViewModel$handleConfirmationAction$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State> mutableStateFlow = plaidViewModel.getHighSpeedVideoFpsRangesFor;
                    while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Loading(true, true))) {
                    }
                    java.lang.String str5 = plaidViewModel.instrumentId;
                    if (str5 == null || str5.length() == 0 || plaidViewModel.bank == null) {
                        throw new java.lang.IllegalArgumentException("Instrument ID/Bank can't be null or empty for confirmation action.".toString());
                    }
                    java.lang.String content = (jsonObject == null || (jsonElement = (kotlinx.serialization.json.JsonElement) jsonObject.get("public_token")) == null || (jsonPrimitive = kotlinx.serialization.json.JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive.getContent();
                    if (content == null) {
                        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo> mutableStateFlow2 = plaidViewModel.getInputSizeshNQ4ISI;
                        while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.FinishFlowWithOutCome(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error(str2, (java.lang.String) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null)))) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase confirmBankAccountUseCase = plaidViewModel.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.InstantBankAccountConfirmation instantBankAccountConfirmation = new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.InstantBankAccountConfirmation(plaidViewModel.instrumentId, plaidViewModel.flow, plaidViewModel.bank, content, com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.PLAID, null, plaidViewModel.countryCode, 32, null);
                    plaidViewModel$handleConfirmationAction$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(jsonObject);
                    plaidViewModel$handleConfirmationAction$1.Camera2StreamConfigurationMap = str;
                    plaidViewModel$handleConfirmationAction$1.getHighResolutionOutputSizeshNQ4ISI = str2;
                    plaidViewModel$handleConfirmationAction$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(content);
                    plaidViewModel$handleConfirmationAction$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = confirmBankAccountUseCase.invoke(instantBankAccountConfirmation, plaidViewModel$handleConfirmationAction$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str;
                    str4 = str2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = (java.lang.String) plaidViewModel$handleConfirmationAction$1.getHighResolutionOutputSizeshNQ4ISI;
                    str3 = (java.lang.String) plaidViewModel$handleConfirmationAction$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    plaidViewModel.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult) ((arrow.core.Ior.Both) ior).getRightValue(), str3, str4);
                } else if (!(ior instanceof arrow.core.Ior.Left)) {
                    if (!(ior instanceof arrow.core.Ior.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    plaidViewModel.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult) ((arrow.core.Ior.Right) ior).getValue(), str3, str4);
                } else {
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo> mutableStateFlow3 = plaidViewModel.getInputSizeshNQ4ISI;
                    do {
                    } while (!mutableStateFlow3.compareAndSet(mutableStateFlow3.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.FinishFlowWithOutCome(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error(str4, (java.lang.String) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null))));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        plaidViewModel$handleConfirmationAction$1 = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$handleConfirmationAction$1(plaidViewModel, continuation);
        java.lang.Object obj2 = plaidViewModel$handleConfirmationAction$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = plaidViewModel$handleConfirmationAction$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Both)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getFlow() {
        return this.flow;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction getAction() {
        return this.action;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails getBank() {
        return this.bank;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JA\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$Factory;", "", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "action", "", "instrumentId", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "bank", "countryCode", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel;", "create", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @dagger.assisted.AssistedFactory
    public interface Factory {
        com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel create(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow flow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction action, @dagger.assisted.Assisted("instrumentId") java.lang.String instrumentId, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails bank, @dagger.assisted.Assisted("countryCode") java.lang.String countryCode);

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel create$default(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.Factory factory, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, java.lang.String str, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            java.lang.String str3 = (i & 4) != 0 ? null : str;
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails2 = (i & 8) != 0 ? null : instantBankConfirmationBankDetails;
            if ((i & 16) != 0) {
                str2 = "US";
            }
            return factory.create(addFIFlow, externalBankAccessAction, str3, instantBankConfirmationBankDetails2, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State;", "", "<init>", "()V", "Loading", "Success", "Error", "AddBankManualEntry", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State$AddBankManualEntry;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State$Error;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State$Loading;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class State {
        public static final int $stable = 0;

        private State() {
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State$Loading;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State;", "", "showFlowMessage", "shouldShowClose", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State$Loading;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getShowFlowMessage", "getShouldShowClose"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loading extends com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State {
            public static final int $stable = 0;
            private final boolean shouldShowClose;
            private final boolean showFlowMessage;

            public Loading(boolean z, boolean z2) {
                super(null);
                this.showFlowMessage = z;
                this.shouldShowClose = z2;
            }

            public /* synthetic */ Loading(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
            }

            public final boolean getShowFlowMessage() {
                return this.showFlowMessage;
            }

            public final boolean getShouldShowClose() {
                return this.shouldShowClose;
            }

            public final java.lang.String toString() {
                boolean z = this.showFlowMessage;
                boolean z2 = this.shouldShowClose;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(showFlowMessage=");
                sb.append(z);
                sb.append(", shouldShowClose=");
                sb.append(z2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (java.lang.Boolean.hashCode(this.showFlowMessage) * 31) + java.lang.Boolean.hashCode(this.shouldShowClose);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Loading)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Loading loading = (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Loading) other;
                return this.showFlowMessage == loading.showFlowMessage && this.shouldShowClose == loading.shouldShowClose;
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Loading copy(boolean showFlowMessage, boolean shouldShowClose) {
                return new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Loading(showFlowMessage, shouldShowClose);
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShouldShowClose() {
                return this.shouldShowClose;
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowFlowMessage() {
                return this.showFlowMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Loading copy$default(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Loading loading, boolean z, boolean z2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = loading.showFlowMessage;
                }
                if ((i & 2) != 0) {
                    z2 = loading.shouldShowClose;
                }
                return loading.copy(z, z2);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Loading() {
                this(r2, r2, 3, null);
                boolean z = false;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State$Success;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State;", "Lcom/plaid/link/PlaidHandler;", "plaidHandler", "<init>", "(Lcom/plaid/link/PlaidHandler;)V", "component1", "()Lcom/plaid/link/PlaidHandler;", "copy", "(Lcom/plaid/link/PlaidHandler;)Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/plaid/link/PlaidHandler;", "getPlaidHandler"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Success extends com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State {
            public static final int $stable = 8;
            private final com.plaid.link.PlaidHandler plaidHandler;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(com.plaid.link.PlaidHandler plaidHandler) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plaidHandler, "");
                this.plaidHandler = plaidHandler;
            }

            public final com.plaid.link.PlaidHandler getPlaidHandler() {
                return this.plaidHandler;
            }

            public final java.lang.String toString() {
                com.plaid.link.PlaidHandler plaidHandler = this.plaidHandler;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(plaidHandler=");
                sb.append(plaidHandler);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.plaidHandler.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.plaidHandler, ((com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Success) other).plaidHandler);
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Success copy(com.plaid.link.PlaidHandler plaidHandler) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plaidHandler, "");
                return new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Success(plaidHandler);
            }

            /* renamed from: component1, reason: from getter */
            public final com.plaid.link.PlaidHandler getPlaidHandler() {
                return this.plaidHandler;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Success copy$default(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Success success, com.plaid.link.PlaidHandler plaidHandler, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    plaidHandler = success.plaidHandler;
                }
                return success.copy(plaidHandler);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State$Error;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Error extends com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Error INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Error();

            private Error() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State$AddBankManualEntry;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$State;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AddBankManualEntry extends com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.AddBankManualEntry INSTANCE = new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.AddBankManualEntry();

            public final int hashCode() {
                return -1414510828;
            }

            private AddBankManualEntry() {
                super(null);
            }

            public final java.lang.String toString() {
                return "AddBankManualEntry";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.AddBankManualEntry)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ State(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$NavigateTo;", "", "<init>", "()V", "AddBankSummary", "FinishFlowWithOutCome", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$NavigateTo$AddBankSummary;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$NavigateTo$FinishFlowWithOutCome;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class NavigateTo {
        public static final int $stable = 0;

        private NavigateTo() {
        }

        @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010JD\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$NavigateTo$AddBankSummary;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$NavigateTo;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkedBankAccountResult;", "linkedBanks", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/FailedBankAccountResult;", "nonLinkedBanks", "", "bankName", "bankLogoBase64", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$NavigateTo$AddBankSummary;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getLinkedBanks", "getNonLinkedBanks", "Ljava/lang/String;", "getBankName", "getBankLogoBase64"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AddBankSummary extends com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo {
            public static final int $stable = 8;
            private final java.lang.String bankLogoBase64;
            private final java.lang.String bankName;
            private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> linkedBanks;
            private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> nonLinkedBanks;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddBankSummary(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> list, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list2, java.lang.String str, java.lang.String str2) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.linkedBanks = list;
                this.nonLinkedBanks = list2;
                this.bankName = str;
                this.bankLogoBase64 = str2;
            }

            public /* synthetic */ AddBankSummary(java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
            }

            public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> getLinkedBanks() {
                return this.linkedBanks;
            }

            public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> getNonLinkedBanks() {
                return this.nonLinkedBanks;
            }

            public final java.lang.String getBankName() {
                return this.bankName;
            }

            public final java.lang.String getBankLogoBase64() {
                return this.bankLogoBase64;
            }

            public final java.lang.String toString() {
                java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> list = this.linkedBanks;
                java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list2 = this.nonLinkedBanks;
                java.lang.String str = this.bankName;
                java.lang.String str2 = this.bankLogoBase64;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AddBankSummary(linkedBanks=");
                sb.append(list);
                sb.append(", nonLinkedBanks=");
                sb.append(list2);
                sb.append(", bankName=");
                sb.append(str);
                sb.append(", bankLogoBase64=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((((this.linkedBanks.hashCode() * 31) + this.nonLinkedBanks.hashCode()) * 31) + this.bankName.hashCode()) * 31) + this.bankLogoBase64.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.AddBankSummary)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.AddBankSummary addBankSummary = (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.AddBankSummary) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.linkedBanks, addBankSummary.linkedBanks) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonLinkedBanks, addBankSummary.nonLinkedBanks) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, addBankSummary.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankLogoBase64, addBankSummary.bankLogoBase64);
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.AddBankSummary copy(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> linkedBanks, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> nonLinkedBanks, java.lang.String bankName, java.lang.String bankLogoBase64) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedBanks, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonLinkedBanks, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankName, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankLogoBase64, "");
                return new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.AddBankSummary(linkedBanks, nonLinkedBanks, bankName, bankLogoBase64);
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.String getBankLogoBase64() {
                return this.bankLogoBase64;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getBankName() {
                return this.bankName;
            }

            public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> component2() {
                return this.nonLinkedBanks;
            }

            public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult> component1() {
                return this.linkedBanks;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.AddBankSummary copy$default(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.AddBankSummary addBankSummary, java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = addBankSummary.linkedBanks;
                }
                if ((i & 2) != 0) {
                    list2 = addBankSummary.nonLinkedBanks;
                }
                if ((i & 4) != 0) {
                    str = addBankSummary.bankName;
                }
                if ((i & 8) != 0) {
                    str2 = addBankSummary.bankLogoBase64;
                }
                return addBankSummary.copy(list, list2, str, str2);
            }

            public AddBankSummary() {
                this(null, null, null, null, 15, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$NavigateTo$FinishFlowWithOutCome;", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$NavigateTo;", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;)Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/aggregator/plaid/PlaidViewModel$NavigateTo$FinishFlowWithOutCome;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;", "getOutcome"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class FinishFlowWithOutCome extends com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinishFlowWithOutCome(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
                this.outcome = outcome;
            }

            public final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome getOutcome() {
                return this.outcome;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome = this.outcome;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FinishFlowWithOutCome(outcome=");
                sb.append(outcome);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.outcome.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.FinishFlowWithOutCome) && kotlin.jvm.internal.Intrinsics.areEqual(this.outcome, ((com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.FinishFlowWithOutCome) other).outcome);
            }

            public final com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.FinishFlowWithOutCome copy(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
                return new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.FinishFlowWithOutCome(outcome);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome getOutcome() {
                return this.outcome;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.FinishFlowWithOutCome copy$default(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.FinishFlowWithOutCome finishFlowWithOutCome, com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    outcome = finishFlowWithOutCome.outcome;
                }
                return finishFlowWithOutCome.copy(outcome);
            }
        }

        public /* synthetic */ NavigateTo(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo> getNavigateToDestination() {
        return this.navigateToDestination;
    }

    public final void successHandler(com.plaid.link.result.LinkSuccessMetadata successMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successMetadata, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$successHandler$1(successMetadata, this, null), 3, null);
    }

    private final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult p0, java.lang.String p1, java.lang.String p2) {
        if (p0.getSuccess()) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo> mutableStateFlow = this.getInputSizeshNQ4ISI;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.FinishFlowWithOutCome(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Success(getHighSpeedVideoFpsRanges(p0.getBankAccount()), p1, (java.lang.Integer) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null)))) {
            }
        } else {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo> mutableStateFlow2 = this.getInputSizeshNQ4ISI;
            while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.NavigateTo.FinishFlowWithOutCome(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error(p2, (java.lang.String) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null)))) {
            }
        }
    }

    private static java.util.List<com.paypal.oslo.feature.wallet.api.navigation.result.banks.LinkedBankAccount> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount) {
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.wallet.api.navigation.result.banks.LinkedBankAccount(bankAccount.getId(), bankAccount.getType().name(), bankAccount.getLast4(), bankAccount.getName()));
    }

    public final void exitHandler() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.AddBankManualEntry.INSTANCE)) {
        }
    }

    public final void retry() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$createPlaidHandler$1(this, null), 3, null);
    }
}
