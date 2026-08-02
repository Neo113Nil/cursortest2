package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zztt implements zzwk {
    public final zzwk zza;
    final /* synthetic */ zztu zzb;
    private boolean zzc;

    public zztt(zztu zztuVar, zzwk zzwkVar) {
        this.zzb = zztuVar;
        this.zza = zzwkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final int zza(zzkh zzkhVar, zzhg zzhgVar, int i7) {
        zztu zztuVar = this.zzb;
        if (zztuVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzhgVar.zzc(4);
            return -4;
        }
        long zzb = zztuVar.zzb();
        int zza = this.zza.zza(zzkhVar, zzhgVar, i7);
        if (zza != -5) {
            long j = this.zzb.zzb;
            if (j == Long.MIN_VALUE || ((zza != -4 || zzhgVar.zze < j) && !(zza == -3 && zzb == Long.MIN_VALUE && !zzhgVar.zzd))) {
                return zza;
            }
            zzhgVar.zzb();
            zzhgVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        zzz zzzVar = zzkhVar.zza;
        zzzVar.getClass();
        int i8 = zzzVar.zzH;
        if (i8 == 0) {
            if (zzzVar.zzI != 0) {
                i8 = 0;
            }
            return -5;
        }
        int i9 = this.zzb.zzb == Long.MIN_VALUE ? zzzVar.zzI : 0;
        zzx zzb2 = zzzVar.zzb();
        zzb2.zzI(i8);
        zzb2.zzJ(i9);
        zzkhVar.zza = zzb2.zzaj();
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final void zzd() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
