package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl", f = "PhotoRepositoryImpl.kt", i = {0}, l = {163}, m = "uploadProfilePhoto", n = {"photoUri"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class PhotoRepositoryImpl$uploadProfilePhoto$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.uploadProfilePhoto(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhotoRepositoryImpl$uploadProfilePhoto$1(com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl photoRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$uploadProfilePhoto$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = photoRepositoryImpl;
    }
}
