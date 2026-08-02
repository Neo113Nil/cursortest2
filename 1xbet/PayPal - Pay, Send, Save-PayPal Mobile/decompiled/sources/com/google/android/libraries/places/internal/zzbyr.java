package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbyr implements java.lang.Runnable {
    final com.google.android.libraries.places.internal.zzbyp zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzf zzb;

    zzbyr(com.google.android.libraries.places.internal.zzbzf zzbzfVar, com.google.android.libraries.places.internal.zzbyp zzbypVar) {
        java.util.Objects.requireNonNull(zzbzfVar);
        this.zzb = zzbzfVar;
        this.zza = zzbypVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbzf zzbzfVar = this.zzb;
        com.google.android.libraries.places.internal.zzbzd zzq = zzbzfVar.zzq(zzbzfVar.zzQ().zze, false, true);
        if (zzq == null) {
            return;
        }
        zzbzfVar.zzE().execute(new com.google.android.libraries.places.internal.zzbyq(this, zzq));
    }
}
