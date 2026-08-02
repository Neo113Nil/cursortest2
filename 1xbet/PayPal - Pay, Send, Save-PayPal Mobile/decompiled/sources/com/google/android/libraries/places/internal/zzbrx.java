package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbrx implements java.lang.Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbsb zzb;

    zzbrx(com.google.android.libraries.places.internal.zzbsb zzbsbVar, boolean z) {
        this.zza = z;
        java.util.Objects.requireNonNull(zzbsbVar);
        this.zzb = zzbsbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza) {
            com.google.android.libraries.places.internal.zzbse zzbseVar = this.zzb.zza;
            zzbseVar.zzg = true;
            if (zzbseVar.zzi() > 0) {
                zzbseVar.zzk().reset().start();
            }
        }
        this.zzb.zza.zzl(false);
    }
}
