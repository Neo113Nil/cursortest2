package com.paypal.oslo.feature.wallet.banks.ui.autolink;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel$handleConfirmationAction$1", f = "AutoLinkViewModel.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AutoLinkViewModel$handleConfirmationAction$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.banks.domain.usecase.addmanualbank.ConfirmBankAccountUseCase confirmBankAccountUseCase;
        java.lang.String str;
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction;
        java.lang.String str2;
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            confirmBankAccountUseCase = this.getInputFormats.getInputFormats;
            str = this.getInputFormats.getHighSpeedVideoSizesFor;
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator access$resolveAggregator = com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel.access$resolveAggregator(this.getInputFormats);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = confirmBankAccountUseCase.invoke(new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountParams.InstantBankAccountConfirmation(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, access$resolveAggregator, "PERMANENT", str), this);
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
        externalBankAccessAction = this.getInputFormats.Camera2StreamConfigurationMap;
        int i2 = com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel$handleConfirmationAction$1.WhenMappings.$EnumSwitchMapping$0[externalBankAccessAction.ordinal()];
        java.lang.String str3 = "";
        if (i2 == 1) {
            str2 = "";
        } else if (i2 == 2) {
            str2 = "Bank successfully Confirmed.";
        } else {
            if (i2 != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str2 = "Bank successfully reconnected.";
        }
        externalBankAccessAction2 = this.getInputFormats.Camera2StreamConfigurationMap;
        int i3 = com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel$handleConfirmationAction$1.WhenMappings.$EnumSwitchMapping$0[externalBankAccessAction2.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                str3 = "Failed to confirm bank.";
            } else {
                if (i3 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                str3 = "Failed to reconnect bank.";
            }
        }
        if (ior instanceof arrow.core.Ior.Both) {
            com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel.access$handleConfirmationData(this.getInputFormats, (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult) ((arrow.core.Ior.Both) ior).getRightValue(), str2, str3);
        } else if (ior instanceof arrow.core.Ior.Left) {
            mutableStateFlow = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, new com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent.Outcome(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error(str3, (java.lang.String) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null))));
        } else {
            if (!(ior instanceof arrow.core.Ior.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel.access$handleConfirmationData(this.getInputFormats, (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.ConfirmBankAccountResult) ((arrow.core.Ior.Right) ior).getValue(), str2, str3);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel$handleConfirmationAction$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.ADD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.CONFIRM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.RECONSENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel$handleConfirmationAction$1(this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoLinkViewModel$handleConfirmationAction$1(com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel autoLinkViewModel, java.lang.String str, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel$handleConfirmationAction$1> continuation) {
        super(2, continuation);
        this.getInputFormats = autoLinkViewModel;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = addFIFlow;
        this.Camera2StreamConfigurationMap = instantBankConfirmationBankDetails;
        this.getHighSpeedVideoSizes = str2;
    }
}
