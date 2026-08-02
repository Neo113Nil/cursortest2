package com.ingo.sdk.android.ux.feature.transaction.confirm_details;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class ConfirmTransactionDetailsFragment$onCreateView$1$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.platform.ComposeView getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        java.lang.String string;
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponseFromArguments;
        com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming;
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.runtime.MutableState mutableState2;
        androidx.compose.runtime.MutableState mutableState3;
        androidx.compose.runtime.MutableState mutableState4;
        androidx.compose.runtime.MutableState mutableState5;
        androidx.compose.runtime.Composer composer2 = composer;
        if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
            if (obj == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
            }
            java.lang.Object obj2 = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj).getSessionMap().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.customer.model.Account.class));
            boolean z = obj2 instanceof com.ingo.sdk.kotlin.common.features.customer.model.Account;
            if (z) {
                string = ((com.ingo.sdk.kotlin.common.features.customer.model.Account) obj2).getAccountNickname();
            } else {
                string = this.Camera2StreamConfigurationMap.getString(com.ingo.sdk.android.R.string.ingo_default_account_nickname);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            }
            java.lang.String str = string;
            final java.lang.String accountId = z ? ((com.ingo.sdk.kotlin.common.features.customer.model.Account) obj2).getAccountId() : "";
            boolean booleanExtra = this.Camera2StreamConfigurationMap.requireActivity().getIntent().getBooleanExtra(com.ingo.sdk.android.ux.activity.IngoSdkActivity.PROMO_CODE_ENTRY_ENABLED, true);
            androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> failure = this.Camera2StreamConfigurationMap.getFailure();
            androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> failureAction = this.Camera2StreamConfigurationMap.getFailureAction();
            androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> retryAction = this.Camera2StreamConfigurationMap.getRetryAction();
            final com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment confirmTransactionDetailsFragment = this.Camera2StreamConfigurationMap;
            final androidx.compose.ui.platform.ComposeView composeView = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment$onCreateView$1$1.getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment.this, composeView);
                }
            };
            final com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment confirmTransactionDetailsFragment2 = this.Camera2StreamConfigurationMap;
            final androidx.compose.ui.platform.ComposeView composeView2 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment$onCreateView$1$1.getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment.this, composeView2);
                }
            };
            final com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment confirmTransactionDetailsFragment3 = this.Camera2StreamConfigurationMap;
            final androidx.compose.ui.platform.ComposeView composeView3 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment$onCreateView$1$1.getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment.this, composeView3);
                }
            };
            confirmAmountResponseFromArguments = this.Camera2StreamConfigurationMap.getConfirmAmountResponseFromArguments();
            fundsTiming = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            if (fundsTiming == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                fundsTiming = null;
            }
            com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming2 = fundsTiming;
            final com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment confirmTransactionDetailsFragment4 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment$onCreateView$1$1.getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment.this, accountId, (java.lang.String) obj3);
                }
            };
            mutableState = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            mutableState2 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            mutableState3 = this.Camera2StreamConfigurationMap.getInputFormats;
            mutableState4 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor;
            final com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment confirmTransactionDetailsFragment5 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function0 function04 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment$onCreateView$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment$onCreateView$1$1.getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment.this);
                }
            };
            mutableState5 = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            composer2.startReplaceGroup(1849434622);
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment$onCreateView$1$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment$onCreateView$1$1.Camera2StreamConfigurationMap(((java.lang.Boolean) obj3).booleanValue());
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            composer2.endReplaceGroup();
            new com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider(failure, failureAction, retryAction, function0, function02, function03, confirmAmountResponseFromArguments, fundsTiming2, str, function1, mutableState, mutableState2, mutableState3, mutableState4, function04, mutableState5, booleanExtra, (kotlin.jvm.functions.Function1) rememberedValue).View(composer2, com.ingo.sdk.android.ux.viewprovider.ConfirmTransactionDetailsViewProvider.$stable);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment confirmTransactionDetailsFragment, java.lang.String str, java.lang.String str2) {
        androidx.compose.runtime.MutableState mutableState;
        com.ingo.sdk.android.ux.feature.transaction.confirm_details.AddPromoCodeViewModelImpl addPromoCodeViewModelImpl;
        java.lang.String transactionReferenceNumberFromArgs;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        confirmTransactionDetailsFragment.getOutputFormats = str2;
        com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment.access$trackApplyPromoCode(confirmTransactionDetailsFragment, str2);
        mutableState = confirmTransactionDetailsFragment.getHighResolutionOutputSizeshNQ4ISI;
        mutableState.setValue(java.lang.Boolean.TRUE);
        addPromoCodeViewModelImpl = confirmTransactionDetailsFragment.getHighSpeedVideoSizes;
        transactionReferenceNumberFromArgs = confirmTransactionDetailsFragment.getTransactionReferenceNumberFromArgs();
        addPromoCodeViewModelImpl.addPromoCode(new com.ingo.sdk.kotlin.common.features.add_promo_code.AddPromoCodeUseCaseParameters(transactionReferenceNumberFromArgs, str2, str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(boolean z) {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
        if (obj != null) {
            com.ingo.sdk.kotlin.common.analytics.IngoAnalytics ingoAnalytics = (com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj;
            java.lang.String str = z ? com.ingo.sdk.kotlin.common.analytics.IEventNames.PromoCodeInputDisplayed : com.ingo.sdk.kotlin.common.analytics.IEventNames.PromoCodeInputClosed;
            java.util.Map<java.lang.String, java.lang.String> defaultProperties$default = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties$default(null, 1, null);
            defaultProperties$default.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, com.ingo.sdk.kotlin.common.analytics.IScreenNames.CaptureCheckImages);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            ingoAnalytics.trackEvent(str, defaultProperties$default);
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment confirmTransactionDetailsFragment, androidx.compose.ui.platform.ComposeView composeView) {
        confirmTransactionDetailsFragment.trackMenuPressed();
        android.os.Bundle bundle = new android.os.Bundle();
        if (confirmTransactionDetailsFragment.getArguments() != null) {
            bundle.putAll(confirmTransactionDetailsFragment.getArguments());
        }
        androidx.view.ViewKt.findNavController(composeView).navigate(com.ingo.sdk.android.R.id.action_confirmTransactionDetailsFragment_to_moreMenuFragment, bundle);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment confirmTransactionDetailsFragment, androidx.compose.ui.platform.ComposeView composeView) {
        androidx.compose.runtime.MutableState mutableState;
        com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming;
        androidx.compose.runtime.MutableState mutableState2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putAll(confirmTransactionDetailsFragment.getArguments());
        mutableState = confirmTransactionDetailsFragment.getHighSpeedVideoFpsRanges;
        kotlin.Pair pair = (kotlin.Pair) mutableState.getValue();
        if (pair != null) {
            kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
            java.lang.Object second = pair.getSecond();
            json.getSerializersModule();
            bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_PROMO_CODE_RESPONSE, json.encodeToString(com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse.INSTANCE.serializer(), second));
            bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_PROMO_CODE_STRING, (java.lang.String) pair.getFirst());
        }
        com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment.access$trackConfirmCheckOptionsPressed(confirmTransactionDetailsFragment);
        fundsTiming = confirmTransactionDetailsFragment.getHighSpeedVideoFpsRangesFor;
        if (fundsTiming == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            fundsTiming = null;
        }
        if (fundsTiming.getValue() == com.ingo.sdk.kotlin.common.constants.InMinutesFundsTiming.INSTANCE.getValue()) {
            androidx.view.ViewKt.findNavController(composeView).navigate(com.ingo.sdk.android.R.id.action_confirmTransactionDetailsFragment_to_voidNoticeFragment, bundle);
        } else if (androidx.core.content.ContextCompat.checkSelfPermission(confirmTransactionDetailsFragment.requireContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            confirmTransactionDetailsFragment.Camera2StreamConfigurationMap();
        } else if (confirmTransactionDetailsFragment.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
            mutableState2 = confirmTransactionDetailsFragment.getHighSpeedVideoSizesFor;
            mutableState2.setValue(java.lang.Boolean.TRUE);
        } else {
            confirmTransactionDetailsFragment.doLaunchLocationPermissionRequest();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment confirmTransactionDetailsFragment, androidx.compose.ui.platform.ComposeView composeView) {
        androidx.compose.runtime.MutableState mutableState;
        androidx.view.SavedStateHandle savedStateHandle;
        androidx.view.SavedStateHandle savedStateHandle2;
        confirmTransactionDetailsFragment.trackNavigationPressed();
        mutableState = confirmTransactionDetailsFragment.getHighSpeedVideoFpsRanges;
        kotlin.Pair pair = (kotlin.Pair) mutableState.getValue();
        if (pair != null) {
            androidx.compose.ui.platform.ComposeView composeView2 = composeView;
            androidx.view.NavBackStackEntry previousBackStackEntry = androidx.view.ViewKt.findNavController(composeView2).getPreviousBackStackEntry();
            if (previousBackStackEntry != null && (savedStateHandle2 = previousBackStackEntry.getSavedStateHandle()) != null) {
                savedStateHandle2.set(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_PROMO_CODE_STRING, pair.getFirst());
            }
            androidx.view.NavBackStackEntry previousBackStackEntry2 = androidx.view.ViewKt.findNavController(composeView2).getPreviousBackStackEntry();
            if (previousBackStackEntry2 != null && (savedStateHandle = previousBackStackEntry2.getSavedStateHandle()) != null) {
                kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                java.lang.Object second = pair.getSecond();
                json.getSerializersModule();
                savedStateHandle.set(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_PROMO_CODE_RESPONSE, json.encodeToString(com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse.INSTANCE.serializer(), second));
            }
        }
        androidx.view.ViewKt.findNavController(composeView).popBackStack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment confirmTransactionDetailsFragment) {
        confirmTransactionDetailsFragment.doLaunchLocationPermissionRequest();
        return kotlin.Unit.INSTANCE;
    }

    ConfirmTransactionDetailsFragment$onCreateView$1$1(com.ingo.sdk.android.ux.feature.transaction.confirm_details.ConfirmTransactionDetailsFragment confirmTransactionDetailsFragment, androidx.compose.ui.platform.ComposeView composeView) {
        this.Camera2StreamConfigurationMap = confirmTransactionDetailsFragment;
        this.getHighResolutionOutputSizeshNQ4ISI = composeView;
    }
}
