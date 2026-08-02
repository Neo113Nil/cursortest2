package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AgenticCardAvatarSize;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "EXTRA_SMALL", "SMALL", "MEDIUM", "LARGE", "EXTRA_LARGE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AgenticCardAvatarSize {
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize EXTRA_LARGE;
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize EXTRA_SMALL;
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize LARGE;
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize MEDIUM;
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize SMALL;
    public static final com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private AgenticCardAvatarSize(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize agenticCardAvatarSize = new com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize("EXTRA_SMALL", 0, "EXTRA_SMALL");
        EXTRA_SMALL = agenticCardAvatarSize;
        com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize agenticCardAvatarSize2 = new com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize("SMALL", 1, "SMALL");
        SMALL = agenticCardAvatarSize2;
        com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize agenticCardAvatarSize3 = new com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize("MEDIUM", 2, "MEDIUM");
        MEDIUM = agenticCardAvatarSize3;
        com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize agenticCardAvatarSize4 = new com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize("LARGE", 3, "LARGE");
        LARGE = agenticCardAvatarSize4;
        com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize agenticCardAvatarSize5 = new com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize("EXTRA_LARGE", 4, "EXTRA_LARGE");
        EXTRA_LARGE = agenticCardAvatarSize5;
        com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize agenticCardAvatarSize6 = new com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = agenticCardAvatarSize6;
        com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize[] agenticCardAvatarSizeArr = {agenticCardAvatarSize, agenticCardAvatarSize2, agenticCardAvatarSize3, agenticCardAvatarSize4, agenticCardAvatarSize5, agenticCardAvatarSize6};
        Camera2StreamConfigurationMap = agenticCardAvatarSizeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(agenticCardAvatarSizeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("AgenticCardAvatarSize", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"EXTRA_SMALL", "SMALL", "MEDIUM", "LARGE", "EXTRA_LARGE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AgenticCardAvatarSize$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/AgenticCardAvatarSize;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/AgenticCardAvatarSize;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/AgenticCardAvatarSize;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize[]{com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize.EXTRA_SMALL, com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize.SMALL, com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize.MEDIUM, com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize.LARGE, com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize.EXTRA_LARGE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize agenticCardAvatarSize = (com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize) obj;
            return agenticCardAvatarSize == null ? com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize.UNKNOWN__ : agenticCardAvatarSize;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.AgenticCardAvatarSize> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
