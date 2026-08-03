package com.iab.omid.library.fyber;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4383a;

    private void b(android.content.Context context) {
        com.iab.omid.library.fyber.utils.g.a(context, "Application Context cannot be null");
    }

    java.lang.String a() {
        return "1.5.4-Fyber";
    }

    void a(android.content.Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        com.iab.omid.library.fyber.internal.i.c().a(context);
        com.iab.omid.library.fyber.internal.b.g().a(context);
        com.iab.omid.library.fyber.utils.a.a(context);
        com.iab.omid.library.fyber.utils.c.a(context);
        com.iab.omid.library.fyber.utils.e.a(context);
        com.iab.omid.library.fyber.internal.g.b().a(context);
        com.iab.omid.library.fyber.internal.a.a().a(context);
        com.iab.omid.library.fyber.internal.j.b().a(context);
    }

    void a(boolean z) {
        this.f4383a = z;
    }

    boolean b() {
        return this.f4383a;
    }

    void c() {
        com.iab.omid.library.fyber.utils.g.a();
        com.iab.omid.library.fyber.internal.a.a().d();
    }
}
