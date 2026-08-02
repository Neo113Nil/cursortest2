package com.ingo.sdk.android.ux.feature.transaction.enter_amount;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class EnterAmountFragment$onCreateView$1$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.platform.ComposeView getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.runtime.Composer composer2 = composer;
        if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
            androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> failure = this.getHighSpeedVideoFpsRangesFor.getFailure();
            androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> failureAction = this.getHighSpeedVideoFpsRangesFor.getFailureAction();
            androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> retryAction = this.getHighSpeedVideoFpsRangesFor.getRetryAction();
            mutableState = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            final com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment enterAmountFragment = this.getHighSpeedVideoFpsRangesFor;
            final androidx.compose.ui.platform.ComposeView composeView = this.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment$onCreateView$1$1.getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment.this, composeView, ((java.lang.Long) obj).longValue());
                }
            };
            final com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment enterAmountFragment2 = this.getHighSpeedVideoFpsRangesFor;
            new com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider(failure, failureAction, retryAction, mutableState, function1, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment$onCreateView$1$1.getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment.this);
                }
            }, com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment.access$noOcrAmountFromApi(this.getHighSpeedVideoFpsRangesFor)).View(composer2, com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider.$stable);
        } else {
            composer2.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment enterAmountFragment, androidx.compose.ui.platform.ComposeView composeView, long j) {
        java.lang.String transactionReferenceNumberFromArgs;
        androidx.compose.runtime.MutableState mutableState;
        com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl confirmCheckAmountViewModelImpl;
        java.lang.String transactionReferenceNumberFromArgs2;
        java.lang.String string;
        java.lang.String string2;
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
        if (obj != null) {
            transactionReferenceNumberFromArgs = enterAmountFragment.getTransactionReferenceNumberFromArgs();
            java.util.Map<java.lang.String, java.lang.String> defaultProperties = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties(transactionReferenceNumberFromArgs);
            defaultProperties.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, enterAmountFragment.screenName());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.CheckAmountChanged, defaultProperties);
            java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
            if (obj2 != null) {
                com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse configurationResponse = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj2).configurationResponse();
                com.ingo.sdk.kotlin.common.features.configuration.model.CheckAmountLimits checkAmountLimits = configurationResponse != null ? configurationResponse.getCheckAmountLimits() : null;
                if (j > 0) {
                    if (j < (checkAmountLimits != null ? checkAmountLimits.getMinCheckAmountAcceptedInCents() : 0L)) {
                        if (checkAmountLimits == null || (string2 = checkAmountLimits.getMinCheckAmountNotMetDescription()) == null) {
                            string2 = composeView.getContext().getString(com.ingo.sdk.android.R.string.ingo_default_check_amount_minimum_limit_description);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                        }
                        enterAmountFragment.showFailureMessage(string2);
                        return kotlin.Unit.INSTANCE;
                    }
                }
                if (j > (checkAmountLimits != null ? checkAmountLimits.getMaxCheckAmountAcceptedInCents() : Long.MAX_VALUE)) {
                    if (checkAmountLimits == null || (string = checkAmountLimits.getMaxCheckAmountExceededDescription()) == null) {
                        string = composeView.getContext().getString(com.ingo.sdk.android.R.string.ingo_default_check_amount_exceeds_limit_description);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                    }
                    enterAmountFragment.showFailureMessage(string);
                } else {
                    mutableState = enterAmountFragment.getHighSpeedVideoSizes;
                    mutableState.setValue(java.lang.Boolean.TRUE);
                    confirmCheckAmountViewModelImpl = enterAmountFragment.Camera2StreamConfigurationMap;
                    transactionReferenceNumberFromArgs2 = enterAmountFragment.getTransactionReferenceNumberFromArgs();
                    confirmCheckAmountViewModelImpl.confirmAmountPressed(j, transactionReferenceNumberFromArgs2);
                }
                return kotlin.Unit.INSTANCE;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment enterAmountFragment) {
        enterAmountFragment.trackNavigationPressed();
        com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment.access$onNavigationBack(enterAmountFragment);
        return kotlin.Unit.INSTANCE;
    }

    EnterAmountFragment$onCreateView$1$1(com.ingo.sdk.android.ux.feature.transaction.enter_amount.EnterAmountFragment enterAmountFragment, androidx.compose.ui.platform.ComposeView composeView) {
        this.getHighSpeedVideoFpsRangesFor = enterAmountFragment;
        this.getHighSpeedVideoSizes = composeView;
    }
}
