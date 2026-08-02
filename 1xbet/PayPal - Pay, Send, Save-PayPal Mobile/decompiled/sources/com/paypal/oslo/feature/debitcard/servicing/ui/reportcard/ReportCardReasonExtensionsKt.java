package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\n\u001a\u00020\u0005*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/ReportCardReason;", "", "label", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/ReportCardReason;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "getLabelResId", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/ReportCardReason;)I", "labelResId", "getDescriptionResId", "descriptionResId"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReportCardReasonExtensionsKt {
    public static final int getLabelResId(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason reportCardReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportCardReason, "");
        int i = com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.ReportCardReasonExtensionsKt.WhenMappings.$EnumSwitchMapping$0[reportCardReason.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_report_card_reason_lost_stolen;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_report_card_reason_damaged;
    }

    public static final int getDescriptionResId(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason reportCardReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportCardReason, "");
        int i = com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.ReportCardReasonExtensionsKt.WhenMappings.$EnumSwitchMapping$0[reportCardReason.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_report_card_reason_lost_stolen_description;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_report_card_reason_damaged_description;
    }

    public static final java.lang.String label(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason reportCardReason, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportCardReason, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(699786556, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.label (ReportCardReasonExtensions.kt:48)");
        }
        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(getLabelResId(reportCardReason), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final java.lang.String description(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason reportCardReason, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportCardReason, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-487575756, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.description (ReportCardReasonExtensions.kt:54)");
        }
        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(getDescriptionResId(reportCardReason), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason.LOST_OR_STOLEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.ReportCardReason.DAMAGED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
