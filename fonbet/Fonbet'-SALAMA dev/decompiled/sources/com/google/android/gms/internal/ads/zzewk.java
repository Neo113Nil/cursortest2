package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzewk implements zzejs {
    final /* synthetic */ zzewl zza;

    public zzewk(zzewl zzewlVar) {
        this.zza = zzewlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzewd zzewdVar;
        zzewd zzewdVar2;
        zzdqq zzdqqVar;
        zzcnj zzcnjVar = (zzcnj) obj;
        synchronized (this.zza) {
            try {
                zzcnj zzcnjVar2 = this.zza.zza;
                if (zzcnjVar2 != null) {
                    zzcnjVar2.zzb();
                }
                zzewl zzewlVar = this.zza;
                zzewlVar.zza = zzcnjVar;
                zzcnjVar.zzc(zzewlVar);
                zzewl zzewlVar2 = this.zza;
                zzewdVar = zzewlVar2.zzg;
                zzewdVar2 = zzewlVar2.zzg;
                zzdqqVar = zzewlVar2.zzi;
                zzewdVar.zzk(new zzcnk(zzcnjVar, zzewlVar2, zzewdVar2, zzdqqVar));
                zzcnjVar.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
