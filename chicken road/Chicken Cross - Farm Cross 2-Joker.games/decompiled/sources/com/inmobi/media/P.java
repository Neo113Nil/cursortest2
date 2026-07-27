package com.inmobi.media;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class P implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f6771a;

    public P(V v) {
        this.f6771a = v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        C3702f7 c3702f7;
        N a2 = V.a(this.f6771a);
        V v = this.f6771a;
        v.getClass();
        ArrayList arrayList = null;
        if (a2 == null) {
            c3702f7 = new C3702f7(0.0f, null, null);
        } else {
            RectF rectF = a2.f6729a;
            if (rectF.isEmpty()) {
                c3702f7 = new C3702f7(0.0f, null, null);
            } else {
                float measuredHeight = v.f6901a.getMeasuredHeight() * v.f6901a.getMeasuredWidth();
                if (measuredHeight <= 0.0f) {
                    c3702f7 = new C3702f7(0.0f, null, null);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    v.f6901a.getLocationInWindow(new int[2]);
                    Pair pair = new Pair(Float.valueOf(r7[0]), Float.valueOf(r7[1]));
                    float floatValue = ((Number) pair.component1()).floatValue();
                    float floatValue2 = ((Number) pair.component2()).floatValue();
                    Iterator it = a2.b.iterator();
                    while (it.hasNext()) {
                        RectF rectF2 = (RectF) it.next();
                        arrayList2.add(new RectF(rectF2.left - floatValue, rectF2.top - floatValue2, rectF2.right - floatValue, rectF2.bottom - floatValue2));
                    }
                    ArrayList arrayList3 = a2.b;
                    if (arrayList3.isEmpty()) {
                        f = 0.0f;
                    } else {
                        Iterator it2 = arrayList3.iterator();
                        f = 0.0f;
                        while (it2.hasNext()) {
                            RectF rectF3 = (RectF) it2.next();
                            f += rectF3.height() * rectF3.width();
                        }
                    }
                    float min = Math.min(f, measuredHeight);
                    RectF rectF4 = new RectF(rectF);
                    float width = rectF4.width();
                    float height = rectF4.height();
                    float a3 = AbstractC3727g4.a(Math.min((Math.max(0.0f, ((width <= 0.0f || height <= 0.0f) ? 0.0f : Math.max(0.0f, width * height)) - min) / measuredHeight) * 100.0f, 100.0f));
                    C3730g7 c3730g7 = new C3730g7(Math.max(0.0f, AbstractC3727g4.a(rectF.left / AbstractC3841k6.b())), Math.max(0.0f, AbstractC3727g4.a(rectF.top / AbstractC3841k6.b())), Math.max(0, AbstractC3727g4.b(rectF.width() / AbstractC3841k6.b())), Math.max(0, AbstractC3727g4.b(rectF.height() / AbstractC3841k6.b())));
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            RectF rectF5 = (RectF) it3.next();
                            arrayList4.add(new C3730g7(Math.max(0.0f, AbstractC3727g4.a(rectF5.left / AbstractC3841k6.b())), Math.max(0.0f, AbstractC3727g4.a(rectF5.top / AbstractC3841k6.b())), Math.max(0, AbstractC3727g4.b(rectF5.width() / AbstractC3841k6.b())), Math.max(0, AbstractC3727g4.b(AbstractC3727g4.b(rectF5.height()) / AbstractC3841k6.b()))));
                        }
                        arrayList = new ArrayList(CollectionsKt.sortedWith(arrayList4, new Q()));
                    }
                    c3702f7 = new C3702f7(a3, c3730g7, arrayList);
                }
            }
        }
        V v2 = this.f6771a;
        if (Intrinsics.areEqual(c3702f7, v2.h)) {
            return;
        }
        ((C4054rj) v2.d).a(c3702f7);
        v2.h = c3702f7;
    }
}
