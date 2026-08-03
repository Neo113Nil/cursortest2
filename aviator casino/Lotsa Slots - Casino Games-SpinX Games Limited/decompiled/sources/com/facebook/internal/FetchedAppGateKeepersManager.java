package com.facebook.internal;

/* compiled from: FetchedAppGateKeepersManager.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u00013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\"\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020\u001fH\u0007J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001f0#2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004J\u0017\u0010$\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020'J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0012H\u0007J\u001f\u0010)\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0002\b+J\b\u0010,\u001a\u00020'H\u0002J\u0018\u0010-\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u001fH\u0007J\b\u0010/\u001a\u00020'H\u0007J\u001a\u00100\u001a\u00020'2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\u0006\u00101\u001a\u000202H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001b¨\u00064"}, d2 = {"Lcom/facebook/internal/FetchedAppGateKeepersManager;", "", "()V", "APPLICATION_FIELDS", "", "APPLICATION_GATEKEEPER_CACHE_TIMEOUT", "", "APPLICATION_GATEKEEPER_EDGE", "APPLICATION_GATEKEEPER_FIELD", "APPLICATION_GRAPH_DATA", "APPLICATION_PLATFORM", "APPLICATION_SDK_VERSION", "APP_GATEKEEPERS_PREFS_KEY_FORMAT", "APP_GATEKEEPERS_PREFS_STORE", "APP_PLATFORM", "TAG", "callbacks", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/facebook/internal/FetchedAppGateKeepersManager$Callback;", "fetchedAppGateKeepers", "", "Lorg/json/JSONObject;", "gateKeeperRuntimeCache", "Lcom/facebook/internal/gatekeeper/GateKeeperRuntimeCache;", "isLoading", "Ljava/util/concurrent/atomic/AtomicBoolean;", com.ironsource.C4.a.d, "Ljava/lang/Long;", "getAppGateKeepersQueryResponse", "applicationId", "getGateKeeperForKey", "", "name", "defaultValue", "getGateKeepersForApplication", "", "isTimestampValid", "(Ljava/lang/Long;)Z", "loadAppGateKeepersAsync", "", "callback", "parseAppGateKeepersFromJSON", "gateKeepersJSON", "parseAppGateKeepersFromJSON$facebook_core_release", "pollCallbacks", "queryAppGateKeepers", "forceRequery", "resetRuntimeGateKeeperCache", "setRuntimeGateKeeper", "gateKeeper", "Lcom/facebook/internal/gatekeeper/GateKeeper;", "Callback", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FetchedAppGateKeepersManager {
    private static final java.lang.String APPLICATION_FIELDS = "fields";
    private static final long APPLICATION_GATEKEEPER_CACHE_TIMEOUT = 3600000;
    private static final java.lang.String APPLICATION_GATEKEEPER_EDGE = "mobile_sdk_gk";
    private static final java.lang.String APPLICATION_GATEKEEPER_FIELD = "gatekeepers";
    private static final java.lang.String APPLICATION_GRAPH_DATA = "data";
    private static final java.lang.String APPLICATION_PLATFORM = "platform";
    private static final java.lang.String APPLICATION_SDK_VERSION = "sdk_version";
    private static final java.lang.String APP_GATEKEEPERS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_GATEKEEPERS.%s";
    private static final java.lang.String APP_GATEKEEPERS_PREFS_STORE = "com.facebook.internal.preferences.APP_GATEKEEPERS";
    private static final java.lang.String APP_PLATFORM = "android";
    private static com.facebook.internal.gatekeeper.GateKeeperRuntimeCache gateKeeperRuntimeCache;
    private static java.lang.Long timestamp;
    public static final com.facebook.internal.FetchedAppGateKeepersManager INSTANCE = new com.facebook.internal.FetchedAppGateKeepersManager();
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.facebook.internal.FetchedAppGateKeepersManager.class).getSimpleName();
    private static final java.util.concurrent.atomic.AtomicBoolean isLoading = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static final java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.FetchedAppGateKeepersManager.Callback> callbacks = new java.util.concurrent.ConcurrentLinkedQueue<>();
    private static final java.util.Map<java.lang.String, org.json.JSONObject> fetchedAppGateKeepers = new java.util.concurrent.ConcurrentHashMap();

    /* compiled from: FetchedAppGateKeepersManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/facebook/internal/FetchedAppGateKeepersManager$Callback;", "", "onCompleted", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Callback {
        void onCompleted();
    }

    private FetchedAppGateKeepersManager() {
    }

    public final void loadAppGateKeepersAsync() {
        loadAppGateKeepersAsync(null);
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized void loadAppGateKeepersAsync(com.facebook.internal.FetchedAppGateKeepersManager.Callback callback) {
        synchronized (com.facebook.internal.FetchedAppGateKeepersManager.class) {
            if (callback != null) {
                callbacks.add(callback);
            }
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            final java.lang.String applicationId = com.facebook.FacebookSdk.getApplicationId();
            com.facebook.internal.FetchedAppGateKeepersManager fetchedAppGateKeepersManager = INSTANCE;
            if (fetchedAppGateKeepersManager.isTimestampValid(timestamp) && fetchedAppGateKeepers.containsKey(applicationId)) {
                fetchedAppGateKeepersManager.pollCallbacks();
                return;
            }
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            final android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            final java.lang.String format = java.lang.String.format(APP_GATEKEEPERS_PREFS_KEY_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{applicationId}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            if (applicationContext == null) {
                return;
            }
            org.json.JSONObject jSONObject = null;
            java.lang.String string = applicationContext.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).getString(format, null);
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (!com.facebook.internal.Utility.isNullOrEmpty(string)) {
                try {
                    jSONObject = new org.json.JSONObject(string);
                } catch (org.json.JSONException e) {
                    com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.logd(com.facebook.internal.Utility.LOG_TAG, e);
                }
                if (jSONObject != null) {
                    parseAppGateKeepersFromJSON$facebook_core_release(applicationId, jSONObject);
                }
            }
            com.facebook.FacebookSdk facebookSdk3 = com.facebook.FacebookSdk.INSTANCE;
            java.util.concurrent.Executor executor = com.facebook.FacebookSdk.getExecutor();
            if (executor == null) {
                return;
            }
            if (isLoading.compareAndSet(false, true)) {
                executor.execute(new java.lang.Runnable() { // from class: com.facebook.internal.FetchedAppGateKeepersManager$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.internal.FetchedAppGateKeepersManager.m5176loadAppGateKeepersAsync$lambda0(applicationId, applicationContext, format);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAppGateKeepersAsync$lambda-0, reason: not valid java name */
    public static final void m5176loadAppGateKeepersAsync$lambda0(java.lang.String applicationId, android.content.Context context, java.lang.String gateKeepersKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gateKeepersKey, "$gateKeepersKey");
        com.facebook.internal.FetchedAppGateKeepersManager fetchedAppGateKeepersManager = INSTANCE;
        org.json.JSONObject appGateKeepersQueryResponse = fetchedAppGateKeepersManager.getAppGateKeepersQueryResponse(applicationId);
        if (appGateKeepersQueryResponse.length() != 0) {
            parseAppGateKeepersFromJSON$facebook_core_release(applicationId, appGateKeepersQueryResponse);
            context.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).edit().putString(gateKeepersKey, appGateKeepersQueryResponse.toString()).apply();
            timestamp = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        }
        fetchedAppGateKeepersManager.pollCallbacks();
        isLoading.set(false);
    }

    private final void pollCallbacks() {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        while (true) {
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.FetchedAppGateKeepersManager.Callback> concurrentLinkedQueue = callbacks;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final com.facebook.internal.FetchedAppGateKeepersManager.Callback poll = concurrentLinkedQueue.poll();
            if (poll != null) {
                handler.post(new java.lang.Runnable() { // from class: com.facebook.internal.FetchedAppGateKeepersManager$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.internal.FetchedAppGateKeepersManager.Callback.this.onCompleted();
                    }
                });
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final org.json.JSONObject queryAppGateKeepers(java.lang.String applicationId, boolean forceRequery) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!forceRequery) {
            java.util.Map<java.lang.String, org.json.JSONObject> map = fetchedAppGateKeepers;
            if (map.containsKey(applicationId)) {
                org.json.JSONObject jSONObject = map.get(applicationId);
                return jSONObject == null ? new org.json.JSONObject() : jSONObject;
            }
        }
        org.json.JSONObject appGateKeepersQueryResponse = INSTANCE.getAppGateKeepersQueryResponse(applicationId);
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(APP_GATEKEEPERS_PREFS_KEY_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{applicationId}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        applicationContext.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).edit().putString(format, appGateKeepersQueryResponse.toString()).apply();
        return parseAppGateKeepersFromJSON$facebook_core_release(applicationId, appGateKeepersQueryResponse);
    }

    public final java.util.Map<java.lang.String, java.lang.Boolean> getGateKeepersForApplication(java.lang.String applicationId) {
        loadAppGateKeepersAsync();
        if (applicationId != null) {
            java.util.Map<java.lang.String, org.json.JSONObject> map = fetchedAppGateKeepers;
            if (map.containsKey(applicationId)) {
                com.facebook.internal.gatekeeper.GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
                java.util.List<com.facebook.internal.gatekeeper.GateKeeper> dumpGateKeepers = gateKeeperRuntimeCache2 == null ? null : gateKeeperRuntimeCache2.dumpGateKeepers(applicationId);
                if (dumpGateKeepers != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    for (com.facebook.internal.gatekeeper.GateKeeper gateKeeper : dumpGateKeepers) {
                        hashMap.put(gateKeeper.getName(), java.lang.Boolean.valueOf(gateKeeper.getValue()));
                    }
                    return hashMap;
                }
                java.util.HashMap hashMap2 = new java.util.HashMap();
                org.json.JSONObject jSONObject = map.get(applicationId);
                if (jSONObject == null) {
                    jSONObject = new org.json.JSONObject();
                }
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String key = keys.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap2.put(key, java.lang.Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                com.facebook.internal.gatekeeper.GateKeeperRuntimeCache gateKeeperRuntimeCache3 = gateKeeperRuntimeCache;
                if (gateKeeperRuntimeCache3 == null) {
                    gateKeeperRuntimeCache3 = new com.facebook.internal.gatekeeper.GateKeeperRuntimeCache();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(hashMap2.size());
                for (java.util.Map.Entry entry : hashMap2.entrySet()) {
                    arrayList.add(new com.facebook.internal.gatekeeper.GateKeeper((java.lang.String) entry.getKey(), ((java.lang.Boolean) entry.getValue()).booleanValue()));
                }
                gateKeeperRuntimeCache3.setGateKeepers(applicationId, arrayList);
                gateKeeperRuntimeCache = gateKeeperRuntimeCache3;
                return hashMap2;
            }
        }
        return new java.util.HashMap();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean getGateKeeperForKey(java.lang.String name, java.lang.String applicationId, boolean defaultValue) {
        java.lang.Boolean bool;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        java.util.Map<java.lang.String, java.lang.Boolean> gateKeepersForApplication = INSTANCE.getGateKeepersForApplication(applicationId);
        return (gateKeepersForApplication.containsKey(name) && (bool = gateKeepersForApplication.get(name)) != null) ? bool.booleanValue() : defaultValue;
    }

    public static /* synthetic */ void setRuntimeGateKeeper$default(java.lang.String str, com.facebook.internal.gatekeeper.GateKeeper gateKeeper, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            str = com.facebook.FacebookSdk.getApplicationId();
        }
        setRuntimeGateKeeper(str, gateKeeper);
    }

    @kotlin.jvm.JvmStatic
    public static final void setRuntimeGateKeeper(java.lang.String applicationId, com.facebook.internal.gatekeeper.GateKeeper gateKeeper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gateKeeper, "gateKeeper");
        com.facebook.internal.gatekeeper.GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
        if ((gateKeeperRuntimeCache2 == null ? null : gateKeeperRuntimeCache2.getGateKeeper(applicationId, gateKeeper.getName())) != null) {
            com.facebook.internal.gatekeeper.GateKeeperRuntimeCache gateKeeperRuntimeCache3 = gateKeeperRuntimeCache;
            if (gateKeeperRuntimeCache3 == null) {
                return;
            }
            gateKeeperRuntimeCache3.setGateKeeper(applicationId, gateKeeper);
            return;
        }
        android.util.Log.w(TAG, "Missing gatekeeper runtime cache");
    }

    @kotlin.jvm.JvmStatic
    public static final void resetRuntimeGateKeeperCache() {
        com.facebook.internal.gatekeeper.GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
        if (gateKeeperRuntimeCache2 == null) {
            return;
        }
        com.facebook.internal.gatekeeper.GateKeeperRuntimeCache.resetCache$default(gateKeeperRuntimeCache2, null, 1, null);
    }

    private final org.json.JSONObject getAppGateKeepersQueryResponse(java.lang.String applicationId) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("platform", "android");
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        bundle.putString(APPLICATION_SDK_VERSION, com.facebook.FacebookSdk.getSdkVersion());
        bundle.putString("fields", APPLICATION_GATEKEEPER_FIELD);
        com.facebook.GraphRequest.Companion companion = com.facebook.GraphRequest.INSTANCE;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("app/%s", java.util.Arrays.copyOf(new java.lang.Object[]{APPLICATION_GATEKEEPER_EDGE}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        com.facebook.GraphRequest newGraphPathRequest = companion.newGraphPathRequest(null, format, null);
        newGraphPathRequest.setParameters(bundle);
        org.json.JSONObject jsonObject = newGraphPathRequest.executeAndWait().getJsonObject();
        return jsonObject == null ? new org.json.JSONObject() : jsonObject;
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized org.json.JSONObject parseAppGateKeepersFromJSON$facebook_core_release(java.lang.String applicationId, org.json.JSONObject gateKeepersJSON) {
        org.json.JSONObject jSONObject;
        org.json.JSONArray optJSONArray;
        synchronized (com.facebook.internal.FetchedAppGateKeepersManager.class) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            jSONObject = fetchedAppGateKeepers.get(applicationId);
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            int i = 0;
            org.json.JSONObject jSONObject2 = null;
            if (gateKeepersJSON != null && (optJSONArray = gateKeepersJSON.optJSONArray("data")) != null) {
                jSONObject2 = optJSONArray.optJSONObject(0);
            }
            if (jSONObject2 == null) {
                jSONObject2 = new org.json.JSONObject();
            }
            org.json.JSONArray optJSONArray2 = jSONObject2.optJSONArray(APPLICATION_GATEKEEPER_FIELD);
            if (optJSONArray2 == null) {
                optJSONArray2 = new org.json.JSONArray();
            }
            int length = optJSONArray2.length();
            if (length > 0) {
                while (true) {
                    int i2 = i + 1;
                    try {
                        org.json.JSONObject jSONObject3 = optJSONArray2.getJSONObject(i);
                        jSONObject.put(jSONObject3.getString(com.ironsource.X3.i.W), jSONObject3.getBoolean("value"));
                    } catch (org.json.JSONException e) {
                        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                        com.facebook.internal.Utility.logd(com.facebook.internal.Utility.LOG_TAG, e);
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            fetchedAppGateKeepers.put(applicationId, jSONObject);
        }
        return jSONObject;
    }

    private final boolean isTimestampValid(java.lang.Long timestamp2) {
        return timestamp2 != null && java.lang.System.currentTimeMillis() - timestamp2.longValue() < APPLICATION_GATEKEEPER_CACHE_TIMEOUT;
    }
}
