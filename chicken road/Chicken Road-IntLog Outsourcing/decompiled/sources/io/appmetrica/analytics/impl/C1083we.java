package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.we, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1083we {

    /* renamed from: a, reason: collision with root package name */
    public final String f9522a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9523b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9524c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f9525d;

    public C1083we(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0968s3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f9522a + "', identifier='" + this.f9523b + "', cartItems=" + this.f9524c + ", payload=" + this.f9525d + '}';
    }

    public C1083we(String str, String str2, ArrayList arrayList, Map map) {
        this.f9522a = str;
        this.f9523b = str2;
        this.f9524c = arrayList;
        this.f9525d = map;
    }
}
