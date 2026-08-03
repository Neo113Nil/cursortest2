package com.facebook.appevents.suggestedevents;

/* compiled from: PredictionHistoryManager.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\b\u0010\u0014\u001a\u00020\rH\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/appevents/suggestedevents/PredictionHistoryManager;", "", "()V", "CLICKED_PATH_STORE", "", com.facebook.appevents.suggestedevents.PredictionHistoryManager.SUGGESTED_EVENTS_HISTORY, "clickedViewPaths", "", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "shardPreferences", "Landroid/content/SharedPreferences;", "addPrediction", "", "pathID", "predictedEvent", "getPathID", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "text", "initAndWait", "queryEvent", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PredictionHistoryManager {
    private static final java.lang.String CLICKED_PATH_STORE = "com.facebook.internal.SUGGESTED_EVENTS_HISTORY";
    private static final java.lang.String SUGGESTED_EVENTS_HISTORY = "SUGGESTED_EVENTS_HISTORY";
    private static android.content.SharedPreferences shardPreferences;
    public static final com.facebook.appevents.suggestedevents.PredictionHistoryManager INSTANCE = new com.facebook.appevents.suggestedevents.PredictionHistoryManager();
    private static final java.util.Map<java.lang.String, java.lang.String> clickedViewPaths = new java.util.LinkedHashMap();
    private static final java.util.concurrent.atomic.AtomicBoolean initialized = new java.util.concurrent.atomic.AtomicBoolean(false);

    private PredictionHistoryManager() {
    }

    private final void initAndWait() {
        java.lang.String str = "";
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = initialized;
            if (atomicBoolean.get()) {
                return;
            }
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.SharedPreferences sharedPreferences = com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences(CLICKED_PATH_STORE, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            shardPreferences = sharedPreferences;
            java.util.Map<java.lang.String, java.lang.String> map = clickedViewPaths;
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            android.content.SharedPreferences sharedPreferences2 = shardPreferences;
            if (sharedPreferences2 != null) {
                java.lang.String string = sharedPreferences2.getString(SUGGESTED_EVENTS_HISTORY, "");
                if (string != null) {
                    str = string;
                }
                map.putAll(com.facebook.internal.Utility.jsonStrToMap(str));
                atomicBoolean.set(true);
                return;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("shardPreferences");
            throw null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void addPrediction(java.lang.String pathID, java.lang.String predictedEvent) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.PredictionHistoryManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathID, "pathID");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predictedEvent, "predictedEvent");
            if (!initialized.get()) {
                INSTANCE.initAndWait();
            }
            java.util.Map<java.lang.String, java.lang.String> map = clickedViewPaths;
            map.put(pathID, predictedEvent);
            android.content.SharedPreferences sharedPreferences = shardPreferences;
            if (sharedPreferences == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("shardPreferences");
                throw null;
            }
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            edit.putString(SUGGESTED_EVENTS_HISTORY, com.facebook.internal.Utility.mapToJsonStr(kotlin.collections.MapsKt.toMap(map))).apply();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.PredictionHistoryManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getPathID(android.view.View view, java.lang.String text) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.PredictionHistoryManager.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("text", text);
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    com.facebook.appevents.codeless.internal.ViewHierarchy viewHierarchy = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE;
                    view = com.facebook.appevents.codeless.internal.ViewHierarchy.getParentOfView(view);
                }
                jSONObject.put(com.facebook.appevents.internal.ViewHierarchyConstants.CLASS_NAME_KEY, jSONArray);
            } catch (org.json.JSONException unused) {
            }
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            return com.facebook.internal.Utility.sha256hash(jSONObject.toString());
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.PredictionHistoryManager.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String queryEvent(java.lang.String pathID) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.PredictionHistoryManager.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathID, "pathID");
            java.util.Map<java.lang.String, java.lang.String> map = clickedViewPaths;
            if (map.containsKey(pathID)) {
                return map.get(pathID);
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.PredictionHistoryManager.class);
            return null;
        }
    }
}
