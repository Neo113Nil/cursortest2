package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class x0 extends t0 {
    public final String q;
    public final String r;
    public final AtomicInteger s;

    public x0(e eVar, String str, String str2) {
        super(eVar, g0.c.a(), null);
        this.s = new AtomicInteger();
        this.r = str;
        this.q = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i) {
        try {
            o0 o0Var = new o0();
            o0Var.f5505a = String.valueOf(i);
            return o0Var;
        } catch (Exception e) {
            IAlog.a("failed parse event network request", e, new Object[0]);
            throw new n0(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final byte[] f() {
        byte[] bArr = new byte[0];
        try {
            IAlog.a("NetworkRequestEvent: network request body %s", this.q);
            return this.q.getBytes(StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return bArr;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return ((int) Math.pow(2.0d, this.s.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.r;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return this.s.getAndIncrement() < 4;
    }
}
