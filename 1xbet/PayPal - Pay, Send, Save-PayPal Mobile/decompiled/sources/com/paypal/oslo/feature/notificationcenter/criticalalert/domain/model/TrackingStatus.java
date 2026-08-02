package com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/criticalalert/domain/model/TrackingStatus;", "", "<init>", "(Ljava/lang/String;I)V", "IMPRESSED", "CLICKED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TrackingStatus {
    public static final com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus CLICKED;
    public static final com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus IMPRESSED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus[] getHighSpeedVideoSizes;

    static {
        com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus trackingStatus = new com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus("IMPRESSED", 0);
        IMPRESSED = trackingStatus;
        com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus trackingStatus2 = new com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus("CLICKED", 1);
        CLICKED = trackingStatus2;
        com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus[] trackingStatusArr = {trackingStatus, trackingStatus2};
        getHighSpeedVideoSizes = trackingStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(trackingStatusArr);
    }

    private TrackingStatus(java.lang.String str, int i) {
    }

    public static com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus[] values() {
        return (com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
