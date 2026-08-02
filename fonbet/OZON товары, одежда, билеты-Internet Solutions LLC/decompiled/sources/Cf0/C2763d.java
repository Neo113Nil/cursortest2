package Cf0;

import We.E;
import cg0.C5829a;
import pf0.AbstractC8922e;
import pf0.EnumC8923f;

/* renamed from: Cf0.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2763d extends AbstractC8922e {

    /* renamed from: c, reason: collision with root package name */
    private final C5829a f4901c;

    /* renamed from: a, reason: collision with root package name */
    private final pf0.j f4899a = pf0.j.PROD_BUILDS_OZON_EMPLOYEE;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC8923f f4900b = EnumC8923f.NetworkInterceptor;

    /* renamed from: d, reason: collision with root package name */
    private final String f4902d = "correctOrder";

    C2763d(E.a aVar, boolean z11) {
        this.f4901c = new C5829a(aVar, z11);
    }

    @Override // pf0.AbstractC8922e
    public final We.B getInterceptor() {
        return this.f4901c;
    }

    @Override // pf0.AbstractC8922e
    public final String getKey() {
        return this.f4902d;
    }

    @Override // pf0.AbstractC8922e
    public final pf0.j getOzonNetworkDevToolsLevel() {
        return this.f4899a;
    }

    @Override // pf0.AbstractC8922e
    public final EnumC8923f getType() {
        return this.f4900b;
    }
}
