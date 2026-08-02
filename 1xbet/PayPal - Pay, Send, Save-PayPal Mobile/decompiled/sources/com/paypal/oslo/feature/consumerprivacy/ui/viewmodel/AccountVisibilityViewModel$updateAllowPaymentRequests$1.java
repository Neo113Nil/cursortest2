package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updateAllowPaymentRequests$1", f = "AccountVisibilityViewModel.kt", i = {1, 1, 1, 2, 2, 2}, l = {121, 125, 136}, m = "invokeSuspend", n = {"this_$iv", "$i$f$fold", "$i$a$-fold-AccountVisibilityViewModel$updateAllowPaymentRequests$1$2", "this_$iv", "$i$f$fold", "$i$a$-fold-AccountVisibilityViewModel$updateAllowPaymentRequests$1$3"}, nl = {356, 127, 138}, s = {"L$0", "I$0", "I$1", "L$0", "I$0", "I$1"}, v = 2)
/* loaded from: classes12.dex */
final class AccountVisibilityViewModel$updateAllowPaymentRequests$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        if (com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel.access$refreshDataAfterMutation(r5, r6, r29) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0137, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f7, code lost:
    
        if (com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel.access$refreshDataAfterMutation(r5, r6, r29) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        if (r2 != r1) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimplifiedPolicyUseCases simplifiedPolicyUseCases;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData copy;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData copy2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputFormats.Camera2StreamConfigurationMap;
            mutableStateFlow.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content.copy$default(this.getHighSpeedVideoSizes, null, true, null, 1, null));
            simplifiedPolicyUseCases = this.getInputFormats.getHighSpeedVideoFpsRanges;
            this.getInputSizeshNQ4ISI = 1;
            invoke = simplifiedPolicyUseCases.getUpdateAllowPaymentRequests().invoke(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Ior ior = (arrow.core.Ior) invoke;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel = this.getInputFormats;
        com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content = this.getHighSpeedVideoSizes;
        boolean z = this.Camera2StreamConfigurationMap;
        if (ior instanceof arrow.core.Ior.Left) {
            mutableStateFlow4 = accountVisibilityViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow4.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content.copy$default(content, null, false, new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_banner_error_message, null, 2, 0 == true ? 1 : 0), 1, null));
        } else if (ior instanceof arrow.core.Ior.Right) {
            if (!z) {
                mutableStateFlow3 = accountVisibilityViewModel.Camera2StreamConfigurationMap;
                copy2 = r11.copy((r32 & 1) != 0 ? r11.searchPolicy : null, (r32 & 2) != 0 ? r11.allowFindByIdentifiers : null, (r32 & 4) != 0 ? r11.allowPaymentRequests : kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false), (r32 & 8) != 0 ? r11.paymentRequestsFrom : null, (r32 & 16) != 0 ? r11.allowVenmoDiscovery : null, (r32 & 32) != 0 ? r11.allowFindViaPayPalMe : null, (r32 & 64) != 0 ? r11.paypalMePersonalProfileId : null, (r32 & 128) != 0 ? r11.allowSendMoneyByEmail : null, (r32 & 256) != 0 ? r11.allowSendMoneyByPhone : null, (r32 & 512) != 0 ? r11.allowSendMoneyByName : null, (r32 & 1024) != 0 ? r11.allowSendMoneyByUsername : null, (r32 & 2048) != 0 ? r11.allowRequestMoneyByEmail : null, (r32 & 4096) != 0 ? r11.allowRequestMoneyByPhone : null, (r32 & 8192) != 0 ? r11.allowRequestMoneyByName : null, (r32 & 16384) != 0 ? content.getData().allowRequestMoneyByUsername : null);
                mutableStateFlow3.setValue(content.copy(copy2, false, null));
            } else {
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                this.getHighSpeedVideoFpsRanges = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getInputSizeshNQ4ISI = 2;
            }
        } else {
            if (!(ior instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            if (!z) {
                mutableStateFlow2 = accountVisibilityViewModel.Camera2StreamConfigurationMap;
                copy = r11.copy((r32 & 1) != 0 ? r11.searchPolicy : null, (r32 & 2) != 0 ? r11.allowFindByIdentifiers : null, (r32 & 4) != 0 ? r11.allowPaymentRequests : kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false), (r32 & 8) != 0 ? r11.paymentRequestsFrom : null, (r32 & 16) != 0 ? r11.allowVenmoDiscovery : null, (r32 & 32) != 0 ? r11.allowFindViaPayPalMe : null, (r32 & 64) != 0 ? r11.paypalMePersonalProfileId : null, (r32 & 128) != 0 ? r11.allowSendMoneyByEmail : null, (r32 & 256) != 0 ? r11.allowSendMoneyByPhone : null, (r32 & 512) != 0 ? r11.allowSendMoneyByName : null, (r32 & 1024) != 0 ? r11.allowSendMoneyByUsername : null, (r32 & 2048) != 0 ? r11.allowRequestMoneyByEmail : null, (r32 & 4096) != 0 ? r11.allowRequestMoneyByPhone : null, (r32 & 8192) != 0 ? r11.allowRequestMoneyByName : null, (r32 & 16384) != 0 ? content.getData().allowRequestMoneyByUsername : null);
                mutableStateFlow2.setValue(content.copy(copy, false, null));
            } else {
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                this.getHighSpeedVideoFpsRanges = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getInputSizeshNQ4ISI = 3;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updateAllowPaymentRequests$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updateAllowPaymentRequests$1(this.getInputFormats, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountVisibilityViewModel$updateAllowPaymentRequests$1(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel, com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content, boolean z, boolean z2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updateAllowPaymentRequests$1> continuation) {
        super(2, continuation);
        this.getInputFormats = accountVisibilityViewModel;
        this.getHighSpeedVideoSizes = content;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.Camera2StreamConfigurationMap = z2;
    }
}
