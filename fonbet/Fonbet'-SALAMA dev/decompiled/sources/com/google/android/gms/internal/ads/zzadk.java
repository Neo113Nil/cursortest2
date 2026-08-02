package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzadk {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final float zzj;
    public final int zzk;
    public final String zzl;
    public final zzfg zzm;

    private zzadk(List list, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f7, int i17, String str, zzfg zzfgVar) {
        this.zza = list;
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = i15;
        this.zzi = i16;
        this.zzj = f7;
        this.zzk = i17;
        this.zzl = str;
        this.zzm = zzfgVar;
    }

    public static zzadk zza(zzed zzedVar) {
        return zzc(zzedVar, false, null);
    }

    public static zzadk zzb(zzed zzedVar, zzfg zzfgVar) {
        return zzc(zzedVar, true, zzfgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzadk zzc(zzed zzedVar, boolean z4, zzfg zzfgVar) {
        boolean z7;
        int i7;
        int i8;
        int i9;
        int i10;
        zzfc zzfcVar;
        int max;
        boolean z8;
        int max2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 4;
        if (z4) {
            try {
                zzedVar.zzM(4);
            } catch (ArrayIndexOutOfBoundsException e7) {
                e = e7;
                z7 = true;
                throw zzaz.zza("Error parsing".concat(z7 == z4 ? "HEVC config" : "L-HEVC config"), e);
            }
        } else {
            try {
                zzedVar.zzM(21);
            } catch (ArrayIndexOutOfBoundsException e8) {
                e = e8;
                z7 = true;
                throw zzaz.zza("Error parsing".concat(z7 == z4 ? "HEVC config" : "L-HEVC config"), e);
            }
        }
        int zzm = zzedVar.zzm() & 3;
        int zzm2 = zzedVar.zzm();
        int zzd = zzedVar.zzd();
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < zzm2; i19++) {
            zzedVar.zzM(1);
            int zzq = zzedVar.zzq();
            for (int i20 = 0; i20 < zzq; i20++) {
                int zzq2 = zzedVar.zzq();
                i18 += zzq2 + 4;
                zzedVar.zzM(zzq2);
            }
        }
        zzedVar.zzL(zzd);
        byte[] bArr = new byte[i18];
        zzfg zzfgVar2 = zzfgVar;
        int i21 = 0;
        float f7 = 1.0f;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        int i30 = -1;
        int i31 = -1;
        String str = null;
        int i32 = 0;
        while (i32 < zzm2) {
            int zzm3 = zzedVar.zzm() & 63;
            int zzq3 = zzedVar.zzq();
            int i33 = i17;
            zzfg zzfgVar3 = zzfgVar2;
            while (i33 < zzq3) {
                int zzq4 = zzedVar.zzq();
                int i34 = zzm2;
                System.arraycopy(zzfj.zza, i17, bArr, i21, i16);
                int i35 = i21 + 4;
                System.arraycopy(zzedVar.zzN(), zzedVar.zzd(), bArr, i35, zzq4);
                int i36 = 32;
                if (zzm3 != 32) {
                    i36 = zzm3;
                } else if (i33 == 0) {
                    zzfgVar3 = zzfj.zze(bArr, i35, i35 + zzq4);
                    i7 = zzq3;
                    i8 = zzm3;
                    i11 = 0;
                    i33 = 0;
                    i21 = i35 + zzq4;
                    zzedVar.zzM(zzq4);
                    i33++;
                    i17 = i11;
                    zzm2 = i34;
                    zzq3 = i7;
                    zzm3 = i8;
                    i16 = 4;
                }
                i7 = zzq3;
                int i37 = 8;
                if (i36 != 33) {
                    i8 = zzm3;
                    if (i36 == 39 && i33 == 0) {
                        int i38 = i21 + 6;
                        int i39 = (i35 + zzq4) - 1;
                        while (true) {
                            byte b7 = bArr[i39];
                            if (b7 == 0) {
                                if (i39 <= i38) {
                                    break;
                                }
                                i39--;
                            } else if (b7 != 0 && i39 > i38) {
                                zzfk zzfkVar = new zzfk(bArr, i38, i39 + 1);
                                while (zzfkVar.zzg(16)) {
                                    int zza = zzfkVar.zza(i37);
                                    int i40 = 0;
                                    while (zza == 255) {
                                        i40 += 255;
                                        zza = zzfkVar.zza(i37);
                                    }
                                    int i41 = i40 + zza;
                                    int zza2 = zzfkVar.zza(i37);
                                    int i42 = 0;
                                    while (zza2 == 255) {
                                        i42 += 255;
                                        zza2 = zzfkVar.zza(8);
                                    }
                                    int i43 = i42 + zza2;
                                    if (i43 == 0 || !zzfkVar.zzg(i43)) {
                                        break;
                                    }
                                    if (i41 == 176) {
                                        int zzc = zzfkVar.zzc();
                                        boolean zzh = zzfkVar.zzh();
                                        int zzc2 = zzh ? zzfkVar.zzc() : 0;
                                        int zzc3 = zzfkVar.zzc();
                                        int i44 = 0;
                                        int i45 = -1;
                                        int i46 = -1;
                                        int i47 = -1;
                                        int i48 = -1;
                                        int i49 = -1;
                                        int i50 = -1;
                                        while (i44 <= zzc3) {
                                            i45 = zzfkVar.zzc();
                                            i46 = zzfkVar.zzc();
                                            i9 = i33;
                                            int zza3 = zzfkVar.zza(6);
                                            if (zza3 != 63) {
                                                if (zza3 == 0) {
                                                    i10 = i22;
                                                    max = Math.max(0, zzc - 30);
                                                } else {
                                                    i10 = i22;
                                                    max = Math.max(0, (zza3 + zzc) - 31);
                                                }
                                                i48 = zzfkVar.zza(max);
                                                if (zzh) {
                                                    int zza4 = zzfkVar.zza(6);
                                                    if (zza4 != 63) {
                                                        if (zza4 == 0) {
                                                            z8 = zzh;
                                                            max2 = Math.max(0, zzc2 - 30);
                                                        } else {
                                                            z8 = zzh;
                                                            max2 = Math.max(0, (zza4 + zzc2) - 31);
                                                        }
                                                        i50 = zzfkVar.zza(max2);
                                                        i49 = zza4;
                                                    }
                                                } else {
                                                    z8 = zzh;
                                                }
                                                if (zzfkVar.zzh()) {
                                                    zzfkVar.zzf(10);
                                                }
                                                i44++;
                                                i47 = zza3;
                                                i33 = i9;
                                                zzh = z8;
                                                i22 = i10;
                                            }
                                        }
                                        i9 = i33;
                                        i10 = i22;
                                        zzfcVar = new zzfc(zzc, zzc2, zzc3 + 1, i45, i46, i47, i48, i49, i50);
                                    } else {
                                        i37 = 8;
                                    }
                                }
                            }
                        }
                        i9 = i33;
                        i10 = i22;
                        zzfcVar = null;
                        if (zzfcVar != null && zzfgVar3 != null) {
                            i11 = 0;
                            if (zzfcVar.zza == ((zzew) zzfgVar3.zza.get(0)).zzb) {
                                i33 = i9;
                                i22 = i10;
                                i30 = 4;
                                i21 = i35 + zzq4;
                                zzedVar.zzM(zzq4);
                                i33++;
                                i17 = i11;
                                zzm2 = i34;
                                zzq3 = i7;
                                zzm3 = i8;
                                i16 = 4;
                            } else {
                                i30 = 5;
                                i33 = i9;
                                i22 = i10;
                                i21 = i35 + zzq4;
                                zzedVar.zzM(zzq4);
                                i33++;
                                i17 = i11;
                                zzm2 = i34;
                                zzq3 = i7;
                                zzm3 = i8;
                                i16 = 4;
                            }
                        }
                    }
                    i9 = i33;
                    i10 = i22;
                } else if (i33 == 0) {
                    zzfd zzd2 = zzfj.zzd(bArr, i35, i35 + zzq4, zzfgVar3);
                    int i51 = zzd2.zza + 1;
                    int i52 = zzd2.zze;
                    int i53 = zzd2.zzf;
                    int i54 = zzd2.zzc + 8;
                    int i55 = zzd2.zzd + 8;
                    int i56 = zzd2.zzi;
                    int i57 = zzd2.zzj;
                    int i58 = zzd2.zzk;
                    float f8 = zzd2.zzg;
                    int i59 = zzd2.zzh;
                    zzey zzeyVar = zzd2.zzb;
                    if (zzeyVar != null) {
                        i12 = i59;
                        i13 = i56;
                        i14 = i52;
                        i8 = zzm3;
                        i15 = i53;
                        str = zzda.zzd(zzeyVar.zza, zzeyVar.zzb, zzeyVar.zzc, zzeyVar.zzd, zzeyVar.zze, zzeyVar.zzf);
                    } else {
                        i12 = i59;
                        i13 = i56;
                        i14 = i52;
                        i8 = zzm3;
                        i15 = i53;
                    }
                    i22 = i51;
                    i23 = i14;
                    i11 = 0;
                    i31 = i12;
                    i29 = i58;
                    i27 = i13;
                    f7 = f8;
                    i28 = i57;
                    i26 = i55;
                    i25 = i54;
                    i24 = i15;
                    i21 = i35 + zzq4;
                    zzedVar.zzM(zzq4);
                    i33++;
                    i17 = i11;
                    zzm2 = i34;
                    zzq3 = i7;
                    zzm3 = i8;
                    i16 = 4;
                } else {
                    i8 = zzm3;
                    i9 = i33;
                    i10 = i22;
                }
                i11 = 0;
                i33 = i9;
                i22 = i10;
                i21 = i35 + zzq4;
                zzedVar.zzM(zzq4);
                i33++;
                i17 = i11;
                zzm2 = i34;
                zzq3 = i7;
                zzm3 = i8;
                i16 = 4;
            }
            i32++;
            zzfgVar2 = zzfgVar3;
            i16 = 4;
        }
        return new zzadk(i18 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), zzm + 1, i22, i23, i24, i25, i26, i27, i28, i29, i30, f7, i31, str, zzfgVar2);
    }
}
