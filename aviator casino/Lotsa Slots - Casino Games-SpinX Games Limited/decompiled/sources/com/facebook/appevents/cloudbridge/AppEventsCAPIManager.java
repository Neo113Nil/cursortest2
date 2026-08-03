package com.facebook.appevents.cloudbridge;

/* compiled from: AppEventsCAPIManager.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR@\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e8A@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsCAPIManager;", "", "()V", "SETTINGS_PATH", "", "TAG", "kotlin.jvm.PlatformType", "isEnabled", "", "isEnabled$facebook_core_release", "()Z", "setEnabled$facebook_core_release", "(Z)V", "valuesToSave", "", "savedCloudBridgeCredentials", "getSavedCloudBridgeCredentials$facebook_core_release", "()Ljava/util/Map;", "setSavedCloudBridgeCredentials$facebook_core_release", "(Ljava/util/Map;)V", com.ironsource.mediationsdk.metadata.a.j, "", "getCAPIGSettingsFromGraphResponse", com.ironsource.Ve.n, "Lcom/facebook/GraphResponse;", "getCAPIGSettingsFromGraphResponse$facebook_core_release", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventsCAPIManager {
    private static final java.lang.String SETTINGS_PATH = "/cloudbridge_settings";
    private static boolean isEnabled;
    public static final com.facebook.appevents.cloudbridge.AppEventsCAPIManager INSTANCE = new com.facebook.appevents.cloudbridge.AppEventsCAPIManager();
    private static final java.lang.String TAG = com.facebook.appevents.cloudbridge.AppEventsCAPIManager.class.getCanonicalName();

    private AppEventsCAPIManager() {
    }

    public final boolean isEnabled$facebook_core_release() {
        return isEnabled;
    }

    public final void setEnabled$facebook_core_release(boolean z) {
        isEnabled = z;
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Map<java.lang.String, java.lang.Object> getSavedCloudBridgeCredentials$facebook_core_release() {
        java.lang.String str;
        java.lang.String str2;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.cloudbridge.AppEventsCAPIManager.class)) {
            return null;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.SharedPreferences sharedPreferences = com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences(com.facebook.FacebookSdk.CLOUDBRIDGE_SAVED_CREDENTIALS, 0);
            if (sharedPreferences == null) {
                return null;
            }
            java.lang.String string = sharedPreferences.getString(com.facebook.appevents.cloudbridge.SettingsAPIFields.DATASETID.getRawValue(), null);
            java.lang.String string2 = sharedPreferences.getString(com.facebook.appevents.cloudbridge.SettingsAPIFields.URL.getRawValue(), null);
            java.lang.String string3 = sharedPreferences.getString(com.facebook.appevents.cloudbridge.SettingsAPIFields.ACCESSKEY.getRawValue(), null);
            java.lang.String str3 = string;
            if (str3 != null && !kotlin.text.StringsKt.isBlank(str3) && (str = string2) != null && !kotlin.text.StringsKt.isBlank(str) && (str2 = string3) != null && !kotlin.text.StringsKt.isBlank(str2)) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.put(com.facebook.appevents.cloudbridge.SettingsAPIFields.URL.getRawValue(), string2);
                linkedHashMap.put(com.facebook.appevents.cloudbridge.SettingsAPIFields.DATASETID.getRawValue(), string);
                linkedHashMap.put(com.facebook.appevents.cloudbridge.SettingsAPIFields.ACCESSKEY.getRawValue(), string3);
                com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, TAG.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                return linkedHashMap;
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.cloudbridge.AppEventsCAPIManager.class);
            return null;
        }
    }

    public final void setSavedCloudBridgeCredentials$facebook_core_release(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.SharedPreferences sharedPreferences = com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences(com.facebook.FacebookSdk.CLOUDBRIDGE_SAVED_CREDENTIALS, 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.apply();
            return;
        }
        java.lang.Object obj = map.get(com.facebook.appevents.cloudbridge.SettingsAPIFields.DATASETID.getRawValue());
        java.lang.Object obj2 = map.get(com.facebook.appevents.cloudbridge.SettingsAPIFields.URL.getRawValue());
        java.lang.Object obj3 = map.get(com.facebook.appevents.cloudbridge.SettingsAPIFields.ACCESSKEY.getRawValue());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        android.content.SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putString(com.facebook.appevents.cloudbridge.SettingsAPIFields.DATASETID.getRawValue(), obj.toString());
        edit2.putString(com.facebook.appevents.cloudbridge.SettingsAPIFields.URL.getRawValue(), obj2.toString());
        edit2.putString(com.facebook.appevents.cloudbridge.SettingsAPIFields.ACCESSKEY.getRawValue(), obj3.toString());
        edit2.apply();
        com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, TAG.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }

    @kotlin.jvm.JvmStatic
    public static final void enable() {
        try {
            com.facebook.GraphRequest.Callback callback = new com.facebook.GraphRequest.Callback() { // from class: com.facebook.appevents.cloudbridge.AppEventsCAPIManager$$ExternalSyntheticLambda0
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                    com.facebook.appevents.cloudbridge.AppEventsCAPIManager.m5112enable$lambda0(graphResponse);
                }
            };
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.GraphRequest graphRequest = new com.facebook.GraphRequest(null, kotlin.jvm.internal.Intrinsics.stringPlus(com.facebook.FacebookSdk.getApplicationId(), SETTINGS_PATH), null, com.facebook.HttpMethod.GET, callback, null, 32, null);
            com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
            com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.APP_EVENTS;
            java.lang.String str = TAG;
            if (str != null) {
                companion.log(loggingBehavior, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", graphRequest);
                graphRequest.executeAsync();
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (org.json.JSONException e) {
            com.facebook.internal.Logger.Companion companion2 = com.facebook.internal.Logger.INSTANCE;
            com.facebook.LoggingBehavior loggingBehavior2 = com.facebook.LoggingBehavior.APP_EVENTS;
            java.lang.String str2 = TAG;
            if (str2 != null) {
                companion2.log(loggingBehavior2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", kotlin.ExceptionsKt.stackTraceToString(e));
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: enable$lambda-0, reason: not valid java name */
    public static final void m5112enable$lambda0(com.facebook.GraphResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        INSTANCE.getCAPIGSettingsFromGraphResponse$facebook_core_release(response);
    }

    public final void getCAPIGSettingsFromGraphResponse$facebook_core_release(com.facebook.GraphResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        boolean z = false;
        if (response.getError() != null) {
            com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
            com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.APP_EVENTS;
            java.lang.String str = TAG;
            if (str != null) {
                companion.log(loggingBehavior, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", response.getError().toString(), java.lang.String.valueOf(response.getError().getException()));
                java.util.Map<java.lang.String, java.lang.Object> savedCloudBridgeCredentials$facebook_core_release = getSavedCloudBridgeCredentials$facebook_core_release();
                if (savedCloudBridgeCredentials$facebook_core_release != null) {
                    java.net.URL url = new java.net.URL(java.lang.String.valueOf(savedCloudBridgeCredentials$facebook_core_release.get(com.facebook.appevents.cloudbridge.SettingsAPIFields.URL.getRawValue())));
                    com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.INSTANCE;
                    com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.configure(java.lang.String.valueOf(savedCloudBridgeCredentials$facebook_core_release.get(com.facebook.appevents.cloudbridge.SettingsAPIFields.DATASETID.getRawValue())), url.getProtocol() + "://" + ((java.lang.Object) url.getHost()), java.lang.String.valueOf(savedCloudBridgeCredentials$facebook_core_release.get(com.facebook.appevents.cloudbridge.SettingsAPIFields.ACCESSKEY.getRawValue())));
                    isEnabled = true;
                    return;
                }
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        com.facebook.internal.Logger.Companion companion2 = com.facebook.internal.Logger.INSTANCE;
        com.facebook.LoggingBehavior loggingBehavior2 = com.facebook.LoggingBehavior.APP_EVENTS;
        java.lang.String TAG2 = TAG;
        if (TAG2 != null) {
            companion2.log(loggingBehavior2, TAG2, " \n\nGraph Response Received: \n================\n%s\n\n ", response);
            org.json.JSONObject graphObject = response.getGraphObject();
            try {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                java.lang.Object obj = graphObject == null ? null : graphObject.get("data");
                if (obj == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                }
                java.util.List<java.lang.String> convertJSONArrayToList = com.facebook.internal.Utility.convertJSONArrayToList((org.json.JSONArray) obj);
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                java.util.Map<java.lang.String, ? extends java.lang.Object> convertJSONObjectToHashMap = com.facebook.internal.Utility.convertJSONObjectToHashMap(new org.json.JSONObject((java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) convertJSONArrayToList)));
                java.lang.String str2 = (java.lang.String) convertJSONObjectToHashMap.get(com.facebook.appevents.cloudbridge.SettingsAPIFields.URL.getRawValue());
                java.lang.String str3 = (java.lang.String) convertJSONObjectToHashMap.get(com.facebook.appevents.cloudbridge.SettingsAPIFields.DATASETID.getRawValue());
                java.lang.String str4 = (java.lang.String) convertJSONObjectToHashMap.get(com.facebook.appevents.cloudbridge.SettingsAPIFields.ACCESSKEY.getRawValue());
                if (str2 == null || str3 == null || str4 == null) {
                    com.facebook.internal.Logger.Companion companion3 = com.facebook.internal.Logger.INSTANCE;
                    com.facebook.LoggingBehavior loggingBehavior3 = com.facebook.LoggingBehavior.APP_EVENTS;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    companion3.log(loggingBehavior3, TAG2, "CloudBridge Settings API response doesn't have valid data");
                    return;
                }
                try {
                    com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests2 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.INSTANCE;
                    com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.configure(str3, str2, str4);
                    setSavedCloudBridgeCredentials$facebook_core_release(convertJSONObjectToHashMap);
                    if (convertJSONObjectToHashMap.get(com.facebook.appevents.cloudbridge.SettingsAPIFields.ENABLED.getRawValue()) != null) {
                        java.lang.Object obj2 = convertJSONObjectToHashMap.get(com.facebook.appevents.cloudbridge.SettingsAPIFields.ENABLED.getRawValue());
                        if (obj2 == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                        }
                        z = ((java.lang.Boolean) obj2).booleanValue();
                    }
                    isEnabled = z;
                    return;
                } catch (java.net.MalformedURLException e) {
                    com.facebook.internal.Logger.Companion companion4 = com.facebook.internal.Logger.INSTANCE;
                    com.facebook.LoggingBehavior loggingBehavior4 = com.facebook.LoggingBehavior.APP_EVENTS;
                    java.lang.String TAG3 = TAG;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                    companion4.log(loggingBehavior4, TAG3, "CloudBridge Settings API response doesn't have valid url\n %s ", kotlin.ExceptionsKt.stackTraceToString(e));
                    return;
                }
            } catch (java.lang.NullPointerException e2) {
                com.facebook.internal.Logger.Companion companion5 = com.facebook.internal.Logger.INSTANCE;
                com.facebook.LoggingBehavior loggingBehavior5 = com.facebook.LoggingBehavior.APP_EVENTS;
                java.lang.String TAG4 = TAG;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                companion5.log(loggingBehavior5, TAG4, "CloudBridge Settings API response is not a valid json: \n%s ", kotlin.ExceptionsKt.stackTraceToString(e2));
                return;
            } catch (org.json.JSONException e3) {
                com.facebook.internal.Logger.Companion companion6 = com.facebook.internal.Logger.INSTANCE;
                com.facebook.LoggingBehavior loggingBehavior6 = com.facebook.LoggingBehavior.APP_EVENTS;
                java.lang.String TAG5 = TAG;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
                companion6.log(loggingBehavior6, TAG5, "CloudBridge Settings API response is not a valid json: \n%s ", kotlin.ExceptionsKt.stackTraceToString(e3));
                return;
            }
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
