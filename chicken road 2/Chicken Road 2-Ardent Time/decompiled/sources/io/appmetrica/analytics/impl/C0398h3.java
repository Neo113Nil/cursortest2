package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398h3 extends io.appmetrica.analytics.ecommerce.ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f6021d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6022e = 5;

    /* renamed from: a, reason: collision with root package name */
    public final int f6023a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0475k3 f6024b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0248b8 f6025c;

    public C0398h3(int i2, io.appmetrica.analytics.ecommerce.ECommerceCartItem eCommerceCartItem) {
        this(i2, new io.appmetrica.analytics.impl.C0475k3(eCommerceCartItem), new io.appmetrica.analytics.impl.C0424i3());
    }

    public final io.appmetrica.analytics.impl.InterfaceC0248b8 a() {
        return this.f6025c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final java.lang.String getPublicDescription() {
        int i2 = this.f6023a;
        return i2 != 4 ? i2 != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final java.util.List<io.appmetrica.analytics.impl.Di> toProto() {
        return (java.util.List) this.f6025c.fromModel(this);
    }

    public final java.lang.String toString() {
        return "CartActionInfoEvent{eventType=" + this.f6023a + ", cartItem=" + this.f6024b + ", converter=" + this.f6025c + '}';
    }

    public C0398h3(int i2, io.appmetrica.analytics.impl.C0475k3 c0475k3, io.appmetrica.analytics.impl.InterfaceC0248b8 interfaceC0248b8) {
        this.f6023a = i2;
        this.f6024b = c0475k3;
        this.f6025c = interfaceC0248b8;
    }
}
