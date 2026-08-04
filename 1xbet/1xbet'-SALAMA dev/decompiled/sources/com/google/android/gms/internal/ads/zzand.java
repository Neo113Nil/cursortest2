package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
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
        int iZza;
        int iZza2;
        long jZzf = zzacwVar.zzf();
        int iMin = (int) Math.min(112800L, zzacwVar.zzd() - jZzf);
        this.zzb.zzI(iMin);
        zzacwVar.zzh(this.zzb.zzN(), 0, iMin);
        zzed zzedVar = this.zzb;
        int iZze = zzedVar.zze();
        long j3 = -1;
        long j7 = -9223372036854775807L;
        long j8 = -1;
        while (zzedVar.zzb() >= 188 && (iZza2 = (iZza = zzano.zza(zzedVar.zzN(), zzedVar.zzd(), iZze)) + 188) <= iZze) {
            long jZzb = zzano.zzb(zzedVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZzb2 = this.zza.zzb(jZzb);
                if (jZzb2 <= j) {
                    j8 = iZza;
                    if (100000 + jZzb2 <= j) {
                        j7 = jZzb2;
                    }
                } else if (j7 == -9223372036854775807L) {
                    return zzace.zzd(jZzb2, jZzf);
                }
                return zzace.zze(jZzf + j8);
            }
            zzedVar.zzL(iZza2);
            j3 = iZza2;
        }
        return j7 != -9223372036854775807L ? zzace.zzf(j7, jZzf + j3) : zzace.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final void zzb() {
        byte[] bArr = zzen.zzc;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
