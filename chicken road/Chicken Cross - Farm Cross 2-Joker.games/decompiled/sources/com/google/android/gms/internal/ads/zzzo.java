package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzzo implements zzxm, zzxl {
    private final zzxm zza;
    private final long zzb;
    private zzxl zzc;

    public zzzo(zzxm zzxmVar, long j) {
        this.zza = zzxmVar;
        this.zzb = j;
    }

    public final zzxm zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzme zzmeVar) {
        long j = zzmeVar.zza;
        long j2 = this.zzb;
        zzmd zza = zzmeVar.zza();
        zza.zza(j - j2);
        return this.zza.zzd(zza.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final boolean zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final void zzf(long j) {
        this.zza.zzf(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzl(zzxl zzxlVar, long j) {
        this.zzc = zzxlVar;
        this.zza.zzl(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzm() throws IOException {
        this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final zzzr zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzo(zzabe[] zzabeVarArr, boolean[] zArr, zzzg[] zzzgVarArr, boolean[] zArr2, long j) {
        zzzg[] zzzgVarArr2 = new zzzg[zzzgVarArr.length];
        int i = 0;
        while (true) {
            zzzg zzzgVar = null;
            if (i >= zzzgVarArr.length) {
                break;
            }
            zzzn zzznVar = (zzzn) zzzgVarArr[i];
            if (zzznVar != null) {
                zzzgVar = zzznVar.zze();
            }
            zzzgVarArr2[i] = zzzgVar;
            i++;
        }
        zzxm zzxmVar = this.zza;
        long j2 = this.zzb;
        long zzo = zzxmVar.zzo(zzabeVarArr, zArr, zzzgVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < zzzgVarArr.length; i2++) {
            zzzg zzzgVar2 = zzzgVarArr2[i2];
            if (zzzgVar2 == null) {
                zzzgVarArr[i2] = null;
            } else {
                zzzg zzzgVar3 = zzzgVarArr[i2];
                if (zzzgVar3 == null || ((zzzn) zzzgVar3).zze() != zzzgVar2) {
                    zzzgVarArr[i2] = new zzzn(zzzgVar2, j2);
                }
            }
        }
        return zzo + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzq(long j, boolean z) {
        this.zza.zzq(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzr() {
        long zzr = this.zza.zzr();
        if (zzr == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzr + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzzh
    public final /* bridge */ /* synthetic */ void zzs(zzzi zzziVar) {
        zzxl zzxlVar = this.zzc;
        zzxlVar.getClass();
        zzxlVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzt(long j) {
        long j2 = this.zzb;
        return this.zza.zzt(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzu(long j, zznm zznmVar) {
        long j2 = this.zzb;
        return this.zza.zzu(j - j2, zznmVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void zzp(zzxm zzxmVar) {
        zzxl zzxlVar = this.zzc;
        zzxlVar.getClass();
        zzxlVar.zzp(this);
    }
}
