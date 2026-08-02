package com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class VoidDisclaimerFragment$onCreateView$1$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.platform.ComposeView getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.MutableState mutableState;
        com.ingo.sdk.kotlin.common.features.configuration.model.VoidDisclaimer voidDisclaimer;
        androidx.compose.runtime.MutableState mutableState2;
        androidx.compose.runtime.MutableState mutableState3;
        com.ingo.sdk.kotlin.common.features.configuration.model.VoidDisclaimer voidDisclaimer2;
        androidx.compose.runtime.Composer composer2 = composer;
        if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> failure = this.Camera2StreamConfigurationMap.getFailure();
            androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> failureAction = this.Camera2StreamConfigurationMap.getFailureAction();
            androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> retryAction = this.Camera2StreamConfigurationMap.getRetryAction();
            final com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment = this.Camera2StreamConfigurationMap;
            final androidx.compose.ui.platform.ComposeView composeView = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$onCreateView$1$1.getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this, composeView);
                }
            };
            final com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment2 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$onCreateView$1$1.getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this);
                }
            };
            final com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment3 = this.Camera2StreamConfigurationMap;
            final androidx.compose.ui.platform.ComposeView composeView2 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$onCreateView$1$1.getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this, composeView2);
                }
            };
            mutableState = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
            if (obj == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
            }
            com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse configurationResponse = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj).configurationResponse();
            if (configurationResponse == null || (voidDisclaimer2 = configurationResponse.getVoidDisclaimer()) == null) {
                java.lang.String string = this.Camera2StreamConfigurationMap.getString(com.ingo.sdk.android.R.string.ingo_important_notice);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                voidDisclaimer = new com.ingo.sdk.kotlin.common.features.configuration.model.VoidDisclaimer(string, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{this.Camera2StreamConfigurationMap.getString(com.ingo.sdk.android.R.string.ingo_void_disclaimer_1), this.Camera2StreamConfigurationMap.getString(com.ingo.sdk.android.R.string.ingo_void_disclaimer_2)}));
            } else {
                voidDisclaimer = voidDisclaimer2;
            }
            final com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment4 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function0 function04 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$onCreateView$1$1.getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this);
                }
            };
            mutableState2 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            mutableState3 = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            final com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment5 = this.Camera2StreamConfigurationMap;
            new com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider(failure, failureAction, retryAction, function0, function02, function03, mutableState, voidDisclaimer, function04, mutableState2, mutableState3, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$onCreateView$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$onCreateView$1$1.getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this);
                }
            }).View(composer2, com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider.$stable);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment) {
        voidDisclaimerFragment.startAppSettingsActivity();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment, androidx.compose.ui.platform.ComposeView composeView) {
        androidx.compose.runtime.MutableState mutableState;
        mutableState = voidDisclaimerFragment.getHighSpeedVideoFpsRangesFor;
        if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            voidDisclaimerFragment.trackNavigationPressed();
            androidx.view.ViewKt.findNavController(composeView).popBackStack();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment) {
        androidx.compose.runtime.MutableState mutableState;
        if (androidx.core.content.ContextCompat.checkSelfPermission(voidDisclaimerFragment.requireContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            voidDisclaimerFragment.getHighSpeedVideoFpsRangesFor();
        } else if (voidDisclaimerFragment.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
            mutableState = voidDisclaimerFragment.Camera2StreamConfigurationMap;
            mutableState.setValue(java.lang.Boolean.TRUE);
        } else {
            voidDisclaimerFragment.doLaunchLocationPermissionRequest();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment, androidx.compose.ui.platform.ComposeView composeView) {
        androidx.compose.runtime.MutableState mutableState;
        mutableState = voidDisclaimerFragment.getHighSpeedVideoFpsRangesFor;
        if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            voidDisclaimerFragment.trackMenuPressed();
            android.os.Bundle bundle = new android.os.Bundle();
            if (voidDisclaimerFragment.getArguments() != null) {
                bundle.putAll(voidDisclaimerFragment.getArguments());
            }
            androidx.view.ViewKt.findNavController(composeView).navigate(com.ingo.sdk.android.R.id.action_voidNoticeFragment_to_moreMenuFragment, bundle);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment) {
        voidDisclaimerFragment.doLaunchLocationPermissionRequest();
        return kotlin.Unit.INSTANCE;
    }

    VoidDisclaimerFragment$onCreateView$1$1(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment, androidx.compose.ui.platform.ComposeView composeView) {
        this.Camera2StreamConfigurationMap = voidDisclaimerFragment;
        this.getHighSpeedVideoFpsRanges = composeView;
    }
}
