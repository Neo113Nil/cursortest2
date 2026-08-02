package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel$deletePasskey$1", f = "PasskeyListViewModel.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {239, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m = "invokeSuspend", n = {"contentState", "authenticatorName", "isLastPasskey", "contentState", "authenticatorName", "this_$iv", "success", "isLastPasskey", "$i$f$fold", "$i$a$-fold-PasskeyListViewModel$deletePasskey$1$3", "contentState", "authenticatorName", "this_$iv", "error", "isLastPasskey", "$i$f$fold", "$i$a$-fold-PasskeyListViewModel$deletePasskey$1$2"}, nl = {415, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, 417}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyListViewModel$deletePasskey$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x016a, code lost:
    
        if (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel.access$handleDeleteSuccess(r9, r10, r12, r4, r8, r22) == r7) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x019f, code lost:
    
        if (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel.access$handleDeleteError(r9, r10, r2, r22) == r7) goto L71;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.String str;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState passkeyListUiState;
        java.lang.Object obj2;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content content;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase passkeyDeleteUseCase;
        java.lang.Object invoke;
        java.lang.String str2;
        int i;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content content2;
        java.util.List<com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential> passkeys;
        java.util.List<com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential> passkeys2;
        java.lang.Object obj3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getInputSizeshNQ4ISI;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizesFor.getOutputMinFrameDuration;
            java.lang.String str3 = this.getHighSpeedVideoSizes;
            do {
                java.lang.Object value = mutableStateFlow.getValue();
                com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState passkeyListUiState2 = (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState) value;
                str = null;
                com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content content3 = passkeyListUiState2 instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content ? (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content) passkeyListUiState2 : null;
                if (content3 != null) {
                    passkeyListUiState = passkeyListUiState2;
                    obj2 = value;
                    com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content copy$default = com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content.copy$default(content3, null, false, str3, false, null, null, 59, null);
                    if (copy$default != null) {
                        content = copy$default;
                    }
                } else {
                    passkeyListUiState = passkeyListUiState2;
                    obj2 = value;
                }
                content = passkeyListUiState;
            } while (!mutableStateFlow.compareAndSet(obj2, content));
            com.paypal.oslo.feature.identity.LoggerKt.log.i("Deleting passkey", kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("credentialId", this.getHighSpeedVideoSizes)));
            mutableStateFlow2 = this.getHighSpeedVideoSizesFor.getOutputMinFrameDuration;
            java.lang.Object value2 = mutableStateFlow2.getValue();
            com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content content4 = value2 instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content ? (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content) value2 : null;
            if (content4 != null && (passkeys2 = content4.getPasskeys()) != null) {
                java.lang.String str4 = this.getHighSpeedVideoSizes;
                java.util.Iterator<T> it = passkeys2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential) obj3).getPasskeyCredentialId(), str4)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential passkeyCredential = (com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential) obj3;
                if (passkeyCredential != null) {
                    str = passkeyCredential.getAuthenticatorName();
                }
            }
            java.lang.String str5 = str;
            int i3 = (content4 == null || (passkeys = content4.getPasskeys()) == null || passkeys.size() != 1) ? 0 : 1;
            passkeyDeleteUseCase = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(content4);
            this.getInputFormats = str5;
            this.getHighSpeedVideoFpsRanges = i3;
            this.getInputSizeshNQ4ISI = 1;
            invoke = passkeyDeleteUseCase.invoke(this.getHighSpeedVideoSizes, this);
            if (invoke != coroutine_suspended) {
                com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content content5 = content4;
                str2 = str5;
                i = i3;
                content2 = content5;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2) {
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        i = this.getHighSpeedVideoFpsRanges;
        java.lang.String str6 = (java.lang.String) this.getInputFormats;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content content6 = (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListUiState.Content) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        content2 = content6;
        str2 = str6;
        invoke = obj;
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel passkeyListViewModel = this.getHighSpeedVideoSizesFor;
        java.lang.String str7 = this.getHighSpeedVideoSizes;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteSuccess passkeyDeleteSuccess = (com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteSuccess) ((arrow.core.Either.Right) either).getValue();
            boolean success = passkeyDeleteSuccess.getSuccess();
            boolean z = i != 0;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(content2);
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyDeleteSuccess);
            this.getHighSpeedVideoFpsRanges = i;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getInputSizeshNQ4ISI = 2;
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteError passkeyDeleteError = (com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteError) ((arrow.core.Either.Left) either).getValue();
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(content2);
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyDeleteError);
            this.getHighSpeedVideoFpsRanges = i;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getInputSizeshNQ4ISI = 3;
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel$deletePasskey$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel$deletePasskey$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyListViewModel$deletePasskey$1(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel passkeyListViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel$deletePasskey$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = passkeyListViewModel;
        this.getHighSpeedVideoSizes = str;
    }
}
