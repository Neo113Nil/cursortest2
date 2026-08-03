package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564ne extends io.appmetrica.analytics.ecommerce.ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f6521d = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6522e = 7;

    /* renamed from: a, reason: collision with root package name */
    public final int f6523a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0616pe f6524b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0248b8 f6525c;

    public C0564ne(int i2, io.appmetrica.analytics.ecommerce.ECommerceOrder eCommerceOrder) {
        this(i2, new io.appmetrica.analytics.impl.C0616pe(eCommerceOrder), new io.appmetrica.analytics.impl.C0590oe());
    }

    public final io.appmetrica.analytics.impl.InterfaceC0248b8 a() {
        return this.f6525c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final java.lang.String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final java.util.List<io.appmetrica.analytics.impl.Di> toProto() {
        return (java.util.List) this.f6525c.fromModel(this);
    }

    public final java.lang.String toString() {
        return "OrderInfoEvent{eventType=" + this.f6523a + ", order=" + this.f6524b + ", converter=" + this.f6525c + '}';
    }

    public C0564ne(int i2, io.appmetrica.analytics.impl.C0616pe c0616pe, io.appmetrica.analytics.impl.InterfaceC0248b8 interfaceC0248b8) {
        this.f6523a = i2;
        this.f6524b = c0616pe;
        this.f6525c = interfaceC0248b8;
    }
}
