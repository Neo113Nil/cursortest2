package com.facebook.appevents.integrity;

/* compiled from: RedactedEventsManager.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\bj\b\u0012\u0004\u0012\u00020\u0007`\t0\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/appevents/integrity/RedactedEventsManager;", "", "()V", "enabled", "", "redactedEvents", "", "", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "disable", "", com.ironsource.mediationsdk.metadata.a.j, "getRedactionString", com.ironsource.X3.i.j0, "loadRedactedEvents", "processEventsRedaction", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class RedactedEventsManager {
    private static boolean enabled;
    public static final com.facebook.appevents.integrity.RedactedEventsManager INSTANCE = new com.facebook.appevents.integrity.RedactedEventsManager();
    private static java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> redactedEvents = new java.util.HashMap();

    private RedactedEventsManager() {
    }

    @kotlin.jvm.JvmStatic
    public static final void enable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.RedactedEventsManager.class)) {
            return;
        }
        try {
            INSTANCE.loadRedactedEvents();
            if (!redactedEvents.isEmpty()) {
                enabled = true;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.RedactedEventsManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void disable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.RedactedEventsManager.class)) {
            return;
        }
        try {
            enabled = false;
            redactedEvents = new java.util.HashMap();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.RedactedEventsManager.class);
        }
    }

    private final void loadRedactedEvents() {
        int length;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            int i = 0;
            com.facebook.internal.FetchedAppSettings queryAppSettings = com.facebook.internal.FetchedAppSettingsManager.queryAppSettings(com.facebook.FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null) {
                return;
            }
            try {
                redactedEvents = new java.util.HashMap();
                org.json.JSONArray redactedEvents2 = queryAppSettings.getRedactedEvents();
                if (redactedEvents2 == null || redactedEvents2.length() == 0 || (length = redactedEvents2.length()) <= 0) {
                    return;
                }
                while (true) {
                    int i2 = i + 1;
                    org.json.JSONObject jSONObject = redactedEvents2.getJSONObject(i);
                    boolean has = jSONObject.has(com.ironsource.X3.i.W);
                    boolean has2 = jSONObject.has("value");
                    if (has && has2) {
                        java.lang.String redactedString = jSONObject.getString(com.ironsource.X3.i.W);
                        org.json.JSONArray jSONArray = jSONObject.getJSONArray("value");
                        if (redactedString != null) {
                            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                            java.util.HashSet<java.lang.String> convertJSONArrayToHashSet = com.facebook.internal.Utility.convertJSONArrayToHashSet(jSONArray);
                            if (convertJSONArrayToHashSet != null) {
                                java.util.Map<java.lang.String, java.util.HashSet<java.lang.String>> map = redactedEvents;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(redactedString, "redactedString");
                                map.put(redactedString, convertJSONArrayToHashSet);
                            }
                        }
                    }
                    if (i2 >= length) {
                        return;
                    } else {
                        i = i2;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String processEventsRedaction(java.lang.String eventName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.RedactedEventsManager.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (enabled) {
                java.lang.String redactionString = INSTANCE.getRedactionString(eventName);
                if (redactionString != null) {
                    return redactionString;
                }
            }
            return eventName;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.RedactedEventsManager.class);
            return null;
        }
    }

    private final java.lang.String getRedactionString(java.lang.String eventName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            for (java.lang.String str : redactedEvents.keySet()) {
                java.util.HashSet<java.lang.String> hashSet = redactedEvents.get(str);
                if (hashSet != null && hashSet.contains(eventName)) {
                    return str;
                }
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
