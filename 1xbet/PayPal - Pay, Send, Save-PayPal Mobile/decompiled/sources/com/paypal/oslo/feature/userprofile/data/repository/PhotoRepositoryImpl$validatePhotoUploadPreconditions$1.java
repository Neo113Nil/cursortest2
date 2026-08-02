package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl", f = "PhotoRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, 236}, m = "validatePhotoUploadPreconditions", n = {"photoUri", "raise$iv$iv$iv", "$this$validatePhotoUploadPreconditions_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PhotoRepositoryImpl$validatePhotoUploadPreconditions$2", "photoUri", "raise$iv$iv$iv", "$this$validatePhotoUploadPreconditions_u24lambda_u240", "userState", "user", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PhotoRepositoryImpl$validatePhotoUploadPreconditions$2", "photoUri", "raise$iv$iv$iv", "$this$validatePhotoUploadPreconditions_u24lambda_u240", "userState", "file", "user", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PhotoRepositoryImpl$validatePhotoUploadPreconditions$2"}, nl = {211, 236, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class PhotoRepositoryImpl$validatePhotoUploadPreconditions$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getOutputStallDuration.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhotoRepositoryImpl$validatePhotoUploadPreconditions$1(com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl photoRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl$validatePhotoUploadPreconditions$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = photoRepositoryImpl;
    }
}
