package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$fetchBankDetails$1", f = "ManualAddBankViewModel.kt", i = {0}, l = {432}, m = "invokeSuspend", n = {"params"}, nl = {433}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class ManualAddBankViewModel$fetchBankDetails$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.banks.domain.usecase.GetBankDetailsUseCase getBankDetailsUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$fetchBankDetails$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content copy$default;
                    copy$default = com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content.copy$default((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content) obj2, null, false, null, null, null, null, true, null, null, 399, null);
                    return copy$default;
                }
            });
            com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByBankCode byBankCode = new com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByBankCode(this.Camera2StreamConfigurationMap, "US");
            getBankDetailsUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(byBankCode);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = getBankDetailsUseCase.invoke(byBankCode, this);
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
            final com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails bankDetails = (com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails) ((arrow.core.Ior.Right) ior).getValue();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Successfully fetched bank details", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankName", bankDetails.getBankName())), null, 4, null);
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$fetchBankDetails$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content copy$default;
                    copy$default = com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content.copy$default((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content) obj2, null, false, null, null, r0.getBankName(), com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails.this.getInlineLogoUrl(), false, null, null, 399, null);
                    return copy$default;
                }
            });
        } else if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to fetch bank details", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((arrow.core.Ior.Left) ior).getValue().getClass()).getSimpleName())), null, 4, null);
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$fetchBankDetails$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content copy$default;
                    copy$default = com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content.copy$default((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content) obj2, null, false, null, null, null, null, false, null, null, 447, null);
                    return copy$default;
                }
            });
        } else {
            if (!(ior instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            final com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails bankDetails2 = (com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails) both.getRightValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Partial success fetching bank details", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(both.getLeftValue().getClass()).getSimpleName())), null, 4, null);
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$fetchBankDetails$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content copy$default;
                    copy$default = com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content.copy$default((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content) obj2, null, false, null, null, r0.getBankName(), com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails.this.getInlineLogoUrl(), false, null, null, 399, null);
                    return copy$default;
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$fetchBankDetails$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$fetchBankDetails$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManualAddBankViewModel$fetchBankDetails$1(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel manualAddBankViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel$fetchBankDetails$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = manualAddBankViewModel;
        this.Camera2StreamConfigurationMap = str;
    }
}
