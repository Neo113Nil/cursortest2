package com.paypal.oslo.feature.userprofile.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/usecase/UploadPhotoUseCase;", "", "Lcom/paypal/oslo/feature/userprofile/domain/repository/PhotoRepository;", "photoRepository", "Landroid/content/Context;", "context", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/repository/PhotoRepository;Landroid/content/Context;)V", "Landroid/net/Uri;", "photoUri", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadResult;", "invoke", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/userprofile/domain/repository/PhotoRepository;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UploadPhotoUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public UploadPhotoUseCase(com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository photoRepository, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photoRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = photoRepository;
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    public final java.lang.Object invoke(android.net.Uri uri, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError, com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadResult>> continuation) {
        arrow.core.Either left;
        com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError validateFileFormat = com.paypal.oslo.feature.userprofile.domain.utils.PhotoValidationUtils.INSTANCE.validateFileFormat(uri, this.getHighSpeedVideoFpsRangesFor);
        if (validateFileFormat == null) {
            validateFileFormat = com.paypal.oslo.feature.userprofile.domain.utils.PhotoValidationUtils.INSTANCE.validateFileSize(uri, this.getHighSpeedVideoFpsRangesFor);
        }
        return (validateFileFormat == null || (left = arrow.core.EitherKt.left(validateFileFormat)) == null) ? this.Camera2StreamConfigurationMap.uploadProfilePhoto(uri, continuation) : left;
    }
}
