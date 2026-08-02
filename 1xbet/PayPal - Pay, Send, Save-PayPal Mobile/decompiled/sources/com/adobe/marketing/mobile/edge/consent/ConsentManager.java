package com.adobe.marketing.mobile.edge.consent;

/* loaded from: classes3.dex */
final class ConsentManager {
    private final com.adobe.marketing.mobile.services.NamedCollection Camera2StreamConfigurationMap;
    com.adobe.marketing.mobile.edge.consent.Consents getHighResolutionOutputSizeshNQ4ISI;
    com.adobe.marketing.mobile.edge.consent.Consents getHighSpeedVideoFpsRanges;

    ConsentManager(com.adobe.marketing.mobile.services.NamedCollection namedCollection) {
        this.Camera2StreamConfigurationMap = namedCollection;
        com.adobe.marketing.mobile.edge.consent.Consents highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        this.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor;
        if (highSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRanges = new com.adobe.marketing.mobile.edge.consent.Consents(new java.util.HashMap());
        }
    }

    final com.adobe.marketing.mobile.edge.consent.Consents getHighSpeedVideoSizes() {
        com.adobe.marketing.mobile.edge.consent.Consents consents = this.getHighResolutionOutputSizeshNQ4ISI;
        if (consents == null || com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(consents.getHighSpeedVideoFpsRangesFor)) {
            return new com.adobe.marketing.mobile.edge.consent.Consents(this.getHighSpeedVideoFpsRanges);
        }
        com.adobe.marketing.mobile.edge.consent.Consents consents2 = new com.adobe.marketing.mobile.edge.consent.Consents(this.getHighResolutionOutputSizeshNQ4ISI);
        consents2.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges);
        return consents2;
    }

    private com.adobe.marketing.mobile.edge.consent.Consents getHighSpeedVideoFpsRangesFor() {
        com.adobe.marketing.mobile.services.NamedCollection namedCollection = this.Camera2StreamConfigurationMap;
        if (namedCollection == null) {
            com.adobe.marketing.mobile.services.Log.warning("Consent", "ConsentManager", "loadConsentsFromPersistence failed due to unexpected null namedCollection.", new java.lang.Object[0]);
            return null;
        }
        java.lang.String string = namedCollection.getString(com.adobe.marketing.mobile.EventSource.CONSENT_PREFERENCE, null);
        if (string == null) {
            com.adobe.marketing.mobile.services.Log.trace("Consent", "ConsentManager", "No previous consents were stored in persistence. Current consent is null.", new java.lang.Object[0]);
            return null;
        }
        try {
            return new com.adobe.marketing.mobile.edge.consent.Consents(com.adobe.marketing.mobile.util.JSONUtils.toMap(new org.json.JSONObject(string)));
        } catch (org.json.JSONException unused) {
            com.adobe.marketing.mobile.services.Log.debug("Consent", "ConsentManager", "Serialization error while reading consent jsonString from persistence. Unable to load saved consents from persistence.", new java.lang.Object[0]);
            return null;
        }
    }

    final void getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.edge.consent.Consents consents) {
        if (this.Camera2StreamConfigurationMap == null) {
            com.adobe.marketing.mobile.services.Log.warning("Consent", "ConsentManager", "saveConsentsToPersistence failed due to unexpected null namedCollection.", new java.lang.Object[0]);
        } else if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(consents.getHighSpeedVideoFpsRangesFor)) {
            this.Camera2StreamConfigurationMap.remove(com.adobe.marketing.mobile.EventSource.CONSENT_PREFERENCE);
        } else {
            this.Camera2StreamConfigurationMap.setString(com.adobe.marketing.mobile.EventSource.CONSENT_PREFERENCE, new org.json.JSONObject(consents.Camera2StreamConfigurationMap()).toString());
        }
    }
}
