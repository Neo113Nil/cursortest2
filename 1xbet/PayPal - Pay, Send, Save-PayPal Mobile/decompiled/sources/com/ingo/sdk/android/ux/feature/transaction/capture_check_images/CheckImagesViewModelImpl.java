package com.ingo.sdk.android.ux.feature.transaction.capture_check_images;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/transaction/capture_check_images/CheckImagesViewModelImpl;", "Lcom/ingo/sdk/kotlin/common/platform/BaseViewModel;", "Lcom/ingo/sdk/kotlin/common/features/check_images/CheckImagesViewModel;", "<init>", "()V", "", "frontImageBase64", "backImageBase64", "", "uploadCheckImages", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/ingo/sdk/kotlin/common/features/check_images/UploadCheckImagesUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/ingo/sdk/kotlin/common/features/check_images/UploadCheckImagesUseCase;", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ingo/sdk/kotlin/common/features/check_images/model/OcrResponse;", "ocrResponse", "Landroidx/lifecycle/MutableLiveData;", "getOcrResponse", "()Landroidx/lifecycle/MutableLiveData;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CheckImagesViewModelImpl extends com.ingo.sdk.kotlin.common.platform.BaseViewModel implements com.ingo.sdk.kotlin.common.features.check_images.CheckImagesViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase getHighSpeedVideoFpsRangesFor;
    private final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse> ocrResponse;

    public CheckImagesViewModelImpl() {
        super(null, 0L, 3, null);
        this.getHighSpeedVideoFpsRangesFor = new com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase();
        this.ocrResponse = new androidx.view.MutableLiveData<>();
    }

    public final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse> getOcrResponse() {
        return this.ocrResponse;
    }

    @Override // com.ingo.sdk.kotlin.common.features.check_images.CheckImagesViewModel
    public final void uploadCheckImages(final java.lang.String frontImageBase64, final java.lang.String backImageBase64) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frontImageBase64, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backImageBase64, "");
        runSingleUseCase(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl.m10682$r8$lambda$3jp3D1pwEa4ZTdxQo3GagC3iT8(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl.this, frontImageBase64, backImageBase64);
            }
        });
    }

    /* renamed from: $r8$lambda$3-jp3D1pwEa4ZTdxQo3GagC3iT8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10682$r8$lambda$3jp3D1pwEa4ZTdxQo3GagC3iT8(final com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl checkImagesViewModelImpl, java.lang.String str, java.lang.String str2) {
        checkImagesViewModelImpl.getHighSpeedVideoFpsRangesFor.invoke(new kotlin.Pair(str, str2), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl.$r8$lambda$FmT6Pg8S0asg8VXmsOn38K4Q3TY(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.functional.Either) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5AzJou4LbncDfKA0RX6_R8BXU0k(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl checkImagesViewModelImpl, com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse ocrResponse) {
        checkImagesViewModelImpl.ocrResponse.postValue(ocrResponse);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AudrjKb8NA9X3S5xW4gmPnmTIvk(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl checkImagesViewModelImpl, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        com.ingo.sdk.kotlin.common.platform.BaseViewModel.onUseCaseFailure$default(checkImagesViewModelImpl, failure, null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FmT6Pg8S0asg8VXmsOn38K4Q3TY(final com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl checkImagesViewModelImpl, com.ingo.sdk.kotlin.common.core.functional.Either either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        either.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl.$r8$lambda$AudrjKb8NA9X3S5xW4gmPnmTIvk(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl.m10683$r8$lambda$nU0dlNLbcor8ZBoa3ZD8hZziwc(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl.this, (com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nU0dlNLbcor8ZBoa3ZD8hZzi-wc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10683$r8$lambda$nU0dlNLbcor8ZBoa3ZD8hZziwc(final com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl checkImagesViewModelImpl, final com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse ocrResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ocrResponse, "");
        checkImagesViewModelImpl.onUseCaseSuccess(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl.$r8$lambda$5AzJou4LbncDfKA0RX6_R8BXU0k(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CheckImagesViewModelImpl.this, ocrResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
