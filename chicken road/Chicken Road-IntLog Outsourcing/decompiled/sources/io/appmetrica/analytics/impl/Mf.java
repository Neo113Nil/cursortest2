package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Mf {

    /* renamed from: a, reason: collision with root package name */
    public final String f7143a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7144b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7145c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f7146d;

    /* renamed from: e, reason: collision with root package name */
    public final Ef f7147e;

    /* renamed from: f, reason: collision with root package name */
    public final Ef f7148f;

    /* renamed from: g, reason: collision with root package name */
    public final List f7149g;

    public Mf(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new Ef(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new Ef(eCommerceProduct.getOriginalPrice()), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        return "ProductWrapper{sku='" + this.f7143a + "', name='" + this.f7144b + "', categoriesPath=" + this.f7145c + ", payload=" + this.f7146d + ", actualPrice=" + this.f7147e + ", originalPrice=" + this.f7148f + ", promocodes=" + this.f7149g + '}';
    }

    public Mf(String str, String str2, List list, Map map, Ef ef, Ef ef2, List list2) {
        this.f7143a = str;
        this.f7144b = str2;
        this.f7145c = list;
        this.f7146d = map;
        this.f7147e = ef;
        this.f7148f = ef2;
        this.f7149g = list2;
    }
}
