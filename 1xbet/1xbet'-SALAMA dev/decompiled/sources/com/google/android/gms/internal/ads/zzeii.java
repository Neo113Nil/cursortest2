package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzeii implements zzejs {
    final /* synthetic */ zzeij zza;

    public zzeii(zzeij zzeijVar) {
        this.zza = zzeijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcnp zzcnpVar = (zzcnp) obj;
        synchronized (this.zza) {
            try {
                zzeij zzeijVar = this.zza;
                if (zzeijVar.zzi != null) {
                    zzeijVar.zzi.zzb();
                }
                this.zza.zzi = zzcnpVar;
                this.zza.zzi.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
