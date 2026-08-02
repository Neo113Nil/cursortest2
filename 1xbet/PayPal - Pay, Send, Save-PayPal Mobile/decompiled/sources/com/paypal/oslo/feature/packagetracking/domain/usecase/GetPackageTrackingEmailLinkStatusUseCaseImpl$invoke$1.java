package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageTrackingEmailLinkStatusUseCaseImpl", f = "GetPackageTrackingEmailLinkStatusUseCaseImpl.kt", i = {0}, l = {32}, m = "invoke", n = {"forceRefresh"}, nl = {33}, s = {"Z$0"}, v = 2)
/* loaded from: classes13.dex */
final class GetPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageTrackingEmailLinkStatusUseCaseImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1(com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageTrackingEmailLinkStatusUseCaseImpl getPackageTrackingEmailLinkStatusUseCaseImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageTrackingEmailLinkStatusUseCaseImpl$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = getPackageTrackingEmailLinkStatusUseCaseImpl;
    }
}
