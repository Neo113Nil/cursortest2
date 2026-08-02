package Cf0;

import pf0.AbstractC8922e;
import pf0.EnumC8923f;

/* renamed from: Cf0.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2772m extends AbstractC8922e {

    /* renamed from: a, reason: collision with root package name */
    private final pf0.j f4935a = pf0.j.PROD_BUILDS_ALL_USERS;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC8923f f4936b = EnumC8923f.PerformanceNetworkInterceptor;

    /* renamed from: c, reason: collision with root package name */
    private final P f4937c = new P();

    /* renamed from: d, reason: collision with root package name */
    private final String f4938d = "requestPrepareTime";

    C2772m() {
    }

    @Override // pf0.AbstractC8922e
    public final We.B getInterceptor() {
        return this.f4937c;
    }

    @Override // pf0.AbstractC8922e
    public final String getKey() {
        return this.f4938d;
    }

    @Override // pf0.AbstractC8922e
    public final pf0.j getOzonNetworkDevToolsLevel() {
        return this.f4935a;
    }

    @Override // pf0.AbstractC8922e
    public final EnumC8923f getType() {
        return this.f4936b;
    }
}
