package com.iab.omid.library.inmobi;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4420a;

    private void b(android.content.Context context) {
        com.iab.omid.library.inmobi.utils.g.a(context, "Application Context cannot be null");
    }

    java.lang.String a() {
        return "1.5.7-Inmobi";
    }

    void a(android.content.Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        com.iab.omid.library.inmobi.internal.i.c().a(context);
        com.iab.omid.library.inmobi.internal.b.g().a(context);
        com.iab.omid.library.inmobi.utils.a.a(context);
        com.iab.omid.library.inmobi.utils.c.a(context);
        com.iab.omid.library.inmobi.utils.e.a(context);
        com.iab.omid.library.inmobi.internal.g.b().a(context);
        com.iab.omid.library.inmobi.internal.a.a().a(context);
        com.iab.omid.library.inmobi.internal.j.b().a(context);
    }

    void a(boolean z) {
        this.f4420a = z;
    }

    boolean b() {
        return this.f4420a;
    }

    void c() {
        com.iab.omid.library.inmobi.utils.g.a();
        com.iab.omid.library.inmobi.internal.a.a().d();
    }
}
