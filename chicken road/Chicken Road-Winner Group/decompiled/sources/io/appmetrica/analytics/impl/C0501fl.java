package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501fl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final Mf f7297a;

    /* renamed from: b, reason: collision with root package name */
    public final C0551hj f7298b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0540h8 f7299c;

    public C0501fl(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        this(new Mf(eCommerceProduct), new C0551hj(eCommerceScreen), new C0527gl());
    }

    public final InterfaceC0540h8 a() {
        return this.f7299c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f7299c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f7297a + ", screen=" + this.f7298b + ", converter=" + this.f7299c + '}';
    }

    public C0501fl(Mf mf, C0551hj c0551hj, InterfaceC0540h8 interfaceC0540h8) {
        this.f7297a = mf;
        this.f7298b = c0551hj;
        this.f7299c = interfaceC0540h8;
    }
}
