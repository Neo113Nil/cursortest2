package com.applovin.impl;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public class o0 extends n5 {
    private final String g;
    private final com.applovin.impl.sdk.network.a h;

    public o0(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
        super("CommunicatorRequestTask", lVar, str);
        this.g = str;
        this.h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4351a.s0().a(new a(this.h, this.f4351a, d()));
    }

    class a extends r6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, boolean z) {
            super(aVar, lVar, z);
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            this.f4351a.u().a(o0.this.g, o0.this.h.f(), i, jSONObject, null, true);
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            this.f4351a.u().a(o0.this.g, o0.this.h.f(), i, jSONObject, str2, false);
        }
    }
}
