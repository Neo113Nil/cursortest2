package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$submitBankAccount$1", f = "ManualAddBankViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, m = "invokeSuspend", n = {}, nl = {269}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ManualAddBankViewModel$submitBankAccount$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.AddBankManualUseCase addBankManualUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$submitBankAccount$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content copy$default;
                    copy$default = com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content.copy$default((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content) obj2, null, true, null, null, null, null, false, null, null, 509, null);
                    return copy$default;
                }
            });
            addBankManualUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = addBankManualUseCase.invoke(this.getHighSpeedVideoSizes, this);
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
        if (ior instanceof arrow.core.Ior.Right) {
            arrow.core.Ior.Right right = (arrow.core.Ior.Right) ior;
            java.lang.String bankAccountId = ((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult) right.getValue()).getBankAccountId();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Successfully added bank account", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountId", bankAccountId)), 2, null);
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor = ((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult) right.getValue()).getBankAccountDetails();
            com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.access$checkAndLaunchInstantRD(this.getHighSpeedVideoFpsRanges, bankAccountId);
        } else if (ior instanceof arrow.core.Ior.Left) {
            arrow.core.Ior.Left left = (arrow.core.Ior.Left) ior;
            kotlin.Pair access$mapSubmissionErrorToMessage = com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModelKt.access$mapSubmissionErrorToMessage((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError) left.getValue());
            final java.lang.String str = (java.lang.String) access$mapSubmissionErrorToMessage.component1();
            final java.lang.Integer num = (java.lang.Integer) access$mapSubmissionErrorToMessage.component2();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to add bank account", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(left.getValue().getClass()).getSimpleName())), null, 4, null);
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$submitBankAccount$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content copy$default;
                    copy$default = com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content.copy$default((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content) obj2, null, false, str, num, null, null, false, null, null, 497, null);
                    return copy$default;
                }
            });
        } else {
            if (!(ior instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            com.paypal.oslo.feature.wallet.LoggerKt.log.w("Bank account added with warnings", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(both.getLeftValue().getClass()).getSimpleName())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountId", ((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult) both.getRightValue()).getBankAccountId())));
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor = ((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult) both.getRightValue()).getBankAccountDetails();
            com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.access$checkAndLaunchInstantRD(this.getHighSpeedVideoFpsRanges, ((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult) both.getRightValue()).getBankAccountId());
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$submitBankAccount$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$submitBankAccount$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManualAddBankViewModel$submitBankAccount$1(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel manualAddBankViewModel, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams addBankManualParams, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$submitBankAccount$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = manualAddBankViewModel;
        this.getHighSpeedVideoSizes = addBankManualParams;
    }
}
