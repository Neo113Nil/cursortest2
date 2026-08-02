package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
public class VisitorID {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final com.adobe.marketing.mobile.VisitorID.AuthenticationState getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    public com.adobe.marketing.mobile.VisitorID.AuthenticationState getAuthenticationState() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String getId() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String getIdOrigin() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String getIdType() {
        return this.Camera2StreamConfigurationMap;
    }

    public enum AuthenticationState {
        UNKNOWN(0),
        AUTHENTICATED(1),
        LOGGED_OUT(2);

        private final int getHighSpeedVideoFpsRangesFor;

        AuthenticationState(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        public final int getValue() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public static com.adobe.marketing.mobile.VisitorID.AuthenticationState fromInteger(int i) {
            for (com.adobe.marketing.mobile.VisitorID.AuthenticationState authenticationState : values()) {
                if (authenticationState.getValue() == i) {
                    return authenticationState;
                }
            }
            return UNKNOWN;
        }
    }

    public VisitorID(java.lang.String str, java.lang.String str2, java.lang.String str3, com.adobe.marketing.mobile.VisitorID.AuthenticationState authenticationState) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2)) {
            throw new java.lang.IllegalStateException("idType parameter cannot be null or empty");
        }
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str3)) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "VisitorID", "The custom VisitorID should not have null/empty id, this VisitorID will be ignored", new java.lang.Object[0]);
        }
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoSizes = str3;
        this.getHighResolutionOutputSizeshNQ4ISI = authenticationState;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.adobe.marketing.mobile.VisitorID)) {
            return false;
        }
        com.adobe.marketing.mobile.VisitorID visitorID = (com.adobe.marketing.mobile.VisitorID) obj;
        if (!this.Camera2StreamConfigurationMap.equals(visitorID.Camera2StreamConfigurationMap)) {
            return false;
        }
        java.lang.String str = this.getHighSpeedVideoSizes;
        if (str == null) {
            return visitorID.getHighSpeedVideoSizes == null;
        }
        java.lang.String str2 = visitorID.getHighSpeedVideoSizes;
        return str2 != null && str.compareTo(str2) == 0;
    }

    public int hashCode() {
        return ((this.getHighSpeedVideoSizes.hashCode() + 527) * 31) + this.Camera2StreamConfigurationMap.hashCode();
    }
}
