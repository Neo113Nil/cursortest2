package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* loaded from: classes.dex */
public final class Cg {

    /* renamed from: a, reason: collision with root package name */
    public final String f5798a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5799b;

    /* renamed from: c, reason: collision with root package name */
    public final C0551hj f5800c;

    public Cg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C0551hj(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f5798a + "', identifier='" + this.f5799b + "', screen=" + this.f5800c + '}';
    }

    public Cg(String str, String str2, C0551hj c0551hj) {
        this.f5798a = str;
        this.f5799b = str2;
        this.f5800c = c0551hj;
    }
}
