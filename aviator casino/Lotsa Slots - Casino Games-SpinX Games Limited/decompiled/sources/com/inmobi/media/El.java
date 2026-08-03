package com.inmobi.media;

/* loaded from: classes5.dex */
public final class El {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.G f4690a;

    public El(com.inmobi.media.G adContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContext, "adContext");
        this.f4690a = adContext;
    }

    public static void a(java.util.HashMap macros, java.util.List nativeTrackers, com.inmobi.media.C2799u9 c2799u9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeTrackers, "nativeTrackers");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : nativeTrackers) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.inmobi.media.De) obj).b, "error")) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((com.inmobi.media.De) it.next()).f4662a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
            java.lang.String str2 = str;
            for (java.util.Map.Entry entry : macros.entrySet()) {
                str2 = kotlin.text.StringsKt.replace$default(str2, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, (java.lang.Object) null);
            }
            arrayList2.add(str2);
        }
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            java.lang.String url = (java.lang.String) it2.next();
            com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
            com.inmobi.media.Jg priority = com.inmobi.media.Jg.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "priority");
            com.inmobi.media.Mg.a(priority, new com.inmobi.media.C2711r3(url, c2799u9, null));
        }
    }
}
