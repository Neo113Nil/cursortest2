package com.iab.omid.library.ironsrc;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4459a;

    private void b(android.content.Context context) {
        com.iab.omid.library.ironsrc.utils.g.a(context, "Application Context cannot be null");
    }

    java.lang.String a() {
        return "1.5.2-Ironsrc";
    }

    void a(android.content.Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        com.iab.omid.library.ironsrc.internal.i.c().a(context);
        com.iab.omid.library.ironsrc.internal.b.g().a(context);
        com.iab.omid.library.ironsrc.utils.a.a(context);
        com.iab.omid.library.ironsrc.utils.c.a(context);
        com.iab.omid.library.ironsrc.utils.e.a(context);
        com.iab.omid.library.ironsrc.internal.g.b().a(context);
        com.iab.omid.library.ironsrc.internal.a.a().a(context);
        com.iab.omid.library.ironsrc.internal.j.b().a(context);
    }

    void a(boolean z) {
        this.f4459a = z;
    }

    boolean b() {
        return this.f4459a;
    }

    void c() {
        com.iab.omid.library.ironsrc.utils.g.a();
        com.iab.omid.library.ironsrc.internal.a.a().d();
    }
}
