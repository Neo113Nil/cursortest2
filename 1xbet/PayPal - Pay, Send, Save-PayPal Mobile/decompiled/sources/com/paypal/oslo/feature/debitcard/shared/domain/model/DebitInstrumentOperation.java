package com.paypal.oslo.feature.debitcard.shared.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001c\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentOperation;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ACTIVATE", "SHOW_CARD", "LOCK", "UNLOCK", "CHANGE_PIN", "SHOW_PIN", "REPLACE_DAMAGED_CARD", "REPORT_LOST_STOLEN", "REPORT_CARD_LOST_REPLACE", "REISSUE_DAMAGED_CARD", "REPORT_DIGITAL_CARD_LOST", "CHANGE_BILLING_ADDRESS", com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, "CASH_BACK", "DAILY_LIMITS", "PUSH_PROVISION", "PUSH_PROVISION_DIGITIZATION_TOKEN_PAYPAL", "FIND_ATM", "REQUEST_PHYSICAL_CARD", "REQUEST_PHYSICAL_CARD_WITH_FEE", "FUNDED_BY_PAYPAL_BALANCE", "ADD_SECONDARY_CARDHOLDER", "MANAGE_SECONDARY_CARDHOLDER", "FUNDING_OPTIONS", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes12.dex */
public final class DebitInstrumentOperation {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation ACTIVATE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation ADD_SECONDARY_CARDHOLDER;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation CASH_BACK;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation CHANGE_BILLING_ADDRESS;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation CHANGE_PIN;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation CLOSE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.Companion INSTANCE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation DAILY_LIMITS;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation FIND_ATM;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation FUNDED_BY_PAYPAL_BALANCE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation FUNDING_OPTIONS;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation LOCK;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation MANAGE_SECONDARY_CARDHOLDER;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation PUSH_PROVISION;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation PUSH_PROVISION_DIGITIZATION_TOKEN_PAYPAL;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation REISSUE_DAMAGED_CARD;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation REPLACE_DAMAGED_CARD;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation REPORT_CARD_LOST_REPLACE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation REPORT_DIGITAL_CARD_LOST;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation REPORT_LOST_STOLEN;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation REQUEST_PHYSICAL_CARD;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation REQUEST_PHYSICAL_CARD_WITH_FEE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation SHOW_CARD;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation SHOW_PIN;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation UNKNOWN;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation UNLOCK;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentOperation$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentOperation;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private DebitInstrumentOperation(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("ACTIVATE", 0);
        ACTIVATE = debitInstrumentOperation;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation2 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("SHOW_CARD", 1);
        SHOW_CARD = debitInstrumentOperation2;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation3 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("LOCK", 2);
        LOCK = debitInstrumentOperation3;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation4 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("UNLOCK", 3);
        UNLOCK = debitInstrumentOperation4;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation5 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("CHANGE_PIN", 4);
        CHANGE_PIN = debitInstrumentOperation5;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation6 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("SHOW_PIN", 5);
        SHOW_PIN = debitInstrumentOperation6;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation7 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("REPLACE_DAMAGED_CARD", 6);
        REPLACE_DAMAGED_CARD = debitInstrumentOperation7;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation8 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("REPORT_LOST_STOLEN", 7);
        REPORT_LOST_STOLEN = debitInstrumentOperation8;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation9 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("REPORT_CARD_LOST_REPLACE", 8);
        REPORT_CARD_LOST_REPLACE = debitInstrumentOperation9;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation10 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("REISSUE_DAMAGED_CARD", 9);
        REISSUE_DAMAGED_CARD = debitInstrumentOperation10;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation11 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("REPORT_DIGITAL_CARD_LOST", 10);
        REPORT_DIGITAL_CARD_LOST = debitInstrumentOperation11;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation12 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("CHANGE_BILLING_ADDRESS", 11);
        CHANGE_BILLING_ADDRESS = debitInstrumentOperation12;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation13 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation(com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, 12);
        CLOSE = debitInstrumentOperation13;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation14 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("CASH_BACK", 13);
        CASH_BACK = debitInstrumentOperation14;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation15 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("DAILY_LIMITS", 14);
        DAILY_LIMITS = debitInstrumentOperation15;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation16 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("PUSH_PROVISION", 15);
        PUSH_PROVISION = debitInstrumentOperation16;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation17 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("PUSH_PROVISION_DIGITIZATION_TOKEN_PAYPAL", 16);
        PUSH_PROVISION_DIGITIZATION_TOKEN_PAYPAL = debitInstrumentOperation17;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation18 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("FIND_ATM", 17);
        FIND_ATM = debitInstrumentOperation18;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation19 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("REQUEST_PHYSICAL_CARD", 18);
        REQUEST_PHYSICAL_CARD = debitInstrumentOperation19;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation20 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("REQUEST_PHYSICAL_CARD_WITH_FEE", 19);
        REQUEST_PHYSICAL_CARD_WITH_FEE = debitInstrumentOperation20;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation21 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("FUNDED_BY_PAYPAL_BALANCE", 20);
        FUNDED_BY_PAYPAL_BALANCE = debitInstrumentOperation21;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation22 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("ADD_SECONDARY_CARDHOLDER", 21);
        ADD_SECONDARY_CARDHOLDER = debitInstrumentOperation22;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation23 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("MANAGE_SECONDARY_CARDHOLDER", 22);
        MANAGE_SECONDARY_CARDHOLDER = debitInstrumentOperation23;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation24 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("FUNDING_OPTIONS", 23);
        FUNDING_OPTIONS = debitInstrumentOperation24;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation25 = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation("UNKNOWN", 24);
        UNKNOWN = debitInstrumentOperation25;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation[] debitInstrumentOperationArr = {debitInstrumentOperation, debitInstrumentOperation2, debitInstrumentOperation3, debitInstrumentOperation4, debitInstrumentOperation5, debitInstrumentOperation6, debitInstrumentOperation7, debitInstrumentOperation8, debitInstrumentOperation9, debitInstrumentOperation10, debitInstrumentOperation11, debitInstrumentOperation12, debitInstrumentOperation13, debitInstrumentOperation14, debitInstrumentOperation15, debitInstrumentOperation16, debitInstrumentOperation17, debitInstrumentOperation18, debitInstrumentOperation19, debitInstrumentOperation20, debitInstrumentOperation21, debitInstrumentOperation22, debitInstrumentOperation23, debitInstrumentOperation24, debitInstrumentOperation25};
        $VALUES = debitInstrumentOperationArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentOperationArr);
        INSTANCE = new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation", com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation[] values() {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> getEntries() {
        return $ENTRIES;
    }
}
