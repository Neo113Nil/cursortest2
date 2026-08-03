package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
final class zzb implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.LifecycleCallback zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.common.api.internal.zzc zzc;

    zzb(com.google.android.gms.common.api.internal.zzc zzcVar, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback, java.lang.String str) {
        this.zza = lifecycleCallback;
        this.zzb = str;
        java.util.Objects.requireNonNull(zzcVar);
        this.zzc = zzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle;
        com.google.android.gms.common.api.internal.zzc zzcVar = this.zzc;
        if (zzcVar.zzm() > 0) {
            com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback = this.zza;
            if (zzcVar.zzn() != null) {
                bundle = zzcVar.zzn().getBundle(this.zzb);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (zzcVar.zzm() >= 2) {
            this.zza.onStart();
        }
        if (zzcVar.zzm() >= 3) {
            this.zza.onResume();
        }
        if (zzcVar.zzm() >= 4) {
            this.zza.onStop();
        }
        if (zzcVar.zzm() >= 5) {
            this.zza.onDestroy();
        }
    }
}
