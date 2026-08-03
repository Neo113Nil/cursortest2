package io.appmetrica.analytics.ecommerce;

/* loaded from: classes.dex */
public class ECommerceOrder {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3813a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.List f3814b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.Map f3815c;

    public ECommerceOrder(java.lang.String str, java.util.List<io.appmetrica.analytics.ecommerce.ECommerceCartItem> list) {
        this.f3813a = str;
        this.f3814b = list;
    }

    public java.util.List<io.appmetrica.analytics.ecommerce.ECommerceCartItem> getCartItems() {
        return this.f3814b;
    }

    public java.lang.String getIdentifier() {
        return this.f3813a;
    }

    public java.util.Map<java.lang.String, java.lang.String> getPayload() {
        return this.f3815c;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceOrder setPayload(java.util.Map<java.lang.String, java.lang.String> map) {
        this.f3815c = map;
        return this;
    }

    public java.lang.String toString() {
        return "ECommerceOrder{identifier='" + this.f3813a + "', cartItems=" + this.f3814b + ", payload=" + this.f3815c + '}';
    }
}
