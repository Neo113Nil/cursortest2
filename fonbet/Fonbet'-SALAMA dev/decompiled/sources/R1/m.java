package R1;

import A1.X;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f5925a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5926b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5927c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f5928d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5929e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5930f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5931g;

    /* renamed from: h, reason: collision with root package name */
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
        this.f5932h = v2.i.j(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d7) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(v2.t.g(i7, widthAlignment) * widthAlignment, v2.t.g(i8, heightAlignment) * heightAlignment);
        int i9 = point.x;
        int i10 = point.y;
        return (d7 == -1.0d || d7 < 1.0d) ? videoCapabilities.isSizeSupported(i9, i10) : videoCapabilities.areSizeAndRateSupported(i9, i10, Math.floor(d7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if ("Nexus 10".equals(r1) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r8) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m g(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z7, boolean z8, boolean z9) {
        boolean z10;
        int i7;
        if (codecCapabilities != null && (i7 = v2.t.f17153a) >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (i7 <= 22) {
                String str4 = v2.t.f17156d;
                if (!"ODROID-XU3".equals(str4)) {
                }
                if (!"OMX.Exynos.AVC.Decoder".equals(str)) {
                }
            }
            z10 = true;
            if (codecCapabilities != null && v2.t.f17153a >= 21) {
                codecCapabilities.isFeatureSupported("tunneled-playback");
            }
            return new m(str, str2, str3, codecCapabilities, z4, z10, !z9 || (codecCapabilities != null && v2.t.f17153a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
        }
        z10 = false;
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new m(str, str2, str3, codecCapabilities, z4, z10, !z9 || (codecCapabilities != null && v2.t.f17153a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public final D1.i b(X x4, X x7) {
        int i7 = !v2.t.a(x4.f283C, x7.f283C) ? 8 : 0;
        if (this.f5932h) {
            if (x4.f291K != x7.f291K) {
                i7 |= 1024;
            }
            if (!this.f5929e && (x4.f288H != x7.f288H || x4.f289I != x7.f289I)) {
                i7 |= 512;
            }
            if (!v2.t.a(x4.f295O, x7.f295O)) {
                i7 |= 2048;
            }
            if (v2.t.f17156d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f5925a) && !x4.c(x7)) {
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
                Pair d7 = w.d(x4);
                Pair d8 = w.d(x7);
                if (d7 != null && d8 != null) {
                    int intValue = ((Integer) d7.first).intValue();
                    int intValue2 = ((Integer) d8.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
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
        Pair d7;
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
        if (str3 != null && (d7 = w.d(x4)) != null) {
            int intValue = ((Integer) d7.first).intValue();
            int intValue2 = ((Integer) d7.second).intValue();
            int i9 = 2;
            if ("video/dolby-vision".equals(x4.f283C)) {
                if ("video/avc".equals(str2)) {
                    intValue2 = 0;
                    intValue = 8;
                } else if ("video/hevc".equals(str2)) {
                    intValue2 = 0;
                    intValue = 2;
                }
            }
            if (z4 || intValue == 42) {
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (v2.t.f17153a <= 23 && "video/x-vnd.on2.vp9".equals(str2) && codecProfileLevelArr.length == 0) {
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
                    } else if (intValue3 >= 3600000) {
                        i9 = 8;
                    } else if (intValue3 >= 1800000) {
                        i9 = 4;
                    } else if (intValue3 < 800000) {
                        i9 = 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i9;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile != intValue || codecProfileLevel2.level < intValue2) {
                    }
                }
                StringBuilder k7 = e1.k.k("codec.profileLevel, ", str3, ", ");
                k7.append(this.f5927c);
                f(k7.toString());
                return false;
            }
        }
        if (z4) {
            int i10 = x4.f288H;
            if (i10 <= 0 || (i7 = x4.f289I) <= 0) {
                return true;
            }
            if (v2.t.f17153a >= 21) {
                return e(i10, i7, x4.f290J);
            }
            boolean z7 = i10 * i7 <= w.i();
            if (!z7) {
                f("legacyFrameSize, " + i10 + "x" + i7);
            }
            return z7;
        }
        int i11 = v2.t.f17153a;
        if (i11 >= 21) {
            int i12 = x4.f297Q;
            if (i12 != -1) {
                if (codecCapabilities == null) {
                    f("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    f("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i12)) {
                    f("sampleRate.support, " + i12);
                    return false;
                }
            }
            int i13 = x4.f296P;
            if (i13 != -1) {
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
                if (maxInputChannelCount <= 1 && ((i11 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i8 = 6;
                    } else if (!"audio/eac3".equals(str2)) {
                        i8 = 30;
                    }
                    Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f5925a + ", [" + maxInputChannelCount + " to " + i8 + "]");
                    maxInputChannelCount = i8;
                }
                if (maxInputChannelCount < i13) {
                    f("channelCount.support, " + i13);
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
        Pair d7 = w.d(x4);
        return d7 != null && ((Integer) d7.first).intValue() == 42;
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
            if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(v2.t.f17154b)) && a(videoCapabilities, i8, i7, d7)) {
                StringBuilder g3 = AbstractC1663a.g("sizeAndRate.rotated, ", i7, "x", i8, "x");
                g3.append(d7);
                StringBuilder l7 = e1.k.l("AssumedSupport [", g3.toString(), "] [", str, ", ");
                l7.append(this.f5926b);
                l7.append("] [");
                l7.append(v2.t.f17157e);
                l7.append("]");
                Log.d("MediaCodecInfo", l7.toString());
                return true;
            }
        }
        StringBuilder g7 = AbstractC1663a.g("sizeAndRate.support, ", i7, "x", i8, "x");
        g7.append(d7);
        f(g7.toString());
        return false;
    }

    public final void f(String str) {
        StringBuilder k7 = e1.k.k("NoSupport [", str, "] [");
        k7.append(this.f5925a);
        k7.append(", ");
        k7.append(this.f5926b);
        k7.append("] [");
        k7.append(v2.t.f17157e);
        k7.append("]");
        Log.d("MediaCodecInfo", k7.toString());
    }

    public final String toString() {
        return this.f5925a;
    }
}
