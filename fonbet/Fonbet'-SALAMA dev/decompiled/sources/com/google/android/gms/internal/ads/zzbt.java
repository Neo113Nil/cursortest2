package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class zzbt {
    public final boolean zzA;
    public final boolean zzB;
    public final boolean zzC;
    public final zzfwk zzD;
    public final zzfwm zzE;
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final zzfwh zzm;
    public final zzfwh zzn;
    public final int zzo;
    public final zzfwh zzp;
    public final int zzq;
    public final int zzr;
    public final int zzs;
    public final zzfwh zzt;
    public final zzbr zzu;
    public final zzfwh zzv;
    public final int zzw;
    public final boolean zzx;
    public final int zzy;
    public final boolean zzz;

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
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        boolean z7;
        zzfwh zzfwhVar;
        zzfwh zzfwhVar2;
        zzfwh zzfwhVar3;
        int i13;
        int i14;
        zzfwh zzfwhVar4;
        zzbr zzbrVar;
        zzfwh zzfwhVar5;
        boolean z8;
        HashMap hashMap;
        HashSet hashSet;
        i7 = zzbsVar.zza;
        this.zza = i7;
        i8 = zzbsVar.zzb;
        this.zzb = i8;
        i9 = zzbsVar.zzc;
        this.zzc = i9;
        i10 = zzbsVar.zzd;
        this.zzd = i10;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        i11 = zzbsVar.zze;
        this.zzi = i11;
        i12 = zzbsVar.zzf;
        this.zzj = i12;
        z4 = zzbsVar.zzg;
        this.zzk = z4;
        z7 = zzbsVar.zzh;
        this.zzl = z7;
        zzfwhVar = zzbsVar.zzi;
        this.zzm = zzfwhVar;
        zzfwhVar2 = zzbsVar.zzj;
        this.zzn = zzfwhVar2;
        this.zzo = 0;
        zzfwhVar3 = zzbsVar.zzk;
        this.zzp = zzfwhVar3;
        this.zzq = 0;
        i13 = zzbsVar.zzl;
        this.zzr = i13;
        i14 = zzbsVar.zzm;
        this.zzs = i14;
        zzfwhVar4 = zzbsVar.zzn;
        this.zzt = zzfwhVar4;
        zzbrVar = zzbsVar.zzo;
        this.zzu = zzbrVar;
        zzfwhVar5 = zzbsVar.zzp;
        this.zzv = zzfwhVar5;
        this.zzw = 0;
        z8 = zzbsVar.zzq;
        this.zzx = z8;
        this.zzy = 0;
        this.zzz = false;
        this.zzA = false;
        this.zzB = false;
        this.zzC = false;
        hashMap = zzbsVar.zzr;
        this.zzD = zzfwk.zzc(hashMap);
        hashSet = zzbsVar.zzs;
        this.zzE = zzfwm.zzl(hashSet);
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
        int hashCode = zzfwhVar.hashCode() + (((((((((i7 * 28629151) + (this.zzl ? 1 : 0)) * 31) + this.zzi) * 31) + this.zzj) * 31) + (this.zzk ? 1 : 0)) * 31);
        int hashCode2 = this.zzn.hashCode() + (hashCode * 31);
        int hashCode3 = this.zzp.hashCode() + (hashCode2 * 961);
        zzfwh zzfwhVar2 = this.zzt;
        int hashCode4 = (zzfwhVar2.hashCode() + (((((hashCode3 * 961) + this.zzr) * 31) + this.zzs) * 31)) * 31;
        int hashCode5 = ((this.zzv.hashCode() + ((hashCode4 + 29791) * 31)) * 961) + (this.zzx ? 1 : 0);
        int hashCode6 = this.zzD.hashCode() + (hashCode5 * 887503681);
        return this.zzE.hashCode() + (hashCode6 * 31);
    }
}
