package com.paypal.oslo.feature.wallet.common.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "BANK", "CARD", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class FundingInstrumentType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType BALANCE;
    public static final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType BANK;
    public static final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType CARD;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.Companion INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private FundingInstrumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType = new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType("BANK", 0);
        BANK = fundingInstrumentType;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType2 = new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType("CARD", 1);
        CARD = fundingInstrumentType2;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType3 = new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 2);
        BALANCE = fundingInstrumentType3;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType[] fundingInstrumentTypeArr = {fundingInstrumentType, fundingInstrumentType2, fundingInstrumentType3};
        $VALUES = fundingInstrumentTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentTypeArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType", com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType[] values() {
        return (com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType> getEntries() {
        return $ENTRIES;
    }
}
