package com.facebook.applinks;

/* loaded from: classes2.dex */
public class AppLinkData {
    private static final java.lang.String APPLINK_BRIDGE_ARGS_KEY = "bridge_args";
    private static final java.lang.String APPLINK_METHOD_ARGS_KEY = "method_args";
    private static final java.lang.String APPLINK_VERSION_KEY = "version";
    public static final java.lang.String ARGUMENTS_EXTRAS_KEY = "extras";
    public static final java.lang.String ARGUMENTS_NATIVE_CLASS_KEY = "com.facebook.platform.APPLINK_NATIVE_CLASS";
    public static final java.lang.String ARGUMENTS_NATIVE_URL = "com.facebook.platform.APPLINK_NATIVE_URL";
    public static final java.lang.String ARGUMENTS_REFERER_DATA_KEY = "referer_data";
    public static final java.lang.String ARGUMENTS_TAPTIME_KEY = "com.facebook.platform.APPLINK_TAP_TIME_UTC";
    private static final java.lang.String AUTO_APPLINK_FLAG_KEY = "is_auto_applink";
    private static final java.lang.String BRIDGE_ARGS_METHOD_KEY = "method";
    private static final java.lang.String BUNDLE_AL_APPLINK_DATA_KEY = "al_applink_data";
    private static final java.lang.String BUNDLE_APPLINK_ARGS_KEY = "com.facebook.platform.APPLINK_ARGS";
    private static final java.lang.String DEFERRED_APP_LINK_ARGS_FIELD = "applink_args";
    private static final java.lang.String DEFERRED_APP_LINK_CLASS_FIELD = "applink_class";
    private static final java.lang.String DEFERRED_APP_LINK_CLICK_TIME_FIELD = "click_time";
    private static final java.lang.String DEFERRED_APP_LINK_EVENT = "DEFERRED_APP_LINK";
    private static final java.lang.String DEFERRED_APP_LINK_PATH = "%s/activities";
    private static final java.lang.String DEFERRED_APP_LINK_URL_FIELD = "applink_url";
    private static final java.lang.String EXTRAS_DEEPLINK_CONTEXT_KEY = "deeplink_context";
    private static final java.lang.String METHOD_ARGS_REF_KEY = "ref";
    private static final java.lang.String METHOD_ARGS_TARGET_URL_KEY = "target_url";
    private static final java.lang.String PROMOTION_CODE_KEY = "promo_code";
    private static final java.lang.String REFERER_DATA_REF_KEY = "fb_ref";
    private static final java.lang.String TAG = "com.facebook.applinks.AppLinkData";
    private org.json.JSONObject appLinkData;
    private android.os.Bundle argumentBundle;
    private org.json.JSONObject arguments;
    private java.lang.String promotionCode;
    private java.lang.String ref;
    private android.net.Uri targetUri;

    public interface CompletionHandler {
        void onDeferredAppLinkDataFetched(com.facebook.applinks.AppLinkData appLinkData);
    }

    public static void fetchDeferredAppLinkData(android.content.Context context, com.facebook.applinks.AppLinkData.CompletionHandler completionHandler) {
        fetchDeferredAppLinkData(context, null, completionHandler);
    }

    public static void fetchDeferredAppLinkData(android.content.Context context, final java.lang.String applicationId, final com.facebook.applinks.AppLinkData.CompletionHandler completionHandler) {
        com.facebook.internal.Validate.notNull(context, "context");
        com.facebook.internal.Validate.notNull(completionHandler, "completionHandler");
        if (applicationId == null) {
            applicationId = com.facebook.internal.Utility.getMetadataApplicationId(context);
        }
        com.facebook.internal.Validate.notNull(applicationId, "applicationId");
        final android.content.Context applicationContext = context.getApplicationContext();
        com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.applinks.AppLinkData.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    com.facebook.applinks.AppLinkData.fetchDeferredAppLinkFromServer(applicationContext, applicationId, completionHandler);
                } catch (java.lang.Throwable th) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fetchDeferredAppLinkFromServer(android.content.Context context, java.lang.String applicationId, final com.facebook.applinks.AppLinkData.CompletionHandler completionHandler) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, DEFERRED_APP_LINK_EVENT);
            com.facebook.internal.Utility.setAppEventAttributionParameters(jSONObject, com.facebook.internal.AttributionIdentifiers.getAttributionIdentifiers(context), com.facebook.appevents.AppEventsLogger.getAnonymousAppDeviceGUID(context), com.facebook.FacebookSdk.getLimitEventAndDataUsage(context), context);
            com.facebook.internal.Utility.setAppEventExtendedDeviceInfoParameters(jSONObject, com.facebook.FacebookSdk.getApplicationContext());
            jSONObject.put("application_package_name", context.getPackageName());
            java.lang.Object[] objArr = {applicationId};
            com.facebook.applinks.AppLinkData appLinkData = null;
            try {
                org.json.JSONObject graphObject = com.facebook.GraphRequest.newPostRequest(null, java.lang.String.format(DEFERRED_APP_LINK_PATH, objArr), jSONObject, null).executeAndWait().getGraphObject();
                if (graphObject != null) {
                    java.lang.String optString = graphObject.optString(DEFERRED_APP_LINK_ARGS_FIELD);
                    long optLong = graphObject.optLong(DEFERRED_APP_LINK_CLICK_TIME_FIELD, -1L);
                    java.lang.String optString2 = graphObject.optString(DEFERRED_APP_LINK_CLASS_FIELD);
                    java.lang.String optString3 = graphObject.optString(DEFERRED_APP_LINK_URL_FIELD);
                    if (!android.text.TextUtils.isEmpty(optString) && (appLinkData = createFromJson(optString)) != null) {
                        if (optLong != -1) {
                            try {
                                org.json.JSONObject jSONObject2 = appLinkData.arguments;
                                if (jSONObject2 != null) {
                                    jSONObject2.put(ARGUMENTS_TAPTIME_KEY, optLong);
                                }
                                android.os.Bundle bundle = appLinkData.argumentBundle;
                                if (bundle != null) {
                                    bundle.putString(ARGUMENTS_TAPTIME_KEY, java.lang.Long.toString(optLong));
                                }
                            } catch (org.json.JSONException unused) {
                                com.facebook.internal.Utility.logd(TAG, "Unable to put tap time in AppLinkData.arguments");
                            }
                        }
                        if (optString2 != null) {
                            try {
                                org.json.JSONObject jSONObject3 = appLinkData.arguments;
                                if (jSONObject3 != null) {
                                    jSONObject3.put(ARGUMENTS_NATIVE_CLASS_KEY, optString2);
                                }
                                android.os.Bundle bundle2 = appLinkData.argumentBundle;
                                if (bundle2 != null) {
                                    bundle2.putString(ARGUMENTS_NATIVE_CLASS_KEY, optString2);
                                }
                            } catch (org.json.JSONException unused2) {
                                com.facebook.internal.Utility.logd(TAG, "Unable to put app link class name in AppLinkData.arguments");
                            }
                        }
                        if (optString3 != null) {
                            try {
                                org.json.JSONObject jSONObject4 = appLinkData.arguments;
                                if (jSONObject4 != null) {
                                    jSONObject4.put(ARGUMENTS_NATIVE_URL, optString3);
                                }
                                android.os.Bundle bundle3 = appLinkData.argumentBundle;
                                if (bundle3 != null) {
                                    bundle3.putString(ARGUMENTS_NATIVE_URL, optString3);
                                }
                            } catch (org.json.JSONException unused3) {
                                com.facebook.internal.Utility.logd(TAG, "Unable to put app link URL in AppLinkData.arguments");
                            }
                        }
                    }
                }
            } catch (java.lang.Exception unused4) {
                com.facebook.internal.Utility.logd(TAG, "Unable to fetch deferred applink from server");
            }
            completionHandler.onDeferredAppLinkDataFetched(appLinkData);
        } catch (org.json.JSONException e) {
            throw new com.facebook.FacebookException("An error occurred while preparing deferred app link", e);
        }
    }

    public static com.facebook.applinks.AppLinkData createFromActivity(android.app.Activity activity) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.applinks.AppLinkData.class)) {
            return null;
        }
        try {
            com.facebook.internal.Validate.notNull(activity, "activity");
            android.content.Intent intent = activity.getIntent();
            if (intent == null) {
                return null;
            }
            com.facebook.applinks.AppLinkData createFromAlApplinkData = createFromAlApplinkData(intent);
            if (createFromAlApplinkData == null) {
                createFromAlApplinkData = createFromJson(intent.getStringExtra(BUNDLE_APPLINK_ARGS_KEY));
            }
            return createFromAlApplinkData == null ? createFromUri(intent.getData()) : createFromAlApplinkData;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.applinks.AppLinkData.class);
            return null;
        }
    }

    public static com.facebook.applinks.AppLinkData createFromAlApplinkData(android.content.Intent intent) {
        java.lang.String string;
        java.lang.String string2;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.applinks.AppLinkData.class) || intent == null) {
            return null;
        }
        try {
            android.os.Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
            if (bundleExtra == null) {
                return null;
            }
            com.facebook.applinks.AppLinkData appLinkData = new com.facebook.applinks.AppLinkData();
            android.net.Uri data = intent.getData();
            appLinkData.targetUri = data;
            appLinkData.appLinkData = getAppLinkData(data);
            if (appLinkData.targetUri == null && (string2 = bundleExtra.getString(METHOD_ARGS_TARGET_URL_KEY)) != null) {
                appLinkData.targetUri = android.net.Uri.parse(string2);
            }
            appLinkData.argumentBundle = bundleExtra;
            appLinkData.arguments = null;
            android.os.Bundle bundle = bundleExtra.getBundle(ARGUMENTS_REFERER_DATA_KEY);
            if (bundle != null) {
                appLinkData.ref = bundle.getString(REFERER_DATA_REF_KEY);
            }
            android.os.Bundle bundle2 = bundleExtra.getBundle("extras");
            if (bundle2 != null && (string = bundle2.getString("deeplink_context")) != null) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                    if (jSONObject.has("promo_code")) {
                        appLinkData.promotionCode = jSONObject.getString("promo_code");
                    }
                } catch (org.json.JSONException e) {
                    com.facebook.internal.Utility.logd(TAG, "Unable to parse deeplink_context JSON", e);
                }
            }
            return appLinkData;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.applinks.AppLinkData.class);
            return null;
        }
    }

    private static com.facebook.applinks.AppLinkData createFromJson(java.lang.String jsonString) {
        if (jsonString == null) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(jsonString);
            java.lang.String string = jSONObject.getString("version");
            if (jSONObject.getJSONObject("bridge_args").getString("method").equals("applink") && string.equals("2")) {
                com.facebook.applinks.AppLinkData appLinkData = new com.facebook.applinks.AppLinkData();
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("method_args");
                appLinkData.arguments = jSONObject2;
                if (jSONObject2.has(METHOD_ARGS_REF_KEY)) {
                    appLinkData.ref = appLinkData.arguments.getString(METHOD_ARGS_REF_KEY);
                } else if (appLinkData.arguments.has(ARGUMENTS_REFERER_DATA_KEY)) {
                    org.json.JSONObject jSONObject3 = appLinkData.arguments.getJSONObject(ARGUMENTS_REFERER_DATA_KEY);
                    if (jSONObject3.has(REFERER_DATA_REF_KEY)) {
                        appLinkData.ref = jSONObject3.getString(REFERER_DATA_REF_KEY);
                    }
                }
                if (appLinkData.arguments.has(METHOD_ARGS_TARGET_URL_KEY)) {
                    android.net.Uri parse = android.net.Uri.parse(appLinkData.arguments.getString(METHOD_ARGS_TARGET_URL_KEY));
                    appLinkData.targetUri = parse;
                    appLinkData.appLinkData = getAppLinkData(parse);
                }
                if (appLinkData.arguments.has("extras")) {
                    org.json.JSONObject jSONObject4 = appLinkData.arguments.getJSONObject("extras");
                    if (jSONObject4.has("deeplink_context")) {
                        org.json.JSONObject jSONObject5 = jSONObject4.getJSONObject("deeplink_context");
                        if (jSONObject5.has("promo_code")) {
                            appLinkData.promotionCode = jSONObject5.getString("promo_code");
                        }
                    }
                }
                appLinkData.argumentBundle = toBundle(appLinkData.arguments);
                return appLinkData;
            }
        } catch (com.facebook.FacebookException e) {
            com.facebook.internal.Utility.logd(TAG, "Unable to parse AppLink JSON", e);
        } catch (org.json.JSONException e2) {
            com.facebook.internal.Utility.logd(TAG, "Unable to parse AppLink JSON", e2);
        }
        return null;
    }

    private static com.facebook.applinks.AppLinkData createFromUri(android.net.Uri appLinkDataUri) {
        if (appLinkDataUri == null) {
            return null;
        }
        com.facebook.applinks.AppLinkData appLinkData = new com.facebook.applinks.AppLinkData();
        appLinkData.targetUri = appLinkDataUri;
        appLinkData.appLinkData = getAppLinkData(appLinkDataUri);
        return appLinkData;
    }

    private static android.os.Bundle toBundle(org.json.JSONObject node) throws org.json.JSONException {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Iterator<java.lang.String> keys = node.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object obj = node.get(next);
            if (obj instanceof org.json.JSONObject) {
                bundle.putBundle(next, toBundle((org.json.JSONObject) obj));
            } else if (obj instanceof org.json.JSONArray) {
                org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
                int i = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(next, new java.lang.String[0]);
                } else {
                    java.lang.Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof org.json.JSONObject) {
                        android.os.Bundle[] bundleArr = new android.os.Bundle[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            bundleArr[i] = toBundle(jSONArray.getJSONObject(i));
                            i++;
                        }
                        bundle.putParcelableArray(next, bundleArr);
                    } else {
                        if (obj2 instanceof org.json.JSONArray) {
                            throw new com.facebook.FacebookException("Nested arrays are not supported.");
                        }
                        java.lang.String[] strArr = new java.lang.String[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            strArr[i] = jSONArray.get(i).toString();
                            i++;
                        }
                        bundle.putStringArray(next, strArr);
                    }
                }
            } else {
                bundle.putString(next, obj.toString());
            }
        }
        return bundle;
    }

    private static org.json.JSONObject getAppLinkData(android.net.Uri uri) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.applinks.AppLinkData.class) || uri == null) {
            return null;
        }
        try {
            java.lang.String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new org.json.JSONObject(queryParameter);
            } catch (org.json.JSONException unused) {
                return null;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.applinks.AppLinkData.class);
            return null;
        }
    }

    private AppLinkData() {
    }

    public boolean isAutoAppLink() {
        android.net.Uri uri = this.targetUri;
        if (uri == null) {
            return false;
        }
        java.lang.String host = uri.getHost();
        java.lang.String scheme = this.targetUri.getScheme();
        java.lang.String format = java.lang.String.format("fb%s", com.facebook.FacebookSdk.getApplicationId());
        org.json.JSONObject jSONObject = this.appLinkData;
        return jSONObject != null && jSONObject.optBoolean(AUTO_APPLINK_FLAG_KEY) && "applinks".equals(host) && format.equals(scheme);
    }

    public android.net.Uri getTargetUri() {
        return this.targetUri;
    }

    public java.lang.String getRef() {
        return this.ref;
    }

    public java.lang.String getPromotionCode() {
        return this.promotionCode;
    }

    public android.os.Bundle getArgumentBundle() {
        return this.argumentBundle;
    }

    public android.os.Bundle getRefererData() {
        android.os.Bundle bundle = this.argumentBundle;
        if (bundle != null) {
            return bundle.getBundle(ARGUMENTS_REFERER_DATA_KEY);
        }
        return null;
    }

    public org.json.JSONObject getAppLinkData() {
        org.json.JSONObject jSONObject = this.appLinkData;
        return jSONObject != null ? jSONObject : new org.json.JSONObject();
    }
}
