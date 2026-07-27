package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceOrder {

    /* renamed from: a, reason: collision with root package name */
    private final String f5496a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5497b;

    /* renamed from: c, reason: collision with root package name */
    private Map f5498c;

    public ECommerceOrder(String str, List<ECommerceCartItem> list) {
        this.f5496a = str;
        this.f5497b = list;
    }

    public List<ECommerceCartItem> getCartItems() {
        return this.f5497b;
    }

    public String getIdentifier() {
        return this.f5496a;
    }

    public Map<String, String> getPayload() {
        return this.f5498c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f5498c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f5496a + "', cartItems=" + this.f5497b + ", payload=" + this.f5498c + '}';
    }
}
