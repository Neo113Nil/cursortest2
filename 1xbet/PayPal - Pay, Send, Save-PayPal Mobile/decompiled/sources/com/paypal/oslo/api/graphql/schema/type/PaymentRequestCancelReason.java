package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestCancelReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CUSTOMER_CANCELED", "CUSTOMER_REPORTED_SPAM", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentRequestCancelReason {
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason CUSTOMER_CANCELED;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason CUSTOMER_REPORTED_SPAM;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private PaymentRequestCancelReason(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason paymentRequestCancelReason = new com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason("CUSTOMER_CANCELED", 0, "CUSTOMER_CANCELED");
        CUSTOMER_CANCELED = paymentRequestCancelReason;
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason paymentRequestCancelReason2 = new com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason("CUSTOMER_REPORTED_SPAM", 1, "CUSTOMER_REPORTED_SPAM");
        CUSTOMER_REPORTED_SPAM = paymentRequestCancelReason2;
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason paymentRequestCancelReason3 = new com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = paymentRequestCancelReason3;
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason[] paymentRequestCancelReasonArr = {paymentRequestCancelReason, paymentRequestCancelReason2, paymentRequestCancelReason3};
        getHighSpeedVideoSizes = paymentRequestCancelReasonArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(paymentRequestCancelReasonArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("PaymentRequestCancelReason", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CUSTOMER_CANCELED", "CUSTOMER_REPORTED_SPAM"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestCancelReason$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestCancelReason;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestCancelReason;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestCancelReason;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason[]{com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason.CUSTOMER_CANCELED, com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason.CUSTOMER_REPORTED_SPAM});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason paymentRequestCancelReason = (com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason) obj;
            return paymentRequestCancelReason == null ? com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason.UNKNOWN__ : paymentRequestCancelReason;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.PaymentRequestCancelReason> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
