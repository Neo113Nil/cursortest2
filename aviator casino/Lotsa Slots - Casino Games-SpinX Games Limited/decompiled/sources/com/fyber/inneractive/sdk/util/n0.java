package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class n0 {
    public final java.util.WeakHashMap b = new java.util.WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.WeakHashMap f4301a = new java.util.WeakHashMap();
    public final com.fyber.inneractive.sdk.util.j c = new com.fyber.inneractive.sdk.util.j(16, new com.fyber.inneractive.sdk.util.i0());
    public final com.fyber.inneractive.sdk.util.j d = new com.fyber.inneractive.sdk.util.j(16, new com.fyber.inneractive.sdk.util.j0());

    public final void a(android.content.Context context, android.view.View view, com.fyber.inneractive.sdk.util.m0 m0Var) {
        android.view.View rootView;
        android.view.ViewTreeObserver viewTreeObserver;
        com.fyber.inneractive.sdk.util.IAlog.a("%strackView called with context: %s view: %s", "IAVisibilityTracker: ", context, view);
        if (context == null) {
            throw new java.lang.IllegalStateException("View must be attached to an Activity context");
        }
        android.content.Context applicationContext = context.getApplicationContext();
        java.util.WeakHashMap weakHashMap = (java.util.WeakHashMap) this.b.get(applicationContext);
        if (weakHashMap == null) {
            weakHashMap = new java.util.WeakHashMap();
            this.b.put(applicationContext, weakHashMap);
            if (context instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) context;
                if (activity.getWindow() != null) {
                    rootView = activity.getWindow().getDecorView();
                    viewTreeObserver = rootView.getViewTreeObserver();
                    if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                        com.fyber.inneractive.sdk.util.k0 k0Var = new com.fyber.inneractive.sdk.util.k0(this, applicationContext);
                        viewTreeObserver.addOnPreDrawListener(k0Var);
                        this.f4301a.put(applicationContext, new android.util.Pair(viewTreeObserver, k0Var));
                    }
                }
            }
            rootView = view.getRootView();
            viewTreeObserver = rootView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                com.fyber.inneractive.sdk.util.k0 k0Var2 = new com.fyber.inneractive.sdk.util.k0(this, applicationContext);
                viewTreeObserver.addOnPreDrawListener(k0Var2);
                this.f4301a.put(applicationContext, new android.util.Pair(viewTreeObserver, k0Var2));
            }
        }
        weakHashMap.put(view, m0Var);
        b();
    }

    public final void b(android.content.Context context) {
        java.util.WeakHashMap weakHashMap;
        if (context == null || (weakHashMap = (java.util.WeakHashMap) this.b.get(context)) == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.j jVar = this.d;
        java.lang.Object poll = jVar.f4295a.poll();
        if (poll == null) {
            poll = jVar.b.a();
        }
        java.util.HashSet hashSet = (java.util.HashSet) poll;
        hashSet.addAll(weakHashMap.keySet());
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            com.fyber.inneractive.sdk.util.m0 m0Var = (com.fyber.inneractive.sdk.util.m0) weakHashMap.get(view);
            if (m0Var != null) {
                com.fyber.inneractive.sdk.util.j jVar2 = this.c;
                java.lang.Object poll2 = jVar2.f4295a.poll();
                if (poll2 == null) {
                    poll2 = jVar2.b.a();
                }
                android.graphics.Rect rect = (android.graphics.Rect) poll2;
                m0Var.a((view == null || view.getParent() == null || !view.isShown() || !view.getGlobalVisibleRect(rect)) ? 0.0f : (rect.width() * rect.height()) / (view.getWidth() * view.getHeight()), rect);
                this.c.f4295a.offer(rect);
            }
        }
        hashSet.clear();
        this.d.f4295a.offer(hashSet);
    }

    public final void b() {
        for (android.content.Context context : this.b.keySet()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%stracking context: %s", "IAVisibilityTracker: ", context);
            java.util.WeakHashMap weakHashMap = (java.util.WeakHashMap) this.b.get(context);
            if (weakHashMap != null) {
                java.util.Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%stracking view: %s", "IAVisibilityTracker: ", (android.view.View) it.next());
                }
            }
        }
    }

    public final void a(android.view.View view) {
        com.fyber.inneractive.sdk.util.IAlog.a("%sunTrackView called with view", "IAVisibilityTracker: ");
        if (view == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sunTrackView called with a null view!", "IAVisibilityTracker: ");
            return;
        }
        android.content.Context context = view.getContext();
        if (context == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sview.getContext() returned null!", "IAVisibilityTracker: ");
            return;
        }
        java.util.Map map = (java.util.Map) this.b.get(context);
        if (map != null) {
            if (map.remove(view) != null) {
                if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= 2) {
                    com.fyber.inneractive.sdk.util.IAlog.e("removeViewFromContext found view for removal!", new java.lang.Object[0]);
                }
                if (map.isEmpty()) {
                    this.b.remove(context);
                    a(context);
                }
            }
        } else {
            java.util.Iterator it = new java.util.HashSet(this.b.keySet()).iterator();
            while (it.hasNext()) {
                android.content.Context context2 = (android.content.Context) it.next();
                java.util.WeakHashMap weakHashMap = (java.util.WeakHashMap) this.b.get(context2);
                if (weakHashMap != null && weakHashMap.remove(view) != null) {
                    if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= 2) {
                        com.fyber.inneractive.sdk.util.IAlog.e("removeViewFromContext found view for removal!", new java.lang.Object[0]);
                    }
                    if (weakHashMap.isEmpty()) {
                        this.b.remove(context2);
                        a(context2);
                    }
                }
            }
        }
        b();
    }

    public final void a() {
        this.b.clear();
        java.util.Iterator it = this.f4301a.keySet().iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) this.f4301a.get((android.content.Context) it.next());
            if (pair != null && ((android.view.ViewTreeObserver) pair.first).isAlive()) {
                ((android.view.ViewTreeObserver) pair.first).removeOnPreDrawListener((android.view.ViewTreeObserver.OnPreDrawListener) pair.second);
            }
        }
        this.f4301a.clear();
    }

    public final void a(android.content.Context context) {
        android.util.Pair pair = (android.util.Pair) this.f4301a.get(context);
        if (pair != null) {
            if (((android.view.ViewTreeObserver) pair.first).isAlive()) {
                ((android.view.ViewTreeObserver) pair.first).removeOnPreDrawListener((android.view.ViewTreeObserver.OnPreDrawListener) pair.second);
            }
            this.f4301a.remove(context);
        }
    }
}
