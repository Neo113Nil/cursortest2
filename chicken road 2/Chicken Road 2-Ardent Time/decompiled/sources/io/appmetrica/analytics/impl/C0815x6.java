package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815x6 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Tl f7097a = new io.appmetrica.analytics.impl.Tl();

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f7098b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Map f7099c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.internal.IdentifiersResult f7100d;

    public C0815x6() {
        i1.C0200s c0200s = i1.C0200s.f3326a;
        this.f7098b = c0200s;
        this.f7099c = c0200s;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3 A[Catch: all -> 0x0009, TRY_ENTER, TryCatch #3 {all -> 0x0009, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000f, B:10:0x0016, B:12:0x001a, B:18:0x0022, B:22:0x0059, B:23:0x006e, B:25:0x0074, B:29:0x0093, B:30:0x008e, B:33:0x00a4, B:34:0x00bb, B:36:0x00c1, B:40:0x00e3, B:42:0x00e5, B:49:0x00e9, B:51:0x00a2, B:52:0x002a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        java.util.HashMap hashMap;
        java.util.Map map;
        java.util.RandomAccess a2;
        try {
            io.appmetrica.analytics.internal.IdentifiersResult identifiersResult2 = this.f7100d;
            java.lang.String str = identifiersResult2 != null ? identifiersResult2.id : null;
            if (str != null) {
                if (str.length() != 0) {
                    java.lang.String str2 = identifiersResult.id;
                    if (str2 != null) {
                        if (str2.length() == 0) {
                        }
                    }
                }
            }
            this.f7100d = identifiersResult;
            java.lang.String str3 = identifiersResult.id;
            if (str3 == null) {
                hashMap = null;
            } else {
                hashMap = new java.util.HashMap();
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str3);
                    java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        try {
                            java.util.ArrayList a3 = io.appmetrica.analytics.impl.AbstractC0380gb.a(new org.json.JSONArray(jSONObject.optString(next)));
                            if (a3 != null) {
                                hashMap.put(next, a3);
                            }
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                } catch (java.lang.Throwable unused2) {
                }
            }
            if (hashMap != null) {
                map = new java.util.LinkedHashMap(i1.AbstractC0203v.E(hashMap.size()));
                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    java.util.List list = (java.util.List) entry.getValue();
                    map.put(key, new io.appmetrica.analytics.internal.IdentifiersResult(java.lang.String.valueOf(io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) list) ? null : new org.json.JSONArray((java.util.Collection) list)), identifiersResult.status, identifiersResult.errorExplanation));
                }
            } else {
                map = i1.C0200s.f3326a;
            }
            this.f7099c = map;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(i1.AbstractC0203v.E(map.size()));
            for (java.util.Map.Entry entry2 : map.entrySet()) {
                java.lang.Object key2 = entry2.getKey();
                java.lang.String str4 = ((io.appmetrica.analytics.internal.IdentifiersResult) entry2.getValue()).id;
                if (str4 != null) {
                    try {
                        a2 = io.appmetrica.analytics.impl.AbstractC0380gb.a(new org.json.JSONArray(str4));
                    } catch (java.lang.Throwable unused3) {
                    }
                    if (a2 != null) {
                        a2 = i1.C0199r.f3325a;
                    }
                    linkedHashMap.put(key2, a2);
                }
                a2 = null;
                if (a2 != null) {
                }
                linkedHashMap.put(key2, a2);
            }
            this.f7098b = linkedHashMap;
        } finally {
        }
    }

    public final synchronized void a(java.util.List list, java.util.HashMap hashMap) {
        io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus identifierStatus;
        try {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                java.util.List list2 = (java.util.List) this.f7098b.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            io.appmetrica.analytics.impl.Tl tl = this.f7097a;
            java.lang.String a2 = io.appmetrica.analytics.impl.AbstractC0380gb.a((java.util.Map) linkedHashMap);
            io.appmetrica.analytics.internal.IdentifiersResult identifiersResult = this.f7100d;
            if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
                identifierStatus = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN;
            }
            hashMap.put("appmetrica_custom_sdk_hosts", tl.a(new io.appmetrica.analytics.internal.IdentifiersResult(a2, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
