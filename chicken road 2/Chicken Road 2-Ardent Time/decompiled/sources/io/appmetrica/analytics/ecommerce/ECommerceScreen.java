package io.appmetrica.analytics.ecommerce;

/* loaded from: classes.dex */
public class ECommerceScreen {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f3828a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.List f3829b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f3830c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.Map f3831d;

    public java.util.List<java.lang.String> getCategoriesPath() {
        return this.f3829b;
    }

    public java.lang.String getName() {
        return this.f3828a;
    }

    public java.util.Map<java.lang.String, java.lang.String> getPayload() {
        return this.f3831d;
    }

    public java.lang.String getSearchQuery() {
        return this.f3830c;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceScreen setCategoriesPath(java.util.List<java.lang.String> list) {
        this.f3829b = list;
        return this;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceScreen setName(java.lang.String str) {
        this.f3828a = str;
        return this;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceScreen setPayload(java.util.Map<java.lang.String, java.lang.String> map) {
        this.f3831d = map;
        return this;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceScreen setSearchQuery(java.lang.String str) {
        this.f3830c = str;
        return this;
    }

    public java.lang.String toString() {
        return "ECommerceScreen{name='" + this.f3828a + "', categoriesPath=" + this.f3829b + ", searchQuery='" + this.f3830c + "', payload=" + this.f3831d + '}';
    }
}
