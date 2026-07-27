package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.hj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0551hj {

    /* renamed from: a, reason: collision with root package name */
    public final String f7424a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7425b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7426c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f7427d;

    public C0551hj(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f7424a + "', categoriesPath=" + this.f7425b + ", searchQuery='" + this.f7426c + "', payload=" + this.f7427d + '}';
    }

    public C0551hj(String str, String str2, List list, Map map) {
        this.f7424a = str;
        this.f7425b = list;
        this.f7426c = str2;
        this.f7427d = map;
    }
}
