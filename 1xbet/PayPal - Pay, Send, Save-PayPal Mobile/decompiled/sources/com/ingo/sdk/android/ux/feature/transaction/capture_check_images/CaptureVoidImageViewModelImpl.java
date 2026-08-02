package com.ingo.sdk.android.ux.feature.transaction.capture_check_images;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/transaction/capture_check_images/CaptureVoidImageViewModelImpl;", "Lcom/ingo/sdk/kotlin/common/platform/BaseViewModel;", "Lcom/ingo/sdk/kotlin/common/features/void_image/VoidImageViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScopeProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "transactionReferenceNumber", "voidImageAsBase64", "", "uploadVoidImage", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/ingo/sdk/kotlin/common/features/void_image/UploadVoidImageUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/ingo/sdk/kotlin/common/features/void_image/UploadVoidImageUseCase;", "getHighSpeedVideoSizes", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ingo/sdk/kotlin/common/features/void_image/model/VoidImageResponse;", "voidImageResponse", "Landroidx/lifecycle/MutableLiveData;", "getVoidImageResponse", "()Landroidx/lifecycle/MutableLiveData;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CaptureVoidImageViewModelImpl extends com.ingo.sdk.kotlin.common.platform.BaseViewModel implements com.ingo.sdk.kotlin.common.features.void_image.VoidImageViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.features.void_image.UploadVoidImageUseCase getHighSpeedVideoSizes;
    private final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.void_image.model.VoidImageResponse> voidImageResponse;

    public /* synthetic */ CaptureVoidImageViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : coroutineScope);
    }

    public CaptureVoidImageViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope, 0L, 2, null);
        this.getHighSpeedVideoSizes = new com.ingo.sdk.kotlin.common.features.void_image.UploadVoidImageUseCase();
        this.voidImageResponse = new androidx.view.MutableLiveData<>();
    }

    public final androidx.view.MutableLiveData<com.ingo.sdk.kotlin.common.features.void_image.model.VoidImageResponse> getVoidImageResponse() {
        return this.voidImageResponse;
    }

    @Override // com.ingo.sdk.kotlin.common.features.void_image.VoidImageViewModel
    public final void uploadVoidImage(final java.lang.String transactionReferenceNumber, final java.lang.String voidImageAsBase64) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionReferenceNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(voidImageAsBase64, "");
        runSingleUseCase(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl.$r8$lambda$MplcSKu1Hw6bQOfeeTjn0EXb76M(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl.this, transactionReferenceNumber, voidImageAsBase64);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Fc5wCbGAPQzjNumr2w8QILNjyuo(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl captureVoidImageViewModelImpl, com.ingo.sdk.kotlin.common.features.void_image.model.VoidImageResponse voidImageResponse) {
        captureVoidImageViewModelImpl.voidImageResponse.postValue(voidImageResponse);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JnQvDmlaHDF_-KSX_cm8lQVNBCE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10680$r8$lambda$JnQvDmlaHDF_KSX_cm8lQVNBCE(final com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl captureVoidImageViewModelImpl, com.ingo.sdk.kotlin.common.core.functional.Either either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        either.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl.m10681$r8$lambda$w8oif74TMosmBLkHfEg0c_jRo(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl.$r8$lambda$UI0YTu8QYI_Xpzck5K8qFm1EYoI(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl.this, (com.ingo.sdk.kotlin.common.features.void_image.model.VoidImageResponse) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MplcSKu1Hw6bQOfeeTjn0EXb76M(final com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl captureVoidImageViewModelImpl, java.lang.String str, java.lang.String str2) {
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Running UploadCheckImagesUseCase!", null, 2, null);
        captureVoidImageViewModelImpl.getHighSpeedVideoSizes.invoke(new com.ingo.sdk.kotlin.common.features.void_image.UploadVoidImageUseCaseParameters(str, str2), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl.m10680$r8$lambda$JnQvDmlaHDF_KSX_cm8lQVNBCE(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.functional.Either) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UI0YTu8QYI_Xpzck5K8qFm1EYoI(final com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl captureVoidImageViewModelImpl, final com.ingo.sdk.kotlin.common.features.void_image.model.VoidImageResponse voidImageResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(voidImageResponse, "");
        captureVoidImageViewModelImpl.onUseCaseSuccess(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl.$r8$lambda$Fc5wCbGAPQzjNumr2w8QILNjyuo(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl.this, voidImageResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$w8oif74TMo-s-mBLkHfEg0c_jRo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10681$r8$lambda$w8oif74TMosmBLkHfEg0c_jRo(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl captureVoidImageViewModelImpl, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        com.ingo.sdk.kotlin.common.platform.BaseViewModel.onUseCaseFailure$default(captureVoidImageViewModelImpl, failure, null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CaptureVoidImageViewModelImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
