package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzci {
    private final android.view.View zza;
    private android.app.Activity zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener zzf;

    public zzci(android.app.Activity activity, android.view.View view, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.zzb = activity;
        this.zza = view;
        this.zzf = onGlobalLayoutListener;
    }

    private final void zzf() {
        if (this.zzc) {
            return;
        }
        android.app.Activity activity = this.zzb;
        if (activity != null) {
            android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzf;
            android.view.ViewTreeObserver zzh = zzh(activity);
            if (zzh != null) {
                zzh.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        android.view.View view = this.zza;
        android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.zzf;
        com.google.android.gms.ads.internal.zzt.zzC();
        com.google.android.gms.internal.ads.zzcge.zza(view, onGlobalLayoutListener2);
        this.zzc = true;
    }

    private final void zzg() {
        android.app.Activity activity = this.zzb;
        if (activity != null && this.zzc) {
            android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzf;
            android.view.ViewTreeObserver zzh = zzh(activity);
            if (zzh != null) {
                zzh.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.zzc = false;
        }
    }

    private static android.view.ViewTreeObserver zzh(android.app.Activity activity) {
        android.view.View decorView;
        android.view.Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    public final void zza(android.app.Activity activity) {
        this.zzb = activity;
    }

    public final void zzb() {
        this.zze = true;
        if (this.zzd) {
            zzf();
        }
    }

    public final void zzc() {
        this.zze = false;
        zzg();
    }

    public final void zzd() {
        this.zzd = true;
        if (this.zze) {
            zzf();
        }
    }

    public final void zze() {
        this.zzd = false;
        zzg();
    }
}
