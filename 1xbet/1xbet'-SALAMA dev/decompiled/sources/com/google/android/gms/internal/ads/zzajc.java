package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzajc extends zzajg {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzed zzedVar) {
        return zzk(zzedVar, zza);
    }

    private static boolean zzk(zzed zzedVar, byte[] bArr) {
        if (zzedVar.zzb() < 8) {
            return false;
        }
        int iZzd = zzedVar.zzd();
        byte[] bArr2 = new byte[8];
        zzedVar.zzH(bArr2, 0, 8);
        zzedVar.zzL(iZzd);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final long zza(zzed zzedVar) {
        return zzg(zzadq.zzd(zzedVar.zzN()));
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zzb(boolean z4) {
        super.zzb(z4);
        if (z4) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final boolean zzc(zzed zzedVar, long j, zzajd zzajdVar) {
        if (zzk(zzedVar, zza)) {
            byte[] bArrCopyOf = Arrays.copyOf(zzedVar.zzN(), zzedVar.zze());
            int i7 = bArrCopyOf[9] & 255;
            List listZze = zzadq.zze(bArrCopyOf);
            if (zzajdVar.zza == null) {
                zzx zzxVar = new zzx();
                zzxVar.zzE("audio/ogg");
                zzxVar.zzad("audio/opus");
                zzxVar.zzB(i7);
                zzxVar.zzae(48000);
                zzxVar.zzP(listZze);
                zzajdVar.zza = zzxVar.zzaj();
                return true;
            }
        } else {
            if (!zzk(zzedVar, zzb)) {
                zzcv.zzb(zzajdVar.zza);
                return false;
            }
            zzcv.zzb(zzajdVar.zza);
            if (!this.zzc) {
                this.zzc = true;
                zzedVar.zzM(8);
                zzav zzavVarZzb = zzaeh.zzb(zzfwh.zzm(zzaeh.zzc(zzedVar, false, false).zza));
                if (zzavVarZzb != null) {
                    zzx zzxVarZzb = zzajdVar.zza.zzb();
                    zzxVarZzb.zzW(zzavVarZzb.zzd(zzajdVar.zza.zzl));
                    zzajdVar.zza = zzxVarZzb.zzaj();
                }
            }
        }
        return true;
    }
}
