package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.UpdateCardRepositoryImpl", f = "UpdateCardRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {94}, m = "performUpdateCard", n = {"payload", "raise$iv$iv$iv", "$this$performUpdateCard_u24lambda_u240", "cardUpdateInput", "nameInput", "cardholderInput", "addressInput", "mutation", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-UpdateCardRepositoryImpl$performUpdateCard$2"}, nl = {95}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class UpdateCardRepositoryImpl$performUpdateCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.UpdateCardRepositoryImpl isOutputSupportedForhNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateCardRepositoryImpl$performUpdateCard$1(com.paypal.oslo.feature.inappcheckout.data.repository.UpdateCardRepositoryImpl updateCardRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.UpdateCardRepositoryImpl$performUpdateCard$1> continuation) {
        super(continuation);
        this.isOutputSupportedForhNQ4ISI = updateCardRepositoryImpl;
    }
}
