package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/PhotoUploadViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/UploadPhotoUseCase;", "uploadPhotoUseCase", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/DeleteProfilePhotoUseCase;", "deleteProfilePhotoUseCase", "Landroid/content/Context;", "context", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/usecase/UploadPhotoUseCase;Lcom/paypal/oslo/feature/userprofile/domain/usecase/DeleteProfilePhotoUseCase;Landroid/content/Context;)V", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction;", "action", "", "handleAction", "(Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/UploadPhotoUseCase;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/DeleteProfilePhotoUseCase;", "getHighSpeedVideoSizes", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PhotoUploadViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.DeleteProfilePhotoUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.UploadPhotoUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState> uiState;

    @javax.inject.Inject
    public PhotoUploadViewModel(com.paypal.oslo.feature.userprofile.domain.usecase.UploadPhotoUseCase uploadPhotoUseCase, com.paypal.oslo.feature.userprofile.domain.usecase.DeleteProfilePhotoUseCase deleteProfilePhotoUseCase, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadPhotoUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteProfilePhotoUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = uploadPhotoUseCase;
        this.getHighSpeedVideoFpsRanges = deleteProfilePhotoUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Idle.INSTANCE);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState> getUiState() {
        return this.uiState;
    }

    public final void handleAction(com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction action) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job launch$default2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.UploadPhoto)) {
            if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.DeletePhoto)) {
                if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.CancelOperation)) {
                    if (!(action instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.Reset)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState> mutableStateFlow = this.Camera2StreamConfigurationMap;
                    while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Idle.INSTANCE)) {
                    }
                    return;
                }
                kotlinx.coroutines.Job job = this.getHighSpeedVideoSizes;
                if (job != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                this.getHighSpeedVideoSizes = null;
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState> mutableStateFlow2 = this.Camera2StreamConfigurationMap;
                while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Idle.INSTANCE)) {
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Photo operation cancelled by user", null, null, 6, null);
                return;
            }
            kotlinx.coroutines.Job job2 = this.getHighSpeedVideoSizes;
            if (job2 != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel$deletePhoto$1(this, null), 3, null);
            this.getHighSpeedVideoSizes = launch$default;
            return;
        }
        android.net.Uri photoUri = ((com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.UploadPhoto) action).getPhotoUri();
        kotlinx.coroutines.Job job3 = this.getHighSpeedVideoSizes;
        if (job3 != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job3, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel$uploadPhoto$1(this, photoUri, null), 3, null);
        this.getHighSpeedVideoSizes = launch$default2;
    }

    public static final /* synthetic */ void access$handleUploadError(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError photoUploadError, android.net.Uri uri) {
        if (photoUploadError instanceof com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UgcmValidationFailed) {
            com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UgcmValidationFailed ugcmValidationFailed = (com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.UgcmValidationFailed) photoUploadError;
            com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.trackBusinessRuleError$default(com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getPhoto(), com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhotoManagement.SCREEN_PHOTO_OPTIONS, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhotoManagement.ErrorCodes.UPLOAD_UGCM_FAILED, null, ugcmValidationFailed.getFailureMessage().getMessage(), null, 40, null);
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState> mutableStateFlow = photoUploadViewModel.Camera2StreamConfigurationMap;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.UgcmError(ugcmValidationFailed.getFailureMessage().getCode(), ugcmValidationFailed.getFailureMessage().getMessage(), uri))) {
            }
            return;
        }
        if (photoUploadError instanceof com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.FileTooLarge) {
            com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.trackBusinessRuleError$default(com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getPhoto(), com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhotoManagement.SCREEN_PHOTO_OPTIONS, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhotoManagement.ErrorCodes.UPLOAD_FILE_TOO_LARGE, null, null, null, 56, null);
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState> mutableStateFlow2 = photoUploadViewModel.Camera2StreamConfigurationMap;
            while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Error(com.paypal.oslo.feature.userprofile.domain.utils.PhotoValidationUtils.INSTANCE.getPhotoSizeExceededMessage(photoUploadViewModel.getHighResolutionOutputSizeshNQ4ISI)))) {
            }
        } else {
            if (photoUploadError instanceof com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.DmsUploadFailed) {
                com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.DmsUploadFailed dmsUploadFailed = (com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.DmsUploadFailed) photoUploadError;
                com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.trackSystemError$default(com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getPhoto(), com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhotoManagement.SCREEN_PHOTO_OPTIONS, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhotoManagement.ErrorCodes.UPLOAD_DMS_FAILED, null, dmsUploadFailed.getMessage(), null, null, 104, null);
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState> mutableStateFlow3 = photoUploadViewModel.Camera2StreamConfigurationMap;
                while (!mutableStateFlow3.compareAndSet(mutableStateFlow3.getValue(), new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Error(dmsUploadFailed.getMessage()))) {
                }
                return;
            }
            com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.trackSystemError$default(com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getPhoto(), com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhotoManagement.SCREEN_PHOTO_OPTIONS, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhotoManagement.ErrorCodes.UPLOAD_FAILED, null, null, null, null, 120, null);
            java.lang.String string = photoUploadViewModel.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState> mutableStateFlow4 = photoUploadViewModel.Camera2StreamConfigurationMap;
            while (!mutableStateFlow4.compareAndSet(mutableStateFlow4.getValue(), new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Error(string))) {
            }
        }
    }
}
