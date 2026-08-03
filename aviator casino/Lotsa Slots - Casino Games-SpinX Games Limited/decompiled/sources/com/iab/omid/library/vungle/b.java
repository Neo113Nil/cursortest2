package com.iab.omid.library.vungle;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4537a;

    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f4538a;

        a(com.iab.omid.library.vungle.b bVar, android.content.Context context) {
            this.f4538a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                android.webkit.WebSettings.getDefaultUserAgent(this.f4538a);
            } catch (java.lang.Throwable unused) {
                com.iab.omid.library.vungle.utils.d.a("Ignoring failure while retrieving default WebView user agent");
            }
        }
    }

    private void b(android.content.Context context) {
        com.iab.omid.library.vungle.utils.g.a(context, "Application Context cannot be null");
    }

    private void c(android.content.Context context) {
        java.util.concurrent.Executors.newSingleThreadExecutor().execute(new com.iab.omid.library.vungle.b.a(this, context));
    }

    java.lang.String a() {
        return "1.6.2-Vungle";
    }

    void a(android.content.Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        com.iab.omid.library.vungle.internal.i.c().a(context);
        com.iab.omid.library.vungle.internal.b.g().a(context);
        com.iab.omid.library.vungle.utils.a.a(context);
        com.iab.omid.library.vungle.utils.c.a(context);
        com.iab.omid.library.vungle.utils.e.a(context);
        com.iab.omid.library.vungle.internal.g.b().a(context);
        com.iab.omid.library.vungle.internal.a.a().a(context);
        com.iab.omid.library.vungle.internal.k.b().a(context);
        c(context);
    }

    void a(boolean z) {
        this.f4537a = z;
    }

    boolean b() {
        return this.f4537a;
    }

    void c() {
        com.iab.omid.library.vungle.utils.g.a();
        com.iab.omid.library.vungle.internal.a.a().d();
    }
}
