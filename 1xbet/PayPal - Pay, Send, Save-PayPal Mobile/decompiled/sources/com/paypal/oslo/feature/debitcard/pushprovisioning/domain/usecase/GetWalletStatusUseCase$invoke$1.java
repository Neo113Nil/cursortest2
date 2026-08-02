package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase", f = "GetWalletStatusUseCase.kt", i = {0, 0}, l = {76}, m = "invoke", n = {"request", "$i$f$suspendCancellableCoroutine"}, nl = {86}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes12.dex */
final class GetWalletStatusUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke((com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetWalletStatusRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.starpay.api.WalletStatus>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetWalletStatusUseCase$invoke$1(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase getWalletStatusUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = getWalletStatusUseCase;
    }
}
