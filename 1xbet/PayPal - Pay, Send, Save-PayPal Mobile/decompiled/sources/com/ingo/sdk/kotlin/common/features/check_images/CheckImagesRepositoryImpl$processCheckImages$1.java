package com.ingo.sdk.kotlin.common.features.check_images;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepositoryImpl", f = "CheckImagesRepository.kt", i = {0, 0}, l = {67, 69}, m = "processCheckImages", n = {"frontImageAsBase64", "backImageAsBase64"}, s = {"L$0", "L$1"})
/* loaded from: classes9.dex */
final class CheckImagesRepositoryImpl$processCheckImages$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepositoryImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.processCheckImages(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckImagesRepositoryImpl$processCheckImages$1(com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepositoryImpl checkImagesRepositoryImpl, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepositoryImpl$processCheckImages$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = checkImagesRepositoryImpl;
    }
}
