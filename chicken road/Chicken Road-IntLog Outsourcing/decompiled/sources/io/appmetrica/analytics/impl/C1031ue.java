package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ue, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1031ue extends ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f9403d = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9404e = 7;

    /* renamed from: a, reason: collision with root package name */
    public final int f9405a;

    /* renamed from: b, reason: collision with root package name */
    public final C1083we f9406b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0689h8 f9407c;

    public C1031ue(int i2, ECommerceOrder eCommerceOrder) {
        this(i2, new C1083we(eCommerceOrder), new C1057ve());
    }

    public final InterfaceC0689h8 a() {
        return this.f9407c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f9407c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f9405a + ", order=" + this.f9406b + ", converter=" + this.f9407c + '}';
    }

    public C1031ue(int i2, C1083we c1083we, InterfaceC0689h8 interfaceC0689h8) {
        this.f9405a = i2;
        this.f9406b = c1083we;
        this.f9407c = interfaceC0689h8;
    }
}
