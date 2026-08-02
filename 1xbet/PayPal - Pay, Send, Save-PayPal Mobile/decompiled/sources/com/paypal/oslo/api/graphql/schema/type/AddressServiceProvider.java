package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AddressServiceProvider;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ADDRESS_DOCTOR_5", "ADDRESS_DOCTOR_6", "MAXMIND_ENTERPRISE", "MELISSA_CLOUD", "RELTIO_CLOUD", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddressServiceProvider {
    public static final com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider ADDRESS_DOCTOR_5;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider ADDRESS_DOCTOR_6;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider MAXMIND_ENTERPRISE;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider MELISSA_CLOUD;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider RELTIO_CLOUD;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private AddressServiceProvider(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider addressServiceProvider = new com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider("ADDRESS_DOCTOR_5", 0, "ADDRESS_DOCTOR_5");
        ADDRESS_DOCTOR_5 = addressServiceProvider;
        com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider addressServiceProvider2 = new com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider("ADDRESS_DOCTOR_6", 1, "ADDRESS_DOCTOR_6");
        ADDRESS_DOCTOR_6 = addressServiceProvider2;
        com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider addressServiceProvider3 = new com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider("MAXMIND_ENTERPRISE", 2, "MAXMIND_ENTERPRISE");
        MAXMIND_ENTERPRISE = addressServiceProvider3;
        com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider addressServiceProvider4 = new com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider("MELISSA_CLOUD", 3, "MELISSA_CLOUD");
        MELISSA_CLOUD = addressServiceProvider4;
        com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider addressServiceProvider5 = new com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider("RELTIO_CLOUD", 4, "RELTIO_CLOUD");
        RELTIO_CLOUD = addressServiceProvider5;
        com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider addressServiceProvider6 = new com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = addressServiceProvider6;
        com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider[] addressServiceProviderArr = {addressServiceProvider, addressServiceProvider2, addressServiceProvider3, addressServiceProvider4, addressServiceProvider5, addressServiceProvider6};
        getHighSpeedVideoFpsRanges = addressServiceProviderArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(addressServiceProviderArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("AddressServiceProvider", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ADDRESS_DOCTOR_5", "ADDRESS_DOCTOR_6", "MAXMIND_ENTERPRISE", "MELISSA_CLOUD", "RELTIO_CLOUD"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AddressServiceProvider$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/AddressServiceProvider;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/AddressServiceProvider;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/AddressServiceProvider;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider[]{com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider.ADDRESS_DOCTOR_5, com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider.ADDRESS_DOCTOR_6, com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider.MAXMIND_ENTERPRISE, com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider.MELISSA_CLOUD, com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider.RELTIO_CLOUD});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider addressServiceProvider = (com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider) obj;
            return addressServiceProvider == null ? com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider.UNKNOWN__ : addressServiceProvider;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.AddressServiceProvider> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
