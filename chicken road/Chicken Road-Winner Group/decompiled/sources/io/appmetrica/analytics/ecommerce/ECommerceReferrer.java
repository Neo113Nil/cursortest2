package io.appmetrica.analytics.ecommerce;

/* loaded from: classes.dex */
public class ECommerceReferrer {

    /* renamed from: a, reason: collision with root package name */
    private String f5507a;

    /* renamed from: b, reason: collision with root package name */
    private String f5508b;

    /* renamed from: c, reason: collision with root package name */
    private ECommerceScreen f5509c;

    public String getIdentifier() {
        return this.f5508b;
    }

    public ECommerceScreen getScreen() {
        return this.f5509c;
    }

    public String getType() {
        return this.f5507a;
    }

    public ECommerceReferrer setIdentifier(String str) {
        this.f5508b = str;
        return this;
    }

    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f5509c = eCommerceScreen;
        return this;
    }

    public ECommerceReferrer setType(String str) {
        this.f5507a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f5507a + "', identifier='" + this.f5508b + "', screen=" + this.f5509c + '}';
    }
}
