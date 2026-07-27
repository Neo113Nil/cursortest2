package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0742p3 extends ECommerceEvent {

    /* renamed from: d, reason: collision with root package name */
    public static final int f8045d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8046e = 5;

    /* renamed from: a, reason: collision with root package name */
    public final int f8047a;

    /* renamed from: b, reason: collision with root package name */
    public final C0819s3 f8048b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0540h8 f8049c;

    public C0742p3(int i3, ECommerceCartItem eCommerceCartItem) {
        this(i3, new C0819s3(eCommerceCartItem), new C0768q3());
    }

    public final InterfaceC0540h8 a() {
        return this.f8049c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        int i3 = this.f8047a;
        return i3 != 4 ? i3 != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f8049c.fromModel(this);
    }

    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f8047a + ", cartItem=" + this.f8048b + ", converter=" + this.f8049c + '}';
    }

    public C0742p3(int i3, C0819s3 c0819s3, InterfaceC0540h8 interfaceC0540h8) {
        this.f8047a = i3;
        this.f8048b = c0819s3;
        this.f8049c = interfaceC0540h8;
    }
}
