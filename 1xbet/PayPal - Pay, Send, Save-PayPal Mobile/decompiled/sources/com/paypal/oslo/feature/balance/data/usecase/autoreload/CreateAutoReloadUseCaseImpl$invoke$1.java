package com.paypal.oslo.feature.balance.data.usecase.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.usecase.autoreload.CreateAutoReloadUseCaseImpl", f = "CreateAutoReloadUseCaseImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {34}, m = "invoke", n = {"request", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CreateAutoReloadUseCaseImpl$invoke$2"}, nl = {42}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes11.dex */
final class CreateAutoReloadUseCaseImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.usecase.autoreload.CreateAutoReloadUseCaseImpl getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateAutoReloadUseCaseImpl$invoke$1(com.paypal.oslo.feature.balance.data.usecase.autoreload.CreateAutoReloadUseCaseImpl createAutoReloadUseCaseImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.usecase.autoreload.CreateAutoReloadUseCaseImpl$invoke$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = createAutoReloadUseCaseImpl;
    }
}
