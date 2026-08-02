package com.ingo.sdk.android.ux.feature.transaction.review;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u0003J+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/transaction/review/TransactionInReviewFragment;", "Lcom/ingo/sdk/android/common/core/platform/SdkComposeFragment;", "<init>", "()V", "", "screenName", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/ingo/sdk/android/ux/feature/transaction/review/TransactionStatusViewModelImpl;", "getHighSpeedVideoSizes", "Lcom/ingo/sdk/android/ux/feature/transaction/review/TransactionStatusViewModelImpl;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionInReviewFragment extends com.ingo.sdk.android.common.core.platform.SdkComposeFragment {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl Camera2StreamConfigurationMap = new com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl(null, 1, null);

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment
    public final java.lang.String screenName() {
        return com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionInReview;
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment, com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment transactionInReviewFragment = this;
        requireActivity().getOnBackPressedDispatcher().addCallback(transactionInReviewFragment, new androidx.view.OnBackPressedCallback() { // from class: com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment$onCreate$1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
                com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl transactionStatusViewModelImpl;
                java.lang.String transactionReferenceNumberFromArgs;
                transactionStatusViewModelImpl = com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment.this.Camera2StreamConfigurationMap;
                transactionStatusViewModelImpl.stopPolling();
                com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment.this.trackHardwareBackButton();
                com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment transactionInReviewFragment2 = com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment.this;
                transactionReferenceNumberFromArgs = transactionInReviewFragment2.getTransactionReferenceNumberFromArgs();
                com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(transactionInReviewFragment2, "TRANSACTION_IN_REVIEW", transactionReferenceNumberFromArgs, null, 4, null);
            }
        });
        com.ingo.sdk.android.ux.feature.transaction.review.TransactionStatusViewModelImpl transactionStatusViewModelImpl = this.Camera2StreamConfigurationMap;
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(transactionInReviewFragment, transactionStatusViewModelImpl.getFailure(), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment.$r8$lambda$7cXHWyZCjNmJCrr0pXu1eEgl6ek(com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        });
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(transactionInReviewFragment, transactionStatusViewModelImpl.getTransactionStatusResponse(), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment.$r8$lambda$JR0EzQCYwq3fhhyI09umDILHK2A(com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment.this, (com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse) obj);
            }
        });
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.Camera2StreamConfigurationMap.poll(getTransactionReferenceNumberFromArgs());
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.Camera2StreamConfigurationMap.stopPolling();
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(562179496, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                androidx.compose.runtime.Composer composer2 = composer;
                if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
                    androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> failure = com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment.this.getFailure();
                    androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> failureAction = com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment.this.getFailureAction();
                    androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> retryAction = com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment.this.getRetryAction();
                    android.os.Bundle arguments = com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment.this.getArguments();
                    new com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider(failure, failureAction, retryAction, arguments != null ? arguments.getBoolean(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_IS_FROM_VOID) : false).View(composer2, com.ingo.sdk.android.ux.viewprovider.TransactionInReviewFragmentViewProvider.$stable);
                } else {
                    composer2.skipToGroupEnd();
                }
                return kotlin.Unit.INSTANCE;
            }
        }));
        return composeView;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7cXHWyZCjNmJCrr0pXu1eEgl6ek(final com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment transactionInReviewFragment, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        if (failure instanceof com.ingo.sdk.kotlin.common.core.exception.ApiFailure) {
            java.lang.Throwable throwable = ((com.ingo.sdk.kotlin.common.core.exception.ApiFailure) failure).getThrowable();
            if (throwable instanceof com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putAll(transactionInReviewFragment.getArguments());
                com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse errorResponse = ((com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) throwable).getErrorResponse();
                if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.TransactionInReviewResponse) {
                    transactionInReviewFragment.Camera2StreamConfigurationMap.poll(transactionInReviewFragment.getTransactionReferenceNumberFromArgs());
                } else if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.TransactionInProgressResponse) {
                    transactionInReviewFragment.Camera2StreamConfigurationMap.poll(transactionInReviewFragment.getTransactionReferenceNumberFromArgs());
                } else if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.VoidImageInReviewResponse) {
                    transactionInReviewFragment.Camera2StreamConfigurationMap.poll(transactionInReviewFragment.getTransactionReferenceNumberFromArgs());
                } else if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.VoidImageRequiredResponse) {
                    kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                    json.getSerializersModule();
                    bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_VOID_IMAGE_REQUIRED_RESPONSE, json.encodeToString(com.ingo.sdk.kotlin.common.core.http.response.VoidImageRequiredResponse.INSTANCE.serializer(), errorResponse));
                    com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(transactionInReviewFragment), com.ingo.sdk.android.R.id.action_transaction_in_review_fragment_to_captureVoidImageFragment, bundle, null, null, 12, null);
                } else if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse) {
                    kotlinx.serialization.json.Json json2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                    json2.getSerializersModule();
                    bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_VOID_IMAGE_SOFT_DECLINED_RESPONSE, json2.encodeToString(com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse.INSTANCE.serializer(), errorResponse));
                    com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(transactionInReviewFragment), com.ingo.sdk.android.R.id.action_transaction_in_review_fragment_to_voidedCheckSoftDeclinedFragment, bundle, null, null, 12, null);
                } else if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationInProgressErrorResponse) {
                    kotlinx.serialization.json.Json json3 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                    json3.getSerializersModule();
                    bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_IDENTITY_VERIFICATION_IN_PROGRESS, json3.encodeToString(com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationInProgressErrorResponse.INSTANCE.serializer(), errorResponse));
                    com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(transactionInReviewFragment), com.ingo.sdk.android.R.id.action_transaction_in_review_fragment_to_identityVerificationInProgressFragment, bundle, null, null, 12, null);
                } else if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationRequiredResponse) {
                    kotlinx.serialization.json.Json json4 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                    json4.getSerializersModule();
                    bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_IDENTITY_VERIFICATION_REQUIRED_RESPONSE, json4.encodeToString(com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationRequiredResponse.INSTANCE.serializer(), errorResponse));
                    com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(transactionInReviewFragment), com.ingo.sdk.android.R.id.action_transaction_in_review_fragment_to_manualVerificationUploadFragment, bundle, null, null, 12, null);
                } else if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationFailureResponse) {
                    kotlinx.serialization.json.Json json5 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                    json5.getSerializersModule();
                    bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_IDENTITY_VERIFICATION_FAILURE_RESPONSE, json5.encodeToString(com.ingo.sdk.kotlin.common.core.http.response.IdentityVerificationFailureResponse.INSTANCE.serializer(), errorResponse));
                    com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(transactionInReviewFragment), com.ingo.sdk.android.R.id.action_transaction_in_review_fragment_to_identityVerificationFailedFragment, bundle, null, null, 12, null);
                } else if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.TransactionDeclinedErrorResponse) {
                    kotlinx.serialization.json.Json json6 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                    json6.getSerializersModule();
                    bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_TRANSACTION_DECLINED_RESPONSE, json6.encodeToString(com.ingo.sdk.kotlin.common.core.http.response.TransactionDeclinedErrorResponse.INSTANCE.serializer(), errorResponse));
                    com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(transactionInReviewFragment), com.ingo.sdk.android.R.id.action_transaction_in_review_fragment_to_transactionDeclinedFragment, bundle, null, null, 12, null);
                } else if (errorResponse instanceof com.ingo.sdk.kotlin.common.core.http.response.TransactionLoadFailureErrorResponse) {
                    kotlinx.serialization.json.Json json7 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                    json7.getSerializersModule();
                    bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_TRANSACTION_LOAD_FAILURE_RESPONSE, json7.encodeToString(com.ingo.sdk.kotlin.common.core.http.response.TransactionLoadFailureErrorResponse.INSTANCE.serializer(), errorResponse));
                    com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(transactionInReviewFragment), com.ingo.sdk.android.R.id.action_transaction_in_review_fragment_to_transactionLoadFailureFragment, bundle, null, null, 12, null);
                } else {
                    com.ingo.sdk.android.common.core.platform.SdkComposeFragment.handleUnplannedException$default(transactionInReviewFragment, failure, "TRANSACTION_IN_REVIEW", null, true, transactionInReviewFragment.getTransactionReferenceNumberFromArgs(), 4, null);
                }
            } else {
                com.ingo.sdk.android.common.core.platform.SdkComposeFragment.handleUnplannedExceptionWithRetry$default(transactionInReviewFragment, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment.$r8$lambda$YTxIL2xuHpITndgILwgPYMfGKVg(com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment.this);
                    }
                }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                }, "TRANSACTION_IN_REVIEW", false, transactionInReviewFragment.getTransactionReferenceNumberFromArgs(), 8, null);
            }
        } else {
            com.ingo.sdk.android.common.core.platform.SdkComposeFragment.handleUnplannedExceptionWithRetry$default(transactionInReviewFragment, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment.m10697$r8$lambda$YIt231NjhT3inlkrb3B9PbpYPk(com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment.this);
                }
            }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            }, "TRANSACTION_IN_REVIEW", false, transactionInReviewFragment.getTransactionReferenceNumberFromArgs(), 8, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JR0EzQCYwq3fhhyI09umDILHK2A(com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment transactionInReviewFragment, com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse transactionStatusResponse) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putAll(transactionInReviewFragment.getArguments());
        kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
        json.getSerializersModule();
        bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_TRANSACTION_FUNDED_RESPONSE, json.encodeToString(kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse.INSTANCE.serializer()), transactionStatusResponse));
        com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(transactionInReviewFragment), com.ingo.sdk.android.R.id.action_transaction_in_review_fragment_to_transactionFundedFragment, bundle, null, null, 12, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YIt231NjhT3in-lkrb3B9PbpYPk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10697$r8$lambda$YIt231NjhT3inlkrb3B9PbpYPk(com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment transactionInReviewFragment) {
        transactionInReviewFragment.Camera2StreamConfigurationMap.poll(transactionInReviewFragment.getTransactionReferenceNumberFromArgs());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YTxIL2xuHpITndgILwgPYMfGKVg(com.ingo.sdk.android.ux.feature.transaction.review.TransactionInReviewFragment transactionInReviewFragment) {
        transactionInReviewFragment.Camera2StreamConfigurationMap.poll(transactionInReviewFragment.getTransactionReferenceNumberFromArgs());
        return kotlin.Unit.INSTANCE;
    }
}
