package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceProduct {

    /* renamed from: a, reason: collision with root package name */
    private final String f5501a;

    /* renamed from: b, reason: collision with root package name */
    private String f5502b;

    /* renamed from: c, reason: collision with root package name */
    private List f5503c;

    /* renamed from: d, reason: collision with root package name */
    private Map f5504d;

    /* renamed from: e, reason: collision with root package name */
    private ECommercePrice f5505e;
    private ECommercePrice f;

    /* renamed from: g, reason: collision with root package name */
    private List f5506g;

    public ECommerceProduct(String str) {
        this.f5501a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f5505e;
    }

    public List<String> getCategoriesPath() {
        return this.f5503c;
    }

    public String getName() {
        return this.f5502b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f;
    }

    public Map<String, String> getPayload() {
        return this.f5504d;
    }

    public List<String> getPromocodes() {
        return this.f5506g;
    }

    public String getSku() {
        return this.f5501a;
    }

    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f5505e = eCommercePrice;
        return this;
    }

    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f5503c = list;
        return this;
    }

    public ECommerceProduct setName(String str) {
        this.f5502b = str;
        return this;
    }

    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f = eCommercePrice;
        return this;
    }

    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f5504d = map;
        return this;
    }

    public ECommerceProduct setPromocodes(List<String> list) {
        this.f5506g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f5501a + "', name='" + this.f5502b + "', categoriesPath=" + this.f5503c + ", payload=" + this.f5504d + ", actualPrice=" + this.f5505e + ", originalPrice=" + this.f + ", promocodes=" + this.f5506g + '}';
    }
}
