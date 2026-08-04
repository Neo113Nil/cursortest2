package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
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

    /* JADX WARN: Code duplicated, block: B:115:0x029b  */
    /* JADX WARN: Code duplicated, block: B:116:0x029e  */
    private static zzadk zzc(zzed zzedVar, boolean z4, zzfg zzfgVar) throws zzaz {
        boolean z7;
        String str;
        int i7;
        int i8;
        zzfc zzfcVar;
        int i9;
        int i10 = 4;
        if (z4) {
            try {
                zzedVar.zzM(4);
            } catch (ArrayIndexOutOfBoundsException e7) {
                e = e7;
                z7 = true;
                if (z7 != z4) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzaz.zza("Error parsing".concat(str), e);
            }
        } else {
            try {
                zzedVar.zzM(21);
            } catch (ArrayIndexOutOfBoundsException e8) {
                e = e8;
                z7 = true;
                if (z7 != z4) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzaz.zza("Error parsing".concat(str), e);
            }
        }
        int iZzm = zzedVar.zzm() & 3;
        int iZzm2 = zzedVar.zzm();
        int iZzd = zzedVar.zzd();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < iZzm2; i13++) {
            zzedVar.zzM(1);
            int iZzq = zzedVar.zzq();
            for (int i14 = 0; i14 < iZzq; i14++) {
                int iZzq2 = zzedVar.zzq();
                i12 += iZzq2 + 4;
                zzedVar.zzM(iZzq2);
            }
        }
        zzedVar.zzL(iZzd);
        byte[] bArr = new byte[i12];
        zzfg zzfgVar2 = zzfgVar;
        int i15 = 0;
        float f7 = 1.0f;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        String strZzd = null;
        int i26 = 0;
        while (i26 < iZzm2) {
            int iZzm3 = zzedVar.zzm() & 63;
            int iZzq3 = zzedVar.zzq();
            int i27 = i11;
            zzfg zzfgVarZze = zzfgVar2;
            while (i27 < iZzq3) {
                int iZzq4 = zzedVar.zzq();
                int i28 = iZzm2;
                System.arraycopy(zzfj.zza, i11, bArr, i15, i10);
                int i29 = i15 + 4;
                System.arraycopy(zzedVar.zzN(), zzedVar.zzd(), bArr, i29, iZzq4);
                int i30 = 32;
                if (iZzm3 == 32) {
                    if (i27 == 0) {
                        zzfgVarZze = zzfj.zze(bArr, i29, i29 + iZzq4);
                        i7 = iZzq3;
                        iZzm3 = iZzm3;
                        i9 = 0;
                        i27 = 0;
                    }
                    i15 = i29 + iZzq4;
                    zzedVar.zzM(iZzq4);
                    i27++;
                    i11 = i9;
                    iZzm2 = i28;
                    iZzq3 = i7;
                    iZzm3 = iZzm3;
                    i10 = 4;
                } else {
                    i30 = iZzm3;
                }
                i7 = iZzq3;
                int i31 = 8;
                if (i30 != 33) {
                    iZzm3 = iZzm3;
                    if (i30 == 39 && i27 == 0) {
                        int i32 = i15 + 6;
                        int i33 = (i29 + iZzq4) - 1;
                        while (true) {
                            byte b7 = bArr[i33];
                            if (b7 != 0) {
                                if (b7 != 0 && i33 > i32) {
                                    zzfk zzfkVar = new zzfk(bArr, i32, i33 + 1);
                                    while (true) {
                                        if (zzfkVar.zzg(16)) {
                                            int iZza = zzfkVar.zza(i31);
                                            int i34 = 0;
                                            while (iZza == 255) {
                                                i34 += 255;
                                                iZza = zzfkVar.zza(i31);
                                            }
                                            int i35 = i34 + iZza;
                                            int iZza2 = zzfkVar.zza(i31);
                                            int i36 = 0;
                                            while (iZza2 == 255) {
                                                i36 += 255;
                                                iZza2 = zzfkVar.zza(8);
                                            }
                                            int i37 = i36 + iZza2;
                                            if (i37 != 0 && zzfkVar.zzg(i37)) {
                                                if (i35 == 176) {
                                                    int iZzc = zzfkVar.zzc();
                                                    boolean zZzh = zzfkVar.zzh();
                                                    int iZzc2 = zZzh ? zzfkVar.zzc() : 0;
                                                    int iZzc3 = zzfkVar.zzc();
                                                    int i38 = 0;
                                                    int iZzc4 = -1;
                                                    int iZzc5 = -1;
                                                    int i39 = -1;
                                                    int iZza3 = -1;
                                                    int i40 = -1;
                                                    int iZza4 = -1;
                                                    while (true) {
                                                        if (i38 <= iZzc3) {
                                                            iZzc4 = zzfkVar.zzc();
                                                            iZzc5 = zzfkVar.zzc();
                                                            i8 = i27;
                                                            int iZza5 = zzfkVar.zza(6);
                                                            if (iZza5 != 63) {
                                                                iZza3 = zzfkVar.zza(iZza5 == 0 ? Math.max(0, iZzc - 30) : Math.max(0, (iZza5 + iZzc) - 31));
                                                                if (zZzh) {
                                                                    int iZza6 = zzfkVar.zza(6);
                                                                    if (iZza6 != 63) {
                                                                        iZza4 = zzfkVar.zza(iZza6 == 0 ? Math.max(0, iZzc2 - 30) : Math.max(0, (iZza6 + iZzc2) - 31));
                                                                        i40 = iZza6;
                                                                    }
                                                                } else {
                                                                    zZzh = zZzh;
                                                                }
                                                                if (zzfkVar.zzh()) {
                                                                    zzfkVar.zzf(10);
                                                                }
                                                                i38++;
                                                                i39 = iZza5;
                                                                i27 = i8;
                                                                zZzh = zZzh;
                                                                i16 = i16;
                                                            }
                                                            zzfcVar = null;
                                                        } else {
                                                            i8 = i27;
                                                            i16 = i16;
                                                            zzfcVar = new zzfc(iZzc, iZzc2, iZzc3 + 1, iZzc4, iZzc5, i39, iZza3, i40, iZza4);
                                                        }
                                                    }
                                                } else {
                                                    i31 = 8;
                                                }
                                            }
                                            i16 = i16;
                                            zzfcVar = null;
                                        }
                                    }
                                }
                                if (zzfcVar == null && zzfgVarZze != null) {
                                    i9 = 0;
                                    if (zzfcVar.zza == ((zzew) zzfgVarZze.zza.get(0)).zzb) {
                                        i27 = i8;
                                        i16 = i16;
                                        i24 = 4;
                                    } else {
                                        i24 = 5;
                                    }
                                }
                                i27 = i8;
                                i16 = i16;
                            } else if (i33 > i32) {
                                i33--;
                            }
                            i8 = i27;
                            i16 = i16;
                            zzfcVar = null;
                            if (zzfcVar == null) {
                            }
                        }
                    } else {
                        i8 = i27;
                        i16 = i16;
                    }
                    i9 = 0;
                    i27 = i8;
                    i16 = i16;
                } else if (i27 == 0) {
                    zzfd zzfdVarZzd = zzfj.zzd(bArr, i29, i29 + iZzq4, zzfgVarZze);
                    int i41 = zzfdVarZzd.zza + 1;
                    int i42 = zzfdVarZzd.zze;
                    int i43 = zzfdVarZzd.zzf;
                    int i44 = zzfdVarZzd.zzc + 8;
                    int i45 = zzfdVarZzd.zzd + 8;
                    int i46 = zzfdVarZzd.zzi;
                    int i47 = zzfdVarZzd.zzj;
                    int i48 = zzfdVarZzd.zzk;
                    float f8 = zzfdVarZzd.zzg;
                    int i49 = zzfdVarZzd.zzh;
                    zzey zzeyVar = zzfdVarZzd.zzb;
                    if (zzeyVar != null) {
                        strZzd = zzda.zzd(zzeyVar.zza, zzeyVar.zzb, zzeyVar.zzc, zzeyVar.zzd, zzeyVar.zze, zzeyVar.zzf);
                    }
                    i16 = i41;
                    i17 = i42;
                    i9 = 0;
                    i25 = i49;
                    i23 = i48;
                    i21 = i46;
                    f7 = f8;
                    i22 = i47;
                    i20 = i45;
                    i19 = i44;
                    i18 = i43;
                } else {
                    iZzm3 = iZzm3;
                    i8 = i27;
                    i16 = i16;
                    i9 = 0;
                    i27 = i8;
                    i16 = i16;
                }
                i15 = i29 + iZzq4;
                zzedVar.zzM(iZzq4);
                i27++;
                i11 = i9;
                iZzm2 = i28;
                iZzq3 = i7;
                iZzm3 = iZzm3;
                i10 = 4;
            }
            i26++;
            zzfgVar2 = zzfgVarZze;
            i10 = 4;
        }
        return new zzadk(i12 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iZzm + 1, i16, i17, i18, i19, i20, i21, i22, i23, i24, f7, i25, strZzd, zzfgVar2);
    }
}
