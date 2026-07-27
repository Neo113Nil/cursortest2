package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ue, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0882ue extends ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f8450d = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8451e = 7;

    /* renamed from: a, reason: collision with root package name */
    public final int f8452a;

    /* renamed from: b, reason: collision with root package name */
    public final C0934we f8453b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0540h8 f8454c;

    public C0882ue(int i3, ECommerceOrder eCommerceOrder) {
        this(i3, new C0934we(eCommerceOrder), new C0908ve());
    }

    public final InterfaceC0540h8 a() {
        return this.f8454c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f8454c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f8452a + ", order=" + this.f8453b + ", converter=" + this.f8454c + '}';
    }

    public C0882ue(int i3, C0934we c0934we, InterfaceC0540h8 interfaceC0540h8) {
        this.f8452a = i3;
        this.f8453b = c0934we;
        this.f8454c = interfaceC0540h8;
    }
}
