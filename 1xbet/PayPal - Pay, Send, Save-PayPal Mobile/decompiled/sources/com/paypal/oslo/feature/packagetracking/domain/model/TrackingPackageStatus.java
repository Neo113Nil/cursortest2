package com.paypal.oslo.feature.packagetracking.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/TrackingPackageStatus;", "", "<init>", "(Ljava/lang/String;I)V", "IN_TRANSIT", "OUT_FOR_DELIVERY", "DELIVERED", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "EXCEPTION", "INFORMATION_RECEIVED", "ATTEMPT_FAILED", "EXPIRED", "MANIFEST", "PICKED_UP", "PICKUP_MISSED", "READY_FOR_PICKUP", "UNDEFINED", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, "AMAZON_ORDER_CONFIRMATION", "AMAZON_SHIPMENT_CONFIRMATION", "AMAZON_OUT_FOR_DELIVERY", "AMAZON_DELIVERY_CONFIRMATION", "AMAZON_ORDER_CANCELLATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TrackingPackageStatus {
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus AMAZON_DELIVERY_CONFIRMATION;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus AMAZON_ORDER_CANCELLATION;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus AMAZON_ORDER_CONFIRMATION;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus AMAZON_OUT_FOR_DELIVERY;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus AMAZON_SHIPMENT_CONFIRMATION;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus ATTEMPT_FAILED;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus CANCELED;
    private static final /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus DELIVERED;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus EXCEPTION;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus EXPIRED;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus INFORMATION_RECEIVED;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus IN_TRANSIT;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus MANIFEST;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus OUT_FOR_DELIVERY;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus PENDING;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus PICKED_UP;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus PICKUP_MISSED;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus READY_FOR_PICKUP;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus UNDEFINED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private TrackingPackageStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("IN_TRANSIT", 0);
        IN_TRANSIT = trackingPackageStatus;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus2 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("OUT_FOR_DELIVERY", 1);
        OUT_FOR_DELIVERY = trackingPackageStatus2;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus3 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("DELIVERED", 2);
        DELIVERED = trackingPackageStatus3;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus4 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 3);
        PENDING = trackingPackageStatus4;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus5 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("EXCEPTION", 4);
        EXCEPTION = trackingPackageStatus5;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus6 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("INFORMATION_RECEIVED", 5);
        INFORMATION_RECEIVED = trackingPackageStatus6;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus7 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("ATTEMPT_FAILED", 6);
        ATTEMPT_FAILED = trackingPackageStatus7;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus8 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("EXPIRED", 7);
        EXPIRED = trackingPackageStatus8;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus9 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("MANIFEST", 8);
        MANIFEST = trackingPackageStatus9;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus10 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("PICKED_UP", 9);
        PICKED_UP = trackingPackageStatus10;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus11 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("PICKUP_MISSED", 10);
        PICKUP_MISSED = trackingPackageStatus11;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus12 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("READY_FOR_PICKUP", 11);
        READY_FOR_PICKUP = trackingPackageStatus12;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus13 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("UNDEFINED", 12);
        UNDEFINED = trackingPackageStatus13;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus14 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, 13);
        CANCELED = trackingPackageStatus14;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus15 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("AMAZON_ORDER_CONFIRMATION", 14);
        AMAZON_ORDER_CONFIRMATION = trackingPackageStatus15;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus16 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("AMAZON_SHIPMENT_CONFIRMATION", 15);
        AMAZON_SHIPMENT_CONFIRMATION = trackingPackageStatus16;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus17 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("AMAZON_OUT_FOR_DELIVERY", 16);
        AMAZON_OUT_FOR_DELIVERY = trackingPackageStatus17;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus18 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("AMAZON_DELIVERY_CONFIRMATION", 17);
        AMAZON_DELIVERY_CONFIRMATION = trackingPackageStatus18;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus trackingPackageStatus19 = new com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus("AMAZON_ORDER_CANCELLATION", 18);
        AMAZON_ORDER_CANCELLATION = trackingPackageStatus19;
        com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus[] trackingPackageStatusArr = {trackingPackageStatus, trackingPackageStatus2, trackingPackageStatus3, trackingPackageStatus4, trackingPackageStatus5, trackingPackageStatus6, trackingPackageStatus7, trackingPackageStatus8, trackingPackageStatus9, trackingPackageStatus10, trackingPackageStatus11, trackingPackageStatus12, trackingPackageStatus13, trackingPackageStatus14, trackingPackageStatus15, trackingPackageStatus16, trackingPackageStatus17, trackingPackageStatus18, trackingPackageStatus19};
        Camera2StreamConfigurationMap = trackingPackageStatusArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(trackingPackageStatusArr);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus[] values() {
        return (com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
