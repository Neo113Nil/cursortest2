package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/QRCodeSessionActionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, "PAYMENT_RESULT", "ENROLLMENT_REQUIRED", "PAYMENT_PULL", "PAYMENT_PUSH", "VALIDATION_ERROR", "REDIRECT", "CONSUMER_COUNTRY_MISMATCH", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QRCodeSessionActionType {
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType CONSUMER_COUNTRY_MISMATCH;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType ENROLLMENT_REQUIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType PAYMENT_PULL;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType PAYMENT_PUSH;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType PAYMENT_RESULT;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType REDIRECT;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType VALIDATION_ERROR;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private QRCodeSessionActionType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType qRCodeSessionActionType = new com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, 0, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT);
        PAYMENT = qRCodeSessionActionType;
        com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType qRCodeSessionActionType2 = new com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType("PAYMENT_RESULT", 1, "PAYMENT_RESULT");
        PAYMENT_RESULT = qRCodeSessionActionType2;
        com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType qRCodeSessionActionType3 = new com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType("ENROLLMENT_REQUIRED", 2, "ENROLLMENT_REQUIRED");
        ENROLLMENT_REQUIRED = qRCodeSessionActionType3;
        com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType qRCodeSessionActionType4 = new com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType("PAYMENT_PULL", 3, "PAYMENT_PULL");
        PAYMENT_PULL = qRCodeSessionActionType4;
        com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType qRCodeSessionActionType5 = new com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType("PAYMENT_PUSH", 4, "PAYMENT_PUSH");
        PAYMENT_PUSH = qRCodeSessionActionType5;
        com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType qRCodeSessionActionType6 = new com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType("VALIDATION_ERROR", 5, "VALIDATION_ERROR");
        VALIDATION_ERROR = qRCodeSessionActionType6;
        com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType qRCodeSessionActionType7 = new com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType("REDIRECT", 6, "REDIRECT");
        REDIRECT = qRCodeSessionActionType7;
        com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType qRCodeSessionActionType8 = new com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType("CONSUMER_COUNTRY_MISMATCH", 7, "CONSUMER_COUNTRY_MISMATCH");
        CONSUMER_COUNTRY_MISMATCH = qRCodeSessionActionType8;
        com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType qRCodeSessionActionType9 = new com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType("UNKNOWN__", 8, "UNKNOWN__");
        UNKNOWN__ = qRCodeSessionActionType9;
        com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType[] qRCodeSessionActionTypeArr = {qRCodeSessionActionType, qRCodeSessionActionType2, qRCodeSessionActionType3, qRCodeSessionActionType4, qRCodeSessionActionType5, qRCodeSessionActionType6, qRCodeSessionActionType7, qRCodeSessionActionType8, qRCodeSessionActionType9};
        getHighSpeedVideoSizes = qRCodeSessionActionTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(qRCodeSessionActionTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("QRCodeSessionActionType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, "PAYMENT_RESULT", "ENROLLMENT_REQUIRED", "PAYMENT_PULL", "PAYMENT_PUSH", "VALIDATION_ERROR", "REDIRECT", "CONSUMER_COUNTRY_MISMATCH"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/QRCodeSessionActionType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/QRCodeSessionActionType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/QRCodeSessionActionType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/QRCodeSessionActionType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType[]{com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType.PAYMENT, com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType.PAYMENT_RESULT, com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType.ENROLLMENT_REQUIRED, com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType.PAYMENT_PULL, com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType.PAYMENT_PUSH, com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType.VALIDATION_ERROR, com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType.REDIRECT, com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType.CONSUMER_COUNTRY_MISMATCH});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType qRCodeSessionActionType = (com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType) obj;
            return qRCodeSessionActionType == null ? com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType.UNKNOWN__ : qRCodeSessionActionType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.QRCodeSessionActionType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
