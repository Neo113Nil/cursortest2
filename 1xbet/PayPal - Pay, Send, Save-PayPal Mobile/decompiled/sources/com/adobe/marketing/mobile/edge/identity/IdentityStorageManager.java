package com.adobe.marketing.mobile.edge.identity;

/* loaded from: classes3.dex */
class IdentityStorageManager {
    private final com.adobe.marketing.mobile.services.NamedCollection getHighSpeedVideoFpsRanges;
    final com.adobe.marketing.mobile.services.NamedCollection getHighSpeedVideoSizes;

    IdentityStorageManager(com.adobe.marketing.mobile.services.DataStoring dataStoring) {
        this.getHighSpeedVideoFpsRanges = dataStoring.getNamedCollection("com.adobe.edge.identity");
        this.getHighSpeedVideoSizes = dataStoring.getNamedCollection(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Identity.DATASTORE_NAME);
    }

    final com.adobe.marketing.mobile.edge.identity.IdentityProperties getHighSpeedVideoFpsRangesFor() {
        com.adobe.marketing.mobile.services.NamedCollection namedCollection = this.getHighSpeedVideoFpsRanges;
        if (namedCollection == null) {
            com.adobe.marketing.mobile.services.Log.warning("EdgeIdentity", "IdentityStorageManager", "EdgeIdentity named collection is null. Unable to load saved identity properties from persistence.", new java.lang.Object[0]);
            return null;
        }
        java.lang.String string = namedCollection.getString("identity.properties", null);
        if (string == null) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityStorageManager", "No previous properties were stored in persistence. Current identity properties are null", new java.lang.Object[0]);
            return null;
        }
        try {
            return new com.adobe.marketing.mobile.edge.identity.IdentityProperties(com.adobe.marketing.mobile.util.JSONUtils.toMap(new org.json.JSONObject(string)));
        } catch (org.json.JSONException unused) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityStorageManager", "Serialization error while reading properties jsonString from persistence. Unable to load saved identity properties from persistence.", new java.lang.Object[0]);
            return null;
        }
    }

    final void Camera2StreamConfigurationMap(com.adobe.marketing.mobile.edge.identity.IdentityProperties identityProperties) {
        if (this.getHighSpeedVideoFpsRanges == null) {
            com.adobe.marketing.mobile.services.Log.warning("EdgeIdentity", "IdentityStorageManager", "EdgeIdentity named collection is null. Unable to write identity properties to persistence.", new java.lang.Object[0]);
        } else if (identityProperties == null) {
            com.adobe.marketing.mobile.services.Log.debug("EdgeIdentity", "IdentityStorageManager", "Identity Properties are null, removing them from persistence.", new java.lang.Object[0]);
            this.getHighSpeedVideoFpsRanges.remove("identity.properties");
        } else {
            this.getHighSpeedVideoFpsRanges.setString("identity.properties", new org.json.JSONObject(identityProperties.getHighSpeedVideoSizes()).toString());
        }
    }
}
