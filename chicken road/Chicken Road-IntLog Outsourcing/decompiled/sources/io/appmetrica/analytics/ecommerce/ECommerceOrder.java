package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceOrder {

    /* renamed from: a, reason: collision with root package name */
    private final String f6316a;

    /* renamed from: b, reason: collision with root package name */
    private final List f6317b;

    /* renamed from: c, reason: collision with root package name */
    private Map f6318c;

    public ECommerceOrder(String str, List<ECommerceCartItem> list) {
        this.f6316a = str;
        this.f6317b = list;
    }

    public List<ECommerceCartItem> getCartItems() {
        return this.f6317b;
    }

    public String getIdentifier() {
        return this.f6316a;
    }

    public Map<String, String> getPayload() {
        return this.f6318c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f6318c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f6316a + "', cartItems=" + this.f6317b + ", payload=" + this.f6318c + '}';
    }
}
