package com.ingo.sdk.android.ux.feature.transaction.capture_check_images;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class CaptureCheckImagesFragment$onCreateView$1$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.platform.ComposeView getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.runtime.MutableState mutableState2;
        androidx.compose.runtime.MutableState mutableState3;
        androidx.compose.runtime.MutableState mutableState4;
        androidx.compose.runtime.MutableState mutableState5;
        androidx.compose.runtime.Composer composer2 = composer;
        if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
            mutableState = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            android.os.Bundle arguments = this.Camera2StreamConfigurationMap.getArguments();
            boolean z = arguments != null ? arguments.getBoolean(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_IS_FROM_ACCOUNT_SELECTION) : false;
            mutableState2 = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
            mutableState3 = this.Camera2StreamConfigurationMap.getOutputFormats;
            mutableState4 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            mutableState5 = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> failureAction = this.Camera2StreamConfigurationMap.getFailureAction();
            androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> failure = this.Camera2StreamConfigurationMap.getFailure();
            androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> retryAction = this.Camera2StreamConfigurationMap.getRetryAction();
            final com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment captureCheckImagesFragment = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment$onCreateView$1$1.Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment.this);
                }
            };
            final com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment captureCheckImagesFragment2 = this.Camera2StreamConfigurationMap;
            final androidx.compose.ui.platform.ComposeView composeView = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment$onCreateView$1$1.getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment.this, composeView);
                }
            };
            final com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment captureCheckImagesFragment3 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment$onCreateView$1$1.getInputFormats(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment.this);
                }
            };
            final com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment captureCheckImagesFragment4 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function0 function04 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment$onCreateView$1$1.getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment.this);
                }
            };
            final com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment captureCheckImagesFragment5 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function0 function05 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment$onCreateView$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment$onCreateView$1$1.getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment.this);
                }
            };
            final com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment captureCheckImagesFragment6 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function0 function06 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment$onCreateView$1$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment$onCreateView$1$1.getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment.this);
                }
            };
            final com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment captureCheckImagesFragment7 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function0 function07 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment$onCreateView$1$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment$onCreateView$1$1.getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment.this);
                }
            };
            composer2.startReplaceGroup(1849434622);
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment$onCreateView$1$1$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment$onCreateView$1$1.Camera2StreamConfigurationMap(((java.lang.Boolean) obj).booleanValue());
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            composer2.endReplaceGroup();
            new com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider(mutableState, function0, z, function02, function03, function04, function05, mutableState2, mutableState3, function06, mutableState4, mutableState5, function07, (kotlin.jvm.functions.Function1) rememberedValue, failure, failureAction, retryAction).View(composer2, com.ingo.sdk.android.ux.viewprovider.CaptureCheckImagesViewProvider.$stable);
        } else {
            composer2.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment captureCheckImagesFragment) {
        captureCheckImagesFragment.startAppSettingsActivity();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment captureCheckImagesFragment) {
        captureCheckImagesFragment.doLaunchLocationPermissionRequest();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(boolean z) {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
        if (obj != null) {
            com.ingo.sdk.kotlin.common.analytics.IngoAnalytics ingoAnalytics = (com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj;
            java.lang.String str = z ? com.ingo.sdk.kotlin.common.analytics.IEventNames.FeesInfoDisplayed : com.ingo.sdk.kotlin.common.analytics.IEventNames.FeesInfoClosed;
            java.util.Map<java.lang.String, java.lang.String> defaultProperties$default = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties$default(null, 1, null);
            defaultProperties$default.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, com.ingo.sdk.kotlin.common.analytics.IScreenNames.CaptureCheckImages);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            ingoAnalytics.trackEvent(str, defaultProperties$default);
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment captureCheckImagesFragment) {
        captureCheckImagesFragment.trackNavigationPressed();
        com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment.access$navigateBack(captureCheckImagesFragment);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment captureCheckImagesFragment) {
        androidx.view.result.ActivityResultLauncher activityResultLauncher;
        android.content.Intent buildMiSnapIntent;
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Back Image Clicked", null, 2, null);
        com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment.access$trackBackImagePressed(captureCheckImagesFragment);
        activityResultLauncher = captureCheckImagesFragment.getHighSpeedVideoSizesFor;
        buildMiSnapIntent = captureCheckImagesFragment.buildMiSnapIntent(com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_BACK);
        activityResultLauncher.launch(buildMiSnapIntent);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment captureCheckImagesFragment) {
        androidx.compose.runtime.MutableState mutableState;
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Next clicked", null, 2, null);
        if (androidx.core.content.ContextCompat.checkSelfPermission(captureCheckImagesFragment.requireContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            captureCheckImagesFragment.getHighSpeedVideoFpsRanges();
        } else if (captureCheckImagesFragment.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
            mutableState = captureCheckImagesFragment.Camera2StreamConfigurationMap;
            mutableState.setValue(java.lang.Boolean.TRUE);
        } else {
            captureCheckImagesFragment.doLaunchLocationPermissionRequest();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getInputFormats(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment captureCheckImagesFragment) {
        androidx.view.result.ActivityResultLauncher activityResultLauncher;
        android.content.Intent buildMiSnapIntent;
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Front Image Clicked", null, 2, null);
        com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment.access$trackFrontImagePressed(captureCheckImagesFragment);
        activityResultLauncher = captureCheckImagesFragment.getOutputMinFrameDuration;
        buildMiSnapIntent = captureCheckImagesFragment.buildMiSnapIntent(com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_FRONT);
        activityResultLauncher.launch(buildMiSnapIntent);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment captureCheckImagesFragment, androidx.compose.ui.platform.ComposeView composeView) {
        captureCheckImagesFragment.trackMenuPressed();
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "More Clicked", null, 2, null);
        android.os.Bundle bundle = new android.os.Bundle();
        if (captureCheckImagesFragment.getArguments() != null) {
            bundle.putAll(captureCheckImagesFragment.getArguments());
        }
        com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.ViewKt.findNavController(composeView), com.ingo.sdk.android.R.id.action_captureCheckImagesFragment_to_moreMenuFragment, null, null, null, 14, null);
        return kotlin.Unit.INSTANCE;
    }

    CaptureCheckImagesFragment$onCreateView$1$1(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureCheckImagesFragment captureCheckImagesFragment, androidx.compose.ui.platform.ComposeView composeView) {
        this.Camera2StreamConfigurationMap = captureCheckImagesFragment;
        this.getHighResolutionOutputSizeshNQ4ISI = composeView;
    }
}
