package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import e1.k;
import java.util.Objects;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
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
        StringBuilder k7 = k.k("NoSupport [", str, "] [");
        k7.append(this.zza);
        k7.append(", ");
        k7.append(this.zzb);
        k7.append("] [");
        k7.append(str2);
        k7.append("]");
        zzdq.zzb("MediaCodecInfo", k7.toString());
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        Point zzi = zzi(videoCapabilities, i7, i8);
        int i9 = zzi.x;
        int i10 = zzi.y;
        return (d7 == -1.0d || d7 < 1.0d) ? videoCapabilities.isSizeSupported(i9, i10) : videoCapabilities.areSizeAndRateSupported(i9, i10, Math.floor(d7));
    }

    private final boolean zzl(zzz zzzVar, boolean z4) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i7 = zztl.zza;
        Pair zza = zzda.zza(zzzVar);
        String str = zzzVar.zzo;
        char c3 = 65535;
        if (str != null && str.equals("video/mv-hevc")) {
            String zze = zzay.zze(this.zzc);
            if (!zze.equals("video/mv-hevc")) {
                if (zze.equals("video/hevc")) {
                    String zzh = zzfj.zzh(zzzVar.zzr);
                    if (zzh == null) {
                        zza = null;
                    } else {
                        String trim = zzh.trim();
                        int i8 = zzen.zza;
                        zza = zzda.zzb(zzh, trim.split("\\.", -1), zzzVar.zzC);
                    }
                }
            }
            return true;
        }
        if (zza != null) {
            int intValue = ((Integer) zza.first).intValue();
            int intValue2 = ((Integer) zza.second).intValue();
            int i9 = 8;
            if ("video/dolby-vision".equals(zzzVar.zzo)) {
                String str2 = this.zzb;
                int hashCode = str2.hashCode();
                if (hashCode != -1662735862) {
                    if (hashCode != -1662541442) {
                        if (hashCode == 1331836730 && str2.equals("video/avc")) {
                            c3 = 0;
                        }
                    } else if (str2.equals("video/hevc")) {
                        c3 = 1;
                    }
                } else if (str2.equals("video/av01")) {
                    c3 = 2;
                }
                if (c3 == 0) {
                    intValue = 8;
                } else if (c3 == 1 || c3 == 2) {
                    intValue = 2;
                }
                intValue2 = 0;
            }
            if (!this.zzi) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] zzh2 = zzh();
            if (zzen.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzh2.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                if (intValue3 >= 180000000) {
                    i9 = 1024;
                } else if (intValue3 >= 120000000) {
                    i9 = 512;
                } else if (intValue3 >= 60000000) {
                    i9 = 256;
                } else if (intValue3 >= 30000000) {
                    i9 = 128;
                } else if (intValue3 >= 18000000) {
                    i9 = 64;
                } else if (intValue3 >= 12000000) {
                    i9 = 32;
                } else if (intValue3 >= 7200000) {
                    i9 = 16;
                } else if (intValue3 < 3600000) {
                    i9 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i9;
                zzh2 = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzh2) {
                if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z4)) {
                    if ("video/hevc".equals(this.zzb) && intValue == 2) {
                        String str3 = Build.DEVICE;
                        if (!"sailfish".equals(str3) && !"marlin".equals(str3)) {
                        }
                    }
                }
            }
            zzj(AbstractC1663a.f("codec.profileLevel, ", zzzVar.zzk, ", ", this.zzc));
            return false;
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
                Pair zza = zzda.zza(zzzVar);
                Pair zza2 = zzda.zza(zzzVar2);
                if (zza != null && zza2 != null) {
                    int intValue = ((Integer) zza.first).intValue();
                    int intValue2 = ((Integer) zza2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
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
        if (!zzm(zzzVar) || !zzl(zzzVar, true)) {
            return false;
        }
        if (this.zzi) {
            int i8 = zzzVar.zzv;
            if (i8 <= 0 || (i7 = zzzVar.zzw) <= 0) {
                return true;
            }
            return zzg(i8, i7, zzzVar.zzx);
        }
        int i9 = zzzVar.zzF;
        if (i9 != -1) {
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
            if (!audioCapabilities.isSampleRateSupported(i9)) {
                zzj(k.d(i9, "sampleRate.support, "));
                return false;
            }
        }
        int i10 = zzzVar.zzE;
        if (i10 == -1) {
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
            int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
            zzdq.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i11 + "]");
            maxInputChannelCount = i11;
        }
        if (maxInputChannelCount >= i10) {
            return true;
        }
        zzj(k.d(i10, "channelCount.support, "));
        return false;
    }

    public final boolean zzf(zzz zzzVar) {
        if (this.zzi) {
            return this.zze;
        }
        int i7 = zztl.zza;
        Pair zza = zzda.zza(zzzVar);
        return zza != null && ((Integer) zza.first).intValue() == 42;
    }

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
            int zza = zzst.zza(videoCapabilities, i7, i8, d7);
            if (zza != 2) {
                if (zza == 1) {
                    StringBuilder g3 = AbstractC1663a.g("sizeAndRate.cover, ", i7, "x", i8, "@");
                    g3.append(d7);
                    zzj(g3.toString());
                    return false;
                }
            }
            return true;
        }
        if (!zzk(videoCapabilities, i7, i8, d7)) {
            if (i7 >= i8 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(Build.DEVICE)) || !zzk(videoCapabilities, i8, i7, d7))) {
                StringBuilder g7 = AbstractC1663a.g("sizeAndRate.support, ", i7, "x", i8, "@");
                g7.append(d7);
                zzj(g7.toString());
                return false;
            }
            StringBuilder g8 = AbstractC1663a.g("sizeAndRate.rotated, ", i7, "x", i8, "@");
            g8.append(d7);
            String sb = g8.toString();
            String str = this.zza;
            String str2 = this.zzb;
            String str3 = zzen.zzb;
            StringBuilder l7 = k.l("AssumedSupport [", sb, "] [", str, ", ");
            l7.append(str2);
            l7.append("] [");
            l7.append(str3);
            l7.append("]");
            zzdq.zzb("MediaCodecInfo", l7.toString());
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
