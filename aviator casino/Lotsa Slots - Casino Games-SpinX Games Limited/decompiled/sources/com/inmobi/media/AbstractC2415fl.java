package com.inmobi.media;

/* renamed from: com.inmobi.media.fl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2415fl {
    /* JADX WARN: Removed duplicated region for block: B:33:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.inmobi.media.C2441gl a() {
        com.inmobi.media.C2935zh c2935zh = com.inmobi.media.AbstractC2676pj.f5394a;
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
        boolean enabled = ((com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getUnifiedIdServiceConfig().getEnabled();
        if (!enabled) {
            com.inmobi.unifiedId.InMobiUnifiedIdService.reset();
        }
        if (!enabled) {
            return new com.inmobi.media.C2441gl();
        }
        if (c()) {
            return new com.inmobi.media.C2441gl();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONObject a2 = com.inmobi.media.M9.a();
        java.util.Iterator<java.lang.String> keys = a2 != null ? a2.keys() : null;
        if (keys != null) {
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("src", next);
                    jSONObject.put("envelope", a2.get(next));
                    hashMap.put(next, jSONObject);
                } catch (org.json.JSONException e) {
                    kotlin.text.StringsKt.trimMargin$default(" Error in looping through publisher provided unif id " + e.getMessage() + "\n                                        " + a2.get(next) + "\n                    ", null, 1, null);
                }
            }
        }
        org.json.JSONObject b = com.inmobi.media.M9.b();
        boolean z = false;
        z = false;
        z = false;
        if (b != null) {
            try {
                if (b.has("ufids")) {
                    org.json.JSONArray jSONArray = b.getJSONArray("ufids");
                    int length = jSONArray.length();
                    boolean z2 = false;
                    boolean z3 = false;
                    for (int i = 0; i < length; i++) {
                        try {
                            java.lang.String string = jSONArray.getJSONObject(i).has("src") ? jSONArray.getJSONObject(i).getString("src") : null;
                            java.lang.String string2 = jSONArray.getJSONObject(i).has("envelope") ? jSONArray.getJSONObject(i).getString("envelope") : null;
                            if (java.lang.System.currentTimeMillis() > jSONArray.getJSONObject(i).getLong(com.helpshift.proactive.InAppViewConstants.EXPIRY)) {
                                z2 = true;
                            } else if (string != null && string2 != null) {
                                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                jSONObject2.put("src", string);
                                jSONObject2.put("envelope", string2);
                                hashMap.put(string, jSONObject2);
                                z3 = true;
                            }
                        } catch (org.json.JSONException e2) {
                            e = e2;
                            z = z3;
                            e.getMessage();
                            java.util.Objects.toString(b);
                            if (!hashMap.isEmpty()) {
                            }
                        }
                    }
                    if (z2) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.C2388el(null), 3, null);
                    }
                    z = z3;
                }
            } catch (org.json.JSONException e3) {
                e = e3;
            }
        }
        if (!hashMap.isEmpty()) {
            return new com.inmobi.media.C2441gl();
        }
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        for (java.lang.Object obj : hashMap.values()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
            jSONArray2.put((org.json.JSONObject) obj);
        }
        return new com.inmobi.media.C2441gl(jSONArray2.toString(), z);
    }

    public static boolean b(org.json.JSONObject jSONObject) {
        org.json.JSONArray jSONArray;
        if (jSONObject == null) {
            return true;
        }
        try {
            jSONArray = jSONObject.has("ufids") ? jSONObject.getJSONArray("ufids") : null;
        } catch (org.json.JSONException unused) {
        }
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static boolean c(org.json.JSONObject ufids) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ufids, "ufids");
        try {
            if (ufids.has("ufids")) {
                org.json.JSONArray jSONArray = ufids.getJSONArray("ufids");
                int length = jSONArray.length();
                z = true;
                for (int i = 0; i < length; i++) {
                    try {
                        z &= java.lang.System.currentTimeMillis() <= jSONArray.getJSONObject(i).getLong(com.helpshift.proactive.InAppViewConstants.EXPIRY);
                    } catch (org.json.JSONException unused) {
                        java.util.Objects.toString(ufids);
                        return !z;
                    }
                }
            } else {
                z = true;
            }
        } catch (org.json.JSONException unused2) {
            z = true;
        }
        return !z;
    }

    public static final void b(com.inmobi.unifiedId.InMobiUnifiedIdInterface inMobiUnifiedIdInterface, org.json.JSONObject jSONObject, java.lang.Error error) {
        if (inMobiUnifiedIdInterface != null) {
            inMobiUnifiedIdInterface.onFetchCompleted(jSONObject, error);
        }
    }

    public static org.json.JSONArray b() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject b = com.inmobi.media.M9.b();
        if (b != null) {
            try {
                if (b.has("ufids")) {
                    org.json.JSONArray jSONArray2 = b.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        java.lang.String string = jSONArray2.getJSONObject(i).has("src") ? jSONArray2.getJSONObject(i).getString("src") : null;
                        java.lang.String string2 = jSONArray2.getJSONObject(i).has(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE) ? jSONArray2.getJSONObject(i).getString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE) : null;
                        boolean z = java.lang.System.currentTimeMillis() > jSONArray2.getJSONObject(i).getLong(com.helpshift.proactive.InAppViewConstants.EXPIRY);
                        if (string != null && string2 != null) {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("src", string);
                            jSONObject.put(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE, string2);
                            jSONObject.put("expired", z);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (org.json.JSONException e) {
                e.getMessage();
                java.util.Objects.toString(b);
            }
        }
        return jSONArray;
    }

    public static boolean c() {
        com.inmobi.media.C2764t1 c2764t1 = com.inmobi.media.Qk.f4922a;
        java.lang.Boolean bool = c2764t1 != null ? c2764t1.c : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        if (booleanValue) {
            com.inmobi.unifiedId.InMobiUnifiedIdService.reset();
        }
        return booleanValue;
    }

    public static void a(final com.inmobi.unifiedId.InMobiUnifiedIdInterface inMobiUnifiedIdInterface, final org.json.JSONObject jSONObject, final java.lang.Error error) {
        short s;
        java.lang.String message = error != null ? error.getMessage() : null;
        if (kotlin.jvm.internal.Intrinsics.areEqual(message, com.inmobi.unifiedId.InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT)) {
            s = 93;
        } else {
            s = kotlin.jvm.internal.Intrinsics.areEqual(message, com.inmobi.unifiedId.InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT) ? (short) 94 : (short) -1;
        }
        if (s >= 0) {
            java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", java.lang.Short.valueOf(s)));
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("FetchCallbackFailure", mutableMapOf, com.inmobi.media.EnumC2728rk.f5431a);
        }
        com.inmobi.media.AbstractC2413fk.a(new java.lang.Runnable() { // from class: com.inmobi.media.fl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.AbstractC2415fl.b(com.inmobi.unifiedId.InMobiUnifiedIdInterface.this, jSONObject, error);
            }
        });
    }

    public static org.json.JSONObject a(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ufids")) {
                    org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        org.json.JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                        if (java.lang.System.currentTimeMillis() < jSONObject3.getLong(com.helpshift.proactive.InAppViewConstants.EXPIRY)) {
                            jSONArray.put(jSONObject3);
                        }
                    }
                }
            } catch (org.json.JSONException e) {
                e.getMessage();
                return null;
            }
        }
        if (jSONArray.length() <= 0) {
            return null;
        }
        jSONObject2.put("ufids", jSONArray);
        return jSONObject2;
    }

    public static org.json.JSONObject a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.has("ufids")) {
                    org.json.JSONArray jSONArray2 = jSONObject2.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        hashMap.put(jSONArray2.getJSONObject(i).getString("src"), jSONArray2.getJSONObject(i));
                    }
                }
            } catch (org.json.JSONException e) {
                e.getMessage();
                java.util.Objects.toString(jSONObject2);
                java.util.Objects.toString(jSONObject);
                return jSONObject3;
            }
        }
        if (jSONObject != null && jSONObject.has("ufids")) {
            org.json.JSONArray jSONArray3 = jSONObject.getJSONArray("ufids");
            int length2 = jSONArray3.length();
            for (int i2 = 0; i2 < length2; i2++) {
                hashMap.put(jSONArray3.getJSONObject(i2).getString("src"), jSONArray3.getJSONObject(i2));
            }
        }
        java.util.Collection values = hashMap.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            jSONArray.put((org.json.JSONObject) it.next());
        }
        jSONObject3.put("ufids", jSONArray);
        return jSONObject3;
    }
}
