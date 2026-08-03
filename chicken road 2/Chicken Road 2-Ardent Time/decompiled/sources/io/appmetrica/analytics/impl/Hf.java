package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Hf {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4378a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4379b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f4380c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f4381d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0876zf f4382e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0876zf f4383f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f4384g;

    public Hf(io.appmetrica.analytics.ecommerce.ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new io.appmetrica.analytics.impl.C0876zf(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new io.appmetrica.analytics.impl.C0876zf(eCommerceProduct.getOriginalPrice()), io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final java.lang.String toString() {
        return "ProductWrapper{sku='" + this.f4378a + "', name='" + this.f4379b + "', categoriesPath=" + this.f4380c + ", payload=" + this.f4381d + ", actualPrice=" + this.f4382e + ", originalPrice=" + this.f4383f + ", promocodes=" + this.f4384g + '}';
    }

    public Hf(java.lang.String str, java.lang.String str2, java.util.List list, java.util.Map map, io.appmetrica.analytics.impl.C0876zf c0876zf, io.appmetrica.analytics.impl.C0876zf c0876zf2, java.util.List list2) {
        this.f4378a = str;
        this.f4379b = str2;
        this.f4380c = list;
        this.f4381d = map;
        this.f4382e = c0876zf;
        this.f4383f = c0876zf2;
        this.f4384g = list2;
    }
}
