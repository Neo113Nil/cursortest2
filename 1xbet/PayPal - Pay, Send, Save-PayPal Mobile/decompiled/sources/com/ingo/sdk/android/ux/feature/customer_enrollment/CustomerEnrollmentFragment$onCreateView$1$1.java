package com.ingo.sdk.android.ux.feature.customer_enrollment;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class CustomerEnrollmentFragment$onCreateView$1$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.runtime.MutableState mutableState2;
        androidx.compose.runtime.MutableState mutableState3;
        androidx.compose.runtime.Composer composer2 = composer;
        if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            mutableState = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> failure = this.getHighSpeedVideoFpsRanges.getFailure();
            androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> failureAction = this.getHighSpeedVideoFpsRanges.getFailureAction();
            androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> retryAction = this.getHighSpeedVideoFpsRanges.getRetryAction();
            final com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$onCreateView$1$1.getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.this);
                }
            };
            final com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment2 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$onCreateView$1$1.Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.this);
                }
            };
            final com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment3 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function3 function3 = new kotlin.jvm.functions.Function3() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$onCreateView$1$1.Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.this, (java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                }
            };
            final com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment4 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$onCreateView$1$1.getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.this);
                }
            };
            mutableState2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            mutableState3 = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            final com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment5 = this.getHighSpeedVideoFpsRanges;
            new com.ingo.sdk.android.ux.viewprovider.CustomerEnrollmentViewProvider(mutableState, failure, failureAction, retryAction, function0, function02, function3, function03, mutableState2, mutableState3, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$onCreateView$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$onCreateView$1$1.getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.this);
                }
            }).View(composer2, com.ingo.sdk.android.ux.viewprovider.CustomerEnrollmentViewProvider.$stable);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment) {
        customerEnrollmentFragment.trackNavigationPressed();
        com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(customerEnrollmentFragment, com.ingo.sdk.kotlin.common.constants.IngoModules.COMPLETE_PROFILE_ENROLLMENT, null, null, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment) {
        customerEnrollmentFragment.doLaunchLocationPermissionRequest();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        androidx.compose.runtime.MutableState mutableState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        customerEnrollmentFragment.getInputSizeshNQ4ISI = str;
        customerEnrollmentFragment.getOutputMinFrameDuration = str2;
        customerEnrollmentFragment.getInputFormats = str3;
        if (androidx.core.content.ContextCompat.checkSelfPermission(customerEnrollmentFragment.requireContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.access$doSubmitCustomerEnrollment(customerEnrollmentFragment, str, str2, str3);
        } else if (customerEnrollmentFragment.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
            mutableState = customerEnrollmentFragment.getHighResolutionOutputSizeshNQ4ISI;
            mutableState.setValue(java.lang.Boolean.TRUE);
        } else {
            customerEnrollmentFragment.doLaunchLocationPermissionRequest();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment) {
        customerEnrollmentFragment.trackMenuPressed();
        android.os.Bundle bundle = new android.os.Bundle();
        if (customerEnrollmentFragment.getArguments() != null) {
            bundle.putAll(customerEnrollmentFragment.getArguments());
        }
        com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(customerEnrollmentFragment), com.ingo.sdk.android.R.id.action_customerEnrollmentFragment_to_moreMenuFragment, bundle, null, null, 12, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment) {
        customerEnrollmentFragment.startAppSettingsActivity();
        return kotlin.Unit.INSTANCE;
    }

    CustomerEnrollmentFragment$onCreateView$1$1(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment) {
        this.getHighSpeedVideoFpsRanges = customerEnrollmentFragment;
    }
}
