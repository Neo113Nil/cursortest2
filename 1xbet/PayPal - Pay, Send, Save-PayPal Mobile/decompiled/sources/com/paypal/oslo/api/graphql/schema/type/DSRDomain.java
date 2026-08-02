package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DSRDomain;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "PAYPAL", "HONEY", "XOOM", "VENMO", "ZETTLE", "PAYPAL_ZETTLE", "ACCELERATED_CHECKOUT", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DSRDomain {
    public static final com.paypal.oslo.api.graphql.schema.type.DSRDomain ACCELERATED_CHECKOUT;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DSRDomain.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DSRDomain HONEY;
    public static final com.paypal.oslo.api.graphql.schema.type.DSRDomain PAYPAL;
    public static final com.paypal.oslo.api.graphql.schema.type.DSRDomain PAYPAL_ZETTLE;
    public static final com.paypal.oslo.api.graphql.schema.type.DSRDomain UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.DSRDomain VENMO;
    public static final com.paypal.oslo.api.graphql.schema.type.DSRDomain XOOM;
    public static final com.paypal.oslo.api.graphql.schema.type.DSRDomain ZETTLE;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DSRDomain[] getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DSRDomain(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DSRDomain dSRDomain = new com.paypal.oslo.api.graphql.schema.type.DSRDomain("PAYPAL", 0, "PAYPAL");
        PAYPAL = dSRDomain;
        com.paypal.oslo.api.graphql.schema.type.DSRDomain dSRDomain2 = new com.paypal.oslo.api.graphql.schema.type.DSRDomain("HONEY", 1, "HONEY");
        HONEY = dSRDomain2;
        com.paypal.oslo.api.graphql.schema.type.DSRDomain dSRDomain3 = new com.paypal.oslo.api.graphql.schema.type.DSRDomain("XOOM", 2, "XOOM");
        XOOM = dSRDomain3;
        com.paypal.oslo.api.graphql.schema.type.DSRDomain dSRDomain4 = new com.paypal.oslo.api.graphql.schema.type.DSRDomain("VENMO", 3, "VENMO");
        VENMO = dSRDomain4;
        com.paypal.oslo.api.graphql.schema.type.DSRDomain dSRDomain5 = new com.paypal.oslo.api.graphql.schema.type.DSRDomain("ZETTLE", 4, "ZETTLE");
        ZETTLE = dSRDomain5;
        com.paypal.oslo.api.graphql.schema.type.DSRDomain dSRDomain6 = new com.paypal.oslo.api.graphql.schema.type.DSRDomain("PAYPAL_ZETTLE", 5, "PAYPAL_ZETTLE");
        PAYPAL_ZETTLE = dSRDomain6;
        com.paypal.oslo.api.graphql.schema.type.DSRDomain dSRDomain7 = new com.paypal.oslo.api.graphql.schema.type.DSRDomain("ACCELERATED_CHECKOUT", 6, "ACCELERATED_CHECKOUT");
        ACCELERATED_CHECKOUT = dSRDomain7;
        com.paypal.oslo.api.graphql.schema.type.DSRDomain dSRDomain8 = new com.paypal.oslo.api.graphql.schema.type.DSRDomain("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = dSRDomain8;
        com.paypal.oslo.api.graphql.schema.type.DSRDomain[] dSRDomainArr = {dSRDomain, dSRDomain2, dSRDomain3, dSRDomain4, dSRDomain5, dSRDomain6, dSRDomain7, dSRDomain8};
        getHighSpeedVideoFpsRanges = dSRDomainArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(dSRDomainArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DSRDomain.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DSRDomain", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PAYPAL", "HONEY", "XOOM", "VENMO", "ZETTLE", "PAYPAL_ZETTLE", "ACCELERATED_CHECKOUT"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DSRDomain$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DSRDomain;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DSRDomain;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DSRDomain;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DSRDomain.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DSRDomain> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DSRDomain[]{com.paypal.oslo.api.graphql.schema.type.DSRDomain.PAYPAL, com.paypal.oslo.api.graphql.schema.type.DSRDomain.HONEY, com.paypal.oslo.api.graphql.schema.type.DSRDomain.XOOM, com.paypal.oslo.api.graphql.schema.type.DSRDomain.VENMO, com.paypal.oslo.api.graphql.schema.type.DSRDomain.ZETTLE, com.paypal.oslo.api.graphql.schema.type.DSRDomain.PAYPAL_ZETTLE, com.paypal.oslo.api.graphql.schema.type.DSRDomain.ACCELERATED_CHECKOUT});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DSRDomain[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DSRDomain[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DSRDomain[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DSRDomain safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DSRDomain.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DSRDomain) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DSRDomain dSRDomain = (com.paypal.oslo.api.graphql.schema.type.DSRDomain) obj;
            return dSRDomain == null ? com.paypal.oslo.api.graphql.schema.type.DSRDomain.UNKNOWN__ : dSRDomain;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DSRDomain[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DSRDomain[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DSRDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DSRDomain) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DSRDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DSRDomain> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
