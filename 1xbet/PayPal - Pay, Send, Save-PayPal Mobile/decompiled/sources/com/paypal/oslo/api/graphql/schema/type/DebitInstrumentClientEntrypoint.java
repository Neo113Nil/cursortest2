package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentClientEntrypoint;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "REQUEST_PHYSICAL_CARD_ADD_FI", "REQUEST_PHYSICAL_CARD_CANCEL_ADD_FI", "REQUEST_PHYSICAL_CARD_FI_CONTINGENCY", "REQUEST_PHYSICAL_CARD_FI_CONTINGENCY_CANCEL", "REQUEST_PHYSICAL_CARD_CHANGE_FI", "UNLINK_FI", "FI_CONTINGENCY_CANCEL", "FLOW_CONTINGENCY", "ADD_FI", "CANCEL_ADD_FI", "MANAGE_CARD", "CHANGE_FI", "TOGGLE_FI", "REFRESH_FI", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitInstrumentClientEntrypoint {
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint ADD_FI;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint CANCEL_ADD_FI;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint CHANGE_FI;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint FI_CONTINGENCY_CANCEL;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint FLOW_CONTINGENCY;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint MANAGE_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint REFRESH_FI;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint REQUEST_PHYSICAL_CARD_ADD_FI;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint REQUEST_PHYSICAL_CARD_CANCEL_ADD_FI;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint REQUEST_PHYSICAL_CARD_CHANGE_FI;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint REQUEST_PHYSICAL_CARD_FI_CONTINGENCY;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint REQUEST_PHYSICAL_CARD_FI_CONTINGENCY_CANCEL;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint TOGGLE_FI;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint UNLINK_FI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DebitInstrumentClientEntrypoint(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint("REQUEST_PHYSICAL_CARD_ADD_FI", 0, "REQUEST_PHYSICAL_CARD_ADD_FI");
        REQUEST_PHYSICAL_CARD_ADD_FI = debitInstrumentClientEntrypoint;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint2 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint("REQUEST_PHYSICAL_CARD_CANCEL_ADD_FI", 1, "REQUEST_PHYSICAL_CARD_CANCEL_ADD_FI");
        REQUEST_PHYSICAL_CARD_CANCEL_ADD_FI = debitInstrumentClientEntrypoint2;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint3 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint("REQUEST_PHYSICAL_CARD_FI_CONTINGENCY", 2, "REQUEST_PHYSICAL_CARD_FI_CONTINGENCY");
        REQUEST_PHYSICAL_CARD_FI_CONTINGENCY = debitInstrumentClientEntrypoint3;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint4 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint("REQUEST_PHYSICAL_CARD_FI_CONTINGENCY_CANCEL", 3, "REQUEST_PHYSICAL_CARD_FI_CONTINGENCY_CANCEL");
        REQUEST_PHYSICAL_CARD_FI_CONTINGENCY_CANCEL = debitInstrumentClientEntrypoint4;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint5 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint("REQUEST_PHYSICAL_CARD_CHANGE_FI", 4, "REQUEST_PHYSICAL_CARD_CHANGE_FI");
        REQUEST_PHYSICAL_CARD_CHANGE_FI = debitInstrumentClientEntrypoint5;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint6 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint("UNLINK_FI", 5, "UNLINK_FI");
        UNLINK_FI = debitInstrumentClientEntrypoint6;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint7 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint("FI_CONTINGENCY_CANCEL", 6, "FI_CONTINGENCY_CANCEL");
        FI_CONTINGENCY_CANCEL = debitInstrumentClientEntrypoint7;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint8 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint("FLOW_CONTINGENCY", 7, "FLOW_CONTINGENCY");
        FLOW_CONTINGENCY = debitInstrumentClientEntrypoint8;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint9 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint("ADD_FI", 8, "ADD_FI");
        ADD_FI = debitInstrumentClientEntrypoint9;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint10 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint("CANCEL_ADD_FI", 9, "CANCEL_ADD_FI");
        CANCEL_ADD_FI = debitInstrumentClientEntrypoint10;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint11 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint("MANAGE_CARD", 10, "MANAGE_CARD");
        MANAGE_CARD = debitInstrumentClientEntrypoint11;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint12 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint("CHANGE_FI", 11, "CHANGE_FI");
        CHANGE_FI = debitInstrumentClientEntrypoint12;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint13 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint("TOGGLE_FI", 12, "TOGGLE_FI");
        TOGGLE_FI = debitInstrumentClientEntrypoint13;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint14 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint("REFRESH_FI", 13, "REFRESH_FI");
        REFRESH_FI = debitInstrumentClientEntrypoint14;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint15 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint("UNKNOWN__", 14, "UNKNOWN__");
        UNKNOWN__ = debitInstrumentClientEntrypoint15;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint[] debitInstrumentClientEntrypointArr = {debitInstrumentClientEntrypoint, debitInstrumentClientEntrypoint2, debitInstrumentClientEntrypoint3, debitInstrumentClientEntrypoint4, debitInstrumentClientEntrypoint5, debitInstrumentClientEntrypoint6, debitInstrumentClientEntrypoint7, debitInstrumentClientEntrypoint8, debitInstrumentClientEntrypoint9, debitInstrumentClientEntrypoint10, debitInstrumentClientEntrypoint11, debitInstrumentClientEntrypoint12, debitInstrumentClientEntrypoint13, debitInstrumentClientEntrypoint14, debitInstrumentClientEntrypoint15};
        getHighSpeedVideoSizes = debitInstrumentClientEntrypointArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentClientEntrypointArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DebitInstrumentClientEntrypoint", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"REQUEST_PHYSICAL_CARD_ADD_FI", "REQUEST_PHYSICAL_CARD_CANCEL_ADD_FI", "REQUEST_PHYSICAL_CARD_FI_CONTINGENCY", "REQUEST_PHYSICAL_CARD_FI_CONTINGENCY_CANCEL", "REQUEST_PHYSICAL_CARD_CHANGE_FI", "UNLINK_FI", "FI_CONTINGENCY_CANCEL", "FLOW_CONTINGENCY", "ADD_FI", "CANCEL_ADD_FI", "MANAGE_CARD", "CHANGE_FI", "TOGGLE_FI", "REFRESH_FI"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentClientEntrypoint$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentClientEntrypoint;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentClientEntrypoint;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentClientEntrypoint;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint[]{com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.REQUEST_PHYSICAL_CARD_ADD_FI, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.REQUEST_PHYSICAL_CARD_CANCEL_ADD_FI, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.REQUEST_PHYSICAL_CARD_FI_CONTINGENCY, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.REQUEST_PHYSICAL_CARD_FI_CONTINGENCY_CANCEL, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.REQUEST_PHYSICAL_CARD_CHANGE_FI, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.UNLINK_FI, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.FI_CONTINGENCY_CANCEL, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.FLOW_CONTINGENCY, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.ADD_FI, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.CANCEL_ADD_FI, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.MANAGE_CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.CHANGE_FI, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.TOGGLE_FI, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.REFRESH_FI});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint) obj;
            return debitInstrumentClientEntrypoint == null ? com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.UNKNOWN__ : debitInstrumentClientEntrypoint;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
