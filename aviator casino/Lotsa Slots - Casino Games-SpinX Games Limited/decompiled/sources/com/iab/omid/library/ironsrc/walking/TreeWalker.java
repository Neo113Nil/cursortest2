package com.iab.omid.library.ironsrc.walking;

/* loaded from: classes5.dex */
public class TreeWalker implements com.iab.omid.library.ironsrc.processor.a.InterfaceC0102a {
    private static com.iab.omid.library.ironsrc.walking.TreeWalker i = new com.iab.omid.library.ironsrc.walking.TreeWalker();
    private static android.os.Handler j = new android.os.Handler(android.os.Looper.getMainLooper());
    private static android.os.Handler k = null;
    private static final java.lang.Runnable l = new com.iab.omid.library.ironsrc.walking.TreeWalker.b();
    private static final java.lang.Runnable m = new com.iab.omid.library.ironsrc.walking.TreeWalker.c();
    private int b;
    private long h;

    /* renamed from: a, reason: collision with root package name */
    private java.util.List<com.iab.omid.library.ironsrc.walking.TreeWalker.TreeWalkerTimeLogger> f4485a = new java.util.ArrayList();
    private boolean c = false;
    private final java.util.List<com.iab.omid.library.ironsrc.weakreference.a> d = new java.util.ArrayList();
    private com.iab.omid.library.ironsrc.walking.a f = new com.iab.omid.library.ironsrc.walking.a();
    private com.iab.omid.library.ironsrc.processor.b e = new com.iab.omid.library.ironsrc.processor.b();
    private com.iab.omid.library.ironsrc.walking.b g = new com.iab.omid.library.ironsrc.walking.b(new com.iab.omid.library.ironsrc.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends com.iab.omid.library.ironsrc.walking.TreeWalker.TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.iab.omid.library.ironsrc.walking.TreeWalker.this.g.b();
        }
    }

    class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.iab.omid.library.ironsrc.walking.TreeWalker.getInstance().l();
        }
    }

    class c implements java.lang.Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.iab.omid.library.ironsrc.walking.TreeWalker.k != null) {
                com.iab.omid.library.ironsrc.walking.TreeWalker.k.post(com.iab.omid.library.ironsrc.walking.TreeWalker.l);
                com.iab.omid.library.ironsrc.walking.TreeWalker.k.postDelayed(com.iab.omid.library.ironsrc.walking.TreeWalker.m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void a(long j2) {
        if (this.f4485a.size() > 0) {
            for (com.iab.omid.library.ironsrc.walking.TreeWalker.TreeWalkerTimeLogger treeWalkerTimeLogger : this.f4485a) {
                treeWalkerTimeLogger.onTreeProcessed(this.b, java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(j2));
                if (treeWalkerTimeLogger instanceof com.iab.omid.library.ironsrc.walking.TreeWalker.TreeWalkerNanoTimeLogger) {
                    ((com.iab.omid.library.ironsrc.walking.TreeWalker.TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.b, j2);
                }
            }
        }
    }

    private void a(android.view.View view, com.iab.omid.library.ironsrc.processor.a aVar, org.json.JSONObject jSONObject, com.iab.omid.library.ironsrc.walking.c cVar, boolean z) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, z);
    }

    private void a(java.lang.String str, android.view.View view, org.json.JSONObject jSONObject) {
        com.iab.omid.library.ironsrc.processor.a b2 = this.e.b();
        java.lang.String b3 = this.f.b(str);
        if (b3 != null) {
            org.json.JSONObject a2 = b2.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(a2, str);
            com.iab.omid.library.ironsrc.utils.c.b(a2, b3);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, a2);
        }
    }

    private boolean a(android.view.View view, org.json.JSONObject jSONObject) {
        com.iab.omid.library.ironsrc.walking.a.C0104a b2 = this.f.b(view);
        if (b2 == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, b2);
        return true;
    }

    private boolean b(android.view.View view, org.json.JSONObject jSONObject) {
        java.lang.String c2 = this.f.c(view);
        if (c2 == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, c2);
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, java.lang.Boolean.valueOf(this.f.e(view)));
        com.iab.omid.library.ironsrc.utils.c.b(jSONObject, java.lang.Boolean.valueOf(this.f.c(c2)));
        this.f.d();
        return true;
    }

    private void d() {
        a(com.iab.omid.library.ironsrc.utils.f.b() - this.h);
    }

    private void e() {
        this.b = 0;
        this.d.clear();
        this.c = false;
        java.util.Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.c = true;
                break;
            }
        }
        this.h = com.iab.omid.library.ironsrc.utils.f.b();
    }

    public static com.iab.omid.library.ironsrc.walking.TreeWalker getInstance() {
        return i;
    }

    private void i() {
        if (k == null) {
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            k = handler;
            handler.post(l);
            k.postDelayed(m, 200L);
        }
    }

    private void k() {
        android.os.Handler handler = k;
        if (handler != null) {
            handler.removeCallbacks(m);
            k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        com.iab.omid.library.ironsrc.internal.j.b().a();
    }

    @Override // com.iab.omid.library.ironsrc.processor.a.InterfaceC0102a
    public void a(android.view.View view, com.iab.omid.library.ironsrc.processor.a aVar, org.json.JSONObject jSONObject, boolean z) {
        com.iab.omid.library.ironsrc.walking.c d;
        if (com.iab.omid.library.ironsrc.utils.h.f(view) && (d = this.f.d(view)) != com.iab.omid.library.ironsrc.walking.c.UNDERLYING_VIEW) {
            org.json.JSONObject a2 = aVar.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, a2);
            if (!b(view, a2)) {
                boolean z2 = z || a(view, a2);
                if (this.c && d == com.iab.omid.library.ironsrc.walking.c.OBSTRUCTION_VIEW && !z2) {
                    this.d.add(new com.iab.omid.library.ironsrc.weakreference.a(view));
                }
                a(view, aVar, a2, d, z2);
            }
            this.b++;
        }
    }

    public void addTimeLogger(com.iab.omid.library.ironsrc.walking.TreeWalker.TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f4485a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f4485a.add(treeWalkerTimeLogger);
    }

    void f() {
        this.f.e();
        long b2 = com.iab.omid.library.ironsrc.utils.f.b();
        com.iab.omid.library.ironsrc.processor.a a2 = this.e.a();
        if (this.f.b().size() > 0) {
            java.util.Iterator<java.lang.String> it = this.f.b().iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                org.json.JSONObject a3 = a2.a(null);
                a(next, this.f.a(next), a3);
                com.iab.omid.library.ironsrc.utils.c.b(a3);
                java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
                hashSet.add(next);
                this.g.a(a3, hashSet, b2);
            }
        }
        if (this.f.c().size() > 0) {
            org.json.JSONObject a4 = a2.a(null);
            a(null, a2, a4, com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.ironsrc.utils.c.b(a4);
            this.g.b(a4, this.f.c(), b2);
            if (this.c) {
                java.util.Iterator<com.iab.omid.library.ironsrc.adsession.a> it2 = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.d);
                }
            }
        } else {
            this.g.b();
        }
        this.f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f4485a.clear();
        j.post(new com.iab.omid.library.ironsrc.walking.TreeWalker.a());
    }

    public void removeTimeLogger(com.iab.omid.library.ironsrc.walking.TreeWalker.TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f4485a.contains(treeWalkerTimeLogger)) {
            this.f4485a.remove(treeWalkerTimeLogger);
        }
    }
}
