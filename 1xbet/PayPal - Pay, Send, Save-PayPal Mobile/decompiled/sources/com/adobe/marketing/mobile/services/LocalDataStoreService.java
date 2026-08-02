package com.adobe.marketing.mobile.services;

/* loaded from: classes3.dex */
class LocalDataStoreService implements com.adobe.marketing.mobile.services.DataStoring {
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = "LocalDataStoreService";

    LocalDataStoreService() {
    }

    @Override // com.adobe.marketing.mobile.services.DataStoring
    public com.adobe.marketing.mobile.services.NamedCollection getNamedCollection(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoFpsRangesFor, java.lang.String.format("Failed to create an instance of NamedCollection with name - %s: the collection name is null or empty.", str), new java.lang.Object[0]);
            return null;
        }
        android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
        if (applicationContext == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoFpsRangesFor, java.lang.String.format("Failed to create an instance of NamedCollection with name - %s: the ApplicationContext is null", str), new java.lang.Object[0]);
            return null;
        }
        android.content.SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        android.content.SharedPreferences.Editor edit = sharedPreferences != null ? sharedPreferences.edit() : null;
        if (sharedPreferences == null || edit == null) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoFpsRangesFor, "Failed to create a valid SharedPreferences object or SharedPreferences.Editor object", new java.lang.Object[0]);
            return null;
        }
        return new com.adobe.marketing.mobile.services.SharedPreferencesNamedCollection(sharedPreferences, edit);
    }
}
