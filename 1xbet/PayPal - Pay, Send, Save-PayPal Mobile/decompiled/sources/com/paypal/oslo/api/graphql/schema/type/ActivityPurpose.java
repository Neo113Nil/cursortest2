package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\bS\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bU"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityPurpose;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BILLING_AGREEMENT_PAYMENT", "BONUS", "CASHBACK", "CASH_ADVANCE", "CASH_REWARD", "CORRECTION", "DONATION", "EXTERNAL_REFUND", "FEE_REVERSAL", "GIFT_CERTIFICATE_PURCHASE", "INCENTIVE_REDEMPTION", "INCENTIVE_TRANSFER", "INVOICE_PAYMENT", "MAINTENANCE_FEE", "MINIMUM_BALANCE_REWARD", "MONEY_REQUEST_PAYMENT", "NON_REFERENCED_CREDIT", "PARTNER_FEE_REVERSAL", "PAYOUT_PAYMENT", "PAYABLES_RECOVERY", "PAYPAL_SERVICES", com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.PERSONAL, "POSTAGE_PAYMENT", "PURCHASE_GIFT_CERTIFICATE", "PURCHASE_GOODS", "PURCHASE_SERVICES", "REBATE_REVERSAL", "RECEIVABLES", "RED_ENVELOPE", "RECLAMATION", "RECURRING_PAYMENT", "REFUND_FOR_CANCELED_PAYMENT", "REFUND_FOR_DENIED_PAYMENT", "REFUND_FOR_FAILED_TRANSFER", "REIMBURSMENT", "REWARD", "SCHEDULED_PAYMENT", "SUBSCRIPTION_PAYMENT", "THIRD_PARTY_SHIPPING", "TRANSACTION_UPDATE", "YOUTH_ACCOUNT_TRANSFER", "CASHBACK_NFC", "CASHBACK_PPAC", "MONEYBOX_TRANSFER", "DELAYED_DISBURSEMENT", "PARTNER_DISBURSEMENT", "CASHIN", "SHORT_PAYMENT", "DIRECT_DEPOSIT", "TOPUP_BALANCE", "CARD_WITHDRAW", "CARD_REVERSAL", "MOBILE_TOP_UP", "WALLET_TOP_UP", "NEGATIVE_BALANCE_COLLECTION", "PURCHASE_DIGITAL_GOODS", "PURCHASE_SERVICE", "CASHED_CHECK", "RECEIVABLE_REPAYMENT", "EXTERNAL_INTEREST_PAYMENT", "INACTIVITY_FEE", "CUSTODY_FEE", "SAVINGS_REVERSAL", "SAVINGS_ADJUSTMENT", "GARNISHMENT", "LEVY", "CRYPTO_RECURRING_PAYMENT", "GOODS_AND_SERVICES_TAX", "SELLER_LIABILITY", "HELD_FOR_RECEIVING", "UNDER_RISK_REVIEW_TO_RECEIVE", "BILL_PAYMENT", "CARD_DEPOSIT", "EXTERNAL_SUBSCRIPTION_PAYMENT", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityPurpose {
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose BILLING_AGREEMENT_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose BILL_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose BONUS;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose CARD_DEPOSIT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose CARD_REVERSAL;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose CARD_WITHDRAW;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose CASHBACK;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose CASHBACK_NFC;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose CASHBACK_PPAC;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose CASHED_CHECK;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose CASHIN;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose CASH_ADVANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose CASH_REWARD;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose CORRECTION;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose CRYPTO_RECURRING_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose CUSTODY_FEE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose DELAYED_DISBURSEMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose DIRECT_DEPOSIT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose DONATION;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose EXTERNAL_INTEREST_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose EXTERNAL_REFUND;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose EXTERNAL_SUBSCRIPTION_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose FEE_REVERSAL;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose GARNISHMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose GIFT_CERTIFICATE_PURCHASE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose GOODS_AND_SERVICES_TAX;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose HELD_FOR_RECEIVING;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose INACTIVITY_FEE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose INCENTIVE_REDEMPTION;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose INCENTIVE_TRANSFER;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose INVOICE_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose LEVY;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose MAINTENANCE_FEE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose MINIMUM_BALANCE_REWARD;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose MOBILE_TOP_UP;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose MONEYBOX_TRANSFER;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose MONEY_REQUEST_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose NEGATIVE_BALANCE_COLLECTION;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose NON_REFERENCED_CREDIT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose PARTNER_DISBURSEMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose PARTNER_FEE_REVERSAL;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose PAYABLES_RECOVERY;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose PAYOUT_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose PAYPAL_SERVICES;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose PERSONAL;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose POSTAGE_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose PURCHASE_DIGITAL_GOODS;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose PURCHASE_GIFT_CERTIFICATE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose PURCHASE_GOODS;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose PURCHASE_SERVICE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose PURCHASE_SERVICES;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose REBATE_REVERSAL;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose RECEIVABLES;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose RECEIVABLE_REPAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose RECLAMATION;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose RECURRING_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose RED_ENVELOPE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose REFUND_FOR_CANCELED_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose REFUND_FOR_DENIED_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose REFUND_FOR_FAILED_TRANSFER;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose REIMBURSMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose REWARD;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose SAVINGS_ADJUSTMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose SAVINGS_REVERSAL;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose SCHEDULED_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose SELLER_LIABILITY;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose SHORT_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose SUBSCRIPTION_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose THIRD_PARTY_SHIPPING;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose TOPUP_BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose TRANSACTION_UPDATE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose UNDER_RISK_REVIEW_TO_RECEIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose WALLET_TOP_UP;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose YOUTH_ACCOUNT_TRANSFER;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ActivityPurpose[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ActivityPurpose(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("BILLING_AGREEMENT_PAYMENT", 0, "BILLING_AGREEMENT_PAYMENT");
        BILLING_AGREEMENT_PAYMENT = activityPurpose;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose2 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("BONUS", 1, "BONUS");
        BONUS = activityPurpose2;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose3 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("CASHBACK", 2, "CASHBACK");
        CASHBACK = activityPurpose3;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose4 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("CASH_ADVANCE", 3, "CASH_ADVANCE");
        CASH_ADVANCE = activityPurpose4;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose5 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("CASH_REWARD", 4, "CASH_REWARD");
        CASH_REWARD = activityPurpose5;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose6 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("CORRECTION", 5, "CORRECTION");
        CORRECTION = activityPurpose6;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose7 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("DONATION", 6, "DONATION");
        DONATION = activityPurpose7;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose8 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("EXTERNAL_REFUND", 7, "EXTERNAL_REFUND");
        EXTERNAL_REFUND = activityPurpose8;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose9 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("FEE_REVERSAL", 8, "FEE_REVERSAL");
        FEE_REVERSAL = activityPurpose9;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose10 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("GIFT_CERTIFICATE_PURCHASE", 9, "GIFT_CERTIFICATE_PURCHASE");
        GIFT_CERTIFICATE_PURCHASE = activityPurpose10;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose11 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("INCENTIVE_REDEMPTION", 10, "INCENTIVE_REDEMPTION");
        INCENTIVE_REDEMPTION = activityPurpose11;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose12 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("INCENTIVE_TRANSFER", 11, "INCENTIVE_TRANSFER");
        INCENTIVE_TRANSFER = activityPurpose12;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose13 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("INVOICE_PAYMENT", 12, "INVOICE_PAYMENT");
        INVOICE_PAYMENT = activityPurpose13;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose14 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("MAINTENANCE_FEE", 13, "MAINTENANCE_FEE");
        MAINTENANCE_FEE = activityPurpose14;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose15 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("MINIMUM_BALANCE_REWARD", 14, "MINIMUM_BALANCE_REWARD");
        MINIMUM_BALANCE_REWARD = activityPurpose15;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose16 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("MONEY_REQUEST_PAYMENT", 15, "MONEY_REQUEST_PAYMENT");
        MONEY_REQUEST_PAYMENT = activityPurpose16;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose17 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("NON_REFERENCED_CREDIT", 16, "NON_REFERENCED_CREDIT");
        NON_REFERENCED_CREDIT = activityPurpose17;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose18 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("PARTNER_FEE_REVERSAL", 17, "PARTNER_FEE_REVERSAL");
        PARTNER_FEE_REVERSAL = activityPurpose18;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose19 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("PAYOUT_PAYMENT", 18, "PAYOUT_PAYMENT");
        PAYOUT_PAYMENT = activityPurpose19;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose20 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("PAYABLES_RECOVERY", 19, "PAYABLES_RECOVERY");
        PAYABLES_RECOVERY = activityPurpose20;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose21 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("PAYPAL_SERVICES", 20, "PAYPAL_SERVICES");
        PAYPAL_SERVICES = activityPurpose21;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose22 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose(com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.PERSONAL, 21, com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.PERSONAL);
        PERSONAL = activityPurpose22;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose23 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("POSTAGE_PAYMENT", 22, "POSTAGE_PAYMENT");
        POSTAGE_PAYMENT = activityPurpose23;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose24 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("PURCHASE_GIFT_CERTIFICATE", 23, "PURCHASE_GIFT_CERTIFICATE");
        PURCHASE_GIFT_CERTIFICATE = activityPurpose24;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose25 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("PURCHASE_GOODS", 24, "PURCHASE_GOODS");
        PURCHASE_GOODS = activityPurpose25;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose26 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("PURCHASE_SERVICES", 25, "PURCHASE_SERVICES");
        PURCHASE_SERVICES = activityPurpose26;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose27 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("REBATE_REVERSAL", 26, "REBATE_REVERSAL");
        REBATE_REVERSAL = activityPurpose27;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose28 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("RECEIVABLES", 27, "RECEIVABLES");
        RECEIVABLES = activityPurpose28;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose29 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("RED_ENVELOPE", 28, "RED_ENVELOPE");
        RED_ENVELOPE = activityPurpose29;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose30 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("RECLAMATION", 29, "RECLAMATION");
        RECLAMATION = activityPurpose30;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose31 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("RECURRING_PAYMENT", 30, "RECURRING_PAYMENT");
        RECURRING_PAYMENT = activityPurpose31;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose32 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("REFUND_FOR_CANCELED_PAYMENT", 31, "REFUND_FOR_CANCELED_PAYMENT");
        REFUND_FOR_CANCELED_PAYMENT = activityPurpose32;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose33 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("REFUND_FOR_DENIED_PAYMENT", 32, "REFUND_FOR_DENIED_PAYMENT");
        REFUND_FOR_DENIED_PAYMENT = activityPurpose33;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose34 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("REFUND_FOR_FAILED_TRANSFER", 33, "REFUND_FOR_FAILED_TRANSFER");
        REFUND_FOR_FAILED_TRANSFER = activityPurpose34;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose35 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("REIMBURSMENT", 34, "REIMBURSMENT");
        REIMBURSMENT = activityPurpose35;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose36 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("REWARD", 35, "REWARD");
        REWARD = activityPurpose36;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose37 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("SCHEDULED_PAYMENT", 36, "SCHEDULED_PAYMENT");
        SCHEDULED_PAYMENT = activityPurpose37;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose38 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("SUBSCRIPTION_PAYMENT", 37, "SUBSCRIPTION_PAYMENT");
        SUBSCRIPTION_PAYMENT = activityPurpose38;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose39 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("THIRD_PARTY_SHIPPING", 38, "THIRD_PARTY_SHIPPING");
        THIRD_PARTY_SHIPPING = activityPurpose39;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose40 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("TRANSACTION_UPDATE", 39, "TRANSACTION_UPDATE");
        TRANSACTION_UPDATE = activityPurpose40;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose41 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("YOUTH_ACCOUNT_TRANSFER", 40, "YOUTH_ACCOUNT_TRANSFER");
        YOUTH_ACCOUNT_TRANSFER = activityPurpose41;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose42 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("CASHBACK_NFC", 41, "CASHBACK_NFC");
        CASHBACK_NFC = activityPurpose42;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose43 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("CASHBACK_PPAC", 42, "CASHBACK_PPAC");
        CASHBACK_PPAC = activityPurpose43;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose44 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("MONEYBOX_TRANSFER", 43, "MONEYBOX_TRANSFER");
        MONEYBOX_TRANSFER = activityPurpose44;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose45 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("DELAYED_DISBURSEMENT", 44, "DELAYED_DISBURSEMENT");
        DELAYED_DISBURSEMENT = activityPurpose45;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose46 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("PARTNER_DISBURSEMENT", 45, "PARTNER_DISBURSEMENT");
        PARTNER_DISBURSEMENT = activityPurpose46;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose47 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("CASHIN", 46, "CASHIN");
        CASHIN = activityPurpose47;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose48 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("SHORT_PAYMENT", 47, "SHORT_PAYMENT");
        SHORT_PAYMENT = activityPurpose48;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose49 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("DIRECT_DEPOSIT", 48, "DIRECT_DEPOSIT");
        DIRECT_DEPOSIT = activityPurpose49;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose50 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("TOPUP_BALANCE", 49, "TOPUP_BALANCE");
        TOPUP_BALANCE = activityPurpose50;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose51 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("CARD_WITHDRAW", 50, "CARD_WITHDRAW");
        CARD_WITHDRAW = activityPurpose51;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose52 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("CARD_REVERSAL", 51, "CARD_REVERSAL");
        CARD_REVERSAL = activityPurpose52;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose53 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("MOBILE_TOP_UP", 52, "MOBILE_TOP_UP");
        MOBILE_TOP_UP = activityPurpose53;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose54 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("WALLET_TOP_UP", 53, "WALLET_TOP_UP");
        WALLET_TOP_UP = activityPurpose54;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose55 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("NEGATIVE_BALANCE_COLLECTION", 54, "NEGATIVE_BALANCE_COLLECTION");
        NEGATIVE_BALANCE_COLLECTION = activityPurpose55;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose56 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("PURCHASE_DIGITAL_GOODS", 55, "PURCHASE_DIGITAL_GOODS");
        PURCHASE_DIGITAL_GOODS = activityPurpose56;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose57 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("PURCHASE_SERVICE", 56, "PURCHASE_SERVICE");
        PURCHASE_SERVICE = activityPurpose57;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose58 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("CASHED_CHECK", 57, "CASHED_CHECK");
        CASHED_CHECK = activityPurpose58;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose59 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("RECEIVABLE_REPAYMENT", 58, "RECEIVABLE_REPAYMENT");
        RECEIVABLE_REPAYMENT = activityPurpose59;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose60 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("EXTERNAL_INTEREST_PAYMENT", 59, "EXTERNAL_INTEREST_PAYMENT");
        EXTERNAL_INTEREST_PAYMENT = activityPurpose60;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose61 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("INACTIVITY_FEE", 60, "INACTIVITY_FEE");
        INACTIVITY_FEE = activityPurpose61;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose62 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("CUSTODY_FEE", 61, "CUSTODY_FEE");
        CUSTODY_FEE = activityPurpose62;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose63 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("SAVINGS_REVERSAL", 62, "SAVINGS_REVERSAL");
        SAVINGS_REVERSAL = activityPurpose63;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose64 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("SAVINGS_ADJUSTMENT", 63, "SAVINGS_ADJUSTMENT");
        SAVINGS_ADJUSTMENT = activityPurpose64;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose65 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("GARNISHMENT", 64, "GARNISHMENT");
        GARNISHMENT = activityPurpose65;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose66 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("LEVY", 65, "LEVY");
        LEVY = activityPurpose66;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose67 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("CRYPTO_RECURRING_PAYMENT", 66, "CRYPTO_RECURRING_PAYMENT");
        CRYPTO_RECURRING_PAYMENT = activityPurpose67;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose68 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("GOODS_AND_SERVICES_TAX", 67, "GOODS_AND_SERVICES_TAX");
        GOODS_AND_SERVICES_TAX = activityPurpose68;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose69 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("SELLER_LIABILITY", 68, "SELLER_LIABILITY");
        SELLER_LIABILITY = activityPurpose69;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose70 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("HELD_FOR_RECEIVING", 69, "HELD_FOR_RECEIVING");
        HELD_FOR_RECEIVING = activityPurpose70;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose71 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("UNDER_RISK_REVIEW_TO_RECEIVE", 70, "UNDER_RISK_REVIEW_TO_RECEIVE");
        UNDER_RISK_REVIEW_TO_RECEIVE = activityPurpose71;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose72 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("BILL_PAYMENT", 71, "BILL_PAYMENT");
        BILL_PAYMENT = activityPurpose72;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose73 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("CARD_DEPOSIT", 72, "CARD_DEPOSIT");
        CARD_DEPOSIT = activityPurpose73;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose74 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("EXTERNAL_SUBSCRIPTION_PAYMENT", 73, "EXTERNAL_SUBSCRIPTION_PAYMENT");
        EXTERNAL_SUBSCRIPTION_PAYMENT = activityPurpose74;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose75 = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose("UNKNOWN__", 74, "UNKNOWN__");
        UNKNOWN__ = activityPurpose75;
        com.paypal.oslo.api.graphql.schema.type.ActivityPurpose[] activityPurposeArr = {activityPurpose, activityPurpose2, activityPurpose3, activityPurpose4, activityPurpose5, activityPurpose6, activityPurpose7, activityPurpose8, activityPurpose9, activityPurpose10, activityPurpose11, activityPurpose12, activityPurpose13, activityPurpose14, activityPurpose15, activityPurpose16, activityPurpose17, activityPurpose18, activityPurpose19, activityPurpose20, activityPurpose21, activityPurpose22, activityPurpose23, activityPurpose24, activityPurpose25, activityPurpose26, activityPurpose27, activityPurpose28, activityPurpose29, activityPurpose30, activityPurpose31, activityPurpose32, activityPurpose33, activityPurpose34, activityPurpose35, activityPurpose36, activityPurpose37, activityPurpose38, activityPurpose39, activityPurpose40, activityPurpose41, activityPurpose42, activityPurpose43, activityPurpose44, activityPurpose45, activityPurpose46, activityPurpose47, activityPurpose48, activityPurpose49, activityPurpose50, activityPurpose51, activityPurpose52, activityPurpose53, activityPurpose54, activityPurpose55, activityPurpose56, activityPurpose57, activityPurpose58, activityPurpose59, activityPurpose60, activityPurpose61, activityPurpose62, activityPurpose63, activityPurpose64, activityPurpose65, activityPurpose66, activityPurpose67, activityPurpose68, activityPurpose69, activityPurpose70, activityPurpose71, activityPurpose72, activityPurpose73, activityPurpose74, activityPurpose75};
        getHighResolutionOutputSizeshNQ4ISI = activityPurposeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(activityPurposeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ActivityPurpose", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BILLING_AGREEMENT_PAYMENT", "BONUS", "CASHBACK", "CASH_ADVANCE", "CASH_REWARD", "CORRECTION", "DONATION", "EXTERNAL_REFUND", "FEE_REVERSAL", "GIFT_CERTIFICATE_PURCHASE", "INCENTIVE_REDEMPTION", "INCENTIVE_TRANSFER", "INVOICE_PAYMENT", "MAINTENANCE_FEE", "MINIMUM_BALANCE_REWARD", "MONEY_REQUEST_PAYMENT", "NON_REFERENCED_CREDIT", "PARTNER_FEE_REVERSAL", "PAYOUT_PAYMENT", "PAYABLES_RECOVERY", "PAYPAL_SERVICES", com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.PERSONAL, "POSTAGE_PAYMENT", "PURCHASE_GIFT_CERTIFICATE", "PURCHASE_GOODS", "PURCHASE_SERVICES", "REBATE_REVERSAL", "RECEIVABLES", "RED_ENVELOPE", "RECLAMATION", "RECURRING_PAYMENT", "REFUND_FOR_CANCELED_PAYMENT", "REFUND_FOR_DENIED_PAYMENT", "REFUND_FOR_FAILED_TRANSFER", "REIMBURSMENT", "REWARD", "SCHEDULED_PAYMENT", "SUBSCRIPTION_PAYMENT", "THIRD_PARTY_SHIPPING", "TRANSACTION_UPDATE", "YOUTH_ACCOUNT_TRANSFER", "CASHBACK_NFC", "CASHBACK_PPAC", "MONEYBOX_TRANSFER", "DELAYED_DISBURSEMENT", "PARTNER_DISBURSEMENT", "CASHIN", "SHORT_PAYMENT", "DIRECT_DEPOSIT", "TOPUP_BALANCE", "CARD_WITHDRAW", "CARD_REVERSAL", "MOBILE_TOP_UP", "WALLET_TOP_UP", "NEGATIVE_BALANCE_COLLECTION", "PURCHASE_DIGITAL_GOODS", "PURCHASE_SERVICE", "CASHED_CHECK", "RECEIVABLE_REPAYMENT", "EXTERNAL_INTEREST_PAYMENT", "INACTIVITY_FEE", "CUSTODY_FEE", "SAVINGS_REVERSAL", "SAVINGS_ADJUSTMENT", "GARNISHMENT", "LEVY", "CRYPTO_RECURRING_PAYMENT", "GOODS_AND_SERVICES_TAX", "SELLER_LIABILITY", "HELD_FOR_RECEIVING", "UNDER_RISK_REVIEW_TO_RECEIVE", "BILL_PAYMENT", "CARD_DEPOSIT", "EXTERNAL_SUBSCRIPTION_PAYMENT"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityPurpose$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityPurpose;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ActivityPurpose;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ActivityPurpose;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityPurpose> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose[]{com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.BILLING_AGREEMENT_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.BONUS, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.CASHBACK, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.CASH_ADVANCE, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.CASH_REWARD, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.CORRECTION, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.DONATION, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.EXTERNAL_REFUND, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.FEE_REVERSAL, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.GIFT_CERTIFICATE_PURCHASE, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.INCENTIVE_REDEMPTION, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.INCENTIVE_TRANSFER, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.INVOICE_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.MAINTENANCE_FEE, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.MINIMUM_BALANCE_REWARD, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.MONEY_REQUEST_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.NON_REFERENCED_CREDIT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.PARTNER_FEE_REVERSAL, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.PAYOUT_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.PAYABLES_RECOVERY, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.PAYPAL_SERVICES, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.PERSONAL, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.POSTAGE_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.PURCHASE_GIFT_CERTIFICATE, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.PURCHASE_GOODS, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.PURCHASE_SERVICES, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.REBATE_REVERSAL, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.RECEIVABLES, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.RED_ENVELOPE, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.RECLAMATION, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.RECURRING_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.REFUND_FOR_CANCELED_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.REFUND_FOR_DENIED_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.REFUND_FOR_FAILED_TRANSFER, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.REIMBURSMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.REWARD, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.SCHEDULED_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.SUBSCRIPTION_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.THIRD_PARTY_SHIPPING, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.TRANSACTION_UPDATE, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.YOUTH_ACCOUNT_TRANSFER, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.CASHBACK_NFC, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.CASHBACK_PPAC, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.MONEYBOX_TRANSFER, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.DELAYED_DISBURSEMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.PARTNER_DISBURSEMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.CASHIN, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.SHORT_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.DIRECT_DEPOSIT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.TOPUP_BALANCE, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.CARD_WITHDRAW, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.CARD_REVERSAL, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.MOBILE_TOP_UP, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.WALLET_TOP_UP, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.NEGATIVE_BALANCE_COLLECTION, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.PURCHASE_DIGITAL_GOODS, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.PURCHASE_SERVICE, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.CASHED_CHECK, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.RECEIVABLE_REPAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.EXTERNAL_INTEREST_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.INACTIVITY_FEE, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.CUSTODY_FEE, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.SAVINGS_REVERSAL, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.SAVINGS_ADJUSTMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.GARNISHMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.LEVY, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.CRYPTO_RECURRING_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.GOODS_AND_SERVICES_TAX, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.SELLER_LIABILITY, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.HELD_FOR_RECEIVING, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.UNDER_RISK_REVIEW_TO_RECEIVE, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.BILL_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.CARD_DEPOSIT, com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.EXTERNAL_SUBSCRIPTION_PAYMENT});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ActivityPurpose[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ActivityPurpose[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityPurpose safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ActivityPurpose) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ActivityPurpose activityPurpose = (com.paypal.oslo.api.graphql.schema.type.ActivityPurpose) obj;
            return activityPurpose == null ? com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.UNKNOWN__ : activityPurpose;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityPurpose[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityPurpose[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityPurpose valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityPurpose) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ActivityPurpose> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
