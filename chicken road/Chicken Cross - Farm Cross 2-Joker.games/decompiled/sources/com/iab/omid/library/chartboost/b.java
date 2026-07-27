package com.iab.omid.library.chartboost;

import android.content.Context;
import com.iab.omid.library.chartboost.internal.i;
import com.iab.omid.library.chartboost.internal.j;
import com.iab.omid.library.chartboost.utils.e;
import com.iab.omid.library.chartboost.utils.g;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6159a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.5.7-Chartboost";
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.chartboost.internal.b.g().a(context);
        com.iab.omid.library.chartboost.utils.a.a(context);
        com.iab.omid.library.chartboost.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.chartboost.internal.g.b().a(context);
        com.iab.omid.library.chartboost.internal.a.a().a(context);
        j.b().a(context);
    }

    void a(boolean z) {
        this.f6159a = z;
    }

    boolean b() {
        return this.f6159a;
    }

    void c() {
        g.a();
        com.iab.omid.library.chartboost.internal.a.a().d();
    }
}
