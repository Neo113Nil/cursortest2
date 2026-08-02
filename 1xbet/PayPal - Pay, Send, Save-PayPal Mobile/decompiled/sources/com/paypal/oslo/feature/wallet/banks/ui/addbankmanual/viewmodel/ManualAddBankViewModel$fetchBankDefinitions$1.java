package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$fetchBankDefinitions$1", f = "ManualAddBankViewModel.kt", i = {0, 0}, l = {205}, m = "invokeSuspend", n = {com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname"}, nl = {206}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class ManualAddBankViewModel$fetchBankDefinitions$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.core.userstore.UserStore userStore;
        kotlin.Pair pair;
        com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.GetBankDefinitionsUseCase getBankDefinitionsUseCase;
        java.lang.Object invoke;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName;
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object value4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        java.lang.Object value5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Loading.INSTANCE));
            userStore = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.core.userstore.model.UserState value6 = userStore.getUserState().getValue();
            if (value6 instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value6;
                com.paypal.oslo.core.userstore.model.ProfileName legalName = profileLoaded.getUser().getLegalName();
                java.lang.String str3 = null;
                java.lang.String givenName = (legalName == null || (personName2 = legalName.getPersonName()) == null) ? null : personName2.getGivenName();
                if (givenName == null) {
                    givenName = "";
                }
                com.paypal.oslo.core.userstore.model.ProfileName legalName2 = profileLoaded.getUser().getLegalName();
                if (legalName2 != null && (personName = legalName2.getPersonName()) != null) {
                    str3 = personName.getSurname();
                }
                pair = kotlin.TuplesKt.to(givenName, str3 != null ? str3 : "");
            } else {
                pair = kotlin.TuplesKt.to("", "");
            }
            java.lang.String str4 = (java.lang.String) pair.component1();
            java.lang.String str5 = (java.lang.String) pair.component2();
            getBankDefinitionsUseCase = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = str4;
            this.getHighResolutionOutputSizeshNQ4ISI = str5;
            this.getHighSpeedVideoFpsRanges = 1;
            invoke = getBankDefinitionsUseCase.invoke(this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str5;
            str2 = str4;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
            str2 = (java.lang.String) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Ior ior = (arrow.core.Ior) invoke;
        if (ior instanceof arrow.core.Ior.Right) {
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition> sortByCountryName = com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionMapper.INSTANCE.sortByCountryName(((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionsResult) ((arrow.core.Ior.Right) ior).getValue()).getDefinitions());
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Successfully loaded bank definitions", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("definitionCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(sortByCountryName.size()))), null, 4, null);
            mutableStateFlow5 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            do {
                value5 = mutableStateFlow5.getValue();
            } while (!mutableStateFlow5.compareAndSet(value5, new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content(sortByCountryName, false, null, null, null, null, false, str2, str, 126, null)));
        } else if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to load bank definitions", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((arrow.core.Ior.Left) ior).getValue().getClass()).getSimpleName())), null, 4, null);
            mutableStateFlow4 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            do {
                value4 = mutableStateFlow4.getValue();
            } while (!mutableStateFlow4.compareAndSet(value4, new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Error(0, 0, 0, 7, null)));
        } else {
            if (!(ior instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition> definitions = ((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionsResult) both.getRightValue()).getDefinitions();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Partial success loading bank definitions", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(both.getLeftValue().getClass()).getSimpleName()), kotlin.TuplesKt.to("definitionCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(definitions.size()))), null, 4, null);
            if (definitions.isEmpty()) {
                mutableStateFlow2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Error(0, 0, 0, 7, null)));
            } else {
                java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition> sortByCountryName2 = com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinitionMapper.INSTANCE.sortByCountryName(definitions);
                mutableStateFlow3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                do {
                    value3 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value3, new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content(sortByCountryName2, false, null, null, null, null, false, str2, str, 126, null)));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$fetchBankDefinitions$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$fetchBankDefinitions$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManualAddBankViewModel$fetchBankDefinitions$1(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel manualAddBankViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$fetchBankDefinitions$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = manualAddBankViewModel;
    }
}
