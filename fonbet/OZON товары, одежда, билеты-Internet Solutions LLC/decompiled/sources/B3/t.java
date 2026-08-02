package B3;

import Am.C2438a;
import B3.M;
import N3.C3660k;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g.C6594f;
import j3.C7267i;
import j3.C7272n;
import java.util.Objects;
import m3.C8065g;
import n3.C8434g;
import t3.C9738d;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f2369a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2370b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2371c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f2372d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2373e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2374f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2375g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2376h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f2377i;

    /* renamed from: j, reason: collision with root package name */
    private int f2378j;

    /* renamed from: k, reason: collision with root package name */
    private int f2379k;

    /* renamed from: l, reason: collision with root package name */
    private float f2380l;

    t(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        str.getClass();
        this.f2369a = str;
        this.f2370b = str2;
        this.f2371c = str3;
        this.f2372d = codecCapabilities;
        this.f2375g = z11;
        this.f2373e = z14;
        this.f2374f = z15;
        this.f2376h = z16;
        this.f2377i = j3.u.l(str2);
        this.f2380l = -3.4028235E38f;
        this.f2378j = -1;
        this.f2379k = -1;
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(m3.N.f(i11, widthAlignment) * widthAlignment, m3.N.f(i12, heightAlignment) * heightAlignment);
        int i13 = point.x;
        int i14 = point.y;
        if (d11 == -1.0d || d11 < 1.0d) {
            return videoCapabilities.isSizeSupported(i13, i14);
        }
        double floor = Math.floor(d11);
        if (!videoCapabilities.areSizeAndRateSupported(i13, i14, floor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i13, i14);
        return achievableFrameRatesFor == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
    }

    private boolean d(C7272n c7272n, boolean z11) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i11 = M.f2300b;
        Pair<Integer, Integer> c11 = C8065g.c(c7272n);
        String str = this.f2371c;
        String str2 = c7272n.f69127o;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String m11 = j3.u.m(str);
            if (!m11.equals("video/mv-hevc")) {
                if (m11.equals("video/hevc")) {
                    String c12 = C8434g.c(c7272n.f69130r);
                    if (c12 == null) {
                        c11 = null;
                    } else {
                        String trim = c12.trim();
                        int i12 = m3.N.f74289a;
                        c11 = C8065g.d(c12, trim.split("\\.", -1), c7272n.f69100E);
                    }
                }
            }
            return true;
        }
        if (c11 != null) {
            int intValue = ((Integer) c11.first).intValue();
            int intValue2 = ((Integer) c11.second).intValue();
            boolean equals = "video/dolby-vision".equals(str2);
            String str3 = this.f2370b;
            if (equals) {
                str3.getClass();
                switch (str3) {
                    case "video/av01":
                    case "video/hevc":
                        intValue = 2;
                        break;
                    case "video/avc":
                        intValue = 8;
                        break;
                }
                intValue2 = 0;
            }
            if (this.f2377i || intValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f2372d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                    if (codecProfileLevel.profile == intValue && (codecProfileLevel.level >= intValue2 || !z11)) {
                        if ("video/hevc".equals(str3) && 2 == intValue) {
                            String str4 = Build.DEVICE;
                            if (!"sailfish".equals(str4) && !"marlin".equals(str4)) {
                            }
                        }
                    }
                }
                j(C6594f.a(c7272n.f69123k, ", ", str, new StringBuilder("codec.profileLevel, ")));
                return false;
            }
        }
        return true;
    }

    private boolean e(C7272n c7272n) {
        return (Objects.equals(c7272n.f69127o, "audio/flac") && c7272n.f69104I == 22 && Build.VERSION.SDK_INT < 34 && this.f2369a.equals("c2.android.flac.decoder")) ? false : true;
    }

    private void j(String str) {
        StringBuilder b11 = C6594f.b("NoSupport [", str, "] [");
        b11.append(this.f2369a);
        b11.append(", ");
        b11.append(this.f2370b);
        b11.append("] [");
        b11.append(m3.N.f74290b);
        b11.append("]");
        m3.s.b("MediaCodecInfo", b11.toString());
    }

    public static t k(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z16;
        boolean z17;
        boolean z18;
        String str6;
        boolean z19 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z21 = z14 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO")) {
                z15 = true;
                str6 = str;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z16 = z11;
                z17 = z12;
                z18 = z13;
                str4 = str2;
                return new t(str6, str4, str5, codecCapabilities2, z16, z17, z18, z19, z21, z15);
            }
        }
        z15 = false;
        str4 = str2;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z16 = z11;
        z17 = z12;
        z18 = z13;
        str6 = str;
        return new t(str6, str4, str5, codecCapabilities2, z16, z17, z18, z19, z21, z15);
    }

    public final C9738d b(C7272n c7272n, C7272n c7272n2) {
        C7272n c7272n3;
        C7272n c7272n4;
        int i11;
        int i12 = !Objects.equals(c7272n.f69127o, c7272n2.f69127o) ? 8 : 0;
        if (this.f2377i) {
            if (c7272n.f69096A != c7272n2.f69096A) {
                i12 |= UserVerificationMethods.USER_VERIFY_ALL;
            }
            boolean z11 = (c7272n.f69134v == c7272n2.f69134v && c7272n.f69135w == c7272n2.f69135w) ? false : true;
            if (!this.f2373e && z11) {
                i12 |= UserVerificationMethods.USER_VERIFY_NONE;
            }
            C7267i c7267i = c7272n.f69100E;
            boolean f7 = C7267i.f(c7267i);
            C7267i c7267i2 = c7272n2.f69100E;
            if ((!f7 || !C7267i.f(c7267i2)) && !Objects.equals(c7267i, c7267i2)) {
                i12 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f2369a) && !c7272n.c(c7272n2)) {
                i12 |= 2;
            }
            int i13 = c7272n.f69136x;
            if (i13 != -1 && (i11 = c7272n.f69137y) != -1 && i13 == c7272n2.f69136x && i11 == c7272n2.f69137y && z11) {
                i12 |= 2;
            }
            if (i12 == 0) {
                return new C9738d(this.f2369a, c7272n, c7272n2, c7272n.c(c7272n2) ? 3 : 2, 0);
            }
            c7272n3 = c7272n;
            c7272n4 = c7272n2;
        } else {
            c7272n3 = c7272n;
            c7272n4 = c7272n2;
            if (c7272n3.f69102G != c7272n4.f69102G) {
                i12 |= 4096;
            }
            if (c7272n3.f69103H != c7272n4.f69103H) {
                i12 |= 8192;
            }
            if (c7272n3.f69104I != c7272n4.f69104I) {
                i12 |= 16384;
            }
            String str = this.f2370b;
            if (i12 == 0 && "audio/mp4a-latm".equals(str)) {
                int i14 = M.f2300b;
                Pair<Integer, Integer> c11 = C8065g.c(c7272n3);
                Pair<Integer, Integer> c12 = C8065g.c(c7272n4);
                if (c11 != null && c12 != null) {
                    int intValue = ((Integer) c11.first).intValue();
                    int intValue2 = ((Integer) c12.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C9738d(this.f2369a, c7272n3, c7272n4, 3, 0);
                    }
                }
            }
            if (!c7272n3.c(c7272n4)) {
                i12 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i12 |= 2;
            }
            if (i12 == 0) {
                return new C9738d(this.f2369a, c7272n3, c7272n4, 1, 0);
            }
        }
        return new C9738d(this.f2369a, c7272n3, c7272n4, 0, i12);
    }

    public final float c(int i11, int i12) {
        if (!this.f2377i) {
            return -3.4028235E38f;
        }
        float f7 = this.f2380l;
        if (f7 != -3.4028235E38f && this.f2378j == i11 && this.f2379k == i12) {
            return f7;
        }
        float f11 = 1024.0f;
        if (!i(i11, i12, 1024.0f)) {
            float f12 = 0.0f;
            while (true) {
                float f13 = f11 - f12;
                if (Math.abs(f13) <= 5.0f) {
                    break;
                }
                float f14 = (f13 / 2.0f) + f12;
                if (i(i11, i12, f14)) {
                    f12 = f14;
                } else {
                    f11 = f14;
                }
            }
            f11 = f12;
        }
        this.f2380l = f11;
        this.f2378j = i11;
        this.f2379k = i12;
        return f11;
    }

    public final boolean f(C7272n c7272n) {
        String str = c7272n.f69127o;
        String str2 = this.f2370b;
        return (str2.equals(str) || str2.equals(M.b(c7272n))) && d(c7272n, false) && e(c7272n);
    }

    public final boolean g(C7272n c7272n) throws M.b {
        int i11;
        String str = c7272n.f69127o;
        String str2 = this.f2370b;
        if (!(str2.equals(str) || str2.equals(M.b(c7272n))) || !d(c7272n, true) || !e(c7272n)) {
            return false;
        }
        if (this.f2377i) {
            int i12 = c7272n.f69134v;
            if (i12 > 0 && (i11 = c7272n.f69135w) > 0) {
                return i(i12, i11, c7272n.f69138z);
            }
        } else {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f2372d;
            int i13 = c7272n.f69103H;
            if (i13 != -1) {
                if (codecCapabilities == null) {
                    j("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    j("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i13)) {
                    j(Ej.b.a(i13, "sampleRate.support, "));
                    return false;
                }
            }
            int i14 = c7272n.f69102G;
            if (i14 != -1) {
                if (codecCapabilities == null) {
                    j("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    j("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                    int i15 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    StringBuilder sb2 = new StringBuilder("AssumedMaxChannelAdjustment: ");
                    Pk0.g.d(maxInputChannelCount, this.f2369a, ", [", " to ", sb2);
                    sb2.append(i15);
                    sb2.append("]");
                    m3.s.f("MediaCodecInfo", sb2.toString());
                    maxInputChannelCount = i15;
                }
                if (maxInputChannelCount < i14) {
                    j(Ej.b.a(i14, "channelCount.support, "));
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean h(C7272n c7272n) {
        if (this.f2377i) {
            return this.f2373e;
        }
        int i11 = M.f2300b;
        Pair<Integer, Integer> c11 = C8065g.c(c7272n);
        return c11 != null && ((Integer) c11.first).intValue() == 42;
    }

    public final boolean i(int i11, int i12, double d11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f2372d;
        if (codecCapabilities == null) {
            j("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            j("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int c11 = A.c(videoCapabilities, i11, i12, d11);
            if (c11 != 2) {
                if (c11 == 1) {
                    StringBuilder a11 = C2438a.a("sizeAndRate.cover, ", i11, "x", "@", i12);
                    a11.append(d11);
                    j(a11.toString());
                    return false;
                }
            }
            return true;
        }
        if (!a(videoCapabilities, i11, i12, d11)) {
            if (i11 < i12) {
                String str = this.f2369a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i12, i11, d11)) {
                    StringBuilder a12 = C2438a.a("sizeAndRate.rotated, ", i11, "x", "@", i12);
                    a12.append(d11);
                    StringBuilder d12 = C3660k.d("AssumedSupport [", a12.toString(), "] [", str, ", ");
                    d12.append(this.f2370b);
                    d12.append("] [");
                    d12.append(m3.N.f74290b);
                    d12.append("]");
                    m3.s.b("MediaCodecInfo", d12.toString());
                    return true;
                }
            }
            StringBuilder a13 = C2438a.a("sizeAndRate.support, ", i11, "x", "@", i12);
            a13.append(d11);
            j(a13.toString());
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f2369a;
    }
}
