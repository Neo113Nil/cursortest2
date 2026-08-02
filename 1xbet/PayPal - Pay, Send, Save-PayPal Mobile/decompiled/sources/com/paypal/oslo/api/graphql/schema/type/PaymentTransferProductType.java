package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferProductType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "TRANSFER", "POOL", "SPLIT", "XOOM_REMITTANCE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentTransferProductType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType POOL;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType SPLIT;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType TRANSFER;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType XOOM_REMITTANCE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private PaymentTransferProductType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType paymentTransferProductType = new com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType("TRANSFER", 0, "TRANSFER");
        TRANSFER = paymentTransferProductType;
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType paymentTransferProductType2 = new com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType("POOL", 1, "POOL");
        POOL = paymentTransferProductType2;
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType paymentTransferProductType3 = new com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType("SPLIT", 2, "SPLIT");
        SPLIT = paymentTransferProductType3;
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType paymentTransferProductType4 = new com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType("XOOM_REMITTANCE", 3, "XOOM_REMITTANCE");
        XOOM_REMITTANCE = paymentTransferProductType4;
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType paymentTransferProductType5 = new com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = paymentTransferProductType5;
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType[] paymentTransferProductTypeArr = {paymentTransferProductType, paymentTransferProductType2, paymentTransferProductType3, paymentTransferProductType4, paymentTransferProductType5};
        getHighSpeedVideoSizes = paymentTransferProductTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(paymentTransferProductTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("PaymentTransferProductType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"TRANSFER", "POOL", "SPLIT", "XOOM_REMITTANCE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferProductType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferProductType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferProductType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferProductType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType[]{com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType.TRANSFER, com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType.POOL, com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType.SPLIT, com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType.XOOM_REMITTANCE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType paymentTransferProductType = (com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType) obj;
            return paymentTransferProductType == null ? com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType.UNKNOWN__ : paymentTransferProductType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.PaymentTransferProductType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
