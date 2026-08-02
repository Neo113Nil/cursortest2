package com.ingo.sdk.android.ux.feature.transaction.funded;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class TransactionFundedFragment$onCreateView$1$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ com.ingo.sdk.android.ux.feature.transaction.funded.TransactionFundedFragment getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.platform.ComposeView getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse transactionStatusResponse;
        com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse transactionStatusResponse2;
        androidx.compose.runtime.Composer composer2 = composer;
        if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoSdkTheme.class));
            if (obj != null) {
                com.ingo.sdk.kotlin.ux.IngoSdkTheme ingoSdkTheme = (com.ingo.sdk.kotlin.ux.IngoSdkTheme) obj;
                transactionStatusResponse = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse transactionStatusResponse3 = null;
                if (transactionStatusResponse == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    transactionStatusResponse = null;
                }
                java.lang.String title = transactionStatusResponse.getTitle();
                transactionStatusResponse2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                if (transactionStatusResponse2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    transactionStatusResponse3 = transactionStatusResponse2;
                }
                java.lang.String details = transactionStatusResponse3.getDetails();
                int i = com.ingo.sdk.android.R.drawable.ic_success_status_icon;
                java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class));
                if (obj2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                }
                int parseColor = android.graphics.Color.parseColor((com.ingo.sdk.android.core.ux.theme.ThemeKt.isNightMode((androidx.appcompat.app.AppCompatDelegate) obj2, composer2, 8) ? ingoSdkTheme.getDark() : ingoSdkTheme.getLight()).getSecondaryColor());
                java.lang.String string = this.getHighSpeedVideoSizes.getContext().getString(com.ingo.sdk.android.R.string.ingo_done);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                final com.ingo.sdk.android.ux.feature.transaction.funded.TransactionFundedFragment transactionFundedFragment = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.funded.TransactionFundedFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.ux.feature.transaction.funded.TransactionFundedFragment$onCreateView$1$1.Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.transaction.funded.TransactionFundedFragment.this);
                    }
                };
                final com.ingo.sdk.android.ux.feature.transaction.funded.TransactionFundedFragment transactionFundedFragment2 = this.getHighResolutionOutputSizeshNQ4ISI;
                new com.ingo.sdk.android.ux.viewprovider.TerminalScreenViewProvider(title, details, function0, string, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.funded.TransactionFundedFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.ux.feature.transaction.funded.TransactionFundedFragment$onCreateView$1$1.getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.transaction.funded.TransactionFundedFragment.this);
                    }
                }, null, null, null, null, i, parseColor, null, 2528, null).View(composer2, com.ingo.sdk.android.ux.viewprovider.TerminalScreenViewProvider.$stable);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoSdkTheme");
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.transaction.funded.TransactionFundedFragment transactionFundedFragment) {
        com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse transactionStatusResponse;
        com.ingo.sdk.android.ux.feature.transaction.funded.TransactionFundedFragment transactionFundedFragment2 = transactionFundedFragment;
        transactionStatusResponse = transactionFundedFragment.getHighSpeedVideoSizes;
        if (transactionStatusResponse == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            transactionStatusResponse = null;
        }
        com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(transactionFundedFragment2, com.ingo.sdk.kotlin.common.constants.IngoModules.FUNDING_SUCCESS, transactionStatusResponse.getTransactionReferenceNumber(), null, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.transaction.funded.TransactionFundedFragment transactionFundedFragment) {
        com.ingo.sdk.kotlin.common.features.transaction_status.model.TransactionStatusResponse transactionStatusResponse;
        transactionFundedFragment.trackNavigationPressed();
        com.ingo.sdk.android.ux.feature.transaction.funded.TransactionFundedFragment transactionFundedFragment2 = transactionFundedFragment;
        transactionStatusResponse = transactionFundedFragment.getHighSpeedVideoSizes;
        if (transactionStatusResponse == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            transactionStatusResponse = null;
        }
        com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(transactionFundedFragment2, com.ingo.sdk.kotlin.common.constants.IngoModules.FUNDING_SUCCESS, transactionStatusResponse.getTransactionReferenceNumber(), null, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    TransactionFundedFragment$onCreateView$1$1(com.ingo.sdk.android.ux.feature.transaction.funded.TransactionFundedFragment transactionFundedFragment, androidx.compose.ui.platform.ComposeView composeView) {
        this.getHighResolutionOutputSizeshNQ4ISI = transactionFundedFragment;
        this.getHighSpeedVideoSizes = composeView;
    }
}
