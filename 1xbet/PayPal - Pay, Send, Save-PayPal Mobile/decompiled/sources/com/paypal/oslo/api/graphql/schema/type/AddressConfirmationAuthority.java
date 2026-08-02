package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AddressConfirmationAuthority;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "NONE", "MAIL", "PHONE", "PHONE_SOFT", "ADMIN", "AUTO", "BUYER_CREDIT", "TRANSACTIONAL_BUYER_CREDIT", "ALTERNATIVE_ADDRESS_CONFIRMATION", "EV_MAIL", "THIRD_PARTY", "POST_OFFICE", "DISCOVER", "ZOOT", "INGO", "XOOM", "SIGNICAT", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddressConfirmationAuthority {
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority ADMIN;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority ALTERNATIVE_ADDRESS_CONFIRMATION;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority AUTO;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority BUYER_CREDIT;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority DISCOVER;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority EV_MAIL;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority INGO;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority MAIL;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority NONE;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority PHONE;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority PHONE_SOFT;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority POST_OFFICE;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority SIGNICAT;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority THIRD_PARTY;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority TRANSACTIONAL_BUYER_CREDIT;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority XOOM;
    public static final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority ZOOT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private AddressConfirmationAuthority(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("NONE", 0, "NONE");
        NONE = addressConfirmationAuthority;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority2 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("MAIL", 1, "MAIL");
        MAIL = addressConfirmationAuthority2;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority3 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("PHONE", 2, "PHONE");
        PHONE = addressConfirmationAuthority3;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority4 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("PHONE_SOFT", 3, "PHONE_SOFT");
        PHONE_SOFT = addressConfirmationAuthority4;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority5 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("ADMIN", 4, "ADMIN");
        ADMIN = addressConfirmationAuthority5;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority6 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("AUTO", 5, "AUTO");
        AUTO = addressConfirmationAuthority6;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority7 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("BUYER_CREDIT", 6, "BUYER_CREDIT");
        BUYER_CREDIT = addressConfirmationAuthority7;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority8 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("TRANSACTIONAL_BUYER_CREDIT", 7, "TRANSACTIONAL_BUYER_CREDIT");
        TRANSACTIONAL_BUYER_CREDIT = addressConfirmationAuthority8;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority9 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("ALTERNATIVE_ADDRESS_CONFIRMATION", 8, "ALTERNATIVE_ADDRESS_CONFIRMATION");
        ALTERNATIVE_ADDRESS_CONFIRMATION = addressConfirmationAuthority9;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority10 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("EV_MAIL", 9, "EV_MAIL");
        EV_MAIL = addressConfirmationAuthority10;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority11 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("THIRD_PARTY", 10, "THIRD_PARTY");
        THIRD_PARTY = addressConfirmationAuthority11;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority12 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("POST_OFFICE", 11, "POST_OFFICE");
        POST_OFFICE = addressConfirmationAuthority12;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority13 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("DISCOVER", 12, "DISCOVER");
        DISCOVER = addressConfirmationAuthority13;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority14 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("ZOOT", 13, "ZOOT");
        ZOOT = addressConfirmationAuthority14;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority15 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("INGO", 14, "INGO");
        INGO = addressConfirmationAuthority15;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority16 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("XOOM", 15, "XOOM");
        XOOM = addressConfirmationAuthority16;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority17 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("SIGNICAT", 16, "SIGNICAT");
        SIGNICAT = addressConfirmationAuthority17;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority18 = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority("UNKNOWN__", 17, "UNKNOWN__");
        UNKNOWN__ = addressConfirmationAuthority18;
        com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority[] addressConfirmationAuthorityArr = {addressConfirmationAuthority, addressConfirmationAuthority2, addressConfirmationAuthority3, addressConfirmationAuthority4, addressConfirmationAuthority5, addressConfirmationAuthority6, addressConfirmationAuthority7, addressConfirmationAuthority8, addressConfirmationAuthority9, addressConfirmationAuthority10, addressConfirmationAuthority11, addressConfirmationAuthority12, addressConfirmationAuthority13, addressConfirmationAuthority14, addressConfirmationAuthority15, addressConfirmationAuthority16, addressConfirmationAuthority17, addressConfirmationAuthority18};
        Camera2StreamConfigurationMap = addressConfirmationAuthorityArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(addressConfirmationAuthorityArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("AddressConfirmationAuthority", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"NONE", "MAIL", "PHONE", "PHONE_SOFT", "ADMIN", "AUTO", "BUYER_CREDIT", "TRANSACTIONAL_BUYER_CREDIT", "ALTERNATIVE_ADDRESS_CONFIRMATION", "EV_MAIL", "THIRD_PARTY", "POST_OFFICE", "DISCOVER", "ZOOT", "INGO", "XOOM", "SIGNICAT"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AddressConfirmationAuthority$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/AddressConfirmationAuthority;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/AddressConfirmationAuthority;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/AddressConfirmationAuthority;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority[]{com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.NONE, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.MAIL, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.PHONE, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.PHONE_SOFT, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.ADMIN, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.AUTO, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.BUYER_CREDIT, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.TRANSACTIONAL_BUYER_CREDIT, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.ALTERNATIVE_ADDRESS_CONFIRMATION, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.EV_MAIL, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.THIRD_PARTY, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.POST_OFFICE, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.DISCOVER, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.ZOOT, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.INGO, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.XOOM, com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.SIGNICAT});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority addressConfirmationAuthority = (com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority) obj;
            return addressConfirmationAuthority == null ? com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.UNKNOWN__ : addressConfirmationAuthority;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.AddressConfirmationAuthority> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
