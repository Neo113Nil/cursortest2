package com.ironsource;

/* renamed from: com.ironsource.ig, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3102ig {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String[] f6315a = com.ironsource.C3085hg.f6295a.a();
    private final com.ironsource.O6 b = new com.ironsource.O6();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the new method getToken(context: Context)")
    public final org.json.JSONObject a() {
        org.json.JSONObject a2 = this.b.a(this.f6315a);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(a2);
    }

    public final org.json.JSONObject a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        org.json.JSONObject a2 = this.b.a(context, this.f6315a);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
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
