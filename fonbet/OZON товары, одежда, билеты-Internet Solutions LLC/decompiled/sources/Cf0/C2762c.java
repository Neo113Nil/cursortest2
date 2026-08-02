package Cf0;

import pf0.AbstractC8922e;
import pf0.EnumC8923f;

/* renamed from: Cf0.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2762c extends AbstractC8922e {

    /* renamed from: a, reason: collision with root package name */
    private final pf0.j f4895a = pf0.j.PROD_BUILDS_OZON_EMPLOYEE;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC8923f f4896b = EnumC8923f.NetworkInterceptor;

    /* renamed from: c, reason: collision with root package name */
    private final Vf0.g f4897c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4898d;

    C2762c(C2761b c2761b) {
        Ld0.c cVar;
        cVar = c2761b.f4888a;
        this.f4897c = new Vf0.g(cVar);
        this.f4898d = "extraHeaders";
    }

    @Override // pf0.AbstractC8922e
    public final We.B getInterceptor() {
        return this.f4897c;
    }

    @Override // pf0.AbstractC8922e
    public final String getKey() {
        return this.f4898d;
    }

    @Override // pf0.AbstractC8922e
    public final pf0.j getOzonNetworkDevToolsLevel() {
        return this.f4895a;
    }

    @Override // pf0.AbstractC8922e
    public final EnumC8923f getType() {
        return this.f4896b;
    }
}
