package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
public enum MobilePrivacyStatus {
    OPT_IN("optedin"),
    OPT_OUT("optedout"),
    UNKNOWN("optunknown");

    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    MobilePrivacyStatus(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public final java.lang.String getValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static com.adobe.marketing.mobile.MobilePrivacyStatus fromString(java.lang.String str) {
        for (com.adobe.marketing.mobile.MobilePrivacyStatus mobilePrivacyStatus : values()) {
            if (mobilePrivacyStatus.getHighSpeedVideoFpsRangesFor.equalsIgnoreCase(str)) {
                return mobilePrivacyStatus;
            }
        }
        return UNKNOWN;
    }
}
