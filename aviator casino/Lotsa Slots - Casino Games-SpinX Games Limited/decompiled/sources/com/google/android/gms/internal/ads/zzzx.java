package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzzx extends com.google.android.gms.internal.ads.zzaaq implements java.lang.Comparable {
    private final int zze;
    private final boolean zzf;
    private final java.lang.String zzg;
    private final com.google.android.gms.internal.ads.zzaam zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    /* JADX WARN: Removed duplicated region for block: B:104:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0113 A[LOOP:1: B:31:0x0110->B:33:0x0113, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0158 A[EDGE_INSN: B:83:0x0158->B:51:0x0158 BREAK  A[LOOP:3: B:43:0x0139->B:81:0x0155], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzzx(int i, com.google.android.gms.internal.ads.zzbg zzbgVar, int i2, com.google.android.gms.internal.ads.zzaam zzaamVar, int i3, boolean z, com.google.android.gms.internal.ads.zzgtk zzgtkVar, int i4) {
        super(i, zzbgVar, i2);
        int i5;
        int i6;
        char c;
        boolean z2;
        int i7;
        java.lang.String[] split;
        int i8;
        int i9;
        int i10;
        int i11;
        com.google.android.gms.internal.ads.zzaam zzaamVar2;
        boolean z3;
        this.zzh = zzaamVar;
        int i12 = 1;
        int i13 = true != zzaamVar.zzT ? 16 : 24;
        boolean z4 = zzaamVar.zzP;
        this.zzg = com.google.android.gms.internal.ads.zzaay.zzi(this.zzd.zzd);
        this.zzi = com.google.android.gms.internal.ads.zznc.CC.zzac(i3, false);
        int i14 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i14 >= zzaamVar.zzq.size()) {
                i14 = Integer.MAX_VALUE;
                i6 = 0;
                break;
            } else {
                i6 = com.google.android.gms.internal.ads.zzaay.zzj(this.zzd, (java.lang.String) zzaamVar.zzq.get(i14), false);
                if (i6 > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.zzk = i14;
        this.zzj = i6;
        int i15 = this.zzd.zzf;
        int i16 = zzaamVar.zzs;
        this.zzl = com.google.android.gms.internal.ads.zzaay.zzm(i15, 0);
        this.zzm = com.google.android.gms.internal.ads.zzaay.zzn(this.zzd, zzaamVar.zzr);
        com.google.android.gms.internal.ads.zzv zzvVar = this.zzd;
        int i17 = zzvVar.zzf;
        this.zzn = i17 == 0 || (i17 & 1) != 0;
        this.zzq = 1 == (zzvVar.zze & 1);
        java.lang.String str = zzvVar.zzp;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode == -2123537834) {
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            } else if (hashCode != 187078297) {
                if (hashCode == 1504698186 && str.equals("audio/iamf")) {
                    c = 2;
                    z2 = c != 0 || c == 1 || c == 2;
                }
                c = 65535;
                if (c != 0) {
                }
            } else {
                if (str.equals("audio/ac4")) {
                    c = 1;
                    if (c != 0) {
                    }
                }
                c = 65535;
                if (c != 0) {
                }
            }
            this.zzx = z2;
            this.zzr = zzvVar.zzH;
            this.zzs = zzvVar.zzI;
            this.zzt = zzvVar.zzj;
            int i18 = zzvVar.zzj;
            this.zzf = (i18 != -1 || i18 <= zzaamVar.zzu) && ((i7 = zzvVar.zzH) == -1 || i7 <= zzaamVar.zzt) && zzgtkVar.zza(zzvVar);
            java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
            android.content.res.Configuration configuration = android.content.res.Resources.getSystem().getConfiguration();
            split = android.os.Build.VERSION.SDK_INT < 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new java.lang.String[]{configuration.locale.toLanguageTag()};
            for (i8 = 0; i8 < split.length; i8++) {
                split[i8] = com.google.android.gms.internal.ads.zzfl.zzi(split[i8]);
            }
            i9 = 0;
            while (true) {
                if (i9 < split.length) {
                    i9 = Integer.MAX_VALUE;
                    i10 = 0;
                    break;
                } else {
                    i10 = com.google.android.gms.internal.ads.zzaay.zzj(this.zzd, split[i9], false);
                    if (i10 > 0) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.zzo = i9;
            this.zzp = i10;
            i11 = 0;
            while (true) {
                if (i11 >= zzaamVar.zzv.size()) {
                    break;
                }
                java.lang.String str3 = this.zzd.zzp;
                if (str3 != null && str3.equals(zzaamVar.zzv.get(i11))) {
                    i5 = i11;
                    break;
                }
                i11++;
            }
            this.zzu = i5;
            this.zzv = (i3 & 384) != 128;
            this.zzw = (i3 & 64) != 64;
            zzaamVar2 = this.zzh;
            if (com.google.android.gms.internal.ads.zznc.CC.zzac(i3, zzaamVar2.zzV) && ((z3 = this.zzf) || zzaamVar2.zzO)) {
                int i19 = zzaamVar2.zzw.zzb;
                if (com.google.android.gms.internal.ads.zznc.CC.zzac(i3, false) && z3 && this.zzd.zzj != -1) {
                    boolean z5 = zzaamVar2.zzG;
                    boolean z6 = zzaamVar2.zzF;
                    if ((!zzaamVar2.zzX || !z) && (i13 & i3) != 0) {
                        i12 = 2;
                    }
                }
            } else {
                i12 = 0;
            }
            this.zze = i12;
        }
        this.zzx = z2;
        this.zzr = zzvVar.zzH;
        this.zzs = zzvVar.zzI;
        this.zzt = zzvVar.zzj;
        int i182 = zzvVar.zzj;
        this.zzf = (i182 != -1 || i182 <= zzaamVar.zzu) && ((i7 = zzvVar.zzH) == -1 || i7 <= zzaamVar.zzt) && zzgtkVar.zza(zzvVar);
        java.lang.String str22 = com.google.android.gms.internal.ads.zzfl.zza;
        android.content.res.Configuration configuration2 = android.content.res.Resources.getSystem().getConfiguration();
        if (android.os.Build.VERSION.SDK_INT < 24) {
        }
        while (i8 < split.length) {
        }
        i9 = 0;
        while (true) {
            if (i9 < split.length) {
            }
            i9++;
        }
        this.zzo = i9;
        this.zzp = i10;
        i11 = 0;
        while (true) {
            if (i11 >= zzaamVar.zzv.size()) {
            }
            i11++;
        }
        this.zzu = i5;
        this.zzv = (i3 & 384) != 128;
        this.zzw = (i3 & 64) != 64;
        zzaamVar2 = this.zzh;
        if (com.google.android.gms.internal.ads.zznc.CC.zzac(i3, zzaamVar2.zzV)) {
            int i192 = zzaamVar2.zzw.zzb;
            if (com.google.android.gms.internal.ads.zznc.CC.zzac(i3, false)) {
                boolean z52 = zzaamVar2.zzG;
                boolean z62 = zzaamVar2.zzF;
                if (!zzaamVar2.zzX) {
                }
                i12 = 2;
            }
            this.zze = i12;
        }
        i12 = 0;
        this.zze = i12;
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.google.android.gms.internal.ads.zzzx zzzxVar) {
        com.google.android.gms.internal.ads.zzgyg zzgygVar;
        com.google.android.gms.internal.ads.zzgyg zza;
        boolean z = this.zzf;
        if (z && this.zzi) {
            zza = com.google.android.gms.internal.ads.zzaay.zzc;
        } else {
            zzgygVar = com.google.android.gms.internal.ads.zzaay.zzc;
            zza = zzgygVar.zza();
        }
        com.google.android.gms.internal.ads.zzgvz zza2 = com.google.android.gms.internal.ads.zzgvz.zzg().zzd(this.zzi, zzzxVar.zzi).zza(java.lang.Integer.valueOf(this.zzk), java.lang.Integer.valueOf(zzzxVar.zzk), com.google.android.gms.internal.ads.zzgyg.zzb().zza()).zzb(this.zzj, zzzxVar.zzj).zzb(this.zzl, zzzxVar.zzl).zza(java.lang.Integer.valueOf(this.zzm), java.lang.Integer.valueOf(zzzxVar.zzm), com.google.android.gms.internal.ads.zzgyg.zzb().zza()).zzd(this.zzq, zzzxVar.zzq).zzd(this.zzn, zzzxVar.zzn).zza(java.lang.Integer.valueOf(this.zzo), java.lang.Integer.valueOf(zzzxVar.zzo), com.google.android.gms.internal.ads.zzgyg.zzb().zza()).zzb(this.zzp, zzzxVar.zzp).zzd(z, zzzxVar.zzf).zza(java.lang.Integer.valueOf(this.zzu), java.lang.Integer.valueOf(zzzxVar.zzu), com.google.android.gms.internal.ads.zzgyg.zzb().zza());
        boolean z2 = this.zzh.zzF;
        com.google.android.gms.internal.ads.zzgvz zza3 = zza2.zzd(this.zzv, zzzxVar.zzv).zzd(this.zzw, zzzxVar.zzw).zzd(this.zzx, zzzxVar.zzx).zza(java.lang.Integer.valueOf(this.zzr), java.lang.Integer.valueOf(zzzxVar.zzr), zza).zza(java.lang.Integer.valueOf(this.zzs), java.lang.Integer.valueOf(zzzxVar.zzs), zza);
        if (java.util.Objects.equals(this.zzg, zzzxVar.zzg)) {
            zza3 = zza3.zza(java.lang.Integer.valueOf(this.zzt), java.lang.Integer.valueOf(zzzxVar.zzt), zza);
        }
        return zza3.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final /* bridge */ /* synthetic */ boolean zzc(com.google.android.gms.internal.ads.zzaaq zzaaqVar) {
        java.lang.String str;
        com.google.android.gms.internal.ads.zzaam zzaamVar = this.zzh;
        com.google.android.gms.internal.ads.zzzx zzzxVar = (com.google.android.gms.internal.ads.zzzx) zzaaqVar;
        boolean z = zzaamVar.zzR;
        com.google.android.gms.internal.ads.zzv zzvVar = this.zzd;
        int i = zzvVar.zzH;
        if (i == -1) {
            return false;
        }
        com.google.android.gms.internal.ads.zzv zzvVar2 = zzzxVar.zzd;
        if (i != zzvVar2.zzH || (str = zzvVar.zzp) == null || !android.text.TextUtils.equals(str, zzvVar2.zzp)) {
            return false;
        }
        boolean z2 = zzaamVar.zzQ;
        int i2 = zzvVar.zzI;
        if (i2 == -1 || i2 != zzvVar2.zzI) {
            return false;
        }
        boolean z3 = zzaamVar.zzS;
        return this.zzv == zzzxVar.zzv && this.zzw == zzzxVar.zzw;
    }
}
