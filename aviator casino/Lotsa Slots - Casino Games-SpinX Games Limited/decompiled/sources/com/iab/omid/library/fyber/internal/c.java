package com.iab.omid.library.fyber.internal;

/* loaded from: classes5.dex */
public class c {
    private static com.iab.omid.library.fyber.internal.c c = new com.iab.omid.library.fyber.internal.c();

    /* renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList<com.iab.omid.library.fyber.adsession.a> f4387a = new java.util.ArrayList<>();
    private final java.util.ArrayList<com.iab.omid.library.fyber.adsession.a> b = new java.util.ArrayList<>();

    private c() {
    }

    public static com.iab.omid.library.fyber.internal.c c() {
        return c;
    }

    public java.util.Collection<com.iab.omid.library.fyber.adsession.a> a() {
        return java.util.Collections.unmodifiableCollection(this.b);
    }

    public void a(com.iab.omid.library.fyber.adsession.a aVar) {
        this.f4387a.add(aVar);
    }

    public java.util.Collection<com.iab.omid.library.fyber.adsession.a> b() {
        return java.util.Collections.unmodifiableCollection(this.f4387a);
    }

    public void b(com.iab.omid.library.fyber.adsession.a aVar) {
        boolean d = d();
        this.f4387a.remove(aVar);
        this.b.remove(aVar);
        if (!d || d()) {
            return;
        }
        com.iab.omid.library.fyber.internal.i.c().e();
    }

    public void c(com.iab.omid.library.fyber.adsession.a aVar) {
        boolean d = d();
        this.b.add(aVar);
        if (d) {
            return;
        }
        com.iab.omid.library.fyber.internal.i.c().d();
    }

    public boolean d() {
        return this.b.size() > 0;
    }
}
