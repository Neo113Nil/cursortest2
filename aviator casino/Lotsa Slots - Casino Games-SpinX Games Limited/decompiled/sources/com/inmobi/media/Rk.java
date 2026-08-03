package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Rk {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2271aa f4941a;

    public Rk(com.inmobi.media.C2271aa mConfigIncludeIdMaskMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mConfigIncludeIdMaskMap, "mConfigIncludeIdMaskMap");
        this.f4941a = mConfigIncludeIdMaskMap;
    }

    public final java.util.HashMap a() {
        com.inmobi.media.C2764t1 c2764t1;
        java.lang.String str;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        try {
            if (this.f4941a.a() && (c2764t1 = com.inmobi.media.Qk.f4922a) != null && (str = c2764t1.b) != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                hashMap2.put("GPID", str);
            }
        } catch (java.lang.Exception unused) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Rk", "getSimpleName(...)");
        }
        java.lang.String jSONObject = new org.json.JSONObject(hashMap2).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        hashMap.put("u-id-map", jSONObject);
        return hashMap;
    }
}
