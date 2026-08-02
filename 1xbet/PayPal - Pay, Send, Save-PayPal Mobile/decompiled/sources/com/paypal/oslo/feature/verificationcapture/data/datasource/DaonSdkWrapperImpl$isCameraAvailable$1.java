package com.paypal.oslo.feature.verificationcapture.data.datasource;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl", f = "DaonSdkWrapper.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, m = "isCameraAvailable", n = {"context"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class DaonSdkWrapperImpl$isCameraAvailable$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.isCameraAvailable(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DaonSdkWrapperImpl$isCameraAvailable$1(com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl daonSdkWrapperImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl$isCameraAvailable$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = daonSdkWrapperImpl;
    }
}
