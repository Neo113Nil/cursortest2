package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.oa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4569oa {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC4533ma f8471a;

    public C4569oa(InterfaceC4533ma interfaceC4533ma) {
        this.f8471a = interfaceC4533ma;
    }

    public void a(C4551na c4551na, JSONObject jSONObject) {
        this.f8471a.a(false, c4551na.a(), jSONObject);
    }

    public void b(C4551na c4551na, JSONObject jSONObject) {
        this.f8471a.a(true, c4551na.d(), jSONObject);
    }
}
