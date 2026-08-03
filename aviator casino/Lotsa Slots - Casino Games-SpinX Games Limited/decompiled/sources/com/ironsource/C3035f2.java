package com.ironsource;

/* renamed from: com.ironsource.f2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3035f2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.M6.a f6236a;
    private final java.util.ArrayList<java.lang.String> b = new java.util.ArrayList<>(new com.ironsource.C2999d2().a());
    private final com.ironsource.O6 c = new com.ironsource.O6();

    public C3035f2(com.ironsource.M6.a aVar) {
        this.f6236a = aVar;
    }

    public final org.json.JSONObject a() {
        com.ironsource.M6.a aVar = this.f6236a;
        org.json.JSONObject a2 = aVar != null ? this.c.a(this.b, aVar) : null;
        if (a2 == null) {
            a2 = this.c.a(this.b);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        return a(a2);
    }

    private final org.json.JSONObject a(org.json.JSONObject jSONObject) {
        org.json.JSONObject b = com.ironsource.P6.b(jSONObject.optJSONObject(com.ironsource.M6.u));
        if (b != null) {
            jSONObject.put(com.ironsource.M6.u, b);
        }
        return jSONObject;
    }
}
