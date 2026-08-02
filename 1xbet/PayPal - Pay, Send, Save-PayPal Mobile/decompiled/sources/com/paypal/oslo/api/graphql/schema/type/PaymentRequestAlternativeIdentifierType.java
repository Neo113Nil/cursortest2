package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestAlternativeIdentifierType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "PAYMENT_CODE", "PAYMENT_REQUEST_ID", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentRequestAlternativeIdentifierType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType PAYMENT_CODE;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType PAYMENT_REQUEST_ID;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private PaymentRequestAlternativeIdentifierType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType paymentRequestAlternativeIdentifierType = new com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType("PAYMENT_CODE", 0, "PAYMENT_CODE");
        PAYMENT_CODE = paymentRequestAlternativeIdentifierType;
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType paymentRequestAlternativeIdentifierType2 = new com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType("PAYMENT_REQUEST_ID", 1, "PAYMENT_REQUEST_ID");
        PAYMENT_REQUEST_ID = paymentRequestAlternativeIdentifierType2;
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType paymentRequestAlternativeIdentifierType3 = new com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = paymentRequestAlternativeIdentifierType3;
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType[] paymentRequestAlternativeIdentifierTypeArr = {paymentRequestAlternativeIdentifierType, paymentRequestAlternativeIdentifierType2, paymentRequestAlternativeIdentifierType3};
        getHighSpeedVideoSizes = paymentRequestAlternativeIdentifierTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(paymentRequestAlternativeIdentifierTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("PaymentRequestAlternativeIdentifierType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PAYMENT_CODE", "PAYMENT_REQUEST_ID"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestAlternativeIdentifierType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestAlternativeIdentifierType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestAlternativeIdentifierType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestAlternativeIdentifierType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType[]{com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType.PAYMENT_CODE, com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType.PAYMENT_REQUEST_ID});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType paymentRequestAlternativeIdentifierType = (com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType) obj;
            return paymentRequestAlternativeIdentifierType == null ? com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType.UNKNOWN__ : paymentRequestAlternativeIdentifierType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.PaymentRequestAlternativeIdentifierType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
