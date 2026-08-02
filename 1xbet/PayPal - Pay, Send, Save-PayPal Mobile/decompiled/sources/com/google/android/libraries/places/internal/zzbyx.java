package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbyx implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbyp zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzd zzb;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzc zzc;

    zzbyx(com.google.android.libraries.places.internal.zzbzc zzbzcVar, com.google.android.libraries.places.internal.zzbyp zzbypVar, com.google.android.libraries.places.internal.zzbzd zzbzdVar) {
        this.zza = zzbypVar;
        this.zzb = zzbzdVar;
        java.util.Objects.requireNonNull(zzbzcVar);
        this.zzc = zzbzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbyp zzbypVar = this.zza;
        synchronized (zzbypVar.zza) {
            if (zzbypVar.zzc) {
                return;
            }
            zzbypVar.zzb();
            com.google.android.libraries.places.internal.zzbzc zzbzcVar = this.zzc;
            zzbzcVar.zzb.zzE().execute(new com.google.android.libraries.places.internal.zzbyw(this, this.zzb));
        }
    }
}
