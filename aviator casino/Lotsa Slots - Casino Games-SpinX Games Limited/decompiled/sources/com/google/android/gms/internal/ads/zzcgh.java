package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzcgh {
    private final java.lang.ref.WeakReference zza;

    public zzcgh(android.view.View view) {
        this.zza = new java.lang.ref.WeakReference(view);
    }

    protected abstract void zza(android.view.ViewTreeObserver viewTreeObserver);

    protected abstract void zzb(android.view.ViewTreeObserver viewTreeObserver);

    public final void zzc() {
        android.view.ViewTreeObserver zze = zze();
        if (zze != null) {
            zza(zze);
        }
    }

    public final void zzd() {
        android.view.ViewTreeObserver zze = zze();
        if (zze != null) {
            zzb(zze);
        }
    }

    protected final android.view.ViewTreeObserver zze() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View view = (android.view.View) this.zza.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}
