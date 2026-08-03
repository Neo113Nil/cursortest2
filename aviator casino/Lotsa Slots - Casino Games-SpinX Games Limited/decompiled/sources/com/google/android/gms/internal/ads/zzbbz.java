package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbbz implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, android.app.Application.ActivityLifecycleCallbacks {
    private static final android.os.Handler zza = new android.os.Handler(android.os.Looper.getMainLooper());
    private final android.content.Context zzb;
    private android.app.Application zzc;
    private final android.os.PowerManager zzd;
    private final android.app.KeyguardManager zze;
    private android.content.BroadcastReceiver zzf;
    private final com.google.android.gms.internal.ads.zzbbl zzg;
    private java.lang.ref.WeakReference zzh;
    private java.lang.ref.WeakReference zzi;
    private com.google.android.gms.internal.ads.zzbbh zzj;
    private byte zzk = -1;
    private int zzl = -1;
    private long zzm = -3;

    public zzbbz(android.content.Context context, com.google.android.gms.internal.ads.zzbbl zzbblVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.zzb = applicationContext;
        this.zzg = zzbblVar;
        this.zzd = (android.os.PowerManager) applicationContext.getSystemService("power");
        this.zze = (android.app.KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof android.app.Application) {
            this.zzc = (android.app.Application) applicationContext;
            this.zzj = new com.google.android.gms.internal.ads.zzbbh((android.app.Application) applicationContext, this);
        }
        zza(null);
    }

    private final void zze() {
        zza.post(new com.google.android.gms.internal.ads.zzbbx(this));
    }

    private final void zzf(android.app.Activity activity, int i) {
        android.view.Window window;
        if (this.zzi == null || (window = activity.getWindow()) == null) {
            return;
        }
        android.view.View peekDecorView = window.peekDecorView();
        android.view.View zzb = zzb();
        if (zzb == null || peekDecorView == null || zzb.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.zzl = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0080, code lost:
    
        if ((r8.flags & 524288) != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006a, code lost:
    
        r6 = null;
     */
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd() {
        android.app.Activity activity;
        if (this.zzi == null) {
            return;
        }
        android.view.View zzb = zzb();
        if (zzb == null) {
            this.zzm = -3L;
            this.zzk = (byte) -1;
            return;
        }
        int i = 0;
        int i2 = zzb.getVisibility() != 0 ? 1 : 0;
        if (!zzb.isShown()) {
            i2 |= 2;
        }
        android.os.PowerManager powerManager = this.zzd;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i2 |= 4;
        }
        if (!this.zzg.zza()) {
            android.app.KeyguardManager keyguardManager = this.zze;
            if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode()) {
                int i3 = com.google.android.gms.internal.ads.zzbbv.zza;
                android.view.View rootView = zzb.getRootView();
                if (rootView == null) {
                    rootView = zzb;
                }
                android.content.Context context = rootView.getContext();
                while (true) {
                    if (!(context instanceof android.content.ContextWrapper) || i >= 10) {
                        break;
                    }
                    if (context instanceof android.app.Activity) {
                        activity = (android.app.Activity) context;
                        break;
                    } else {
                        context = ((android.content.ContextWrapper) context).getBaseContext();
                        i++;
                    }
                }
                if (activity != null) {
                    android.view.Window window = activity.getWindow();
                    android.view.WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes != null) {
                    }
                }
            }
            i2 |= 8;
        }
        if (!zzb.getGlobalVisibleRect(new android.graphics.Rect())) {
            i2 |= 16;
        }
        if (!zzb.getLocalVisibleRect(new android.graphics.Rect())) {
            i2 |= 32;
        }
        int windowVisibility = zzb.getWindowVisibility();
        int i4 = this.zzl;
        if (i4 != -1) {
            windowVisibility = i4;
        }
        if (windowVisibility != 0) {
            i2 |= 64;
        }
        if (this.zzk != i2) {
            this.zzk = (byte) i2;
            this.zzm = i2 == 0 ? android.os.SystemClock.elapsedRealtime() : (-3) - i2;
        }
    }

    private final void zzh(android.view.View view) {
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzh = new java.lang.ref.WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzf == null) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            com.google.android.gms.internal.ads.zzbby zzbbyVar = new com.google.android.gms.internal.ads.zzbby(this);
            this.zzf = zzbbyVar;
            this.zzb.registerReceiver(zzbbyVar, intentFilter);
        }
        android.app.Application application = this.zzc;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzj);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private final void zzi(android.view.View view) {
        try {
            java.lang.ref.WeakReference weakReference = this.zzh;
            if (weakReference != null) {
                android.view.ViewTreeObserver viewTreeObserver = (android.view.ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzh = null;
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            android.view.ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (java.lang.Exception unused2) {
        }
        android.content.BroadcastReceiver broadcastReceiver = this.zzf;
        if (broadcastReceiver != null) {
            try {
                this.zzb.unregisterReceiver(broadcastReceiver);
            } catch (java.lang.Exception unused3) {
            }
            this.zzf = null;
        }
        android.app.Application application = this.zzc;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzj);
            } catch (java.lang.Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        zzf(activity, 0);
        zzd();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        zzd();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        zzf(activity, 4);
        zzd();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        zzf(activity, 0);
        zzd();
        zze();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        zzd();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        zzf(activity, 0);
        zzd();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        zzd();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzd();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzd();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.zzl = -1;
        zzh(view);
        zzd();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.zzl = -1;
        zzd();
        zze();
        zzi(view);
    }

    final void zza(android.view.View view) {
        long j;
        android.view.View zzb = zzb();
        if (zzb != null) {
            zzb.removeOnAttachStateChangeListener(this);
            zzi(zzb);
        }
        this.zzi = new java.lang.ref.WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                zzh(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.zzm = j;
    }

    final android.view.View zzb() {
        java.lang.ref.WeakReference weakReference = this.zzi;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    public final long zzc() {
        if (this.zzm <= -2 && zzb() == null) {
            this.zzm = -3L;
        }
        return this.zzm;
    }
}
