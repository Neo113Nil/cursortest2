package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaao extends com.google.android.gms.internal.ads.zzaaq implements java.lang.Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzaao(int i, com.google.android.gms.internal.ads.zzbg zzbgVar, int i2, com.google.android.gms.internal.ads.zzaam zzaamVar, int i3, java.lang.String str, java.lang.String str2) {
        super(i, zzbgVar, i2);
        int i4;
        int i5;
        boolean z;
        int i6 = 0;
        this.zzf = com.google.android.gms.internal.ads.zznc.CC.zzac(i3, false);
        int i7 = this.zzd.zze;
        int i8 = zzaamVar.zzC;
        this.zzg = 1 == (i7 & 1);
        this.zzh = (i7 & 2) != 0;
        com.google.android.gms.internal.ads.zzgwm zzj = str2 != null ? com.google.android.gms.internal.ads.zzgwm.zzj(str2) : zzaamVar.zzy.isEmpty() ? com.google.android.gms.internal.ads.zzgwm.zzj("") : zzaamVar.zzy;
        int i9 = 0;
        while (true) {
            if (i9 >= zzj.size()) {
                i9 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            com.google.android.gms.internal.ads.zzv zzvVar = this.zzd;
            java.lang.String str3 = (java.lang.String) zzj.get(i9);
            boolean z2 = zzaamVar.zzD;
            i4 = com.google.android.gms.internal.ads.zzaay.zzj(zzvVar, str3, false);
            if (i4 > 0) {
                break;
            } else {
                i9++;
            }
        }
        this.zzi = i9;
        this.zzj = i4;
        if (str2 != null) {
            i5 = 1088;
        } else {
            int i10 = zzaamVar.zzA;
            i5 = 0;
        }
        int zzm = com.google.android.gms.internal.ads.zzaay.zzm(this.zzd.zzf, i5);
        this.zzk = zzm;
        com.google.android.gms.internal.ads.zzv zzvVar2 = this.zzd;
        this.zzn = (1088 & zzvVar2.zzf) != 0;
        int zzn = com.google.android.gms.internal.ads.zzaay.zzn(zzvVar2, zzaamVar.zzz);
        this.zzl = zzn;
        int zzj2 = com.google.android.gms.internal.ads.zzaay.zzj(this.zzd, str, com.google.android.gms.internal.ads.zzaay.zzi(str) == null);
        this.zzm = zzj2;
        if (i4 > 0 || ((zzaamVar.zzy.isEmpty() && zzm > 0) || ((zzaamVar.zzy.isEmpty() && zzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && zzj2 > 0)))) {
            z = true;
        } else {
            boolean z3 = zzaamVar.zzx;
            z = false;
        }
        if (com.google.android.gms.internal.ads.zznc.CC.zzac(i3, zzaamVar.zzV) && z) {
            i6 = 1;
        }
        this.zze = i6;
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.google.android.gms.internal.ads.zzaao zzaaoVar) {
        com.google.android.gms.internal.ads.zzgvz zza = com.google.android.gms.internal.ads.zzgvz.zzg().zzd(this.zzf, zzaaoVar.zzf).zza(java.lang.Integer.valueOf(this.zzi), java.lang.Integer.valueOf(zzaaoVar.zzi), com.google.android.gms.internal.ads.zzgyg.zzb().zza());
        int i = this.zzj;
        com.google.android.gms.internal.ads.zzgvz zzb = zza.zzb(i, zzaaoVar.zzj);
        int i2 = this.zzk;
        com.google.android.gms.internal.ads.zzgvz zzb2 = zzb.zzb(i2, zzaaoVar.zzk).zza(java.lang.Integer.valueOf(this.zzl), java.lang.Integer.valueOf(zzaaoVar.zzl), com.google.android.gms.internal.ads.zzgyg.zzb().zza()).zzd(this.zzg, zzaaoVar.zzg).zza(java.lang.Boolean.valueOf(this.zzh), java.lang.Boolean.valueOf(zzaaoVar.zzh), i == 0 ? com.google.android.gms.internal.ads.zzgyg.zzb() : com.google.android.gms.internal.ads.zzgyg.zzb().zza()).zzb(this.zzm, zzaaoVar.zzm);
        if (i2 == 0) {
            zzb2 = zzb2.zzc(this.zzn, zzaaoVar.zzn);
        }
        return zzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final /* bridge */ /* synthetic */ boolean zzc(com.google.android.gms.internal.ads.zzaaq zzaaqVar) {
        return false;
    }
}
