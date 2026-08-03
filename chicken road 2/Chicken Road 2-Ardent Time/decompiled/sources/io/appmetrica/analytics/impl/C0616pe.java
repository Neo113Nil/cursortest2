package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616pe {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6650a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f6651b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f6652c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f6653d;

    public C0616pe(io.appmetrica.analytics.ecommerce.ECommerceOrder eCommerceOrder) {
        this(java.util.UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    public static java.util.ArrayList a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new io.appmetrica.analytics.impl.C0475k3((io.appmetrica.analytics.ecommerce.ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final java.lang.String toString() {
        return "OrderWrapper{uuid='" + this.f6650a + "', identifier='" + this.f6651b + "', cartItems=" + this.f6652c + ", payload=" + this.f6653d + '}';
    }

    public C0616pe(java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, java.util.Map map) {
        this.f6650a = str;
        this.f6651b = str2;
        this.f6652c = arrayList;
        this.f6653d = map;
    }
}
