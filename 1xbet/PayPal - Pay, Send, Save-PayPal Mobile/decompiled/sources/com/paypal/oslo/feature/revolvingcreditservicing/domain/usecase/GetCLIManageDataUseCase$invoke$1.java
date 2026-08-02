package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase", f = "GetCLIManageDataUseCase.kt", i = {0, 0}, l = {31}, m = "invoke", n = {"creditProductIdentifier", "creditAccountId"}, nl = {39}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class GetCLIManageDataUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCLIManageDataUseCase$invoke$1(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase getCLIManageDataUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = getCLIManageDataUseCase;
    }
}
