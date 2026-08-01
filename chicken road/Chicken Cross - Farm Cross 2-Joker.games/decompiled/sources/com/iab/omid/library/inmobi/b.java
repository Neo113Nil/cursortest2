package com.iab.omid.library.inmobi;

import android.content.Context;
import com.iab.omid.library.inmobi.internal.i;
import com.iab.omid.library.inmobi.internal.j;
import com.iab.omid.library.inmobi.utils.e;
import com.iab.omid.library.inmobi.utils.g;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6235a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.5.7-Inmobi";
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.inmobi.internal.b.g().a(context);
        com.iab.omid.library.inmobi.utils.a.a(context);
        com.iab.omid.library.inmobi.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.inmobi.internal.g.b().a(context);
        com.iab.omid.library.inmobi.internal.a.a().a(context);
        j.b().a(context);
    }

    void a(boolean z) {
        this.f6235a = z;
    }

    boolean b() {
        return this.f6235a;
    }

    void c() {
        g.a();
        com.iab.omid.library.inmobi.internal.a.a().d();
    }
}
