package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Mf {

    /* renamed from: a, reason: collision with root package name */
    public final String f6287a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6288b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6289c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f6290d;

    /* renamed from: e, reason: collision with root package name */
    public final Ef f6291e;
    public final Ef f;

    /* renamed from: g, reason: collision with root package name */
    public final List f6292g;

    public Mf(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new Ef(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() != null ? new Ef(eCommerceProduct.getOriginalPrice()) : null, CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        return "ProductWrapper{sku='" + this.f6287a + "', name='" + this.f6288b + "', categoriesPath=" + this.f6289c + ", payload=" + this.f6290d + ", actualPrice=" + this.f6291e + ", originalPrice=" + this.f + ", promocodes=" + this.f6292g + '}';
    }

    public Mf(String str, String str2, List list, Map map, Ef ef, Ef ef2, List list2) {
        this.f6287a = str;
        this.f6288b = str2;
        this.f6289c = list;
        this.f6290d = map;
        this.f6291e = ef;
        this.f = ef2;
        this.f6292g = list2;
    }
}
