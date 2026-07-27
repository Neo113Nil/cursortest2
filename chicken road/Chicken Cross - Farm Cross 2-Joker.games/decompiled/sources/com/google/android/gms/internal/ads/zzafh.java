package com.google.android.gms.internal.ads;

import androidx.media3.extractor.ts.TsExtractor;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzafh {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 174, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzv zza(zzeu zzeuVar, String str, String str2, zzq zzqVar) {
        zzet zzetVar = new zzet();
        zzetVar.zza(zzeuVar);
        int i = zzc[zzetVar.zzj(2)];
        zzetVar.zzh(8);
        int i2 = zze[zzetVar.zzj(3)];
        if (zzetVar.zzj(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzetVar.zzj(5)] * 1000;
        zzetVar.zzm();
        zzeuVar.zzh(zzetVar.zze());
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzo("audio/ac3");
        zztVar.zzH(i2);
        zztVar.zzJ(i);
        zztVar.zzs(zzqVar);
        zztVar.zze(str2);
        zztVar.zzi(i3);
        zztVar.zzj(i3);
        return zztVar.zzQ();
    }

    public static zzv zzb(zzeu zzeuVar, String str, String str2, zzq zzqVar) {
        String str3;
        zzet zzetVar = new zzet();
        zzetVar.zza(zzeuVar);
        int zzj = zzetVar.zzj(13) * 1000;
        zzetVar.zzh(3);
        int i = zzc[zzetVar.zzj(2)];
        zzetVar.zzh(10);
        int i2 = zze[zzetVar.zzj(3)];
        if (zzetVar.zzj(1) != 0) {
            i2++;
        }
        zzetVar.zzh(3);
        int zzj2 = zzetVar.zzj(4);
        zzetVar.zzh(1);
        if (zzj2 > 0) {
            zzetVar.zzh(6);
            if (zzetVar.zzj(1) != 0) {
                i2 += 2;
            }
            zzetVar.zzh(1);
        }
        if (zzetVar.zzc() > 7) {
            zzetVar.zzh(7);
            if (zzetVar.zzj(1) != 0) {
                str3 = "audio/eac3-joc";
                zzetVar.zzm();
                zzeuVar.zzh(zzetVar.zze());
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzo(str3);
                zztVar.zzH(i2);
                zztVar.zzJ(i);
                zztVar.zzs(zzqVar);
                zztVar.zze(str2);
                zztVar.zzj(zzj);
                return zztVar.zzQ();
            }
        }
        str3 = "audio/eac3";
        zzetVar.zzm();
        zzeuVar.zzh(zzetVar.zze());
        zzt zztVar2 = new zzt();
        zztVar2.zza(str);
        zztVar2.zzo(str3);
        zztVar2.zzH(i2);
        zztVar2.zzJ(i);
        zztVar2.zzs(zzqVar);
        zztVar2.zze(str2);
        zztVar2.zzj(zzj);
        return zztVar2.zzQ();
    }

    public static zzafg zzc(zzet zzetVar) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int zzd2 = zzetVar.zzd();
        zzetVar.zzh(40);
        int zzj = zzetVar.zzj(5);
        zzetVar.zzf(zzd2);
        int i12 = -1;
        if (zzj > 10) {
            zzetVar.zzh(16);
            int zzj2 = zzetVar.zzj(2);
            if (zzj2 == 0) {
                i12 = 0;
            } else if (zzj2 == 1) {
                i12 = 1;
            } else if (zzj2 == 2) {
                i12 = 2;
            }
            zzetVar.zzh(3);
            int zzj3 = zzetVar.zzj(11) + 1;
            int zzj4 = zzetVar.zzj(2);
            if (zzj4 == 3) {
                i8 = zzd[zzetVar.zzj(2)];
                i9 = 6;
                i7 = 3;
            } else {
                int zzj5 = zzetVar.zzj(2);
                int i13 = zzb[zzj5];
                i7 = zzj5;
                i8 = zzc[zzj4];
                i9 = i13;
            }
            int i14 = zzj3 + zzj3;
            int i15 = (i14 * i8) / (i9 * 32);
            int zzj6 = zzetVar.zzj(3);
            boolean zzi = zzetVar.zzi();
            i = zze[zzj6] + (zzi ? 1 : 0);
            zzetVar.zzh(10);
            if (zzetVar.zzi()) {
                zzetVar.zzh(8);
            }
            if (zzj6 == 0) {
                zzetVar.zzh(5);
                if (zzetVar.zzi()) {
                    zzetVar.zzh(8);
                }
                i10 = 0;
                zzj6 = 0;
            } else {
                i10 = zzj6;
            }
            if (i12 == 1) {
                if (zzetVar.zzi()) {
                    zzetVar.zzh(16);
                }
                i11 = 1;
            } else {
                i11 = i12;
            }
            if (zzetVar.zzi()) {
                if (i10 > 2) {
                    zzetVar.zzh(2);
                }
                if ((i10 & 1) != 0 && i10 > 2) {
                    zzetVar.zzh(6);
                }
                if ((i10 & 4) != 0) {
                    zzetVar.zzh(6);
                }
                if (zzi && zzetVar.zzi()) {
                    zzetVar.zzh(5);
                }
                if (i11 == 0) {
                    if (zzetVar.zzi()) {
                        zzetVar.zzh(6);
                    }
                    if (i10 == 0 && zzetVar.zzi()) {
                        zzetVar.zzh(6);
                    }
                    if (zzetVar.zzi()) {
                        zzetVar.zzh(6);
                    }
                    int zzj7 = zzetVar.zzj(2);
                    if (zzj7 == 1) {
                        zzetVar.zzh(5);
                    } else if (zzj7 == 2) {
                        zzetVar.zzh(12);
                    } else if (zzj7 == 3) {
                        int zzj8 = zzetVar.zzj(5);
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(5);
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(4);
                            }
                            if (zzetVar.zzi()) {
                                if (zzetVar.zzi()) {
                                    zzetVar.zzh(4);
                                }
                                if (zzetVar.zzi()) {
                                    zzetVar.zzh(4);
                                }
                            }
                        }
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(5);
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(7);
                                if (zzetVar.zzi()) {
                                    zzetVar.zzh(8);
                                }
                            }
                        }
                        zzetVar.zzh((zzj8 + 2) * 8);
                        zzetVar.zzm();
                    }
                    if (i10 < 2) {
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(14);
                        }
                        if (zzj6 == 0 && zzetVar.zzi()) {
                            zzetVar.zzh(14);
                        }
                    }
                    if (zzetVar.zzi()) {
                        if (i7 == 0) {
                            zzetVar.zzh(5);
                            i11 = 0;
                            i7 = 0;
                        } else {
                            for (int i16 = 0; i16 < i9; i16++) {
                                if (zzetVar.zzi()) {
                                    zzetVar.zzh(5);
                                }
                            }
                        }
                    }
                    i11 = 0;
                }
            }
            if (zzetVar.zzi()) {
                zzetVar.zzh(5);
                if (i10 == 2) {
                    zzetVar.zzh(4);
                    i10 = 2;
                }
                if (i10 >= 6) {
                    zzetVar.zzh(2);
                }
                if (zzetVar.zzi()) {
                    zzetVar.zzh(8);
                }
                if (i10 == 0 && zzetVar.zzi()) {
                    zzetVar.zzh(8);
                }
                if (zzj4 < 3) {
                    zzetVar.zzg();
                }
            }
            if (i11 == 0 && i7 != 3) {
                zzetVar.zzg();
            }
            if (i11 == 2 && (i7 == 3 || zzetVar.zzi())) {
                zzetVar.zzh(6);
            }
            str = (zzetVar.zzi() && zzetVar.zzj(6) == 1 && zzetVar.zzj(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i12;
            i4 = i14;
            i5 = i8;
            i6 = i9 * 256;
            i3 = i15;
        } else {
            zzetVar.zzh(32);
            int zzj9 = zzetVar.zzj(2);
            String str2 = zzj9 == 3 ? null : "audio/ac3";
            int zzj10 = zzetVar.zzj(6);
            int i17 = zzf[zzj10 / 2] * 1000;
            int zzf2 = zzf(zzj9, zzj10);
            zzetVar.zzh(8);
            int zzj11 = zzetVar.zzj(3);
            if ((zzj11 & 1) != 0 && zzj11 != 1) {
                zzetVar.zzh(2);
            }
            if ((zzj11 & 4) != 0) {
                zzetVar.zzh(2);
            }
            if (zzj11 == 2) {
                zzetVar.zzh(2);
            }
            int i18 = zzj9 < 3 ? zzc[zzj9] : -1;
            i = zze[zzj11] + (zzetVar.zzi() ? 1 : 0);
            i2 = -1;
            str = str2;
            i3 = i17;
            i4 = zzf2;
            i5 = i18;
            i6 = 1536;
        }
        return new zzafg(str, i2, i, i5, i4, i6, i3, null);
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

    public static int zze(ByteBuffer byteBuffer) {
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
