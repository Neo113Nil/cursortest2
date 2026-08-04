package com.google.android.gms.internal.ads;

import D0.c;
import E2.o;
import F2.C0254t;
import I2.B;
import I2.J;
import I2.P;
import J2.j;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
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
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzaxy implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final long zzc = ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzby)).longValue();
    BroadcastReceiver zza;
    final WeakReference zzb;
    private final Context zzd;
    private Application zze;
    private final WindowManager zzf;
    private final PowerManager zzg;
    private final KeyguardManager zzh;
    private WeakReference zzi;
    private zzayk zzj;
    private final B zzk = new B(zzc);
    private boolean zzl = false;
    private int zzm = -1;
    private final HashSet zzn = new HashSet();
    private final DisplayMetrics zzo;
    private final Rect zzp;

    public zzaxy(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.zzf = windowManager;
        this.zzg = (PowerManager) applicationContext.getSystemService("power");
        this.zzh = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.zze = application;
            this.zzj = new zzayk(application, this);
        }
        this.zzo = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.zzp = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.zzb;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzm(view2);
        }
        this.zzb = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                zzl(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final int zzh(int i7) {
        return (int) (i7 / this.zzo.density);
    }

    private final void zzi(Activity activity, int i7) {
        Window window;
        if (this.zzb == null || (window = activity.getWindow()) == null) {
            return;
        }
        WeakReference weakReference = this.zzb;
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.zzm = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:54:0x0133  */
    /* JADX WARN: Code duplicated, block: B:55:0x0138  */
    /* JADX WARN: Code duplicated, block: B:56:0x013a A[PHI: r12 r13
      0x013a: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v5 boolean), (r12v1 boolean), (r12v1 boolean) binds: [B:59:0x0143, B:61:0x014d, B:55:0x0138, B:46:0x010e, B:48:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x013a: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v4 boolean), (r13v1 boolean), (r13v1 boolean) binds: [B:59:0x0143, B:61:0x014d, B:55:0x0138, B:46:0x010e, B:48:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x013c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r30v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final void zzj(int i7) {
        WeakReference weakReference;
        View view;
        boolean globalVisibleRect;
        boolean localVisibleRect;
        ?? EmptyList;
        ?? r7;
        boolean z4;
        if (this.zzn.isEmpty() || (weakReference = this.zzb) == null) {
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
            globalVisibleRect = view2.getGlobalVisibleRect(rect2);
            localVisibleRect = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e7) {
                int i8 = J.f3546b;
                j.e("Failure getting view location.", e7);
            }
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfc)).booleanValue()) {
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
            globalVisibleRect = false;
            localVisibleRect = false;
        }
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbB)).booleanValue() || view == null) {
            EmptyList = Collections.emptyList();
        } else {
            try {
                EmptyList = new ArrayList();
                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        EmptyList.add(zza(rect5));
                    }
                }
            } catch (Exception e8) {
                o.f1952C.f1961g.zzw(e8, "PositionWatcher.getParentScrollViewRects");
                EmptyList = Collections.emptyList();
            }
        }
        ?? r31 = EmptyList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i9 = this.zzm;
        if (i9 != -1) {
            windowVisibility = i9;
        }
        o oVar = o.f1952C;
        P p5 = oVar.f1957c;
        long J5 = P.J(view);
        zzbbp zzbbpVar = zzbby.zzkB;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            if (view2 == null || !P.o(view, this.zzg, this.zzh)) {
                r7 = 0;
            } else if (!globalVisibleRect) {
                r7 = 0;
                globalVisibleRect = false;
            } else if (!localVisibleRect) {
                globalVisibleRect = true;
                r7 = 0;
                localVisibleRect = false;
            } else if (J5 < ((Integer) c0254t.f2726c.zzb(zzbby.zzkE)).intValue() || windowVisibility != 0) {
                globalVisibleRect = true;
                localVisibleRect = true;
                r7 = 0;
            } else {
                r7 = 1;
                globalVisibleRect = true;
                localVisibleRect = true;
                windowVisibility = 0;
            }
        } else if (view2 == null || !P.o(view, this.zzg, this.zzh)) {
            r7 = 0;
        } else if (!globalVisibleRect) {
            r7 = 0;
            globalVisibleRect = false;
        } else if (!localVisibleRect) {
            globalVisibleRect = true;
            r7 = 0;
            localVisibleRect = false;
        } else if (windowVisibility == 0) {
            r7 = 1;
            globalVisibleRect = true;
            localVisibleRect = true;
            windowVisibility = 0;
        } else {
            globalVisibleRect = true;
            localVisibleRect = true;
            r7 = 0;
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzkG)).booleanValue()) {
            int i10 = true != P.o(view, this.zzg, this.zzh) ? 0 : 64;
            int i11 = true != globalVisibleRect ? 0 : 8;
            P.i(view, (J5 >= ((long) ((Integer) c0254t.f2726c.zzb(zzbby.zzkE)).intValue()) ? 32 : 0) | (windowVisibility == 0 ? 128 : 0) | i10 | i11 | (true != localVisibleRect ? 0 : 16) | r7);
        }
        if (i7 == 1) {
            B b7 = this.zzk;
            synchronized (b7.f3527c) {
                oVar.j.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (b7.f3526b + b7.f3525a <= jElapsedRealtime) {
                    b7.f3526b = jElapsedRealtime;
                } else if (r7 == this.zzl) {
                    return;
                }
            }
        }
        if (r7 != 0 || this.zzl) {
            z4 = true;
        } else {
            z4 = true;
            if (i7 == 1) {
                return;
            }
        }
        oVar.j.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        boolean zIsScreenOn = this.zzg.isScreenOn();
        if (view == null || !view.isAttachedToWindow()) {
            z4 = false;
        }
        zzaxw zzaxwVar = new zzaxw(jElapsedRealtime2, zIsScreenOn, z4, view != null ? view.getWindowVisibility() : 8, zza(this.zzp), zza(rect), zza(rect2), globalVisibleRect, zza(rect3), localVisibleRect, J5, zza(rect4), this.zzo.density, r7, r31);
        Iterator it = this.zzn.iterator();
        while (it.hasNext()) {
            ((zzaxx) it.next()).zzdn(zzaxwVar);
        }
        this.zzl = r7;
    }

    private final void zzk() {
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaxu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(3);
            }
        });
    }

    private final void zzl(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzi = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zza == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            zzaxv zzaxvVar = new zzaxv(this);
            this.zza = zzaxvVar;
            Context context = this.zzd;
            c cVar = o.f1952C.f1979z;
            synchronized (cVar) {
                if (cVar.f1627b) {
                    ((WeakHashMap) cVar.f1629d).put(zzaxvVar, intentFilter);
                } else {
                    zzbby.zza(context);
                    if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkY)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                        context.registerReceiver(zzaxvVar, intentFilter);
                    } else {
                        context.registerReceiver(zzaxvVar, intentFilter, 4);
                    }
                }
            }
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e7) {
                int i7 = J.f3546b;
                j.e("Error registering activity lifecycle callbacks.", e7);
            }
        }
    }

    private final void zzm(View view) {
        try {
            WeakReference weakReference = this.zzi;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzi = null;
            }
        } catch (Exception e7) {
            int i7 = J.f3546b;
            j.e("Error while unregistering listeners from the last ViewTreeObserver.", e7);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e8) {
            int i8 = J.f3546b;
            j.e("Error while unregistering listeners from the ViewTreeObserver.", e8);
        }
        BroadcastReceiver broadcastReceiver = this.zza;
        if (broadcastReceiver != null) {
            try {
                o.f1952C.f1979z.c(this.zzd, broadcastReceiver);
            } catch (IllegalStateException e9) {
                int i9 = J.f3546b;
                j.e("Failed trying to unregister the receiver", e9);
            } catch (Exception e10) {
                o.f1952C.f1961g.zzw(e10, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zza = null;
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e11) {
                int i10 = J.f3546b;
                j.e("Error registering activity lifecycle callbacks.", e11);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzi(activity, 4);
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzj(3);
        zzk();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzj(2);
        zzk();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzj(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzm = -1;
        zzl(view);
        zzj(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zzm = -1;
        zzj(3);
        zzk();
        zzm(view);
    }

    public final Rect zza(Rect rect) {
        return new Rect(zzh(rect.left), zzh(rect.top), zzh(rect.right), zzh(rect.bottom));
    }

    public final void zzd(zzaxx zzaxxVar) {
        this.zzn.add(zzaxxVar);
        zzj(3);
    }

    public final void zze(zzaxx zzaxxVar) {
        this.zzn.remove(zzaxxVar);
    }

    public final void zzf() {
        B b7 = this.zzk;
        long j = zzc;
        synchronized (b7.f3527c) {
            b7.f3525a = j;
        }
    }

    public final void zzg(long j) {
        B b7 = this.zzk;
        synchronized (b7.f3527c) {
            b7.f3525a = j;
        }
    }
}
