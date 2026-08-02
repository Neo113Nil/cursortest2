package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "P2P", "P2P_SEND_MONEY", "P2P_REQUEST_MONEY", "INVOICING", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContactNetworkType {
    public static final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType CRYPTO;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ContactNetworkType[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType INVOICING;
    public static final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType P2P;
    public static final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType P2P_REQUEST_MONEY;
    public static final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType P2P_SEND_MONEY;
    public static final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ContactNetworkType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType = new com.paypal.oslo.api.graphql.schema.type.ContactNetworkType("P2P", 0, "P2P");
        P2P = contactNetworkType;
        com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType2 = new com.paypal.oslo.api.graphql.schema.type.ContactNetworkType("P2P_SEND_MONEY", 1, "P2P_SEND_MONEY");
        P2P_SEND_MONEY = contactNetworkType2;
        com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType3 = new com.paypal.oslo.api.graphql.schema.type.ContactNetworkType("P2P_REQUEST_MONEY", 2, "P2P_REQUEST_MONEY");
        P2P_REQUEST_MONEY = contactNetworkType3;
        com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType4 = new com.paypal.oslo.api.graphql.schema.type.ContactNetworkType("INVOICING", 3, "INVOICING");
        INVOICING = contactNetworkType4;
        com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType5 = new com.paypal.oslo.api.graphql.schema.type.ContactNetworkType(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, 4, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO);
        CRYPTO = contactNetworkType5;
        com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType6 = new com.paypal.oslo.api.graphql.schema.type.ContactNetworkType("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = contactNetworkType6;
        com.paypal.oslo.api.graphql.schema.type.ContactNetworkType[] contactNetworkTypeArr = {contactNetworkType, contactNetworkType2, contactNetworkType3, contactNetworkType4, contactNetworkType5, contactNetworkType6};
        Camera2StreamConfigurationMap = contactNetworkTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(contactNetworkTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ContactNetworkType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"P2P", "P2P_SEND_MONEY", "P2P_REQUEST_MONEY", "INVOICING", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ContactNetworkType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ContactNetworkType[]{com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.P2P, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.P2P_SEND_MONEY, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.P2P_REQUEST_MONEY, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.INVOICING, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.CRYPTO});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ContactNetworkType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ContactNetworkType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ContactNetworkType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType = (com.paypal.oslo.api.graphql.schema.type.ContactNetworkType) obj;
            return contactNetworkType == null ? com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.UNKNOWN__ : contactNetworkType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ContactNetworkType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ContactNetworkType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ContactNetworkType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ContactNetworkType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ContactNetworkType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
