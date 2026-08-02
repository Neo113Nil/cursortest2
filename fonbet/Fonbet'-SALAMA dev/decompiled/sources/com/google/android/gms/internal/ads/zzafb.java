package com.google.android.gms.internal.ads;

import e1.k;
import java.util.Collections;

/* loaded from: classes.dex */
final class zzafb extends zzaff {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzafb(zzaeb zzaebVar) {
        super(zzaebVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final boolean zza(zzed zzedVar) {
        if (this.zzc) {
            zzedVar.zzM(1);
        } else {
            int zzm = zzedVar.zzm();
            int i7 = zzm >> 4;
            this.zze = i7;
            if (i7 == 2) {
                int i8 = zzb[(zzm >> 2) & 3];
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
            int zzb2 = zzedVar.zzb();
            this.zza.zzr(zzedVar, zzb2);
            this.zza.zzt(j, 1, zzb2, 0, null);
            return true;
        }
        int zzm = zzedVar.zzm();
        if (zzm != 0 || this.zzd) {
            if (this.zze == 10 && zzm != 1) {
                return false;
            }
            int zzb3 = zzedVar.zzb();
            this.zza.zzr(zzedVar, zzb3);
            this.zza.zzt(j, 1, zzb3, 0, null);
            return true;
        }
        int zzb4 = zzedVar.zzb();
        byte[] bArr = new byte[zzb4];
        zzedVar.zzH(bArr, 0, zzb4);
        zzabp zza = zzabr.zza(bArr);
        zzx zzxVar = new zzx();
        zzxVar.zzE("video/x-flv");
        zzxVar.zzad("audio/mp4a-latm");
        zzxVar.zzC(zza.zzc);
        zzxVar.zzB(zza.zzb);
        zzxVar.zzae(zza.zza);
        zzxVar.zzP(Collections.singletonList(bArr));
        this.zza.zzm(zzxVar.zzaj());
        this.zzd = true;
        return false;
    }
}
