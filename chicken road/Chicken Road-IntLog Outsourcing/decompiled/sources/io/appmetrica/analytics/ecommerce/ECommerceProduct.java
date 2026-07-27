package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceProduct {

    /* renamed from: a, reason: collision with root package name */
    private final String f6321a;

    /* renamed from: b, reason: collision with root package name */
    private String f6322b;

    /* renamed from: c, reason: collision with root package name */
    private List f6323c;

    /* renamed from: d, reason: collision with root package name */
    private Map f6324d;

    /* renamed from: e, reason: collision with root package name */
    private ECommercePrice f6325e;

    /* renamed from: f, reason: collision with root package name */
    private ECommercePrice f6326f;

    /* renamed from: g, reason: collision with root package name */
    private List f6327g;

    public ECommerceProduct(String str) {
        this.f6321a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f6325e;
    }

    public List<String> getCategoriesPath() {
        return this.f6323c;
    }

    public String getName() {
        return this.f6322b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f6326f;
    }

    public Map<String, String> getPayload() {
        return this.f6324d;
    }

    public List<String> getPromocodes() {
        return this.f6327g;
    }

    public String getSku() {
        return this.f6321a;
    }

    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f6325e = eCommercePrice;
        return this;
    }

    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f6323c = list;
        return this;
    }

    public ECommerceProduct setName(String str) {
        this.f6322b = str;
        return this;
    }

    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f6326f = eCommercePrice;
        return this;
    }

    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f6324d = map;
        return this;
    }

    public ECommerceProduct setPromocodes(List<String> list) {
        this.f6327g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f6321a + "', name='" + this.f6322b + "', categoriesPath=" + this.f6323c + ", payload=" + this.f6324d + ", actualPrice=" + this.f6325e + ", originalPrice=" + this.f6326f + ", promocodes=" + this.f6327g + '}';
    }
}
