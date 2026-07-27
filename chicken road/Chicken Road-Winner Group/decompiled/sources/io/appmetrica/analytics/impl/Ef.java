package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class Ef {

    /* renamed from: a, reason: collision with root package name */
    public final Z f5908a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5909b;

    public Ef(ECommercePrice eCommercePrice) {
        this(new Z(eCommercePrice.getFiat()), a(eCommercePrice.getInternalComponents()));
    }

    public static LinkedList a(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECommerceAmount eCommerceAmount = (ECommerceAmount) it.next();
            linkedList.add(new Z(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public final String toString() {
        return "PriceWrapper{fiat=" + this.f5908a + ", internalComponents=" + this.f5909b + '}';
    }

    public Ef(Z z3, LinkedList linkedList) {
        this.f5908a = z3;
        this.f5909b = linkedList;
    }
}
