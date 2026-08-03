package com.inmobi.media;

/* renamed from: com.inmobi.media.p4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2660p4 extends com.inmobi.media.D9 {
    public final java.lang.String b;
    public final java.util.List c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2660p4(java.lang.String url, java.lang.String accountId, java.util.List configRequestContexts, boolean z) {
        super(url);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "accountId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configRequestContexts, "configRequestContexts");
        this.b = accountId;
        this.c = configRequestContexts;
        this.d = z;
    }

    public final com.inmobi.media.Te a() {
        java.util.List<com.inmobi.media.C2687q4> list = this.c;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.inmobi.media.C2687q4 c2687q4 : list) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.ironsource.B5.q, c2687q4.b.getType());
            jSONObject.put("t", c2687q4.b.getLastUpdateTimeStamp());
            jSONArray.put(jSONObject);
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("im-accid", this.b);
        linkedHashMap.put("p", jSONArray2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        org.json.JSONObject b = com.inmobi.media.AbstractC2268a7.b();
        if (b != null) {
            java.lang.String jSONObject2 = b.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            linkedHashMap.put("consentObject", jSONObject2);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(com.inmobi.media.A1.e);
        linkedHashMap.putAll(com.inmobi.media.B5.f4614a.a(false));
        linkedHashMap.putAll(com.inmobi.media.D8.a());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", java.lang.String.valueOf((int) com.inmobi.media.A1.f));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        if (this.d) {
            linkedHashMap2.put("rip", "true");
        }
        return new com.inmobi.media.Te(this.f4657a, linkedHashMap2, null, new com.inmobi.media.C2321c7(linkedHashMap), null, 52);
    }
}
