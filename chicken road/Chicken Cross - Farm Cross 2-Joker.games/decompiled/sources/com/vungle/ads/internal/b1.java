package com.vungle.ads.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11888a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ c1 c;

    public b1(c1 c1Var) {
        this.c = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Map map2;
        boolean z;
        Map map3;
        z0 a2;
        Map map4;
        z0 a3;
        this.c.g = false;
        map = this.c.f11895a;
        for (Map.Entry entry : map.entrySet()) {
            View view = (View) entry.getKey();
            if (c1.a(this.c, view, ((a1) entry.getValue()).b())) {
                this.f11888a.add(view);
            } else {
                this.b.add(view);
            }
        }
        Iterator it = this.f11888a.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            map4 = this.c.f11895a;
            a1 a1Var = (a1) map4.get(view2);
            if (a1Var != null && (a3 = a1Var.a()) != null) {
                a3.onImpression(view2);
            }
            c1 c1Var = this.c;
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            c1Var.a(view2);
        }
        this.f11888a.clear();
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            View view3 = (View) it2.next();
            map3 = this.c.f11895a;
            a1 a1Var2 = (a1) map3.get(view3);
            if (a1Var2 != null && (a2 = a1Var2.a()) != null) {
                a2.onViewInvisible(view3);
            }
        }
        this.b.clear();
        map2 = this.c.f11895a;
        if (map2.isEmpty()) {
            return;
        }
        z = this.c.h;
        if (z) {
            return;
        }
        c1.d(this.c);
    }
}
