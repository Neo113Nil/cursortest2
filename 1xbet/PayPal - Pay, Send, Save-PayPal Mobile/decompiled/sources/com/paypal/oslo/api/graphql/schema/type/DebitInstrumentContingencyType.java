package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentContingencyType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CONSENT_CONTINGENCY", "INSTRUMENT_PREAUTHORIZATION", "UPDATE_INSTRUMENT", "BANK_CONFIRMATION_CONTINGENCY", "BANK_AUTHORIZATION_CONTINGENCY", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitInstrumentContingencyType {
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType BANK_AUTHORIZATION_CONTINGENCY;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType BANK_CONFIRMATION_CONTINGENCY;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType CONSENT_CONTINGENCY;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType INSTRUMENT_PREAUTHORIZATION;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType UPDATE_INSTRUMENT;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DebitInstrumentContingencyType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType("CONSENT_CONTINGENCY", 0, "CONSENT_CONTINGENCY");
        CONSENT_CONTINGENCY = debitInstrumentContingencyType;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType2 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType("INSTRUMENT_PREAUTHORIZATION", 1, "INSTRUMENT_PREAUTHORIZATION");
        INSTRUMENT_PREAUTHORIZATION = debitInstrumentContingencyType2;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType3 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType("UPDATE_INSTRUMENT", 2, "UPDATE_INSTRUMENT");
        UPDATE_INSTRUMENT = debitInstrumentContingencyType3;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType4 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType("BANK_CONFIRMATION_CONTINGENCY", 3, "BANK_CONFIRMATION_CONTINGENCY");
        BANK_CONFIRMATION_CONTINGENCY = debitInstrumentContingencyType4;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType5 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType("BANK_AUTHORIZATION_CONTINGENCY", 4, "BANK_AUTHORIZATION_CONTINGENCY");
        BANK_AUTHORIZATION_CONTINGENCY = debitInstrumentContingencyType5;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType6 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType("UNKNOWN", 5, "UNKNOWN");
        UNKNOWN = debitInstrumentContingencyType6;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType7 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = debitInstrumentContingencyType7;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType[] debitInstrumentContingencyTypeArr = {debitInstrumentContingencyType, debitInstrumentContingencyType2, debitInstrumentContingencyType3, debitInstrumentContingencyType4, debitInstrumentContingencyType5, debitInstrumentContingencyType6, debitInstrumentContingencyType7};
        getHighResolutionOutputSizeshNQ4ISI = debitInstrumentContingencyTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentContingencyTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DebitInstrumentContingencyType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CONSENT_CONTINGENCY", "INSTRUMENT_PREAUTHORIZATION", "UPDATE_INSTRUMENT", "BANK_CONFIRMATION_CONTINGENCY", "BANK_AUTHORIZATION_CONTINGENCY", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentContingencyType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentContingencyType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentContingencyType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentContingencyType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType[]{com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType.CONSENT_CONTINGENCY, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType.INSTRUMENT_PREAUTHORIZATION, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType.UPDATE_INSTRUMENT, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType.BANK_CONFIRMATION_CONTINGENCY, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType.BANK_AUTHORIZATION_CONTINGENCY, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType debitInstrumentContingencyType = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType) obj;
            return debitInstrumentContingencyType == null ? com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType.UNKNOWN__ : debitInstrumentContingencyType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
