package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AddressTransformation;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "UNDETERMINED", "UNCHANGED", "STANDARDIZED", "UPDATED", "MINOR_CHANGE", "MAJOR_CHANGE", "NEWLY_INTRODUCED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddressTransformation {
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AddressTransformation[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.AddressTransformation.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressTransformation MAJOR_CHANGE;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressTransformation MINOR_CHANGE;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressTransformation NEWLY_INTRODUCED;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressTransformation STANDARDIZED;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressTransformation UNCHANGED;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressTransformation UNDETERMINED;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressTransformation UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressTransformation UPDATED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private AddressTransformation(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.AddressTransformation addressTransformation = new com.paypal.oslo.api.graphql.schema.type.AddressTransformation("UNDETERMINED", 0, "UNDETERMINED");
        UNDETERMINED = addressTransformation;
        com.paypal.oslo.api.graphql.schema.type.AddressTransformation addressTransformation2 = new com.paypal.oslo.api.graphql.schema.type.AddressTransformation("UNCHANGED", 1, "UNCHANGED");
        UNCHANGED = addressTransformation2;
        com.paypal.oslo.api.graphql.schema.type.AddressTransformation addressTransformation3 = new com.paypal.oslo.api.graphql.schema.type.AddressTransformation("STANDARDIZED", 2, "STANDARDIZED");
        STANDARDIZED = addressTransformation3;
        com.paypal.oslo.api.graphql.schema.type.AddressTransformation addressTransformation4 = new com.paypal.oslo.api.graphql.schema.type.AddressTransformation("UPDATED", 3, "UPDATED");
        UPDATED = addressTransformation4;
        com.paypal.oslo.api.graphql.schema.type.AddressTransformation addressTransformation5 = new com.paypal.oslo.api.graphql.schema.type.AddressTransformation("MINOR_CHANGE", 4, "MINOR_CHANGE");
        MINOR_CHANGE = addressTransformation5;
        com.paypal.oslo.api.graphql.schema.type.AddressTransformation addressTransformation6 = new com.paypal.oslo.api.graphql.schema.type.AddressTransformation("MAJOR_CHANGE", 5, "MAJOR_CHANGE");
        MAJOR_CHANGE = addressTransformation6;
        com.paypal.oslo.api.graphql.schema.type.AddressTransformation addressTransformation7 = new com.paypal.oslo.api.graphql.schema.type.AddressTransformation("NEWLY_INTRODUCED", 6, "NEWLY_INTRODUCED");
        NEWLY_INTRODUCED = addressTransformation7;
        com.paypal.oslo.api.graphql.schema.type.AddressTransformation addressTransformation8 = new com.paypal.oslo.api.graphql.schema.type.AddressTransformation("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = addressTransformation8;
        com.paypal.oslo.api.graphql.schema.type.AddressTransformation[] addressTransformationArr = {addressTransformation, addressTransformation2, addressTransformation3, addressTransformation4, addressTransformation5, addressTransformation6, addressTransformation7, addressTransformation8};
        Camera2StreamConfigurationMap = addressTransformationArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(addressTransformationArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.AddressTransformation.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("AddressTransformation", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"UNDETERMINED", "UNCHANGED", "STANDARDIZED", "UPDATED", "MINOR_CHANGE", "MAJOR_CHANGE", "NEWLY_INTRODUCED"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AddressTransformation$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/AddressTransformation;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/AddressTransformation;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/AddressTransformation;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.AddressTransformation.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.AddressTransformation> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.AddressTransformation[]{com.paypal.oslo.api.graphql.schema.type.AddressTransformation.UNDETERMINED, com.paypal.oslo.api.graphql.schema.type.AddressTransformation.UNCHANGED, com.paypal.oslo.api.graphql.schema.type.AddressTransformation.STANDARDIZED, com.paypal.oslo.api.graphql.schema.type.AddressTransformation.UPDATED, com.paypal.oslo.api.graphql.schema.type.AddressTransformation.MINOR_CHANGE, com.paypal.oslo.api.graphql.schema.type.AddressTransformation.MAJOR_CHANGE, com.paypal.oslo.api.graphql.schema.type.AddressTransformation.NEWLY_INTRODUCED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.AddressTransformation[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.AddressTransformation[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.AddressTransformation[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.AddressTransformation safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.AddressTransformation.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.AddressTransformation) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.AddressTransformation addressTransformation = (com.paypal.oslo.api.graphql.schema.type.AddressTransformation) obj;
            return addressTransformation == null ? com.paypal.oslo.api.graphql.schema.type.AddressTransformation.UNKNOWN__ : addressTransformation;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.AddressTransformation[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.AddressTransformation[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.AddressTransformation valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.AddressTransformation) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.AddressTransformation.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.AddressTransformation> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
