package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class NF {

    /* renamed from: a, reason: collision with root package name */
    public final String f10788a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10789b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10790c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f10791d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10792e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10793g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10794h;
    public final boolean i;

    public NF(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z3, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.f10788a = str;
        this.f10789b = str2;
        this.f10790c = str3;
        this.f10791d = codecCapabilities;
        this.f10793g = z3;
        this.f10792e = z5;
        this.f = z6;
        this.f10794h = z7;
        this.i = AbstractC1593t6.g(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r9) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NF b(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z3, boolean z5) {
        boolean z6;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z7;
        boolean z8;
        String str6;
        if (codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (AbstractC1260lo.f14419a <= 22) {
                String str7 = AbstractC1260lo.f14422d;
                if (!"ODROID-XU3".equals(str7)) {
                }
                if (!"OMX.Exynos.AVC.Decoder".equals(str)) {
                }
            }
            z6 = true;
            if (codecCapabilities != null) {
                codecCapabilities.isFeatureSupported("tunneled-playback");
            }
            boolean z9 = !z5 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
            if (AbstractC1260lo.f14419a >= 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
                str4 = str;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z7 = z3;
                z8 = false;
                str6 = str2;
            } else {
                str6 = str2;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z7 = z3;
                z8 = true;
                str4 = str;
            }
            return new NF(str4, str6, str5, codecCapabilities2, z7, z6, z9, z8);
        }
        z6 = false;
        if (codecCapabilities != null) {
        }
        if (z5) {
        }
        if (AbstractC1260lo.f14419a >= 35) {
        }
        str4 = str;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z7 = z3;
        z8 = false;
        str6 = str2;
        return new NF(str4, str6, str5, codecCapabilities2, z7, z6, z9, z8);
    }

    public static Point f(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i5) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i6 = AbstractC1260lo.f14419a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i5 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public static boolean h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i5, double d5) {
        Point f = f(videoCapabilities, i, i5);
        int i6 = f.x;
        int i7 = f.y;
        return (d5 == -1.0d || d5 < 1.0d) ? videoCapabilities.isSizeSupported(i6, i7) : videoCapabilities.areSizeAndRateSupported(i6, i7, Math.floor(d5));
    }

    public final TD a(C1407p c1407p, C1407p c1407p2) {
        C1407p c1407p3;
        C1407p c1407p4;
        int i = true != Objects.equals(c1407p.f14904m, c1407p2.f14904m) ? 8 : 0;
        if (this.i) {
            if (c1407p.f14914w != c1407p2.f14914w) {
                i |= 1024;
            }
            if (!this.f10792e && (c1407p.f14911t != c1407p2.f14911t || c1407p.f14912u != c1407p2.f14912u)) {
                i |= 512;
            }
            C1242lE c1242lE = c1407p.f14885A;
            boolean e3 = C1242lE.e(c1242lE);
            C1242lE c1242lE2 = c1407p2.f14885A;
            if ((!e3 || !C1242lE.e(c1242lE2)) && !Objects.equals(c1242lE, c1242lE2)) {
                i |= 2048;
            }
            if (AbstractC1260lo.f14422d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f10788a) && !c1407p.b(c1407p2)) {
                i |= 2;
            }
            if (i == 0) {
                return new TD(this.f10788a, c1407p, c1407p2, true == c1407p.b(c1407p2) ? 3 : 2, 0);
            }
            c1407p3 = c1407p;
            c1407p4 = c1407p2;
        } else {
            c1407p3 = c1407p;
            c1407p4 = c1407p2;
            if (c1407p3.f14886B != c1407p4.f14886B) {
                i |= 4096;
            }
            if (c1407p3.f14887C != c1407p4.f14887C) {
                i |= 8192;
            }
            if (c1407p3.f14888D != c1407p4.f14888D) {
                i |= 16384;
            }
            String str = this.f10789b;
            if (i == 0 && "audio/mp4a-latm".equals(str)) {
                HashMap hashMap = YF.f12311a;
                Pair a5 = AbstractC1120ii.a(c1407p3);
                Pair a6 = AbstractC1120ii.a(c1407p4);
                if (a5 != null && a6 != null) {
                    int intValue = ((Integer) a5.first).intValue();
                    int intValue2 = ((Integer) a6.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new TD(this.f10788a, c1407p3, c1407p4, 3, 0);
                    }
                }
            }
            if (!c1407p3.b(c1407p4)) {
                i |= 32;
            }
            if ("audio/opus".equals(str)) {
                i |= 2;
            }
            if (i == 0) {
                return new TD(this.f10788a, c1407p3, c1407p4, 1, 0);
            }
        }
        return new TD(this.f10788a, c1407p3, c1407p4, 0, i);
    }

    public final boolean c(C1407p c1407p) {
        int i;
        String str = c1407p.f14904m;
        String str2 = this.f10789b;
        if (!(str2.equals(str) || str2.equals(YF.a(c1407p))) || !i(c1407p, true)) {
            return false;
        }
        if (this.i) {
            int i5 = c1407p.f14911t;
            if (i5 > 0 && (i = c1407p.f14912u) > 0) {
                return e(i5, i, c1407p.f14913v);
            }
        } else {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10791d;
            int i6 = c1407p.f14887C;
            if (i6 != -1) {
                if (codecCapabilities == null) {
                    g("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i6)) {
                    g("sampleRate.support, " + i6);
                    return false;
                }
            }
            int i7 = c1407p.f14886B;
            if (i7 != -1) {
                if (codecCapabilities == null) {
                    g("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    g("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((AbstractC1260lo.f14419a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i8 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    JB.l("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f10788a + ", [" + maxInputChannelCount + " to " + i8 + "]");
                    maxInputChannelCount = i8;
                }
                if (maxInputChannelCount < i7) {
                    g("channelCount.support, " + i7);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean d(C1407p c1407p) {
        if (this.i) {
            return this.f10792e;
        }
        HashMap hashMap = YF.f12311a;
        Pair a5 = AbstractC1120ii.a(c1407p);
        return a5 != null && ((Integer) a5.first).intValue() == 42;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        r4 = r1.getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (r2 == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(int i, int i5, double d5) {
        char c5;
        Boolean bool;
        List supportedPerformancePoints;
        boolean z3;
        boolean covers;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10791d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        int i6 = AbstractC1260lo.f14419a;
        if (i6 >= 29) {
            if (i6 >= 29 && (((bool = AbstractC1400ot.f14869k) == null || !bool.booleanValue()) && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty())) {
                MediaCodecInfo.VideoCapabilities.PerformancePoint j5 = OF.j(i, i5, (int) d5);
                int i7 = 0;
                while (true) {
                    if (i7 >= supportedPerformancePoints.size()) {
                        c5 = 1;
                        break;
                    }
                    covers = A0.P.c(supportedPerformancePoints.get(i7)).covers(j5);
                    if (covers) {
                        c5 = 2;
                        break;
                    }
                    i7++;
                }
                if (c5 == 1 && AbstractC1400ot.f14869k == null) {
                    if (i6 < 35) {
                        int A3 = AbstractC0952et.A(false);
                        int A5 = AbstractC0952et.A(true);
                        if (A3 == 0 || (A5 != 0 ? A3 != 2 || A5 != 2 : A3 != 2)) {
                            z3 = true;
                            AbstractC1400ot.f14869k = Boolean.valueOf(z3);
                        }
                    }
                    z3 = false;
                    AbstractC1400ot.f14869k = Boolean.valueOf(z3);
                }
                if (c5 != 2) {
                    if (c5 == 1) {
                        StringBuilder w5 = AbstractC2107A.w("sizeAndRate.cover, ", i, "x", i5, "@");
                        w5.append(d5);
                        g(w5.toString());
                        return false;
                    }
                }
                return true;
            }
            c5 = 0;
            if (c5 != 2) {
            }
            return true;
        }
        if (!h(videoCapabilities, i, i5, d5)) {
            if (i < i5) {
                String str = this.f10788a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(AbstractC1260lo.f14420b)) && h(videoCapabilities, i5, i, d5)) {
                    StringBuilder w6 = AbstractC2107A.w("sizeAndRate.rotated, ", i, "x", i5, "@");
                    w6.append(d5);
                    JB.d("MediaCodecInfo", "AssumedSupport [" + w6.toString() + "] [" + str + ", " + this.f10789b + "] [" + AbstractC1260lo.f14423e + "]");
                    return true;
                }
            }
            StringBuilder w7 = AbstractC2107A.w("sizeAndRate.support, ", i, "x", i5, "@");
            w7.append(d5);
            g(w7.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        String str2 = AbstractC1260lo.f14423e;
        StringBuilder w5 = AbstractC0467k.w("NoSupport [", str, "] [");
        w5.append(this.f10788a);
        w5.append(", ");
        w5.append(this.f10789b);
        w5.append("] [");
        w5.append(str2);
        w5.append("]");
        JB.d("MediaCodecInfo", w5.toString());
    }

    public final boolean i(C1407p c1407p, boolean z3) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        HashMap hashMap = YF.f12311a;
        Pair a5 = AbstractC1120ii.a(c1407p);
        String str = this.f10790c;
        String str2 = c1407p.f14904m;
        if (str2 != null && str2.equals("video/mv-hevc") && str.equals("video/hevc")) {
            String c02 = AbstractC1668us.c0(c1407p.f14907p);
            if (c02 == null) {
                a5 = null;
            } else {
                String trim = c02.trim();
                int i = AbstractC1260lo.f14419a;
                a5 = AbstractC1120ii.b(c02, trim.split("\\.", -1), c1407p.f14885A);
            }
        }
        if (a5 != null) {
            int intValue = ((Integer) a5.first).intValue();
            int intValue2 = ((Integer) a5.second).intValue();
            boolean equals = "video/dolby-vision".equals(str2);
            int i5 = 8;
            String str3 = this.f10789b;
            if (equals) {
                if ("video/avc".equals(str3)) {
                    intValue2 = 0;
                    intValue = 8;
                } else if ("video/hevc".equals(str3)) {
                    intValue2 = 0;
                    intValue = 2;
                }
            }
            if (!this.i) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10791d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            if (AbstractC1260lo.f14419a <= 23 && "video/x-vnd.on2.vp9".equals(str3) && codecProfileLevelArr.length == 0) {
                int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                if (intValue3 >= 180000000) {
                    i5 = 1024;
                } else if (intValue3 >= 120000000) {
                    i5 = 512;
                } else if (intValue3 >= 60000000) {
                    i5 = 256;
                } else if (intValue3 >= 30000000) {
                    i5 = 128;
                } else if (intValue3 >= 18000000) {
                    i5 = 64;
                } else if (intValue3 >= 12000000) {
                    i5 = 32;
                } else if (intValue3 >= 7200000) {
                    i5 = 16;
                } else if (intValue3 < 3600000) {
                    i5 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i5;
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z3)) {
                    if ("video/hevc".equals(str3) && intValue == 2) {
                        String str4 = AbstractC1260lo.f14420b;
                        if (!"sailfish".equals(str4) && !"marlin".equals(str4)) {
                        }
                    }
                }
            }
            g("codec.profileLevel, " + c1407p.f14901j + ", " + str);
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f10788a;
    }
}
