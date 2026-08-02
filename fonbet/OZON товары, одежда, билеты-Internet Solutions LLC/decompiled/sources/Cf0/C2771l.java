package Cf0;

import pf0.AbstractC8922e;
import pf0.EnumC8923f;

/* renamed from: Cf0.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2771l extends AbstractC8922e {

    /* renamed from: a, reason: collision with root package name */
    private final pf0.j f4931a = pf0.j.PROD_BUILDS_ALL_USERS;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC8923f f4932b = EnumC8923f.NetworkInterceptor;

    /* renamed from: c, reason: collision with root package name */
    private final Uf0.a f4933c = new Uf0.a();

    /* renamed from: d, reason: collision with root package name */
    private final String f4934d = "domainReachability";

    C2771l() {
    }

    @Override // pf0.AbstractC8922e
    public final We.B getInterceptor() {
        return this.f4933c;
    }

    @Override // pf0.AbstractC8922e
    public final String getKey() {
        return this.f4934d;
    }

    @Override // pf0.AbstractC8922e
    public final pf0.j getOzonNetworkDevToolsLevel() {
        return this.f4931a;
    }

    @Override // pf0.AbstractC8922e
    public final EnumC8923f getType() {
        return this.f4932b;
    }
}
