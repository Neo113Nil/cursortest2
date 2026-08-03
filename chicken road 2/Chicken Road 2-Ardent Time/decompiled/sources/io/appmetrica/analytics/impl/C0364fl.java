package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364fl extends io.appmetrica.analytics.ecommerce.ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0285cj f5907a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0248b8 f5908b;

    public C0364fl(io.appmetrica.analytics.ecommerce.ECommerceScreen eCommerceScreen) {
        this(new io.appmetrica.analytics.impl.C0285cj(eCommerceScreen), new io.appmetrica.analytics.impl.C0390gl());
    }

    public final io.appmetrica.analytics.impl.InterfaceC0248b8 a() {
        return this.f5908b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final java.lang.String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final java.util.List<io.appmetrica.analytics.impl.Di> toProto() {
        return (java.util.List) this.f5908b.fromModel(this);
    }

    public final java.lang.String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f5907a + ", converter=" + this.f5908b + '}';
    }

    public C0364fl(io.appmetrica.analytics.impl.C0285cj c0285cj, io.appmetrica.analytics.impl.InterfaceC0248b8 interfaceC0248b8) {
        this.f5907a = c0285cj;
        this.f5908b = interfaceC0248b8;
    }
}
