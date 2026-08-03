package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0876zf {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Z f7185a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f7186b;

    public C0876zf(io.appmetrica.analytics.ecommerce.ECommercePrice eCommercePrice) {
        this(new io.appmetrica.analytics.impl.Z(eCommercePrice.getFiat()), a(eCommercePrice.getInternalComponents()));
    }

    public static java.util.LinkedList a(java.util.List list) {
        if (list == null) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            io.appmetrica.analytics.ecommerce.ECommerceAmount eCommerceAmount = (io.appmetrica.analytics.ecommerce.ECommerceAmount) it.next();
            linkedList.add(new io.appmetrica.analytics.impl.Z(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public final java.lang.String toString() {
        return "PriceWrapper{fiat=" + this.f7185a + ", internalComponents=" + this.f7186b + '}';
    }

    public C0876zf(io.appmetrica.analytics.impl.Z z2, java.util.LinkedList linkedList) {
        this.f7185a = z2;
        this.f7186b = linkedList;
    }
}
