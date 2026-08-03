package com.inmobi.media;

/* loaded from: classes5.dex */
public final class O implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.U f4864a;

    public O(com.inmobi.media.U u) {
        this.f4864a = u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        com.inmobi.media.I6 i6;
        com.inmobi.media.M a2 = com.inmobi.media.U.a(this.f4864a);
        com.inmobi.media.U u = this.f4864a;
        u.getClass();
        java.util.ArrayList arrayList = null;
        if (a2 == null) {
            i6 = new com.inmobi.media.I6(0.0f, null, null);
        } else {
            android.graphics.RectF rectF = a2.f4826a;
            if (rectF.isEmpty()) {
                i6 = new com.inmobi.media.I6(0.0f, null, null);
            } else {
                float measuredHeight = u.f4985a.getMeasuredHeight() * u.f4985a.getMeasuredWidth();
                if (measuredHeight <= 0.0f) {
                    i6 = new com.inmobi.media.I6(0.0f, null, null);
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    u.f4985a.getLocationInWindow(new int[2]);
                    kotlin.Pair pair = new kotlin.Pair(java.lang.Float.valueOf(r7[0]), java.lang.Float.valueOf(r7[1]));
                    float floatValue = ((java.lang.Number) pair.component1()).floatValue();
                    float floatValue2 = ((java.lang.Number) pair.component2()).floatValue();
                    java.util.Iterator it = a2.b.iterator();
                    while (it.hasNext()) {
                        android.graphics.RectF rectF2 = (android.graphics.RectF) it.next();
                        arrayList2.add(new android.graphics.RectF(rectF2.left - floatValue, rectF2.top - floatValue2, rectF2.right - floatValue, rectF2.bottom - floatValue2));
                    }
                    java.util.ArrayList arrayList3 = a2.b;
                    if (arrayList3.isEmpty()) {
                        f = 0.0f;
                    } else {
                        java.util.Iterator it2 = arrayList3.iterator();
                        f = 0.0f;
                        while (it2.hasNext()) {
                            android.graphics.RectF rectF3 = (android.graphics.RectF) it2.next();
                            f += rectF3.height() * rectF3.width();
                        }
                    }
                    float min = java.lang.Math.min(f, measuredHeight);
                    android.graphics.RectF rectF4 = new android.graphics.RectF(rectF);
                    float width = rectF4.width();
                    float height = rectF4.height();
                    float a3 = com.inmobi.media.J3.a(java.lang.Math.min((java.lang.Math.max(0.0f, ((width <= 0.0f || height <= 0.0f) ? 0.0f : java.lang.Math.max(0.0f, width * height)) - min) / measuredHeight) * 100.0f, 100.0f));
                    com.inmobi.media.J6 j6 = new com.inmobi.media.J6(java.lang.Math.max(0.0f, com.inmobi.media.J3.a(rectF.left / com.inmobi.media.N5.b())), java.lang.Math.max(0.0f, com.inmobi.media.J3.a(rectF.top / com.inmobi.media.N5.b())), java.lang.Math.max(0, com.inmobi.media.J3.b(rectF.width() / com.inmobi.media.N5.b())), java.lang.Math.max(0, com.inmobi.media.J3.b(rectF.height() / com.inmobi.media.N5.b())));
                    if (!arrayList2.isEmpty()) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                        java.util.Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            android.graphics.RectF rectF5 = (android.graphics.RectF) it3.next();
                            arrayList4.add(new com.inmobi.media.J6(java.lang.Math.max(0.0f, com.inmobi.media.J3.a(rectF5.left / com.inmobi.media.N5.b())), java.lang.Math.max(0.0f, com.inmobi.media.J3.a(rectF5.top / com.inmobi.media.N5.b())), java.lang.Math.max(0, com.inmobi.media.J3.b(rectF5.width() / com.inmobi.media.N5.b())), java.lang.Math.max(0, com.inmobi.media.J3.b(com.inmobi.media.J3.b(rectF5.height()) / com.inmobi.media.N5.b()))));
                        }
                        arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.sortedWith(arrayList4, new com.inmobi.media.P()));
                    }
                    i6 = new com.inmobi.media.I6(a3, j6, arrayList);
                }
            }
        }
        com.inmobi.media.U u2 = this.f4864a;
        if (kotlin.jvm.internal.Intrinsics.areEqual(i6, u2.h)) {
            return;
        }
        ((com.inmobi.media.C2333ci) u2.d).a(i6);
        u2.h = i6;
    }
}
