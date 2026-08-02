package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzand implements zzacf {
    private final zzek zza;
    private final zzed zzb = new zzed();
    private final int zzc;

    public zzand(int i7, zzek zzekVar, int i8) {
        this.zzc = i7;
        this.zza = zzekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final zzace zza(zzacw zzacwVar, long j) {
        int zza;
        int zza2;
        long zzf = zzacwVar.zzf();
        int min = (int) Math.min(112800L, zzacwVar.zzd() - zzf);
        this.zzb.zzI(min);
        zzacwVar.zzh(this.zzb.zzN(), 0, min);
        zzed zzedVar = this.zzb;
        int zze = zzedVar.zze();
        long j3 = -1;
        long j7 = -9223372036854775807L;
        long j8 = -1;
        while (zzedVar.zzb() >= 188 && (zza2 = (zza = zzano.zza(zzedVar.zzN(), zzedVar.zzd(), zze)) + 188) <= zze) {
            long zzb = zzano.zzb(zzedVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 <= j) {
                    j8 = zza;
                    if (100000 + zzb2 <= j) {
                        j7 = zzb2;
                    }
                } else if (j7 == -9223372036854775807L) {
                    return zzace.zzd(zzb2, zzf);
                }
                return zzace.zze(zzf + j8);
            }
            zzedVar.zzL(zza2);
            j3 = zza2;
        }
        return j7 != -9223372036854775807L ? zzace.zzf(j7, zzf + j3) : zzace.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final void zzb() {
        byte[] bArr = zzen.zzc;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
