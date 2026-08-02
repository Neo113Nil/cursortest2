package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class EdgeProperties {
    final com.adobe.marketing.mobile.services.NamedCollection Camera2StreamConfigurationMap;
    java.util.Calendar getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges = "EdgeProperties";
    java.lang.String getHighSpeedVideoSizes;

    EdgeProperties(com.adobe.marketing.mobile.services.NamedCollection namedCollection) {
        this.Camera2StreamConfigurationMap = namedCollection;
    }

    final java.lang.String getHighSpeedVideoSizes() {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("GMT"));
        java.util.Calendar calendar2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (calendar2 == null || !calendar2.after(calendar)) {
            return null;
        }
        return this.getHighSpeedVideoSizes;
    }

    final java.lang.Boolean getHighSpeedVideoSizes(java.lang.String str, int i) {
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes();
        boolean z = (highSpeedVideoSizes == null && !com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) || !(highSpeedVideoSizes == null || highSpeedVideoSizes.equals(str));
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            this.getHighSpeedVideoSizes = null;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        } else {
            java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("GMT"));
            calendar.add(13, java.lang.Math.max(i, 0));
            this.getHighSpeedVideoSizes = str;
            this.getHighResolutionOutputSizeshNQ4ISI = calendar;
        }
        if (this.Camera2StreamConfigurationMap == null) {
            com.adobe.marketing.mobile.services.Log.warning("Edge", "EdgeProperties", "Local Storage Service is null. Unable to save properties to persistence.", new java.lang.Object[0]);
        } else {
            if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(this.getHighSpeedVideoSizes)) {
                this.Camera2StreamConfigurationMap.remove("locationHint");
            } else {
                this.Camera2StreamConfigurationMap.setString("locationHint", this.getHighSpeedVideoSizes);
            }
            java.util.Calendar calendar2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (calendar2 == null) {
                this.Camera2StreamConfigurationMap.remove("locationHintExpiryTimestamp");
            } else {
                this.Camera2StreamConfigurationMap.setLong("locationHintExpiryTimestamp", calendar2.getTimeInMillis());
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
