package com.paypal.oslo.feature.subscriptions.updatefi.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u001a!\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "fundingInstrument", "", "isBalanceFundingInstrument", "", "buildListItemDescription", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;ZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "isFirstInstrument", "hasPpdcAsFirstFi", "(ZLcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;)Z", "fundingInstrumentUiModel", "buildListItemTitle", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdateFiListItemMappersKt {
    public static final java.lang.String buildListItemDescription(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, boolean z, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        composer.startReplaceGroup(-1064980207);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1064980207, i, -1, "com.paypal.oslo.feature.subscriptions.updatefi.ui.buildListItemDescription (UpdateFiListItemMappers.kt:28)");
        }
        java.lang.String str = null;
        if (hasPpdcAsFirstFi(z, fundingInstrumentUiModel)) {
            composer.startReplaceGroup(98345926);
            java.lang.String formattedBalance = fundingInstrumentUiModel.getFormattedBalance();
            if (formattedBalance != null) {
                str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_available_paypal_balance, new java.lang.Object[]{formattedBalance}, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return null;
            }
        } else if (fundingInstrumentUiModel.getFormattedBalance() != null) {
            composer.startReplaceGroup(-1243745460);
            str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_available_balance, new java.lang.Object[]{fundingInstrumentUiModel.getFormattedBalance()}, composer, 0);
            composer.endReplaceGroup();
        } else if (fundingInstrumentUiModel.getType() instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Credit) {
            composer.startReplaceGroup(98792108);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1243737965);
            str = com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResultKt.getFiLabel(fundingInstrumentUiModel, (android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources()));
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return str;
    }

    public static final boolean hasPpdcAsFirstFi(boolean z, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        return z && (fundingInstrumentUiModel.getType() instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Debit) && fundingInstrumentUiModel.getFormattedBalance() != null;
    }

    public static final java.lang.String buildListItemTitle(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1119514487, i, -1, "com.paypal.oslo.feature.subscriptions.updatefi.ui.buildListItemTitle (UpdateFiListItemMappers.kt:68)");
        }
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel type = fundingInstrumentUiModel.getType();
        if (type instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Debit) {
            composer.startReplaceGroup(-1034845565);
            str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_updatefi_use_ppdc_first, composer, 0);
            composer.endReplaceGroup();
        } else if (type instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPalBalance) {
            composer.startReplaceGroup(-1034705724);
            str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_updatefi_use_ppb_first, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1034608446);
            composer.endReplaceGroup();
            java.lang.String name2 = fundingInstrumentUiModel.getName();
            if (name2 != null) {
                str = name2;
            }
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return str;
    }
}
