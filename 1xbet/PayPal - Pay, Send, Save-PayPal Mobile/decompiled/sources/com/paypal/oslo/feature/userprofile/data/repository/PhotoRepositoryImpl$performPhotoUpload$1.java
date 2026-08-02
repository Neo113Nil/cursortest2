package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl", f = "PhotoRepositoryImpl.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {179, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 188, 192}, m = "performPhotoUpload", n = {"photoUri", "photoUri", "validationResult", "this_$iv", "file", "metadata", "user", "$i$f$fold", "$i$a$-fold-PhotoRepositoryImpl$performPhotoUpload$3", "photoUri", "validationResult", "this_$iv", "file", "metadata", "user", "this_$iv", "downloadLink", "$i$f$fold", "$i$a$-fold-PhotoRepositoryImpl$performPhotoUpload$3", "$i$f$fold", "$i$a$-fold-PhotoRepositoryImpl$performPhotoUpload$3$2", "photoUri", "validationResult", "this_$iv", "file", "metadata", "user", "this_$iv", "downloadLink", "this_$iv", "it", "$i$f$fold", "$i$a$-fold-PhotoRepositoryImpl$performPhotoUpload$3", "$i$f$fold", "$i$a$-fold-PhotoRepositoryImpl$performPhotoUpload$3$2", "$i$f$fold", "$i$a$-fold-PhotoRepositoryImpl$performPhotoUpload$3$2$2"}, nl = {181, 431, 433, 193}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5"}, v = 2)
/* loaded from: classes5.dex */
final class PhotoRepositoryImpl$performPhotoUpload$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    /* synthetic */ java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    java.lang.Object isOutputSupportedFor;
    int isOutputSupportedForhNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl toString;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getValidOutputFormatsForInputhNQ4ISI = obj;
        this.isOutputSupportedForhNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.toString.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhotoRepositoryImpl$performPhotoUpload$1(com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl photoRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$performPhotoUpload$1> continuation) {
        super(continuation);
        this.toString = photoRepositoryImpl;
    }
}
