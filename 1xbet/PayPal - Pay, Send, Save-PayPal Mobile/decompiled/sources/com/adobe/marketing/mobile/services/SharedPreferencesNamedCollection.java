package com.adobe.marketing.mobile.services;

/* loaded from: classes7.dex */
class SharedPreferencesNamedCollection implements com.adobe.marketing.mobile.services.NamedCollection {
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "SharedPreferencesNamedCollection";
    private final android.content.SharedPreferences.Editor Camera2StreamConfigurationMap;
    private final android.content.SharedPreferences getHighSpeedVideoFpsRanges;

    SharedPreferencesNamedCollection(android.content.SharedPreferences sharedPreferences, android.content.SharedPreferences.Editor editor) {
        this.getHighSpeedVideoFpsRanges = sharedPreferences;
        this.Camera2StreamConfigurationMap = editor;
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void setInt(java.lang.String str, int i) {
        android.content.SharedPreferences.Editor editor = this.Camera2StreamConfigurationMap;
        if (editor == null) {
            return;
        }
        editor.putInt(str, i);
        if (this.Camera2StreamConfigurationMap.commit()) {
            return;
        }
        com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighResolutionOutputSizeshNQ4ISI, "Android SharedPreference unable to commit the persisted data", new java.lang.Object[0]);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public int getInt(java.lang.String str, int i) {
        return this.getHighSpeedVideoFpsRanges.getInt(str, i);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void setString(java.lang.String str, java.lang.String str2) {
        this.Camera2StreamConfigurationMap.putString(str, str2);
        if (this.Camera2StreamConfigurationMap.commit()) {
            return;
        }
        com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighResolutionOutputSizeshNQ4ISI, "Android SharedPreference unable to commit the persisted data", new java.lang.Object[0]);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        return this.getHighSpeedVideoFpsRanges.getString(str, str2);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void setDouble(java.lang.String str, double d) {
        this.Camera2StreamConfigurationMap.putLong(str, java.lang.Double.doubleToRawLongBits(d));
        if (this.Camera2StreamConfigurationMap.commit()) {
            return;
        }
        com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighResolutionOutputSizeshNQ4ISI, "Android SharedPreference unable to commit the persisted data", new java.lang.Object[0]);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public double getDouble(java.lang.String str, double d) {
        return java.lang.Double.longBitsToDouble(this.getHighSpeedVideoFpsRanges.getLong(str, java.lang.Double.doubleToRawLongBits(d)));
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void setLong(java.lang.String str, long j) {
        this.Camera2StreamConfigurationMap.putLong(str, j);
        if (this.Camera2StreamConfigurationMap.commit()) {
            return;
        }
        com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighResolutionOutputSizeshNQ4ISI, "Android SharedPreference unable to commit the persisted data", new java.lang.Object[0]);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public long getLong(java.lang.String str, long j) {
        return this.getHighSpeedVideoFpsRanges.getLong(str, j);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void setFloat(java.lang.String str, float f) {
        this.Camera2StreamConfigurationMap.putFloat(str, f);
        if (this.Camera2StreamConfigurationMap.commit()) {
            return;
        }
        com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighResolutionOutputSizeshNQ4ISI, "Android SharedPreference unable to commit the persisted data", new java.lang.Object[0]);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public float getFloat(java.lang.String str, float f) {
        return this.getHighSpeedVideoFpsRanges.getFloat(str, f);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void setBoolean(java.lang.String str, boolean z) {
        this.Camera2StreamConfigurationMap.putBoolean(str, z);
        if (this.Camera2StreamConfigurationMap.commit()) {
            return;
        }
        com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighResolutionOutputSizeshNQ4ISI, "Android SharedPreference unable to commit the persisted data", new java.lang.Object[0]);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public boolean getBoolean(java.lang.String str, boolean z) {
        return this.getHighSpeedVideoFpsRanges.getBoolean(str, z);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void setMap(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            this.Camera2StreamConfigurationMap.putString(str, new org.json.JSONObject(map).toString());
            if (this.Camera2StreamConfigurationMap.commit()) {
                return;
            }
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighResolutionOutputSizeshNQ4ISI, "Android SharedPreference unable to commit the persisted data", new java.lang.Object[0]);
        } catch (java.lang.NullPointerException unused) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighResolutionOutputSizeshNQ4ISI, "Map contains null key.", new java.lang.Object[0]);
        }
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String str) {
        java.lang.String string = this.getHighSpeedVideoFpsRanges.getString(str, null);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (string == null) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(string);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                try {
                    hashMap.put(next, jSONObject.getString(next));
                } catch (org.json.JSONException e) {
                    com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighResolutionOutputSizeshNQ4ISI, java.lang.String.format("Unable to convert jsonObject key %s into map, %s", next, e.getLocalizedMessage()), new java.lang.Object[0]);
                }
            }
            return hashMap;
        } catch (java.lang.Exception e2) {
            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighResolutionOutputSizeshNQ4ISI, java.lang.String.format("Failed to convert [%s] to String Map, %s", string, e2.getLocalizedMessage()), new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public boolean contains(java.lang.String str) {
        return this.getHighSpeedVideoFpsRanges.contains(str);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void remove(java.lang.String str) {
        this.Camera2StreamConfigurationMap.remove(str);
        if (this.Camera2StreamConfigurationMap.commit()) {
            return;
        }
        com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighResolutionOutputSizeshNQ4ISI, "Android SharedPreference unable to commit the persisted data", new java.lang.Object[0]);
    }

    @Override // com.adobe.marketing.mobile.services.NamedCollection
    public void removeAll() {
        this.Camera2StreamConfigurationMap.clear();
        if (this.Camera2StreamConfigurationMap.commit()) {
            return;
        }
        com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighResolutionOutputSizeshNQ4ISI, "Android SharedPreference unable to commit the persisted data", new java.lang.Object[0]);
    }
}
