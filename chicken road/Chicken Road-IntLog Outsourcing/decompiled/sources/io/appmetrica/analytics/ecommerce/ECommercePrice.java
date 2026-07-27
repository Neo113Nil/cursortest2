package io.appmetrica.analytics.ecommerce;

import java.util.List;

/* loaded from: classes.dex */
public class ECommercePrice {

    /* renamed from: a, reason: collision with root package name */
    private final ECommerceAmount f6319a;

    /* renamed from: b, reason: collision with root package name */
    private List f6320b;

    public ECommercePrice(ECommerceAmount eCommerceAmount) {
        this.f6319a = eCommerceAmount;
    }

    public ECommerceAmount getFiat() {
        return this.f6319a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f6320b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f6320b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f6319a + ", internalComponents=" + this.f6320b + '}';
    }
}
