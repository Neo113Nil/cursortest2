package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b!\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountIneligibilityReasonCode;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ACCOUNT_RESTRICTIONS", "PENDING_SETTLEMENT", "WITHDRAWAL_LIMITS", "ACCOUNT_HAS_INVALID_DATA", "PENDING_TRANSACTIONS", "WITHDRAW_NOT_PERMITTED", "OPEN_DISPUTES", "CC_NOT_VERIFIED", "NEGATIVE_BALANCE", "ACTIVE_RECURRING_MERCHANT_PROFILES", "ACTIVE_RECURRING_CONSUMER_PROFILES", "UNCONFIRMED_EMAIL_WITH_PAYMENT", "RISK_RESTRICTED_CLOSE_ACCOUNT", "BALANCE_LESS_THAN_WITHDRAWAL_FEE", "NONZERO_COLLATERAL", "FUNDS_DISBURSEMENT_OPTIONS_UNAVAILABLE", "FDIC_FREEZE", "RISK_DECLINE", "HAS_CRYPTO_CURRENCY_HOLDING", "HAS_ACTIVE_SAVINGS_ACCOUNT", "HAS_OPEN_GROUP_MONEY_POOL", "HAS_GROUP_MONEY_POOL_WITH_BALANCE", "HONEY_GOLD_REDEEMABLE_BALANCE", "HAS_APPROVED_BANKING_PRODUCT", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CloseAccountIneligibilityReasonCode {
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode ACCOUNT_HAS_INVALID_DATA;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode ACCOUNT_RESTRICTIONS;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode ACTIVE_RECURRING_CONSUMER_PROFILES;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode ACTIVE_RECURRING_MERCHANT_PROFILES;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode BALANCE_LESS_THAN_WITHDRAWAL_FEE;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode CC_NOT_VERIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode FDIC_FREEZE;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode FUNDS_DISBURSEMENT_OPTIONS_UNAVAILABLE;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode HAS_ACTIVE_SAVINGS_ACCOUNT;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode HAS_APPROVED_BANKING_PRODUCT;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode HAS_CRYPTO_CURRENCY_HOLDING;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode HAS_GROUP_MONEY_POOL_WITH_BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode HAS_OPEN_GROUP_MONEY_POOL;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode HONEY_GOLD_REDEEMABLE_BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode NEGATIVE_BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode NONZERO_COLLATERAL;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode OPEN_DISPUTES;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode PENDING_SETTLEMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode PENDING_TRANSACTIONS;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode RISK_DECLINE;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode RISK_RESTRICTED_CLOSE_ACCOUNT;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode UNCONFIRMED_EMAIL_WITH_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode WITHDRAWAL_LIMITS;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode WITHDRAW_NOT_PERMITTED;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CloseAccountIneligibilityReasonCode(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("ACCOUNT_RESTRICTIONS", 0, "ACCOUNT_RESTRICTIONS");
        ACCOUNT_RESTRICTIONS = closeAccountIneligibilityReasonCode;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode2 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("PENDING_SETTLEMENT", 1, "PENDING_SETTLEMENT");
        PENDING_SETTLEMENT = closeAccountIneligibilityReasonCode2;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode3 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("WITHDRAWAL_LIMITS", 2, "WITHDRAWAL_LIMITS");
        WITHDRAWAL_LIMITS = closeAccountIneligibilityReasonCode3;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode4 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("ACCOUNT_HAS_INVALID_DATA", 3, "ACCOUNT_HAS_INVALID_DATA");
        ACCOUNT_HAS_INVALID_DATA = closeAccountIneligibilityReasonCode4;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode5 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("PENDING_TRANSACTIONS", 4, "PENDING_TRANSACTIONS");
        PENDING_TRANSACTIONS = closeAccountIneligibilityReasonCode5;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode6 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("WITHDRAW_NOT_PERMITTED", 5, "WITHDRAW_NOT_PERMITTED");
        WITHDRAW_NOT_PERMITTED = closeAccountIneligibilityReasonCode6;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode7 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("OPEN_DISPUTES", 6, "OPEN_DISPUTES");
        OPEN_DISPUTES = closeAccountIneligibilityReasonCode7;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode8 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("CC_NOT_VERIFIED", 7, "CC_NOT_VERIFIED");
        CC_NOT_VERIFIED = closeAccountIneligibilityReasonCode8;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode9 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("NEGATIVE_BALANCE", 8, "NEGATIVE_BALANCE");
        NEGATIVE_BALANCE = closeAccountIneligibilityReasonCode9;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode10 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("ACTIVE_RECURRING_MERCHANT_PROFILES", 9, "ACTIVE_RECURRING_MERCHANT_PROFILES");
        ACTIVE_RECURRING_MERCHANT_PROFILES = closeAccountIneligibilityReasonCode10;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode11 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("ACTIVE_RECURRING_CONSUMER_PROFILES", 10, "ACTIVE_RECURRING_CONSUMER_PROFILES");
        ACTIVE_RECURRING_CONSUMER_PROFILES = closeAccountIneligibilityReasonCode11;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode12 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("UNCONFIRMED_EMAIL_WITH_PAYMENT", 11, "UNCONFIRMED_EMAIL_WITH_PAYMENT");
        UNCONFIRMED_EMAIL_WITH_PAYMENT = closeAccountIneligibilityReasonCode12;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode13 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("RISK_RESTRICTED_CLOSE_ACCOUNT", 12, "RISK_RESTRICTED_CLOSE_ACCOUNT");
        RISK_RESTRICTED_CLOSE_ACCOUNT = closeAccountIneligibilityReasonCode13;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode14 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("BALANCE_LESS_THAN_WITHDRAWAL_FEE", 13, "BALANCE_LESS_THAN_WITHDRAWAL_FEE");
        BALANCE_LESS_THAN_WITHDRAWAL_FEE = closeAccountIneligibilityReasonCode14;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode15 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("NONZERO_COLLATERAL", 14, "NONZERO_COLLATERAL");
        NONZERO_COLLATERAL = closeAccountIneligibilityReasonCode15;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode16 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("FUNDS_DISBURSEMENT_OPTIONS_UNAVAILABLE", 15, "FUNDS_DISBURSEMENT_OPTIONS_UNAVAILABLE");
        FUNDS_DISBURSEMENT_OPTIONS_UNAVAILABLE = closeAccountIneligibilityReasonCode16;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode17 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("FDIC_FREEZE", 16, "FDIC_FREEZE");
        FDIC_FREEZE = closeAccountIneligibilityReasonCode17;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode18 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("RISK_DECLINE", 17, "RISK_DECLINE");
        RISK_DECLINE = closeAccountIneligibilityReasonCode18;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode19 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("HAS_CRYPTO_CURRENCY_HOLDING", 18, "HAS_CRYPTO_CURRENCY_HOLDING");
        HAS_CRYPTO_CURRENCY_HOLDING = closeAccountIneligibilityReasonCode19;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode20 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("HAS_ACTIVE_SAVINGS_ACCOUNT", 19, "HAS_ACTIVE_SAVINGS_ACCOUNT");
        HAS_ACTIVE_SAVINGS_ACCOUNT = closeAccountIneligibilityReasonCode20;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode21 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("HAS_OPEN_GROUP_MONEY_POOL", 20, "HAS_OPEN_GROUP_MONEY_POOL");
        HAS_OPEN_GROUP_MONEY_POOL = closeAccountIneligibilityReasonCode21;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode22 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("HAS_GROUP_MONEY_POOL_WITH_BALANCE", 21, "HAS_GROUP_MONEY_POOL_WITH_BALANCE");
        HAS_GROUP_MONEY_POOL_WITH_BALANCE = closeAccountIneligibilityReasonCode22;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode23 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("HONEY_GOLD_REDEEMABLE_BALANCE", 22, "HONEY_GOLD_REDEEMABLE_BALANCE");
        HONEY_GOLD_REDEEMABLE_BALANCE = closeAccountIneligibilityReasonCode23;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode24 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("HAS_APPROVED_BANKING_PRODUCT", 23, "HAS_APPROVED_BANKING_PRODUCT");
        HAS_APPROVED_BANKING_PRODUCT = closeAccountIneligibilityReasonCode24;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode25 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode("UNKNOWN__", 24, "UNKNOWN__");
        UNKNOWN__ = closeAccountIneligibilityReasonCode25;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode[] closeAccountIneligibilityReasonCodeArr = {closeAccountIneligibilityReasonCode, closeAccountIneligibilityReasonCode2, closeAccountIneligibilityReasonCode3, closeAccountIneligibilityReasonCode4, closeAccountIneligibilityReasonCode5, closeAccountIneligibilityReasonCode6, closeAccountIneligibilityReasonCode7, closeAccountIneligibilityReasonCode8, closeAccountIneligibilityReasonCode9, closeAccountIneligibilityReasonCode10, closeAccountIneligibilityReasonCode11, closeAccountIneligibilityReasonCode12, closeAccountIneligibilityReasonCode13, closeAccountIneligibilityReasonCode14, closeAccountIneligibilityReasonCode15, closeAccountIneligibilityReasonCode16, closeAccountIneligibilityReasonCode17, closeAccountIneligibilityReasonCode18, closeAccountIneligibilityReasonCode19, closeAccountIneligibilityReasonCode20, closeAccountIneligibilityReasonCode21, closeAccountIneligibilityReasonCode22, closeAccountIneligibilityReasonCode23, closeAccountIneligibilityReasonCode24, closeAccountIneligibilityReasonCode25};
        getHighSpeedVideoFpsRanges = closeAccountIneligibilityReasonCodeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(closeAccountIneligibilityReasonCodeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CloseAccountIneligibilityReasonCode", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ACCOUNT_RESTRICTIONS", "PENDING_SETTLEMENT", "WITHDRAWAL_LIMITS", "ACCOUNT_HAS_INVALID_DATA", "PENDING_TRANSACTIONS", "WITHDRAW_NOT_PERMITTED", "OPEN_DISPUTES", "CC_NOT_VERIFIED", "NEGATIVE_BALANCE", "ACTIVE_RECURRING_MERCHANT_PROFILES", "ACTIVE_RECURRING_CONSUMER_PROFILES", "UNCONFIRMED_EMAIL_WITH_PAYMENT", "RISK_RESTRICTED_CLOSE_ACCOUNT", "BALANCE_LESS_THAN_WITHDRAWAL_FEE", "NONZERO_COLLATERAL", "FUNDS_DISBURSEMENT_OPTIONS_UNAVAILABLE", "FDIC_FREEZE", "RISK_DECLINE", "HAS_CRYPTO_CURRENCY_HOLDING", "HAS_ACTIVE_SAVINGS_ACCOUNT", "HAS_OPEN_GROUP_MONEY_POOL", "HAS_GROUP_MONEY_POOL_WITH_BALANCE", "HONEY_GOLD_REDEEMABLE_BALANCE", "HAS_APPROVED_BANKING_PRODUCT"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountIneligibilityReasonCode$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountIneligibilityReasonCode;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountIneligibilityReasonCode;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountIneligibilityReasonCode;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode[]{com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.ACCOUNT_RESTRICTIONS, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.PENDING_SETTLEMENT, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.WITHDRAWAL_LIMITS, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.ACCOUNT_HAS_INVALID_DATA, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.PENDING_TRANSACTIONS, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.WITHDRAW_NOT_PERMITTED, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.OPEN_DISPUTES, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.CC_NOT_VERIFIED, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.NEGATIVE_BALANCE, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.ACTIVE_RECURRING_MERCHANT_PROFILES, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.ACTIVE_RECURRING_CONSUMER_PROFILES, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.UNCONFIRMED_EMAIL_WITH_PAYMENT, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.RISK_RESTRICTED_CLOSE_ACCOUNT, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.BALANCE_LESS_THAN_WITHDRAWAL_FEE, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.NONZERO_COLLATERAL, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.FUNDS_DISBURSEMENT_OPTIONS_UNAVAILABLE, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.FDIC_FREEZE, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.RISK_DECLINE, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.HAS_CRYPTO_CURRENCY_HOLDING, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.HAS_ACTIVE_SAVINGS_ACCOUNT, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.HAS_OPEN_GROUP_MONEY_POOL, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.HAS_GROUP_MONEY_POOL_WITH_BALANCE, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.HONEY_GOLD_REDEEMABLE_BALANCE, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.HAS_APPROVED_BANKING_PRODUCT});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode = (com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode) obj;
            return closeAccountIneligibilityReasonCode == null ? com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.UNKNOWN__ : closeAccountIneligibilityReasonCode;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
