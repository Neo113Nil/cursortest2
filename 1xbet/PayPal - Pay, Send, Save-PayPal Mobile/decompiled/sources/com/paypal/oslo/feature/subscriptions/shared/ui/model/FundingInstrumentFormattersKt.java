package com.paypal.oslo.feature.subscriptions.shared.ui.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentPriority;", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "getTrailingLabel", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentPriority;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel;", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "getTypeText", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel;Landroid/content/res/Resources;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FundingInstrumentFormattersKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String getTrailingLabel(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority fundingInstrumentPriority, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentPriority, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-367766092, i, -1, "com.paypal.oslo.feature.subscriptions.shared.ui.model.getTrailingLabel (FundingInstrumentFormatters.kt:39)");
        }
        int i2 = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentFormattersKt.WhenMappings.$EnumSwitchMapping$0[fundingInstrumentPriority.ordinal()];
        java.lang.String str = null;
        if (i2 == 1) {
            composer.startReplaceGroup(-1235891010);
            if ((fundingInstrumentUiModel.getType() instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Debit) || (fundingInstrumentUiModel.getType() instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPalBalance)) {
                composer.startReplaceGroup(342210402);
                str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_details_first, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(342290010);
                composer.endReplaceGroup();
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    composer.startReplaceGroup(-1235892683);
                    composer.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(342458153);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                return str;
            }
            composer.startReplaceGroup(-1235882127);
            str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_details_backup, composer, 0);
        }
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return str;
    }

    public static final java.lang.String getTypeText(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel fundingInstrumentTypeUiModel, android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentTypeUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        if (fundingInstrumentTypeUiModel instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card.Credit) {
            java.lang.String string = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_credit);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (fundingInstrumentTypeUiModel instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card.Debit) {
            java.lang.String string2 = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_debit);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        if (fundingInstrumentTypeUiModel instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Bank.Savings) {
            java.lang.String string3 = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_savings);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
            return string3;
        }
        if (fundingInstrumentTypeUiModel instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Bank.Checking) {
            java.lang.String string4 = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_fi_type_checking);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
            return string4;
        }
        if (fundingInstrumentTypeUiModel instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card.Prepaid) {
            java.lang.String string5 = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_fi_type_prepaid);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "");
            return string5;
        }
        if ((fundingInstrumentTypeUiModel instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal) || kotlin.jvm.internal.Intrinsics.areEqual(fundingInstrumentTypeUiModel, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPalBalance.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(fundingInstrumentTypeUiModel, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Unknown.INSTANCE)) {
            return "";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority.values().length];
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority.PRIMARY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority.BACKUP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
