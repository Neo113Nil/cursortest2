package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class M5 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: y, reason: collision with root package name */
    public static final long f10586y = ((Long) Q2.r.f5053d.f5056c.a(F7.f8861m1)).longValue();

    /* renamed from: k, reason: collision with root package name */
    public final Context f10587k;

    /* renamed from: l, reason: collision with root package name */
    public final Application f10588l;

    /* renamed from: m, reason: collision with root package name */
    public final PowerManager f10589m;

    /* renamed from: n, reason: collision with root package name */
    public final KeyguardManager f10590n;

    /* renamed from: o, reason: collision with root package name */
    public T2.E f10591o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f10592p;

    /* renamed from: q, reason: collision with root package name */
    public final WeakReference f10593q;

    /* renamed from: r, reason: collision with root package name */
    public final X4 f10594r;

    /* renamed from: s, reason: collision with root package name */
    public final T2.z f10595s = new T2.z(f10586y);

    /* renamed from: t, reason: collision with root package name */
    public boolean f10596t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f10597u = -1;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f10598v = new HashSet();

    /* renamed from: w, reason: collision with root package name */
    public final DisplayMetrics f10599w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f10600x;

    public M5(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f10587k = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f10589m = (PowerManager) applicationContext.getSystemService("power");
        this.f10590n = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f10588l = application;
            this.f10594r = new X4(application, this);
        }
        this.f10599w = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f10600x = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f10593q;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.f10593q = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        float f = rect.left;
        float f5 = this.f10599w.density;
        return new Rect((int) (f / f5), (int) (rect.top / f5), (int) (rect.right / f5), (int) (rect.bottom / f5));
    }

    public final void b(Activity activity, int i) {
        Window window;
        WeakReference weakReference = this.f10593q;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.f10597u = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x014c, code lost:
    
        if (r10 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012e, code lost:
    
        if (r10 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0130, code lost:
    
        r4 = true;
        r10 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214 A[LOOP:1: B:84:0x020e->B:86:0x0214, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a2  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i) {
        WeakReference weakReference;
        View view;
        boolean z3;
        boolean z5;
        ?? r02;
        ?? r42;
        PowerManager powerManager;
        boolean z6;
        Iterator it;
        HashSet hashSet = this.f10598v;
        if (hashSet.isEmpty() || (weakReference = this.f10593q) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            z3 = view2.getGlobalVisibleRect(rect2);
            z5 = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e3) {
                U2.j.g("Failure getting view location.", e3);
            }
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8705I4)).booleanValue()) {
                rect.left = iArr2[0];
                rect.top = iArr2[1];
            } else {
                rect.left = iArr[0];
                rect.top = iArr[1];
            }
            rect.right = view2.getWidth() + rect.left;
            rect.bottom = view2.getHeight() + rect.top;
            view = view2;
        } else {
            view = null;
            z3 = false;
            z5 = false;
        }
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8879p1)).booleanValue() || view == null) {
            r02 = Collections.EMPTY_LIST;
        } else {
            try {
                r02 = new ArrayList();
                ViewParent parent = view.getParent();
                while (parent instanceof View) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        r02.add(a(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (Exception e5) {
                P2.o.f4767B.f4774g.i("PositionWatcher.getParentScrollViewRects", e5);
                r02 = Collections.EMPTY_LIST;
            }
        }
        List list = r02;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i5 = this.f10597u;
        if (i5 != -1) {
            windowVisibility = i5;
        }
        P2.o oVar = P2.o.f4767B;
        T2.L l5 = oVar.f4771c;
        long J = T2.L.J(view);
        A7 a7 = F7.fa;
        Q2.r rVar = Q2.r.f5053d;
        boolean booleanValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
        D7 d7 = rVar.f5056c;
        KeyguardManager keyguardManager = this.f10590n;
        PowerManager powerManager2 = this.f10589m;
        if (!booleanValue) {
            if (view2 != null && T2.L.o(view, powerManager2, keyguardManager)) {
                if (z3) {
                    if (z5) {
                    }
                    r42 = 0;
                    z3 = true;
                    z5 = false;
                    if (((Boolean) d7.a(F7.ka)).booleanValue()) {
                    }
                    if (i == 1) {
                    }
                    if (r42 == 0) {
                    }
                    z6 = true;
                    oVar.f4776j.getClass();
                    SystemClock.elapsedRealtime();
                    powerManager.isScreenOn();
                    if (view == null) {
                    }
                    if (view != null) {
                    }
                    Rect a5 = a(this.f10600x);
                    Rect a6 = a(rect);
                    Rect a8 = a(rect2);
                    Rect a9 = a(rect3);
                    Rect a10 = a(rect4);
                    float f = this.f10599w.density;
                    boolean z7 = r42;
                    K5 k5 = new K5(r17, r18, a5, a6, a8, z3, a9, z5, a10, z7, list);
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                    }
                    this.f10596t = z7;
                }
                r42 = 0;
                z3 = false;
                if (((Boolean) d7.a(F7.ka)).booleanValue()) {
                }
                if (i == 1) {
                }
                if (r42 == 0) {
                }
                z6 = true;
                oVar.f4776j.getClass();
                SystemClock.elapsedRealtime();
                powerManager.isScreenOn();
                if (view == null) {
                }
                if (view != null) {
                }
                Rect a52 = a(this.f10600x);
                Rect a62 = a(rect);
                Rect a82 = a(rect2);
                Rect a92 = a(rect3);
                Rect a102 = a(rect4);
                float f5 = this.f10599w.density;
                boolean z72 = r42;
                K5 k52 = new K5(r17, r18, a52, a62, a82, z3, a92, z5, a102, z72, list);
                it = hashSet.iterator();
                while (it.hasNext()) {
                }
                this.f10596t = z72;
            }
            r42 = 0;
            if (((Boolean) d7.a(F7.ka)).booleanValue()) {
            }
            if (i == 1) {
            }
            if (r42 == 0) {
            }
            z6 = true;
            oVar.f4776j.getClass();
            SystemClock.elapsedRealtime();
            powerManager.isScreenOn();
            if (view == null) {
            }
            if (view != null) {
            }
            Rect a522 = a(this.f10600x);
            Rect a622 = a(rect);
            Rect a822 = a(rect2);
            Rect a922 = a(rect3);
            Rect a1022 = a(rect4);
            float f52 = this.f10599w.density;
            boolean z722 = r42;
            K5 k522 = new K5(r17, r18, a522, a622, a822, z3, a922, z5, a1022, z722, list);
            it = hashSet.iterator();
            while (it.hasNext()) {
            }
            this.f10596t = z722;
        }
        if (view2 != null && T2.L.o(view, powerManager2, keyguardManager)) {
            if (z3) {
                if (z5) {
                    if (J >= ((Integer) d7.a(F7.ia)).intValue()) {
                    }
                    boolean z8 = false;
                    z3 = true;
                    z5 = true;
                    r42 = z8;
                    if (((Boolean) d7.a(F7.ka)).booleanValue()) {
                        int i6 = true != T2.L.o(view, powerManager2, keyguardManager) ? 0 : 64;
                        int i7 = true != z3 ? 0 : 8;
                        powerManager = powerManager2;
                        T2.L.i(view, (J >= ((long) ((Integer) d7.a(F7.ia)).intValue()) ? 32 : 0) | i6 | i7 | (true != z5 ? 0 : 16) | (windowVisibility == 0 ? 128 : 0) | r42);
                    } else {
                        powerManager = powerManager2;
                    }
                    if (i == 1 || this.f10595s.i() || r42 != this.f10596t) {
                        if (r42 == 0 || this.f10596t) {
                            z6 = true;
                        } else {
                            z6 = true;
                            if (i == 1) {
                                return;
                            }
                        }
                        oVar.f4776j.getClass();
                        SystemClock.elapsedRealtime();
                        powerManager.isScreenOn();
                        boolean z9 = (view == null && view.isAttachedToWindow()) ? z6 : false;
                        int windowVisibility2 = view != null ? view.getWindowVisibility() : 8;
                        Rect a5222 = a(this.f10600x);
                        Rect a6222 = a(rect);
                        Rect a8222 = a(rect2);
                        Rect a9222 = a(rect3);
                        Rect a10222 = a(rect4);
                        float f522 = this.f10599w.density;
                        boolean z7222 = r42;
                        K5 k5222 = new K5(z9, windowVisibility2, a5222, a6222, a8222, z3, a9222, z5, a10222, z7222, list);
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((L5) it.next()).z0(k5222);
                        }
                        this.f10596t = z7222;
                    }
                    return;
                }
                r42 = 0;
                z3 = true;
                z5 = false;
                if (((Boolean) d7.a(F7.ka)).booleanValue()) {
                }
                if (i == 1) {
                }
                if (r42 == 0) {
                }
                z6 = true;
                oVar.f4776j.getClass();
                SystemClock.elapsedRealtime();
                powerManager.isScreenOn();
                if (view == null) {
                }
                if (view != null) {
                }
                Rect a52222 = a(this.f10600x);
                Rect a62222 = a(rect);
                Rect a82222 = a(rect2);
                Rect a92222 = a(rect3);
                Rect a102222 = a(rect4);
                float f5222 = this.f10599w.density;
                boolean z72222 = r42;
                K5 k52222 = new K5(z9, windowVisibility2, a52222, a62222, a82222, z3, a92222, z5, a102222, z72222, list);
                it = hashSet.iterator();
                while (it.hasNext()) {
                }
                this.f10596t = z72222;
            }
            r42 = 0;
            z3 = false;
            if (((Boolean) d7.a(F7.ka)).booleanValue()) {
            }
            if (i == 1) {
            }
            if (r42 == 0) {
            }
            z6 = true;
            oVar.f4776j.getClass();
            SystemClock.elapsedRealtime();
            powerManager.isScreenOn();
            if (view == null) {
            }
            if (view != null) {
            }
            Rect a522222 = a(this.f10600x);
            Rect a622222 = a(rect);
            Rect a822222 = a(rect2);
            Rect a922222 = a(rect3);
            Rect a1022222 = a(rect4);
            float f52222 = this.f10599w.density;
            boolean z722222 = r42;
            K5 k522222 = new K5(z9, windowVisibility2, a522222, a622222, a822222, z3, a922222, z5, a1022222, z722222, list);
            it = hashSet.iterator();
            while (it.hasNext()) {
            }
            this.f10596t = z722222;
        }
        r42 = 0;
        if (((Boolean) d7.a(F7.ka)).booleanValue()) {
        }
        if (i == 1) {
        }
        if (r42 == 0) {
        }
        z6 = true;
        oVar.f4776j.getClass();
        SystemClock.elapsedRealtime();
        powerManager.isScreenOn();
        if (view == null) {
        }
        if (view != null) {
        }
        Rect a5222222 = a(this.f10600x);
        Rect a6222222 = a(rect);
        Rect a8222222 = a(rect2);
        Rect a9222222 = a(rect3);
        Rect a10222222 = a(rect4);
        float f522222 = this.f10599w.density;
        boolean z7222222 = r42;
        K5 k5222222 = new K5(z9, windowVisibility2, a5222222, a6222222, a8222222, z3, a9222222, z5, a10222222, z7222222, list);
        it = hashSet.iterator();
        while (it.hasNext()) {
        }
        this.f10596t = z7222222;
    }

    public final void d() {
        T2.L.f5672l.post(new K4(4, this));
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f10592p = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f10591o == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            T2.E e3 = new T2.E(3, this);
            this.f10591o = e3;
            Context context = this.f10587k;
            R1.b bVar = P2.o.f4767B.f4791y;
            synchronized (bVar) {
                if (bVar.f5127l) {
                    ((WeakHashMap) bVar.f5129n).put(e3, intentFilter);
                } else {
                    F7.a(context);
                    if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.Ca)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                        context.registerReceiver(e3, intentFilter);
                    } else {
                        context.registerReceiver(e3, intentFilter, 4);
                    }
                }
            }
        }
        Application application = this.f10588l;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f10594r);
            } catch (Exception e5) {
                U2.j.g("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.f10592p;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f10592p = null;
            }
        } catch (Exception e3) {
            U2.j.g("Error while unregistering listeners from the last ViewTreeObserver.", e3);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e5) {
            U2.j.g("Error while unregistering listeners from the ViewTreeObserver.", e5);
        }
        T2.E e6 = this.f10591o;
        if (e6 != null) {
            try {
                P2.o.f4767B.f4791y.d(this.f10587k, e6);
            } catch (IllegalStateException e7) {
                U2.j.g("Failed trying to unregister the receiver", e7);
            } catch (Exception e8) {
                P2.o.f4767B.f4774g.i("ActiveViewUnit.stopScreenStatusMonitoring", e8);
            }
            this.f10591o = null;
        }
        Application application = this.f10588l;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f10594r);
            } catch (Exception e9) {
                U2.j.g("Error registering activity lifecycle callbacks.", e9);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c(3);
        d();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c(2);
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f10597u = -1;
        e(view);
        c(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f10597u = -1;
        c(3);
        d();
        f(view);
    }
}
