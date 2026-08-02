package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
abstract class zzbqd implements java.lang.Runnable {
    private final com.google.android.libraries.places.internal.zzbjs zza;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbjs zzb = this.zza.zzb();
        try {
            zza();
        } finally {
            this.zza.zzc(zzb);
        }
    }

    public abstract void zza();

    protected zzbqd(com.google.android.libraries.places.internal.zzbjs zzbjsVar) {
        this.zza = zzbjsVar;
    }
}
