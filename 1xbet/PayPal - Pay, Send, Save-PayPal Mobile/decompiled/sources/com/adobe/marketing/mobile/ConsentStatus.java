package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
enum ConsentStatus {
    YES("y"),
    NO("n"),
    PENDING("p");

    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    ConsentStatus(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    static com.adobe.marketing.mobile.ConsentStatus getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.Map typedMap;
        try {
            java.util.Map typedMap2 = com.adobe.marketing.mobile.util.DataReader.getTypedMap(java.lang.Object.class, map, "consents");
            java.lang.String string = (typedMap2 == null || (typedMap = com.adobe.marketing.mobile.util.DataReader.getTypedMap(java.lang.Object.class, typedMap2, "collect")) == null) ? null : com.adobe.marketing.mobile.util.DataReader.getString(typedMap, "val");
            for (com.adobe.marketing.mobile.ConsentStatus consentStatus : values()) {
                if (consentStatus.getHighResolutionOutputSizeshNQ4ISI.equalsIgnoreCase(string)) {
                    return consentStatus;
                }
            }
            return com.adobe.marketing.mobile.EdgeConstants.Defaults.Camera2StreamConfigurationMap;
        } catch (com.adobe.marketing.mobile.util.DataReaderException unused) {
            com.adobe.marketing.mobile.services.Log.trace("Edge", "ConsentStatus", "Failed to read collect consent from event data, defaulting to (p)", new java.lang.Object[0]);
            return com.adobe.marketing.mobile.EdgeConstants.Defaults.Camera2StreamConfigurationMap;
        }
    }
}
