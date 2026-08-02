package com.paypal.oslo.feature.home.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase", f = "GetAccountSnapshotSectionUseCase.kt", i = {}, l = {51}, m = "invoke", n = {}, nl = {87}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class GetAccountSnapshotSectionUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetAccountSnapshotSectionUseCase$invoke$1(com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase getAccountSnapshotSectionUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = getAccountSnapshotSectionUseCase;
    }
}
