package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0609k0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7678a = new HashMap();

    public final synchronized C0583j0 a(X4 x4, PublicLogger publicLogger, C0392bf c0392bf) {
        C0583j0 c0583j0;
        c0583j0 = (C0583j0) this.f7678a.get(x4.toString());
        if (c0583j0 == null) {
            C0558i0 d3 = c0392bf.d();
            c0583j0 = new C0583j0(d3.f7467a, d3.f7468b, new C0915vl(publicLogger, "[App Environment]"));
            this.f7678a.put(x4.toString(), c0583j0);
        }
        return c0583j0;
    }

    public final synchronized void a(C0558i0 c0558i0, C0392bf c0392bf) {
        c0392bf.a(c0558i0).b();
    }
}
