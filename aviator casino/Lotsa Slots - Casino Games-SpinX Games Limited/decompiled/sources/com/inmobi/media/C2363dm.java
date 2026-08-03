package com.inmobi.media;

/* renamed from: com.inmobi.media.dm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2363dm {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f5165a;
    public final com.inmobi.media.Uc b;
    public final com.inmobi.media.C2337cm c;

    public C2363dm(com.inmobi.media.Bl vastBeaconData, com.inmobi.media.C2313c0 adLifecycleData, com.inmobi.media.C2891xn responseBeaconData) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastBeaconData, "vastBeaconData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseBeaconData, "responseBeaconData");
        this.f5165a = new java.util.concurrent.atomic.AtomicInteger(0);
        this.b = new com.inmobi.media.Uc(adLifecycleData, vastBeaconData.f4629a, vastBeaconData.b, 24);
        java.util.ArrayList arrayList = vastBeaconData.d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            com.inmobi.media.De de = (com.inmobi.media.De) next;
            if (!(de instanceof com.inmobi.media.S5)) {
                java.lang.String type = de.b;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
                if (!kotlin.jvm.internal.Intrinsics.areEqual(type, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n) && !kotlin.jvm.internal.Intrinsics.areEqual(type, com.ironsource.Y3.d)) {
                    arrayList2.add(next);
                }
            }
        }
        java.util.ArrayList arrayList3 = vastBeaconData.d;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            java.lang.Object next2 = it2.next();
            if (next2 instanceof com.inmobi.media.S5) {
                arrayList4.add(next2);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        java.util.Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            com.inmobi.media.S5 s5 = (com.inmobi.media.S5) it3.next();
            int i3 = vastBeaconData.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s5, "<this>");
            if (kotlin.text.StringsKt.endsWith$default(s5.c, "%", false, 2, (java.lang.Object) null)) {
                try {
                    i = java.lang.Integer.parseInt(kotlin.text.StringsKt.dropLast(s5.c, 1));
                } catch (java.lang.Exception unused) {
                    i = 0;
                }
                i2 = (i3 * i) / 100;
            } else {
                i2 = com.inmobi.media.AbstractC2283am.a(s5.c);
            }
            arrayList5.add(new com.inmobi.media.Q5(s5.f4662a, i2));
        }
        this.c = new com.inmobi.media.C2337cm(this.b, new com.inmobi.media.C2389em(responseBeaconData, arrayList2, arrayList5));
    }
}
