package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountDispositionMethod;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ACH", "CHECK", "WIRE_TRANSFER", "DONATE", "CARD", "BALANCE_HOLD", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CloseAccountDispositionMethod {
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod ACH;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod BALANCE_HOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod CHECK;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod DONATE;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod WIRE_TRANSFER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CloseAccountDispositionMethod(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod closeAccountDispositionMethod = new com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod("ACH", 0, "ACH");
        ACH = closeAccountDispositionMethod;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod closeAccountDispositionMethod2 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod("CHECK", 1, "CHECK");
        CHECK = closeAccountDispositionMethod2;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod closeAccountDispositionMethod3 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod("WIRE_TRANSFER", 2, "WIRE_TRANSFER");
        WIRE_TRANSFER = closeAccountDispositionMethod3;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod closeAccountDispositionMethod4 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod("DONATE", 3, "DONATE");
        DONATE = closeAccountDispositionMethod4;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod closeAccountDispositionMethod5 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod("CARD", 4, "CARD");
        CARD = closeAccountDispositionMethod5;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod closeAccountDispositionMethod6 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod("BALANCE_HOLD", 5, "BALANCE_HOLD");
        BALANCE_HOLD = closeAccountDispositionMethod6;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod closeAccountDispositionMethod7 = new com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = closeAccountDispositionMethod7;
        com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod[] closeAccountDispositionMethodArr = {closeAccountDispositionMethod, closeAccountDispositionMethod2, closeAccountDispositionMethod3, closeAccountDispositionMethod4, closeAccountDispositionMethod5, closeAccountDispositionMethod6, closeAccountDispositionMethod7};
        getHighSpeedVideoSizes = closeAccountDispositionMethodArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(closeAccountDispositionMethodArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CloseAccountDispositionMethod", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ACH", "CHECK", "WIRE_TRANSFER", "DONATE", "CARD", "BALANCE_HOLD"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountDispositionMethod$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountDispositionMethod;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountDispositionMethod;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountDispositionMethod;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod[]{com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod.ACH, com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod.CHECK, com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod.WIRE_TRANSFER, com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod.DONATE, com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod.CARD, com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod.BALANCE_HOLD});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod closeAccountDispositionMethod = (com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod) obj;
            return closeAccountDispositionMethod == null ? com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod.UNKNOWN__ : closeAccountDispositionMethod;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CloseAccountDispositionMethod> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
