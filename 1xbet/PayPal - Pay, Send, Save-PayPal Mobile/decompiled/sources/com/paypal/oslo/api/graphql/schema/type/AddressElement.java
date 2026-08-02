package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AddressElement;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ADMIN_AREA_4", "ADMIN_AREA_3", "ADMIN_AREA_2", "ADMIN_AREA_1", com.google.android.gms.maps.model.FeatureType.POSTAL_CODE, "COUNTRY_CODE", "STREET_NUMBER", "STREET_NAME", "STREET_TYPE", "DELIVERY_SERVICE", "BUILDING_NAME", "SUB_BUILDING", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddressElement {
    public static final com.paypal.oslo.api.graphql.schema.type.AddressElement ADMIN_AREA_1;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressElement ADMIN_AREA_2;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressElement ADMIN_AREA_3;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressElement ADMIN_AREA_4;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressElement BUILDING_NAME;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressElement COUNTRY_CODE;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.AddressElement.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressElement DELIVERY_SERVICE;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressElement POSTAL_CODE;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressElement STREET_NAME;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressElement STREET_NUMBER;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressElement STREET_TYPE;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressElement SUB_BUILDING;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressElement UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AddressElement[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private AddressElement(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.AddressElement addressElement = new com.paypal.oslo.api.graphql.schema.type.AddressElement("ADMIN_AREA_4", 0, "ADMIN_AREA_4");
        ADMIN_AREA_4 = addressElement;
        com.paypal.oslo.api.graphql.schema.type.AddressElement addressElement2 = new com.paypal.oslo.api.graphql.schema.type.AddressElement("ADMIN_AREA_3", 1, "ADMIN_AREA_3");
        ADMIN_AREA_3 = addressElement2;
        com.paypal.oslo.api.graphql.schema.type.AddressElement addressElement3 = new com.paypal.oslo.api.graphql.schema.type.AddressElement("ADMIN_AREA_2", 2, "ADMIN_AREA_2");
        ADMIN_AREA_2 = addressElement3;
        com.paypal.oslo.api.graphql.schema.type.AddressElement addressElement4 = new com.paypal.oslo.api.graphql.schema.type.AddressElement("ADMIN_AREA_1", 3, "ADMIN_AREA_1");
        ADMIN_AREA_1 = addressElement4;
        com.paypal.oslo.api.graphql.schema.type.AddressElement addressElement5 = new com.paypal.oslo.api.graphql.schema.type.AddressElement(com.google.android.gms.maps.model.FeatureType.POSTAL_CODE, 4, com.google.android.gms.maps.model.FeatureType.POSTAL_CODE);
        POSTAL_CODE = addressElement5;
        com.paypal.oslo.api.graphql.schema.type.AddressElement addressElement6 = new com.paypal.oslo.api.graphql.schema.type.AddressElement("COUNTRY_CODE", 5, "COUNTRY_CODE");
        COUNTRY_CODE = addressElement6;
        com.paypal.oslo.api.graphql.schema.type.AddressElement addressElement7 = new com.paypal.oslo.api.graphql.schema.type.AddressElement("STREET_NUMBER", 6, "STREET_NUMBER");
        STREET_NUMBER = addressElement7;
        com.paypal.oslo.api.graphql.schema.type.AddressElement addressElement8 = new com.paypal.oslo.api.graphql.schema.type.AddressElement("STREET_NAME", 7, "STREET_NAME");
        STREET_NAME = addressElement8;
        com.paypal.oslo.api.graphql.schema.type.AddressElement addressElement9 = new com.paypal.oslo.api.graphql.schema.type.AddressElement("STREET_TYPE", 8, "STREET_TYPE");
        STREET_TYPE = addressElement9;
        com.paypal.oslo.api.graphql.schema.type.AddressElement addressElement10 = new com.paypal.oslo.api.graphql.schema.type.AddressElement("DELIVERY_SERVICE", 9, "DELIVERY_SERVICE");
        DELIVERY_SERVICE = addressElement10;
        com.paypal.oslo.api.graphql.schema.type.AddressElement addressElement11 = new com.paypal.oslo.api.graphql.schema.type.AddressElement("BUILDING_NAME", 10, "BUILDING_NAME");
        BUILDING_NAME = addressElement11;
        com.paypal.oslo.api.graphql.schema.type.AddressElement addressElement12 = new com.paypal.oslo.api.graphql.schema.type.AddressElement("SUB_BUILDING", 11, "SUB_BUILDING");
        SUB_BUILDING = addressElement12;
        com.paypal.oslo.api.graphql.schema.type.AddressElement addressElement13 = new com.paypal.oslo.api.graphql.schema.type.AddressElement("UNKNOWN__", 12, "UNKNOWN__");
        UNKNOWN__ = addressElement13;
        com.paypal.oslo.api.graphql.schema.type.AddressElement[] addressElementArr = {addressElement, addressElement2, addressElement3, addressElement4, addressElement5, addressElement6, addressElement7, addressElement8, addressElement9, addressElement10, addressElement11, addressElement12, addressElement13};
        getHighSpeedVideoSizes = addressElementArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(addressElementArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.AddressElement.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("AddressElement", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ADMIN_AREA_4", "ADMIN_AREA_3", "ADMIN_AREA_2", "ADMIN_AREA_1", com.google.android.gms.maps.model.FeatureType.POSTAL_CODE, "COUNTRY_CODE", "STREET_NUMBER", "STREET_NAME", "STREET_TYPE", "DELIVERY_SERVICE", "BUILDING_NAME", "SUB_BUILDING"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AddressElement$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/AddressElement;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/AddressElement;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/AddressElement;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.AddressElement.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.AddressElement> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.AddressElement[]{com.paypal.oslo.api.graphql.schema.type.AddressElement.ADMIN_AREA_4, com.paypal.oslo.api.graphql.schema.type.AddressElement.ADMIN_AREA_3, com.paypal.oslo.api.graphql.schema.type.AddressElement.ADMIN_AREA_2, com.paypal.oslo.api.graphql.schema.type.AddressElement.ADMIN_AREA_1, com.paypal.oslo.api.graphql.schema.type.AddressElement.POSTAL_CODE, com.paypal.oslo.api.graphql.schema.type.AddressElement.COUNTRY_CODE, com.paypal.oslo.api.graphql.schema.type.AddressElement.STREET_NUMBER, com.paypal.oslo.api.graphql.schema.type.AddressElement.STREET_NAME, com.paypal.oslo.api.graphql.schema.type.AddressElement.STREET_TYPE, com.paypal.oslo.api.graphql.schema.type.AddressElement.DELIVERY_SERVICE, com.paypal.oslo.api.graphql.schema.type.AddressElement.BUILDING_NAME, com.paypal.oslo.api.graphql.schema.type.AddressElement.SUB_BUILDING});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.AddressElement[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.AddressElement[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.AddressElement[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.AddressElement safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.AddressElement.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.AddressElement) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.AddressElement addressElement = (com.paypal.oslo.api.graphql.schema.type.AddressElement) obj;
            return addressElement == null ? com.paypal.oslo.api.graphql.schema.type.AddressElement.UNKNOWN__ : addressElement;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.AddressElement[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.AddressElement[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.AddressElement valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.AddressElement) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.AddressElement.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.AddressElement> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
