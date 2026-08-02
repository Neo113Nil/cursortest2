package com.ingo.sdk.kotlin.common.features.check_images;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase", f = "UploadCheckImagesUseCase.kt", i = {}, l = {18}, m = "run", n = {}, s = {})
/* loaded from: classes9.dex */
final class UploadCheckImagesUseCase$run$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.run((kotlin.Pair<java.lang.String, java.lang.String>) null, (kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadCheckImagesUseCase$run$1(com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase uploadCheckImagesUseCase, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase$run$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = uploadCheckImagesUseCase;
    }
}
