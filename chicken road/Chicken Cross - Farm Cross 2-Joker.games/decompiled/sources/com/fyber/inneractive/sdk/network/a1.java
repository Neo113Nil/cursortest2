package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class a1 extends t0 {
    public final byte[] q;
    public final AtomicInteger r;

    public a1(com.fyber.inneractive.sdk.ignite.b bVar, byte[] bArr, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(bVar, g0.c.a(), rVar);
        this.r = new AtomicInteger();
        this.q = bArr;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i) {
        try {
            o0 o0Var = new o0();
            InputStream inputStream = lVar.c;
            if (inputStream != null) {
                String str = new String(com.fyber.inneractive.sdk.util.v.a(inputStream), "UTF-8");
                IgniteResponseOuterClass$IgniteResponse parseFrom = IgniteResponseOuterClass$IgniteResponse.parseFrom(str.getBytes());
                o0Var.b = str;
                o0Var.f5505a = parseFrom;
            }
            return o0Var;
        } catch (Exception e) {
            IAlog.a("failed parse ignite network request", e, new Object[0]);
            throw new n0(e);
        } catch (Throwable th) {
            IAlog.a("failed parse ignite network request", th, new Object[0]);
            throw new n0("failed to parse ignite network request");
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final byte[] f() {
        return this.q;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return ((int) Math.pow(2.0d, this.r.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String n() {
        return "application/x-protobuf; messageType=IgniteRequest";
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return "https://init-mp.fyber.com/init";
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return this.r.getAndIncrement() < 4;
    }
}
