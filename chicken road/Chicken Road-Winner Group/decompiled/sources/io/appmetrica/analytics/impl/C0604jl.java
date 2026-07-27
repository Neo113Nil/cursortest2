package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.jl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604jl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final C0551hj f7638a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0540h8 f7639b;

    public C0604jl(ECommerceScreen eCommerceScreen) {
        this(new C0551hj(eCommerceScreen), new C0630kl());
    }

    public final InterfaceC0540h8 a() {
        return this.f7639b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f7639b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f7638a + ", converter=" + this.f7639b + '}';
    }

    public C0604jl(C0551hj c0551hj, InterfaceC0540h8 interfaceC0540h8) {
        this.f7638a = c0551hj;
        this.f7639b = interfaceC0540h8;
    }
}
