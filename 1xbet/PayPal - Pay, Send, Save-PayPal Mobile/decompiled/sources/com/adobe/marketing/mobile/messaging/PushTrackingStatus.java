package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
public enum PushTrackingStatus {
    TRACKING_INITIATED(0, "Tracking initiated"),
    NO_DATASET_CONFIGURED(1, "No dataset configured"),
    NO_TRACKING_DATA(2, "Missing tracking data in the intent"),
    INVALID_INTENT(3, "Provided intent for tracking is invalid"),
    INVALID_MESSAGE_ID(4, "Provided MessageId for tracking is empty/null"),
    UNKNOWN_ERROR(5, com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR);

    final int getHighSpeedVideoFpsRanges;
    final java.lang.String getHighSpeedVideoSizes;

    PushTrackingStatus(int i, java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizes = str;
    }

    public final java.lang.String getDescription() {
        return this.getHighSpeedVideoSizes;
    }

    public final int getValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static com.adobe.marketing.mobile.messaging.PushTrackingStatus fromInt(int i) {
        for (com.adobe.marketing.mobile.messaging.PushTrackingStatus pushTrackingStatus : values()) {
            if (pushTrackingStatus.getHighSpeedVideoFpsRanges == i) {
                return pushTrackingStatus;
            }
        }
        return UNKNOWN_ERROR;
    }
}
