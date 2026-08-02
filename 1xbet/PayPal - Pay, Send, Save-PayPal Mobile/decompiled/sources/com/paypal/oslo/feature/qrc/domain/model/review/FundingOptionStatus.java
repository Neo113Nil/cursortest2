package com.paypal.oslo.feature.qrc.domain.model.review;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "READY", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE, "CONTINGENCY", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class FundingOptionStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus CONTINGENCY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus ELIGIBLE;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus READY;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionStatus$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private FundingOptionStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus = new com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus("READY", 0);
        READY = fundingOptionStatus;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus2 = new com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_ELIGIBLE, 1);
        ELIGIBLE = fundingOptionStatus2;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus3 = new com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus("CONTINGENCY", 2);
        CONTINGENCY = fundingOptionStatus3;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus4 = new com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus("UNKNOWN", 3);
        UNKNOWN = fundingOptionStatus4;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus[] fundingOptionStatusArr = {fundingOptionStatus, fundingOptionStatus2, fundingOptionStatus3, fundingOptionStatus4};
        $VALUES = fundingOptionStatusArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(fundingOptionStatusArr);
        INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus", com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus> getEntries() {
        return $ENTRIES;
    }
}
