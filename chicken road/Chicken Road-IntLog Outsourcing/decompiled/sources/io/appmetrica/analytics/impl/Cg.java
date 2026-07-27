package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* loaded from: classes.dex */
public final class Cg {

    /* renamed from: a, reason: collision with root package name */
    public final String f6633a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6634b;

    /* renamed from: c, reason: collision with root package name */
    public final C0700hj f6635c;

    public Cg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C0700hj(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f6633a + "', identifier='" + this.f6634b + "', screen=" + this.f6635c + '}';
    }

    public Cg(String str, String str2, C0700hj c0700hj) {
        this.f6633a = str;
        this.f6634b = str2;
        this.f6635c = c0700hj;
    }
}
