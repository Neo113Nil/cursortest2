package com.paypal.oslo.feature.identity.changepassword.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl", f = "ChangePasswordRepositoryImpl.kt", i = {0, 0, 0, 0, 0}, l = {47}, m = "changePassword", n = {"currentPassword", androidx.autofill.HintConstants.AUTOFILL_HINT_NEW_PASSWORD, "confirmNewPassword", "input", "mutation"}, nl = {108}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes12.dex */
final class ChangePasswordRepositoryImpl$changePassword$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.changePassword(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangePasswordRepositoryImpl$changePassword$1(com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl changePasswordRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl$changePassword$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = changePasswordRepositoryImpl;
    }
}
