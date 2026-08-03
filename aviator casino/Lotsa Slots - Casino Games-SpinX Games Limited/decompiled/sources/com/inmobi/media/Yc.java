package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Yc {
    public static final java.util.List a(com.inmobi.media.Zc zc) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zc, "<this>");
        com.inmobi.media.Cl cl = zc.f5083a;
        if (cl != null) {
            java.util.ArrayList arrayList2 = cl.b;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.inmobi.media.De) next).b, com.ironsource.Y3.d)) {
                    arrayList3.add(next);
                }
            }
            arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            java.util.Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList.add(((com.inmobi.media.De) it2.next()).f4662a);
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }
}
