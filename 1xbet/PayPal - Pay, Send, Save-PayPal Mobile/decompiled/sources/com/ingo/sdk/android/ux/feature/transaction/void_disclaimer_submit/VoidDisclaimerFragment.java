package com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0003R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/transaction/void_disclaimer_submit/VoidDisclaimerFragment;", "Lcom/ingo/sdk/android/common/core/platform/SdkComposeFragment;", "<init>", "()V", "", "screenName", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/MutableState;", "", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/MutableState;", "Lcom/ingo/sdk/android/ux/feature/transaction/void_disclaimer_submit/SubmitTransactionViewModelImpl;", "Camera2StreamConfigurationMap", "Lcom/ingo/sdk/android/ux/feature/transaction/void_disclaimer_submit/SubmitTransactionViewModelImpl;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VoidDisclaimerFragment extends com.ingo.sdk.android.common.core.platform.SdkComposeFragment {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public VoidDisclaimerFragment() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.getHighSpeedVideoFpsRanges = new com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl(null, 1, 0 == true ? 1 : 0);
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment
    public final java.lang.String screenName() {
        return com.ingo.sdk.kotlin.common.analytics.IScreenNames.VoidDisclaimer;
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment, com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment = this;
        requireActivity().getGetHighResolutionOutputSizeshNQ4ISI().addCallback(voidDisclaimerFragment, new androidx.view.OnBackPressedCallback() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$onCreate$1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
                androidx.compose.runtime.MutableState mutableState;
                java.lang.String transactionReferenceNumberFromArgs;
                com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this.trackHardwareBackButton();
                mutableState = com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this.getHighSpeedVideoFpsRangesFor;
                if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                    androidx.view.fragment.FragmentKt.findNavController(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this).popBackStack();
                    return;
                }
                com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment2 = com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this;
                transactionReferenceNumberFromArgs = voidDisclaimerFragment2.getTransactionReferenceNumberFromArgs();
                com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(voidDisclaimerFragment2, "TRANSACTION_IN_REVIEW", transactionReferenceNumberFromArgs, null, 4, null);
            }
        });
        com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.SubmitTransactionViewModelImpl submitTransactionViewModelImpl = this.getHighSpeedVideoFpsRanges;
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(voidDisclaimerFragment, submitTransactionViewModelImpl.getFailure(), new com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$onCreate$2$1(this));
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(voidDisclaimerFragment, submitTransactionViewModelImpl.getSubmitTransactionResponse(), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.m10704$r8$lambda$KTOe53iIErwxlBxfcTiEc_2k0s(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this, (com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionResponse) obj);
            }
        });
        setLocationPermissionRequest(registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions(), new androidx.view.result.ActivityResultCallback() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$$ExternalSyntheticLambda1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.$r8$lambda$IUpOWfW6cFHuf6orn8k4z89LDZo(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this, (java.util.Map) obj);
            }
        }));
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1603172633, true, new com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$onCreateView$1$1(this, composeView)));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor() {
        this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.TRUE);
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
        if (obj != null) {
            java.util.Map<java.lang.String, java.lang.String> defaultProperties = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties(getTransactionReferenceNumberFromArgs());
            defaultProperties.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, com.ingo.sdk.kotlin.common.analytics.IScreenNames.VoidDisclaimer);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.VoidDisclaimerAccepted, defaultProperties);
            java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
            if (obj2 != null) {
                java.lang.Object obj3 = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj2).getSessionMap().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.customer.model.Account.class));
                this.getHighSpeedVideoFpsRanges.submitTransaction(getTransactionReferenceNumberFromArgs(), getPromoCodeFromArguments(), obj3 instanceof com.ingo.sdk.kotlin.common.features.customer.model.Account ? ((com.ingo.sdk.kotlin.common.features.customer.model.Account) obj3).getAccountId() : "", getSelectedFundsTimingFromArguments());
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
    }

    /* renamed from: $r8$lambda$-0T_jnWUXPwzfwkVyECl72C1EVA, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m10703$r8$lambda$0T_jnWUXPwzfwkVyECl72C1EVA(java.util.Map.Entry entry) {
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$55JYJzoRPSDadptP71Tmj342H3Y(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment) {
        voidDisclaimerFragment.getHighSpeedVideoFpsRangesFor();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6MR3iSUzV37n7ei9Zt2KOg4h7VQ(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment) {
        voidDisclaimerFragment.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A8mOErdIoTywJNdcfB7aYQbIsDM(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment) {
        voidDisclaimerFragment.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$IUpOWfW6cFHuf6orn8k4z89LDZo(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment, java.util.Map map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
        int size = map.size();
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(map.entrySet(), null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.m10705$r8$lambda$mO7om4s238pr8CbWAbkFxZEbhU((java.util.Map.Entry) obj);
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
        java.lang.String joinToString$default2 = kotlin.collections.CollectionsKt.joinToString$default(linkedHashMap.entrySet(), null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.m10703$r8$lambda$0T_jnWUXPwzfwkVyECl72C1EVA((java.util.Map.Entry) obj);
            }
        }, 31, null);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Filtered Location Permission Request Result: ");
        sb2.append(size2);
        sb2.append(" entries, ");
        sb2.append(joinToString$default2);
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging2, sb2.toString(), null, 2, null);
        if (linkedHashMap.isEmpty()) {
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Filtered Permissions is empty, displaying dialog", null, 2, null);
            voidDisclaimerFragment.getHighResolutionOutputSizeshNQ4ISI.setValue(java.lang.Boolean.TRUE);
        } else {
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Filtered Permissions is not empty, proceeding", null, 2, null);
            voidDisclaimerFragment.getHighSpeedVideoFpsRangesFor();
        }
    }

    /* renamed from: $r8$lambda$KTOe53iIErwxlBxfcTiEc_2k0-s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10704$r8$lambda$KTOe53iIErwxlBxfcTiEc_2k0s(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment, com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionResponse submitTransactionResponse) {
        voidDisclaimerFragment.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.FALSE);
        com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(voidDisclaimerFragment), com.ingo.sdk.android.R.id.action_voidNoticeFragment_to_transaction_in_review_fragment, voidDisclaimerFragment.getArguments(), null, null, 12, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m12_3hSV8iyvU1uMlyaFzd31WEY(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment) {
        voidDisclaimerFragment.getHighSpeedVideoFpsRangesFor();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mO-7om4s238pr8CbWAbkFxZEbhU, reason: not valid java name */
    public static /* synthetic */ java.lang.CharSequence m10705$r8$lambda$mO7om4s238pr8CbWAbkFxZEbhU(java.util.Map.Entry entry) {
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$miQpFkoSJfcj6_bLXN4gpXGbges(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment) {
        voidDisclaimerFragment.trackDialogDismissPressed();
        voidDisclaimerFragment.getFailure().setValue(null);
        voidDisclaimerFragment.getFailureAction().setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$renderFailure(final com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment voidDisclaimerFragment, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        voidDisclaimerFragment.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.FALSE);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putAll(voidDisclaimerFragment.getArguments());
        if (failure != null && (failure instanceof com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure)) {
            java.lang.Throwable throwable = ((com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure) failure).getThrowable();
            if (throwable instanceof com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) {
                com.ingo.sdk.kotlin.common.model.ApiErrorThrowable apiErrorThrowable = (com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) throwable;
                com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse errorResponse = apiErrorThrowable.getErrorResponse();
                if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationFailureResponse) {
                    kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                    json.getSerializersModule();
                    bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_IDENTITY_VERIFICATION_FAILURE_RESPONSE, json.encodeToString(com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationFailureResponse.INSTANCE.serializer(), errorResponse));
                    com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(voidDisclaimerFragment), com.ingo.sdk.android.R.id.action_voidNoticeFragment_to_identityVerificationFailedFragment, bundle, null, null, 12, null);
                    return;
                }
                if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationRequiredResponse) {
                    kotlinx.serialization.json.Json json2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                    json2.getSerializersModule();
                    bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_IDENTITY_VERIFICATION_REQUIRED_RESPONSE, json2.encodeToString(com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationRequiredResponse.INSTANCE.serializer(), errorResponse));
                    com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(voidDisclaimerFragment), com.ingo.sdk.android.R.id.action_voidNoticeFragment_to_manualVerificationUploadFragment, bundle, null, null, 12, null);
                    return;
                }
                voidDisclaimerFragment.exitOnUnplannedApiError(failure, com.ingo.sdk.kotlin.common.constants.IngoModules.SUBMIT_TRANSACTION_FOR_REVIEW, apiErrorThrowable, voidDisclaimerFragment.getTransactionReferenceNumberFromArgs());
                return;
            }
            if (throwable instanceof com.ingo.sdk.kotlin.common.features.location.LocationDataException) {
                voidDisclaimerFragment.getFailure().setValue(new com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$renderFailure$1
                    {
                        super(null, 1, null);
                    }

                    @Override // com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure, com.ingo.sdk.kotlin.common.core.exception.Failure
                    /* renamed from: getErrorString */
                    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
                        java.lang.String string = com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this.getString(com.ingo.sdk.android.R.string.ingo_unable_to_determine_location);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                        return string;
                    }

                    @Override // com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure, com.ingo.sdk.kotlin.common.core.exception.Failure
                    /* renamed from: getErrorTitle */
                    public final java.lang.String getCamera2StreamConfigurationMap() {
                        java.lang.String string = com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this.getString(com.ingo.sdk.android.R.string.ingo_default_error_title);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                        return string;
                    }
                });
                voidDisclaimerFragment.getFailureAction().setValue(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.$r8$lambda$miQpFkoSJfcj6_bLXN4gpXGbges(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this);
                    }
                });
                return;
            } else {
                voidDisclaimerFragment.handleUnplannedExceptionWithRetry(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.$r8$lambda$m12_3hSV8iyvU1uMlyaFzd31WEY(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this);
                    }
                }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.$r8$lambda$6MR3iSUzV37n7ei9Zt2KOg4h7VQ(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this);
                    }
                }, com.ingo.sdk.kotlin.common.constants.IngoModules.SUBMIT_TRANSACTION_FOR_REVIEW, false, voidDisclaimerFragment.getTransactionReferenceNumberFromArgs());
                return;
            }
        }
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "UNKNOWN FAILURE WITH RETRY ".concat(java.lang.String.valueOf(failure)), null, 2, null);
        voidDisclaimerFragment.handleUnplannedExceptionWithRetry(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.$r8$lambda$55JYJzoRPSDadptP71Tmj342H3Y(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.$r8$lambda$A8mOErdIoTywJNdcfB7aYQbIsDM(com.ingo.sdk.android.ux.feature.transaction.void_disclaimer_submit.VoidDisclaimerFragment.this);
            }
        }, com.ingo.sdk.kotlin.common.constants.IngoModules.SUBMIT_TRANSACTION_FOR_REVIEW, false, voidDisclaimerFragment.getTransactionReferenceNumberFromArgs());
    }
}
