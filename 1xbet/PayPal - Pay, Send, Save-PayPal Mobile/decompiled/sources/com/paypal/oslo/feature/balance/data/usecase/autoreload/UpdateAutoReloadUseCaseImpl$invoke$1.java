package com.paypal.oslo.feature.balance.data.usecase.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.usecase.autoreload.UpdateAutoReloadUseCaseImpl", f = "UpdateAutoReloadUseCaseImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {34}, m = "invoke", n = {"request", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-UpdateAutoReloadUseCaseImpl$invoke$2"}, nl = {59}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes11.dex */
final class UpdateAutoReloadUseCaseImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.usecase.autoreload.UpdateAutoReloadUseCaseImpl getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateAutoReloadUseCaseImpl$invoke$1(com.paypal.oslo.feature.balance.data.usecase.autoreload.UpdateAutoReloadUseCaseImpl updateAutoReloadUseCaseImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.usecase.autoreload.UpdateAutoReloadUseCaseImpl$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = updateAutoReloadUseCaseImpl;
    }
}
