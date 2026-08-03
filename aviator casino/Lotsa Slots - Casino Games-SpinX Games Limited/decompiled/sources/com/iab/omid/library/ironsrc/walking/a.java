package com.iab.omid.library.ironsrc.walking;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.HashMap<android.view.View, java.lang.String> f4487a = new java.util.HashMap<>();
    private final java.util.HashMap<android.view.View, com.iab.omid.library.ironsrc.walking.a.C0104a> b = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, android.view.View> c = new java.util.HashMap<>();
    private final java.util.HashSet<android.view.View> d = new java.util.HashSet<>();
    private final java.util.HashSet<java.lang.String> e = new java.util.HashSet<>();
    private final java.util.HashSet<java.lang.String> f = new java.util.HashSet<>();
    private final java.util.HashMap<java.lang.String, java.lang.String> g = new java.util.HashMap<>();
    private final java.util.HashSet<java.lang.String> h = new java.util.HashSet<>();
    private final java.util.Map<android.view.View, java.lang.Boolean> i = new java.util.WeakHashMap();
    private boolean j;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a$a, reason: collision with other inner class name */
    public static class C0104a {

        /* renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.ironsrc.internal.e f4488a;
        private final java.util.ArrayList<java.lang.String> b = new java.util.ArrayList<>();

        public C0104a(com.iab.omid.library.ironsrc.internal.e eVar, java.lang.String str) {
            this.f4488a = eVar;
            a(str);
        }

        public com.iab.omid.library.ironsrc.internal.e a() {
            return this.f4488a;
        }

        public void a(java.lang.String str) {
            this.b.add(str);
        }

        public java.util.ArrayList<java.lang.String> b() {
            return this.b;
        }
    }

    private java.lang.Boolean a(android.view.View view) {
        if (view.hasWindowFocus()) {
            this.i.remove(view);
            return java.lang.Boolean.FALSE;
        }
        if (this.i.containsKey(view)) {
            return this.i.get(view);
        }
        java.util.Map<android.view.View, java.lang.Boolean> map = this.i;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    private java.lang.String a(android.view.View view, boolean z) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z) {
            return "noWindowFocus";
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        while (view != null) {
            java.lang.String a2 = com.iab.omid.library.ironsrc.utils.h.a(view);
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

    private void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        java.util.Iterator<com.iab.omid.library.ironsrc.internal.e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.ironsrc.internal.e eVar, com.iab.omid.library.ironsrc.adsession.a aVar) {
        android.view.View view = eVar.c().get();
        if (view == null) {
            return;
        }
        com.iab.omid.library.ironsrc.walking.a.C0104a c0104a = this.b.get(view);
        if (c0104a != null) {
            c0104a.a(aVar.getAdSessionId());
        } else {
            this.b.put(view, new com.iab.omid.library.ironsrc.walking.a.C0104a(eVar, aVar.getAdSessionId()));
        }
    }

    public android.view.View a(java.lang.String str) {
        return this.c.get(str);
    }

    public void a() {
        this.f4487a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.j = false;
        this.h.clear();
    }

    public com.iab.omid.library.ironsrc.walking.a.C0104a b(android.view.View view) {
        com.iab.omid.library.ironsrc.walking.a.C0104a c0104a = this.b.get(view);
        if (c0104a != null) {
            this.b.remove(view);
        }
        return c0104a;
    }

    public java.lang.String b(java.lang.String str) {
        return this.g.get(str);
    }

    public java.util.HashSet<java.lang.String> b() {
        return this.f;
    }

    public java.lang.String c(android.view.View view) {
        if (this.f4487a.size() == 0) {
            return null;
        }
        java.lang.String str = this.f4487a.get(view);
        if (str != null) {
            this.f4487a.remove(view);
        }
        return str;
    }

    public java.util.HashSet<java.lang.String> c() {
        return this.e;
    }

    public boolean c(java.lang.String str) {
        return this.h.contains(str);
    }

    public com.iab.omid.library.ironsrc.walking.c d(android.view.View view) {
        return this.d.contains(view) ? com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW : this.j ? com.iab.omid.library.ironsrc.walking.c.OBSTRUCTION_VIEW : com.iab.omid.library.ironsrc.walking.c.UNDERLYING_VIEW;
    }

    public void d() {
        this.j = true;
    }

    public void e() {
        com.iab.omid.library.ironsrc.internal.c c = com.iab.omid.library.ironsrc.internal.c.c();
        if (c != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : c.a()) {
                android.view.View c2 = aVar.c();
                if (aVar.f()) {
                    java.lang.String adSessionId = aVar.getAdSessionId();
                    if (c2 != null) {
                        boolean e = com.iab.omid.library.ironsrc.utils.h.e(c2);
                        if (e) {
                            this.h.add(adSessionId);
                        }
                        java.lang.String a2 = a(c2, e);
                        if (a2 == null) {
                            this.e.add(adSessionId);
                            this.f4487a.put(c2, adSessionId);
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

    public boolean e(android.view.View view) {
        if (!this.i.containsKey(view)) {
            return true;
        }
        this.i.put(view, java.lang.Boolean.TRUE);
        return false;
    }
}
