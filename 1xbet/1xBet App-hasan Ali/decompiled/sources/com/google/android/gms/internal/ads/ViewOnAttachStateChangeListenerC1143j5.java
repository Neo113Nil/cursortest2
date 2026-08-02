package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.j5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1143j5 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: w, reason: collision with root package name */
    public static final Handler f14061w = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    public final Context f14062k;

    /* renamed from: l, reason: collision with root package name */
    public final Application f14063l;

    /* renamed from: m, reason: collision with root package name */
    public final PowerManager f14064m;

    /* renamed from: n, reason: collision with root package name */
    public final KeyguardManager f14065n;

    /* renamed from: o, reason: collision with root package name */
    public T2.E f14066o;

    /* renamed from: p, reason: collision with root package name */
    public final Z4 f14067p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f14068q;

    /* renamed from: r, reason: collision with root package name */
    public WeakReference f14069r;

    /* renamed from: s, reason: collision with root package name */
    public final X4 f14070s;

    /* renamed from: t, reason: collision with root package name */
    public byte f14071t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f14072u = -1;

    /* renamed from: v, reason: collision with root package name */
    public long f14073v = -3;

    public ViewOnAttachStateChangeListenerC1143j5(Context context, Z4 z42) {
        Context applicationContext = context.getApplicationContext();
        this.f14062k = applicationContext;
        this.f14067p = z42;
        this.f14064m = (PowerManager) applicationContext.getSystemService("power");
        this.f14065n = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f14063l = application;
            this.f14070s = new X4(application, this);
        }
        a(null);
    }

    public final void a(View view) {
        long j5;
        WeakReference weakReference = this.f14069r;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            e(view2);
        }
        this.f14069r = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                d(view);
            }
            view.addOnAttachStateChangeListener(this);
            j5 = -2;
        } else {
            j5 = -3;
        }
        this.f14073v = j5;
    }

    public final void b(Activity activity, int i) {
        Window window;
        if (this.f14069r == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        WeakReference weakReference = this.f14069r;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.f14072u = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
    
        if ((r2.flags & 524288) != 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        Activity activity;
        WeakReference weakReference = this.f14069r;
        if (weakReference == null) {
            return;
        }
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            this.f14073v = -3L;
            this.f14071t = (byte) -1;
            return;
        }
        int i = view.getVisibility() != 0 ? 1 : 0;
        if (!view.isShown()) {
            i |= 2;
        }
        PowerManager powerManager = this.f14064m;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i |= 4;
        }
        if (!this.f14067p.f12450a) {
            KeyguardManager keyguardManager = this.f14065n;
            if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode()) {
                char[] cArr = AbstractC1055h5.f13710a;
                View rootView = view.getRootView();
                if (rootView == null) {
                    rootView = view;
                }
                Context context = rootView.getContext();
                for (int i5 = 0; (context instanceof ContextWrapper) && i5 < 10; i5++) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
                activity = null;
                if (activity != null) {
                    Window window = activity.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes != null) {
                    }
                }
            }
            i |= 8;
        }
        if (!view.getGlobalVisibleRect(new Rect())) {
            i |= 16;
        }
        if (!view.getLocalVisibleRect(new Rect())) {
            i |= 32;
        }
        int windowVisibility = view.getWindowVisibility();
        int i6 = this.f14072u;
        if (i6 != -1) {
            windowVisibility = i6;
        }
        if (windowVisibility != 0) {
            i |= 64;
        }
        if (this.f14071t != i) {
            this.f14071t = (byte) i;
            this.f14073v = i == 0 ? SystemClock.elapsedRealtime() : (-3) - i;
        }
    }

    public final void d(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f14068q = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f14066o == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            T2.E e3 = new T2.E(2, this);
            this.f14066o = e3;
            this.f14062k.registerReceiver(e3, intentFilter);
        }
        Application application = this.f14063l;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f14070s);
            } catch (Exception unused) {
            }
        }
    }

    public final void e(View view) {
        try {
            WeakReference weakReference = this.f14068q;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f14068q = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        T2.E e3 = this.f14066o;
        if (e3 != null) {
            try {
                this.f14062k.unregisterReceiver(e3);
            } catch (Exception unused3) {
            }
            this.f14066o = null;
        }
        Application application = this.f14063l;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f14070s);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        c();
        f14061w.post(new K4(2, this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f14072u = -1;
        d(view);
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f14072u = -1;
        c();
        f14061w.post(new K4(2, this));
        e(view);
    }
}
