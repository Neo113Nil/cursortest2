package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/alerts/TrackingType;", "", "<init>", "(Ljava/lang/String;I)V", "CLICK", "DISMISS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TrackingType {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.TrackingType CLICK;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.TrackingType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.TrackingType DISMISS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private TrackingType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.TrackingType trackingType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.TrackingType("CLICK", 0);
        CLICK = trackingType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.TrackingType trackingType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.TrackingType("DISMISS", 1);
        DISMISS = trackingType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.TrackingType[] trackingTypeArr = {trackingType, trackingType2};
        Camera2StreamConfigurationMap = trackingTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(trackingTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.TrackingType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.TrackingType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.TrackingType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.TrackingType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.TrackingType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.TrackingType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
