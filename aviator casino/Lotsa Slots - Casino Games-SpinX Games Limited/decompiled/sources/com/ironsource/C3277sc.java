package com.ironsource;

/* renamed from: com.ironsource.sc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3277sc implements com.ironsource.InterfaceC3245qf<org.json.JSONObject>, com.ironsource.InterfaceC3209of<com.ironsource.C3242qc> {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.ironsource.C3105j1> f6589a = new java.util.LinkedHashMap();

    @Override // com.ironsource.InterfaceC3004d7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject a(com.ironsource.EnumC3227pf mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.String, com.ironsource.C3105j1> entry : this.f6589a.entrySet()) {
            java.lang.String key = entry.getKey();
            org.json.JSONArray a2 = entry.getValue().a(mode);
            if (a2.length() > 0) {
                jSONObject.put(key, a2);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC3209of
    public void a(com.ironsource.C3242qc record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "record");
        java.lang.String c = record.c();
        java.util.Map<java.lang.String, com.ironsource.C3105j1> map = this.f6589a;
        com.ironsource.C3105j1 c3105j1 = map.get(c);
        if (c3105j1 == null) {
            c3105j1 = new com.ironsource.C3105j1();
            map.put(c, c3105j1);
        }
        c3105j1.a(record.a(new com.ironsource.C3259rc()));
    }
}
