package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankProductFlow;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "WALLET", "P2P", "GML", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, "CHECKOUT", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BankProductFlow {
    public static final com.paypal.oslo.api.graphql.schema.type.BankProductFlow CHECKOUT;
    public static final com.paypal.oslo.api.graphql.schema.type.BankProductFlow CRYPTO;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.BankProductFlow.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.BankProductFlow GML;
    public static final com.paypal.oslo.api.graphql.schema.type.BankProductFlow P2P;
    public static final com.paypal.oslo.api.graphql.schema.type.BankProductFlow UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.BankProductFlow WALLET;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BankProductFlow[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private BankProductFlow(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.BankProductFlow bankProductFlow = new com.paypal.oslo.api.graphql.schema.type.BankProductFlow("WALLET", 0, "WALLET");
        WALLET = bankProductFlow;
        com.paypal.oslo.api.graphql.schema.type.BankProductFlow bankProductFlow2 = new com.paypal.oslo.api.graphql.schema.type.BankProductFlow("P2P", 1, "P2P");
        P2P = bankProductFlow2;
        com.paypal.oslo.api.graphql.schema.type.BankProductFlow bankProductFlow3 = new com.paypal.oslo.api.graphql.schema.type.BankProductFlow("GML", 2, "GML");
        GML = bankProductFlow3;
        com.paypal.oslo.api.graphql.schema.type.BankProductFlow bankProductFlow4 = new com.paypal.oslo.api.graphql.schema.type.BankProductFlow(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, 3, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO);
        CRYPTO = bankProductFlow4;
        com.paypal.oslo.api.graphql.schema.type.BankProductFlow bankProductFlow5 = new com.paypal.oslo.api.graphql.schema.type.BankProductFlow("CHECKOUT", 4, "CHECKOUT");
        CHECKOUT = bankProductFlow5;
        com.paypal.oslo.api.graphql.schema.type.BankProductFlow bankProductFlow6 = new com.paypal.oslo.api.graphql.schema.type.BankProductFlow("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = bankProductFlow6;
        com.paypal.oslo.api.graphql.schema.type.BankProductFlow[] bankProductFlowArr = {bankProductFlow, bankProductFlow2, bankProductFlow3, bankProductFlow4, bankProductFlow5, bankProductFlow6};
        getHighSpeedVideoFpsRangesFor = bankProductFlowArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(bankProductFlowArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.BankProductFlow.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("BankProductFlow", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"WALLET", "P2P", "GML", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, "CHECKOUT"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankProductFlow$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/BankProductFlow;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/BankProductFlow;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/BankProductFlow;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.BankProductFlow.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BankProductFlow> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.BankProductFlow[]{com.paypal.oslo.api.graphql.schema.type.BankProductFlow.WALLET, com.paypal.oslo.api.graphql.schema.type.BankProductFlow.P2P, com.paypal.oslo.api.graphql.schema.type.BankProductFlow.GML, com.paypal.oslo.api.graphql.schema.type.BankProductFlow.CRYPTO, com.paypal.oslo.api.graphql.schema.type.BankProductFlow.CHECKOUT});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.BankProductFlow[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.BankProductFlow[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.BankProductFlow[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankProductFlow safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.BankProductFlow.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.BankProductFlow) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.BankProductFlow bankProductFlow = (com.paypal.oslo.api.graphql.schema.type.BankProductFlow) obj;
            return bankProductFlow == null ? com.paypal.oslo.api.graphql.schema.type.BankProductFlow.UNKNOWN__ : bankProductFlow;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.BankProductFlow[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.BankProductFlow[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.BankProductFlow valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.BankProductFlow) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.BankProductFlow.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.BankProductFlow> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
