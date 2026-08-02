package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/__TypeKind;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "SCALAR", "OBJECT", "INTERFACE", "UNION", "ENUM", "INPUT_OBJECT", "LIST", "NON_NULL", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class __TypeKind {
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.__TypeKind[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.__TypeKind.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.__TypeKind ENUM;
    public static final com.paypal.oslo.api.graphql.schema.type.__TypeKind INPUT_OBJECT;
    public static final com.paypal.oslo.api.graphql.schema.type.__TypeKind INTERFACE;
    public static final com.paypal.oslo.api.graphql.schema.type.__TypeKind LIST;
    public static final com.paypal.oslo.api.graphql.schema.type.__TypeKind NON_NULL;
    public static final com.paypal.oslo.api.graphql.schema.type.__TypeKind OBJECT;
    public static final com.paypal.oslo.api.graphql.schema.type.__TypeKind SCALAR;
    public static final com.paypal.oslo.api.graphql.schema.type.__TypeKind UNION;
    public static final com.paypal.oslo.api.graphql.schema.type.__TypeKind UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private __TypeKind(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.__TypeKind __typekind = new com.paypal.oslo.api.graphql.schema.type.__TypeKind("SCALAR", 0, "SCALAR");
        SCALAR = __typekind;
        com.paypal.oslo.api.graphql.schema.type.__TypeKind __typekind2 = new com.paypal.oslo.api.graphql.schema.type.__TypeKind("OBJECT", 1, "OBJECT");
        OBJECT = __typekind2;
        com.paypal.oslo.api.graphql.schema.type.__TypeKind __typekind3 = new com.paypal.oslo.api.graphql.schema.type.__TypeKind("INTERFACE", 2, "INTERFACE");
        INTERFACE = __typekind3;
        com.paypal.oslo.api.graphql.schema.type.__TypeKind __typekind4 = new com.paypal.oslo.api.graphql.schema.type.__TypeKind("UNION", 3, "UNION");
        UNION = __typekind4;
        com.paypal.oslo.api.graphql.schema.type.__TypeKind __typekind5 = new com.paypal.oslo.api.graphql.schema.type.__TypeKind("ENUM", 4, "ENUM");
        ENUM = __typekind5;
        com.paypal.oslo.api.graphql.schema.type.__TypeKind __typekind6 = new com.paypal.oslo.api.graphql.schema.type.__TypeKind("INPUT_OBJECT", 5, "INPUT_OBJECT");
        INPUT_OBJECT = __typekind6;
        com.paypal.oslo.api.graphql.schema.type.__TypeKind __typekind7 = new com.paypal.oslo.api.graphql.schema.type.__TypeKind("LIST", 6, "LIST");
        LIST = __typekind7;
        com.paypal.oslo.api.graphql.schema.type.__TypeKind __typekind8 = new com.paypal.oslo.api.graphql.schema.type.__TypeKind("NON_NULL", 7, "NON_NULL");
        NON_NULL = __typekind8;
        com.paypal.oslo.api.graphql.schema.type.__TypeKind __typekind9 = new com.paypal.oslo.api.graphql.schema.type.__TypeKind("UNKNOWN__", 8, "UNKNOWN__");
        UNKNOWN__ = __typekind9;
        com.paypal.oslo.api.graphql.schema.type.__TypeKind[] __typekindArr = {__typekind, __typekind2, __typekind3, __typekind4, __typekind5, __typekind6, __typekind7, __typekind8, __typekind9};
        Camera2StreamConfigurationMap = __typekindArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(__typekindArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.__TypeKind.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("__TypeKind", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"SCALAR", "OBJECT", "INTERFACE", "UNION", "ENUM", "INPUT_OBJECT", "LIST", "NON_NULL"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/__TypeKind$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/__TypeKind;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/__TypeKind;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/__TypeKind;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.__TypeKind.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.__TypeKind> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.__TypeKind[]{com.paypal.oslo.api.graphql.schema.type.__TypeKind.SCALAR, com.paypal.oslo.api.graphql.schema.type.__TypeKind.OBJECT, com.paypal.oslo.api.graphql.schema.type.__TypeKind.INTERFACE, com.paypal.oslo.api.graphql.schema.type.__TypeKind.UNION, com.paypal.oslo.api.graphql.schema.type.__TypeKind.ENUM, com.paypal.oslo.api.graphql.schema.type.__TypeKind.INPUT_OBJECT, com.paypal.oslo.api.graphql.schema.type.__TypeKind.LIST, com.paypal.oslo.api.graphql.schema.type.__TypeKind.NON_NULL});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.__TypeKind[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.__TypeKind[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.__TypeKind[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.__TypeKind safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.__TypeKind.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.__TypeKind) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.__TypeKind __typekind = (com.paypal.oslo.api.graphql.schema.type.__TypeKind) obj;
            return __typekind == null ? com.paypal.oslo.api.graphql.schema.type.__TypeKind.UNKNOWN__ : __typekind;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.__TypeKind[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.__TypeKind[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.__TypeKind valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.__TypeKind) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.__TypeKind.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.__TypeKind> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
