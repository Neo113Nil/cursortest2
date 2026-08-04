package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class zzabu {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b7 = bArr[4];
            return zzf((b7 & 192) >> 6, b7 & 63);
        }
        int i7 = bArr[2] & 7;
        int i8 = ((bArr[3] & 255) | (i7 << 8)) + 1;
        return i8 + i8;
    }

    public static zzz zzc(zzed zzedVar, String str, String str2, zzs zzsVar) {
        zzec zzecVar = new zzec();
        zzecVar.zzj(zzedVar);
        int i7 = zzc[zzecVar.zzd(2)];
        zzecVar.zzn(8);
        int i8 = zze[zzecVar.zzd(3)];
        if (zzecVar.zzd(1) != 0) {
            i8++;
        }
        int i9 = zzf[zzecVar.zzd(5)] * zzbbd.zzq.zzf;
        zzecVar.zzf();
        zzedVar.zzL(zzecVar.zzb());
        zzx zzxVar = new zzx();
        zzxVar.zzO(str);
        zzxVar.zzad("audio/ac3");
        zzxVar.zzB(i8);
        zzxVar.zzae(i7);
        zzxVar.zzH(zzsVar);
        zzxVar.zzS(str2);
        zzxVar.zzA(i9);
        zzxVar.zzY(i9);
        return zzxVar.zzaj();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static zzz zzd(zzed zzedVar, String str, String str2, zzs zzsVar) {
        String str3;
        zzec zzecVar = new zzec();
        zzecVar.zzj(zzedVar);
        int iZzd = zzecVar.zzd(13) * zzbbd.zzq.zzf;
        zzecVar.zzn(3);
        int i7 = zzc[zzecVar.zzd(2)];
        zzecVar.zzn(10);
        int i8 = zze[zzecVar.zzd(3)];
        if (zzecVar.zzd(1) != 0) {
            i8++;
        }
        zzecVar.zzn(3);
        int iZzd2 = zzecVar.zzd(4);
        zzecVar.zzn(1);
        if (iZzd2 > 0) {
            zzecVar.zzn(6);
            if (zzecVar.zzd(1) != 0) {
                i8 += 2;
            }
            zzecVar.zzn(1);
        }
        if (zzecVar.zza() > 7) {
            zzecVar.zzn(7);
            if (zzecVar.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        zzecVar.zzf();
        zzedVar.zzL(zzecVar.zzb());
        zzx zzxVar = new zzx();
        zzxVar.zzO(str);
        zzxVar.zzad(str3);
        zzxVar.zzB(i8);
        zzxVar.zzae(i7);
        zzxVar.zzH(zzsVar);
        zzxVar.zzS(str2);
        zzxVar.zzY(iZzd);
        return zzxVar.zzaj();
    }

    public static zzabs zze(zzec zzecVar) {
        int i7;
        int i8;
        String str;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzc = zzecVar.zzc();
        zzecVar.zzn(40);
        int iZzd = zzecVar.zzd(5);
        zzecVar.zzl(iZzc);
        int i18 = -1;
        if (iZzd > 10) {
            zzecVar.zzn(16);
            int iZzd2 = zzecVar.zzd(2);
            if (iZzd2 == 0) {
                i18 = 0;
            } else if (iZzd2 == 1) {
                i18 = 1;
            } else if (iZzd2 == 2) {
                i18 = 2;
            }
            zzecVar.zzn(3);
            int iZzd3 = zzecVar.zzd(11) + 1;
            int iZzd4 = zzecVar.zzd(2);
            if (iZzd4 == 3) {
                i14 = zzd[zzecVar.zzd(2)];
                i15 = 6;
                i13 = 3;
            } else {
                int iZzd5 = zzecVar.zzd(2);
                int i19 = zzb[iZzd5];
                i13 = iZzd5;
                i14 = zzc[iZzd4];
                i15 = i19;
            }
            int i20 = iZzd3 + iZzd3;
            int i21 = (i20 * i14) / (i15 * 32);
            int iZzd6 = zzecVar.zzd(3);
            boolean zZzp = zzecVar.zzp();
            i7 = zze[iZzd6] + (zZzp ? 1 : 0);
            zzecVar.zzn(10);
            if (zzecVar.zzp()) {
                zzecVar.zzn(8);
            }
            if (iZzd6 == 0) {
                zzecVar.zzn(5);
                if (zzecVar.zzp()) {
                    zzecVar.zzn(8);
                }
                i16 = 0;
                iZzd6 = 0;
            } else {
                i16 = iZzd6;
            }
            if (i18 == 1) {
                if (zzecVar.zzp()) {
                    zzecVar.zzn(16);
                }
                i17 = 1;
            } else {
                i17 = i18;
            }
            if (zzecVar.zzp()) {
                if (i16 > 2) {
                    zzecVar.zzn(2);
                }
                if ((i16 & 1) != 0 && i16 > 2) {
                    zzecVar.zzn(6);
                }
                if ((i16 & 4) != 0) {
                    zzecVar.zzn(6);
                }
                if (zZzp && zzecVar.zzp()) {
                    zzecVar.zzn(5);
                }
                if (i17 == 0) {
                    if (zzecVar.zzp()) {
                        zzecVar.zzn(6);
                    }
                    if (i16 == 0 && zzecVar.zzp()) {
                        zzecVar.zzn(6);
                    }
                    if (zzecVar.zzp()) {
                        zzecVar.zzn(6);
                    }
                    int iZzd7 = zzecVar.zzd(2);
                    if (iZzd7 == 1) {
                        zzecVar.zzn(5);
                    } else if (iZzd7 == 2) {
                        zzecVar.zzn(12);
                    } else if (iZzd7 == 3) {
                        int iZzd8 = zzecVar.zzd(5);
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(5);
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(4);
                            }
                            if (zzecVar.zzp()) {
                                if (zzecVar.zzp()) {
                                    zzecVar.zzn(4);
                                }
                                if (zzecVar.zzp()) {
                                    zzecVar.zzn(4);
                                }
                            }
                        }
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(5);
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(7);
                                if (zzecVar.zzp()) {
                                    zzecVar.zzn(8);
                                }
                            }
                        }
                        zzecVar.zzn((iZzd8 + 2) * 8);
                        zzecVar.zzf();
                    }
                    if (i16 < 2) {
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(14);
                        }
                        if (iZzd6 == 0 && zzecVar.zzp()) {
                            zzecVar.zzn(14);
                        }
                    }
                    if (!zzecVar.zzp()) {
                        i17 = 0;
                    } else if (i13 == 0) {
                        zzecVar.zzn(5);
                        i17 = 0;
                        i13 = 0;
                    } else {
                        for (int i22 = 0; i22 < i15; i22++) {
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(5);
                            }
                        }
                        i17 = 0;
                    }
                }
            }
            if (zzecVar.zzp()) {
                zzecVar.zzn(5);
                if (i16 == 2) {
                    zzecVar.zzn(4);
                    i16 = 2;
                }
                if (i16 >= 6) {
                    zzecVar.zzn(2);
                }
                if (zzecVar.zzp()) {
                    zzecVar.zzn(8);
                }
                if (i16 == 0 && zzecVar.zzp()) {
                    zzecVar.zzn(8);
                }
                if (iZzd4 < 3) {
                    zzecVar.zzm();
                }
            }
            if (i17 == 0 && i13 != 3) {
                zzecVar.zzm();
            }
            if (i17 == 2 && (i13 == 3 || zzecVar.zzp())) {
                zzecVar.zzn(6);
            }
            str = (zzecVar.zzp() && zzecVar.zzd(6) == 1 && zzecVar.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i8 = i18;
            i10 = i20;
            i11 = i14;
            i12 = i15 * 256;
            i9 = i21;
        } else {
            zzecVar.zzn(32);
            int iZzd9 = zzecVar.zzd(2);
            String str2 = iZzd9 == 3 ? null : "audio/ac3";
            int iZzd10 = zzecVar.zzd(6);
            int i23 = zzf[iZzd10 / 2] * zzbbd.zzq.zzf;
            int iZzf = zzf(iZzd9, iZzd10);
            zzecVar.zzn(8);
            int iZzd11 = zzecVar.zzd(3);
            if ((iZzd11 & 1) != 0 && iZzd11 != 1) {
                zzecVar.zzn(2);
            }
            if ((iZzd11 & 4) != 0) {
                zzecVar.zzn(2);
            }
            if (iZzd11 == 2) {
                zzecVar.zzn(2);
            }
            int i24 = iZzd9 < 3 ? zzc[iZzd9] : -1;
            i7 = zze[iZzd11] + (zzecVar.zzp() ? 1 : 0);
            i8 = -1;
            str = str2;
            i9 = i23;
            i10 = iZzf;
            i11 = i24;
            i12 = 1536;
        }
        return new zzabs(str, i8, i7, i11, i10, i12, i9, null);
    }

    private static int zzf(int i7, int i8) {
        int i9;
        if (i7 < 0 || i7 >= 3 || i8 < 0 || (i9 = i8 >> 1) >= 19) {
            return -1;
        }
        int i10 = zzc[i7];
        if (i10 == 44100) {
            int i11 = zzg[i9] + (i8 & 1);
            return i11 + i11;
        }
        int i12 = zzf[i9];
        return i10 == 32000 ? i12 * 6 : i12 * 4;
    }
}
