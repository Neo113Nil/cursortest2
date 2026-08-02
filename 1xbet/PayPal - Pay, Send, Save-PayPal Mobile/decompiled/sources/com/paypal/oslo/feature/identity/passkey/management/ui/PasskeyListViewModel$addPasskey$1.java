package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel$addPasskey$1", f = "PasskeyListViewModel.kt", i = {1, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 205}, m = "invokeSuspend", n = {"createResult", "this_$iv", "success", "$i$f$fold", "$i$a$-fold-PasskeyListViewModel$addPasskey$1$3"}, nl = {183, 206}, s = {"L$0", "L$1", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyListViewModel$addPasskey$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a0, code lost:
    
        if (r2 != r1) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content content;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase passkeyCreateUseCase;
        java.lang.Object invoke;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content copy$default;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content content2;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content copy$default2;
        java.lang.Object Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel passkeyListViewModel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizesFor.getOutputMinFrameDuration;
            do {
                value = mutableStateFlow.getValue();
                content = (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState) value;
                com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content content3 = content instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content ? (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content) content : null;
                if (content3 != null && (copy$default = com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content.copy$default(content3, null, false, null, true, null, null, 55, null)) != null) {
                    content = copy$default;
                }
            } while (!mutableStateFlow.compareAndSet(value, content));
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Adding passkey from list screen", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hasPublicCredential", java.lang.String.valueOf(this.getHighSpeedVideoSizes != null))), null, 4, null);
            passkeyCreateUseCase = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges;
            this.getOutputFormats = 1;
            invoke = passkeyCreateUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant.APP_SETTINGS, this.getHighSpeedVideoSizes, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                passkeyListViewModel = (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel.Camera2StreamConfigurationMap(passkeyListViewModel, true, null, 2);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel passkeyListViewModel2 = this.getHighSpeedVideoSizesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess passkeyCreateSuccess = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess) ((arrow.core.Either.Right) either).getValue();
            com.paypal.oslo.feature.identity.LoggerKt.log.i("Passkey added successfully from list screen", kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("credentialId", passkeyCreateSuccess.getPasskeyCredentialId())));
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getInputFormats = passkeyListViewModel2;
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyCreateSuccess);
            this.getHighSpeedVideoFpsRanges = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getOutputFormats = 2;
            Camera2StreamConfigurationMap = passkeyListViewModel2.Camera2StreamConfigurationMap(1, this);
            if (Camera2StreamConfigurationMap != coroutine_suspended) {
                passkeyListViewModel = passkeyListViewModel2;
                com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel.Camera2StreamConfigurationMap(passkeyListViewModel, true, null, 2);
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(passkeyCreateError.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "";
            }
            pairArr[0] = kotlin.TuplesKt.to("errorType", simpleName);
            pairArr[1] = kotlin.TuplesKt.to("error", passkeyCreateError.toString());
            com.paypal.android.logger.Logger.w$default(logger, "Passkey creation failed from list screen", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            mutableStateFlow2 = passkeyListViewModel2.getOutputMinFrameDuration;
            do {
                value2 = mutableStateFlow2.getValue();
                content2 = (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState) value2;
                com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content content4 = content2 instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content ? (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content) content2 : null;
                if (content4 != null && (copy$default2 = com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content.copy$default(content4, null, false, null, false, passkeyCreateError, null, 39, null)) != null) {
                    content2 = copy$default2;
                }
            } while (!mutableStateFlow2.compareAndSet(value2, content2));
            return kotlin.Unit.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel$addPasskey$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel$addPasskey$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyListViewModel$addPasskey$1(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel passkeyListViewModel, java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel$addPasskey$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = passkeyListViewModel;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = context;
    }
}
