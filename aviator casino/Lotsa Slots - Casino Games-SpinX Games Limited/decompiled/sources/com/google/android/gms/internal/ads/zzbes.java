package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbes implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, android.app.Application.ActivityLifecycleCallbacks {
    private static final long zzc = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbY)).longValue();
    android.content.BroadcastReceiver zza;
    final java.lang.ref.WeakReference zzb;
    private final android.content.Context zzd;
    private android.app.Application zze;
    private final android.view.WindowManager zzf;
    private final android.os.PowerManager zzg;
    private final android.app.KeyguardManager zzh;
    private java.lang.ref.WeakReference zzi;
    private com.google.android.gms.internal.ads.zzbfe zzj;
    private final com.google.android.gms.ads.internal.util.zzbu zzk = new com.google.android.gms.ads.internal.util.zzbu(zzc);
    private boolean zzl = false;
    private int zzm = -1;
    private final java.util.HashSet zzn = new java.util.HashSet();
    private final android.util.DisplayMetrics zzo;
    private final android.graphics.Rect zzp;

    public zzbes(android.content.Context context, android.view.View view) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        android.view.WindowManager windowManager = (android.view.WindowManager) applicationContext.getSystemService("window");
        this.zzf = windowManager;
        this.zzg = (android.os.PowerManager) applicationContext.getSystemService("power");
        this.zzh = (android.app.KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof android.app.Application) {
            this.zze = (android.app.Application) applicationContext;
            this.zzj = new com.google.android.gms.internal.ads.zzbfe((android.app.Application) applicationContext, this);
        }
        this.zzo = context.getResources().getDisplayMetrics();
        android.graphics.Rect rect = new android.graphics.Rect();
        this.zzp = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        java.lang.ref.WeakReference weakReference = this.zzb;
        android.view.View view2 = weakReference != null ? (android.view.View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzm(view2);
        }
        this.zzb = new java.lang.ref.WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                zzl(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final void zzh() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzber
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzbes.this.zzf();
            }
        });
    }

    private final void zzi(android.app.Activity activity, int i) {
        android.view.Window window;
        java.lang.ref.WeakReference weakReference = this.zzb;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        android.view.View peekDecorView = window.peekDecorView();
        android.view.View view = (android.view.View) weakReference.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.zzm = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0147, code lost:
    
        if (r9 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0131, code lost:
    
        if (r9 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0149, code lost:
    
        r3 = true;
        r9 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022c A[LOOP:1: B:88:0x0226->B:90:0x022c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzj(int i) {
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        boolean z;
        boolean z2;
        java.util.List emptyList;
        boolean z3;
        java.util.Iterator it;
        if (this.zzn.isEmpty() || (weakReference = this.zzb) == null) {
            return;
        }
        android.view.View view2 = (android.view.View) weakReference.get();
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        android.graphics.Rect rect3 = new android.graphics.Rect();
        android.graphics.Rect rect4 = new android.graphics.Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            z = view2.getGlobalVisibleRect(rect2);
            z2 = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (java.lang.Exception e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failure getting view location.", e);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgc)).booleanValue()) {
                rect.left = iArr2[0];
                rect.top = iArr2[1];
            } else {
                rect.left = iArr[0];
                rect.top = iArr[1];
            }
            rect.right = rect.left + view2.getWidth();
            rect.bottom = rect.top + view2.getHeight();
            view = view2;
        } else {
            view = null;
            z = false;
            z2 = false;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcb)).booleanValue() || view == null) {
            emptyList = java.util.Collections.emptyList();
        } else {
            try {
                emptyList = new java.util.ArrayList();
                android.view.ViewParent parent = view.getParent();
                while (parent instanceof android.view.View) {
                    android.view.View view3 = (android.view.View) parent;
                    android.graphics.Rect rect5 = new android.graphics.Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        emptyList.add(zzc(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (java.lang.Exception e2) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "PositionWatcher.getParentScrollViewRects");
                emptyList = java.util.Collections.emptyList();
            }
        }
        java.util.List list = emptyList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i3 = this.zzm;
        if (i3 != -1) {
            windowVisibility = i3;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long zzy = com.google.android.gms.ads.internal.util.zzs.zzy(view);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlX)).booleanValue()) {
            if (view2 != null) {
                android.os.PowerManager powerManager = this.zzg;
                android.app.KeyguardManager keyguardManager = this.zzh;
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzX(view, powerManager, keyguardManager)) {
                    if (z) {
                        if (z2) {
                        }
                        z3 = 0;
                        z = true;
                        z2 = false;
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmc)).booleanValue()) {
                        }
                        if (i == 1) {
                        }
                        if (z3 != 0) {
                        }
                        com.google.android.gms.internal.ads.zzbep zzbepVar = new com.google.android.gms.internal.ads.zzbep(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), this.zzg.isScreenOn(), view == null && view.isAttachedToWindow(), view != null ? view.getWindowVisibility() : 8, zzc(this.zzp), zzc(rect), zzc(rect2), z, zzc(rect3), z2, zzy, zzc(rect4), this.zzo.density, z3, list);
                        it = this.zzn.iterator();
                        while (it.hasNext()) {
                        }
                        this.zzl = z3;
                    }
                    z3 = 0;
                    z = false;
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmc)).booleanValue()) {
                    }
                    if (i == 1) {
                    }
                    if (z3 != 0) {
                    }
                    com.google.android.gms.internal.ads.zzbep zzbepVar2 = new com.google.android.gms.internal.ads.zzbep(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), this.zzg.isScreenOn(), view == null && view.isAttachedToWindow(), view != null ? view.getWindowVisibility() : 8, zzc(this.zzp), zzc(rect), zzc(rect2), z, zzc(rect3), z2, zzy, zzc(rect4), this.zzo.density, z3, list);
                    it = this.zzn.iterator();
                    while (it.hasNext()) {
                    }
                    this.zzl = z3;
                }
            }
            z3 = 0;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmc)).booleanValue()) {
            }
            if (i == 1) {
            }
            if (z3 != 0) {
            }
            com.google.android.gms.internal.ads.zzbep zzbepVar22 = new com.google.android.gms.internal.ads.zzbep(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), this.zzg.isScreenOn(), view == null && view.isAttachedToWindow(), view != null ? view.getWindowVisibility() : 8, zzc(this.zzp), zzc(rect), zzc(rect2), z, zzc(rect3), z2, zzy, zzc(rect4), this.zzo.density, z3, list);
            it = this.zzn.iterator();
            while (it.hasNext()) {
            }
            this.zzl = z3;
        }
        if (view2 != null) {
            android.os.PowerManager powerManager2 = this.zzg;
            android.app.KeyguardManager keyguardManager2 = this.zzh;
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzX(view, powerManager2, keyguardManager2)) {
                if (z) {
                    if (z2) {
                        if (zzy >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzma)).intValue()) {
                        }
                        boolean z4 = false;
                        z = true;
                        z2 = true;
                        z3 = z4;
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmc)).booleanValue()) {
                            android.os.PowerManager powerManager3 = this.zzg;
                            android.app.KeyguardManager keyguardManager3 = this.zzh;
                            com.google.android.gms.ads.internal.zzt.zzc();
                            int i4 = true != com.google.android.gms.ads.internal.util.zzs.zzX(view, powerManager3, keyguardManager3) ? 0 : 64;
                            int i5 = true != z ? 0 : 8;
                            int i6 = true != z2 ? 0 : 16;
                            int i7 = windowVisibility == 0 ? 128 : 0;
                            int i8 = zzy >= ((long) ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzma)).intValue()) ? 32 : 0;
                            com.google.android.gms.ads.internal.zzt.zzc();
                            com.google.android.gms.ads.internal.util.zzs.zzM(view, i8 | i7 | i4 | i5 | i6 | z3, null);
                        }
                        if (i == 1 || this.zzk.zza() || z3 != this.zzl) {
                            if (z3 != 0 && !this.zzl) {
                                if (i == 1) {
                                    return;
                                }
                            }
                            com.google.android.gms.internal.ads.zzbep zzbepVar222 = new com.google.android.gms.internal.ads.zzbep(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), this.zzg.isScreenOn(), view == null && view.isAttachedToWindow(), view != null ? view.getWindowVisibility() : 8, zzc(this.zzp), zzc(rect), zzc(rect2), z, zzc(rect3), z2, zzy, zzc(rect4), this.zzo.density, z3, list);
                            it = this.zzn.iterator();
                            while (it.hasNext()) {
                                ((com.google.android.gms.internal.ads.zzbeq) it.next()).zzdj(zzbepVar222);
                            }
                            this.zzl = z3;
                        }
                        return;
                    }
                    z3 = 0;
                    z = true;
                    z2 = false;
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmc)).booleanValue()) {
                    }
                    if (i == 1) {
                    }
                    if (z3 != 0) {
                    }
                    com.google.android.gms.internal.ads.zzbep zzbepVar2222 = new com.google.android.gms.internal.ads.zzbep(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), this.zzg.isScreenOn(), view == null && view.isAttachedToWindow(), view != null ? view.getWindowVisibility() : 8, zzc(this.zzp), zzc(rect), zzc(rect2), z, zzc(rect3), z2, zzy, zzc(rect4), this.zzo.density, z3, list);
                    it = this.zzn.iterator();
                    while (it.hasNext()) {
                    }
                    this.zzl = z3;
                }
                z3 = 0;
                z = false;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmc)).booleanValue()) {
                }
                if (i == 1) {
                }
                if (z3 != 0) {
                }
                com.google.android.gms.internal.ads.zzbep zzbepVar22222 = new com.google.android.gms.internal.ads.zzbep(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), this.zzg.isScreenOn(), view == null && view.isAttachedToWindow(), view != null ? view.getWindowVisibility() : 8, zzc(this.zzp), zzc(rect), zzc(rect2), z, zzc(rect3), z2, zzy, zzc(rect4), this.zzo.density, z3, list);
                it = this.zzn.iterator();
                while (it.hasNext()) {
                }
                this.zzl = z3;
            }
        }
        z3 = 0;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmc)).booleanValue()) {
        }
        if (i == 1) {
        }
        if (z3 != 0) {
        }
        com.google.android.gms.internal.ads.zzbep zzbepVar222222 = new com.google.android.gms.internal.ads.zzbep(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), this.zzg.isScreenOn(), view == null && view.isAttachedToWindow(), view != null ? view.getWindowVisibility() : 8, zzc(this.zzp), zzc(rect), zzc(rect2), z, zzc(rect3), z2, zzy, zzc(rect4), this.zzo.density, z3, list);
        it = this.zzn.iterator();
        while (it.hasNext()) {
        }
        this.zzl = z3;
    }

    private final int zzk(int i) {
        return (int) (i / this.zzo.density);
    }

    private final void zzl(android.view.View view) {
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzi = new java.lang.ref.WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zza == null) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zza = new com.google.android.gms.internal.ads.zzbeo(this);
            com.google.android.gms.ads.internal.zzt.zzA().zzb(this.zzd, this.zza, intentFilter);
        }
        android.app.Application application = this.zze;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzj);
            } catch (java.lang.Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    private final void zzm(android.view.View view) {
        try {
            java.lang.ref.WeakReference weakReference = this.zzi;
            if (weakReference != null) {
                android.view.ViewTreeObserver viewTreeObserver = (android.view.ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzi = null;
            }
        } catch (java.lang.Exception e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            android.view.ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (java.lang.Exception e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.zza != null) {
            try {
                com.google.android.gms.ads.internal.zzt.zzA().zzc(this.zzd, this.zza);
            } catch (java.lang.IllegalStateException e3) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed trying to unregister the receiver", e3);
            } catch (java.lang.Exception e4) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zza = null;
        }
        android.app.Application application = this.zze;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzj);
            } catch (java.lang.Exception e5) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        zzi(activity, 0);
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        zzi(activity, 4);
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        zzj(3);
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzj(2);
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzj(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.zzm = -1;
        zzl(view);
        zzj(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.zzm = -1;
        zzj(3);
        zzh();
        zzm(view);
    }

    public final void zza(com.google.android.gms.internal.ads.zzbeq zzbeqVar) {
        this.zzn.add(zzbeqVar);
        zzj(3);
    }

    public final void zzb(com.google.android.gms.internal.ads.zzbeq zzbeqVar) {
        this.zzn.remove(zzbeqVar);
    }

    final android.graphics.Rect zzc(android.graphics.Rect rect) {
        return new android.graphics.Rect(zzk(rect.left), zzk(rect.top), zzk(rect.right), zzk(rect.bottom));
    }

    public final void zzd(long j) {
        this.zzk.zzb(j);
    }

    public final void zze() {
        this.zzk.zzb(zzc);
    }

    final /* synthetic */ void zzf() {
        zzj(3);
    }

    final /* synthetic */ void zzg(int i) {
        zzj(3);
    }
}
