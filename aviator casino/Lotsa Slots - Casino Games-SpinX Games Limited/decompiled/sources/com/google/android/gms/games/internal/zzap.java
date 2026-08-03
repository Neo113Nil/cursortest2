package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class zzap implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, com.google.android.gms.games.internal.zzd {
    private final com.google.android.gms.games.internal.zzaj zza;
    private final com.google.android.gms.internal.games_v2.zzam zzb;
    private java.lang.ref.WeakReference zzc;
    private boolean zzd = false;

    private zzap(com.google.android.gms.games.internal.zzaj zzajVar, int i) {
        this.zza = zzajVar;
        this.zzb = new com.google.android.gms.internal.games_v2.zzam(i, null);
    }

    public static com.google.android.gms.games.internal.zzap zzd(com.google.android.gms.games.internal.zzaj zzajVar, int i) {
        return new com.google.android.gms.games.internal.zzap(zzajVar, i);
    }

    private final void zzh(android.view.View view) {
        android.view.Display display;
        int i = -1;
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR1() && (display = view.getDisplay()) != null) {
            i = display.getDisplayId();
        }
        android.os.IBinder windowToken = view.getWindowToken();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        com.google.android.gms.internal.games_v2.zzam zzamVar = this.zzb;
        zzamVar.zzc = i;
        zzamVar.zza = windowToken;
        int i2 = iArr[0];
        zzamVar.zzd = i2;
        int i3 = iArr[1];
        zzamVar.zze = i3;
        zzamVar.zzf = i2 + width;
        zzamVar.zzg = i3 + height;
        if (this.zzd) {
            zzg();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        android.view.View view;
        java.lang.ref.WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        zzh(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        zzh(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.zza.zzs();
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // com.google.android.gms.games.internal.zzd
    public final void zza(android.app.Activity activity) {
        android.view.View view;
        try {
            view = activity.findViewById(android.R.id.content);
        } catch (java.lang.IllegalStateException unused) {
            view = null;
        }
        if (view == null && (view = activity.getWindow().getDecorView()) == null) {
            com.google.android.gms.internal.games_v2.zzfn.zzg("PopupManager", "Failed to bind to: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(activity))));
        } else {
            com.google.android.gms.internal.games_v2.zzfn.zzf("PopupManager", "Binding to: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(activity))));
            zzf(view);
        }
    }

    public final android.os.Bundle zzb() {
        return this.zzb.zza();
    }

    public final android.os.IBinder zzc() {
        return this.zzb.zza;
    }

    public final com.google.android.gms.internal.games_v2.zzam zze() {
        return this.zzb;
    }

    public final void zzf(android.view.View view) {
        this.zza.zzs();
        java.lang.ref.WeakReference weakReference = this.zzc;
        if (weakReference != null) {
            android.view.View view2 = (android.view.View) weakReference.get();
            android.content.Context context = this.zza.getContext();
            if (view2 == null && (context instanceof android.app.Activity)) {
                view2 = ((android.app.Activity) context).getWindow().getDecorView();
            }
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(this);
                android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                if (com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBean()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
        this.zzc = null;
        android.content.Context context2 = this.zza.getContext();
        if (view == null && (context2 instanceof android.app.Activity)) {
            android.app.Activity activity = (android.app.Activity) context2;
            try {
                view = activity.findViewById(android.R.id.content);
            } catch (java.lang.IllegalStateException unused) {
            }
            if (view == null) {
                view = activity.getWindow().getDecorView();
            }
            com.google.android.gms.internal.games_v2.zzfn.zzg("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
        }
        if (view == null) {
            com.google.android.gms.internal.games_v2.zzfn.zzc("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
            return;
        }
        zzh(view);
        this.zzc = new java.lang.ref.WeakReference(view);
        view.addOnAttachStateChangeListener(this);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void zzg() {
        boolean z;
        com.google.android.gms.internal.games_v2.zzam zzamVar = this.zzb;
        android.os.IBinder iBinder = zzamVar.zza;
        if (iBinder != null) {
            this.zza.zzQ(iBinder, zzamVar.zza());
            z = false;
        } else {
            z = true;
        }
        this.zzd = z;
    }
}
