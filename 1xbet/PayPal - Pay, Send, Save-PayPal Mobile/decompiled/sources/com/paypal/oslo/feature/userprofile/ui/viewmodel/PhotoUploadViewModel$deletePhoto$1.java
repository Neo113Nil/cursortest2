package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel$deletePhoto$1", f = "PhotoUploadViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PhotoUploadViewModel$deletePhoto$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.userprofile.domain.usecase.DeleteProfilePhotoUseCase deleteProfilePhotoUseCase;
        android.content.Context context;
        java.lang.String string;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.DeletingInProgress.INSTANCE));
            deleteProfilePhotoUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            obj = deleteProfilePhotoUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Photo deleted successfully", null, null, 6, null);
            mutableStateFlow3 = photoUploadViewModel.Camera2StreamConfigurationMap;
            do {
                value3 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value3, com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Success.INSTANCE));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError photoUploadError = (com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError) ((arrow.core.Either.Left) either).getValue();
            boolean z = photoUploadError instanceof com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.ProfileUpdateFailed;
            com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.trackSystemError$default(com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getPhoto(), com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhotoManagement.SCREEN_PHOTO_DELETE_CONFIRMATION, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhotoManagement.ErrorCodes.DELETE_FAILED, null, z ? ((com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.ProfileUpdateFailed) photoUploadError).getMessage() : null, null, null, 104, null);
            if (!z) {
                context = photoUploadViewModel.getHighResolutionOutputSizeshNQ4ISI;
                string = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_something_went_wrong);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            } else {
                string = ((com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.ProfileUpdateFailed) photoUploadError).getMessage();
            }
            mutableStateFlow2 = photoUploadViewModel.Camera2StreamConfigurationMap;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Error(string)));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel$deletePhoto$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel$deletePhoto$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhotoUploadViewModel$deletePhoto$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel$deletePhoto$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = photoUploadViewModel;
    }
}
