package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Tb {
    public static java.util.ArrayList a() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.inmobi.media.Ub.f4994a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.Iterator it = com.inmobi.media.Ub.f4994a.iterator();
            while (it.hasNext()) {
                com.inmobi.media.Ph ph = (com.inmobi.media.Ph) ((java.lang.ref.WeakReference) it.next()).get();
                if (ph != null) {
                    arrayList.add(ph);
                }
            }
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = com.inmobi.media.Ub.f4994a;
        arrayList.toString();
        return arrayList;
    }

    public static void b(com.inmobi.media.Ph logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.inmobi.media.Ub.f4994a;
        java.util.Objects.toString(logger);
        com.inmobi.media.Ub.f4994a.add(new java.lang.ref.WeakReference(logger));
    }

    public static boolean a(java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.inmobi.media.Ub.f4994a;
        try {
            java.util.Iterator it = com.inmobi.media.Ub.f4994a.iterator();
            while (it.hasNext()) {
                com.inmobi.media.Ph ph = (com.inmobi.media.Ph) ((java.lang.ref.WeakReference) it.next()).get();
                if (kotlin.jvm.internal.Intrinsics.areEqual(ph != null ? ph.j : null, fileName)) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
            return false;
        }
    }

    public static void a(com.inmobi.media.Ph ph) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.inmobi.media.Ub.f4994a;
        java.util.Objects.toString(ph);
        if (ph == null) {
            return;
        }
        try {
            java.util.Iterator it = com.inmobi.media.Ub.f4994a.iterator();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                if (weakReference.get() == null || kotlin.jvm.internal.Intrinsics.areEqual(weakReference.get(), ph)) {
                    com.inmobi.media.Ub.f4994a.remove(weakReference);
                }
            }
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
        }
    }
}
