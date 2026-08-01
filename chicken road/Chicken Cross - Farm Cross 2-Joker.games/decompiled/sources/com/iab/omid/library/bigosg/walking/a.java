package com.iab.omid.library.bigosg.walking;

import android.view.View;
import com.iab.omid.library.bigosg.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f6114a = new HashMap<>();
    private final HashMap<View, C0267a> b = new HashMap<>();
    private final HashMap<String, View> c = new HashMap<>();
    private final HashSet<View> d = new HashSet<>();
    private final HashSet<String> e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();
    private final HashMap<String, String> g = new HashMap<>();
    private boolean h;

    /* renamed from: com.iab.omid.library.bigosg.walking.a$a, reason: collision with other inner class name */
    public static class C0267a {

        /* renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.bigosg.b.c f6115a;
        private final ArrayList<String> b = new ArrayList<>();

        public C0267a(com.iab.omid.library.bigosg.b.c cVar, String str) {
            this.f6115a = cVar;
            a(str);
        }

        public com.iab.omid.library.bigosg.b.c a() {
            return this.f6115a;
        }

        public ArrayList<String> b() {
            return this.b;
        }

        public void a(String str) {
            this.b.add(str);
        }
    }

    private String d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e = f.e(view);
            if (e != null) {
                return e;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.d.addAll(hashSet);
        return null;
    }

    public String a(View view) {
        if (this.f6114a.size() == 0) {
            return null;
        }
        String str = this.f6114a.get(view);
        if (str != null) {
            this.f6114a.remove(view);
        }
        return str;
    }

    public View b(String str) {
        return this.c.get(str);
    }

    public c c(View view) {
        return this.d.contains(view) ? c.PARENT_VIEW : this.h ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        this.h = true;
    }

    public String a(String str) {
        return this.g.get(str);
    }

    public C0267a b(View view) {
        C0267a c0267a = this.b.get(view);
        if (c0267a != null) {
            this.b.remove(view);
        }
        return c0267a;
    }

    public void c() {
        com.iab.omid.library.bigosg.b.a a2 = com.iab.omid.library.bigosg.b.a.a();
        if (a2 != null) {
            for (com.iab.omid.library.bigosg.adsession.a aVar : a2.c()) {
                View d = aVar.d();
                if (aVar.e()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (d != null) {
                        String d2 = d(d);
                        if (d2 == null) {
                            this.e.add(adSessionId);
                            this.f6114a.put(d, adSessionId);
                            a(aVar);
                        } else {
                            this.f.add(adSessionId);
                            this.c.put(adSessionId, d);
                            this.g.put(adSessionId, d2);
                        }
                    } else {
                        this.f.add(adSessionId);
                        this.g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f6114a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h = false;
    }

    public HashSet<String> a() {
        return this.e;
    }

    public HashSet<String> b() {
        return this.f;
    }

    private void a(com.iab.omid.library.bigosg.adsession.a aVar) {
        Iterator<com.iab.omid.library.bigosg.b.c> it = aVar.a().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.bigosg.b.c cVar, com.iab.omid.library.bigosg.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0267a c0267a = this.b.get(view);
        if (c0267a != null) {
            c0267a.a(aVar.getAdSessionId());
        } else {
            this.b.put(view, new C0267a(cVar, aVar.getAdSessionId()));
        }
    }
}
