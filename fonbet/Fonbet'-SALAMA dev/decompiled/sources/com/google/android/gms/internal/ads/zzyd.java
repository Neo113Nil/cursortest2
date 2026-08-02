package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzyd extends zzya {
    private final boolean zze;
    private final zzxt zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final boolean zzs;
    private final boolean zzt;
    private final int zzu;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00fb A[EDGE_INSN: B:131:0x00fb->B:68:0x00fb BREAK  A[LOOP:1: B:60:0x00dc->B:129:0x00f8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzyd(int i7, zzbo zzboVar, int i8, zzxt zzxtVar, int i9, String str, int i10, boolean z4) {
        super(i7, zzboVar, i8);
        boolean z7;
        boolean z8;
        int i11;
        int size;
        int i12;
        int i13;
        int i14;
        zzz zzzVar;
        String str2;
        int i15;
        char c3;
        boolean z9;
        zzz zzzVar2;
        int i16;
        int i17;
        float f7;
        int i18;
        zzz zzzVar3;
        int i19;
        int i20;
        int i21;
        this.zzf = zzxtVar;
        int i22 = 1;
        int i23 = true != zzxtVar.zzI ? 16 : 24;
        if (z4 && (((i19 = (zzzVar3 = this.zzd).zzv) == -1 || i19 <= zzxtVar.zza) && ((i20 = zzzVar3.zzw) == -1 || i20 <= zzxtVar.zzb))) {
            float f8 = zzzVar3.zzx;
            if ((f8 == -1.0f || f8 <= zzxtVar.zzc) && ((i21 = zzzVar3.zzj) == -1 || i21 <= zzxtVar.zzd)) {
                z7 = true;
                this.zze = z7;
                if (z4 && (((i16 = (zzzVar2 = this.zzd).zzv) == -1 || i16 >= 0) && ((i17 = zzzVar2.zzw) == -1 || i17 >= 0))) {
                    f7 = zzzVar2.zzx;
                    if ((f7 != -1.0f || f7 >= 0.0f) && ((i18 = zzzVar2.zzj) == -1 || i18 >= 0)) {
                        z8 = true;
                        this.zzg = z8;
                        this.zzh = zzln.zza(i9, false);
                        zzz zzzVar4 = this.zzd;
                        float f9 = zzzVar4.zzx;
                        this.zzi = f9 == -1.0f && f9 >= 10.0f;
                        this.zzj = zzzVar4.zzj;
                        this.zzk = zzzVar4.zza();
                        i11 = 0;
                        while (true) {
                            size = zzxtVar.zzn.size();
                            i12 = f.API_PRIORITY_OTHER;
                            if (i11 < size) {
                                i13 = 0;
                                i11 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i13 = zzyf.zzc(this.zzd, (String) zzxtVar.zzn.get(i11), false);
                                if (i13 > 0) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        this.zzm = i11;
                        this.zzn = i13;
                        this.zzo = zzyf.zzb(this.zzd.zzf, 0);
                        int i24 = this.zzd.zzf;
                        this.zzp = (i24 == 0 && (i24 & 1) == 0) ? false : true;
                        this.zzq = zzyf.zzc(this.zzd, str, zzyf.zzh(str) != null);
                        i14 = 0;
                        while (true) {
                            if (i14 < zzxtVar.zzm.size()) {
                                String str3 = this.zzd.zzo;
                                if (str3 != null && str3.equals(zzxtVar.zzm.get(i14))) {
                                    i12 = i14;
                                    break;
                                }
                                i14++;
                            } else {
                                break;
                            }
                        }
                        this.zzl = i12;
                        this.zzs = (i9 & 384) != 128;
                        this.zzt = (i9 & 64) != 64;
                        zzzVar = this.zzd;
                        str2 = zzzVar.zzo;
                        if (str2 != null) {
                            i15 = 4;
                            switch (str2.hashCode()) {
                                case -1851077871:
                                    if (str2.equals("video/dolby-vision")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1662735862:
                                    if (str2.equals("video/av01")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1662541442:
                                    if (str2.equals("video/hevc")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1331836730:
                                    if (str2.equals("video/avc")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1599127257:
                                    if (str2.equals("video/x-vnd.on2.vp9")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            if (c3 == 0) {
                                i15 = 5;
                            } else if (c3 != 1) {
                                if (c3 == 2) {
                                    i15 = 3;
                                } else if (c3 == 3) {
                                    i15 = 2;
                                } else if (c3 == 4) {
                                    i15 = 1;
                                }
                            }
                            this.zzu = i15;
                            if ((zzzVar.zzf & 16384) == 0) {
                                zzxt zzxtVar2 = this.zzf;
                                if (zzln.zza(i9, zzxtVar2.zzR) && ((z9 = this.zze) || zzxtVar2.zzG)) {
                                    if (zzln.zza(i9, false) && this.zzg && z9 && zzzVar.zzj != -1 && (i23 & i9) != 0) {
                                        i22 = 2;
                                    }
                                    this.zzr = i22;
                                }
                            }
                            i22 = 0;
                            this.zzr = i22;
                        }
                        i15 = 0;
                        this.zzu = i15;
                        if ((zzzVar.zzf & 16384) == 0) {
                        }
                        i22 = 0;
                        this.zzr = i22;
                    }
                }
                z8 = false;
                this.zzg = z8;
                this.zzh = zzln.zza(i9, false);
                zzz zzzVar42 = this.zzd;
                float f92 = zzzVar42.zzx;
                this.zzi = f92 == -1.0f && f92 >= 10.0f;
                this.zzj = zzzVar42.zzj;
                this.zzk = zzzVar42.zza();
                i11 = 0;
                while (true) {
                    size = zzxtVar.zzn.size();
                    i12 = f.API_PRIORITY_OTHER;
                    if (i11 < size) {
                    }
                    i11++;
                }
                this.zzm = i11;
                this.zzn = i13;
                this.zzo = zzyf.zzb(this.zzd.zzf, 0);
                int i242 = this.zzd.zzf;
                this.zzp = (i242 == 0 && (i242 & 1) == 0) ? false : true;
                this.zzq = zzyf.zzc(this.zzd, str, zzyf.zzh(str) != null);
                i14 = 0;
                while (true) {
                    if (i14 < zzxtVar.zzm.size()) {
                    }
                    i14++;
                }
                this.zzl = i12;
                this.zzs = (i9 & 384) != 128;
                this.zzt = (i9 & 64) != 64;
                zzzVar = this.zzd;
                str2 = zzzVar.zzo;
                if (str2 != null) {
                }
                i15 = 0;
                this.zzu = i15;
                if ((zzzVar.zzf & 16384) == 0) {
                }
                i22 = 0;
                this.zzr = i22;
            }
        }
        z7 = false;
        this.zze = z7;
        if (z4) {
            f7 = zzzVar2.zzx;
            if (f7 != -1.0f) {
            }
            z8 = true;
            this.zzg = z8;
            this.zzh = zzln.zza(i9, false);
            zzz zzzVar422 = this.zzd;
            float f922 = zzzVar422.zzx;
            this.zzi = f922 == -1.0f && f922 >= 10.0f;
            this.zzj = zzzVar422.zzj;
            this.zzk = zzzVar422.zza();
            i11 = 0;
            while (true) {
                size = zzxtVar.zzn.size();
                i12 = f.API_PRIORITY_OTHER;
                if (i11 < size) {
                }
                i11++;
            }
            this.zzm = i11;
            this.zzn = i13;
            this.zzo = zzyf.zzb(this.zzd.zzf, 0);
            int i2422 = this.zzd.zzf;
            this.zzp = (i2422 == 0 && (i2422 & 1) == 0) ? false : true;
            this.zzq = zzyf.zzc(this.zzd, str, zzyf.zzh(str) != null);
            i14 = 0;
            while (true) {
                if (i14 < zzxtVar.zzm.size()) {
                }
                i14++;
            }
            this.zzl = i12;
            this.zzs = (i9 & 384) != 128;
            this.zzt = (i9 & 64) != 64;
            zzzVar = this.zzd;
            str2 = zzzVar.zzo;
            if (str2 != null) {
            }
            i15 = 0;
            this.zzu = i15;
            if ((zzzVar.zzf & 16384) == 0) {
            }
            i22 = 0;
            this.zzr = i22;
        }
        z8 = false;
        this.zzg = z8;
        this.zzh = zzln.zza(i9, false);
        zzz zzzVar4222 = this.zzd;
        float f9222 = zzzVar4222.zzx;
        this.zzi = f9222 == -1.0f && f9222 >= 10.0f;
        this.zzj = zzzVar4222.zzj;
        this.zzk = zzzVar4222.zza();
        i11 = 0;
        while (true) {
            size = zzxtVar.zzn.size();
            i12 = f.API_PRIORITY_OTHER;
            if (i11 < size) {
            }
            i11++;
        }
        this.zzm = i11;
        this.zzn = i13;
        this.zzo = zzyf.zzb(this.zzd.zzf, 0);
        int i24222 = this.zzd.zzf;
        this.zzp = (i24222 == 0 && (i24222 & 1) == 0) ? false : true;
        this.zzq = zzyf.zzc(this.zzd, str, zzyf.zzh(str) != null);
        i14 = 0;
        while (true) {
            if (i14 < zzxtVar.zzm.size()) {
            }
            i14++;
        }
        this.zzl = i12;
        this.zzs = (i9 & 384) != 128;
        this.zzt = (i9 & 64) != 64;
        zzzVar = this.zzd;
        str2 = zzzVar.zzo;
        if (str2 != null) {
        }
        i15 = 0;
        this.zzu = i15;
        if ((zzzVar.zzf & 16384) == 0) {
        }
        i22 = 0;
        this.zzr = i22;
    }

    public static /* synthetic */ int zza(zzyd zzydVar, zzyd zzydVar2) {
        zzfxs zzfxsVar;
        zzfxs zza;
        if (zzydVar.zze && zzydVar.zzh) {
            zza = zzyf.zzc;
        } else {
            zzfxsVar = zzyf.zzc;
            zza = zzfxsVar.zza();
        }
        zzfvw zzj = zzfvw.zzj();
        boolean z4 = zzydVar.zzf.zzB;
        return zzj.zzc(Integer.valueOf(zzydVar.zzk), Integer.valueOf(zzydVar2.zzk), zza).zzc(Integer.valueOf(zzydVar.zzj), Integer.valueOf(zzydVar2.zzj), zza).zza();
    }

    public static /* synthetic */ int zzd(zzyd zzydVar, zzyd zzydVar2) {
        zzfvw zzd = zzfvw.zzj().zzd(zzydVar.zzh, zzydVar2.zzh).zzc(Integer.valueOf(zzydVar.zzm), Integer.valueOf(zzydVar2.zzm), zzfxs.zzc().zza()).zzb(zzydVar.zzn, zzydVar2.zzn).zzb(zzydVar.zzo, zzydVar2.zzo).zzd(zzydVar.zzp, zzydVar2.zzp).zzb(zzydVar.zzq, zzydVar2.zzq).zzd(zzydVar.zzi, zzydVar2.zzi).zzd(zzydVar.zze, zzydVar2.zze).zzd(zzydVar.zzg, zzydVar2.zzg).zzc(Integer.valueOf(zzydVar.zzl), Integer.valueOf(zzydVar2.zzl), zzfxs.zzc().zza()).zzd(zzydVar.zzs, zzydVar2.zzs).zzd(zzydVar.zzt, zzydVar2.zzt);
        if (zzydVar.zzs && zzydVar.zzt) {
            zzd = zzd.zzb(zzydVar.zzu, zzydVar2.zzu);
        }
        return zzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final int zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final /* bridge */ /* synthetic */ boolean zzc(zzya zzyaVar) {
        zzyd zzydVar = (zzyd) zzyaVar;
        String str = this.zzd.zzo;
        String str2 = zzydVar.zzd.zzo;
        int i7 = zzen.zza;
        if (!Objects.equals(str, str2)) {
            return false;
        }
        boolean z4 = this.zzf.zzJ;
        return this.zzs == zzydVar.zzs && this.zzt == zzydVar.zzt;
    }
}
