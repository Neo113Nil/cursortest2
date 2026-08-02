package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$1", f = "ActivationCodeSubmissionHandler.kt", i = {0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5}, l = {89, 94, 104, 115, 118, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, m = "emit", n = {"authenticationCode", "authenticationCode", "result", "authenticationCode", "result", "successResult", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "authenticationCode", "result", "successResult", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "authenticationCode", "result", "successResult", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "authenticationCode", "result", "successResult", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "otpError"}, nl = {92, 95, 105, 118, 130, 130}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes15.dex */
final class ActivationCodeSubmissionHandler$invoke$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1.AnonymousClass1<T> getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ActivationCodeSubmissionHandler$invoke$1$1$emit$1(com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$1$emit$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = anonymousClass1;
    }
}
