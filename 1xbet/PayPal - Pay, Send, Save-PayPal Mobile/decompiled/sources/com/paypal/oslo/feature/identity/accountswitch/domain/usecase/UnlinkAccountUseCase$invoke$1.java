package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase", f = "UnlinkAccountUseCase.kt", i = {1, 1, 2, 2}, l = {51, 65, 73}, m = "invoke", n = {"unlinkResult", "unlinkSuccess", "unlinkResult", "unlinkSuccess"}, nl = {54, 66, 74}, s = {"L$0", "Z$0", "L$0", "Z$0"}, v = 2)
/* loaded from: classes12.dex */
final class UnlinkAccountUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnlinkAccountUseCase$invoke$1(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase unlinkAccountUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = unlinkAccountUseCase;
    }
}
