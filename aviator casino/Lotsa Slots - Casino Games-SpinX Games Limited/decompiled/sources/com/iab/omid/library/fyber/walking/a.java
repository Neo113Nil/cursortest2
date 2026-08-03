package com.iab.omid.library.fyber.walking;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.HashMap<android.view.View, java.lang.String> f4411a = new java.util.HashMap<>();
    private final java.util.HashMap<android.view.View, com.iab.omid.library.fyber.walking.a.C0095a> b = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, android.view.View> c = new java.util.HashMap<>();
    private final java.util.HashSet<android.view.View> d = new java.util.HashSet<>();
    private final java.util.HashSet<java.lang.String> e = new java.util.HashSet<>();
    private final java.util.HashSet<java.lang.String> f = new java.util.HashSet<>();
    private final java.util.HashMap<java.lang.String, java.lang.String> g = new java.util.HashMap<>();
    private final java.util.HashSet<java.lang.String> h = new java.util.HashSet<>();
    private final java.util.Map<android.view.View, java.lang.Boolean> i = new java.util.WeakHashMap();
    private boolean j;

    /* renamed from: com.iab.omid.library.fyber.walking.a$a, reason: collision with other inner class name */
    public static class C0095a {

        /* renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.fyber.internal.e f4412a;
        private final java.util.ArrayList<java.lang.String> b = new java.util.ArrayList<>();

        public C0095a(com.iab.omid.library.fyber.internal.e eVar, java.lang.String str) {
            this.f4412a = eVar;
            a(str);
        }

        public com.iab.omid.library.fyber.internal.e a() {
            return this.f4412a;
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
            java.lang.String a2 = com.iab.omid.library.fyber.utils.h.a(view);
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

    private void a(com.iab.omid.library.fyber.adsession.a aVar) {
        java.util.Iterator<com.iab.omid.library.fyber.internal.e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.fyber.internal.e eVar, com.iab.omid.library.fyber.adsession.a aVar) {
        android.view.View view = eVar.c().get();
        if (view == null) {
            return;
        }
        com.iab.omid.library.fyber.walking.a.C0095a c0095a = this.b.get(view);
        if (c0095a != null) {
            c0095a.a(aVar.c());
        } else {
            this.b.put(view, new com.iab.omid.library.fyber.walking.a.C0095a(eVar, aVar.c()));
        }
    }

    public android.view.View a(java.lang.String str) {
        return this.c.get(str);
    }

    public void a() {
        this.f4411a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.j = false;
        this.h.clear();
    }

    public com.iab.omid.library.fyber.walking.a.C0095a b(android.view.View view) {
        com.iab.omid.library.fyber.walking.a.C0095a c0095a = this.b.get(view);
        if (c0095a != null) {
            this.b.remove(view);
        }
        return c0095a;
    }

    public java.lang.String b(java.lang.String str) {
        return this.g.get(str);
    }

    public java.util.HashSet<java.lang.String> b() {
        return this.f;
    }

    public java.lang.String c(android.view.View view) {
        if (this.f4411a.size() == 0) {
            return null;
        }
        java.lang.String str = this.f4411a.get(view);
        if (str != null) {
            this.f4411a.remove(view);
        }
        return str;
    }

    public java.util.HashSet<java.lang.String> c() {
        return this.e;
    }

    public boolean c(java.lang.String str) {
        return this.h.contains(str);
    }

    public com.iab.omid.library.fyber.walking.c d(android.view.View view) {
        return this.d.contains(view) ? com.iab.omid.library.fyber.walking.c.PARENT_VIEW : this.j ? com.iab.omid.library.fyber.walking.c.OBSTRUCTION_VIEW : com.iab.omid.library.fyber.walking.c.UNDERLYING_VIEW;
    }

    public void d() {
        this.j = true;
    }

    public void e() {
        com.iab.omid.library.fyber.internal.c c = com.iab.omid.library.fyber.internal.c.c();
        if (c != null) {
            for (com.iab.omid.library.fyber.adsession.a aVar : c.a()) {
                android.view.View e = aVar.e();
                if (aVar.h()) {
                    java.lang.String c2 = aVar.c();
                    if (e != null) {
                        boolean e2 = com.iab.omid.library.fyber.utils.h.e(e);
                        if (e2) {
                            this.h.add(c2);
                        }
                        java.lang.String a2 = a(e, e2);
                        if (a2 == null) {
                            this.e.add(c2);
                            this.f4411a.put(e, c2);
                            a(aVar);
                        } else if (a2 != "noWindowFocus") {
                            this.f.add(c2);
                            this.c.put(c2, e);
                            this.g.put(c2, a2);
                        }
                    } else {
                        this.f.add(c2);
                        this.g.put(c2, "noAdView");
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
