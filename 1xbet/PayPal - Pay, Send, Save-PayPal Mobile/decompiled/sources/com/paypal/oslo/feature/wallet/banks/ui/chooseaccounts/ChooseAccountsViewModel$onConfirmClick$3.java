package com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel$onConfirmClick$3", f = "ChooseAccountsViewModel.kt", i = {0, 0, 0, 0, 0}, l = {312}, m = "invokeSuspend", n = {"aggregator", "operationMode", "resolvedIntegrationType", "params", "actualBankName"}, nl = {313}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes15.dex */
final class ChooseAccountsViewModel$onConfirmClick$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.model.SelectableBankAccount> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0183, code lost:
    
        r3 = r29.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode openBankingAggregatorOperationMode;
        java.lang.Object obj3;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        com.paypal.oslo.feature.wallet.banks.domain.usecase.LinkExternalBankAccountsUseCase linkExternalBankAccountsUseCase;
        java.lang.Object invoke;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> entries = com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.getEntries();
            com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel chooseAccountsViewModel = this.getInputSizeshNQ4ISI;
            java.util.Iterator<E> it = entries.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                java.lang.String name2 = ((com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator) obj2).name();
                str10 = chooseAccountsViewModel.getHighSpeedVideoFpsRangesFor;
                if (kotlin.jvm.internal.Intrinsics.areEqual(name2, str10)) {
                    break;
                }
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator) obj2;
            if (bankAggregator == null) {
                bankAggregator = com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.FINICITY;
            }
            int i2 = com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel$onConfirmClick$3.WhenMappings.$EnumSwitchMapping$0[bankAggregator.ordinal()];
            if (i2 == 1) {
                openBankingAggregatorOperationMode = com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode.LITE_MODE;
            } else if (i2 == 2) {
                openBankingAggregatorOperationMode = com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode.FULL_MODE;
            } else {
                openBankingAggregatorOperationMode = com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode.FULL_MODE;
            }
            kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType> entries2 = com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.getEntries();
            com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel chooseAccountsViewModel2 = this.getInputSizeshNQ4ISI;
            java.util.Iterator<E> it2 = entries2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                java.lang.String name3 = ((com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType) obj3).name();
                str9 = chooseAccountsViewModel2.getInputSizeshNQ4ISI;
                if (kotlin.jvm.internal.Intrinsics.areEqual(name3, str9)) {
                    break;
                }
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType = (com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType) obj3;
            if (integrationType == null) {
                integrationType = com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.HOSTED_URL;
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType2 = integrationType;
            str = this.getInputSizeshNQ4ISI.getOutputFormats;
            str2 = this.getInputSizeshNQ4ISI.getOutputMinFrameDuration;
            str3 = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
            str4 = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            if (str4 == null) {
                com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.model.SelectableBankAccount selectableBankAccount = (com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.model.SelectableBankAccount) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.Camera2StreamConfigurationMap);
                java.lang.String bankName = selectableBankAccount != null ? selectableBankAccount.getBankName() : null;
                str5 = bankName == null ? "" : bankName;
            } else {
                str5 = str4;
            }
            java.util.List<com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.model.SelectableBankAccount> list = this.Camera2StreamConfigurationMap;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(((com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.model.SelectableBankAccount) it3.next()).getId());
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsParams linkExternalBankAccountsParams = new com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsParams(bankAggregator, str, str2, str3, str5, null, openBankingAggregatorOperationMode, arrayList, null, integrationType2, null, 1312, null);
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            str6 = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            pairArr[0] = kotlin.TuplesKt.to("aggregator", str6);
            java.util.List<com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.model.SelectableBankAccount> list2 = this.Camera2StreamConfigurationMap;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.model.SelectableBankAccount) it4.next()).getId());
            }
            pairArr[1] = kotlin.TuplesKt.to("accountIds", arrayList2.toString());
            com.paypal.android.logger.Logger.i$default(logger, "[ChooseAccounts] Linking bank accounts", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.model.SelectableBankAccount selectableBankAccount2 = (com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.model.SelectableBankAccount) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.Camera2StreamConfigurationMap);
            if ((selectableBankAccount2 == null || (str7 = selectableBankAccount2.getBankName()) == null) && str7 == null) {
                str7 = "Bank Account";
            }
            linkExternalBankAccountsUseCase = this.getInputSizeshNQ4ISI.getOutputStallDuration;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bankAggregator);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(openBankingAggregatorOperationMode);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(integrationType2);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkExternalBankAccountsParams);
            this.getOutputMinFrameDuration = str7;
            this.getOutputFormats = 1;
            invoke = linkExternalBankAccountsUseCase.invoke(linkExternalBankAccountsParams, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            str8 = str7;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str8 = (java.lang.String) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Ior ior = (arrow.core.Ior) invoke;
        if (!(ior instanceof arrow.core.Ior.Right)) {
            if (ior instanceof arrow.core.Ior.Left) {
                com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel chooseAccountsViewModel3 = this.getInputSizeshNQ4ISI;
                com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError externalBankAccessError = (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) ((arrow.core.Ior.Left) ior).getValue();
                str11 = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel.access$handleLinkingError(chooseAccountsViewModel3, externalBankAccessError, str8, str11 != null ? str11 : "");
            } else if (ior instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult) both.getRightValue(), this.Camera2StreamConfigurationMap, (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) both.getLeftValue());
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "[ChooseAccounts] Partial linking success with warnings", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) both.getLeftValue()).toString())), null, 4, null);
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult) ((arrow.core.Ior.Right) ior).getValue(), this.Camera2StreamConfigurationMap, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel$onConfirmClick$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.FINICITY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.PLAID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel$onConfirmClick$3(this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChooseAccountsViewModel$onConfirmClick$3(com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel chooseAccountsViewModel, java.util.List<com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.model.SelectableBankAccount> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsViewModel$onConfirmClick$3> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = chooseAccountsViewModel;
        this.Camera2StreamConfigurationMap = list;
    }
}
