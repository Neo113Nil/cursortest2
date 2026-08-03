package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaey {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 174, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static com.google.android.gms.internal.ads.zzv zza(com.google.android.gms.internal.ads.zzet zzetVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzq zzqVar) {
        com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes();
        zzesVar.zza(zzetVar);
        int i = zzc[zzesVar.zzj(2)];
        zzesVar.zzh(8);
        int i2 = zze[zzesVar.zzj(3)];
        if (zzesVar.zzj(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzesVar.zzj(5)] * 1000;
        zzesVar.zzm();
        zzetVar.zzh(zzesVar.zze());
        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
        zztVar.zza(str);
        zztVar.zzo("audio/ac3");
        zztVar.zzG(i2);
        zztVar.zzH(i);
        zztVar.zzs(zzqVar);
        zztVar.zze(str2);
        zztVar.zzi(i3);
        zztVar.zzj(i3);
        return zztVar.zzO();
    }

    public static com.google.android.gms.internal.ads.zzv zzb(com.google.android.gms.internal.ads.zzet zzetVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzq zzqVar) {
        java.lang.String str3;
        com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes();
        zzesVar.zza(zzetVar);
        int zzj = zzesVar.zzj(13) * 1000;
        zzesVar.zzh(3);
        int i = zzc[zzesVar.zzj(2)];
        zzesVar.zzh(10);
        int i2 = zze[zzesVar.zzj(3)];
        if (zzesVar.zzj(1) != 0) {
            i2++;
        }
        zzesVar.zzh(3);
        int zzj2 = zzesVar.zzj(4);
        zzesVar.zzh(1);
        if (zzj2 > 0) {
            zzesVar.zzh(6);
            if (zzesVar.zzj(1) != 0) {
                i2 += 2;
            }
            zzesVar.zzh(1);
        }
        if (zzesVar.zzc() > 7) {
            zzesVar.zzh(7);
            if (zzesVar.zzj(1) != 0) {
                str3 = "audio/eac3-joc";
                zzesVar.zzm();
                zzetVar.zzh(zzesVar.zze());
                com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                zztVar.zza(str);
                zztVar.zzo(str3);
                zztVar.zzG(i2);
                zztVar.zzH(i);
                zztVar.zzs(zzqVar);
                zztVar.zze(str2);
                zztVar.zzj(zzj);
                return zztVar.zzO();
            }
        }
        str3 = "audio/eac3";
        zzesVar.zzm();
        zzetVar.zzh(zzesVar.zze());
        com.google.android.gms.internal.ads.zzt zztVar2 = new com.google.android.gms.internal.ads.zzt();
        zztVar2.zza(str);
        zztVar2.zzo(str3);
        zztVar2.zzG(i2);
        zztVar2.zzH(i);
        zztVar2.zzs(zzqVar);
        zztVar2.zze(str2);
        zztVar2.zzj(zzj);
        return zztVar2.zzO();
    }

    public static com.google.android.gms.internal.ads.zzaex zzc(com.google.android.gms.internal.ads.zzes zzesVar) {
        java.lang.String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int zzd2 = zzesVar.zzd();
        zzesVar.zzh(40);
        int zzj = zzesVar.zzj(5);
        zzesVar.zzf(zzd2);
        int i12 = -1;
        if (zzj > 10) {
            zzesVar.zzh(16);
            int zzj2 = zzesVar.zzj(2);
            if (zzj2 == 0) {
                i12 = 0;
            } else if (zzj2 == 1) {
                i12 = 1;
            } else if (zzj2 == 2) {
                i12 = 2;
            }
            zzesVar.zzh(3);
            int zzj3 = zzesVar.zzj(11) + 1;
            int zzj4 = zzesVar.zzj(2);
            if (zzj4 == 3) {
                i8 = zzd[zzesVar.zzj(2)];
                i7 = 3;
                i9 = 6;
            } else {
                int zzj5 = zzesVar.zzj(2);
                int i13 = zzb[zzj5];
                i7 = zzj5;
                i8 = zzc[zzj4];
                i9 = i13;
            }
            int i14 = zzj3 + zzj3;
            int i15 = (i14 * i8) / (i9 * 32);
            int zzj6 = zzesVar.zzj(3);
            boolean zzi = zzesVar.zzi();
            int i16 = zze[zzj6] + (zzi ? 1 : 0);
            zzesVar.zzh(10);
            if (zzesVar.zzi()) {
                zzesVar.zzh(8);
            }
            if (zzj6 == 0) {
                zzesVar.zzh(5);
                if (zzesVar.zzi()) {
                    zzesVar.zzh(8);
                }
                i10 = 0;
                zzj6 = 0;
            } else {
                i10 = zzj6;
            }
            if (i12 == 1) {
                if (zzesVar.zzi()) {
                    zzesVar.zzh(16);
                }
                i11 = 1;
            } else {
                i11 = i12;
            }
            if (zzesVar.zzi()) {
                if (i10 > 2) {
                    zzesVar.zzh(2);
                }
                if ((i10 & 1) != 0 && i10 > 2) {
                    zzesVar.zzh(6);
                }
                if ((i10 & 4) != 0) {
                    zzesVar.zzh(6);
                }
                if (zzi && zzesVar.zzi()) {
                    zzesVar.zzh(5);
                }
                if (i11 == 0) {
                    if (zzesVar.zzi()) {
                        zzesVar.zzh(6);
                    }
                    if (i10 == 0 && zzesVar.zzi()) {
                        zzesVar.zzh(6);
                    }
                    if (zzesVar.zzi()) {
                        zzesVar.zzh(6);
                    }
                    int zzj7 = zzesVar.zzj(2);
                    if (zzj7 == 1) {
                        zzesVar.zzh(5);
                    } else if (zzj7 == 2) {
                        zzesVar.zzh(12);
                    } else if (zzj7 == 3) {
                        int zzj8 = zzesVar.zzj(5);
                        if (zzesVar.zzi()) {
                            zzesVar.zzh(5);
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(4);
                            }
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(4);
                            }
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(4);
                            }
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(4);
                            }
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(4);
                            }
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(4);
                            }
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(4);
                            }
                            if (zzesVar.zzi()) {
                                if (zzesVar.zzi()) {
                                    zzesVar.zzh(4);
                                }
                                if (zzesVar.zzi()) {
                                    zzesVar.zzh(4);
                                }
                            }
                        }
                        if (zzesVar.zzi()) {
                            zzesVar.zzh(5);
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(7);
                                if (zzesVar.zzi()) {
                                    zzesVar.zzh(8);
                                }
                            }
                        }
                        zzesVar.zzh((zzj8 + 2) * 8);
                        zzesVar.zzm();
                    }
                    if (i10 < 2) {
                        if (zzesVar.zzi()) {
                            zzesVar.zzh(14);
                        }
                        if (zzj6 == 0 && zzesVar.zzi()) {
                            zzesVar.zzh(14);
                        }
                    }
                    if (zzesVar.zzi()) {
                        if (i7 == 0) {
                            zzesVar.zzh(5);
                            i11 = 0;
                            i7 = 0;
                        } else {
                            for (int i17 = 0; i17 < i9; i17++) {
                                if (zzesVar.zzi()) {
                                    zzesVar.zzh(5);
                                }
                            }
                        }
                    }
                    i11 = 0;
                }
            }
            if (zzesVar.zzi()) {
                zzesVar.zzh(5);
                if (i10 == 2) {
                    zzesVar.zzh(4);
                    i10 = 2;
                }
                if (i10 >= 6) {
                    zzesVar.zzh(2);
                }
                if (zzesVar.zzi()) {
                    zzesVar.zzh(8);
                }
                if (i10 == 0 && zzesVar.zzi()) {
                    zzesVar.zzh(8);
                }
                if (zzj4 < 3) {
                    zzesVar.zzg();
                }
            }
            if (i11 == 0 && i7 != 3) {
                zzesVar.zzg();
            }
            if (i11 == 2 && (i7 == 3 || zzesVar.zzi())) {
                zzesVar.zzh(6);
            }
            str = (zzesVar.zzi() && zzesVar.zzj(6) == 1 && zzesVar.zzj(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i2 = i14;
            i3 = i8;
            i6 = i9 * 256;
            i = i15;
            i4 = i16;
        } else {
            zzesVar.zzh(32);
            int zzj9 = zzesVar.zzj(2);
            java.lang.String str2 = zzj9 == 3 ? null : "audio/ac3";
            int zzj10 = zzesVar.zzj(6);
            int i18 = zzf[zzj10 / 2] * 1000;
            int zzf2 = zzf(zzj9, zzj10);
            zzesVar.zzh(8);
            int zzj11 = zzesVar.zzj(3);
            if ((zzj11 & 1) != 0 && zzj11 != 1) {
                zzesVar.zzh(2);
            }
            if ((zzj11 & 4) != 0) {
                zzesVar.zzh(2);
            }
            if (zzj11 == 2) {
                zzesVar.zzh(2);
            }
            str = str2;
            i = i18;
            i2 = zzf2;
            i3 = zzj9 < 3 ? zzc[zzj9] : -1;
            i4 = zze[zzj11] + (zzesVar.zzi() ? 1 : 0);
            i5 = -1;
            i6 = 1536;
        }
        return new com.google.android.gms.internal.ads.zzaex(str, i5, i4, i3, i2, i6, i, null);
    }

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b = bArr[4];
            return zzf((b & 192) >> 6, b & 63);
        }
        int i = bArr[2] & 7;
        int i2 = ((bArr[3] & 255) | (i << 8)) + 1;
        return i2 + i2;
    }

    public static int zze(java.nio.ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    private static int zzf(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
