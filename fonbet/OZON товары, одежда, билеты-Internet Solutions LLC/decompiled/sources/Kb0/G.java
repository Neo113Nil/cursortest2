package Kb0;

import Sc.InterfaceC4008j;
import pf0.AbstractC8922e;
import pf0.EnumC8923f;
import yc0.C10882a;

/* loaded from: classes3.dex */
public final class G extends AbstractC8922e {

    /* renamed from: a, reason: collision with root package name */
    private final pf0.j f15450a = pf0.j.PROD_BUILDS_ALL_USERS;

    /* renamed from: b, reason: collision with root package name */
    private final String f15451b = "ozonIdHeaders";

    /* renamed from: c, reason: collision with root package name */
    private final EnumC8923f f15452c = EnumC8923f.AppInterceptor;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3487w f15453d;

    G(C3487w c3487w) {
        this.f15453d = c3487w;
    }

    @Override // pf0.AbstractC8922e
    public final We.B getInterceptor() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.f15453d.f15757j;
        return (C10882a) interfaceC4008j.getValue();
    }

    @Override // pf0.AbstractC8922e
    public final String getKey() {
        return this.f15451b;
    }

    @Override // pf0.AbstractC8922e
    public final pf0.j getOzonNetworkDevToolsLevel() {
        return this.f15450a;
    }

    @Override // pf0.AbstractC8922e
    public final EnumC8923f getType() {
        return this.f15452c;
    }
}
