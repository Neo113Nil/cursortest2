package Cf0;

import pf0.AbstractC8922e;
import pf0.EnumC8923f;

/* renamed from: Cf0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2766g extends AbstractC8922e {

    /* renamed from: a, reason: collision with root package name */
    private final pf0.j f4908a = pf0.j.QA_BUILDS_OR_AUTOTEST;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC8923f f4909b = EnumC8923f.AppInterceptor;

    /* renamed from: c, reason: collision with root package name */
    private final Yf0.e f4910c = new Yf0.e();

    /* renamed from: d, reason: collision with root package name */
    private final String f4911d = "mockServer";

    C2766g() {
    }

    @Override // pf0.AbstractC8922e
    public final We.B getInterceptor() {
        return this.f4910c;
    }

    @Override // pf0.AbstractC8922e
    public final String getKey() {
        return this.f4911d;
    }

    @Override // pf0.AbstractC8922e
    public final pf0.j getOzonNetworkDevToolsLevel() {
        return this.f4908a;
    }

    @Override // pf0.AbstractC8922e
    public final EnumC8923f getType() {
        return this.f4909b;
    }
}
