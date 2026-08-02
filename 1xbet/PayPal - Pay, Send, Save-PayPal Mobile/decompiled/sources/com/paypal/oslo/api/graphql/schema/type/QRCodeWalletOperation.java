package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/QRCodeWalletOperation;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAY_NOW, "LOYALTY_SIGNUP", "MERCHANT_SIGNUP", "PAYMENT_PROVISIONING", "WEB_CHECKOUT", "CLOSE_BROWSER", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QRCodeWalletOperation {
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation CLOSE_BROWSER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation LOYALTY_SIGNUP;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation MERCHANT_SIGNUP;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation PAYMENT_PROVISIONING;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation PAY_NOW;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation WEB_CHECKOUT;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private QRCodeWalletOperation(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation qRCodeWalletOperation = new com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAY_NOW, 0, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAY_NOW);
        PAY_NOW = qRCodeWalletOperation;
        com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation qRCodeWalletOperation2 = new com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation("LOYALTY_SIGNUP", 1, "LOYALTY_SIGNUP");
        LOYALTY_SIGNUP = qRCodeWalletOperation2;
        com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation qRCodeWalletOperation3 = new com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation("MERCHANT_SIGNUP", 2, "MERCHANT_SIGNUP");
        MERCHANT_SIGNUP = qRCodeWalletOperation3;
        com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation qRCodeWalletOperation4 = new com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation("PAYMENT_PROVISIONING", 3, "PAYMENT_PROVISIONING");
        PAYMENT_PROVISIONING = qRCodeWalletOperation4;
        com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation qRCodeWalletOperation5 = new com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation("WEB_CHECKOUT", 4, "WEB_CHECKOUT");
        WEB_CHECKOUT = qRCodeWalletOperation5;
        com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation qRCodeWalletOperation6 = new com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation("CLOSE_BROWSER", 5, "CLOSE_BROWSER");
        CLOSE_BROWSER = qRCodeWalletOperation6;
        com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation qRCodeWalletOperation7 = new com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = qRCodeWalletOperation7;
        com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation[] qRCodeWalletOperationArr = {qRCodeWalletOperation, qRCodeWalletOperation2, qRCodeWalletOperation3, qRCodeWalletOperation4, qRCodeWalletOperation5, qRCodeWalletOperation6, qRCodeWalletOperation7};
        getHighSpeedVideoFpsRanges = qRCodeWalletOperationArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(qRCodeWalletOperationArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("QRCodeWalletOperation", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAY_NOW, "LOYALTY_SIGNUP", "MERCHANT_SIGNUP", "PAYMENT_PROVISIONING", "WEB_CHECKOUT", "CLOSE_BROWSER"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/QRCodeWalletOperation$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/QRCodeWalletOperation;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/QRCodeWalletOperation;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/QRCodeWalletOperation;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation[]{com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation.PAY_NOW, com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation.LOYALTY_SIGNUP, com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation.MERCHANT_SIGNUP, com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation.PAYMENT_PROVISIONING, com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation.WEB_CHECKOUT, com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation.CLOSE_BROWSER});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation qRCodeWalletOperation = (com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation) obj;
            return qRCodeWalletOperation == null ? com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation.UNKNOWN__ : qRCodeWalletOperation;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.QRCodeWalletOperation> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
