package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceScreen {

    /* renamed from: a, reason: collision with root package name */
    private String f5510a;

    /* renamed from: b, reason: collision with root package name */
    private List f5511b;

    /* renamed from: c, reason: collision with root package name */
    private String f5512c;

    /* renamed from: d, reason: collision with root package name */
    private Map f5513d;

    public List<String> getCategoriesPath() {
        return this.f5511b;
    }

    public String getName() {
        return this.f5510a;
    }

    public Map<String, String> getPayload() {
        return this.f5513d;
    }

    public String getSearchQuery() {
        return this.f5512c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f5511b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f5510a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f5513d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f5512c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f5510a + "', categoriesPath=" + this.f5511b + ", searchQuery='" + this.f5512c + "', payload=" + this.f5513d + '}';
    }
}
