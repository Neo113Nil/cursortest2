package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InputDelimiter;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "COMMA", "SEMICOLON", "TAB", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InputDelimiter {
    public static final com.paypal.oslo.api.graphql.schema.type.InputDelimiter COMMA;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.InputDelimiter.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.InputDelimiter SEMICOLON;
    public static final com.paypal.oslo.api.graphql.schema.type.InputDelimiter TAB;
    public static final com.paypal.oslo.api.graphql.schema.type.InputDelimiter UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.InputDelimiter[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private InputDelimiter(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.InputDelimiter inputDelimiter = new com.paypal.oslo.api.graphql.schema.type.InputDelimiter("COMMA", 0, "COMMA");
        COMMA = inputDelimiter;
        com.paypal.oslo.api.graphql.schema.type.InputDelimiter inputDelimiter2 = new com.paypal.oslo.api.graphql.schema.type.InputDelimiter("SEMICOLON", 1, "SEMICOLON");
        SEMICOLON = inputDelimiter2;
        com.paypal.oslo.api.graphql.schema.type.InputDelimiter inputDelimiter3 = new com.paypal.oslo.api.graphql.schema.type.InputDelimiter("TAB", 2, "TAB");
        TAB = inputDelimiter3;
        com.paypal.oslo.api.graphql.schema.type.InputDelimiter inputDelimiter4 = new com.paypal.oslo.api.graphql.schema.type.InputDelimiter("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = inputDelimiter4;
        com.paypal.oslo.api.graphql.schema.type.InputDelimiter[] inputDelimiterArr = {inputDelimiter, inputDelimiter2, inputDelimiter3, inputDelimiter4};
        getHighSpeedVideoFpsRangesFor = inputDelimiterArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(inputDelimiterArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.InputDelimiter.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("InputDelimiter", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"COMMA", "SEMICOLON", "TAB"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InputDelimiter$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/InputDelimiter;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/InputDelimiter;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/InputDelimiter;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.InputDelimiter.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.InputDelimiter> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.InputDelimiter[]{com.paypal.oslo.api.graphql.schema.type.InputDelimiter.COMMA, com.paypal.oslo.api.graphql.schema.type.InputDelimiter.SEMICOLON, com.paypal.oslo.api.graphql.schema.type.InputDelimiter.TAB});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.InputDelimiter[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.InputDelimiter[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.InputDelimiter[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.InputDelimiter safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.InputDelimiter.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.InputDelimiter) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.InputDelimiter inputDelimiter = (com.paypal.oslo.api.graphql.schema.type.InputDelimiter) obj;
            return inputDelimiter == null ? com.paypal.oslo.api.graphql.schema.type.InputDelimiter.UNKNOWN__ : inputDelimiter;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.InputDelimiter[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.InputDelimiter[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.InputDelimiter valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.InputDelimiter) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.InputDelimiter.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.InputDelimiter> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
