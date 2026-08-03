package io.appmetrica.analytics.ecommerce;

/* loaded from: classes.dex */
public class ECommerceReferrer {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f3825a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f3826b;

    /* renamed from: c, reason: collision with root package name */
    private io.appmetrica.analytics.ecommerce.ECommerceScreen f3827c;

    public java.lang.String getIdentifier() {
        return this.f3826b;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceScreen getScreen() {
        return this.f3827c;
    }

    public java.lang.String getType() {
        return this.f3825a;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceReferrer setIdentifier(java.lang.String str) {
        this.f3826b = str;
        return this;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceReferrer setScreen(io.appmetrica.analytics.ecommerce.ECommerceScreen eCommerceScreen) {
        this.f3827c = eCommerceScreen;
        return this;
    }

    public io.appmetrica.analytics.ecommerce.ECommerceReferrer setType(java.lang.String str) {
        this.f3825a = str;
        return this;
    }

    public java.lang.String toString() {
        return "ECommerceReferrer{type='" + this.f3825a + "', identifier='" + this.f3826b + "', screen=" + this.f3827c + '}';
    }
}
