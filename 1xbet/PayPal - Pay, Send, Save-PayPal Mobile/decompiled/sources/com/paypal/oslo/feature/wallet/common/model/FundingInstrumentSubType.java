package com.paypal.oslo.feature.wallet.common.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentSubType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "CREDIT", "DEBIT", "CARD", com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, "SAVINGS", "BANK", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class FundingInstrumentSubType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType BANK;
    public static final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType CARD;
    public static final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType CHECKING;
    public static final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType CREDIT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType DEBIT;
    public static final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType SAVINGS;
    public static final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentSubType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentSubType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private FundingInstrumentSubType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType fundingInstrumentSubType = new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType("CREDIT", 0);
        CREDIT = fundingInstrumentSubType;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType fundingInstrumentSubType2 = new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType("DEBIT", 1);
        DEBIT = fundingInstrumentSubType2;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType fundingInstrumentSubType3 = new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType("CARD", 2);
        CARD = fundingInstrumentSubType3;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType fundingInstrumentSubType4 = new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType(com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, 3);
        CHECKING = fundingInstrumentSubType4;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType fundingInstrumentSubType5 = new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType("SAVINGS", 4);
        SAVINGS = fundingInstrumentSubType5;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType fundingInstrumentSubType6 = new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType("BANK", 5);
        BANK = fundingInstrumentSubType6;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType fundingInstrumentSubType7 = new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType("UNKNOWN", 6);
        UNKNOWN = fundingInstrumentSubType7;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType[] fundingInstrumentSubTypeArr = {fundingInstrumentSubType, fundingInstrumentSubType2, fundingInstrumentSubType3, fundingInstrumentSubType4, fundingInstrumentSubType5, fundingInstrumentSubType6, fundingInstrumentSubType7};
        $VALUES = fundingInstrumentSubTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentSubTypeArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType", com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType[] values() {
        return (com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType> getEntries() {
        return $ENTRIES;
    }
}
