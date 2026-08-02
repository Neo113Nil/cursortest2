package com.paypal.oslo.feature.subscriptions.details.manage.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel$disableAgreement$1", f = "ManageAgreementViewModel.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {"currentState"}, nl = {179}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class ManageAgreementViewModel$disableAgreement$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value;
        com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable disable;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizes.getInputFormats;
            com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState manageAgreementUiState = (com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState) mutableStateFlow.getValue();
            if ((manageAgreementUiState instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) && !((com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) manageAgreementUiState).isDisabling()) {
                mutableStateFlow2 = this.getHighSpeedVideoSizes.getInputFormats;
                do {
                    value = mutableStateFlow2.getValue();
                    disable = (com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState) value;
                    if (disable instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) {
                        disable = com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable.copy$default((com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Disable) disable, null, null, true, false, null, 27, null);
                    } else {
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.subscriptions.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                        pairArr[0] = kotlin.TuplesKt.to("expectedState", "Disable");
                        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(disable.getClass()).getSimpleName();
                        if (simpleName == null) {
                            simpleName = "";
                        }
                        pairArr[1] = kotlin.TuplesKt.to("actualState", simpleName);
                        com.paypal.android.logger.Logger.d$default(logger, "State changed before setting isDisabling flag", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    }
                } while (!mutableStateFlow2.compareAndSet(value, disable));
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(manageAgreementUiState);
                this.getHighSpeedVideoFpsRanges = 1;
                if (com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel.access$performDisableAgreement(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Disable already in progress or invalid state, ignoring request", null, null, 6, null);
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel$disableAgreement$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel$disableAgreement$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageAgreementViewModel$disableAgreement$1(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel manageAgreementViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel$disableAgreement$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = manageAgreementViewModel;
        this.Camera2StreamConfigurationMap = str;
    }
}
