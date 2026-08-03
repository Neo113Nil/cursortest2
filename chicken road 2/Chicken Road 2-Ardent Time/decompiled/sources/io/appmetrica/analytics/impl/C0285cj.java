package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.cj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285cj {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5663a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f5664b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f5665c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f5666d;

    public C0285cj(io.appmetrica.analytics.ecommerce.ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final java.lang.String toString() {
        return "ScreenWrapper{name='" + this.f5663a + "', categoriesPath=" + this.f5664b + ", searchQuery='" + this.f5665c + "', payload=" + this.f5666d + '}';
    }

    public C0285cj(java.lang.String str, java.lang.String str2, java.util.List list, java.util.Map map) {
        this.f5663a = str;
        this.f5664b = list;
        this.f5665c = str2;
        this.f5666d = map;
    }
}
