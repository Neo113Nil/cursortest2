package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
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
        if (i7 != 6) {
            if (i7 == 7) {
                i7 = 7;
            }
            int zza = zzadc.zza(zzedVar, i7);
            zzedVar.zzL(0);
            return zza;
        }
        zzedVar.zzM(4);
        zzedVar.zzx();
        int zza2 = zzadc.zza(zzedVar, i7);
        zzedVar.zzL(0);
        return zza2;
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
        byte[] zzN = zzedVar.zzN();
        zzadg zzadgVar = this.zza;
        if (zzadgVar == null) {
            zzadg zzadgVar2 = new zzadg(zzN, 17);
            this.zza = zzadgVar2;
            zzx zzb = zzadgVar2.zzc(Arrays.copyOfRange(zzN, 9, zzedVar.zze()), null).zzb();
            zzb.zzE("audio/ogg");
            zzajdVar.zza = zzb.zzaj();
            return true;
        }
        if ((zzN[0] & Byte.MAX_VALUE) == 3) {
            zzadf zzb2 = zzadd.zzb(zzedVar);
            zzadg zzf = zzadgVar.zzf(zzb2);
            this.zza = zzf;
            this.zzb = new zzaiw(zzf, zzb2);
            return true;
        }
        if (!zzd(zzN)) {
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
