package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgzy extends zzgzw {
    @Override // com.google.android.gms.internal.ads.zzgzw
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zzgxg zzgxgVar = (zzgxg) obj;
        zzgzx zzgzxVar = zzgxgVar.zzt;
        if (zzgzxVar != zzgzx.zzc()) {
            return zzgzxVar;
        }
        zzgzx zzf = zzgzx.zzf();
        zzgxgVar.zzt = zzf;
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final /* synthetic */ Object zzb() {
        return zzgzx.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final /* synthetic */ Object zzc(Object obj) {
        zzgzx zzgzxVar = (zzgzx) obj;
        zzgzxVar.zzh();
        return zzgzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i7, int i8) {
        ((zzgzx) obj).zzj((i7 << 3) | 5, Integer.valueOf(i8));
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i7, long j) {
        ((zzgzx) obj).zzj((i7 << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i7, Object obj2) {
        ((zzgzx) obj).zzj((i7 << 3) | 3, (zzgzx) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i7, zzgvy zzgvyVar) {
        ((zzgzx) obj).zzj((i7 << 3) | 2, zzgvyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i7, long j) {
        ((zzgzx) obj).zzj(i7 << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final void zzi(Object obj) {
        ((zzgxg) obj).zzt.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgzw
    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zzgxg) obj).zzt = (zzgzx) obj2;
    }
}
