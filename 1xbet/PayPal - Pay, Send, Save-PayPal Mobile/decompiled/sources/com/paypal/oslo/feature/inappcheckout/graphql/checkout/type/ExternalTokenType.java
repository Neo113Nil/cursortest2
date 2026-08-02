package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalTokenType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ORDER_ID", "VAULT_ID", "CHECKOUT_TOKEN", "BILLING_TOKEN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalTokenType {
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType BILLING_TOKEN;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType CHECKOUT_TOKEN;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType ORDER_ID;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType UNKNOWN__;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType VAULT_ID;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ExternalTokenType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType externalTokenType = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType("ORDER_ID", 0, "ORDER_ID");
        ORDER_ID = externalTokenType;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType externalTokenType2 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType("VAULT_ID", 1, "VAULT_ID");
        VAULT_ID = externalTokenType2;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType externalTokenType3 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType("CHECKOUT_TOKEN", 2, "CHECKOUT_TOKEN");
        CHECKOUT_TOKEN = externalTokenType3;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType externalTokenType4 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType("BILLING_TOKEN", 3, "BILLING_TOKEN");
        BILLING_TOKEN = externalTokenType4;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType externalTokenType5 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = externalTokenType5;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType[] externalTokenTypeArr = {externalTokenType, externalTokenType2, externalTokenType3, externalTokenType4, externalTokenType5};
        getHighSpeedVideoFpsRanges = externalTokenTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(externalTokenTypeArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("externalTokenType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ORDER_ID", "VAULT_ID", "CHECKOUT_TOKEN", "BILLING_TOKEN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalTokenType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalTokenType;", "knownValues", "()[Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalTokenType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalTokenType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType.type;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType[]{com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType.ORDER_ID, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType.VAULT_ID, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType.CHECKOUT_TOKEN, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType.BILLING_TOKEN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType[] knownValues() {
            return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType[]) getKnownEntries().toArray(new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType[0]);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType externalTokenType = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType) obj;
            return externalTokenType == null ? com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType.UNKNOWN__ : externalTokenType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
