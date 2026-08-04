package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class zzbt {
    public final zzfwk zzD;
    public final zzfwm zzE;
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zzi;
    public final int zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final zzfwh zzm;
    public final zzfwh zzn;
    public final zzfwh zzp;
    public final int zzr;
    public final int zzs;
    public final zzfwh zzt;
    public final zzbr zzu;
    public final zzfwh zzv;
    public final boolean zzx;
    public final int zze = 0;
    public final int zzf = 0;
    public final int zzg = 0;
    public final int zzh = 0;
    public final int zzo = 0;
    public final int zzq = 0;
    public final int zzw = 0;
    public final int zzy = 0;
    public final boolean zzz = false;
    public final boolean zzA = false;
    public final boolean zzB = false;
    public final boolean zzC = false;

    static {
        new zzbt(new zzbs());
        int i7 = zzen.zza;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
    }

    public zzbt(zzbs zzbsVar) {
        this.zza = zzbsVar.zza;
        this.zzb = zzbsVar.zzb;
        this.zzc = zzbsVar.zzc;
        this.zzd = zzbsVar.zzd;
        this.zzi = zzbsVar.zze;
        this.zzj = zzbsVar.zzf;
        this.zzk = zzbsVar.zzg;
        this.zzl = zzbsVar.zzh;
        this.zzm = zzbsVar.zzi;
        this.zzn = zzbsVar.zzj;
        this.zzp = zzbsVar.zzk;
        this.zzr = zzbsVar.zzl;
        this.zzs = zzbsVar.zzm;
        this.zzt = zzbsVar.zzn;
        this.zzu = zzbsVar.zzo;
        this.zzv = zzbsVar.zzp;
        this.zzx = zzbsVar.zzq;
        this.zzD = zzfwk.zzc(zzbsVar.zzr);
        this.zzE = zzfwm.zzl(zzbsVar.zzs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzbt zzbtVar = (zzbt) obj;
            if (this.zza == zzbtVar.zza && this.zzb == zzbtVar.zzb && this.zzc == zzbtVar.zzc && this.zzd == zzbtVar.zzd && this.zzl == zzbtVar.zzl && this.zzi == zzbtVar.zzi && this.zzj == zzbtVar.zzj && this.zzk == zzbtVar.zzk && this.zzm.equals(zzbtVar.zzm) && this.zzn.equals(zzbtVar.zzn) && this.zzp.equals(zzbtVar.zzp) && this.zzr == zzbtVar.zzr && this.zzs == zzbtVar.zzs && this.zzt.equals(zzbtVar.zzt) && this.zzu.equals(zzbtVar.zzu) && this.zzv.equals(zzbtVar.zzv) && this.zzx == zzbtVar.zzx && this.zzD.equals(zzbtVar.zzD) && this.zzE.equals(zzbtVar.zzE)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i7 = ((((((this.zza + 31) * 31) + this.zzb) * 31) + this.zzc) * 31) + this.zzd;
        zzfwh zzfwhVar = this.zzm;
        int iHashCode = zzfwhVar.hashCode() + (((((((((i7 * 28629151) + (this.zzl ? 1 : 0)) * 31) + this.zzi) * 31) + this.zzj) * 31) + (this.zzk ? 1 : 0)) * 31);
        int iHashCode2 = this.zzn.hashCode() + (iHashCode * 31);
        int iHashCode3 = this.zzp.hashCode() + (iHashCode2 * 961);
        zzfwh zzfwhVar2 = this.zzt;
        int iHashCode4 = (zzfwhVar2.hashCode() + (((((iHashCode3 * 961) + this.zzr) * 31) + this.zzs) * 31)) * 31;
        int iHashCode5 = ((this.zzv.hashCode() + ((iHashCode4 + 29791) * 31)) * 961) + (this.zzx ? 1 : 0);
        int iHashCode6 = this.zzD.hashCode() + (iHashCode5 * 887503681);
        return this.zzE.hashCode() + (iHashCode6 * 31);
    }
}
