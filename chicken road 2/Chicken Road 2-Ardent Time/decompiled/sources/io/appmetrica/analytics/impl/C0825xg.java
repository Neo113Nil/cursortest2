package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825xg {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7111a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f7112b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0285cj f7113c;

    public C0825xg(io.appmetrica.analytics.ecommerce.ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new io.appmetrica.analytics.impl.C0285cj(eCommerceReferrer.getScreen()));
    }

    public final java.lang.String toString() {
        return "ReferrerWrapper{type='" + this.f7111a + "', identifier='" + this.f7112b + "', screen=" + this.f7113c + '}';
    }

    public C0825xg(java.lang.String str, java.lang.String str2, io.appmetrica.analytics.impl.C0285cj c0285cj) {
        this.f7111a = str;
        this.f7112b = str2;
        this.f7113c = c0285cj;
    }
}
