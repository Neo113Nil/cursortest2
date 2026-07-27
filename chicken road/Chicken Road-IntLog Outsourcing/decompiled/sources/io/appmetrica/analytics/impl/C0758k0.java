package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758k0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8597a = new HashMap();

    public final synchronized C0732j0 a(X4 x42, PublicLogger publicLogger, C0541bf c0541bf) {
        C0732j0 c0732j0;
        c0732j0 = (C0732j0) this.f8597a.get(x42.toString());
        if (c0732j0 == null) {
            C0707i0 d6 = c0541bf.d();
            c0732j0 = new C0732j0(d6.f8373a, d6.f8374b, new C1064vl(publicLogger, "[App Environment]"));
            this.f8597a.put(x42.toString(), c0732j0);
        }
        return c0732j0;
    }

    public final synchronized void a(C0707i0 c0707i0, C0541bf c0541bf) {
        c0541bf.a(c0707i0).b();
    }
}
