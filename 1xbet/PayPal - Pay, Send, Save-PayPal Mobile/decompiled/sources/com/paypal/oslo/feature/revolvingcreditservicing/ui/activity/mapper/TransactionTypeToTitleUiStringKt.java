package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "resolveTitle", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "getTransactionTitle", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "transactionTitle"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransactionTypeToTitleUiStringKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getTransactionTitle(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType transactionType) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionType, "");
        switch (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.TransactionTypeToTitleUiStringKt.WhenMappings.$EnumSwitchMapping$0[transactionType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                i = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_payment;
                break;
            case 8:
                i = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_purchase;
                break;
            case 9:
                i = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_recent_activities_fee;
                break;
            case 10:
                i = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_refund;
                break;
            case 11:
                i = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_recent_activities_interest;
                break;
            case 12:
                i = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_recent_activities_cash_advance;
                break;
            case 13:
                i = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_recent_activities_adjustment;
                break;
            case 14:
                i = com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_recent_activities_transaction;
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(i, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString resolveTitle(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.TransactionTypeToTitleUiStringKt.WhenMappings.$EnumSwitchMapping$0[transaction.getTransactionType().ordinal()];
        if (i == 8 || i == 10) {
            java.lang.String transactionName = transaction.getTransactionName();
            java.lang.String str = transactionName;
            if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(transactionName);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity transactionActivity = transaction instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity ? (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity) transaction : null;
            java.lang.String description = transactionActivity != null ? transactionActivity.getDescription() : null;
            java.lang.String str2 = description;
            if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(description);
            }
            return getTransactionTitle(transaction.getTransactionType());
        }
        return getTransactionTitle(transaction.getTransactionType());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PAYMENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.AUTOPAY_PAYMENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.DOWN_PAYMENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.REAL_TIME_PAYMENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PAYMENT_FAILED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PAYMENT_REVERSAL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.SCHEDULED_PAYMENT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.PURCHASE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.FEE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.REFUND.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.INTEREST.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.CASH_ADVANCE.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.ADJUSTMENT.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType.OTHER.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
