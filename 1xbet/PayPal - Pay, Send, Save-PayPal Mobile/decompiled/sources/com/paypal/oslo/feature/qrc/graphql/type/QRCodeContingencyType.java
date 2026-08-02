package com.paypal.oslo.feature.qrc.graphql.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeContingencyType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "RISK_AUTH_FLOW", "ADD_FUNDING_INSTRUMENT", "THREE_DS_AUTHENTICATION", "THREE_DS_V2_AUTHENTICATION", "INSTANT_BANK_CONFIRMATION", "TRAVEL_RULE", "USER_LEGAL_CONSENT_REQUIRED", "ERROR_FUNDING_SELECTION_INSTRUMENT_UNAVAILABLE", "UNSUPPORTED_DUE_TO_NON_SUFFICIENT_FUNDS", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QRCodeContingencyType {
    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType ADD_FUNDING_INSTRUMENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType ERROR_FUNDING_SELECTION_INSTRUMENT_UNAVAILABLE;
    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType INSTANT_BANK_CONFIRMATION;
    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType RISK_AUTH_FLOW;
    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType THREE_DS_AUTHENTICATION;
    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType THREE_DS_V2_AUTHENTICATION;
    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType TRAVEL_RULE;
    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType UNKNOWN__;
    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType UNSUPPORTED_DUE_TO_NON_SUFFICIENT_FUNDS;
    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType USER_LEGAL_CONSENT_REQUIRED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private QRCodeContingencyType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType qRCodeContingencyType = new com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType("RISK_AUTH_FLOW", 0, "RISK_AUTH_FLOW");
        RISK_AUTH_FLOW = qRCodeContingencyType;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType qRCodeContingencyType2 = new com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType("ADD_FUNDING_INSTRUMENT", 1, "ADD_FUNDING_INSTRUMENT");
        ADD_FUNDING_INSTRUMENT = qRCodeContingencyType2;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType qRCodeContingencyType3 = new com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType("THREE_DS_AUTHENTICATION", 2, "THREE_DS_AUTHENTICATION");
        THREE_DS_AUTHENTICATION = qRCodeContingencyType3;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType qRCodeContingencyType4 = new com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType("THREE_DS_V2_AUTHENTICATION", 3, "THREE_DS_V2_AUTHENTICATION");
        THREE_DS_V2_AUTHENTICATION = qRCodeContingencyType4;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType qRCodeContingencyType5 = new com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType("INSTANT_BANK_CONFIRMATION", 4, "INSTANT_BANK_CONFIRMATION");
        INSTANT_BANK_CONFIRMATION = qRCodeContingencyType5;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType qRCodeContingencyType6 = new com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType("TRAVEL_RULE", 5, "TRAVEL_RULE");
        TRAVEL_RULE = qRCodeContingencyType6;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType qRCodeContingencyType7 = new com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType("USER_LEGAL_CONSENT_REQUIRED", 6, "USER_LEGAL_CONSENT_REQUIRED");
        USER_LEGAL_CONSENT_REQUIRED = qRCodeContingencyType7;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType qRCodeContingencyType8 = new com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType("ERROR_FUNDING_SELECTION_INSTRUMENT_UNAVAILABLE", 7, "ERROR_FUNDING_SELECTION_INSTRUMENT_UNAVAILABLE");
        ERROR_FUNDING_SELECTION_INSTRUMENT_UNAVAILABLE = qRCodeContingencyType8;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType qRCodeContingencyType9 = new com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType("UNSUPPORTED_DUE_TO_NON_SUFFICIENT_FUNDS", 8, "UNSUPPORTED_DUE_TO_NON_SUFFICIENT_FUNDS");
        UNSUPPORTED_DUE_TO_NON_SUFFICIENT_FUNDS = qRCodeContingencyType9;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType qRCodeContingencyType10 = new com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = qRCodeContingencyType10;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType[] qRCodeContingencyTypeArr = {qRCodeContingencyType, qRCodeContingencyType2, qRCodeContingencyType3, qRCodeContingencyType4, qRCodeContingencyType5, qRCodeContingencyType6, qRCodeContingencyType7, qRCodeContingencyType8, qRCodeContingencyType9, qRCodeContingencyType10};
        getHighSpeedVideoSizes = qRCodeContingencyTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(qRCodeContingencyTypeArr);
        INSTANCE = new com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("QRCodeContingencyType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"RISK_AUTH_FLOW", "ADD_FUNDING_INSTRUMENT", "THREE_DS_AUTHENTICATION", "THREE_DS_V2_AUTHENTICATION", "INSTANT_BANK_CONFIRMATION", "TRAVEL_RULE", "USER_LEGAL_CONSENT_REQUIRED", "ERROR_FUNDING_SELECTION_INSTRUMENT_UNAVAILABLE", "UNSUPPORTED_DUE_TO_NON_SUFFICIENT_FUNDS"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeContingencyType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeContingencyType;", "knownValues", "()[Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeContingencyType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeContingencyType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType.type;
        }

        public final java.util.List<com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType[]{com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType.RISK_AUTH_FLOW, com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType.ADD_FUNDING_INSTRUMENT, com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType.THREE_DS_AUTHENTICATION, com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType.THREE_DS_V2_AUTHENTICATION, com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType.INSTANT_BANK_CONFIRMATION, com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType.TRAVEL_RULE, com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType.USER_LEGAL_CONSENT_REQUIRED, com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType.ERROR_FUNDING_SELECTION_INSTRUMENT_UNAVAILABLE, com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType.UNSUPPORTED_DUE_TO_NON_SUFFICIENT_FUNDS});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType[] knownValues() {
            return (com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType[]) getKnownEntries().toArray(new com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType[0]);
        }

        public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType qRCodeContingencyType = (com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType) obj;
            return qRCodeContingencyType == null ? com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType.UNKNOWN__ : qRCodeContingencyType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType[] values() {
        return (com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
