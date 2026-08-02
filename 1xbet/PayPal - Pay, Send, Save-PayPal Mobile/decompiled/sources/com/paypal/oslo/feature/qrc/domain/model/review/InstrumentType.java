package com.paypal.oslo.feature.qrc.domain.model.review;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "BANK", "CARD", "CREDIT", "INCENTIVE", "EXTERNAL_IDENTIFIER", "STORED_VALUE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class InstrumentType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType BALANCE;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType BANK;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType CARD;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType CREDIT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType EXTERNAL_IDENTIFIER;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType INCENTIVE;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType STORED_VALUE;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private InstrumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType = new com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 0);
        BALANCE = instrumentType;
        com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType2 = new com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType("BANK", 1);
        BANK = instrumentType2;
        com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType3 = new com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType("CARD", 2);
        CARD = instrumentType3;
        com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType4 = new com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType("CREDIT", 3);
        CREDIT = instrumentType4;
        com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType5 = new com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType("INCENTIVE", 4);
        INCENTIVE = instrumentType5;
        com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType6 = new com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType("EXTERNAL_IDENTIFIER", 5);
        EXTERNAL_IDENTIFIER = instrumentType6;
        com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType7 = new com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType("STORED_VALUE", 6);
        STORED_VALUE = instrumentType7;
        com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType8 = new com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType("UNKNOWN", 7);
        UNKNOWN = instrumentType8;
        com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType[] instrumentTypeArr = {instrumentType, instrumentType2, instrumentType3, instrumentType4, instrumentType5, instrumentType6, instrumentType7, instrumentType8};
        $VALUES = instrumentTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(instrumentTypeArr);
        INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType", com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType> getEntries() {
        return $ENTRIES;
    }
}
