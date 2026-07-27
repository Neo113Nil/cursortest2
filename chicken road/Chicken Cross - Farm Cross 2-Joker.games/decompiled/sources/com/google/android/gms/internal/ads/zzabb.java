package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzabb extends zzaau {
    private final boolean zze;
    private final zzaaq zzf;
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
    private final boolean zzv;
    private final int zzw;
    private final boolean zzx;
    private final String zzy;

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
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0114 A[EDGE_INSN: B:155:0x0114->B:76:0x0114 BREAK  A[LOOP:1: B:69:0x00f9->B:153:0x0111], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzabb(int i, zzbg zzbgVar, int i2, zzaaq zzaaqVar, int i3, String str, int i4, boolean z) {
        super(i, zzbgVar, i2);
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        String str2;
        int i8;
        int i9;
        boolean z4;
        boolean z5;
        int i10;
        char c;
        boolean z6;
        zzv zzvVar;
        boolean z7;
        int i11;
        zzv zzvVar2;
        int i12;
        int i13;
        int i14;
        this.zzf = zzaaqVar;
        int i15 = 1;
        int i16 = true != zzaaqVar.zzM ? 16 : 24;
        boolean z8 = zzaaqVar.zzL;
        if (z && (((i12 = (zzvVar2 = this.zzd).zzw) == -1 || i12 <= zzaaqVar.zza) && ((i13 = zzvVar2.zzx) == -1 || i13 <= zzaaqVar.zzb))) {
            float f = zzvVar2.zzA;
            if ((f == -1.0f || f <= zzaaqVar.zzc) && ((i14 = zzvVar2.zzj) == -1 || i14 <= zzaaqVar.zzd)) {
                z2 = true;
                this.zze = z2;
                if (z) {
                    zzv zzvVar3 = this.zzd;
                    int i17 = zzvVar3.zzw;
                    if (i17 != -1) {
                        int i18 = zzaaqVar.zze;
                    }
                    int i19 = zzvVar3.zzx;
                    if (i19 != -1) {
                        int i20 = zzaaqVar.zzf;
                    }
                    float f2 = zzvVar3.zzA;
                    if (f2 != -1.0f) {
                        int i21 = zzaaqVar.zzg;
                    }
                    int i22 = zzvVar3.zzj;
                    if (i22 != -1) {
                        int i23 = zzaaqVar.zzh;
                    }
                    z3 = true;
                    this.zzg = z3;
                    this.zzh = zzng.zzad(i3, false);
                    zzv zzvVar4 = this.zzd;
                    float f3 = zzvVar4.zzA;
                    this.zzi = f3 == -1.0f && f3 >= 10.0f;
                    this.zzj = zzvVar4.zzj;
                    this.zzk = zzvVar4.zzc();
                    i5 = 0;
                    while (true) {
                        i6 = Integer.MAX_VALUE;
                        if (i5 >= zzaaqVar.zzo.size()) {
                            i7 = 0;
                            i5 = Integer.MAX_VALUE;
                            break;
                        } else {
                            i7 = zzabc.zzj(this.zzd, (String) zzaaqVar.zzo.get(i5), false);
                            if (i7 > 0) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.zzm = i5;
                    this.zzn = i7;
                    int i24 = this.zzd.zzf;
                    int i25 = zzaaqVar.zzp;
                    this.zzo = zzabc.zzm(i24, 0);
                    int i26 = this.zzd.zzf;
                    this.zzq = (i26 == 0 && (i26 & 1) == 0) ? false : true;
                    this.zzr = zzabc.zzj(this.zzd, str, zzabc.zzi(str) == null);
                    zzv zzvVar5 = this.zzd;
                    str2 = zzvVar5.zzp;
                    i8 = i3 & 384;
                    int i27 = 256;
                    if (i8 == 256) {
                        String zzg = zzwl.zzg(zzvVar5);
                        str2 = zzg != null ? zzg : str2;
                        i8 = 256;
                    }
                    i9 = 0;
                    while (true) {
                        if (i9 < zzaaqVar.zzm.size()) {
                            if (str2 != null && str2.equals(zzaaqVar.zzm.get(i9))) {
                                i6 = i9;
                                break;
                            }
                            i9++;
                        } else {
                            break;
                        }
                    }
                    this.zzl = i6;
                    this.zzp = zzabc.zzn(this.zzd, zzaaqVar.zzn);
                    if (i8 == 128) {
                        z4 = true;
                        i27 = i8;
                    } else if (i8 == 256) {
                        z4 = true;
                    } else {
                        i27 = i8;
                        z4 = false;
                    }
                    this.zzt = z4;
                    z5 = i27 == 128;
                    this.zzu = z5;
                    this.zzv = (i3 & 64) == 64;
                    this.zzy = str2;
                    if (str2 != null) {
                        i10 = 4;
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
                            i10 = 5;
                        } else if (c != 1) {
                            if (c == 2) {
                                i10 = 3;
                            } else if (c == 3) {
                                i10 = 2;
                            } else if (c == 4) {
                                i10 = 1;
                            }
                        }
                        this.zzw = i10;
                        if (z5) {
                            zzi zziVar = this.zzd.zzG;
                            zzi zziVar2 = zzi.zza;
                            if (zziVar != null && ((i11 = zziVar.zzd) == 7 || i11 == 6)) {
                                z6 = true;
                                this.zzx = z6;
                                zzvVar = this.zzd;
                                if ((zzvVar.zzf & 16384) == 0) {
                                    zzaaq zzaaqVar2 = this.zzf;
                                    if (zzng.zzad(i3, zzaaqVar2.zzV) && ((z7 = this.zze) || zzaaqVar2.zzK)) {
                                        if (zzng.zzad(i3, false) && this.zzg && z7 && zzvVar.zzj != -1) {
                                            boolean z9 = zzaaqVar2.zzG;
                                            boolean z10 = zzaaqVar2.zzF;
                                            if ((i16 & i3) != 0) {
                                                i15 = 2;
                                            }
                                        }
                                        this.zzs = i15;
                                    }
                                }
                                i15 = 0;
                                this.zzs = i15;
                            }
                        }
                        z6 = false;
                        this.zzx = z6;
                        zzvVar = this.zzd;
                        if ((zzvVar.zzf & 16384) == 0) {
                        }
                        i15 = 0;
                        this.zzs = i15;
                    }
                    i10 = 0;
                    this.zzw = i10;
                    if (z5) {
                    }
                    z6 = false;
                    this.zzx = z6;
                    zzvVar = this.zzd;
                    if ((zzvVar.zzf & 16384) == 0) {
                    }
                    i15 = 0;
                    this.zzs = i15;
                }
                z3 = false;
                this.zzg = z3;
                this.zzh = zzng.zzad(i3, false);
                zzv zzvVar42 = this.zzd;
                float f32 = zzvVar42.zzA;
                this.zzi = f32 == -1.0f && f32 >= 10.0f;
                this.zzj = zzvVar42.zzj;
                this.zzk = zzvVar42.zzc();
                i5 = 0;
                while (true) {
                    i6 = Integer.MAX_VALUE;
                    if (i5 >= zzaaqVar.zzo.size()) {
                    }
                    i5++;
                }
                this.zzm = i5;
                this.zzn = i7;
                int i242 = this.zzd.zzf;
                int i252 = zzaaqVar.zzp;
                this.zzo = zzabc.zzm(i242, 0);
                int i262 = this.zzd.zzf;
                this.zzq = (i262 == 0 && (i262 & 1) == 0) ? false : true;
                this.zzr = zzabc.zzj(this.zzd, str, zzabc.zzi(str) == null);
                zzv zzvVar52 = this.zzd;
                str2 = zzvVar52.zzp;
                i8 = i3 & 384;
                int i272 = 256;
                if (i8 == 256) {
                }
                i9 = 0;
                while (true) {
                    if (i9 < zzaaqVar.zzm.size()) {
                    }
                    i9++;
                }
                this.zzl = i6;
                this.zzp = zzabc.zzn(this.zzd, zzaaqVar.zzn);
                if (i8 == 128) {
                }
                this.zzt = z4;
                if (i272 == 128) {
                }
                this.zzu = z5;
                this.zzv = (i3 & 64) == 64;
                this.zzy = str2;
                if (str2 != null) {
                }
                i10 = 0;
                this.zzw = i10;
                if (z5) {
                }
                z6 = false;
                this.zzx = z6;
                zzvVar = this.zzd;
                if ((zzvVar.zzf & 16384) == 0) {
                }
                i15 = 0;
                this.zzs = i15;
            }
        }
        z2 = false;
        this.zze = z2;
        if (z) {
        }
        z3 = false;
        this.zzg = z3;
        this.zzh = zzng.zzad(i3, false);
        zzv zzvVar422 = this.zzd;
        float f322 = zzvVar422.zzA;
        this.zzi = f322 == -1.0f && f322 >= 10.0f;
        this.zzj = zzvVar422.zzj;
        this.zzk = zzvVar422.zzc();
        i5 = 0;
        while (true) {
            i6 = Integer.MAX_VALUE;
            if (i5 >= zzaaqVar.zzo.size()) {
            }
            i5++;
        }
        this.zzm = i5;
        this.zzn = i7;
        int i2422 = this.zzd.zzf;
        int i2522 = zzaaqVar.zzp;
        this.zzo = zzabc.zzm(i2422, 0);
        int i2622 = this.zzd.zzf;
        this.zzq = (i2622 == 0 && (i2622 & 1) == 0) ? false : true;
        this.zzr = zzabc.zzj(this.zzd, str, zzabc.zzi(str) == null);
        zzv zzvVar522 = this.zzd;
        str2 = zzvVar522.zzp;
        i8 = i3 & 384;
        int i2722 = 256;
        if (i8 == 256) {
        }
        i9 = 0;
        while (true) {
            if (i9 < zzaaqVar.zzm.size()) {
            }
            i9++;
        }
        this.zzl = i6;
        this.zzp = zzabc.zzn(this.zzd, zzaaqVar.zzn);
        if (i8 == 128) {
        }
        this.zzt = z4;
        if (i2722 == 128) {
        }
        this.zzu = z5;
        this.zzv = (i3 & 64) == 64;
        this.zzy = str2;
        if (str2 != null) {
        }
        i10 = 0;
        this.zzw = i10;
        if (z5) {
        }
        z6 = false;
        this.zzx = z6;
        zzvVar = this.zzd;
        if ((zzvVar.zzf & 16384) == 0) {
        }
        i15 = 0;
        this.zzs = i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzabb zzabbVar, zzabb zzabbVar2) {
        return zzgwz.zzg().zzd(zzabbVar.zzh, zzabbVar2.zzh).zza(Integer.valueOf(zzabbVar.zzm), Integer.valueOf(zzabbVar2.zzm), zzgzg.zzb().zza()).zzb(zzabbVar.zzn, zzabbVar2.zzn).zzb(zzabbVar.zzo, zzabbVar2.zzo).zza(Integer.valueOf(zzabbVar.zzp), Integer.valueOf(zzabbVar2.zzp), zzgzg.zzb().zza()).zzd(zzabbVar.zzq, zzabbVar2.zzq).zzb(zzabbVar.zzr, zzabbVar2.zzr).zzd(zzabbVar.zzi, zzabbVar2.zzi).zzd(zzabbVar.zze, zzabbVar2.zze).zzd(zzabbVar.zzg, zzabbVar2.zzg).zza(Integer.valueOf(zzabbVar.zzl), Integer.valueOf(zzabbVar2.zzl), zzgzg.zzb().zza()).zzd(zzabbVar.zzt, zzabbVar2.zzt).zzd(zzabbVar.zzv, zzabbVar2.zzv).zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzabb zzabbVar, zzabb zzabbVar2) {
        zzgzg zzgzgVar;
        zzgzg zza;
        if (zzabbVar.zze && zzabbVar.zzh) {
            zza = zzabc.zzc;
        } else {
            zzgzgVar = zzabc.zzc;
            zza = zzgzgVar.zza();
        }
        zzgwz zzg = zzgwz.zzg();
        boolean z = zzabbVar.zzf.zzF;
        zzgwz zza2 = zzg.zzd(zzabbVar.zzx, zzabbVar2.zzx).zza(Integer.valueOf(zzabbVar.zzk), Integer.valueOf(zzabbVar2.zzk), zza);
        if (zzabbVar.zzt && zzabbVar.zzv) {
            zza2 = zza2.zzb(zzabbVar.zzw, zzabbVar2.zzw);
        }
        return zza2.zzd(zzabbVar.zzu, zzabbVar2.zzu).zza(Integer.valueOf(zzabbVar.zzj), Integer.valueOf(zzabbVar2.zzj), zza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final /* bridge */ /* synthetic */ boolean zzc(zzaau zzaauVar) {
        zzabb zzabbVar = (zzabb) zzaauVar;
        if (!Objects.equals(this.zzy, zzabbVar.zzy)) {
            return false;
        }
        boolean z = this.zzf.zzN;
        return this.zzt == zzabbVar.zzt && this.zzv == zzabbVar.zzv;
    }
}
