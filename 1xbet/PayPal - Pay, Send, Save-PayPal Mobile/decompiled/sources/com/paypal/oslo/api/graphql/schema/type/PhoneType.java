package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PhoneType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "MAIN", "WORK", "OTHER", "CUSTOMER_SERVICE", "FAX", "NONE", "HOME", "MOBILE", "RELATIVE_OR_FRIEND", "VALIDATED_SESSION", "BUSINESS", "WAX", "UPS", "VERISIGN_BILLING", "FAX_VERISIGN_BILLING", "FAX_HOME", "FAX_BUSINESS", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PhoneType {
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType BUSINESS;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType CUSTOMER_SERVICE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType FAX;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType FAX_BUSINESS;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType FAX_HOME;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType FAX_VERISIGN_BILLING;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType HOME;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType MAIN;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType MOBILE;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType NONE;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType OTHER;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType RELATIVE_OR_FRIEND;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType UPS;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType VALIDATED_SESSION;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType VERISIGN_BILLING;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType WAX;
    public static final com.paypal.oslo.api.graphql.schema.type.PhoneType WORK;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PhoneType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private PhoneType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType = new com.paypal.oslo.api.graphql.schema.type.PhoneType("MAIN", 0, "MAIN");
        MAIN = phoneType;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType2 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("WORK", 1, "WORK");
        WORK = phoneType2;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType3 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("OTHER", 2, "OTHER");
        OTHER = phoneType3;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType4 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("CUSTOMER_SERVICE", 3, "CUSTOMER_SERVICE");
        CUSTOMER_SERVICE = phoneType4;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType5 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("FAX", 4, "FAX");
        FAX = phoneType5;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType6 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("NONE", 5, "NONE");
        NONE = phoneType6;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType7 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("HOME", 6, "HOME");
        HOME = phoneType7;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType8 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("MOBILE", 7, "MOBILE");
        MOBILE = phoneType8;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType9 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("RELATIVE_OR_FRIEND", 8, "RELATIVE_OR_FRIEND");
        RELATIVE_OR_FRIEND = phoneType9;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType10 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("VALIDATED_SESSION", 9, "VALIDATED_SESSION");
        VALIDATED_SESSION = phoneType10;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType11 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("BUSINESS", 10, "BUSINESS");
        BUSINESS = phoneType11;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType12 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("WAX", 11, "WAX");
        WAX = phoneType12;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType13 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("UPS", 12, "UPS");
        UPS = phoneType13;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType14 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("VERISIGN_BILLING", 13, "VERISIGN_BILLING");
        VERISIGN_BILLING = phoneType14;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType15 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("FAX_VERISIGN_BILLING", 14, "FAX_VERISIGN_BILLING");
        FAX_VERISIGN_BILLING = phoneType15;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType16 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("FAX_HOME", 15, "FAX_HOME");
        FAX_HOME = phoneType16;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType17 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("FAX_BUSINESS", 16, "FAX_BUSINESS");
        FAX_BUSINESS = phoneType17;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType18 = new com.paypal.oslo.api.graphql.schema.type.PhoneType("UNKNOWN__", 17, "UNKNOWN__");
        UNKNOWN__ = phoneType18;
        com.paypal.oslo.api.graphql.schema.type.PhoneType[] phoneTypeArr = {phoneType, phoneType2, phoneType3, phoneType4, phoneType5, phoneType6, phoneType7, phoneType8, phoneType9, phoneType10, phoneType11, phoneType12, phoneType13, phoneType14, phoneType15, phoneType16, phoneType17, phoneType18};
        getHighResolutionOutputSizeshNQ4ISI = phoneTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(phoneTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.PhoneType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("PhoneType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"MAIN", "WORK", "OTHER", "CUSTOMER_SERVICE", "FAX", "NONE", "HOME", "MOBILE", "RELATIVE_OR_FRIEND", "VALIDATED_SESSION", "BUSINESS", "WAX", "UPS", "VERISIGN_BILLING", "FAX_VERISIGN_BILLING", "FAX_HOME", "FAX_BUSINESS"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PhoneType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/PhoneType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/PhoneType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.PhoneType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PhoneType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.PhoneType[]{com.paypal.oslo.api.graphql.schema.type.PhoneType.MAIN, com.paypal.oslo.api.graphql.schema.type.PhoneType.WORK, com.paypal.oslo.api.graphql.schema.type.PhoneType.OTHER, com.paypal.oslo.api.graphql.schema.type.PhoneType.CUSTOMER_SERVICE, com.paypal.oslo.api.graphql.schema.type.PhoneType.FAX, com.paypal.oslo.api.graphql.schema.type.PhoneType.NONE, com.paypal.oslo.api.graphql.schema.type.PhoneType.HOME, com.paypal.oslo.api.graphql.schema.type.PhoneType.MOBILE, com.paypal.oslo.api.graphql.schema.type.PhoneType.RELATIVE_OR_FRIEND, com.paypal.oslo.api.graphql.schema.type.PhoneType.VALIDATED_SESSION, com.paypal.oslo.api.graphql.schema.type.PhoneType.BUSINESS, com.paypal.oslo.api.graphql.schema.type.PhoneType.WAX, com.paypal.oslo.api.graphql.schema.type.PhoneType.UPS, com.paypal.oslo.api.graphql.schema.type.PhoneType.VERISIGN_BILLING, com.paypal.oslo.api.graphql.schema.type.PhoneType.FAX_VERISIGN_BILLING, com.paypal.oslo.api.graphql.schema.type.PhoneType.FAX_HOME, com.paypal.oslo.api.graphql.schema.type.PhoneType.FAX_BUSINESS});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.PhoneType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.PhoneType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.PhoneType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.PhoneType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.PhoneType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.PhoneType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType = (com.paypal.oslo.api.graphql.schema.type.PhoneType) obj;
            return phoneType == null ? com.paypal.oslo.api.graphql.schema.type.PhoneType.UNKNOWN__ : phoneType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.PhoneType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.PhoneType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.PhoneType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.PhoneType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.PhoneType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.PhoneType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
