package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.Objects;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzsr {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;

    public zzsr(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z4;
        this.zze = z9;
        this.zzf = z11;
        this.zzh = z12;
        this.zzi = zzay.zzj(str2);
    }

    public static zzsr zzc(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z7, boolean z8, boolean z9, boolean z10) {
        boolean z11;
        if (codecCapabilities == null || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z11 = false;
        } else {
            int i7 = zzen.zza;
            z11 = true;
        }
        return new zzsr(str, str2, str3, codecCapabilities, z4, z7, z8, z11, codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback"), z10 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback")), zzen.zza >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface"));
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i9 = zzen.zza;
        return new Point((((i7 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i8 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        String str2 = zzen.zzb;
        StringBuilder sbK = k.k("NoSupport [", str, "] [");
        sbK.append(this.zza);
        sbK.append(", ");
        sbK.append(this.zzb);
        sbK.append("] [");
        sbK.append(str2);
        sbK.append("]");
        zzdq.zzb("MediaCodecInfo", sbK.toString());
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        Point pointZzi = zzi(videoCapabilities, i7, i8);
        int i9 = pointZzi.x;
        int i10 = pointZzi.y;
        return (d7 == -1.0d || d7 < 1.0d) ? videoCapabilities.isSizeSupported(i9, i10) : videoCapabilities.areSizeAndRateSupported(i9, i10, Math.floor(d7));
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0164 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac A[PHI: r1
      0x00ac: PHI (r1v5 int) = (r1v4 int), (r1v7 int) binds: [B:42:0x00a5, B:45:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:72:0x0102  */
    /* JADX WARN: Code duplicated, block: B:73:0x0105  */
    /* JADX WARN: Code duplicated, block: B:75:0x010a  */
    /* JADX WARN: Code duplicated, block: B:76:0x010d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0112  */
    /* JADX WARN: Code duplicated, block: B:79:0x0115  */
    /* JADX WARN: Code duplicated, block: B:82:0x011b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0120  */
    /* JADX WARN: Code duplicated, block: B:85:0x0122  */
    /* JADX WARN: Code duplicated, block: B:87:0x0127  */
    /* JADX WARN: Code duplicated, block: B:88:0x0129  */
    /* JADX WARN: Code duplicated, block: B:92:0x013c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0142  */
    private final boolean zzl(zzz zzzVar, boolean z4) {
        int iIntValue;
        int iIntValue2;
        int i7;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzh;
        int length;
        int i8;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        int iIntValue3;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        String str;
        int iHashCode;
        int i9 = zztl.zza;
        Pair pairZza = zzda.zza(zzzVar);
        String str2 = zzzVar.zzo;
        byte b7 = -1;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strZze = zzay.zze(this.zzc);
            if (!strZze.equals("video/mv-hevc")) {
                if (strZze.equals("video/hevc")) {
                    String strZzh = zzfj.zzh(zzzVar.zzr);
                    if (strZzh == null) {
                        pairZza = null;
                    } else {
                        String strTrim = strZzh.trim();
                        int i10 = zzen.zza;
                        pairZza = zzda.zzb(strZzh, strTrim.split("\\.", -1), zzzVar.zzC);
                    }
                }
                if (pairZza != null) {
                    iIntValue = ((Integer) pairZza.first).intValue();
                    iIntValue2 = ((Integer) pairZza.second).intValue();
                    i7 = 8;
                    if ("video/dolby-vision".equals(zzzVar.zzo)) {
                        str = this.zzb;
                        iHashCode = str.hashCode();
                        if (iHashCode != -1662735862) {
                            if (iHashCode != -1662541442) {
                                if (iHashCode == 1331836730) {
                                    b7 = 0;
                                }
                            } else if (str.equals("video/hevc")) {
                                b7 = 1;
                            }
                        } else if (str.equals("video/av01")) {
                            b7 = 2;
                        }
                        if (b7 == 0) {
                            if (b7 != 1) {
                            }
                            iIntValue = 2;
                        } else {
                            iIntValue = 8;
                        }
                        iIntValue2 = 0;
                    }
                    if (this.zzi) {
                        codecProfileLevelArrZzh = zzh();
                        if (zzen.zza <= 23) {
                            codecCapabilities = this.zzd;
                            if (codecCapabilities != null) {
                                iIntValue3 = 0;
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 >= 180000000) {
                                i7 = 1024;
                            } else if (iIntValue3 >= 120000000) {
                                i7 = 512;
                            } else if (iIntValue3 >= 60000000) {
                                i7 = 256;
                            } else if (iIntValue3 >= 30000000) {
                                i7 = 128;
                            } else if (iIntValue3 >= 18000000) {
                                i7 = 64;
                            } else if (iIntValue3 >= 12000000) {
                                i7 = 32;
                            } else if (iIntValue3 >= 7200000) {
                                i7 = 16;
                            } else if (iIntValue3 < 3600000) {
                                if (iIntValue3 >= 1800000) {
                                    i7 = 4;
                                } else if (iIntValue3 >= 800000) {
                                    i7 = 2;
                                } else {
                                    i7 = 1;
                                }
                            }
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = new MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel2.profile = 1;
                            codecProfileLevel2.level = i7;
                            codecProfileLevelArrZzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel2};
                        }
                        length = codecProfileLevelArrZzh.length;
                        for (i8 = 0; i8 < length; i8++) {
                            codecProfileLevel = codecProfileLevelArrZzh[i8];
                            if (codecProfileLevel.profile != iIntValue) {
                            }
                        }
                        zzj(p150v0.a.f("codec.profileLevel, ", zzzVar.zzk, ", ", this.zzc));
                        return false;
                    }
                    if (iIntValue == 42) {
                        iIntValue = 42;
                        codecProfileLevelArrZzh = zzh();
                        if (zzen.zza <= 23) {
                            codecCapabilities = this.zzd;
                            if (codecCapabilities != null) {
                                iIntValue3 = 0;
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 >= 180000000) {
                                i7 = 1024;
                            } else if (iIntValue3 >= 120000000) {
                                i7 = 512;
                            } else if (iIntValue3 >= 60000000) {
                                i7 = 256;
                            } else if (iIntValue3 >= 30000000) {
                                i7 = 128;
                            } else if (iIntValue3 >= 18000000) {
                                i7 = 64;
                            } else if (iIntValue3 >= 12000000) {
                                i7 = 32;
                            } else if (iIntValue3 >= 7200000) {
                                i7 = 16;
                            } else if (iIntValue3 < 3600000) {
                                if (iIntValue3 >= 1800000) {
                                    i7 = 4;
                                } else if (iIntValue3 >= 800000) {
                                    i7 = 2;
                                } else {
                                    i7 = 1;
                                }
                            }
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = new MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel3.profile = 1;
                            codecProfileLevel3.level = i7;
                            codecProfileLevelArrZzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel3};
                        }
                        length = codecProfileLevelArrZzh.length;
                        while (i8 < length) {
                            codecProfileLevel = codecProfileLevelArrZzh[i8];
                            if (codecProfileLevel.profile != iIntValue) {
                            }
                        }
                        zzj(p150v0.a.f("codec.profileLevel, ", zzzVar.zzk, ", ", this.zzc));
                        return false;
                    }
                }
            }
        } else if (pairZza != null) {
            iIntValue = ((Integer) pairZza.first).intValue();
            iIntValue2 = ((Integer) pairZza.second).intValue();
            i7 = 8;
            if ("video/dolby-vision".equals(zzzVar.zzo)) {
                str = this.zzb;
                iHashCode = str.hashCode();
                if (iHashCode != -1662735862) {
                    if (iHashCode != -1662541442) {
                        if (iHashCode == 1331836730 && str.equals("video/avc")) {
                            b7 = 0;
                        }
                    } else if (str.equals("video/hevc")) {
                        b7 = 1;
                    }
                } else if (str.equals("video/av01")) {
                    b7 = 2;
                }
                if (b7 == 0) {
                    iIntValue = 8;
                } else if (b7 != 1 || b7 == 2) {
                    iIntValue = 2;
                }
                iIntValue2 = 0;
            }
            if (this.zzi) {
                codecProfileLevelArrZzh = zzh();
                if (zzen.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && codecProfileLevelArrZzh.length == 0) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        iIntValue3 = 0;
                    } else {
                        iIntValue3 = ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    }
                    if (iIntValue3 >= 180000000) {
                        i7 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i7 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i7 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i7 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i7 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i7 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i7 = 16;
                    } else if (iIntValue3 < 3600000) {
                        if (iIntValue3 >= 1800000) {
                            i7 = 4;
                        } else if (iIntValue3 >= 800000) {
                            i7 = 2;
                        } else {
                            i7 = 1;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel4 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel4.profile = 1;
                    codecProfileLevel4.level = i7;
                    codecProfileLevelArrZzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel4};
                }
                length = codecProfileLevelArrZzh.length;
                while (i8 < length) {
                    codecProfileLevel = codecProfileLevelArrZzh[i8];
                    if (codecProfileLevel.profile != iIntValue && (codecProfileLevel.level >= iIntValue2 || !z4)) {
                        if ("video/hevc".equals(this.zzb) && iIntValue == 2) {
                            String str3 = Build.DEVICE;
                            if ("sailfish".equals(str3) || "marlin".equals(str3)) {
                            }
                        }
                    }
                }
                zzj(p150v0.a.f("codec.profileLevel, ", zzzVar.zzk, ", ", this.zzc));
                return false;
            }
            if (iIntValue == 42) {
                iIntValue = 42;
                codecProfileLevelArrZzh = zzh();
                if (zzen.zza <= 23) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null) {
                        iIntValue3 = 0;
                    } else {
                        iIntValue3 = 0;
                    }
                    if (iIntValue3 >= 180000000) {
                        i7 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i7 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i7 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i7 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i7 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i7 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i7 = 16;
                    } else if (iIntValue3 < 3600000) {
                        if (iIntValue3 >= 1800000) {
                            i7 = 4;
                        } else if (iIntValue3 >= 800000) {
                            i7 = 2;
                        } else {
                            i7 = 1;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel5 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel5.profile = 1;
                    codecProfileLevel5.level = i7;
                    codecProfileLevelArrZzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel5};
                }
                length = codecProfileLevelArrZzh.length;
                while (i8 < length) {
                    codecProfileLevel = codecProfileLevelArrZzh[i8];
                    if (codecProfileLevel.profile != iIntValue) {
                    }
                }
                zzj(p150v0.a.f("codec.profileLevel, ", zzzVar.zzk, ", ", this.zzc));
                return false;
            }
        }
        return true;
    }

    private final boolean zzm(zzz zzzVar) {
        return this.zzb.equals(zzzVar.zzo) || this.zzb.equals(zztl.zzb(zzzVar));
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i7, int i8) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i7, i8);
    }

    public final zzhr zzb(zzz zzzVar, zzz zzzVar2) {
        String str = zzzVar2.zzo;
        int i7 = zzen.zza;
        int i8 = true != Objects.equals(zzzVar.zzo, str) ? 8 : 0;
        if (this.zzi) {
            if (zzzVar.zzy != zzzVar2.zzy) {
                i8 |= 1024;
            }
            if (!this.zze && (zzzVar.zzv != zzzVar2.zzv || zzzVar.zzw != zzzVar2.zzw)) {
                i8 |= 512;
            }
            if ((!zzk.zzg(zzzVar.zzC) || !zzk.zzg(zzzVar2.zzC)) && !Objects.equals(zzzVar.zzC, zzzVar2.zzC)) {
                i8 |= 2048;
            }
            String str2 = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str2) && !zzzVar.zzd(zzzVar2)) {
                i8 |= 2;
            }
            if (i8 == 0) {
                return new zzhr(this.zza, zzzVar, zzzVar2, true == zzzVar.zzd(zzzVar2) ? 3 : 2, 0);
            }
        } else {
            if (zzzVar.zzE != zzzVar2.zzE) {
                i8 |= 4096;
            }
            if (zzzVar.zzF != zzzVar2.zzF) {
                i8 |= 8192;
            }
            if (zzzVar.zzG != zzzVar2.zzG) {
                i8 |= 16384;
            }
            if (i8 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                int i9 = zztl.zza;
                Pair pairZza = zzda.zza(zzzVar);
                Pair pairZza2 = zzda.zza(zzzVar2);
                if (pairZza != null && pairZza2 != null) {
                    int iIntValue = ((Integer) pairZza.first).intValue();
                    int iIntValue2 = ((Integer) pairZza2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zzhr(this.zza, zzzVar, zzzVar2, 3, 0);
                    }
                }
            }
            if (!zzzVar.zzd(zzzVar2)) {
                i8 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i8 |= 2;
            }
            if (i8 == 0) {
                return new zzhr(this.zza, zzzVar, zzzVar2, 1, 0);
            }
        }
        return new zzhr(this.zza, zzzVar, zzzVar2, 0, i8);
    }

    public final boolean zzd(zzz zzzVar) {
        return zzm(zzzVar) && zzl(zzzVar, false);
    }

    public final boolean zze(zzz zzzVar) {
        int i7;
        int i8;
        if (!zzm(zzzVar) || !zzl(zzzVar, true)) {
            return false;
        }
        if (this.zzi) {
            int i9 = zzzVar.zzv;
            if (i9 <= 0 || (i8 = zzzVar.zzw) <= 0) {
                return true;
            }
            return zzg(i9, i8, zzzVar.zzx);
        }
        int i10 = zzzVar.zzF;
        if (i10 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzj("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzj("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i10)) {
                zzj(k.d(i10, "sampleRate.support, "));
                return false;
            }
        }
        int i11 = zzzVar.zzE;
        if (i11 == -1) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
        if (codecCapabilities2 == null) {
            zzj("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
        if (audioCapabilities2 == null) {
            zzj("channelCount.aCaps");
            return false;
        }
        String str = this.zza;
        String str2 = this.zzb;
        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((zzen.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            if ("audio/ac3".equals(str2)) {
                i7 = 6;
            } else {
                i7 = "audio/eac3".equals(str2) ? 16 : 30;
            }
            zzdq.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i7 + "]");
            maxInputChannelCount = i7;
        }
        if (maxInputChannelCount >= i11) {
            return true;
        }
        zzj(k.d(i11, "channelCount.support, "));
        return false;
    }

    public final boolean zzf(zzz zzzVar) {
        if (this.zzi) {
            return this.zze;
        }
        int i7 = zztl.zza;
        Pair pairZza = zzda.zza(zzzVar);
        return pairZza != null && ((Integer) pairZza.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    public final boolean zzg(int i7, int i8, double d7) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (zzen.zza >= 29) {
            int iZza = zzst.zza(videoCapabilities, i7, i8, d7);
            if (iZza != 2) {
                if (iZza == 1) {
                    StringBuilder sbG = p150v0.a.g("sizeAndRate.cover, ", i7, "x", i8, "@");
                    sbG.append(d7);
                    zzj(sbG.toString());
                    return false;
                }
                if (!zzk(videoCapabilities, i7, i8, d7)) {
                    if (i7 < i8) {
                    }
                    StringBuilder sbG2 = p150v0.a.g("sizeAndRate.support, ", i7, "x", i8, "@");
                    sbG2.append(d7);
                    zzj(sbG2.toString());
                    return false;
                }
            }
        } else if (!zzk(videoCapabilities, i7, i8, d7)) {
            if (i7 < i8 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(Build.DEVICE)) || !zzk(videoCapabilities, i8, i7, d7))) {
                StringBuilder sbG3 = p150v0.a.g("sizeAndRate.support, ", i7, "x", i8, "@");
                sbG3.append(d7);
                zzj(sbG3.toString());
                return false;
            }
            StringBuilder sbG4 = p150v0.a.g("sizeAndRate.rotated, ", i7, "x", i8, "@");
            sbG4.append(d7);
            String string = sbG4.toString();
            String str = this.zza;
            String str2 = this.zzb;
            String str3 = zzen.zzb;
            StringBuilder sbL = k.l("AssumedSupport [", string, "] [", str, ", ");
            sbL.append(str2);
            sbL.append("] [");
            sbL.append(str3);
            sbL.append("]");
            zzdq.zzb("MediaCodecInfo", sbL.toString());
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
