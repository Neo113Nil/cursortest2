package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.jl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0753jl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final C0700hj f8555a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0689h8 f8556b;

    public C0753jl(ECommerceScreen eCommerceScreen) {
        this(new C0700hj(eCommerceScreen), new C0779kl());
    }

    public final InterfaceC0689h8 a() {
        return this.f8556b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f8556b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f8555a + ", converter=" + this.f8556b + '}';
    }

    public C0753jl(C0700hj c0700hj, InterfaceC0689h8 interfaceC0689h8) {
        this.f8555a = c0700hj;
        this.f8556b = interfaceC0689h8;
    }
}
