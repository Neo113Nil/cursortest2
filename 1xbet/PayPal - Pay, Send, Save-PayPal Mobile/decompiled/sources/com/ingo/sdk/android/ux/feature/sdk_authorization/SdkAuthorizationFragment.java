package com.ingo.sdk.android.ux.feature.sdk_authorization;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u0003J+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001e"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/sdk_authorization/SdkAuthorizationFragment;", "Lcom/ingo/sdk/android/common/core/platform/SdkComposeFragment;", "<init>", "()V", "", "screenName", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "getHighSpeedVideoFpsRangesFor", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroidx/compose/runtime/MutableState;", "", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoFpsRanges", "Lcom/ingo/sdk/android/ux/feature/sdk_authorization/SdkAuthorizationViewModelImpl;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/ingo/sdk/android/ux/feature/sdk_authorization/SdkAuthorizationViewModelImpl;", "Camera2StreamConfigurationMap", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SdkAuthorizationFragment extends com.ingo.sdk.android.common.core.platform.SdkComposeFragment {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl Camera2StreamConfigurationMap = new com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl(null, 1, 0 == true ? 1 : 0);

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment
    public final java.lang.String screenName() {
        return "Authorization";
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment, com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl sdkAuthorizationViewModelImpl = this.Camera2StreamConfigurationMap;
        com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment sdkAuthorizationFragment = this;
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(sdkAuthorizationFragment, sdkAuthorizationViewModelImpl.getSdkAuthorizeResponseData(), new com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment$onCreate$1$1(this));
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(sdkAuthorizationFragment, sdkAuthorizationViewModelImpl.getConfigurationResponseData(), new com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment$onCreate$1$2(this));
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(sdkAuthorizationFragment, sdkAuthorizationViewModelImpl.getCustomerResponseData(), new com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment$onCreate$1$3(this));
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(sdkAuthorizationFragment, sdkAuthorizationViewModelImpl.getFailure(), new com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment$onCreate$1$4(this));
        requireActivity().getGetHighResolutionOutputSizeshNQ4ISI().addCallback(sdkAuthorizationFragment, new androidx.view.OnBackPressedCallback() { // from class: com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment$onCreate$2
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
                com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.this.trackHardwareBackButton();
                com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.this, com.ingo.sdk.kotlin.common.constants.IngoModules.SDK_AUTHORIZATION, null, null, 6, null);
            }
        });
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment, com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getHighSpeedVideoFpsRangesFor();
        this.getHighSpeedVideoFpsRangesFor = true;
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        java.lang.CharSequence applicationLabel = requireContext().getPackageManager().getApplicationLabel(requireContext().getApplicationInfo());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationLabel, "");
        java.lang.String str = requireContext().getPackageManager().getPackageInfo(requireContext().getPackageName(), 0).versionName;
        if (str == null) {
            str = "UNKNOWN_VERSION";
        }
        com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationViewModelImpl sdkAuthorizationViewModelImpl = this.Camera2StreamConfigurationMap;
        java.lang.String string = requireContext().getString(com.ingo.sdk.android.R.string.ingo_sdk_version);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        sdkAuthorizationViewModelImpl.authorize(new com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationParameters(string, applicationLabel.toString(), str));
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-270563266, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                androidx.compose.runtime.Composer composer2 = composer;
                if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class));
                    if (obj != null) {
                        final com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment sdkAuthorizationFragment = com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.this;
                        com.ingo.sdk.android.core.ux.theme.ThemeKt.IngoSdkMaterialTheme((androidx.appcompat.app.AppCompatDelegate) obj, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1403994362, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment$onCreateView$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                                androidx.compose.runtime.MutableState mutableState;
                                androidx.compose.runtime.Composer composer4 = composer3;
                                if ((num2.intValue() & 11) != 2 || !composer4.getSkipping()) {
                                    mutableState = com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.this.getHighSpeedVideoFpsRanges;
                                    new com.ingo.sdk.android.ux.viewprovider.SdkAuthorizationViewProvider(mutableState, com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.this.getFailure(), com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.this.getFailureAction(), com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.this.getRetryAction()).View(composer4, com.ingo.sdk.android.ux.viewprovider.SdkAuthorizationViewProvider.$stable);
                                } else {
                                    composer4.skipToGroupEnd();
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 2);
                    } else {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }));
        return composeView;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1w00W4PXRkbXlin_BVnv2jGOG_s(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment sdkAuthorizationFragment) {
        sdkAuthorizationFragment.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CeZ6yv-eqLEGSfGoEHFgT77EiKI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10672$r8$lambda$CeZ6yveqLEGSfGoEHFgT77EiKI(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment sdkAuthorizationFragment) {
        sdkAuthorizationFragment.getHighSpeedVideoFpsRangesFor();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YgG_TAJSb8lksQWZJ3USdO6ys0M(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment sdkAuthorizationFragment) {
        sdkAuthorizationFragment.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vaYPLWoYgWunpJTvfun_zrgWg-A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10673$r8$lambda$vaYPLWoYgWunpJTvfun_zrgWgA(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment sdkAuthorizationFragment) {
        sdkAuthorizationFragment.getHighSpeedVideoFpsRangesFor();
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$onAuthorizationSuccess(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment sdkAuthorizationFragment, java.lang.Object obj) {
        if (obj != null) {
            sdkAuthorizationFragment.selectAccountAndNavigate(com.ingo.sdk.android.R.id.action_sdk_authorization_fragment_to_captureCheckImagesFragment, com.ingo.sdk.android.R.id.action_sdk_authorization_fragment_to_accountSelectionFragment, sdkAuthorizationFragment.getPartnerSelectedAccountIdentifier());
        }
    }

    public static final /* synthetic */ void access$renderFailure(final com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment sdkAuthorizationFragment, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        sdkAuthorizationFragment.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.FALSE);
        if (failure != null && (failure instanceof com.ingo.sdk.kotlin.common.core.exception.ApiFailure)) {
            java.lang.Throwable throwable = ((com.ingo.sdk.kotlin.common.core.exception.ApiFailure) failure).getThrowable();
            if (throwable instanceof com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) {
                com.ingo.sdk.kotlin.common.model.ApiErrorThrowable apiErrorThrowable = (com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) throwable;
                com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse errorResponse = apiErrorThrowable.getErrorResponse();
                if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.LegalDocumentsPendingAcceptanceResponse) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                    companion.getSerializersModule();
                    bundle.putSerializable(com.ingo.sdk.android.ux.feature.legal_documents_pending_acceptance.LegalDocumentsPendingAcceptanceFragment.KEY_LEGAL_DOCUMENTS_PENDING_ACCEPTANCE_RESPONSE, companion.encodeToString(com.ingo.sdk.kotlin.common.core.http.response.LegalDocumentsPendingAcceptanceResponse.INSTANCE.serializer(), errorResponse));
                    com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(sdkAuthorizationFragment), com.ingo.sdk.android.R.id.action_sdk_authorization_fragment_to_legalDocumentsPendingAcceptanceFragment, bundle, null, null, 12, null);
                    return;
                }
                if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.TransactionInReviewResponse) {
                    sdkAuthorizationFragment.navigateWithTransactionId(com.ingo.sdk.android.R.id.action_sdk_authorization_fragment_to_transaction_in_review_fragment, ((com.ingo.sdk.kotlin.common.core.http.response.TransactionInReviewResponse) errorResponse).getTransactionReferenceNumber());
                    return;
                }
                if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressResponse) {
                    sdkAuthorizationFragment.navigateWithTransactionId(com.ingo.sdk.android.R.id.action_sdk_authorization_fragment_to_transaction_in_review_fragment, ((com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressResponse) errorResponse).getTransaction().getTransactionReferenceNumber());
                    return;
                }
                if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.VoidImageInReviewResponse) {
                    sdkAuthorizationFragment.navigateWithTransactionId(com.ingo.sdk.android.R.id.action_sdk_authorization_fragment_to_transaction_in_review_fragment, ((com.ingo.sdk.kotlin.common.core.http.response.VoidImageInReviewResponse) errorResponse).getTransaction().getTransactionReferenceNumber());
                    return;
                }
                if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.VoidImageRequiredResponse) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                    json.getSerializersModule();
                    bundle2.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_VOID_IMAGE_REQUIRED_RESPONSE, json.encodeToString(com.ingo.sdk.kotlin.common.core.http.response.VoidImageRequiredResponse.INSTANCE.serializer(), errorResponse));
                    bundle2.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_TRANSACTION_ID, ((com.ingo.sdk.kotlin.common.core.http.response.VoidImageRequiredResponse) errorResponse).getTransaction().getTransactionReferenceNumber());
                    com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(sdkAuthorizationFragment), com.ingo.sdk.android.R.id.action_sdk_authorization_fragment_to_transactionDetailFragment, bundle2, null, null, 12, null);
                    return;
                }
                if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse) {
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    kotlinx.serialization.json.Json json2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                    json2.getSerializersModule();
                    bundle3.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_VOID_IMAGE_SOFT_DECLINED_RESPONSE, json2.encodeToString(com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse.INSTANCE.serializer(), errorResponse));
                    bundle3.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_TRANSACTION_ID, ((com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse) errorResponse).getTransaction().getTransactionReferenceNumber());
                    com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(sdkAuthorizationFragment), com.ingo.sdk.android.R.id.action_sdk_authorization_fragment_to_transactionDetailFragment, bundle3, null, null, 12, null);
                    return;
                }
                if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentNotCompleteResponse) {
                    android.os.Bundle bundle4 = new android.os.Bundle();
                    kotlinx.serialization.json.Json json3 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                    json3.getSerializersModule();
                    bundle4.putString(com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragment.KEY_CUSTOMER_ENROLLMENT_RESPONSE, json3.encodeToString(com.ingo.sdk.kotlin.common.core.http.response.CustomerEnrollmentNotCompleteResponse.INSTANCE.serializer(), errorResponse));
                    com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(sdkAuthorizationFragment), com.ingo.sdk.android.R.id.action_sdk_authorization_fragment_to_customerEnrollmentFragment, bundle4, null, null, 12, null);
                    return;
                }
                if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationRequiredResponse) {
                    com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(sdkAuthorizationFragment), com.ingo.sdk.android.R.id.action_sdk_authorization_fragment_to_manualVerificationUploadFragment, null, null, null, 14, null);
                    return;
                }
                if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationInProgressErrorResponse) {
                    android.os.Bundle bundle5 = new android.os.Bundle();
                    kotlinx.serialization.json.Json json4 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                    json4.getSerializersModule();
                    bundle5.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_IDENTITY_VERIFICATION_IN_PROGRESS, json4.encodeToString(com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationInProgressErrorResponse.INSTANCE.serializer(), errorResponse));
                    com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(sdkAuthorizationFragment), com.ingo.sdk.android.R.id.action_sdk_authorization_fragment_to_identityVerificationInProgressFragment, bundle5, null, null, 12, null);
                    return;
                }
                if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationFailureResponse) {
                    android.os.Bundle bundle6 = new android.os.Bundle();
                    kotlinx.serialization.json.Json json5 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                    json5.getSerializersModule();
                    bundle6.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_IDENTITY_VERIFICATION_FAILURE_RESPONSE, json5.encodeToString(com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationFailureResponse.INSTANCE.serializer(), errorResponse));
                    com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(sdkAuthorizationFragment), com.ingo.sdk.android.R.id.action_sdk_authorization_fragment_to_identityVerificationFailedFragment, bundle6, null, null, 12, null);
                    return;
                }
                com.ingo.sdk.android.common.core.platform.SdkComposeFragment.exitOnUnplannedApiError$default(sdkAuthorizationFragment, failure, com.ingo.sdk.kotlin.common.constants.IngoModules.SDK_AUTHORIZATION, apiErrorThrowable, null, 8, null);
                return;
            }
            com.ingo.sdk.android.common.core.platform.SdkComposeFragment.handleUnplannedExceptionWithRetry$default(sdkAuthorizationFragment, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.m10673$r8$lambda$vaYPLWoYgWunpJTvfun_zrgWgA(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.this);
                }
            }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.$r8$lambda$1w00W4PXRkbXlin_BVnv2jGOG_s(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.this);
                }
            }, com.ingo.sdk.kotlin.common.constants.IngoModules.SDK_AUTHORIZATION, false, null, 24, null);
            return;
        }
        com.ingo.sdk.android.common.core.platform.SdkComposeFragment.handleUnplannedExceptionWithRetry$default(sdkAuthorizationFragment, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.m10672$r8$lambda$CeZ6yveqLEGSfGoEHFgT77EiKI(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.this);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.$r8$lambda$YgG_TAJSb8lksQWZJ3USdO6ys0M(com.ingo.sdk.android.ux.feature.sdk_authorization.SdkAuthorizationFragment.this);
            }
        }, com.ingo.sdk.kotlin.common.constants.IngoModules.SDK_AUTHORIZATION, false, null, 24, null);
    }
}
