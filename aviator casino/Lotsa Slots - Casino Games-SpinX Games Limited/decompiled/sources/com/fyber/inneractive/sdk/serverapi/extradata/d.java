package com.fyber.inneractive.sdk.serverapi.extradata;

/* loaded from: classes3.dex */
public final class d {
    public com.fyber.inneractive.sdk.config.global.r f;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f4265a = new java.util.concurrent.ConcurrentHashMap();
    public final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.ConcurrentHashMap d = new java.util.concurrent.ConcurrentHashMap();
    public final java.util.concurrent.ConcurrentHashMap e = new java.util.concurrent.ConcurrentHashMap();
    public int g = -1;

    public final com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters a(int i) {
        if (i <= 0) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sExtra data size limit is invalid: %s", "UserExtraDataManager", java.lang.Integer.valueOf(i));
            return null;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sExtra data token size limit: %s", "UserExtraDataManager", java.lang.Integer.valueOf(i));
        com.fyber.inneractive.sdk.bidder.k kVar = (com.fyber.inneractive.sdk.bidder.k) a(com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.newBuilder(), new com.fyber.inneractive.sdk.serverapi.extradata.a());
        if (kVar == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sExtra data token is empty", "UserExtraDataManager");
            return null;
        }
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParameters = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar.a();
        java.lang.String encodeToString = android.util.Base64.encodeToString(tokenParametersOuterClass$TokenParameters.toByteArray(), 2);
        if (encodeToString == null) {
            return null;
        }
        int length = encodeToString.length();
        com.fyber.inneractive.sdk.util.IAlog.a("%sExtra data token size is: %s", "UserExtraDataManager", java.lang.Integer.valueOf(length));
        if (length <= i) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sReturning extra data token", "UserExtraDataManager");
            return tokenParametersOuterClass$TokenParameters;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sTrimming extra data from token", "UserExtraDataManager");
        if (this.c.compareAndSet(false, true)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("reason", "Token with extra data exceeded limit");
            hashMap.put(com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, new org.json.JSONArray((java.util.Collection) this.d.keySet()));
            a(hashMap);
        }
        return null;
    }

    public final java.lang.Object a(java.lang.Object obj, com.fyber.inneractive.sdk.serverapi.extradata.c cVar) {
        java.lang.Integer num;
        com.fyber.inneractive.sdk.config.v vVar;
        int i;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f;
        if (rVar != null) {
            java.lang.Boolean c = ((com.fyber.inneractive.sdk.config.global.features.g) rVar.a(com.fyber.inneractive.sdk.config.global.features.g.class)).c(com.ironsource.mediationsdk.metadata.a.j);
            boolean booleanValue = c != null ? c.booleanValue() : false;
            com.fyber.inneractive.sdk.util.IAlog.a("ExtraDataFeature %s", java.lang.String.valueOf(booleanValue));
            if (booleanValue) {
                if (this.d.isEmpty()) {
                    return null;
                }
                for (java.util.Map.Entry entry : this.d.entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    java.lang.String str2 = (java.lang.String) entry.getValue();
                    if (!this.e.containsKey(str)) {
                        if (str != null) {
                            java.util.Set set = (java.util.Set) this.f4265a.get("unsupported_keys");
                            if (set == null) {
                                set = new java.util.HashSet();
                            }
                            set.add(str);
                            this.f4265a.put("unsupported_keys", set);
                        }
                        com.fyber.inneractive.sdk.util.IAlog.a("%sCould not set extra data for unsupported key: %s", "UserExtraDataManager", str);
                        this.d.remove(str);
                    } else {
                        if (this.g == -1) {
                            com.fyber.inneractive.sdk.config.s sVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.t;
                            if (sVar == null) {
                                com.fyber.inneractive.sdk.util.IAlog.b("%sGlobalConfigResolver is null, cannot resolve ExtraDataValueMaxLength", new java.lang.Object[0]);
                            } else {
                                com.fyber.inneractive.sdk.config.o oVar = sVar.b;
                                oVar.getClass();
                                try {
                                    i = java.lang.Integer.parseInt(oVar.a("edvml", java.lang.Integer.toString(512)));
                                } catch (java.lang.Throwable unused) {
                                    i = 512;
                                }
                                int i2 = i >= 1 ? i : 512;
                                this.g = i2;
                                com.fyber.inneractive.sdk.util.IAlog.a("%sExtraDataValueMaxLength: %s", "UserExtraDataManager", java.lang.Integer.valueOf(i2));
                            }
                        }
                        if (str2.length() > this.g) {
                            if (str != null) {
                                java.util.Set set2 = (java.util.Set) this.f4265a.get("value_too_long_keys");
                                if (set2 == null) {
                                    set2 = new java.util.HashSet();
                                }
                                set2.add(str);
                                this.f4265a.put("value_too_long_keys", set2);
                            }
                            com.fyber.inneractive.sdk.util.IAlog.a("%sCould not set extra data for key: %s, value is too long", "UserExtraDataManager", str);
                            this.d.remove(str);
                        } else if (str == null || (num = (java.lang.Integer) this.e.get(str)) == null || (num.intValue() == 1 && (com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild() || ((vVar = com.fyber.inneractive.sdk.config.u.f3639a.b) != null && vVar.b)))) {
                            com.fyber.inneractive.sdk.util.IAlog.a("%sCould not set extra data for key: %s, limited tracking is on", "UserExtraDataManager", str);
                            this.d.remove(str);
                        } else {
                            try {
                                cVar.a(str, str2, obj);
                            } catch (java.lang.Exception e) {
                                com.fyber.inneractive.sdk.util.IAlog.b("%sCouldn't process entry for %s. %s", "UserExtraDataManager", str, e.getMessage());
                            }
                        }
                    }
                }
                if (!this.f4265a.isEmpty() && this.b.compareAndSet(false, true)) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("reason", "Publisher failed to set extra data");
                    for (java.util.Map.Entry entry2 : this.f4265a.entrySet()) {
                        if (entry2.getValue() != null) {
                            hashMap.put((java.lang.String) entry2.getKey(), new org.json.JSONArray((java.util.Collection) new java.util.ArrayList((java.util.Collection) entry2.getValue())));
                        }
                    }
                    a(hashMap);
                }
                if (cVar.a(obj)) {
                    return null;
                }
                return obj;
            }
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sFeature is disabled, not providing extra data", "UserExtraDataManager");
        return null;
    }

    public static void a(java.util.HashMap hashMap) {
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.FIRST_PARTY_EXTRA_DATA_ERROR);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            try {
                jSONObject.put(str, value);
            } catch (java.lang.Exception unused) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", str, value);
            }
        }
        wVar.f.put(jSONObject);
        wVar.a((java.lang.String) null);
    }
}
