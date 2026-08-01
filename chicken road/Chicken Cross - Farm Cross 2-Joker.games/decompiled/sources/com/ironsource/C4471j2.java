package com.ironsource;

import com.ironsource.mediationsdk.e;
import java.net.URL;
import org.json.JSONObject;

/* renamed from: com.ironsource.j2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4471j2 extends e.a {
    public C4471j2(S1 s1, URL url, JSONObject jSONObject, boolean z, C4597q2 c4597q2) {
        super(s1, url, jSONObject, z, c4597q2);
    }

    @Override // com.ironsource.mediationsdk.e.a
    protected void a(boolean z, S1 s1, long j) {
        try {
            if (z) {
                ((InterfaceC4346c2) s1).a(this.b, this.f + 1, j, this.j, this.i);
            } else {
                s1.a(this.c, this.d, this.f + 1, this.g, j);
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
            s1.a(1009, e.getMessage(), this.f + 1, this.g, j);
        }
    }
}
