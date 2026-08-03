package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaax extends com.google.android.gms.internal.ads.zzaaq {
    private final boolean zze;
    private final com.google.android.gms.internal.ads.zzaam zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r1 >= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        if (r1 >= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0062, code lost:
    
        if (r1 >= 0.0f) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        if (r12 >= 0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0108 A[EDGE_INSN: B:134:0x0108->B:71:0x0108 BREAK  A[LOOP:1: B:63:0x00e9->B:132:0x0105], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaax(int i, com.google.android.gms.internal.ads.zzbg zzbgVar, int i2, com.google.android.gms.internal.ads.zzaam zzaamVar, int i3, java.lang.String str, int i4, boolean z) {
        super(i, zzbgVar, i2);
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        com.google.android.gms.internal.ads.zzv zzvVar;
        java.lang.String str2;
        int i9;
        char c;
        boolean z4;
        com.google.android.gms.internal.ads.zzv zzvVar2;
        int i10;
        int i11;
        int i12;
        this.zzf = zzaamVar;
        int i13 = 1;
        int i14 = true != zzaamVar.zzM ? 16 : 24;
        boolean z5 = zzaamVar.zzL;
        if (z && (((i10 = (zzvVar2 = this.zzd).zzw) == -1 || i10 <= zzaamVar.zza) && ((i11 = zzvVar2.zzx) == -1 || i11 <= zzaamVar.zzb))) {
            float f = zzvVar2.zzA;
            if ((f == -1.0f || f <= zzaamVar.zzc) && ((i12 = zzvVar2.zzj) == -1 || i12 <= zzaamVar.zzd)) {
                z2 = true;
                this.zze = z2;
                if (z) {
                    com.google.android.gms.internal.ads.zzv zzvVar3 = this.zzd;
                    int i15 = zzvVar3.zzw;
                    if (i15 != -1) {
                        int i16 = zzaamVar.zze;
                    }
                    int i17 = zzvVar3.zzx;
                    if (i17 != -1) {
                        int i18 = zzaamVar.zzf;
                    }
                    float f2 = zzvVar3.zzA;
                    if (f2 != -1.0f) {
                        int i19 = zzaamVar.zzg;
                    }
                    int i20 = zzvVar3.zzj;
                    if (i20 != -1) {
                        int i21 = zzaamVar.zzh;
                    }
                    z3 = true;
                    this.zzg = z3;
                    this.zzh = com.google.android.gms.internal.ads.zznc.CC.zzac(i3, false);
                    com.google.android.gms.internal.ads.zzv zzvVar4 = this.zzd;
                    float f3 = zzvVar4.zzA;
                    this.zzi = f3 == -1.0f && f3 >= 10.0f;
                    this.zzj = zzvVar4.zzj;
                    this.zzk = zzvVar4.zzc();
                    i5 = 0;
                    while (true) {
                        i6 = Integer.MAX_VALUE;
                        if (i5 >= zzaamVar.zzo.size()) {
                            i5 = Integer.MAX_VALUE;
                            i7 = 0;
                            break;
                        } else {
                            i7 = com.google.android.gms.internal.ads.zzaay.zzj(this.zzd, (java.lang.String) zzaamVar.zzo.get(i5), false);
                            if (i7 > 0) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.zzm = i5;
                    this.zzn = i7;
                    int i22 = this.zzd.zzf;
                    int i23 = zzaamVar.zzp;
                    this.zzo = com.google.android.gms.internal.ads.zzaay.zzm(i22, 0);
                    int i24 = this.zzd.zzf;
                    this.zzq = (i24 == 0 && (i24 & 1) == 0) ? false : true;
                    this.zzr = com.google.android.gms.internal.ads.zzaay.zzj(this.zzd, str, com.google.android.gms.internal.ads.zzaay.zzi(str) == null);
                    i8 = 0;
                    while (true) {
                        if (i8 < zzaamVar.zzm.size()) {
                            java.lang.String str3 = this.zzd.zzp;
                            if (str3 != null && str3.equals(zzaamVar.zzm.get(i8))) {
                                i6 = i8;
                                break;
                            }
                            i8++;
                        } else {
                            break;
                        }
                    }
                    this.zzl = i6;
                    this.zzp = com.google.android.gms.internal.ads.zzaay.zzn(this.zzd, zzaamVar.zzn);
                    this.zzt = (i3 & 384) == 128;
                    this.zzu = (i3 & 64) == 64;
                    zzvVar = this.zzd;
                    str2 = zzvVar.zzp;
                    if (str2 != null) {
                        i9 = 4;
                        switch (str2.hashCode()) {
                            case -1851077871:
                                if (str2.equals("video/dolby-vision")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1662735862:
                                if (str2.equals("video/av01")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1662541442:
                                if (str2.equals("video/hevc")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1331836730:
                                if (str2.equals("video/avc")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1599127257:
                                if (str2.equals("video/x-vnd.on2.vp9")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c == 0) {
                            i9 = 5;
                        } else if (c != 1) {
                            if (c == 2) {
                                i9 = 3;
                            } else if (c == 3) {
                                i9 = 2;
                            } else if (c == 4) {
                                i9 = 1;
                            }
                        }
                        this.zzv = i9;
                        if ((zzvVar.zzf & 16384) == 0) {
                            com.google.android.gms.internal.ads.zzaam zzaamVar2 = this.zzf;
                            if (com.google.android.gms.internal.ads.zznc.CC.zzac(i3, zzaamVar2.zzV) && ((z4 = this.zze) || zzaamVar2.zzK)) {
                                if (com.google.android.gms.internal.ads.zznc.CC.zzac(i3, false) && this.zzg && z4 && zzvVar.zzj != -1) {
                                    boolean z6 = zzaamVar2.zzG;
                                    boolean z7 = zzaamVar2.zzF;
                                    if ((i14 & i3) != 0) {
                                        i13 = 2;
                                    }
                                }
                                this.zzs = i13;
                            }
                        }
                        i13 = 0;
                        this.zzs = i13;
                    }
                    i9 = 0;
                    this.zzv = i9;
                    if ((zzvVar.zzf & 16384) == 0) {
                    }
                    i13 = 0;
                    this.zzs = i13;
                }
                z3 = false;
                this.zzg = z3;
                this.zzh = com.google.android.gms.internal.ads.zznc.CC.zzac(i3, false);
                com.google.android.gms.internal.ads.zzv zzvVar42 = this.zzd;
                float f32 = zzvVar42.zzA;
                this.zzi = f32 == -1.0f && f32 >= 10.0f;
                this.zzj = zzvVar42.zzj;
                this.zzk = zzvVar42.zzc();
                i5 = 0;
                while (true) {
                    i6 = Integer.MAX_VALUE;
                    if (i5 >= zzaamVar.zzo.size()) {
                    }
                    i5++;
                }
                this.zzm = i5;
                this.zzn = i7;
                int i222 = this.zzd.zzf;
                int i232 = zzaamVar.zzp;
                this.zzo = com.google.android.gms.internal.ads.zzaay.zzm(i222, 0);
                int i242 = this.zzd.zzf;
                this.zzq = (i242 == 0 && (i242 & 1) == 0) ? false : true;
                this.zzr = com.google.android.gms.internal.ads.zzaay.zzj(this.zzd, str, com.google.android.gms.internal.ads.zzaay.zzi(str) == null);
                i8 = 0;
                while (true) {
                    if (i8 < zzaamVar.zzm.size()) {
                    }
                    i8++;
                }
                this.zzl = i6;
                this.zzp = com.google.android.gms.internal.ads.zzaay.zzn(this.zzd, zzaamVar.zzn);
                this.zzt = (i3 & 384) == 128;
                this.zzu = (i3 & 64) == 64;
                zzvVar = this.zzd;
                str2 = zzvVar.zzp;
                if (str2 != null) {
                }
                i9 = 0;
                this.zzv = i9;
                if ((zzvVar.zzf & 16384) == 0) {
                }
                i13 = 0;
                this.zzs = i13;
            }
        }
        z2 = false;
        this.zze = z2;
        if (z) {
        }
        z3 = false;
        this.zzg = z3;
        this.zzh = com.google.android.gms.internal.ads.zznc.CC.zzac(i3, false);
        com.google.android.gms.internal.ads.zzv zzvVar422 = this.zzd;
        float f322 = zzvVar422.zzA;
        this.zzi = f322 == -1.0f && f322 >= 10.0f;
        this.zzj = zzvVar422.zzj;
        this.zzk = zzvVar422.zzc();
        i5 = 0;
        while (true) {
            i6 = Integer.MAX_VALUE;
            if (i5 >= zzaamVar.zzo.size()) {
            }
            i5++;
        }
        this.zzm = i5;
        this.zzn = i7;
        int i2222 = this.zzd.zzf;
        int i2322 = zzaamVar.zzp;
        this.zzo = com.google.android.gms.internal.ads.zzaay.zzm(i2222, 0);
        int i2422 = this.zzd.zzf;
        this.zzq = (i2422 == 0 && (i2422 & 1) == 0) ? false : true;
        this.zzr = com.google.android.gms.internal.ads.zzaay.zzj(this.zzd, str, com.google.android.gms.internal.ads.zzaay.zzi(str) == null);
        i8 = 0;
        while (true) {
            if (i8 < zzaamVar.zzm.size()) {
            }
            i8++;
        }
        this.zzl = i6;
        this.zzp = com.google.android.gms.internal.ads.zzaay.zzn(this.zzd, zzaamVar.zzn);
        this.zzt = (i3 & 384) == 128;
        this.zzu = (i3 & 64) == 64;
        zzvVar = this.zzd;
        str2 = zzvVar.zzp;
        if (str2 != null) {
        }
        i9 = 0;
        this.zzv = i9;
        if ((zzvVar.zzf & 16384) == 0) {
        }
        i13 = 0;
        this.zzs = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(com.google.android.gms.internal.ads.zzaax zzaaxVar, com.google.android.gms.internal.ads.zzaax zzaaxVar2) {
        com.google.android.gms.internal.ads.zzgvz zza = com.google.android.gms.internal.ads.zzgvz.zzg().zzd(zzaaxVar.zzh, zzaaxVar2.zzh).zza(java.lang.Integer.valueOf(zzaaxVar.zzm), java.lang.Integer.valueOf(zzaaxVar2.zzm), com.google.android.gms.internal.ads.zzgyg.zzb().zza()).zzb(zzaaxVar.zzn, zzaaxVar2.zzn).zzb(zzaaxVar.zzo, zzaaxVar2.zzo).zza(java.lang.Integer.valueOf(zzaaxVar.zzp), java.lang.Integer.valueOf(zzaaxVar2.zzp), com.google.android.gms.internal.ads.zzgyg.zzb().zza()).zzd(zzaaxVar.zzq, zzaaxVar2.zzq).zzb(zzaaxVar.zzr, zzaaxVar2.zzr).zzd(zzaaxVar.zzi, zzaaxVar2.zzi).zzd(zzaaxVar.zze, zzaaxVar2.zze).zzd(zzaaxVar.zzg, zzaaxVar2.zzg).zza(java.lang.Integer.valueOf(zzaaxVar.zzl), java.lang.Integer.valueOf(zzaaxVar2.zzl), com.google.android.gms.internal.ads.zzgyg.zzb().zza());
        boolean z = zzaaxVar.zzt;
        com.google.android.gms.internal.ads.zzgvz zzd = zza.zzd(z, zzaaxVar2.zzt);
        boolean z2 = zzaaxVar.zzu;
        com.google.android.gms.internal.ads.zzgvz zzd2 = zzd.zzd(z2, zzaaxVar2.zzu);
        if (z && z2) {
            zzd2 = zzd2.zzb(zzaaxVar.zzv, zzaaxVar2.zzv);
        }
        return zzd2.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(com.google.android.gms.internal.ads.zzaax zzaaxVar, com.google.android.gms.internal.ads.zzaax zzaaxVar2) {
        com.google.android.gms.internal.ads.zzgyg zzgygVar;
        com.google.android.gms.internal.ads.zzgyg zza;
        if (zzaaxVar.zze && zzaaxVar.zzh) {
            zza = com.google.android.gms.internal.ads.zzaay.zzc;
        } else {
            zzgygVar = com.google.android.gms.internal.ads.zzaay.zzc;
            zza = zzgygVar.zza();
        }
        com.google.android.gms.internal.ads.zzgvz zzg = com.google.android.gms.internal.ads.zzgvz.zzg();
        boolean z = zzaaxVar.zzf.zzF;
        return zzg.zza(java.lang.Integer.valueOf(zzaaxVar.zzk), java.lang.Integer.valueOf(zzaaxVar2.zzk), zza).zza(java.lang.Integer.valueOf(zzaaxVar.zzj), java.lang.Integer.valueOf(zzaaxVar2.zzj), zza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final /* bridge */ /* synthetic */ boolean zzc(com.google.android.gms.internal.ads.zzaaq zzaaqVar) {
        com.google.android.gms.internal.ads.zzaax zzaaxVar = (com.google.android.gms.internal.ads.zzaax) zzaaqVar;
        if (!java.util.Objects.equals(this.zzd.zzp, zzaaxVar.zzd.zzp)) {
            return false;
        }
        boolean z = this.zzf.zzN;
        return this.zzt == zzaaxVar.zzt && this.zzu == zzaaxVar.zzu;
    }
}
