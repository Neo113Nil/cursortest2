package Cf0;

import Xe.C4889a;
import pf0.AbstractC8922e;
import pf0.EnumC8923f;

/* renamed from: Cf0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2760a extends AbstractC8922e {

    /* renamed from: a, reason: collision with root package name */
    private final pf0.j f4884a = pf0.j.PROD_BUILDS_ALL_USERS;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC8923f f4885b = EnumC8923f.AppInterceptor;

    /* renamed from: c, reason: collision with root package name */
    private final C4889a f4886c = C4889a.f34418a;

    /* renamed from: d, reason: collision with root package name */
    private final String f4887d = "brotli";

    C2760a() {
    }

    @Override // pf0.AbstractC8922e
    public final We.B getInterceptor() {
        return this.f4886c;
    }

    @Override // pf0.AbstractC8922e
    public final String getKey() {
        return this.f4887d;
    }

    @Override // pf0.AbstractC8922e
    public final pf0.j getOzonNetworkDevToolsLevel() {
        return this.f4884a;
    }

    @Override // pf0.AbstractC8922e
    public final EnumC8923f getType() {
        return this.f4885b;
    }
}
