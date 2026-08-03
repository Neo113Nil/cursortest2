package com.inmobi.media;

/* renamed from: com.inmobi.media.am, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2283am {
    public static final int a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{":", "."}, false, 4, 2, (java.lang.Object) null);
            int parseInt = java.lang.Integer.parseInt((java.lang.String) split$default.get(0));
            int parseInt2 = java.lang.Integer.parseInt((java.lang.String) split$default.get(1));
            return (((parseInt2 * 60) + (parseInt * 3600) + java.lang.Integer.parseInt((java.lang.String) split$default.get(2))) * 1000) + (split$default.size() == 4 ? java.lang.Integer.parseInt((java.lang.String) split$default.get(3)) : 0);
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    public static final java.util.List a(java.lang.String trackerType, java.util.ArrayList arrayList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackerType, "trackerType");
        if (arrayList == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.inmobi.media.De) obj).b, trackerType)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((com.inmobi.media.De) it.next()).f4662a);
        }
        return arrayList3;
    }
}
