package io.appmetrica.analytics.ecommerce;

/* loaded from: classes.dex */
public class ECommercePrice {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.ecommerce.ECommerceAmount f3816a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.List f3817b;

    public ECommercePrice(io.appmetrica.analytics.ecommerce.ECommerceAmount eCommerceAmount) {
        this.f3816a = eCommerceAmount;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceAmount getFiat() {
        return this.f3816a;
    }

    public java.util.List<io.appmetrica.analytics.ecommerce.ECommerceAmount> getInternalComponents() {
        return this.f3817b;
    }

    public io.appmetrica.analytics.ecommerce.ECommercePrice setInternalComponents(java.util.List<io.appmetrica.analytics.ecommerce.ECommerceAmount> list) {
        this.f3817b = list;
        return this;
    }

    public java.lang.String toString() {
        return "ECommercePrice{fiat=" + this.f3816a + ", internalComponents=" + this.f3817b + '}';
    }
}
