package Kb0;

import pf0.AbstractC8922e;
import pf0.EnumC8923f;

/* loaded from: classes3.dex */
public final class H extends AbstractC8922e {

    /* renamed from: a, reason: collision with root package name */
    private final pf0.j f15455a = pf0.j.PROD_BUILDS_ALL_USERS;

    /* renamed from: b, reason: collision with root package name */
    private final String f15456b = "ozonIdResetCookie";

    /* renamed from: c, reason: collision with root package name */
    private final EnumC8923f f15457c = EnumC8923f.NetworkInterceptor;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3487w f15458d;

    H(C3487w c3487w) {
        this.f15458d = c3487w;
    }

    @Override // pf0.AbstractC8922e
    public final We.B getInterceptor() {
        return this.f15458d.p().getValue();
    }

    @Override // pf0.AbstractC8922e
    public final String getKey() {
        return this.f15456b;
    }

    @Override // pf0.AbstractC8922e
    public final pf0.j getOzonNetworkDevToolsLevel() {
        return this.f15455a;
    }

    @Override // pf0.AbstractC8922e
    public final EnumC8923f getType() {
        return this.f15457c;
    }
}
