package Df0;

import We.B;
import pf0.AbstractC8922e;
import pf0.EnumC8923f;
import pf0.j;
import q20.InterfaceC8979b;

/* loaded from: classes3.dex */
public final class h extends AbstractC8922e {

    /* renamed from: a, reason: collision with root package name */
    private final e f6703a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6704b = "cronet";

    /* renamed from: c, reason: collision with root package name */
    private final j f6705c = j.PROD_BUILDS_ALL_USERS;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC8923f f6706d = EnumC8923f.AppInterceptor;

    h(Ga.a aVar, InterfaceC8979b interfaceC8979b, pf0.i iVar) {
        this.f6703a = new e(aVar, interfaceC8979b, iVar);
    }

    @Override // pf0.AbstractC8922e
    public final B getInterceptor() {
        return this.f6703a;
    }

    @Override // pf0.AbstractC8922e
    public final String getKey() {
        return this.f6704b;
    }

    @Override // pf0.AbstractC8922e
    public final j getOzonNetworkDevToolsLevel() {
        return this.f6705c;
    }

    @Override // pf0.AbstractC8922e
    public final EnumC8923f getType() {
        return this.f6706d;
    }
}
