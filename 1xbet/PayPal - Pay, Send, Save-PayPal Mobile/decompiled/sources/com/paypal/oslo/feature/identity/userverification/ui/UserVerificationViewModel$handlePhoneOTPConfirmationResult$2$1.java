package com.paypal.oslo.feature.identity.userverification.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$handlePhoneOTPConfirmationResult$2$1", f = "UserVerificationViewModel.kt", i = {}, l = {723}, m = "invokeSuspend", n = {}, nl = {724}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class UserVerificationViewModel$handlePhoneOTPConfirmationResult$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel getHighSpeedVideoFpsRanges;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        r5 = r4.getHighSpeedVideoFpsRanges.getValidOutputFormatsForInputhNQ4ISI;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.model.PhoneNumber phoneNumber;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            obj = com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel.access$validateCredential(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue() && phoneNumber != null) {
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.accessartificialFrame;
            mutableStateFlow.setValue(new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUp(new com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential(phoneNumber.getNationalNumber(), "+".concat(java.lang.String.valueOf(phoneNumber.getCountryCode())), com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource.USER)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$handlePhoneOTPConfirmationResult$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$handlePhoneOTPConfirmationResult$2$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserVerificationViewModel$handlePhoneOTPConfirmationResult$2$1(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel userVerificationViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$handlePhoneOTPConfirmationResult$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = userVerificationViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
