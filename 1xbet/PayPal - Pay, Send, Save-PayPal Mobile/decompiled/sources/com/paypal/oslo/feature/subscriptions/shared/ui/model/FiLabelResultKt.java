package com.paypal.oslo.feature.subscriptions.shared.ui.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0013\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0017\u001a!\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "preferredFundingInstrument", "balanceFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "balancePreference", "", "getSecondaryTextForHub", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "getFiLabel", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Landroid/content/res/Resources;)Ljava/lang/String;", "getSecondaryText", "(Landroid/content/res/Resources;Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;)Ljava/lang/String;", "p0", "p1", "p2", "p3", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FiLabelResult;", "getHighSpeedVideoSizes", "(Landroid/content/res/Resources;Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;)Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FiLabelResult;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel;", "", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel;Ljava/lang/String;)V", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FiLabelResultKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String getSecondaryTextForHub(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel2, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, androidx.compose.runtime.Composer composer, int i) {
        boolean z;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult highSpeedVideoSizes;
        java.lang.String text;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balancePreference, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(910421200, i, -1, "com.paypal.oslo.feature.subscriptions.shared.ui.model.getSecondaryTextForHub (FiLabelResult.kt:26)");
        }
        java.lang.String str = null;
        if (balancePreference == com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED) {
            if ((fundingInstrumentUiModel2 != null ? fundingInstrumentUiModel2.getType() : null) instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPalBalance) {
                z = true;
                highSpeedVideoSizes = getHighSpeedVideoSizes((android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources()), fundingInstrumentUiModel, fundingInstrumentUiModel2, balancePreference);
                if (!(highSpeedVideoSizes instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.MappedFiType)) {
                    composer.startReplaceGroup(-359895516);
                    if (z) {
                        composer.startReplaceGroup(-359856022);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_paypal_balance_first, composer, 0));
                        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                        sb.append(((com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.MappedFiType) highSpeedVideoSizes).getText());
                        text = sb.toString();
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-359625785);
                        composer.endReplaceGroup();
                        text = ((com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.MappedFiType) highSpeedVideoSizes).getText();
                    }
                    str = text;
                    composer.endReplaceGroup();
                } else if (highSpeedVideoSizes instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.Final) {
                    composer.startReplaceGroup(-1258523116);
                    composer.endReplaceGroup();
                    str = ((com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.Final) highSpeedVideoSizes).getText();
                } else {
                    if (!(highSpeedVideoSizes instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.InvalidState) && !(highSpeedVideoSizes instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.Empty)) {
                        composer.startReplaceGroup(-1258537039);
                        composer.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(-359336339);
                    composer.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                return str;
            }
        }
        z = false;
        highSpeedVideoSizes = getHighSpeedVideoSizes((android.content.res.Resources) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources()), fundingInstrumentUiModel, fundingInstrumentUiModel2, balancePreference);
        if (!(highSpeedVideoSizes instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.MappedFiType)) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return str;
    }

    public static final java.lang.String getFiLabel(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel type = fundingInstrumentUiModel.getType();
        if (type instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Debit) {
            return resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_paypal_debit);
        }
        if (type instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Credit) {
            java.lang.String name2 = fundingInstrumentUiModel.getName();
            if (name2 != null) {
                return name2;
            }
            java.lang.String string = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_paypal_credit);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (type instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPalBalance) {
            getHighSpeedVideoSizes(fundingInstrumentUiModel.getType(), fundingInstrumentUiModel.getName());
            return null;
        }
        java.lang.String typeText = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentFormattersKt.getTypeText(fundingInstrumentUiModel.getType(), resources);
        if (fundingInstrumentUiModel.getLastDigits() != null) {
            return resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_last_digits, typeText, fundingInstrumentUiModel.getLastDigits());
        }
        getHighSpeedVideoFpsRanges(fundingInstrumentUiModel.getType(), fundingInstrumentUiModel.getName());
        java.lang.String str = typeText;
        return str.length() != 0 ? str : null;
    }

    public static final java.lang.String getSecondaryText(android.content.res.Resources resources, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balancePreference, "");
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult highSpeedVideoSizes = getHighSpeedVideoSizes(resources, fundingInstrumentUiModel, fundingInstrumentUiModel2, balancePreference);
        if (highSpeedVideoSizes instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.Final) {
            return ((com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.Final) highSpeedVideoSizes).getText();
        }
        if (highSpeedVideoSizes instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.MappedFiType) {
            return ((com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.MappedFiType) highSpeedVideoSizes).getText();
        }
        if ((highSpeedVideoSizes instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.InvalidState) || (highSpeedVideoSizes instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.Empty)) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private static final com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult getHighSpeedVideoSizes(android.content.res.Resources resources, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel2, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference) {
        if (((fundingInstrumentUiModel2 != null ? fundingInstrumentUiModel2.getType() : null) instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Debit) && balancePreference == com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED) {
            java.lang.String string = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_paypal_debit);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            return new com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.Final(string);
        }
        if ((fundingInstrumentUiModel != null ? fundingInstrumentUiModel.getType() : null) instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Credit) {
            java.lang.String name2 = fundingInstrumentUiModel.getName();
            if (name2 == null) {
                name2 = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_paypal_credit);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            }
            return new com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.Final(name2);
        }
        if (!((fundingInstrumentUiModel != null ? fundingInstrumentUiModel.getType() : null) instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPalBalance)) {
            if (!((fundingInstrumentUiModel != null ? fundingInstrumentUiModel.getType() : null) instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Debit)) {
                if (fundingInstrumentUiModel != null) {
                    if (fundingInstrumentUiModel.getLastDigits() == null) {
                        getHighSpeedVideoFpsRanges(fundingInstrumentUiModel.getType(), fundingInstrumentUiModel.getName());
                        return new com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.MappedFiType(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentFormattersKt.getTypeText(fundingInstrumentUiModel.getType(), resources));
                    }
                    return new com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.MappedFiType(resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_last_digits, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentFormattersKt.getTypeText(fundingInstrumentUiModel.getType(), resources), fundingInstrumentUiModel.getLastDigits()));
                }
                return com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.Empty.INSTANCE;
            }
        }
        getHighSpeedVideoSizes(fundingInstrumentUiModel.getType(), fundingInstrumentUiModel.getName());
        return com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResult.InvalidState.INSTANCE;
    }

    private static final void getHighSpeedVideoSizes(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel fundingInstrumentTypeUiModel, java.lang.String str) {
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "impossible state for preferred fi in FiLabelResult", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fi_type", fundingInstrumentTypeUiModel.toString()), kotlin.TuplesKt.to("fi_name", str)), null, 4, null);
    }

    private static final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel fundingInstrumentTypeUiModel, java.lang.String str) {
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "fi has non-null type but null last digits in FiLabelResult", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fi_type", fundingInstrumentTypeUiModel.toString()), kotlin.TuplesKt.to("fi_name", str)), null, 4, null);
    }
}
