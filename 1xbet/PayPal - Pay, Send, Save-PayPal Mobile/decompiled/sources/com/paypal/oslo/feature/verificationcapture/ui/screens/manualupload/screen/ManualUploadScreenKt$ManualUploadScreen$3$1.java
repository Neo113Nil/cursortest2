package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$3$1", f = "ManualUploadScreen.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, nl = {309}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ManualUploadScreenKt$ManualUploadScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<kotlin.Pair<java.lang.String, java.lang.String>> getHighSpeedVideoSizes;
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.util.List<android.net.Uri>> getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale getInputSizeshNQ4ISI;
    final /* synthetic */ int getOutputFormats;
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.PickVisualMediaRequest, java.util.List<android.net.Uri>> getOutputMinFrameDuration;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> getOutputSizes;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.PickVisualMediaRequest, android.net.Uri> getOutputStallDuration;
    final /* synthetic */ java.lang.String getOutputStallDurationlomOqCM;
    int isOutputSupportedFor;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.isOutputSupportedFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.isOutputSupportedFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collect(kotlinx.coroutines.flow.FlowKt.onEach(this.unwrapAs.getUiEffects(), new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getOutputStallDuration, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.getOutputStallDurationlomOqCM, this.getOutputSizes, this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoSizes, this.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, null)), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$3$1$1", f = "ManualUploadScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.runtime.MutableState<kotlin.Pair<java.lang.String, java.lang.String>> getHighSpeedVideoSizes;
        final /* synthetic */ int getHighSpeedVideoSizesFor;
        final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.PickVisualMediaRequest, java.util.List<android.net.Uri>> getInputFormats;
        final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.util.List<android.net.Uri>> getInputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getOutputFormats;
        final /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale getOutputMinFrameDuration;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getOutputMinFrameDurationlomOqCM;
        final /* synthetic */ java.lang.String getOutputSizes;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.PickVisualMediaRequest, android.net.Uri> getOutputStallDuration;
        final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> getOutputStallDurationlomOqCM;
        /* synthetic */ java.lang.Object isOutputSupportedForhNQ4ISI;
        int unwrapAs;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect manualUploadUiEffect = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect) this.isOutputSupportedForhNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.unwrapAs != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!(manualUploadUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowUploadMethodDialog)) {
                if (!(manualUploadUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowDeleteConfirmDialog)) {
                    if (!(manualUploadUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowPermissionDialog)) {
                        if (manualUploadUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenCamera) {
                            this.Camera2StreamConfigurationMap.launch("android.permission.CAMERA");
                        } else if (manualUploadUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenGallery) {
                            if (this.getHighSpeedVideoSizesFor == 1) {
                                this.getOutputStallDuration.launch(androidx.view.result.PickVisualMediaRequestKt.PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
                            } else {
                                this.getInputFormats.launch(androidx.view.result.PickVisualMediaRequestKt.PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
                            }
                        } else if (manualUploadUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenFilePicker) {
                            this.getInputSizeshNQ4ISI.launch("*/*");
                        } else if (manualUploadUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.LaunchSdkCapture) {
                            if (androidx.core.content.ContextCompat.checkSelfPermission(this.getHighSpeedVideoFpsRangesFor, "android.permission.CAMERA") == 0) {
                                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getOutputFormats;
                                if (appNavigator != null) {
                                    java.lang.String str = this.getOutputSizes;
                                    final java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
                                    final java.lang.String str3 = this.getHighResolutionOutputSizeshNQ4ISI;
                                    final com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale = this.getOutputMinFrameDuration;
                                    appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$3$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj2) {
                                            return com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$3$1.AnonymousClass1.getHighSpeedVideoSizes(str2, str3, supportedLocale, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                                        }
                                    });
                                }
                            } else {
                                this.getOutputStallDurationlomOqCM.launch("android.permission.CAMERA");
                            }
                        } else if (manualUploadUiEffect instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NavigateToSettings) {
                            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(android.net.Uri.fromParts("package", this.getHighSpeedVideoFpsRangesFor.getPackageName(), null));
                            this.getHighSpeedVideoFpsRangesFor.startActivity(intent);
                        }
                    } else {
                        this.getOutputMinFrameDurationlomOqCM.setValue(((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowPermissionDialog) manualUploadUiEffect).getPermission());
                    }
                } else {
                    com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowDeleteConfirmDialog showDeleteConfirmDialog = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowDeleteConfirmDialog) manualUploadUiEffect;
                    this.getHighSpeedVideoSizes.setValue(kotlin.TuplesKt.to(showDeleteConfirmDialog.getDocumentId(), showDeleteConfirmDialog.getDocumentName()));
                }
            } else {
                this.getOutputSizeshNQ4ISI.setValue(java.lang.Boolean.valueOf(true));
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination(str, str2, supportedLocale));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect manualUploadUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$3$1.AnonymousClass1) create(manualUploadUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$3$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$3$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getOutputStallDuration, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getOutputSizes, this.getOutputStallDurationlomOqCM, this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, continuation);
            anonymousClass1.isOutputSupportedForhNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> managedActivityResultLauncher, int i, androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.PickVisualMediaRequest, android.net.Uri> managedActivityResultLauncher2, androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.PickVisualMediaRequest, java.util.List<android.net.Uri>> managedActivityResultLauncher3, androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.util.List<android.net.Uri>> managedActivityResultLauncher4, android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> managedActivityResultLauncher5, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<kotlin.Pair<java.lang.String, java.lang.String>> mutableState2, androidx.compose.runtime.MutableState<java.lang.String> mutableState3, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$3$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = managedActivityResultLauncher;
            this.getHighSpeedVideoSizesFor = i;
            this.getOutputStallDuration = managedActivityResultLauncher2;
            this.getInputFormats = managedActivityResultLauncher3;
            this.getInputSizeshNQ4ISI = managedActivityResultLauncher4;
            this.getHighSpeedVideoFpsRangesFor = context;
            this.getOutputFormats = appNavigator;
            this.getOutputSizes = str;
            this.getOutputStallDurationlomOqCM = managedActivityResultLauncher5;
            this.getOutputSizeshNQ4ISI = mutableState;
            this.getHighSpeedVideoSizes = mutableState2;
            this.getOutputMinFrameDurationlomOqCM = mutableState3;
            this.getHighSpeedVideoFpsRanges = str2;
            this.getHighResolutionOutputSizeshNQ4ISI = str3;
            this.getOutputMinFrameDuration = supportedLocale;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$3$1(this.unwrapAs, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getOutputStallDuration, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.getOutputStallDurationlomOqCM, this.getOutputSizes, this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoSizes, this.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManualUploadScreenKt$ManualUploadScreen$3$1(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel manualUploadViewModel, androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> managedActivityResultLauncher, int i, androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.PickVisualMediaRequest, android.net.Uri> managedActivityResultLauncher2, androidx.view.compose.ManagedActivityResultLauncher<androidx.view.result.PickVisualMediaRequest, java.util.List<android.net.Uri>> managedActivityResultLauncher3, androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.util.List<android.net.Uri>> managedActivityResultLauncher4, android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> managedActivityResultLauncher5, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<kotlin.Pair<java.lang.String, java.lang.String>> mutableState2, androidx.compose.runtime.MutableState<java.lang.String> mutableState3, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$3$1> continuation) {
        super(2, continuation);
        this.unwrapAs = manualUploadViewModel;
        this.getHighSpeedVideoFpsRangesFor = managedActivityResultLauncher;
        this.getOutputFormats = i;
        this.getOutputStallDuration = managedActivityResultLauncher2;
        this.getOutputMinFrameDuration = managedActivityResultLauncher3;
        this.getHighSpeedVideoSizesFor = managedActivityResultLauncher4;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.getInputFormats = appNavigator;
        this.getOutputStallDurationlomOqCM = str;
        this.getOutputSizes = managedActivityResultLauncher5;
        this.getOutputMinFrameDurationlomOqCM = mutableState;
        this.getHighSpeedVideoSizes = mutableState2;
        this.getOutputSizeshNQ4ISI = mutableState3;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRanges = str3;
        this.getInputSizeshNQ4ISI = supportedLocale;
    }
}
