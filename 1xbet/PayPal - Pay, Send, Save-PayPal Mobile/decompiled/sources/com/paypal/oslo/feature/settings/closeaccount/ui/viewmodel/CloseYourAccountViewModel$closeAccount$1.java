package com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel$closeAccount$1", f = "CloseYourAccountViewModel.kt", i = {0, 0, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {263, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE}, m = "invokeSuspend", n = {"userInput", "reason", "userInput", "reason", "userInput", "reason", "this_$iv", "$i$f$fold", "$i$a$-fold-CloseYourAccountViewModel$closeAccount$1$5", "userInput", "reason", "this_$iv", "$i$f$fold", "$i$a$-fold-CloseYourAccountViewModel$closeAccount$1$6"}, nl = {312, 316, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, 299}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class CloseYourAccountViewModel$closeAccount$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        java.lang.String buildCloseAccountReason;
        com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider closeAccountUseCasesProvider;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput;
        com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider closeAccountUseCasesProvider2;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput closeAccountUserInput2;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider closeAccountUseCasesProvider3;
        com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel closeYourAccountViewModel;
        com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider closeAccountUseCasesProvider4;
        com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel closeYourAccountViewModel2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mviStateStore = this.getInputFormats.getInputFormats;
            com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput userInput = ((com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState) mviStateStore.getUiState().getValue()).getUserInput();
            buildCloseAccountReason = com.paypal.oslo.feature.settings.closeaccount.domain.builder.AccountClosureDataBuilder.INSTANCE.buildCloseAccountReason(userInput);
            closeAccountUseCasesProvider = this.getInputFormats.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userInput);
            this.getHighResolutionOutputSizeshNQ4ISI = buildCloseAccountReason;
            this.getOutputMinFrameDuration = 1;
            java.lang.Object invoke = closeAccountUseCasesProvider.getCreateAccountActivityLog().invoke(buildCloseAccountReason, userInput, this);
            if (invoke != coroutine_suspended) {
                closeAccountUserInput = userInput;
                obj = invoke;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    closeYourAccountViewModel2 = (com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel) this.getInputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    closeYourAccountViewModel2.onIntent$settings_prodRelease(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountSucceeded.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeYourAccountViewModel = (com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel) this.getInputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                closeYourAccountViewModel.onIntent$settings_prodRelease(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountSucceeded.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
            buildCloseAccountReason = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
            closeAccountUserInput2 = (com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            ior = (arrow.core.Ior) obj;
            com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel closeYourAccountViewModel3 = this.getInputFormats;
            if (!(ior instanceof arrow.core.Ior.Left)) {
                closeYourAccountViewModel3.onIntent$settings_prodRelease(new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountFailed((com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError) ((arrow.core.Ior.Left) ior).getValue()));
                return kotlin.Unit.INSTANCE;
            }
            if (ior instanceof arrow.core.Ior.Right) {
                closeAccountUseCasesProvider4 = closeYourAccountViewModel3.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase logout = closeAccountUseCasesProvider4.getLogout();
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(closeAccountUserInput2);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildCloseAccountReason);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                this.getInputSizeshNQ4ISI = closeYourAccountViewModel3;
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoSizes = 0;
                this.getOutputMinFrameDuration = 3;
                if (logout.invoke(this) != coroutine_suspended) {
                    closeYourAccountViewModel2 = closeYourAccountViewModel3;
                    closeYourAccountViewModel2.onIntent$settings_prodRelease(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountSucceeded.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
            } else if (ior instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                closeAccountUseCasesProvider3 = closeYourAccountViewModel3.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.settings.domain.usecase.LogoutUseCase logout2 = closeAccountUseCasesProvider3.getLogout();
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(closeAccountUserInput2);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildCloseAccountReason);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                this.getInputSizeshNQ4ISI = closeYourAccountViewModel3;
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoSizes = 0;
                this.getOutputMinFrameDuration = 4;
                if (logout2.invoke(this) != coroutine_suspended) {
                    closeYourAccountViewModel = closeYourAccountViewModel3;
                    closeYourAccountViewModel.onIntent$settings_prodRelease(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.CloseAccountSucceeded.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return coroutine_suspended;
        }
        buildCloseAccountReason = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
        closeAccountUserInput = (com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserInput) this.getHighSpeedVideoFpsRanges;
        kotlin.ResultKt.throwOnFailure(obj);
        arrow.core.Ior ior2 = (arrow.core.Ior) obj;
        if (ior2 != null) {
            if (ior2 instanceof arrow.core.Ior.Left) {
                com.paypal.oslo.feature.settings.LoggerKt.log.e("Failed to create activity log for account closure", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError) ((arrow.core.Ior.Left) ior2).getValue()).getMessage())), kotlin.collections.MapsKt.emptyMap(), null);
            } else if (ior2 instanceof arrow.core.Ior.Right) {
                com.paypal.oslo.feature.settings.LoggerKt.log.i("Activity log created successfully for account closure", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("linksCount", java.lang.String.valueOf(((com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog) ((arrow.core.Ior.Right) ior2).getValue()).getLinks().size()))), kotlin.collections.MapsKt.emptyMap());
            } else if (ior2 instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) ior2;
                java.lang.Object leftValue2 = both2.getLeftValue();
                com.paypal.oslo.feature.settings.LoggerKt.log.w("Activity log created with warnings", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("linksCount", java.lang.String.valueOf(((com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog) both2.getRightValue()).getLinks().size()))), kotlin.collections.MapsKt.emptyMap());
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        closeAccountUseCasesProvider2 = this.getInputFormats.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(closeAccountUserInput);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildCloseAccountReason);
        this.getOutputMinFrameDuration = 2;
        obj = closeAccountUseCasesProvider2.getCloseAccount().invoke(buildCloseAccountReason, false, this);
        if (obj != coroutine_suspended) {
            closeAccountUserInput2 = closeAccountUserInput;
            ior = (arrow.core.Ior) obj;
            com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel closeYourAccountViewModel32 = this.getInputFormats;
            if (!(ior instanceof arrow.core.Ior.Left)) {
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel$closeAccount$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel$closeAccount$1(this.getInputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloseYourAccountViewModel$closeAccount$1(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel closeYourAccountViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel$closeAccount$1> continuation) {
        super(2, continuation);
        this.getInputFormats = closeYourAccountViewModel;
    }
}
