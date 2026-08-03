package io.appmetrica.analytics.ecommerce;

/* loaded from: classes.dex */
public class ECommerceProduct {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3818a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f3819b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.List f3820c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.Map f3821d;

    /* renamed from: e, reason: collision with root package name */
    private io.appmetrica.analytics.ecommerce.ECommercePrice f3822e;

    /* renamed from: f, reason: collision with root package name */
    private io.appmetrica.analytics.ecommerce.ECommercePrice f3823f;

    /* renamed from: g, reason: collision with root package name */
    private java.util.List f3824g;

    public ECommerceProduct(java.lang.String str) {
        this.f3818a = str;
    }

    public io.appmetrica.analytics.ecommerce.ECommercePrice getActualPrice() {
        return this.f3822e;
    }

    public java.util.List<java.lang.String> getCategoriesPath() {
        return this.f3820c;
    }

    public java.lang.String getName() {
        return this.f3819b;
    }

    public io.appmetrica.analytics.ecommerce.ECommercePrice getOriginalPrice() {
        return this.f3823f;
    }

    public java.util.Map<java.lang.String, java.lang.String> getPayload() {
        return this.f3821d;
    }

    public java.util.List<java.lang.String> getPromocodes() {
        return this.f3824g;
    }

    public java.lang.String getSku() {
        return this.f3818a;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceProduct setActualPrice(io.appmetrica.analytics.ecommerce.ECommercePrice eCommercePrice) {
        this.f3822e = eCommercePrice;
        return this;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceProduct setCategoriesPath(java.util.List<java.lang.String> list) {
        this.f3820c = list;
        return this;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceProduct setName(java.lang.String str) {
        this.f3819b = str;
        return this;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceProduct setOriginalPrice(io.appmetrica.analytics.ecommerce.ECommercePrice eCommercePrice) {
        this.f3823f = eCommercePrice;
        return this;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceProduct setPayload(java.util.Map<java.lang.String, java.lang.String> map) {
        this.f3821d = map;
        return this;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceProduct setPromocodes(java.util.List<java.lang.String> list) {
        this.f3824g = list;
        return this;
    }

    public java.lang.String toString() {
        return "ECommerceProduct{sku='" + this.f3818a + "', name='" + this.f3819b + "', categoriesPath=" + this.f3820c + ", payload=" + this.f3821d + ", actualPrice=" + this.f3822e + ", originalPrice=" + this.f3823f + ", promocodes=" + this.f3824g + '}';
    }
}
