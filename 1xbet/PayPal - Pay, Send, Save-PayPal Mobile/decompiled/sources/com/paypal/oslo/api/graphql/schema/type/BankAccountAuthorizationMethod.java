package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationMethod;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ELECTRONIC_MANDATE", "MANUAL_MANDATE", "PAYPAL_AGREEMENT", "PAYPAL_HELD_ELV_MANDATE", "PAYPAL_HELD_SEPA_MANDATE", "ONLINE_MANDATE", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BankAccountAuthorizationMethod {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod ELECTRONIC_MANDATE;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod MANUAL_MANDATE;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod ONLINE_MANDATE;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod PAYPAL_AGREEMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod PAYPAL_HELD_ELV_MANDATE;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod PAYPAL_HELD_SEPA_MANDATE;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private BankAccountAuthorizationMethod(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod bankAccountAuthorizationMethod = new com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod("ELECTRONIC_MANDATE", 0, "ELECTRONIC_MANDATE");
        ELECTRONIC_MANDATE = bankAccountAuthorizationMethod;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod bankAccountAuthorizationMethod2 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod("MANUAL_MANDATE", 1, "MANUAL_MANDATE");
        MANUAL_MANDATE = bankAccountAuthorizationMethod2;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod bankAccountAuthorizationMethod3 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod("PAYPAL_AGREEMENT", 2, "PAYPAL_AGREEMENT");
        PAYPAL_AGREEMENT = bankAccountAuthorizationMethod3;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod bankAccountAuthorizationMethod4 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod("PAYPAL_HELD_ELV_MANDATE", 3, "PAYPAL_HELD_ELV_MANDATE");
        PAYPAL_HELD_ELV_MANDATE = bankAccountAuthorizationMethod4;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod bankAccountAuthorizationMethod5 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod("PAYPAL_HELD_SEPA_MANDATE", 4, "PAYPAL_HELD_SEPA_MANDATE");
        PAYPAL_HELD_SEPA_MANDATE = bankAccountAuthorizationMethod5;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod bankAccountAuthorizationMethod6 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod("ONLINE_MANDATE", 5, "ONLINE_MANDATE");
        ONLINE_MANDATE = bankAccountAuthorizationMethod6;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod bankAccountAuthorizationMethod7 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod("UNKNOWN", 6, "UNKNOWN");
        UNKNOWN = bankAccountAuthorizationMethod7;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod bankAccountAuthorizationMethod8 = new com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = bankAccountAuthorizationMethod8;
        com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod[] bankAccountAuthorizationMethodArr = {bankAccountAuthorizationMethod, bankAccountAuthorizationMethod2, bankAccountAuthorizationMethod3, bankAccountAuthorizationMethod4, bankAccountAuthorizationMethod5, bankAccountAuthorizationMethod6, bankAccountAuthorizationMethod7, bankAccountAuthorizationMethod8};
        getHighSpeedVideoFpsRangesFor = bankAccountAuthorizationMethodArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(bankAccountAuthorizationMethodArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("BankAccountAuthorizationMethod", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ELECTRONIC_MANDATE", "MANUAL_MANDATE", "PAYPAL_AGREEMENT", "PAYPAL_HELD_ELV_MANDATE", "PAYPAL_HELD_SEPA_MANDATE", "ONLINE_MANDATE", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationMethod$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationMethod;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationMethod;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationMethod;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod[]{com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.ELECTRONIC_MANDATE, com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.MANUAL_MANDATE, com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.PAYPAL_AGREEMENT, com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.PAYPAL_HELD_ELV_MANDATE, com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.PAYPAL_HELD_SEPA_MANDATE, com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.ONLINE_MANDATE, com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod bankAccountAuthorizationMethod = (com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod) obj;
            return bankAccountAuthorizationMethod == null ? com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.UNKNOWN__ : bankAccountAuthorizationMethod;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
