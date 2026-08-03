package com.ironsource;

/* renamed from: com.ironsource.l2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3142l2 extends com.ironsource.mediationsdk.e.a {
    public C3142l2(com.ironsource.U1 u1, java.net.URL url, org.json.JSONObject jSONObject, boolean z, com.ironsource.C3267s2 c3267s2) {
        super(u1, url, jSONObject, z, c3267s2);
    }

    @Override // com.ironsource.mediationsdk.e.a
    protected void a(boolean z, com.ironsource.U1 u1, long j) {
        try {
            if (z) {
                ((com.ironsource.InterfaceC3017e2) u1).a(this.b, this.f + 1, j, this.j, this.i);
            } else {
                u1.a(this.c, this.d, this.f + 1, this.g, j);
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            u1.a(1009, e.getMessage(), this.f + 1, this.g, j);
        }
    }
}
