package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaib {
    public final zzaeb zza;
    public zzair zzd;
    public zzahx zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final String zzj;
    private boolean zzm;
    public final zzaiq zzb = new zzaiq();
    public final zzed zzc = new zzed();
    private final zzed zzk = new zzed(1);
    private final zzed zzl = new zzed();

    public zzaib(zzaeb zzaebVar, zzair zzairVar, zzahx zzahxVar, String str) {
        this.zza = zzaebVar;
        this.zzd = zzairVar;
        this.zze = zzahxVar;
        this.zzj = str;
        zzh(zzairVar, zzahxVar);
    }

    public final int zza() {
        int i7 = !this.zzm ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzf() != null ? i7 | 1073741824 : i7;
    }

    public final int zzb() {
        return !this.zzm ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i7, int i8) {
        zzed zzedVar;
        zzaip zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i9 = zzf.zzd;
        if (i9 != 0) {
            zzedVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzf.zze;
            int i10 = zzen.zza;
            zzed zzedVar2 = this.zzl;
            int length = bArr.length;
            zzedVar2.zzJ(bArr, length);
            zzedVar = this.zzl;
            i9 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        boolean z4 = zzb || i8 != 0;
        zzed zzedVar3 = this.zzk;
        zzedVar3.zzN()[0] = (byte) ((true != z4 ? 0 : 128) | i9);
        zzedVar3.zzL(0);
        this.zza.zzs(this.zzk, 1, 1);
        this.zza.zzs(zzedVar, i9, 1);
        if (!z4) {
            return i9 + 1;
        }
        if (!zzb) {
            this.zzc.zzI(8);
            zzed zzedVar4 = this.zzc;
            byte[] zzN = zzedVar4.zzN();
            zzN[0] = 0;
            zzN[1] = 1;
            zzN[2] = 0;
            zzN[3] = (byte) i8;
            zzN[4] = (byte) ((i7 >> 24) & 255);
            zzN[5] = (byte) ((i7 >> 16) & 255);
            zzN[6] = (byte) ((i7 >> 8) & 255);
            zzN[7] = (byte) (i7 & 255);
            this.zza.zzs(zzedVar4, 8, 1);
            return i9 + 9;
        }
        int i11 = i9 + 1;
        zzed zzedVar5 = this.zzb.zzn;
        int zzq = zzedVar5.zzq();
        zzedVar5.zzM(-2);
        int i12 = (zzq * 6) + 2;
        if (i8 != 0) {
            this.zzc.zzI(i12);
            byte[] zzN2 = this.zzc.zzN();
            zzedVar5.zzH(zzN2, 0, i12);
            int i13 = (((zzN2[2] & 255) << 8) | (zzN2[3] & 255)) + i8;
            zzN2[2] = (byte) ((i13 >> 8) & 255);
            zzN2[3] = (byte) (i13 & 255);
            zzedVar5 = this.zzc;
        }
        this.zza.zzs(zzedVar5, i12, 1);
        return i11 + i12;
    }

    public final long zzd() {
        return !this.zzm ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzm) {
            return this.zzd.zzf[this.zzf];
        }
        zzaiq zzaiqVar = this.zzb;
        return zzaiqVar.zzi[this.zzf];
    }

    public final zzaip zzf() {
        if (!this.zzm) {
            return null;
        }
        zzaiq zzaiqVar = this.zzb;
        zzahx zzahxVar = zzaiqVar.zza;
        int i7 = zzen.zza;
        int i8 = zzahxVar.zza;
        zzaip zzaipVar = zzaiqVar.zzm;
        if (zzaipVar == null) {
            zzaipVar = this.zzd.zza.zzb(i8);
        }
        if (zzaipVar == null || !zzaipVar.zza) {
            return null;
        }
        return zzaipVar;
    }

    public final void zzh(zzair zzairVar, zzahx zzahxVar) {
        this.zzd = zzairVar;
        this.zze = zzahxVar;
        zzx zzb = zzairVar.zza.zzg.zzb();
        zzb.zzE(this.zzj);
        this.zza.zzm(zzb.zzaj());
        zzi();
    }

    public final void zzi() {
        zzaiq zzaiqVar = this.zzb;
        zzaiqVar.zzd = 0;
        zzaiqVar.zzp = 0L;
        zzaiqVar.zzq = false;
        zzaiqVar.zzk = false;
        zzaiqVar.zzo = false;
        zzaiqVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzm = false;
    }

    public final void zzj(zzs zzsVar) {
        zzaio zzaioVar = this.zzd.zza;
        zzahx zzahxVar = this.zzb.zza;
        int i7 = zzen.zza;
        zzaip zzb = zzaioVar.zzb(zzahxVar.zza);
        zzs zzb2 = zzsVar.zzb(zzb != null ? zzb.zzb : null);
        zzz zzzVar = this.zzd.zza.zzg;
        String str = this.zzj;
        zzx zzb3 = zzzVar.zzb();
        zzb3.zzE(str);
        zzb3.zzH(zzb2);
        this.zza.zzm(zzb3.zzaj());
    }

    public final boolean zzl() {
        this.zzf++;
        if (!this.zzm) {
            return false;
        }
        int i7 = this.zzg + 1;
        this.zzg = i7;
        int[] iArr = this.zzb.zzg;
        int i8 = this.zzh;
        if (i7 != iArr[i8]) {
            return true;
        }
        this.zzh = i8 + 1;
        this.zzg = 0;
        return false;
    }
}
