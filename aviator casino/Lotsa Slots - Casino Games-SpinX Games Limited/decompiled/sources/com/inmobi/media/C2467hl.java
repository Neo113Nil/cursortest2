package com.inmobi.media;

/* renamed from: com.inmobi.media.hl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2467hl extends com.inmobi.media.D9 {
    public final com.inmobi.media.Rk b;
    public final java.lang.String c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2467hl(java.lang.String url, com.inmobi.media.Rk uidMap, java.lang.String str, int i, int i2, int i3) {
        super(url);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uidMap, "uidMap");
        this.b = uidMap;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final com.inmobi.media.Te a() {
        java.lang.String str;
        com.inmobi.unifiedId.InMobiUserDataTypes obj;
        com.inmobi.unifiedId.InMobiUserDataTypes obj2;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Objects.toString(com.inmobi.media.C2373e7.f5172a);
        java.lang.String str2 = (java.lang.String) com.inmobi.media.AbstractC2332ch.a().get("u-age");
        if (str2 != null) {
        }
        java.lang.String jSONArray = com.inmobi.media.AbstractC2415fl.b().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
        linkedHashMap.put("ufids", jSONArray);
        com.inmobi.media.C2764t1 c2764t1 = com.inmobi.media.Qk.f4922a;
        java.lang.Boolean bool = c2764t1 != null ? c2764t1.c : null;
        if (bool == null || (str = bool.toString()) == null) {
            str = "true";
        }
        linkedHashMap.put(com.ironsource.M6.s, str);
        linkedHashMap.put("mk-version", com.inmobi.media.Yi.a());
        java.lang.String str3 = com.inmobi.media.A1.f4591a;
        if (str3 != null) {
        }
        linkedHashMap.put(com.ironsource.M6.d0, com.inmobi.media.Xi.c());
        linkedHashMap.put("ts", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        java.lang.String str4 = this.c;
        if (str4 != null) {
        }
        com.inmobi.unifiedId.InMobiUserDataModel inMobiUserDataModel = com.inmobi.media.C2373e7.b;
        if (inMobiUserDataModel == null || (obj = inMobiUserDataModel.getEmailId()) == null || (obj.getMd5() == null && obj.getSha1() == null && obj.getSha256() == null)) {
            obj = null;
        }
        if (obj != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
        }
        com.inmobi.unifiedId.InMobiUserDataModel inMobiUserDataModel2 = com.inmobi.media.C2373e7.b;
        if (inMobiUserDataModel2 == null || (obj2 = inMobiUserDataModel2.getPhoneNumber()) == null || (obj2.getMd5() == null && obj2.getSha1() == null && obj2.getSha256() == null)) {
            obj2 = null;
        }
        if (obj2 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "obj");
        }
        com.inmobi.unifiedId.InMobiUserDataModel inMobiUserDataModel3 = com.inmobi.media.C2373e7.b;
        java.util.HashMap<java.lang.String, java.lang.String> extras = inMobiUserDataModel3 != null ? inMobiUserDataModel3.getExtras() : null;
        if (extras != null) {
            linkedHashMap.putAll(extras);
        }
        linkedHashMap.putAll(this.b.a());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(com.inmobi.media.A1.e);
        linkedHashMap.putAll(com.inmobi.media.B5.f4614a.a(false));
        linkedHashMap.putAll(com.inmobi.media.D8.a());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        org.json.JSONObject b = com.inmobi.media.AbstractC2268a7.b();
        if (b != null) {
            java.lang.String jSONObject = b.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            linkedHashMap.put("consentObject", jSONObject);
        }
        java.lang.String str5 = this.f4657a;
        com.inmobi.media.C2321c7 c2321c7 = new com.inmobi.media.C2321c7(linkedHashMap);
        int i = this.d;
        int i2 = this.e;
        kotlin.ranges.IntRange intRange = com.inmobi.media.AbstractC2276af.f5103a;
        com.inmobi.media.Ni ni = new com.inmobi.media.Ni(i, i2 * 1000, 0);
        long j = this.f * 1000;
        return new com.inmobi.media.Te(str5, null, new com.inmobi.media.Gk(j, j, j), c2321c7, ni, 32);
    }
}
