package io.appmetrica.analytics.ecommerce;

import java.util.List;

/* loaded from: classes.dex */
public class ECommercePrice {

    /* renamed from: a, reason: collision with root package name */
    private final ECommerceAmount f5499a;

    /* renamed from: b, reason: collision with root package name */
    private List f5500b;

    public ECommercePrice(ECommerceAmount eCommerceAmount) {
        this.f5499a = eCommerceAmount;
    }

    public ECommerceAmount getFiat() {
        return this.f5499a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f5500b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f5500b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f5499a + ", internalComponents=" + this.f5500b + '}';
    }
}
