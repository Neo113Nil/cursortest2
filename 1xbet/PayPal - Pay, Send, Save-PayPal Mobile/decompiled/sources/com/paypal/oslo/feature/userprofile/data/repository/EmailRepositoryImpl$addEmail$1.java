package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl", f = "EmailRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {147}, m = "addEmail", n = {androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "raise$iv$iv$iv", "$this$addEmail_u24lambda_u240", "input", "mutation", "makePrimary", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-EmailRepositoryImpl$addEmail$2"}, nl = {153}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class EmailRepositoryImpl$addEmail$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    boolean getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl getOutputSizes;
    int getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputSizes.addEmail(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailRepositoryImpl$addEmail$1(com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl emailRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl$addEmail$1> continuation) {
        super(continuation);
        this.getOutputSizes = emailRepositoryImpl;
    }
}
