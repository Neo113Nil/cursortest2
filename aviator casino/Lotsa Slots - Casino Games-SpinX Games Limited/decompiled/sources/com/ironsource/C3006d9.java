package com.ironsource;

/* renamed from: com.ironsource.d9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3006d9 {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList<java.lang.String> f6200a = new java.util.ArrayList<>(new com.ironsource.C2952a9().a());
    private final com.ironsource.O6 b = new com.ironsource.O6();

    public final org.json.JSONObject a() {
        org.json.JSONObject a2 = this.b.a(this.f6200a);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        return a2;
    }
}
