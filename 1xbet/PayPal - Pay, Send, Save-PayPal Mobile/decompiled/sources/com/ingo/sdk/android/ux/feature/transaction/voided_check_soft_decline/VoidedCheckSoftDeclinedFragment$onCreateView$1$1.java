package com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class VoidedCheckSoftDeclinedFragment$onCreateView$1$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.ui.platform.ComposeView Camera2StreamConfigurationMap;
    final /* synthetic */ com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoSdkTheme.class));
            if (obj != null) {
                com.ingo.sdk.kotlin.ux.IngoSdkTheme ingoSdkTheme = (com.ingo.sdk.kotlin.ux.IngoSdkTheme) obj;
                java.lang.String title = this.getHighSpeedVideoSizes.getTitle();
                java.lang.String detail = this.getHighSpeedVideoSizes.getDetail();
                int i = com.ingo.sdk.android.R.drawable.ic_alert_status_icon;
                java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class));
                if (obj2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                }
                int parseColor = android.graphics.Color.parseColor((com.ingo.sdk.android.core.ux.theme.ThemeKt.isNightMode((androidx.appcompat.app.AppCompatDelegate) obj2, composer2, 8) ? ingoSdkTheme.getDark() : ingoSdkTheme.getLight()).getAlertColor());
                java.lang.String string = this.Camera2StreamConfigurationMap.getContext().getString(com.ingo.sdk.android.R.string.ingo_resubmit_image);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                final com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment voidedCheckSoftDeclinedFragment = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment$onCreateView$1$1.getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment.this);
                    }
                };
                final com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment voidedCheckSoftDeclinedFragment2 = this.getHighResolutionOutputSizeshNQ4ISI;
                final androidx.compose.ui.platform.ComposeView composeView = this.Camera2StreamConfigurationMap;
                new com.ingo.sdk.android.ux.viewprovider.TerminalScreenViewProvider(title, detail, function0, string, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment$onCreateView$1$1.Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment.this, composeView);
                    }
                }, null, null, null, null, i, parseColor, null, 2528, null).View(composer2, com.ingo.sdk.android.ux.viewprovider.TerminalScreenViewProvider.$stable);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoSdkTheme");
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment voidedCheckSoftDeclinedFragment) {
        java.lang.String transactionReferenceNumberFromArgs;
        voidedCheckSoftDeclinedFragment.trackNavigationPressed();
        transactionReferenceNumberFromArgs = voidedCheckSoftDeclinedFragment.getTransactionReferenceNumberFromArgs();
        com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(voidedCheckSoftDeclinedFragment, com.ingo.sdk.kotlin.common.constants.IngoModules.VOID_IMAGE_SOFT_DECLINED, transactionReferenceNumberFromArgs, null, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment voidedCheckSoftDeclinedFragment, androidx.compose.ui.platform.ComposeView composeView) {
        java.lang.String transactionReferenceNumberFromArgs;
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
        if (obj != null) {
            transactionReferenceNumberFromArgs = voidedCheckSoftDeclinedFragment.getTransactionReferenceNumberFromArgs();
            java.util.Map<java.lang.String, java.lang.String> defaultProperties = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties(transactionReferenceNumberFromArgs);
            defaultProperties.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionRequiresVoid);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.ResumeVoidRequiredTransaction, defaultProperties);
            androidx.view.ViewKt.findNavController(composeView).navigate(com.ingo.sdk.android.R.id.action_voidedCheckSoftDeclinedFragment_to_captureVoidImageFragment, voidedCheckSoftDeclinedFragment.getArguments());
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
    }

    VoidedCheckSoftDeclinedFragment$onCreateView$1$1(com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse voidImageSoftDeclinedResponse, androidx.compose.ui.platform.ComposeView composeView, com.ingo.sdk.android.ux.feature.transaction.voided_check_soft_decline.VoidedCheckSoftDeclinedFragment voidedCheckSoftDeclinedFragment) {
        this.getHighSpeedVideoSizes = voidImageSoftDeclinedResponse;
        this.Camera2StreamConfigurationMap = composeView;
        this.getHighResolutionOutputSizeshNQ4ISI = voidedCheckSoftDeclinedFragment;
    }
}
