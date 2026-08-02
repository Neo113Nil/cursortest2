package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ShipmentStatusDetails;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "PICKED_UP", "IN_TRANSIT", "OUT_FOR_DELIVERY", "DELIVERED", "DELIVERY_ATTEMPTED", "RETURN_TO_SENDER", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShipmentStatusDetails {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails DELIVERED;
    public static final com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails DELIVERY_ATTEMPTED;
    public static final com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails IN_TRANSIT;
    public static final com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails OUT_FOR_DELIVERY;
    public static final com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails PICKED_UP;
    public static final com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails RETURN_TO_SENDER;
    public static final com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails[] getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ShipmentStatusDetails(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails shipmentStatusDetails = new com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails("PICKED_UP", 0, "PICKED_UP");
        PICKED_UP = shipmentStatusDetails;
        com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails shipmentStatusDetails2 = new com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails("IN_TRANSIT", 1, "IN_TRANSIT");
        IN_TRANSIT = shipmentStatusDetails2;
        com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails shipmentStatusDetails3 = new com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails("OUT_FOR_DELIVERY", 2, "OUT_FOR_DELIVERY");
        OUT_FOR_DELIVERY = shipmentStatusDetails3;
        com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails shipmentStatusDetails4 = new com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails("DELIVERED", 3, "DELIVERED");
        DELIVERED = shipmentStatusDetails4;
        com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails shipmentStatusDetails5 = new com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails("DELIVERY_ATTEMPTED", 4, "DELIVERY_ATTEMPTED");
        DELIVERY_ATTEMPTED = shipmentStatusDetails5;
        com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails shipmentStatusDetails6 = new com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails("RETURN_TO_SENDER", 5, "RETURN_TO_SENDER");
        RETURN_TO_SENDER = shipmentStatusDetails6;
        com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails shipmentStatusDetails7 = new com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails("UNKNOWN", 6, "UNKNOWN");
        UNKNOWN = shipmentStatusDetails7;
        com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails shipmentStatusDetails8 = new com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = shipmentStatusDetails8;
        com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails[] shipmentStatusDetailsArr = {shipmentStatusDetails, shipmentStatusDetails2, shipmentStatusDetails3, shipmentStatusDetails4, shipmentStatusDetails5, shipmentStatusDetails6, shipmentStatusDetails7, shipmentStatusDetails8};
        getHighSpeedVideoFpsRanges = shipmentStatusDetailsArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(shipmentStatusDetailsArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ShipmentStatusDetails", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PICKED_UP", "IN_TRANSIT", "OUT_FOR_DELIVERY", "DELIVERED", "DELIVERY_ATTEMPTED", "RETURN_TO_SENDER", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ShipmentStatusDetails$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ShipmentStatusDetails;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ShipmentStatusDetails;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ShipmentStatusDetails;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails[]{com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails.PICKED_UP, com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails.IN_TRANSIT, com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails.OUT_FOR_DELIVERY, com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails.DELIVERED, com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails.DELIVERY_ATTEMPTED, com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails.RETURN_TO_SENDER, com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails shipmentStatusDetails = (com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails) obj;
            return shipmentStatusDetails == null ? com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails.UNKNOWN__ : shipmentStatusDetails;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ShipmentStatusDetails> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
