package com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceContingencyType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "CONSENT_CONTINGENCY", "INSTRUMENT_PREAUTHORIZATION", "UPDATE_INSTRUMENT", "BANK_CONFIRMATION_CONTINGENCY", "BANK_AUTHORIZATION_CONTINGENCY", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class DebitCardFundingSourceContingencyType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType BANK_AUTHORIZATION_CONTINGENCY;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType BANK_CONFIRMATION_CONTINGENCY;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType CONSENT_CONTINGENCY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType INSTRUMENT_PREAUTHORIZATION;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType UNKNOWN;
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType UPDATE_INSTRUMENT;
    private final java.lang.String value;

    private DebitCardFundingSourceContingencyType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType debitCardFundingSourceContingencyType = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType("CONSENT_CONTINGENCY", 0, "CONSENT_CONTINGENCY");
        CONSENT_CONTINGENCY = debitCardFundingSourceContingencyType;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType debitCardFundingSourceContingencyType2 = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType("INSTRUMENT_PREAUTHORIZATION", 1, "INSTRUMENT_PREAUTHORIZATION");
        INSTRUMENT_PREAUTHORIZATION = debitCardFundingSourceContingencyType2;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType debitCardFundingSourceContingencyType3 = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType("UPDATE_INSTRUMENT", 2, "UPDATE_INSTRUMENT");
        UPDATE_INSTRUMENT = debitCardFundingSourceContingencyType3;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType debitCardFundingSourceContingencyType4 = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType("BANK_CONFIRMATION_CONTINGENCY", 3, "BANK_CONFIRMATION_CONTINGENCY");
        BANK_CONFIRMATION_CONTINGENCY = debitCardFundingSourceContingencyType4;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType debitCardFundingSourceContingencyType5 = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType("BANK_AUTHORIZATION_CONTINGENCY", 4, "BANK_AUTHORIZATION_CONTINGENCY");
        BANK_AUTHORIZATION_CONTINGENCY = debitCardFundingSourceContingencyType5;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType debitCardFundingSourceContingencyType6 = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType("UNKNOWN", 5, "UNKNOWN");
        UNKNOWN = debitCardFundingSourceContingencyType6;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType[] debitCardFundingSourceContingencyTypeArr = {debitCardFundingSourceContingencyType, debitCardFundingSourceContingencyType2, debitCardFundingSourceContingencyType3, debitCardFundingSourceContingencyType4, debitCardFundingSourceContingencyType5, debitCardFundingSourceContingencyType6};
        $VALUES = debitCardFundingSourceContingencyTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(debitCardFundingSourceContingencyTypeArr);
        INSTANCE = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType", com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceContingencyType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceContingencyType;", "fromValue", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceContingencyType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType fromValue(java.lang.String value) {
            java.lang.Object obj = null;
            if (value == null) {
                return null;
            }
            java.util.Iterator<E> it = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType) next).getValue(), value)) {
                    obj = next;
                    break;
                }
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType debitCardFundingSourceContingencyType = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType) obj;
            return debitCardFundingSourceContingencyType == null ? com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType.UNKNOWN : debitCardFundingSourceContingencyType;
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType[] values() {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType> getEntries() {
        return $ENTRIES;
    }
}
