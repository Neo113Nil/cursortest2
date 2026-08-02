package com.ingo.sdk.android.ux.feature.manual_verification;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class CaptureIdentityDocumentsFragment$onCreateView$1$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.ui.platform.ComposeView getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.runtime.MutableState mutableState2;
        androidx.compose.runtime.MutableState mutableState3;
        androidx.compose.runtime.MutableState mutableState4;
        androidx.compose.runtime.MutableState showCameraRationaleDialog;
        androidx.compose.runtime.MutableState showCameraDeniedDialog;
        androidx.compose.runtime.Composer composer2 = composer;
        if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoSdkTheme.class));
            if (obj == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoSdkTheme");
            }
            mutableState = this.getHighSpeedVideoFpsRangesFor.getInputFormats;
            final com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$onCreateView$1$1.getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment.this);
                }
            };
            final com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment2 = this.getHighSpeedVideoFpsRangesFor;
            final androidx.compose.ui.platform.ComposeView composeView = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$onCreateView$1$1.getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment.this, composeView);
                }
            };
            final com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment3 = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$onCreateView$1$1.getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment.this);
                }
            };
            final com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment4 = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function0 function04 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$onCreateView$1$1.getOutputMinFrameDuration(com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment.this);
                }
            };
            final com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment5 = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function0 function05 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$onCreateView$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$onCreateView$1$1.getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment.this);
                }
            };
            final com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment6 = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function0 function06 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$onCreateView$1$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$onCreateView$1$1.Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment.this);
                }
            };
            mutableState2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            mutableState3 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            mutableState4 = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
            showCameraRationaleDialog = this.getHighSpeedVideoFpsRangesFor.getShowCameraRationaleDialog();
            final com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment7 = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function0 function07 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$onCreateView$1$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$onCreateView$1$1.getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment.this);
                }
            };
            showCameraDeniedDialog = this.getHighSpeedVideoFpsRangesFor.getShowCameraDeniedDialog();
            new com.ingo.sdk.android.ux.viewprovider.CaptureIdentityDocumentsFragmentViewProvider(mutableState, function0, function02, function03, function04, function05, function06, mutableState2, mutableState3, mutableState4, showCameraRationaleDialog, function07, showCameraDeniedDialog, this.getHighSpeedVideoFpsRangesFor.getFailure(), this.getHighSpeedVideoFpsRangesFor.getFailureAction(), this.getHighSpeedVideoFpsRangesFor.getRetryAction()).View(composer2, com.ingo.sdk.android.ux.viewprovider.CaptureIdentityDocumentsFragmentViewProvider.$stable);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment) {
        com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment.access$trackSubmitKYCDocuments(captureIdentityDocumentsFragment);
        captureIdentityDocumentsFragment.getHighSpeedVideoSizes();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment) {
        androidx.compose.runtime.MutableState mutableState;
        androidx.view.result.ActivityResultLauncher activityResultLauncher;
        android.content.Intent buildMiSnapIntent;
        mutableState = captureIdentityDocumentsFragment.getInputFormats;
        if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment.access$trackFrontIdPressed(captureIdentityDocumentsFragment);
            activityResultLauncher = captureIdentityDocumentsFragment.getOutputFormats;
            buildMiSnapIntent = captureIdentityDocumentsFragment.buildMiSnapIntent(com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_FRONT);
            activityResultLauncher.launch(buildMiSnapIntent);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment) {
        captureIdentityDocumentsFragment.doLaunchCameraPermissionRequest();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment) {
        androidx.compose.runtime.MutableState mutableState;
        mutableState = captureIdentityDocumentsFragment.getInputFormats;
        if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            captureIdentityDocumentsFragment.trackNavigationPressed();
            com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(captureIdentityDocumentsFragment, "CUSTOMER_MANUAL_VERIFICATION_REQUIRED", null, null, 6, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment) {
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.runtime.MutableState showCameraRationaleDialog;
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Selfie Clicked", null, 2, null);
        mutableState = captureIdentityDocumentsFragment.getInputFormats;
        if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment.access$trackSelfiePressed(captureIdentityDocumentsFragment);
            if (androidx.core.content.ContextCompat.checkSelfPermission(captureIdentityDocumentsFragment.requireContext(), "android.permission.CAMERA") != 0) {
                if (captureIdentityDocumentsFragment.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                    showCameraRationaleDialog = captureIdentityDocumentsFragment.getShowCameraRationaleDialog();
                    showCameraRationaleDialog.setValue(java.lang.Boolean.TRUE);
                } else {
                    captureIdentityDocumentsFragment.doLaunchCameraPermissionRequest();
                }
            } else {
                captureIdentityDocumentsFragment.getHighSpeedVideoSizesFor.launch(new android.content.Intent(captureIdentityDocumentsFragment.requireContext(), (java.lang.Class<?>) com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity.class));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment, androidx.compose.ui.platform.ComposeView composeView) {
        androidx.compose.runtime.MutableState mutableState;
        mutableState = captureIdentityDocumentsFragment.getInputFormats;
        if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            android.os.Bundle bundle = new android.os.Bundle();
            if (captureIdentityDocumentsFragment.getArguments() != null) {
                bundle.putAll(captureIdentityDocumentsFragment.getArguments());
            }
            captureIdentityDocumentsFragment.trackMenuPressed();
            androidx.view.ViewKt.findNavController(composeView).navigate(com.ingo.sdk.android.R.id.action_manualVerificationUploadFragment_to_moreMenuFragment, bundle);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getOutputMinFrameDuration(com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment) {
        androidx.compose.runtime.MutableState mutableState;
        androidx.view.result.ActivityResultLauncher activityResultLauncher;
        android.content.Intent buildMiSnapIntent;
        mutableState = captureIdentityDocumentsFragment.getInputFormats;
        if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment.access$trackBackIdPressed(captureIdentityDocumentsFragment);
            activityResultLauncher = captureIdentityDocumentsFragment.getOutputStallDurationlomOqCM;
            buildMiSnapIntent = captureIdentityDocumentsFragment.buildMiSnapIntent(com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_BACK);
            activityResultLauncher.launch(buildMiSnapIntent);
        }
        return kotlin.Unit.INSTANCE;
    }

    CaptureIdentityDocumentsFragment$onCreateView$1$1(com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment, androidx.compose.ui.platform.ComposeView composeView) {
        this.getHighSpeedVideoFpsRangesFor = captureIdentityDocumentsFragment;
        this.getHighSpeedVideoFpsRanges = composeView;
    }
}
