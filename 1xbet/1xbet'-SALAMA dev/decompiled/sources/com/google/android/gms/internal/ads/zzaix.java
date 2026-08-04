package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzaix extends zzajg {
    private zzadg zza;
    private zzaiw zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final long zza(zzed zzedVar) {
        if (!zzd(zzedVar.zzN())) {
            return -1L;
        }
        int i7 = (zzedVar.zzN()[2] & 255) >> 4;
        if (i7 == 6) {
            zzedVar.zzM(4);
            zzedVar.zzx();
        } else if (i7 == 7) {
            i7 = 7;
            zzedVar.zzM(4);
            zzedVar.zzx();
        }
        int iZza = zzadc.zza(zzedVar, i7);
        zzedVar.zzL(0);
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zzb(boolean z4) {
        super.zzb(z4);
        if (z4) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final boolean zzc(zzed zzedVar, long j, zzajd zzajdVar) {
        byte[] bArrZzN = zzedVar.zzN();
        zzadg zzadgVar = this.zza;
        if (zzadgVar == null) {
            zzadg zzadgVar2 = new zzadg(bArrZzN, 17);
            this.zza = zzadgVar2;
            zzx zzxVarZzb = zzadgVar2.zzc(Arrays.copyOfRange(bArrZzN, 9, zzedVar.zze()), null).zzb();
            zzxVarZzb.zzE("audio/ogg");
            zzajdVar.zza = zzxVarZzb.zzaj();
            return true;
        }
        if ((bArrZzN[0] & 127) == 3) {
            zzadf zzadfVarZzb = zzadd.zzb(zzedVar);
            zzadg zzadgVarZzf = zzadgVar.zzf(zzadfVarZzb);
            this.zza = zzadgVarZzf;
            this.zzb = new zzaiw(zzadgVarZzf, zzadfVarZzb);
            return true;
        }
        if (!zzd(bArrZzN)) {
            return true;
        }
        zzaiw zzaiwVar = this.zzb;
        if (zzaiwVar != null) {
            zzaiwVar.zza(j);
            zzajdVar.zzb = this.zzb;
        }
        zzajdVar.zza.getClass();
        return false;
    }
}
