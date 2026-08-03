package com.iab.omid.library.unity3d.internal;

/* loaded from: classes5.dex */
public class c {
    private static com.iab.omid.library.unity3d.internal.c c = new com.iab.omid.library.unity3d.internal.c();

    /* renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList<com.iab.omid.library.unity3d.adsession.a> f4500a = new java.util.ArrayList<>();
    private final java.util.ArrayList<com.iab.omid.library.unity3d.adsession.a> b = new java.util.ArrayList<>();

    private c() {
    }

    public static com.iab.omid.library.unity3d.internal.c c() {
        return c;
    }

    public java.util.Collection<com.iab.omid.library.unity3d.adsession.a> a() {
        return java.util.Collections.unmodifiableCollection(this.b);
    }

    public void a(com.iab.omid.library.unity3d.adsession.a aVar) {
        this.f4500a.add(aVar);
    }

    public java.util.Collection<com.iab.omid.library.unity3d.adsession.a> b() {
        return java.util.Collections.unmodifiableCollection(this.f4500a);
    }

    public void b(com.iab.omid.library.unity3d.adsession.a aVar) {
        boolean d = d();
        this.f4500a.remove(aVar);
        this.b.remove(aVar);
        if (!d || d()) {
            return;
        }
        com.iab.omid.library.unity3d.internal.h.c().e();
    }

    public void c(com.iab.omid.library.unity3d.adsession.a aVar) {
        boolean d = d();
        this.b.add(aVar);
        if (d) {
            return;
        }
        com.iab.omid.library.unity3d.internal.h.c().d();
    }

    public boolean d() {
        return this.b.size() > 0;
    }
}
