package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "IN_TRANSIT", "OUT_FOR_DELIVERY", "DELIVERED", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "EXCEPTION", "INFORMATION_RECEIVED", "ATTEMPT_FAILED", "EXPIRED", "MANIFEST", "PICKED_UP", "PICKUP_MISSED", "READY_FOR_PICKUP", "UNDEFINED", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, "AMAZON_ORDER_CONFIRMATION", "AMAZON_SHIPMENT_CONFIRMATION", "AMAZON_OUT_FOR_DELIVERY", "AMAZON_DELIVERY_CONFIRMATION", "AMAZON_ORDER_CANCELLATION", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PackageTrackingStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus AMAZON_DELIVERY_CONFIRMATION;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus AMAZON_ORDER_CANCELLATION;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus AMAZON_ORDER_CONFIRMATION;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus AMAZON_OUT_FOR_DELIVERY;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus AMAZON_SHIPMENT_CONFIRMATION;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus ATTEMPT_FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus CANCELED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus DELIVERED;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus EXCEPTION;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus EXPIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus INFORMATION_RECEIVED;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus IN_TRANSIT;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus MANIFEST;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus OUT_FOR_DELIVERY;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus PENDING;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus PICKED_UP;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus PICKUP_MISSED;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus READY_FOR_PICKUP;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus UNDEFINED;
    public static final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus[] getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private PackageTrackingStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("IN_TRANSIT", 0, "IN_TRANSIT");
        IN_TRANSIT = packageTrackingStatus;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus2 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("OUT_FOR_DELIVERY", 1, "OUT_FOR_DELIVERY");
        OUT_FOR_DELIVERY = packageTrackingStatus2;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus3 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("DELIVERED", 2, "DELIVERED");
        DELIVERED = packageTrackingStatus3;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus4 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 3, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS);
        PENDING = packageTrackingStatus4;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus5 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("EXCEPTION", 4, "EXCEPTION");
        EXCEPTION = packageTrackingStatus5;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus6 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("INFORMATION_RECEIVED", 5, "INFORMATION_RECEIVED");
        INFORMATION_RECEIVED = packageTrackingStatus6;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus7 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("ATTEMPT_FAILED", 6, "ATTEMPT_FAILED");
        ATTEMPT_FAILED = packageTrackingStatus7;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus8 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("EXPIRED", 7, "EXPIRED");
        EXPIRED = packageTrackingStatus8;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus9 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("MANIFEST", 8, "MANIFEST");
        MANIFEST = packageTrackingStatus9;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus10 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("PICKED_UP", 9, "PICKED_UP");
        PICKED_UP = packageTrackingStatus10;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus11 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("PICKUP_MISSED", 10, "PICKUP_MISSED");
        PICKUP_MISSED = packageTrackingStatus11;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus12 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("READY_FOR_PICKUP", 11, "READY_FOR_PICKUP");
        READY_FOR_PICKUP = packageTrackingStatus12;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus13 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("UNDEFINED", 12, "UNDEFINED");
        UNDEFINED = packageTrackingStatus13;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus14 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, 13, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS);
        CANCELED = packageTrackingStatus14;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus15 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("AMAZON_ORDER_CONFIRMATION", 14, "AMAZON_ORDER_CONFIRMATION");
        AMAZON_ORDER_CONFIRMATION = packageTrackingStatus15;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus16 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("AMAZON_SHIPMENT_CONFIRMATION", 15, "AMAZON_SHIPMENT_CONFIRMATION");
        AMAZON_SHIPMENT_CONFIRMATION = packageTrackingStatus16;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus17 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("AMAZON_OUT_FOR_DELIVERY", 16, "AMAZON_OUT_FOR_DELIVERY");
        AMAZON_OUT_FOR_DELIVERY = packageTrackingStatus17;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus18 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("AMAZON_DELIVERY_CONFIRMATION", 17, "AMAZON_DELIVERY_CONFIRMATION");
        AMAZON_DELIVERY_CONFIRMATION = packageTrackingStatus18;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus19 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("AMAZON_ORDER_CANCELLATION", 18, "AMAZON_ORDER_CANCELLATION");
        AMAZON_ORDER_CANCELLATION = packageTrackingStatus19;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus20 = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus("UNKNOWN__", 19, "UNKNOWN__");
        UNKNOWN__ = packageTrackingStatus20;
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus[] packageTrackingStatusArr = {packageTrackingStatus, packageTrackingStatus2, packageTrackingStatus3, packageTrackingStatus4, packageTrackingStatus5, packageTrackingStatus6, packageTrackingStatus7, packageTrackingStatus8, packageTrackingStatus9, packageTrackingStatus10, packageTrackingStatus11, packageTrackingStatus12, packageTrackingStatus13, packageTrackingStatus14, packageTrackingStatus15, packageTrackingStatus16, packageTrackingStatus17, packageTrackingStatus18, packageTrackingStatus19, packageTrackingStatus20};
        getHighSpeedVideoFpsRanges = packageTrackingStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(packageTrackingStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("PackageTrackingStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"IN_TRANSIT", "OUT_FOR_DELIVERY", "DELIVERED", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "EXCEPTION", "INFORMATION_RECEIVED", "ATTEMPT_FAILED", "EXPIRED", "MANIFEST", "PICKED_UP", "PICKUP_MISSED", "READY_FOR_PICKUP", "UNDEFINED", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, "AMAZON_ORDER_CONFIRMATION", "AMAZON_SHIPMENT_CONFIRMATION", "AMAZON_OUT_FOR_DELIVERY", "AMAZON_DELIVERY_CONFIRMATION", "AMAZON_ORDER_CANCELLATION"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus[]{com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.IN_TRANSIT, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.OUT_FOR_DELIVERY, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.DELIVERED, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.PENDING, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.EXCEPTION, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.INFORMATION_RECEIVED, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.ATTEMPT_FAILED, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.EXPIRED, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.MANIFEST, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.PICKED_UP, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.PICKUP_MISSED, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.READY_FOR_PICKUP, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.UNDEFINED, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.CANCELED, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.AMAZON_ORDER_CONFIRMATION, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.AMAZON_SHIPMENT_CONFIRMATION, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.AMAZON_OUT_FOR_DELIVERY, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.AMAZON_DELIVERY_CONFIRMATION, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.AMAZON_ORDER_CANCELLATION});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus packageTrackingStatus = (com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus) obj;
            return packageTrackingStatus == null ? com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.UNKNOWN__ : packageTrackingStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
