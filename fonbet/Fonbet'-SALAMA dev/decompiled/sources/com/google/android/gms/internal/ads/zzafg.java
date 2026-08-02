package com.google.android.gms.internal.ads;

import e1.k;

/* loaded from: classes.dex */
final class zzafg extends zzaff {
    private final zzed zzb;
    private final zzed zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzafg(zzaeb zzaebVar) {
        super(zzaebVar);
        this.zzb = new zzed(zzfj.zza);
        this.zzc = new zzed(4);
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final boolean zza(zzed zzedVar) {
        int zzm = zzedVar.zzm();
        int i7 = zzm >> 4;
        int i8 = zzm & 15;
        if (i8 != 7) {
            throw new zzafe(k.d(i8, "Video format not supported: "));
        }
        this.zzg = i7;
        return i7 != 5;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final boolean zzb(zzed zzedVar, long j) {
        int i7;
        int zzm = zzedVar.zzm();
        long zzh = zzedVar.zzh();
        if (zzm == 0) {
            if (!this.zze) {
                zzed zzedVar2 = new zzed(new byte[zzedVar.zzb()]);
                zzedVar.zzH(zzedVar2.zzN(), 0, zzedVar.zzb());
                zzabz zza = zzabz.zza(zzedVar2);
                this.zzd = zza.zzb;
                zzx zzxVar = new zzx();
                zzxVar.zzE("video/x-flv");
                zzxVar.zzad("video/avc");
                zzxVar.zzC(zza.zzl);
                zzxVar.zzai(zza.zzc);
                zzxVar.zzM(zza.zzd);
                zzxVar.zzZ(zza.zzk);
                zzxVar.zzP(zza.zza);
                this.zza.zzm(zzxVar.zzaj());
                this.zze = true;
                return false;
            }
        } else if (zzm == 1 && this.zze) {
            int i8 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i7 = i8;
            } else if (i8 != 0) {
                i7 = 1;
            }
            byte[] zzN = this.zzc.zzN();
            zzN[0] = 0;
            zzN[1] = 0;
            zzN[2] = 0;
            int i9 = 4 - this.zzd;
            int i10 = 0;
            while (zzedVar.zzb() > 0) {
                zzedVar.zzH(this.zzc.zzN(), i9, this.zzd);
                this.zzc.zzL(0);
                zzed zzedVar3 = this.zzc;
                zzed zzedVar4 = this.zzb;
                int zzp = zzedVar3.zzp();
                zzedVar4.zzL(0);
                this.zza.zzr(this.zzb, 4);
                this.zza.zzr(zzedVar, zzp);
                i10 = i10 + 4 + zzp;
            }
            this.zza.zzt((zzh * 1000) + j, i7, i10, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
