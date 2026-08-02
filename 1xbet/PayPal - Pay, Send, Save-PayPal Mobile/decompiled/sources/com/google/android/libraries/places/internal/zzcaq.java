package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcaq implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzcat zza;

    zzcaq(com.google.android.libraries.places.internal.zzcat zzcatVar) {
        java.util.Objects.requireNonNull(zzcatVar);
        this.zza = zzcatVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.google.android.libraries.places.internal.zzcat zzcatVar = this.zza;
            if (zzcatVar.zzi() != null && zzcatVar.zze().zzb() > 0) {
                zzcatVar.zzi().zzc(zzcatVar.zze(), zzcatVar.zze().zzb());
            }
        } catch (java.io.IOException e) {
            this.zza.zzf().zzg(e);
        }
        try {
            com.google.android.libraries.places.internal.zzcat zzcatVar2 = this.zza;
            if (zzcatVar2.zzi() != null) {
                zzcatVar2.zzi().close();
            }
        } catch (java.io.IOException e2) {
            this.zza.zzf().zzg(e2);
        }
        try {
            com.google.android.libraries.places.internal.zzcat zzcatVar3 = this.zza;
            if (zzcatVar3.zzj() != null) {
                zzcatVar3.zzj().close();
            }
        } catch (java.io.IOException e3) {
            this.zza.zzf().zzg(e3);
        }
    }
}
