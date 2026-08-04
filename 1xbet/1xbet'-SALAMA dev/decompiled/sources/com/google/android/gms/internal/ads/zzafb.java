package com.google.android.gms.internal.ads;

import java.util.Collections;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzafb extends zzaff {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzafb(zzaeb zzaebVar) {
        super(zzaebVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final boolean zza(zzed zzedVar) throws zzafe {
        if (this.zzc) {
            zzedVar.zzM(1);
        } else {
            int iZzm = zzedVar.zzm();
            int i7 = iZzm >> 4;
            this.zze = i7;
            if (i7 == 2) {
                int i8 = zzb[(iZzm >> 2) & 3];
                zzx zzxVar = new zzx();
                zzxVar.zzE("video/x-flv");
                zzxVar.zzad("audio/mpeg");
                zzxVar.zzB(1);
                zzxVar.zzae(i8);
                this.zza.zzm(zzxVar.zzaj());
                this.zzd = true;
            } else if (i7 == 7 || i7 == 8) {
                zzx zzxVar2 = new zzx();
                zzxVar2.zzE("video/x-flv");
                zzxVar2.zzad(i7 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzxVar2.zzB(1);
                zzxVar2.zzae(8000);
                this.zza.zzm(zzxVar2.zzaj());
                this.zzd = true;
            } else if (i7 != 10) {
                throw new zzafe(k.d(i7, "Audio format not supported: "));
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final boolean zzb(zzed zzedVar, long j) {
        if (this.zze == 2) {
            int iZzb = zzedVar.zzb();
            this.zza.zzr(zzedVar, iZzb);
            this.zza.zzt(j, 1, iZzb, 0, null);
            return true;
        }
        int iZzm = zzedVar.zzm();
        if (iZzm != 0 || this.zzd) {
            if (this.zze == 10 && iZzm != 1) {
                return false;
            }
            int iZzb2 = zzedVar.zzb();
            this.zza.zzr(zzedVar, iZzb2);
            this.zza.zzt(j, 1, iZzb2, 0, null);
            return true;
        }
        int iZzb3 = zzedVar.zzb();
        byte[] bArr = new byte[iZzb3];
        zzedVar.zzH(bArr, 0, iZzb3);
        zzabp zzabpVarZza = zzabr.zza(bArr);
        zzx zzxVar = new zzx();
        zzxVar.zzE("video/x-flv");
        zzxVar.zzad("audio/mp4a-latm");
        zzxVar.zzC(zzabpVarZza.zzc);
        zzxVar.zzB(zzabpVarZza.zzb);
        zzxVar.zzae(zzabpVarZza.zza);
        zzxVar.zzP(Collections.singletonList(bArr));
        this.zza.zzm(zzxVar.zzaj());
        this.zzd = true;
        return false;
    }
}
