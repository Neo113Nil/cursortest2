package com.ingo.sdk.android.ux.feature.history.list;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class HistoryListFragment$onCreateView$1$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.platform.ComposeView getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.runtime.MutableState mutableState2;
        androidx.compose.runtime.Composer composer2 = composer;
        if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
            mutableState = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            mutableState2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            final com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment historyListFragment = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.ui.platform.ComposeView composeView = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment$onCreateView$1$1.getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment.this, composeView);
                }
            };
            final androidx.compose.ui.platform.ComposeView composeView2 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment$onCreateView$1$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.platform.ComposeView.this, (com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails) obj);
                }
            };
            final com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment historyListFragment2 = this.getHighResolutionOutputSizeshNQ4ISI;
            new com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider(mutableState, mutableState2, function0, function1, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment$onCreateView$1$1.getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment.this);
                }
            }).View(composer2, com.ingo.sdk.android.ux.viewprovider.HistoryListFragmentViewProvider.$stable);
        } else {
            composer2.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.platform.ComposeView composeView, com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDetails, "");
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
        }
        java.util.Map<java.lang.String, java.lang.String> defaultProperties = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties(transactionDetails.getTransactionReferenceNumber());
        defaultProperties.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionList);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.TransactionListItemSelected, defaultProperties);
        android.os.Bundle bundle = new android.os.Bundle();
        kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
        json.getSerializersModule();
        bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_TRANSACTION_DETAILS, json.encodeToString(com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails.INSTANCE.serializer(), transactionDetails));
        androidx.view.ViewKt.findNavController(composeView).navigate(com.ingo.sdk.android.R.id.action_historyFragment_to_transactionDetailFragment, bundle);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment historyListFragment, androidx.compose.ui.platform.ComposeView composeView) {
        historyListFragment.trackNavigationPressed();
        androidx.view.ViewKt.findNavController(composeView).popBackStack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment historyListFragment) {
        boolean z;
        com.ingo.sdk.android.ux.feature.history.list.TransactionHistoryViewModelImpl transactionHistoryViewModelImpl;
        int i;
        androidx.compose.runtime.MutableState mutableState;
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "List scrolled to end", null, 2, null);
        z = historyListFragment.getInputSizeshNQ4ISI;
        if (z) {
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Fetching more results", null, 2, null);
            transactionHistoryViewModelImpl = historyListFragment.Camera2StreamConfigurationMap;
            i = historyListFragment.getHighSpeedVideoFpsRanges;
            mutableState = historyListFragment.getOutputFormats;
            transactionHistoryViewModelImpl.getTransactionHistory(i, 30, (java.lang.String) mutableState.getValue());
        }
        return kotlin.Unit.INSTANCE;
    }

    HistoryListFragment$onCreateView$1$1(com.ingo.sdk.android.ux.feature.history.list.HistoryListFragment historyListFragment, androidx.compose.ui.platform.ComposeView composeView) {
        this.getHighResolutionOutputSizeshNQ4ISI = historyListFragment;
        this.getHighSpeedVideoFpsRanges = composeView;
    }
}
