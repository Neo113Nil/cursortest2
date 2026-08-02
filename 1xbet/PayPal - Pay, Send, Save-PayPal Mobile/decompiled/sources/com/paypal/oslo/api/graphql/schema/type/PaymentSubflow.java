package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentSubflow;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "PAY_REQUEST", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SEND_AGAIN, "QR_CODE_SCAN", "GROUP_CONTRIBUTION", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentSubflow {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentSubflow.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentSubflow GROUP_CONTRIBUTION;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentSubflow PAY_REQUEST;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentSubflow QR_CODE_SCAN;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentSubflow SEND_AGAIN;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentSubflow UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PaymentSubflow[] getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private PaymentSubflow(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.PaymentSubflow paymentSubflow = new com.paypal.oslo.api.graphql.schema.type.PaymentSubflow("PAY_REQUEST", 0, "PAY_REQUEST");
        PAY_REQUEST = paymentSubflow;
        com.paypal.oslo.api.graphql.schema.type.PaymentSubflow paymentSubflow2 = new com.paypal.oslo.api.graphql.schema.type.PaymentSubflow(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SEND_AGAIN, 1, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SEND_AGAIN);
        SEND_AGAIN = paymentSubflow2;
        com.paypal.oslo.api.graphql.schema.type.PaymentSubflow paymentSubflow3 = new com.paypal.oslo.api.graphql.schema.type.PaymentSubflow("QR_CODE_SCAN", 2, "QR_CODE_SCAN");
        QR_CODE_SCAN = paymentSubflow3;
        com.paypal.oslo.api.graphql.schema.type.PaymentSubflow paymentSubflow4 = new com.paypal.oslo.api.graphql.schema.type.PaymentSubflow("GROUP_CONTRIBUTION", 3, "GROUP_CONTRIBUTION");
        GROUP_CONTRIBUTION = paymentSubflow4;
        com.paypal.oslo.api.graphql.schema.type.PaymentSubflow paymentSubflow5 = new com.paypal.oslo.api.graphql.schema.type.PaymentSubflow("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = paymentSubflow5;
        com.paypal.oslo.api.graphql.schema.type.PaymentSubflow[] paymentSubflowArr = {paymentSubflow, paymentSubflow2, paymentSubflow3, paymentSubflow4, paymentSubflow5};
        getHighSpeedVideoFpsRanges = paymentSubflowArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(paymentSubflowArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.PaymentSubflow.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("PaymentSubflow", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PAY_REQUEST", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SEND_AGAIN, "QR_CODE_SCAN", "GROUP_CONTRIBUTION"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentSubflow$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentSubflow;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/PaymentSubflow;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/PaymentSubflow;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.PaymentSubflow.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentSubflow> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.PaymentSubflow[]{com.paypal.oslo.api.graphql.schema.type.PaymentSubflow.PAY_REQUEST, com.paypal.oslo.api.graphql.schema.type.PaymentSubflow.SEND_AGAIN, com.paypal.oslo.api.graphql.schema.type.PaymentSubflow.QR_CODE_SCAN, com.paypal.oslo.api.graphql.schema.type.PaymentSubflow.GROUP_CONTRIBUTION});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.PaymentSubflow[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.PaymentSubflow[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.PaymentSubflow[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentSubflow safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.PaymentSubflow.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.PaymentSubflow) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.PaymentSubflow paymentSubflow = (com.paypal.oslo.api.graphql.schema.type.PaymentSubflow) obj;
            return paymentSubflow == null ? com.paypal.oslo.api.graphql.schema.type.PaymentSubflow.UNKNOWN__ : paymentSubflow;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.PaymentSubflow[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.PaymentSubflow[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.PaymentSubflow valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.PaymentSubflow) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.PaymentSubflow.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.PaymentSubflow> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
