package com.ingo.sdk.android.ux.feature.customer_enrollment;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0003R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\""}, d2 = {"Lcom/ingo/sdk/android/ux/feature/customer_enrollment/CustomerEnrollmentFragment;", "Lcom/ingo/sdk/android/common/core/platform/SdkComposeFragment;", "<init>", "()V", "", "screenName", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/ingo/sdk/kotlin/common/core/http/response/CustomerEnrollmentNotCompleteResponse;", "getHighSpeedVideoSizes", "Lcom/ingo/sdk/kotlin/common/core/http/response/CustomerEnrollmentNotCompleteResponse;", "getHighSpeedVideoFpsRanges", "Lcom/ingo/sdk/android/ux/feature/customer_enrollment/CustomerEnrollmentViewModelImpl;", "Lcom/ingo/sdk/android/ux/feature/customer_enrollment/CustomerEnrollmentViewModelImpl;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableState;", "", "getOutputMinFrameDuration", "Landroidx/compose/runtime/MutableState;", "getOutputFormats", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "Ljava/lang/String;", "getInputFormats", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CustomerEnrollmentFragment extends com.ingo.sdk.android.common.core.platform.SdkComposeFragment {
    public static final java.lang.String KEY_CUSTOMER_ENROLLMENT_RESPONSE = "KEY_CUSTOMER_ENROLLMENT_RESPONSE";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.String getInputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl Camera2StreamConfigurationMap = new com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl(null, 1, 0 == true ? 1 : 0);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.String getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentNotCompleteResponse getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerEnrollmentFragment() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment
    public final java.lang.String screenName() {
        return com.ingo.sdk.kotlin.common.analytics.IScreenNames.Registration;
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment, com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle savedInstanceState) {
        java.lang.String str;
        super.onCreate(savedInstanceState);
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "CUSTOMER ENROLLMENT CREATED", null, 2, null);
        kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString(KEY_CUSTOMER_ENROLLMENT_RESPONSE)) == null) {
            str = "";
        }
        json.getSerializersModule();
        this.getHighSpeedVideoFpsRanges = (com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentNotCompleteResponse) json.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentNotCompleteResponse.INSTANCE.serializer(), str);
        setLocationPermissionRequest(registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions(), new androidx.view.result.ActivityResultCallback() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$$ExternalSyntheticLambda2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.$r8$lambda$0u8B10lVs56Bym4AivLhTmLQtSE(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.this, (java.util.Map) obj);
            }
        }));
        com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment = this;
        requireActivity().getGetHighResolutionOutputSizeshNQ4ISI().addCallback(customerEnrollmentFragment, new androidx.view.OnBackPressedCallback() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$onCreate$2
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
                com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.this.trackHardwareBackButton();
                com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.this, com.ingo.sdk.kotlin.common.constants.IngoModules.COMPLETE_PROFILE_ENROLLMENT, null, null, 6, null);
            }
        });
        com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentViewModelImpl customerEnrollmentViewModelImpl = this.Camera2StreamConfigurationMap;
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(customerEnrollmentFragment, customerEnrollmentViewModelImpl.getFailure(), new com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$onCreate$3$1(this));
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(customerEnrollmentFragment, customerEnrollmentViewModelImpl.getCustomerEnrollmentResponseData(), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.$r8$lambda$p4gA9jT300H8166jTmlr7pFAd7Q(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.this, (com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse) obj);
            }
        });
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1319235719, true, new com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$onCreateView$1$1(this)));
        return composeView;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
        if (obj != null) {
            java.util.Map<java.lang.String, java.lang.String> defaultProperties$default = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties$default(null, 1, null);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.RegistrationSubmitted, defaultProperties$default);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
    }

    /* renamed from: $r8$lambda$0XPmD6wGMrQd0Gb-fkFgUyuXxbI, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m10656$r8$lambda$0XPmD6wGMrQd0GbfkFgUyuXxbI(java.util.Map.Entry entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(key);
        sb.append(" ");
        sb.append(value);
        sb.append(" : ");
        return sb.toString();
    }

    public static /* synthetic */ void $r8$lambda$0u8B10lVs56Bym4AivLhTmLQtSE(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment, java.util.Map map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
        int size = map.size();
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(map.entrySet(), null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.m10657$r8$lambda$cv7OhUZl0vGPi6lnMFrmwl5pag((java.util.Map.Entry) obj);
            }
        }, 31, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Location Permission Request Result: ");
        sb.append(size);
        sb.append(" entries, ");
        sb.append(joinToString$default);
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging, sb.toString(), null, 2, null);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey(), "android.permission.ACCESS_FINE_LOCATION") && ((java.lang.Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
        int size2 = linkedHashMap.size();
        java.lang.String joinToString$default2 = kotlin.collections.CollectionsKt.joinToString$default(linkedHashMap.entrySet(), null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.m10656$r8$lambda$0XPmD6wGMrQd0GbfkFgUyuXxbI((java.util.Map.Entry) obj);
            }
        }, 31, null);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Filtered Location Permission Request Result: ");
        sb2.append(size2);
        sb2.append(" entries, ");
        sb2.append(joinToString$default2);
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging2, sb2.toString(), null, 2, null);
        if (linkedHashMap.isEmpty()) {
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Filtered Permissions is empty, displaying dialog", null, 2, null);
            customerEnrollmentFragment.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.TRUE);
            customerEnrollmentFragment.trackLocationAccuracyRequired();
            return;
        }
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Filtered Permissions is not empty, proceeding", null, 2, null);
        customerEnrollmentFragment.trackLocationAuthorized();
        java.lang.String str = customerEnrollmentFragment.getInputSizeshNQ4ISI;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = customerEnrollmentFragment.getOutputMinFrameDuration;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = customerEnrollmentFragment.getInputFormats;
        java.lang.String str4 = str3 != null ? str3 : "";
        getHighResolutionOutputSizeshNQ4ISI();
        customerEnrollmentFragment.getHighSpeedVideoSizes.setValue(java.lang.Boolean.TRUE);
        customerEnrollmentFragment.Camera2StreamConfigurationMap.completeEnrollment(str, str2, str4);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BjklCyfzvNa3NK5GjRxwUVr8P44(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment) {
        customerEnrollmentFragment.trackDialogDismissPressed();
        customerEnrollmentFragment.getFailure().setValue(null);
        customerEnrollmentFragment.getFailureAction().setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cv7O-hUZl0vGPi6lnMFrmwl5pag, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m10657$r8$lambda$cv7OhUZl0vGPi6lnMFrmwl5pag(java.util.Map.Entry entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(key);
        sb.append(" ");
        sb.append(value);
        sb.append(" : ");
        return sb.toString();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p4gA9jT300H8166jTmlr7pFAd7Q(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment, com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse customerEnrollmentResponse) {
        customerEnrollmentFragment.getInputSizeshNQ4ISI = null;
        customerEnrollmentFragment.getOutputMinFrameDuration = null;
        customerEnrollmentFragment.getInputFormats = null;
        customerEnrollmentFragment.selectAccountAndNavigate(com.ingo.sdk.android.R.id.action_customerEnrollmentFragment_to_captureCheckImagesFragment, com.ingo.sdk.android.R.id.action_customerEnrollmentFragment_to_accountSelectionFragment, customerEnrollmentFragment.getPartnerSelectedAccountIdentifier());
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$doSubmitCustomerEnrollment(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        getHighResolutionOutputSizeshNQ4ISI();
        customerEnrollmentFragment.getHighSpeedVideoSizes.setValue(java.lang.Boolean.TRUE);
        customerEnrollmentFragment.Camera2StreamConfigurationMap.completeEnrollment(str, str2, str3);
    }

    public static final /* synthetic */ void access$renderFailure(final com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment customerEnrollmentFragment, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        customerEnrollmentFragment.getInputSizeshNQ4ISI = null;
        customerEnrollmentFragment.getOutputMinFrameDuration = null;
        customerEnrollmentFragment.getInputFormats = null;
        customerEnrollmentFragment.getHighSpeedVideoSizes.setValue(java.lang.Boolean.FALSE);
        if (failure instanceof com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure) {
            java.lang.Throwable throwable = ((com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure) failure).getThrowable();
            if (throwable instanceof com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) {
                com.ingo.sdk.android.common.core.platform.SdkComposeFragment.handleUnplannedException$default(customerEnrollmentFragment, failure, com.ingo.sdk.kotlin.common.constants.IngoModules.COMPLETE_PROFILE_ENROLLMENT, null, true, null, 20, null);
                return;
            } else if (throwable instanceof com.ingo.sdk.kotlin.common.features.location.LocationDataException) {
                customerEnrollmentFragment.getFailure().setValue(new com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$renderFailure$1
                    {
                        super(null, 1, null);
                    }

                    @Override // com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure, com.ingo.sdk.kotlin.common.core.exception.Failure
                    /* renamed from: getErrorString */
                    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
                        java.lang.String string = com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.this.getString(com.ingo.sdk.android.R.string.ingo_unable_to_determine_location);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                        return string;
                    }

                    @Override // com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure, com.ingo.sdk.kotlin.common.core.exception.Failure
                    /* renamed from: getErrorTitle */
                    public final java.lang.String getCamera2StreamConfigurationMap() {
                        java.lang.String string = com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.this.getString(com.ingo.sdk.android.R.string.ingo_default_error_title);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                        return string;
                    }
                });
                customerEnrollmentFragment.getFailureAction().setValue(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.$r8$lambda$BjklCyfzvNa3NK5GjRxwUVr8P44(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.this);
                    }
                });
                return;
            } else {
                com.ingo.sdk.android.common.core.platform.SdkComposeFragment.handleUnplannedException$default(customerEnrollmentFragment, com.ingo.sdk.kotlin.common.constants.IngoModules.COMPLETE_PROFILE_ENROLLMENT, null, false, null, 14, null);
                return;
            }
        }
        com.ingo.sdk.android.common.core.platform.SdkComposeFragment.handleUnplannedException$default(customerEnrollmentFragment, com.ingo.sdk.kotlin.common.constants.IngoModules.COMPLETE_PROFILE_ENROLLMENT, null, false, null, 14, null);
    }
}
