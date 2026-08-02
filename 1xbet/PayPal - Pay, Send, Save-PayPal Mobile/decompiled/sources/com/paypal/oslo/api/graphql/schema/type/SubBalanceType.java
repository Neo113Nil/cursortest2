package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b#\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SubBalanceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "AVAILABLE", "CC_FUNDED", "EXIT_LIMIT", "EXTERNAL_HOLD", "GIFT_CARD", "GUEST_BALANCE", "HOLD", "LIMITATION_RESERVE", "MERCHANT_SPECIFIC_BALANCE", "PENDING_REVERSAL", "TOTAL_BALANCE", "VARIABLE_RESERVES", "DELAYED_SETTLEMENT", "EBAY_NON_PERFORMER", "JUMP_START", "MINIMUM_BALANCE", "MPLT_HOLD", "TRANS_LEVEL_HOLD", "AUTHORIZED_EXTERNAL_UNCLEARED_FUNDS", "DYNAMIC_HOLD", "UNCLEARED_FUNDS", "TAX_HOLD", "USER_CONSENT_HOLD", "PARTNER_LOSS_BALANCE", "PROGRESSIVE_KYC_HOLD", "CHARGE_OFF_BALANCE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SubBalanceType {
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType AUTHORIZED_EXTERNAL_UNCLEARED_FUNDS;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType AVAILABLE;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType CC_FUNDED;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType CHARGE_OFF_BALANCE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType DELAYED_SETTLEMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType DYNAMIC_HOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType EBAY_NON_PERFORMER;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType EXIT_LIMIT;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType EXTERNAL_HOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType GIFT_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType GUEST_BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType HOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType JUMP_START;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType LIMITATION_RESERVE;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType MERCHANT_SPECIFIC_BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType MINIMUM_BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType MPLT_HOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType PARTNER_LOSS_BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType PENDING_REVERSAL;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType PROGRESSIVE_KYC_HOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType TAX_HOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType TOTAL_BALANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType TRANS_LEVEL_HOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType UNCLEARED_FUNDS;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType USER_CONSENT_HOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.SubBalanceType VARIABLE_RESERVES;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SubBalanceType[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private SubBalanceType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("AVAILABLE", 0, "AVAILABLE");
        AVAILABLE = subBalanceType;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType2 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("CC_FUNDED", 1, "CC_FUNDED");
        CC_FUNDED = subBalanceType2;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType3 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("EXIT_LIMIT", 2, "EXIT_LIMIT");
        EXIT_LIMIT = subBalanceType3;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType4 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("EXTERNAL_HOLD", 3, "EXTERNAL_HOLD");
        EXTERNAL_HOLD = subBalanceType4;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType5 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("GIFT_CARD", 4, "GIFT_CARD");
        GIFT_CARD = subBalanceType5;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType6 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("GUEST_BALANCE", 5, "GUEST_BALANCE");
        GUEST_BALANCE = subBalanceType6;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType7 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("HOLD", 6, "HOLD");
        HOLD = subBalanceType7;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType8 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("LIMITATION_RESERVE", 7, "LIMITATION_RESERVE");
        LIMITATION_RESERVE = subBalanceType8;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType9 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("MERCHANT_SPECIFIC_BALANCE", 8, "MERCHANT_SPECIFIC_BALANCE");
        MERCHANT_SPECIFIC_BALANCE = subBalanceType9;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType10 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("PENDING_REVERSAL", 9, "PENDING_REVERSAL");
        PENDING_REVERSAL = subBalanceType10;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType11 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("TOTAL_BALANCE", 10, "TOTAL_BALANCE");
        TOTAL_BALANCE = subBalanceType11;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType12 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("VARIABLE_RESERVES", 11, "VARIABLE_RESERVES");
        VARIABLE_RESERVES = subBalanceType12;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType13 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("DELAYED_SETTLEMENT", 12, "DELAYED_SETTLEMENT");
        DELAYED_SETTLEMENT = subBalanceType13;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType14 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("EBAY_NON_PERFORMER", 13, "EBAY_NON_PERFORMER");
        EBAY_NON_PERFORMER = subBalanceType14;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType15 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("JUMP_START", 14, "JUMP_START");
        JUMP_START = subBalanceType15;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType16 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("MINIMUM_BALANCE", 15, "MINIMUM_BALANCE");
        MINIMUM_BALANCE = subBalanceType16;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType17 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("MPLT_HOLD", 16, "MPLT_HOLD");
        MPLT_HOLD = subBalanceType17;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType18 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("TRANS_LEVEL_HOLD", 17, "TRANS_LEVEL_HOLD");
        TRANS_LEVEL_HOLD = subBalanceType18;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType19 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("AUTHORIZED_EXTERNAL_UNCLEARED_FUNDS", 18, "AUTHORIZED_EXTERNAL_UNCLEARED_FUNDS");
        AUTHORIZED_EXTERNAL_UNCLEARED_FUNDS = subBalanceType19;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType20 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("DYNAMIC_HOLD", 19, "DYNAMIC_HOLD");
        DYNAMIC_HOLD = subBalanceType20;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType21 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("UNCLEARED_FUNDS", 20, "UNCLEARED_FUNDS");
        UNCLEARED_FUNDS = subBalanceType21;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType22 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("TAX_HOLD", 21, "TAX_HOLD");
        TAX_HOLD = subBalanceType22;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType23 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("USER_CONSENT_HOLD", 22, "USER_CONSENT_HOLD");
        USER_CONSENT_HOLD = subBalanceType23;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType24 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("PARTNER_LOSS_BALANCE", 23, "PARTNER_LOSS_BALANCE");
        PARTNER_LOSS_BALANCE = subBalanceType24;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType25 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("PROGRESSIVE_KYC_HOLD", 24, "PROGRESSIVE_KYC_HOLD");
        PROGRESSIVE_KYC_HOLD = subBalanceType25;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType26 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("CHARGE_OFF_BALANCE", 25, "CHARGE_OFF_BALANCE");
        CHARGE_OFF_BALANCE = subBalanceType26;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType27 = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType("UNKNOWN__", 26, "UNKNOWN__");
        UNKNOWN__ = subBalanceType27;
        com.paypal.oslo.api.graphql.schema.type.SubBalanceType[] subBalanceTypeArr = {subBalanceType, subBalanceType2, subBalanceType3, subBalanceType4, subBalanceType5, subBalanceType6, subBalanceType7, subBalanceType8, subBalanceType9, subBalanceType10, subBalanceType11, subBalanceType12, subBalanceType13, subBalanceType14, subBalanceType15, subBalanceType16, subBalanceType17, subBalanceType18, subBalanceType19, subBalanceType20, subBalanceType21, subBalanceType22, subBalanceType23, subBalanceType24, subBalanceType25, subBalanceType26, subBalanceType27};
        getHighSpeedVideoFpsRangesFor = subBalanceTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(subBalanceTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.SubBalanceType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("SubBalanceType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"AVAILABLE", "CC_FUNDED", "EXIT_LIMIT", "EXTERNAL_HOLD", "GIFT_CARD", "GUEST_BALANCE", "HOLD", "LIMITATION_RESERVE", "MERCHANT_SPECIFIC_BALANCE", "PENDING_REVERSAL", "TOTAL_BALANCE", "VARIABLE_RESERVES", "DELAYED_SETTLEMENT", "EBAY_NON_PERFORMER", "JUMP_START", "MINIMUM_BALANCE", "MPLT_HOLD", "TRANS_LEVEL_HOLD", "AUTHORIZED_EXTERNAL_UNCLEARED_FUNDS", "DYNAMIC_HOLD", "UNCLEARED_FUNDS", "TAX_HOLD", "USER_CONSENT_HOLD", "PARTNER_LOSS_BALANCE", "PROGRESSIVE_KYC_HOLD", "CHARGE_OFF_BALANCE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SubBalanceType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/SubBalanceType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/SubBalanceType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/SubBalanceType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.SubBalanceType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.SubBalanceType[]{com.paypal.oslo.api.graphql.schema.type.SubBalanceType.AVAILABLE, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.CC_FUNDED, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.EXIT_LIMIT, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.EXTERNAL_HOLD, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.GIFT_CARD, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.GUEST_BALANCE, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.HOLD, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.LIMITATION_RESERVE, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.MERCHANT_SPECIFIC_BALANCE, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.PENDING_REVERSAL, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.TOTAL_BALANCE, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.VARIABLE_RESERVES, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.DELAYED_SETTLEMENT, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.EBAY_NON_PERFORMER, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.JUMP_START, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.MINIMUM_BALANCE, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.MPLT_HOLD, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.TRANS_LEVEL_HOLD, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.AUTHORIZED_EXTERNAL_UNCLEARED_FUNDS, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.DYNAMIC_HOLD, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.UNCLEARED_FUNDS, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.TAX_HOLD, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.USER_CONSENT_HOLD, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.PARTNER_LOSS_BALANCE, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.PROGRESSIVE_KYC_HOLD, com.paypal.oslo.api.graphql.schema.type.SubBalanceType.CHARGE_OFF_BALANCE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.SubBalanceType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.SubBalanceType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.SubBalanceType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.SubBalanceType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.SubBalanceType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.SubBalanceType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.SubBalanceType subBalanceType = (com.paypal.oslo.api.graphql.schema.type.SubBalanceType) obj;
            return subBalanceType == null ? com.paypal.oslo.api.graphql.schema.type.SubBalanceType.UNKNOWN__ : subBalanceType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.SubBalanceType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.SubBalanceType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.SubBalanceType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.SubBalanceType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.SubBalanceType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.SubBalanceType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
