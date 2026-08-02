package com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\"\u001a\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\f\u001a\u00020\u0006*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\u000e\u001a\u00020\u0006*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0018\u0010\u0012\u001a\u00020\u000f*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0014\u001a\u00020\u000f*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardReason;", "", "label", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardReason;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "confirmationTitle", "confirmationDescription", "", "getLabelResId", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardReason;)Ljava/lang/Integer;", "labelResId", "getConfirmationTitleResId", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardReason;)I", "confirmationTitleResId", "getConfirmationDescriptionResId", "confirmationDescriptionResId", "", "getShowsFeedbackInput", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardReason;)Z", "showsFeedbackInput", "getHasLearnMoreLink", "hasLearnMoreLink"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CancelCardReasonKt {
    public static final java.lang.Integer getLabelResId(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason cancelCardReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardReason, "");
        int i = com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReasonKt.WhenMappings.$EnumSwitchMapping$0[cancelCardReason.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_cancel_card_reason_no_money);
        }
        if (i == 3) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_cancel_card_reason_transactions_declined);
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_cancel_card_reason_other);
    }

    public static final int getConfirmationTitleResId(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason cancelCardReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardReason, "");
        int i = com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReasonKt.WhenMappings.$EnumSwitchMapping$0[cancelCardReason.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_cancel_card_confirmation_default_title;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_cancel_card_confirmation_add_money_title;
        }
        if (i == 3 || i == 4) {
            return com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_cancel_card_confirmation_sorry_title;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final int getConfirmationDescriptionResId(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason cancelCardReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardReason, "");
        int i = com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReasonKt.WhenMappings.$EnumSwitchMapping$0[cancelCardReason.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_cancel_card_confirmation_default_description;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_cancel_card_confirmation_add_money_description;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_cancel_card_confirmation_sorry_long_description;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_cancel_card_confirmation_sorry_short_description;
    }

    public static final java.lang.String label(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason cancelCardReason, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardReason, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(522880206, i, -1, "com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.label (CancelCardReason.kt:93)");
        }
        java.lang.Integer labelResId = getLabelResId(cancelCardReason);
        if (labelResId == null) {
            composer.startReplaceGroup(-722113255);
            composer.endReplaceGroup();
            stringResource = null;
        } else {
            composer.startReplaceGroup(-722113254);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(labelResId.intValue(), composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final java.lang.String confirmationTitle(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason cancelCardReason, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardReason, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1770437439, i, -1, "com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.confirmationTitle (CancelCardReason.kt:99)");
        }
        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(getConfirmationTitleResId(cancelCardReason), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final java.lang.String confirmationDescription(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason cancelCardReason, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardReason, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2063481381, i, -1, "com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.confirmationDescription (CancelCardReason.kt:105)");
        }
        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(getConfirmationDescriptionResId(cancelCardReason), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final boolean getShowsFeedbackInput(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason cancelCardReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardReason, "");
        return cancelCardReason == com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason.OTHER;
    }

    public static final boolean getHasLearnMoreLink(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason cancelCardReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardReason, "");
        return cancelCardReason == com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason.NO_MONEY;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason.NO_MONEY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason.TRANSACTIONS_DECLINED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardReason.OTHER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
