package com.paypal.oslo.feature.userprofile.ui.screens.photo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$HandleUploadStateChanges$1$1", f = "ProfilePhotoOptionsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ProfilePhotoOptionsScreenKt$HandleUploadStateChanges$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState> getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel getHighSpeedVideoSizesFor;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState photoUploadUiState = this.Camera2StreamConfigurationMap;
        if (photoUploadUiState instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Success) {
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$HandleUploadStateChanges$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$HandleUploadStateChanges$1$1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            this.getHighSpeedVideoSizesFor.handleAction(com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.Reset.INSTANCE);
        } else if (photoUploadUiState instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Error) {
            android.widget.Toast.makeText(this.getHighSpeedVideoFpsRanges, ((com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Error) photoUploadUiState).getMessage(), 1).show();
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$HandleUploadStateChanges$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$HandleUploadStateChanges$1$1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            this.getHighSpeedVideoSizesFor.handleAction(com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.Reset.INSTANCE);
        } else if (photoUploadUiState instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.UgcmError) {
            com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt.access$HandleUgcmError((com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.UgcmError) photoUploadUiState, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges);
        } else if ((photoUploadUiState instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Idle) && (this.getHighSpeedVideoSizes.getValue() instanceof com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.UgcmError) && this.getHighSpeedVideoFpsRangesFor.getValue().booleanValue()) {
            this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$HandleUploadStateChanges$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$HandleUploadStateChanges$1$1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            this.getHighSpeedVideoFpsRangesFor.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
        }
        this.getHighSpeedVideoSizes.setValue(this.Camera2StreamConfigurationMap);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$HandleUploadStateChanges$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$HandleUploadStateChanges$1$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfilePhotoOptionsScreenKt$HandleUploadStateChanges$1$1(com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState photoUploadUiState, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, android.content.Context context, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$HandleUploadStateChanges$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = photoUploadUiState;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoSizesFor = photoUploadViewModel;
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.getHighSpeedVideoSizes = mutableState2;
    }
}
