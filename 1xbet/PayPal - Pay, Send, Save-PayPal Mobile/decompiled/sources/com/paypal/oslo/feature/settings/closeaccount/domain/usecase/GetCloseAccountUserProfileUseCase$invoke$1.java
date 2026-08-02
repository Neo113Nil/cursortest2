package com.paypal.oslo.feature.settings.closeaccount.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase", f = "GetCloseAccountUserProfileUseCase.kt", i = {}, l = {34}, m = "invoke", n = {}, nl = {35}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class GetCloseAccountUserProfileUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCloseAccountUserProfileUseCase$invoke$1(com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase getCloseAccountUserProfileUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = getCloseAccountUserProfileUseCase;
    }
}
