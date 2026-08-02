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
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
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
        View peekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.zzm = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0153, code lost:
    
        if (r9 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0131, code lost:
    
        if (r9 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0133, code lost:
    
        r3 = 1;
        r12 = true;
        r13 = true;
        r9 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(int i7) {
        WeakReference weakReference;
        View view;
        boolean z4;
        boolean z7;
        ?? emptyList;
        boolean z8;
        boolean z9;
        boolean z10;
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        boolean z11;
        if (this.zzn.isEmpty() || (weakReference = this.zzb) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect5 = new Rect();
        Rect rect6 = new Rect();
        Rect rect7 = new Rect();
        Rect rect8 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            z4 = view2.getGlobalVisibleRect(rect6);
            z7 = view2.getLocalVisibleRect(rect7);
            view2.getHitRect(rect8);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e7) {
                int i8 = J.f3546b;
                j.e("Failure getting view location.", e7);
            }
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfc)).booleanValue()) {
                rect5.left = iArr2[0];
                rect5.top = iArr2[1];
            } else {
                rect5.left = iArr[0];
                rect5.top = iArr[1];
            }
            rect5.right = view2.getWidth() + rect5.left;
            rect5.bottom = view2.getHeight() + rect5.top;
            view = view2;
        } else {
            view = null;
            z4 = false;
            z7 = false;
        }
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbB)).booleanValue() || view == null) {
            emptyList = Collections.emptyList();
        } else {
            try {
                emptyList = new ArrayList();
                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                    View view3 = (View) parent;
                    Rect rect9 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect9)) {
                        emptyList.add(zza(rect9));
                    }
                }
            } catch (Exception e8) {
                o.f1952C.f1961g.zzw(e8, "PositionWatcher.getParentScrollViewRects");
                emptyList = Collections.emptyList();
            }
        }
        List list = emptyList;
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
            if (view2 != null && P.o(view, this.zzg, this.zzh)) {
                if (z4) {
                    if (z7) {
                        if (J5 >= ((Integer) c0254t.f2726c.zzb(zzbby.zzkE)).intValue()) {
                        }
                        z4 = true;
                        z7 = true;
                    }
                    z4 = true;
                    z8 = 0;
                    z7 = false;
                }
                z8 = 0;
                z4 = false;
            }
            z8 = 0;
        } else {
            if (view2 != null && P.o(view, this.zzg, this.zzh)) {
                if (z4) {
                    if (z7) {
                    }
                    z4 = true;
                    z8 = 0;
                    z7 = false;
                }
                z8 = 0;
                z4 = false;
            }
            z8 = 0;
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzkG)).booleanValue()) {
            int i10 = true != P.o(view, this.zzg, this.zzh) ? 0 : 64;
            int i11 = true != z4 ? 0 : 8;
            z9 = z4;
            z10 = z7;
            P.i(view, (J5 >= ((long) ((Integer) c0254t.f2726c.zzb(zzbby.zzkE)).intValue()) ? 32 : 0) | (windowVisibility == 0 ? 128 : 0) | i10 | i11 | (true != z7 ? 0 : 16) | z8);
        } else {
            z9 = z4;
            z10 = z7;
        }
        if (i7 == 1) {
            B b7 = this.zzk;
            synchronized (b7.f3527c) {
                oVar.j.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                rect3 = rect7;
                rect4 = rect8;
                rect = rect5;
                rect2 = rect6;
                if (b7.f3526b + b7.f3525a <= elapsedRealtime) {
                    b7.f3526b = elapsedRealtime;
                } else if (z8 == this.zzl) {
                    return;
                }
            }
        } else {
            rect = rect5;
            rect2 = rect6;
            rect3 = rect7;
            rect4 = rect8;
        }
        if (z8 != 0 || this.zzl) {
            z11 = true;
        } else {
            z11 = true;
            if (i7 == 1) {
                return;
            }
        }
        oVar.j.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        boolean isScreenOn = this.zzg.isScreenOn();
        if (view == null || !view.isAttachedToWindow()) {
            z11 = false;
        }
        zzaxw zzaxwVar = new zzaxw(elapsedRealtime2, isScreenOn, z11, view != null ? view.getWindowVisibility() : 8, zza(this.zzp), zza(rect), zza(rect2), z9, zza(rect3), z10, J5, zza(rect4), this.zzo.density, z8, list);
        Iterator it = this.zzn.iterator();
        while (it.hasNext()) {
            ((zzaxx) it.next()).zzdn(zzaxwVar);
        }
        this.zzl = z8;
    }

    private final void zzk() {
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaxu
            @Override // java.lang.Runnable
            public final void run() {
                zzaxy.this.zzj(3);
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
