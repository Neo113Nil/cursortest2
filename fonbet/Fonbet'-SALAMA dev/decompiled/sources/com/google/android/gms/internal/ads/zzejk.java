package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzejk implements zzejs {
    final /* synthetic */ zzejl zza;

    public zzejk(zzejl zzejlVar) {
        this.zza = zzejlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejs
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzddn zzddnVar;
        zzddn zzddnVar2 = (zzddn) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzddnVar2;
            zzddnVar = this.zza.zzj;
            zzddnVar.zzk();
        }
    }
}
