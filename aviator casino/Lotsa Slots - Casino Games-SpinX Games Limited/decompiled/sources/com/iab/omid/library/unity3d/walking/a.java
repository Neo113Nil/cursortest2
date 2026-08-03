package com.iab.omid.library.unity3d.walking;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.HashMap<android.view.View, java.lang.String> f4521a = new java.util.HashMap<>();
    private final java.util.HashMap<android.view.View, com.iab.omid.library.unity3d.walking.a.C0108a> b = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, android.view.View> c = new java.util.HashMap<>();
    private final java.util.HashSet<android.view.View> d = new java.util.HashSet<>();
    private final java.util.HashSet<java.lang.String> e = new java.util.HashSet<>();
    private final java.util.HashSet<java.lang.String> f = new java.util.HashSet<>();
    private final java.util.HashMap<java.lang.String, java.lang.String> g = new java.util.HashMap<>();
    private final java.util.Map<android.view.View, java.lang.Boolean> h = new java.util.WeakHashMap();
    private boolean i;

    /* renamed from: com.iab.omid.library.unity3d.walking.a$a, reason: collision with other inner class name */
    public static class C0108a {

        /* renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.unity3d.internal.e f4522a;
        private final java.util.ArrayList<java.lang.String> b = new java.util.ArrayList<>();

        public C0108a(com.iab.omid.library.unity3d.internal.e eVar, java.lang.String str) {
            this.f4522a = eVar;
            a(str);
        }

        public com.iab.omid.library.unity3d.internal.e a() {
            return this.f4522a;
        }

        public void a(java.lang.String str) {
            this.b.add(str);
        }

        public java.util.ArrayList<java.lang.String> b() {
            return this.b;
        }
    }

    private java.lang.String a(android.view.View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
            return "noWindowFocus";
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        while (view != null) {
            java.lang.String a2 = com.iab.omid.library.unity3d.utils.h.a(view);
            if (a2 != null) {
                return a2;
            }
            hashSet.add(view);
            java.lang.Object parent = view.getParent();
            view = parent instanceof android.view.View ? (android.view.View) parent : null;
        }
        this.d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.unity3d.adsession.a aVar) {
        java.util.Iterator<com.iab.omid.library.unity3d.internal.e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.unity3d.internal.e eVar, com.iab.omid.library.unity3d.adsession.a aVar) {
        android.view.View view = eVar.c().get();
        if (view == null) {
            return;
        }
        com.iab.omid.library.unity3d.walking.a.C0108a c0108a = this.b.get(view);
        if (c0108a != null) {
            c0108a.a(aVar.getAdSessionId());
        } else {
            this.b.put(view, new com.iab.omid.library.unity3d.walking.a.C0108a(eVar, aVar.getAdSessionId()));
        }
    }

    private java.lang.Boolean b(android.view.View view) {
        if (view.hasWindowFocus()) {
            this.h.remove(view);
            return java.lang.Boolean.FALSE;
        }
        if (this.h.containsKey(view)) {
            return this.h.get(view);
        }
        java.util.Map<android.view.View, java.lang.Boolean> map = this.h;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public android.view.View a(java.lang.String str) {
        return this.c.get(str);
    }

    public void a() {
        this.f4521a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.i = false;
    }

    public java.lang.String b(java.lang.String str) {
        return this.g.get(str);
    }

    public java.util.HashSet<java.lang.String> b() {
        return this.f;
    }

    public com.iab.omid.library.unity3d.walking.a.C0108a c(android.view.View view) {
        com.iab.omid.library.unity3d.walking.a.C0108a c0108a = this.b.get(view);
        if (c0108a != null) {
            this.b.remove(view);
        }
        return c0108a;
    }

    public java.util.HashSet<java.lang.String> c() {
        return this.e;
    }

    public java.lang.String d(android.view.View view) {
        if (this.f4521a.size() == 0) {
            return null;
        }
        java.lang.String str = this.f4521a.get(view);
        if (str != null) {
            this.f4521a.remove(view);
        }
        return str;
    }

    public void d() {
        this.i = true;
    }

    public com.iab.omid.library.unity3d.walking.c e(android.view.View view) {
        return this.d.contains(view) ? com.iab.omid.library.unity3d.walking.c.PARENT_VIEW : this.i ? com.iab.omid.library.unity3d.walking.c.OBSTRUCTION_VIEW : com.iab.omid.library.unity3d.walking.c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.unity3d.internal.c c = com.iab.omid.library.unity3d.internal.c.c();
        if (c != null) {
            for (com.iab.omid.library.unity3d.adsession.a aVar : c.a()) {
                android.view.View c2 = aVar.c();
                if (aVar.f()) {
                    java.lang.String adSessionId = aVar.getAdSessionId();
                    if (c2 != null) {
                        java.lang.String a2 = a(c2);
                        if (a2 == null) {
                            this.e.add(adSessionId);
                            this.f4521a.put(c2, adSessionId);
                            a(aVar);
                        } else if (a2 != "noWindowFocus") {
                            this.f.add(adSessionId);
                            this.c.put(adSessionId, c2);
                            this.g.put(adSessionId, a2);
                        }
                    } else {
                        this.f.add(adSessionId);
                        this.g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean f(android.view.View view) {
        if (!this.h.containsKey(view)) {
            return true;
        }
        this.h.put(view, java.lang.Boolean.TRUE);
        return false;
    }
}
