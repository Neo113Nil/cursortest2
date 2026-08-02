package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updatePaymentRequestsFrom$1", f = "AccountVisibilityViewModel.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, nl = {161}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AccountVisibilityViewModel$updatePaymentRequestsFrom$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.Boolean Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.Boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
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
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputFormats.Camera2StreamConfigurationMap;
            mutableStateFlow.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content.copy$default(this.getHighResolutionOutputSizeshNQ4ISI, null, true, null, 1, null));
            simplifiedPolicyUseCases = this.getInputFormats.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            invoke = simplifiedPolicyUseCases.getUpdatePaymentRequestsFrom().invoke(this.getHighSpeedVideoFpsRanges.booleanValue(), this.Camera2StreamConfigurationMap.booleanValue(), this.getHighSpeedVideoSizes, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Ior ior = (arrow.core.Ior) invoke;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel = this.getInputFormats;
        com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFromType = this.getHighSpeedVideoSizes;
        if (ior instanceof arrow.core.Ior.Left) {
            mutableStateFlow4 = accountVisibilityViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow4.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content.copy$default(content, null, false, new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_banner_error_message, null, 2, 0 == true ? 1 : 0), 1, null));
        } else if (ior instanceof arrow.core.Ior.Right) {
            mutableStateFlow3 = accountVisibilityViewModel.Camera2StreamConfigurationMap;
            copy2 = r4.copy((r32 & 1) != 0 ? r4.searchPolicy : null, (r32 & 2) != 0 ? r4.allowFindByIdentifiers : null, (r32 & 4) != 0 ? r4.allowPaymentRequests : null, (r32 & 8) != 0 ? r4.paymentRequestsFrom : paymentRequestsFromType, (r32 & 16) != 0 ? r4.allowVenmoDiscovery : null, (r32 & 32) != 0 ? r4.allowFindViaPayPalMe : null, (r32 & 64) != 0 ? r4.paypalMePersonalProfileId : null, (r32 & 128) != 0 ? r4.allowSendMoneyByEmail : null, (r32 & 256) != 0 ? r4.allowSendMoneyByPhone : null, (r32 & 512) != 0 ? r4.allowSendMoneyByName : null, (r32 & 1024) != 0 ? r4.allowSendMoneyByUsername : null, (r32 & 2048) != 0 ? r4.allowRequestMoneyByEmail : null, (r32 & 4096) != 0 ? r4.allowRequestMoneyByPhone : null, (r32 & 8192) != 0 ? r4.allowRequestMoneyByName : null, (r32 & 16384) != 0 ? content.getData().allowRequestMoneyByUsername : null);
            mutableStateFlow3.setValue(content.copy(copy2, false, null));
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            mutableStateFlow2 = accountVisibilityViewModel.Camera2StreamConfigurationMap;
            copy = r4.copy((r32 & 1) != 0 ? r4.searchPolicy : null, (r32 & 2) != 0 ? r4.allowFindByIdentifiers : null, (r32 & 4) != 0 ? r4.allowPaymentRequests : null, (r32 & 8) != 0 ? r4.paymentRequestsFrom : paymentRequestsFromType, (r32 & 16) != 0 ? r4.allowVenmoDiscovery : null, (r32 & 32) != 0 ? r4.allowFindViaPayPalMe : null, (r32 & 64) != 0 ? r4.paypalMePersonalProfileId : null, (r32 & 128) != 0 ? r4.allowSendMoneyByEmail : null, (r32 & 256) != 0 ? r4.allowSendMoneyByPhone : null, (r32 & 512) != 0 ? r4.allowSendMoneyByName : null, (r32 & 1024) != 0 ? r4.allowSendMoneyByUsername : null, (r32 & 2048) != 0 ? r4.allowRequestMoneyByEmail : null, (r32 & 4096) != 0 ? r4.allowRequestMoneyByPhone : null, (r32 & 8192) != 0 ? r4.allowRequestMoneyByName : null, (r32 & 16384) != 0 ? content.getData().allowRequestMoneyByUsername : null);
            mutableStateFlow2.setValue(content.copy(copy, false, null));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updatePaymentRequestsFrom$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updatePaymentRequestsFrom$1(this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountVisibilityViewModel$updatePaymentRequestsFrom$1(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel, com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content, java.lang.Boolean bool, java.lang.Boolean bool2, com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFromType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updatePaymentRequestsFrom$1> continuation) {
        super(2, continuation);
        this.getInputFormats = accountVisibilityViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = content;
        this.getHighSpeedVideoFpsRanges = bool;
        this.Camera2StreamConfigurationMap = bool2;
        this.getHighSpeedVideoSizes = paymentRequestsFromType;
    }
}
