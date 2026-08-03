package com.ironsource;

/* loaded from: classes5.dex */
public final class I0 implements com.ironsource.InterfaceC3245qf<org.json.JSONObject>, com.ironsource.InterfaceC3209of<com.ironsource.G0> {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.ironsource.C3277sc> f5749a = new java.util.LinkedHashMap();

    @Override // com.ironsource.InterfaceC3004d7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject a(com.ironsource.EnumC3227pf mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.String, com.ironsource.C3277sc> entry : this.f5749a.entrySet()) {
            java.lang.String key = entry.getKey();
            org.json.JSONObject a2 = entry.getValue().a(mode);
            if (a2.length() > 0) {
                jSONObject.put(kotlin.text.StringsKt.substringAfterLast$default(key, "_", (java.lang.String) null, 2, (java.lang.Object) null), a2);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC3209of
    public void a(com.ironsource.G0 record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "record");
        java.lang.String d = record.d();
        java.util.Map<java.lang.String, com.ironsource.C3277sc> map = this.f5749a;
        com.ironsource.C3277sc c3277sc = map.get(d);
        if (c3277sc == null) {
            c3277sc = new com.ironsource.C3277sc();
            map.put(d, c3277sc);
        }
        c3277sc.a(record.a(new com.ironsource.H0()));
    }
}
