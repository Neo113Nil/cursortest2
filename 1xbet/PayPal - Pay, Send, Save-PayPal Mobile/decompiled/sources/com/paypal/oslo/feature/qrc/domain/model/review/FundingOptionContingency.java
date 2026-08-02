package com.paypal.oslo.feature.qrc.domain.model.review;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionContingency;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "THREE_DS_V2_AUTHENTICATION", "RISK_AUTH_FLOW", "TRAVEL_RULE", "ERROR_FUNDING_SELECTION_INSTRUMENT_UNAVAILABLE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class FundingOptionContingency {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency.Companion INSTANCE;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency ERROR_FUNDING_SELECTION_INSTRUMENT_UNAVAILABLE;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency RISK_AUTH_FLOW;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency THREE_DS_V2_AUTHENTICATION;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency TRAVEL_RULE;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionContingency$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionContingency;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private FundingOptionContingency(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency fundingOptionContingency = new com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency("THREE_DS_V2_AUTHENTICATION", 0);
        THREE_DS_V2_AUTHENTICATION = fundingOptionContingency;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency fundingOptionContingency2 = new com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency("RISK_AUTH_FLOW", 1);
        RISK_AUTH_FLOW = fundingOptionContingency2;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency fundingOptionContingency3 = new com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency("TRAVEL_RULE", 2);
        TRAVEL_RULE = fundingOptionContingency3;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency fundingOptionContingency4 = new com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency("ERROR_FUNDING_SELECTION_INSTRUMENT_UNAVAILABLE", 3);
        ERROR_FUNDING_SELECTION_INSTRUMENT_UNAVAILABLE = fundingOptionContingency4;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency fundingOptionContingency5 = new com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency("UNKNOWN", 4);
        UNKNOWN = fundingOptionContingency5;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency[] fundingOptionContingencyArr = {fundingOptionContingency, fundingOptionContingency2, fundingOptionContingency3, fundingOptionContingency4, fundingOptionContingency5};
        $VALUES = fundingOptionContingencyArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(fundingOptionContingencyArr);
        INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency", com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency> getEntries() {
        return $ENTRIES;
    }
}
