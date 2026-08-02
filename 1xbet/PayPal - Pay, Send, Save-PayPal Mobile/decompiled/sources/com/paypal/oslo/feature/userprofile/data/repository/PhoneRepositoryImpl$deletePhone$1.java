package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl", f = "PhoneRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {199, 207}, m = "deletePhone", n = {"phoneId", "raise$iv$iv$iv", "$this$deletePhone_u24lambda_u240", "input", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PhoneRepositoryImpl$deletePhone$2", "phoneId", "raise$iv$iv$iv", "$this$deletePhone_u24lambda_u240", "input", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PhoneRepositoryImpl$deletePhone$2"}, nl = {205, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class PhoneRepositoryImpl$deletePhone$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputSizes.deletePhone(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneRepositoryImpl$deletePhone$1(com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl phoneRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$deletePhone$1> continuation) {
        super(continuation);
        this.getOutputSizes = phoneRepositoryImpl;
    }
}
