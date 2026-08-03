package com.moloco.sdk.internal.ortb;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.text.Regex f7009a = new kotlin.text.Regex("\\$\\{AUCTION_PRICE\\}");

    public static final com.moloco.sdk.internal.ortb.model.g a(com.moloco.sdk.internal.ortb.model.g gVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "<this>");
        java.util.List<com.moloco.sdk.internal.ortb.model.C> b = gVar.b();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(b, 10));
        java.util.Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            java.util.List<com.moloco.sdk.internal.ortb.model.C3415e> b2 = ((com.moloco.sdk.internal.ortb.model.C) it.next()).b();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(b2, 10));
            for (com.moloco.sdk.internal.ortb.model.C3415e c3415e : b2) {
                float price = c3415e.getPrice();
                java.lang.String crid = c3415e.getCrid();
                java.lang.String a2 = a(c3415e.getAdm(), java.lang.Float.valueOf(price));
                java.lang.String str = c3415e.getCom.ironsource.q2.y java.lang.String();
                arrayList2.add(new com.moloco.sdk.internal.ortb.model.C3415e(a2, price, str != null ? a(str, java.lang.Float.valueOf(price)) : null, c3415e.getExt(), crid, c3415e.getBundle()));
            }
            arrayList.add(new com.moloco.sdk.internal.ortb.model.C(arrayList2));
        }
        return new com.moloco.sdk.internal.ortb.model.g(arrayList);
    }

    public static final java.lang.String a(java.lang.String str, java.lang.Float f) {
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.text.Regex regex = f7009a;
        if (f == null || (str2 = f.toString()) == null) {
            str2 = "";
        }
        return regex.replace(str, str2);
    }
}
