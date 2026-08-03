package com.iab.omid.library.inmobi.internal;

/* loaded from: classes5.dex */
public class c {
    private static com.iab.omid.library.inmobi.internal.c c = new com.iab.omid.library.inmobi.internal.c();

    /* renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList<com.iab.omid.library.inmobi.adsession.a> f4426a = new java.util.ArrayList<>();
    private final java.util.ArrayList<com.iab.omid.library.inmobi.adsession.a> b = new java.util.ArrayList<>();

    private c() {
    }

    public static com.iab.omid.library.inmobi.internal.c c() {
        return c;
    }

    public java.util.Collection<com.iab.omid.library.inmobi.adsession.a> a() {
        return java.util.Collections.unmodifiableCollection(this.b);
    }

    public void a(com.iab.omid.library.inmobi.adsession.a aVar) {
        this.f4426a.add(aVar);
    }

    public java.util.Collection<com.iab.omid.library.inmobi.adsession.a> b() {
        return java.util.Collections.unmodifiableCollection(this.f4426a);
    }

    public void b(com.iab.omid.library.inmobi.adsession.a aVar) {
        boolean d = d();
        this.f4426a.remove(aVar);
        this.b.remove(aVar);
        if (!d || d()) {
            return;
        }
        com.iab.omid.library.inmobi.internal.i.c().e();
    }

    public void c(com.iab.omid.library.inmobi.adsession.a aVar) {
        boolean d = d();
        this.b.add(aVar);
        if (d) {
            return;
        }
        com.iab.omid.library.inmobi.internal.i.c().d();
    }

    public boolean d() {
        return this.b.size() > 0;
    }
}
