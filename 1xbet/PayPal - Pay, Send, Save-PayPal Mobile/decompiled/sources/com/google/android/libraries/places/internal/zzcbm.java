package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcbm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzcbp zza;

    zzcbm(com.google.android.libraries.places.internal.zzcbp zzcbpVar) {
        java.util.Objects.requireNonNull(zzcbpVar);
        this.zza = zzcbpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzcbp zzcbpVar = this.zza;
        zzcbpVar.zzI().execute(zzcbpVar.zzL());
        synchronized (zzcbpVar.zzG()) {
            zzcbpVar.zzW(Integer.MAX_VALUE);
            zzcbpVar.zzr();
        }
    }
}
