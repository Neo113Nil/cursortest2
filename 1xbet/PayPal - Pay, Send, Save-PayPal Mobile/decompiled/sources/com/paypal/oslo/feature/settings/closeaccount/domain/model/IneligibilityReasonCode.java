package com.paypal.oslo.feature.settings.closeaccount.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\"\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/IneligibilityReasonCode;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "HONEY_GOLD_REDEEMABLE_BALANCE", "HAS_CRYPTO_CURRENCY_HOLDING", "ACCOUNT_RESTRICTIONS", "PENDING_SETTLEMENT", "WITHDRAWAL_LIMITS", "ACCOUNT_HAS_INVALID_DATA", "PENDING_TRANSACTIONS", "UNCONFIRMED_EMAIL_WITH_PAYMENT", "FDIC_FREEZE", "RISK_DECLINE", "HAS_ACTIVE_SAVINGS_ACCOUNT", "HAS_OPEN_GROUP_MONEY_POOL", "HAS_GROUP_MONEY_POOL_WITH_BALANCE", "WITHDRAW_NOT_PERMITTED", "HAS_APPROVED_BANKING_PRODUCT", "DOWNSTREAM_FAILURE", "OPEN_DISPUTES", "CC_NOT_VERIFIED", "NEGATIVE_BALANCE", "ACTIVE_RECURRING_CONSUMER_PROFILES", "ACTIVE_RECURRING_MERCHANT_PROFILES", "RISK_RESTRICTED_CLOSE_ACCOUNT", "NONZERO_COLLATERAL", "BALANCE_LESS_THAN_WITHDRAWAL_FEE", "FUNDS_DISBURSEMENT_OPTIONS_UNAVAILABLE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IneligibilityReasonCode {
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ACCOUNT_HAS_INVALID_DATA;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ACCOUNT_RESTRICTIONS;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ACTIVE_RECURRING_CONSUMER_PROFILES;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ACTIVE_RECURRING_MERCHANT_PROFILES;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode BALANCE_LESS_THAN_WITHDRAWAL_FEE;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode CC_NOT_VERIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.Companion INSTANCE;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode DOWNSTREAM_FAILURE;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode FDIC_FREEZE;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode FUNDS_DISBURSEMENT_OPTIONS_UNAVAILABLE;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode HAS_ACTIVE_SAVINGS_ACCOUNT;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode HAS_APPROVED_BANKING_PRODUCT;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode HAS_CRYPTO_CURRENCY_HOLDING;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode HAS_GROUP_MONEY_POOL_WITH_BALANCE;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode HAS_OPEN_GROUP_MONEY_POOL;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode HONEY_GOLD_REDEEMABLE_BALANCE;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode NEGATIVE_BALANCE;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode NONZERO_COLLATERAL;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode OPEN_DISPUTES;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode PENDING_SETTLEMENT;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode PENDING_TRANSACTIONS;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode RISK_DECLINE;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode RISK_RESTRICTED_CLOSE_ACCOUNT;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode UNCONFIRMED_EMAIL_WITH_PAYMENT;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode UNKNOWN;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode WITHDRAWAL_LIMITS;
    public static final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode WITHDRAW_NOT_PERMITTED;
    private static final /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.String value;

    private IneligibilityReasonCode(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("HONEY_GOLD_REDEEMABLE_BALANCE", 0, "HONEY_GOLD_REDEEMABLE_BALANCE");
        HONEY_GOLD_REDEEMABLE_BALANCE = ineligibilityReasonCode;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode2 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("HAS_CRYPTO_CURRENCY_HOLDING", 1, "HAS_CRYPTO_CURRENCY_HOLDING");
        HAS_CRYPTO_CURRENCY_HOLDING = ineligibilityReasonCode2;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode3 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("ACCOUNT_RESTRICTIONS", 2, "ACCOUNT_RESTRICTIONS");
        ACCOUNT_RESTRICTIONS = ineligibilityReasonCode3;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode4 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("PENDING_SETTLEMENT", 3, "PENDING_SETTLEMENT");
        PENDING_SETTLEMENT = ineligibilityReasonCode4;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode5 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("WITHDRAWAL_LIMITS", 4, "WITHDRAWAL_LIMITS");
        WITHDRAWAL_LIMITS = ineligibilityReasonCode5;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode6 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("ACCOUNT_HAS_INVALID_DATA", 5, "ACCOUNT_HAS_INVALID_DATA");
        ACCOUNT_HAS_INVALID_DATA = ineligibilityReasonCode6;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode7 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("PENDING_TRANSACTIONS", 6, "PENDING_TRANSACTIONS");
        PENDING_TRANSACTIONS = ineligibilityReasonCode7;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode8 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("UNCONFIRMED_EMAIL_WITH_PAYMENT", 7, "UNCONFIRMED_EMAIL_WITH_PAYMENT");
        UNCONFIRMED_EMAIL_WITH_PAYMENT = ineligibilityReasonCode8;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode9 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("FDIC_FREEZE", 8, "FDIC_FREEZE");
        FDIC_FREEZE = ineligibilityReasonCode9;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode10 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("RISK_DECLINE", 9, "RISK_DECLINE");
        RISK_DECLINE = ineligibilityReasonCode10;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode11 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("HAS_ACTIVE_SAVINGS_ACCOUNT", 10, "HAS_ACTIVE_SAVINGS_ACCOUNT");
        HAS_ACTIVE_SAVINGS_ACCOUNT = ineligibilityReasonCode11;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode12 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("HAS_OPEN_GROUP_MONEY_POOL", 11, "HAS_OPEN_GROUP_MONEY_POOL");
        HAS_OPEN_GROUP_MONEY_POOL = ineligibilityReasonCode12;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode13 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("HAS_GROUP_MONEY_POOL_WITH_BALANCE", 12, "HAS_GROUP_MONEY_POOL_WITH_BALANCE");
        HAS_GROUP_MONEY_POOL_WITH_BALANCE = ineligibilityReasonCode13;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode14 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("WITHDRAW_NOT_PERMITTED", 13, "WITHDRAW_NOT_PERMITTED");
        WITHDRAW_NOT_PERMITTED = ineligibilityReasonCode14;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode15 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("HAS_APPROVED_BANKING_PRODUCT", 14, "HAS_APPROVED_BANKING_PRODUCT");
        HAS_APPROVED_BANKING_PRODUCT = ineligibilityReasonCode15;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode16 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("DOWNSTREAM_FAILURE", 15, "DOWNSTREAM_FAILURE");
        DOWNSTREAM_FAILURE = ineligibilityReasonCode16;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode17 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("OPEN_DISPUTES", 16, "OPEN_DISPUTES");
        OPEN_DISPUTES = ineligibilityReasonCode17;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode18 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("CC_NOT_VERIFIED", 17, "CC_NOT_VERIFIED");
        CC_NOT_VERIFIED = ineligibilityReasonCode18;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode19 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("NEGATIVE_BALANCE", 18, "NEGATIVE_BALANCE");
        NEGATIVE_BALANCE = ineligibilityReasonCode19;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode20 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("ACTIVE_RECURRING_CONSUMER_PROFILES", 19, "ACTIVE_RECURRING_CONSUMER_PROFILES");
        ACTIVE_RECURRING_CONSUMER_PROFILES = ineligibilityReasonCode20;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode21 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("ACTIVE_RECURRING_MERCHANT_PROFILES", 20, "ACTIVE_RECURRING_MERCHANT_PROFILES");
        ACTIVE_RECURRING_MERCHANT_PROFILES = ineligibilityReasonCode21;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode22 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("RISK_RESTRICTED_CLOSE_ACCOUNT", 21, "RISK_RESTRICTED_CLOSE_ACCOUNT");
        RISK_RESTRICTED_CLOSE_ACCOUNT = ineligibilityReasonCode22;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode23 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("NONZERO_COLLATERAL", 22, "NONZERO_COLLATERAL");
        NONZERO_COLLATERAL = ineligibilityReasonCode23;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode24 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("BALANCE_LESS_THAN_WITHDRAWAL_FEE", 23, "BALANCE_LESS_THAN_WITHDRAWAL_FEE");
        BALANCE_LESS_THAN_WITHDRAWAL_FEE = ineligibilityReasonCode24;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode25 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("FUNDS_DISBURSEMENT_OPTIONS_UNAVAILABLE", 24, "FUNDS_DISBURSEMENT_OPTIONS_UNAVAILABLE");
        FUNDS_DISBURSEMENT_OPTIONS_UNAVAILABLE = ineligibilityReasonCode25;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode26 = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode("UNKNOWN", 25, "UNKNOWN");
        UNKNOWN = ineligibilityReasonCode26;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode[] ineligibilityReasonCodeArr = {ineligibilityReasonCode, ineligibilityReasonCode2, ineligibilityReasonCode3, ineligibilityReasonCode4, ineligibilityReasonCode5, ineligibilityReasonCode6, ineligibilityReasonCode7, ineligibilityReasonCode8, ineligibilityReasonCode9, ineligibilityReasonCode10, ineligibilityReasonCode11, ineligibilityReasonCode12, ineligibilityReasonCode13, ineligibilityReasonCode14, ineligibilityReasonCode15, ineligibilityReasonCode16, ineligibilityReasonCode17, ineligibilityReasonCode18, ineligibilityReasonCode19, ineligibilityReasonCode20, ineligibilityReasonCode21, ineligibilityReasonCode22, ineligibilityReasonCode23, ineligibilityReasonCode24, ineligibilityReasonCode25, ineligibilityReasonCode26};
        getHighSpeedVideoFpsRanges = ineligibilityReasonCodeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(ineligibilityReasonCodeArr);
        INSTANCE = new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/IneligibilityReasonCode$Companion;", "", "<init>", "()V", "", "code", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/IneligibilityReasonCode;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/IneligibilityReasonCode;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode fromString(java.lang.String code) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode) obj).getValue(), code)) {
                    break;
                }
            }
            com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode ineligibilityReasonCode = (com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode) obj;
            return ineligibilityReasonCode == null ? com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.UNKNOWN : ineligibilityReasonCode;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode[] values() {
        return (com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode) java.lang.Enum.valueOf(com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReasonCode> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
