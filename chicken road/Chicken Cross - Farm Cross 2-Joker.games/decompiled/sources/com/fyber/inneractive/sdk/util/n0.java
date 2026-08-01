package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class n0 {
    public final WeakHashMap b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f5959a = new WeakHashMap();
    public final j c = new j(16, new i0());
    public final j d = new j(16, new j0());

    public final void a(Context context, View view, m0 m0Var) {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        IAlog.a("%strackView called with context: %s view: %s", "IAVisibilityTracker: ", context, view);
        if (context == null) {
            throw new IllegalStateException("View must be attached to an Activity context");
        }
        Context applicationContext = context.getApplicationContext();
        WeakHashMap weakHashMap = (WeakHashMap) this.b.get(applicationContext);
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.b.put(applicationContext, weakHashMap);
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.getWindow() != null) {
                    rootView = activity.getWindow().getDecorView();
                    viewTreeObserver = rootView.getViewTreeObserver();
                    if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                        k0 k0Var = new k0(this, applicationContext);
                        viewTreeObserver.addOnPreDrawListener(k0Var);
                        this.f5959a.put(applicationContext, new Pair(viewTreeObserver, k0Var));
                    }
                }
            }
            rootView = view.getRootView();
            viewTreeObserver = rootView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                k0 k0Var2 = new k0(this, applicationContext);
                viewTreeObserver.addOnPreDrawListener(k0Var2);
                this.f5959a.put(applicationContext, new Pair(viewTreeObserver, k0Var2));
            }
        }
        weakHashMap.put(view, m0Var);
        b();
    }

    public final void b(Context context) {
        WeakHashMap weakHashMap;
        if (context == null || (weakHashMap = (WeakHashMap) this.b.get(context)) == null) {
            return;
        }
        j jVar = this.d;
        Object poll = jVar.f5953a.poll();
        if (poll == null) {
            poll = jVar.b.a();
        }
        HashSet hashSet = (HashSet) poll;
        hashSet.addAll(weakHashMap.keySet());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            m0 m0Var = (m0) weakHashMap.get(view);
            if (m0Var != null) {
                j jVar2 = this.c;
                Object poll2 = jVar2.f5953a.poll();
                if (poll2 == null) {
                    poll2 = jVar2.b.a();
                }
                Rect rect = (Rect) poll2;
                m0Var.a((view == null || view.getParent() == null || !view.isShown() || !view.getGlobalVisibleRect(rect)) ? 0.0f : (rect.width() * rect.height()) / (view.getWidth() * view.getHeight()), rect);
                this.c.f5953a.offer(rect);
            }
        }
        hashSet.clear();
        this.d.f5953a.offer(hashSet);
    }

    public final void b() {
        for (Context context : this.b.keySet()) {
            IAlog.a("%stracking context: %s", "IAVisibilityTracker: ", context);
            WeakHashMap weakHashMap = (WeakHashMap) this.b.get(context);
            if (weakHashMap != null) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    IAlog.a("%stracking view: %s", "IAVisibilityTracker: ", (View) it.next());
                }
            }
        }
    }

    public final void a(View view) {
        IAlog.a("%sunTrackView called with view", "IAVisibilityTracker: ");
        if (view == null) {
            IAlog.a("%sunTrackView called with a null view!", "IAVisibilityTracker: ");
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            IAlog.a("%sview.getContext() returned null!", "IAVisibilityTracker: ");
            return;
        }
        Map map = (Map) this.b.get(context);
        if (map != null) {
            if (map.remove(view) != null) {
                if (IAlog.f5940a <= 2) {
                    IAlog.e("removeViewFromContext found view for removal!", new Object[0]);
                }
                if (map.isEmpty()) {
                    this.b.remove(context);
                    a(context);
                }
            }
        } else {
            Iterator it = new HashSet(this.b.keySet()).iterator();
            while (it.hasNext()) {
                Context context2 = (Context) it.next();
                WeakHashMap weakHashMap = (WeakHashMap) this.b.get(context2);
                if (weakHashMap != null && weakHashMap.remove(view) != null) {
                    if (IAlog.f5940a <= 2) {
                        IAlog.e("removeViewFromContext found view for removal!", new Object[0]);
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
        Iterator it = this.f5959a.keySet().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) this.f5959a.get((Context) it.next());
            if (pair != null && ((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
        }
        this.f5959a.clear();
    }

    public final void a(Context context) {
        Pair pair = (Pair) this.f5959a.get(context);
        if (pair != null) {
            if (((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
            this.f5959a.remove(context);
        }
    }
}
