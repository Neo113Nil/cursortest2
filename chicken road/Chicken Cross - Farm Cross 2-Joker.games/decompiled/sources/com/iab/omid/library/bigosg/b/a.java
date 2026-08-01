package com.iab.omid.library.bigosg.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f6094a = new a();
    private final ArrayList<com.iab.omid.library.bigosg.adsession.a> b = new ArrayList<>();
    private final ArrayList<com.iab.omid.library.bigosg.adsession.a> c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f6094a;
    }

    public Collection<com.iab.omid.library.bigosg.adsession.a> b() {
        return Collections.unmodifiableCollection(this.b);
    }

    public Collection<com.iab.omid.library.bigosg.adsession.a> c() {
        return Collections.unmodifiableCollection(this.c);
    }

    public boolean d() {
        return this.c.size() > 0;
    }

    public void a(com.iab.omid.library.bigosg.adsession.a aVar) {
        this.b.add(aVar);
    }

    public void b(com.iab.omid.library.bigosg.adsession.a aVar) {
        boolean d = d();
        this.c.add(aVar);
        if (d) {
            return;
        }
        f.a().b();
    }

    public void c(com.iab.omid.library.bigosg.adsession.a aVar) {
        boolean d = d();
        this.b.remove(aVar);
        this.c.remove(aVar);
        if (!d || d()) {
            return;
        }
        f.a().c();
    }
}
