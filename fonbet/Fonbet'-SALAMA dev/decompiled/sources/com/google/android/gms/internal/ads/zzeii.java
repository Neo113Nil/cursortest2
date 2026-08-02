package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        zzcnp zzcnpVar;
        zzcnp zzcnpVar2;
        zzcnp zzcnpVar3;
        zzcnp zzcnpVar4 = (zzcnp) obj;
        synchronized (this.zza) {
            try {
                zzeij zzeijVar = this.zza;
                zzcnpVar = zzeijVar.zzi;
                if (zzcnpVar != null) {
                    zzcnpVar3 = zzeijVar.zzi;
                    zzcnpVar3.zzb();
                }
                this.zza.zzi = zzcnpVar4;
                zzcnpVar2 = this.zza.zzi;
                zzcnpVar2.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
