package R1;

import A1.X;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f5928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5932h;

    public m(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z7, boolean z8) {
        str.getClass();
        this.f5925a = str;
        this.f5926b = str2;
        this.f5927c = str3;
        this.f5928d = codecCapabilities;
        this.f5931g = z4;
        this.f5929e = z7;
        this.f5930f = z8;
        this.f5932h = p151v2.i.j(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(p151v2.t.g(i7, widthAlignment) * widthAlignment, p151v2.t.g(i8, heightAlignment) * heightAlignment);
        int i9 = point.x;
        int i10 = point.y;
        return (d7 == -1.0d || d7 < 1.0d) ? videoCapabilities.isSizeSupported(i9, i10) : videoCapabilities.areSizeAndRateSupported(i9, i10, Math.floor(d7));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public static m g(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z7, boolean z8, boolean z9) {
        boolean z10;
        int i7;
        if (codecCapabilities == null || (i7 = p151v2.t.f17159a) < 19 || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z10 = false;
        } else {
            if (i7 <= 22) {
                String str4 = p151v2.t.f17162d;
                if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        if (codecCapabilities != null && p151v2.t.f17159a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new m(str, str2, str3, codecCapabilities, z4, z10, z9 || (codecCapabilities != null && p151v2.t.f17159a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public final D1.i b(X x4, X x7) {
        int i7 = !p151v2.t.a(x4.f283C, x7.f283C) ? 8 : 0;
        if (this.f5932h) {
            if (x4.f291K != x7.f291K) {
                i7 |= 1024;
            }
            if (!this.f5929e && (x4.f288H != x7.f288H || x4.f289I != x7.f289I)) {
                i7 |= 512;
            }
            if (!p151v2.t.a(x4.f295O, x7.f295O)) {
                i7 |= 2048;
            }
            if (p151v2.t.f17162d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f5925a) && !x4.c(x7)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new D1.i(this.f5925a, x4, x7, x4.c(x7) ? 3 : 2, 0);
            }
        } else {
            if (x4.f296P != x7.f296P) {
                i7 |= 4096;
            }
            if (x4.f297Q != x7.f297Q) {
                i7 |= 8192;
            }
            if (x4.f298R != x7.f298R) {
                i7 |= 16384;
            }
            String str = this.f5926b;
            if (i7 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairD = w.d(x4);
                Pair pairD2 = w.d(x7);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new D1.i(this.f5925a, x4, x7, 3, 0);
                    }
                }
            }
            if (!x4.c(x7)) {
                i7 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new D1.i(this.f5925a, x4, x7, 1, 0);
            }
        }
        return new D1.i(this.f5925a, x4, x7, 0, i7);
    }

    public final boolean c(X x4) {
        int i7;
        Pair pairD;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        String str = x4.f283C;
        String str2 = this.f5926b;
        if (!str2.equals(str) && !str2.equals(w.b(x4))) {
            return false;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5928d;
        int i8 = 16;
        boolean z4 = this.f5932h;
        String str3 = x4.f312z;
        if (str3 != null && (pairD = w.d(x4)) != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            int iIntValue2 = ((Integer) pairD.second).intValue();
            int i9 = 2;
            if ("video/dolby-vision".equals(x4.f283C)) {
                if ("video/avc".equals(str2)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(str2)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (z4 || iIntValue == 42) {
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (p151v2.t.f17159a <= 23 && "video/x-vnd.on2.vp9".equals(str2) && codecProfileLevelArr.length == 0) {
                    int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i9 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i9 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i9 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i9 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i9 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i9 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i9 = 16;
                    } else if (iIntValue3 >= 3600000) {
                        i9 = 8;
                    } else if (iIntValue3 >= 1800000) {
                        i9 = 4;
                    } else if (iIntValue3 < 800000) {
                        i9 = 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i9;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                int length = codecProfileLevelArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        StringBuilder sbK = p031e1.k.k("codec.profileLevel, ", str3, ", ");
                        sbK.append(this.f5927c);
                        f(sbK.toString());
                        return false;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = codecProfileLevelArr[i10];
                    if (codecProfileLevel2.profile == iIntValue && codecProfileLevel2.level >= iIntValue2) {
                        break;
                    }
                    i10++;
                }
            }
        }
        if (z4) {
            int i11 = x4.f288H;
            if (i11 <= 0 || (i7 = x4.f289I) <= 0) {
                return true;
            }
            if (p151v2.t.f17159a >= 21) {
                return e(i11, i7, x4.f290J);
            }
            boolean z7 = i11 * i7 <= w.i();
            if (!z7) {
                f("legacyFrameSize, " + i11 + "x" + i7);
            }
            return z7;
        }
        int i12 = p151v2.t.f17159a;
        if (i12 >= 21) {
            int i13 = x4.f297Q;
            if (i13 != -1) {
                if (codecCapabilities == null) {
                    f("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    f("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i13)) {
                    f("sampleRate.support, " + i13);
                    return false;
                }
            }
            int i14 = x4.f296P;
            if (i14 != -1) {
                if (codecCapabilities == null) {
                    f("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    f("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i12 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i8 = 6;
                    } else if (!"audio/eac3".equals(str2)) {
                        i8 = 30;
                    }
                    Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f5925a + ", [" + maxInputChannelCount + " to " + i8 + "]");
                    maxInputChannelCount = i8;
                }
                if (maxInputChannelCount < i14) {
                    f("channelCount.support, " + i14);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean d(X x4) {
        if (this.f5932h) {
            return this.f5929e;
        }
        Pair pairD = w.d(x4);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    public final boolean e(int i7, int i8, double d7) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5928d;
        if (codecCapabilities == null) {
            f("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            f("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i7, i8, d7)) {
            return true;
        }
        if (i7 < i8) {
            String str = this.f5925a;
            if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(p151v2.t.f17160b)) && a(videoCapabilities, i8, i7, d7)) {
                StringBuilder sbG = p150v0.a.g("sizeAndRate.rotated, ", i7, "x", i8, "x");
                sbG.append(d7);
                StringBuilder sbL = p031e1.k.l("AssumedSupport [", sbG.toString(), "] [", str, ", ");
                sbL.append(this.f5926b);
                sbL.append("] [");
                sbL.append(p151v2.t.f17163e);
                sbL.append("]");
                Log.d("MediaCodecInfo", sbL.toString());
                return true;
            }
        }
        StringBuilder sbG2 = p150v0.a.g("sizeAndRate.support, ", i7, "x", i8, "x");
        sbG2.append(d7);
        f(sbG2.toString());
        return false;
    }

    public final void f(String str) {
        StringBuilder sbK = p031e1.k.k("NoSupport [", str, "] [");
        sbK.append(this.f5925a);
        sbK.append(", ");
        sbK.append(this.f5926b);
        sbK.append("] [");
        sbK.append(p151v2.t.f17163e);
        sbK.append("]");
        Log.d("MediaCodecInfo", sbK.toString());
    }

    public final String toString() {
        return this.f5925a;
    }
}
