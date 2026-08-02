package Cf0;

import Cf0.M;
import pf0.AbstractC8922e;
import pf0.EnumC8923f;

/* renamed from: Cf0.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2770k extends AbstractC8922e {

    /* renamed from: a, reason: collision with root package name */
    private final pf0.j f4927a = pf0.j.PROD_BUILDS_OZON_QA;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC8923f f4928b = EnumC8923f.NetworkInterceptor;

    /* renamed from: c, reason: collision with root package name */
    private final M f4929c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4930d;

    C2770k(C2761b c2761b) {
        Ld0.c cVar;
        M m11 = new M();
        cVar = c2761b.f4888a;
        m11.b(cVar.c().b() == Nd0.b.DEBUG ? M.a.BODY : M.a.NONE);
        this.f4929c = m11;
        this.f4930d = "httpLogging";
    }

    @Override // pf0.AbstractC8922e
    public final We.B getInterceptor() {
        return this.f4929c;
    }

    @Override // pf0.AbstractC8922e
    public final String getKey() {
        return this.f4930d;
    }

    @Override // pf0.AbstractC8922e
    public final pf0.j getOzonNetworkDevToolsLevel() {
        return this.f4927a;
    }

    @Override // pf0.AbstractC8922e
    public final EnumC8923f getType() {
        return this.f4928b;
    }
}
