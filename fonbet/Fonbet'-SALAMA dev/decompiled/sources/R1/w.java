package R1;

import A1.X;
import B4.V;
import E3.AbstractC0167z;
import E4.M;
import Y4.D;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v0.AbstractC1663a;
import w1.L;
import w2.C1767b;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f6011a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f6012b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f6013c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (v2.t.f17153a < 26 && v2.t.f17154b.equals("R9") && arrayList.size() == 1 && ((m) arrayList.get(0)).f5925a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(m.g("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new M(new q(1), 3));
        }
        int i7 = v2.t.f17153a;
        if (i7 < 21 && arrayList.size() > 1) {
            String str2 = ((m) arrayList.get(0)).f5925a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new M(new q(2), 3));
            }
        }
        if (i7 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((m) arrayList.get(0)).f5925a)) {
            return;
        }
        arrayList.add((m) arrayList.remove(0));
    }

    public static String b(X x4) {
        Pair d7;
        if ("audio/eac3-joc".equals(x4.f283C)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(x4.f283C) || (d7 = d(x4)) == null) {
            return null;
        }
        int intValue = ((Integer) d7.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x047b, code lost:
    
        if (r5.equals("H123") == false) goto L288;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0363 A[Catch: NumberFormatException -> 0x0374, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0374, blocks: (B:201:0x031a, B:203:0x032c, B:215:0x034a, B:218:0x0363), top: B:200:0x031a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x064c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair d(X x4) {
        char c3;
        int i7;
        int i8;
        int i9;
        int parseInt;
        int parseInt2;
        int i10;
        int i11;
        int i12;
        char c4;
        Integer num;
        int i13;
        int i14;
        char c7;
        Integer num2;
        char c8;
        Integer num3;
        Pattern pattern = f6011a;
        int i15 = 16;
        int i16 = 2;
        String str = x4.f312z;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        boolean equals = "video/dolby-vision".equals(x4.f283C);
        String str2 = x4.f312z;
        if (!equals) {
            String str3 = split[0];
            str3.getClass();
            switch (str3.hashCode()) {
                case 3004662:
                    if (str3.equals("av01")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3006243:
                    if (str3.equals("avc1")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3006244:
                    if (str3.equals("avc2")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3199032:
                    if (str3.equals("hev1")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3214780:
                    if (str3.equals("hvc1")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3356560:
                    if (str3.equals("mp4a")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3624515:
                    if (str3.equals("vp09")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    if (split.length < 4) {
                        L.l("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                    try {
                        int parseInt3 = Integer.parseInt(split[1]);
                        int parseInt4 = Integer.parseInt(split[2].substring(0, 2));
                        int parseInt5 = Integer.parseInt(split[3]);
                        if (parseInt3 != 0) {
                            AbstractC1663a.j(parseInt3, "Unknown AV1 profile: ", "MediaCodecUtil");
                            return null;
                        }
                        if (parseInt5 != 8 && parseInt5 != 10) {
                            AbstractC1663a.j(parseInt5, "Unknown AV1 bit depth: ", "MediaCodecUtil");
                            return null;
                        }
                        if (parseInt5 == 8) {
                            i7 = 1;
                        } else {
                            C1767b c1767b = x4.f295O;
                            i7 = (c1767b == null || !(c1767b.f17959d != null || (i8 = c1767b.f17958c) == 7 || i8 == 6)) ? 2 : 4096;
                        }
                        switch (parseInt4) {
                            case 0:
                                i15 = 1;
                                i9 = -1;
                                break;
                            case 1:
                                i15 = 2;
                                i9 = -1;
                                break;
                            case 2:
                                i15 = 4;
                                i9 = -1;
                                break;
                            case 3:
                                i15 = 8;
                                i9 = -1;
                                break;
                            case 4:
                                i9 = -1;
                                break;
                            case 5:
                                i15 = 32;
                                i9 = -1;
                                break;
                            case 6:
                                i15 = 64;
                                i9 = -1;
                                break;
                            case 7:
                                i15 = 128;
                                i9 = -1;
                                break;
                            case 8:
                                i15 = 256;
                                i9 = -1;
                                break;
                            case 9:
                                i15 = 512;
                                i9 = -1;
                                break;
                            case 10:
                                i15 = 1024;
                                i9 = -1;
                                break;
                            case 11:
                                i15 = 2048;
                                i9 = -1;
                                break;
                            case 12:
                                i15 = 4096;
                                i9 = -1;
                                break;
                            case 13:
                                i9 = -1;
                                i15 = 8192;
                                break;
                            case 14:
                                i15 = 16384;
                                i9 = -1;
                                break;
                            case 15:
                                i15 = 32768;
                                i9 = -1;
                                break;
                            case 16:
                                i9 = -1;
                                i15 = 65536;
                                break;
                            case 17:
                                i15 = 131072;
                                i9 = -1;
                                break;
                            case 18:
                                i15 = 262144;
                                i9 = -1;
                                break;
                            case 19:
                                i15 = 524288;
                                i9 = -1;
                                break;
                            case 20:
                                i15 = 1048576;
                                i9 = -1;
                                break;
                            case zzbbd.zzt.zzm /* 21 */:
                                i15 = 2097152;
                                i9 = -1;
                                break;
                            case 22:
                                i15 = 4194304;
                                i9 = -1;
                                break;
                            case 23:
                                i15 = 8388608;
                                i9 = -1;
                                break;
                            default:
                                i9 = -1;
                                i15 = -1;
                                break;
                        }
                        if (i15 != i9) {
                            return new Pair(Integer.valueOf(i7), Integer.valueOf(i15));
                        }
                        AbstractC1663a.j(parseInt4, "Unknown AV1 level: ", "MediaCodecUtil");
                        return null;
                    } catch (NumberFormatException unused) {
                        L.l("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                case 1:
                case 2:
                    if (split.length < 2) {
                        L.l("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                    try {
                        if (split[1].length() == 6) {
                            parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                            parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                        } else {
                            if (split.length < 3) {
                                Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str2);
                                return null;
                            }
                            parseInt = Integer.parseInt(split[1]);
                            parseInt2 = Integer.parseInt(split[2]);
                        }
                        if (parseInt == 66) {
                            i16 = 1;
                        } else if (parseInt != 77) {
                            if (parseInt == 88) {
                                i16 = 4;
                            } else if (parseInt == 100) {
                                i16 = 8;
                            } else if (parseInt == 110) {
                                i16 = 16;
                            } else if (parseInt == 122) {
                                i16 = 32;
                            } else {
                                if (parseInt != 244) {
                                    i10 = -1;
                                    i16 = -1;
                                    if (i16 != i10) {
                                        AbstractC1663a.j(parseInt, "Unknown AVC profile: ", "MediaCodecUtil");
                                        return null;
                                    }
                                    switch (parseInt2) {
                                        case 10:
                                            i15 = 1;
                                            i11 = -1;
                                            break;
                                        case 11:
                                            i15 = 4;
                                            i11 = -1;
                                            break;
                                        case 12:
                                            i15 = 8;
                                            i11 = -1;
                                            break;
                                        case 13:
                                            i11 = -1;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 20:
                                                    i15 = 32;
                                                    i11 = -1;
                                                    break;
                                                case zzbbd.zzt.zzm /* 21 */:
                                                    i15 = 64;
                                                    i11 = -1;
                                                    break;
                                                case 22:
                                                    i15 = 128;
                                                    i11 = -1;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 30:
                                                            i15 = 256;
                                                            i11 = -1;
                                                            break;
                                                        case 31:
                                                            i15 = 512;
                                                            i11 = -1;
                                                            break;
                                                        case 32:
                                                            i15 = 1024;
                                                            i11 = -1;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 40:
                                                                    i15 = 2048;
                                                                    i11 = -1;
                                                                    break;
                                                                case 41:
                                                                    i15 = 4096;
                                                                    i11 = -1;
                                                                    break;
                                                                case 42:
                                                                    i15 = 8192;
                                                                    i11 = -1;
                                                                    break;
                                                                default:
                                                                    switch (parseInt2) {
                                                                        case 50:
                                                                            i15 = 16384;
                                                                            i11 = -1;
                                                                            break;
                                                                        case 51:
                                                                            i15 = 32768;
                                                                            i11 = -1;
                                                                            break;
                                                                        case 52:
                                                                            i15 = 65536;
                                                                            i11 = -1;
                                                                            break;
                                                                        default:
                                                                            i11 = -1;
                                                                            i15 = -1;
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                    if (i15 != i11) {
                                        return new Pair(Integer.valueOf(i16), Integer.valueOf(i15));
                                    }
                                    AbstractC1663a.j(parseInt2, "Unknown AVC level: ", "MediaCodecUtil");
                                    return null;
                                }
                                i16 = 64;
                            }
                        }
                        i10 = -1;
                        if (i16 != i10) {
                        }
                    } catch (NumberFormatException unused2) {
                        L.l("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                case 3:
                case 4:
                    char c9 = 11;
                    if (split.length < 4) {
                        L.l("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                    Matcher matcher = pattern.matcher(split[1]);
                    if (!matcher.matches()) {
                        L.l("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                    String group = matcher.group(1);
                    if ("1".equals(group)) {
                        i12 = 1;
                    } else {
                        if (!"2".equals(group)) {
                            L.l("Unknown HEVC profile string: ", group, "MediaCodecUtil");
                            return null;
                        }
                        i12 = 2;
                    }
                    String str4 = split[3];
                    if (str4 != null) {
                        switch (str4.hashCode()) {
                            case 70821:
                                if (str4.equals("H30")) {
                                    c4 = 0;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 70914:
                                if (str4.equals("H60")) {
                                    c4 = 1;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 70917:
                                if (str4.equals("H63")) {
                                    c4 = 2;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 71007:
                                if (str4.equals("H90")) {
                                    c4 = 3;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 71010:
                                if (str4.equals("H93")) {
                                    c4 = 4;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 74665:
                                if (str4.equals("L30")) {
                                    c4 = 5;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 74758:
                                if (str4.equals("L60")) {
                                    c4 = 6;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 74761:
                                if (str4.equals("L63")) {
                                    c4 = 7;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 74851:
                                if (str4.equals("L90")) {
                                    c4 = '\b';
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 74854:
                                if (str4.equals("L93")) {
                                    c4 = '\t';
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 2193639:
                                if (str4.equals("H120")) {
                                    c4 = '\n';
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 2193642:
                                break;
                            case 2193732:
                                if (str4.equals("H150")) {
                                    c9 = '\f';
                                    c4 = c9;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 2193735:
                                if (str4.equals("H153")) {
                                    c9 = '\r';
                                    c4 = c9;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 2193738:
                                if (str4.equals("H156")) {
                                    c9 = 14;
                                    c4 = c9;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 2193825:
                                if (str4.equals("H180")) {
                                    c9 = 15;
                                    c4 = c9;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 2193828:
                                if (str4.equals("H183")) {
                                    c4 = 16;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 2193831:
                                if (str4.equals("H186")) {
                                    c9 = 17;
                                    c4 = c9;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 2312803:
                                if (str4.equals("L120")) {
                                    c9 = 18;
                                    c4 = c9;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 2312806:
                                if (str4.equals("L123")) {
                                    c9 = 19;
                                    c4 = c9;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 2312896:
                                if (str4.equals("L150")) {
                                    c4 = 20;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 2312899:
                                if (str4.equals("L153")) {
                                    c9 = 21;
                                    c4 = c9;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 2312902:
                                if (str4.equals("L156")) {
                                    c9 = 22;
                                    c4 = c9;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 2312989:
                                if (str4.equals("L180")) {
                                    c9 = 23;
                                    c4 = c9;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 2312992:
                                if (str4.equals("L183")) {
                                    c9 = 24;
                                    c4 = c9;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 2312995:
                                if (str4.equals("L186")) {
                                    c9 = 25;
                                    c4 = c9;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            default:
                                c4 = 65535;
                                break;
                        }
                        switch (c4) {
                            case 0:
                                num = 2;
                                break;
                            case 1:
                                num = 8;
                                break;
                            case 2:
                                num = 32;
                                break;
                            case 3:
                                num = 128;
                                break;
                            case 4:
                                num = 512;
                                break;
                            case 5:
                                num = 1;
                                break;
                            case 6:
                                num = 4;
                                break;
                            case 7:
                                num = 16;
                                break;
                            case '\b':
                                num = 64;
                                break;
                            case '\t':
                                num = 256;
                                break;
                            case '\n':
                                num = 2048;
                                break;
                            case 11:
                                num = 8192;
                                break;
                            case '\f':
                                num = 32768;
                                break;
                            case '\r':
                                num = 131072;
                                break;
                            case 14:
                                num = 524288;
                                break;
                            case 15:
                                num = 2097152;
                                break;
                            case 16:
                                num = 8388608;
                                break;
                            case 17:
                                num = 33554432;
                                break;
                            case 18:
                                num = 1024;
                                break;
                            case 19:
                                num = 4096;
                                break;
                            case 20:
                                num = 16384;
                                break;
                            case zzbbd.zzt.zzm /* 21 */:
                                num = 65536;
                                break;
                            case 22:
                                num = 262144;
                                break;
                            case 23:
                                num = 1048576;
                                break;
                            case 24:
                                num = 4194304;
                                break;
                            case 25:
                                num = 16777216;
                                break;
                        }
                        if (num == null) {
                            return new Pair(Integer.valueOf(i12), num);
                        }
                        L.l("Unknown HEVC level string: ", str4, "MediaCodecUtil");
                        return null;
                    }
                    num = null;
                    if (num == null) {
                    }
                case 5:
                    if (split.length != 3) {
                        L.l("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                    try {
                        if (!"audio/mp4a-latm".equals(v2.i.d(Integer.parseInt(split[1], 16)))) {
                            return null;
                        }
                        int parseInt6 = Integer.parseInt(split[2]);
                        int i17 = 17;
                        if (parseInt6 != 17) {
                            if (parseInt6 != 20) {
                                i17 = 23;
                                if (parseInt6 != 23) {
                                    i17 = 29;
                                    if (parseInt6 != 29) {
                                        i17 = 39;
                                        if (parseInt6 != 39) {
                                            i17 = 42;
                                            if (parseInt6 != 42) {
                                                switch (parseInt6) {
                                                    case 1:
                                                        i16 = 1;
                                                        break;
                                                    case 2:
                                                        break;
                                                    case 3:
                                                        i16 = 3;
                                                        break;
                                                    case 4:
                                                        i16 = 4;
                                                        break;
                                                    case 5:
                                                        i16 = 5;
                                                        break;
                                                    case 6:
                                                        i13 = -1;
                                                        i16 = 6;
                                                        break;
                                                    default:
                                                        i13 = -1;
                                                        i16 = -1;
                                                        break;
                                                }
                                                if (i16 != i13) {
                                                    return new Pair(Integer.valueOf(i16), 0);
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i16 = 20;
                            }
                            i13 = -1;
                            if (i16 != i13) {
                            }
                        }
                        i16 = i17;
                        i13 = -1;
                        if (i16 != i13) {
                        }
                    } catch (NumberFormatException unused3) {
                        L.l("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                case 6:
                    if (split.length < 3) {
                        L.l("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                    try {
                        int parseInt7 = Integer.parseInt(split[1]);
                        int parseInt8 = Integer.parseInt(split[2]);
                        int i18 = parseInt7 != 0 ? parseInt7 != 1 ? parseInt7 != 2 ? parseInt7 != 3 ? -1 : 8 : 4 : 2 : 1;
                        if (i18 == -1) {
                            AbstractC1663a.j(parseInt7, "Unknown VP9 profile: ", "MediaCodecUtil");
                            return null;
                        }
                        if (parseInt8 == 10) {
                            i15 = 1;
                        } else if (parseInt8 == 11) {
                            i15 = 2;
                        } else if (parseInt8 == 20) {
                            i15 = 4;
                        } else if (parseInt8 == 21) {
                            i15 = 8;
                        } else if (parseInt8 != 30) {
                            if (parseInt8 == 31) {
                                i15 = 32;
                            } else if (parseInt8 == 40) {
                                i15 = 64;
                            } else if (parseInt8 == 41) {
                                i15 = 128;
                            } else if (parseInt8 == 50) {
                                i15 = 256;
                            } else {
                                if (parseInt8 != 51) {
                                    switch (parseInt8) {
                                        case 60:
                                            i15 = 2048;
                                            break;
                                        case 61:
                                            i15 = 4096;
                                            break;
                                        case 62:
                                            i15 = 8192;
                                            break;
                                        default:
                                            i14 = -1;
                                            i15 = -1;
                                            break;
                                    }
                                    if (i15 == i14) {
                                        return new Pair(Integer.valueOf(i18), Integer.valueOf(i15));
                                    }
                                    AbstractC1663a.j(parseInt8, "Unknown VP9 level: ", "MediaCodecUtil");
                                    return null;
                                }
                                i15 = 512;
                            }
                        }
                        i14 = -1;
                        if (i15 == i14) {
                        }
                    } catch (NumberFormatException unused4) {
                        L.l("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                        return null;
                    }
                default:
                    return null;
            }
        } else {
            if (split.length < 3) {
                L.l("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                return null;
            }
            Matcher matcher2 = pattern.matcher(split[1]);
            if (!matcher2.matches()) {
                L.l("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                return null;
            }
            String group2 = matcher2.group(1);
            if (group2 != null) {
                switch (group2.hashCode()) {
                    case 1536:
                        if (group2.equals("00")) {
                            c7 = 0;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1537:
                        if (group2.equals("01")) {
                            c7 = 1;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1538:
                        if (group2.equals("02")) {
                            c7 = 2;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1539:
                        if (group2.equals("03")) {
                            c7 = 3;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1540:
                        if (group2.equals("04")) {
                            c7 = 4;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1541:
                        if (group2.equals("05")) {
                            c7 = 5;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1542:
                        if (group2.equals("06")) {
                            c7 = 6;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1543:
                        if (group2.equals("07")) {
                            c7 = 7;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1544:
                        if (group2.equals("08")) {
                            c7 = '\b';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1545:
                        if (group2.equals("09")) {
                            c7 = '\t';
                            break;
                        }
                        c7 = 65535;
                        break;
                    default:
                        c7 = 65535;
                        break;
                }
                switch (c7) {
                    case 0:
                        num2 = 1;
                        break;
                    case 1:
                        num2 = 2;
                        break;
                    case 2:
                        num2 = 4;
                        break;
                    case 3:
                        num2 = 8;
                        break;
                    case 4:
                        num2 = 16;
                        break;
                    case 5:
                        num2 = 32;
                        break;
                    case 6:
                        num2 = 64;
                        break;
                    case 7:
                        num2 = 128;
                        break;
                    case '\b':
                        num2 = 256;
                        break;
                    case '\t':
                        num2 = 512;
                        break;
                }
                if (num2 != null) {
                    L.l("Unknown Dolby Vision profile string: ", group2, "MediaCodecUtil");
                    return null;
                }
                String str5 = split[2];
                if (str5 != null) {
                    switch (str5.hashCode()) {
                        case 1537:
                            if (str5.equals("01")) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1538:
                            if (str5.equals("02")) {
                                c8 = 1;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1539:
                            if (str5.equals("03")) {
                                c8 = 2;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1540:
                            if (str5.equals("04")) {
                                c8 = 3;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1541:
                            if (str5.equals("05")) {
                                c8 = 4;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1542:
                            if (str5.equals("06")) {
                                c8 = 5;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1543:
                            if (str5.equals("07")) {
                                c8 = 6;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1544:
                            if (str5.equals("08")) {
                                c8 = 7;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1545:
                            if (str5.equals("09")) {
                                c8 = '\b';
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1567:
                            if (str5.equals("10")) {
                                c8 = '\t';
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1568:
                            if (str5.equals("11")) {
                                c8 = '\n';
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1569:
                            if (str5.equals("12")) {
                                c8 = 11;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1570:
                            if (str5.equals("13")) {
                                c8 = '\f';
                                break;
                            }
                            c8 = 65535;
                            break;
                        default:
                            c8 = 65535;
                            break;
                    }
                    switch (c8) {
                        case 0:
                            num3 = 1;
                            break;
                        case 1:
                            num3 = 2;
                            break;
                        case 2:
                            num3 = 4;
                            break;
                        case 3:
                            num3 = 8;
                            break;
                        case 4:
                            num3 = 16;
                            break;
                        case 5:
                            num3 = 32;
                            break;
                        case 6:
                            num3 = 64;
                            break;
                        case 7:
                            num3 = 128;
                            break;
                        case '\b':
                            num3 = 256;
                            break;
                        case '\t':
                            num3 = 512;
                            break;
                        case '\n':
                            num3 = 1024;
                            break;
                        case 11:
                            num3 = 2048;
                            break;
                        case '\f':
                            num3 = 4096;
                            break;
                    }
                    if (num3 == null) {
                        return new Pair(num2, num3);
                    }
                    L.l("Unknown Dolby Vision level string: ", str5, "MediaCodecUtil");
                    return null;
                }
                num3 = null;
                if (num3 == null) {
                }
            }
            num2 = null;
            if (num2 != null) {
            }
        }
    }

    public static synchronized List e(String str, boolean z4, boolean z7) {
        synchronized (w.class) {
            try {
                s sVar = new s(str, z4, z7);
                HashMap hashMap = f6012b;
                List list = (List) hashMap.get(sVar);
                if (list != null) {
                    return list;
                }
                int i7 = v2.t.f17153a;
                ArrayList f7 = f(sVar, i7 >= 21 ? new B.v(z4, z7) : new V(9));
                if (z4 && f7.isEmpty() && 21 <= i7 && i7 <= 23) {
                    f7 = f(sVar, new V(9));
                    if (!f7.isEmpty()) {
                        Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((m) f7.get(0)).f5925a);
                    }
                }
                a(str, f7);
                AbstractC0167z E7 = AbstractC0167z.E(f7);
                hashMap.put(sVar, E7);
                return E7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r8 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList f(s sVar, u uVar) {
        String c3;
        String str;
        String str2;
        int i7;
        boolean z4;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean b7;
        boolean h6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        String str3;
        boolean isHardwareAccelerated;
        boolean isAlias;
        s sVar2 = sVar;
        u uVar2 = uVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str4 = sVar2.f6008a;
            int i8 = uVar.i();
            boolean o7 = uVar.o();
            int i9 = 0;
            while (i9 < i8) {
                MediaCodecInfo a2 = uVar2.a(i9);
                int i10 = v2.t.f17153a;
                if (i10 >= 29) {
                    isAlias = a2.isAlias();
                }
                String name = a2.getName();
                if (g(a2, name, o7, str4) && (c3 = c(a2, name, str4)) != null) {
                    try {
                        capabilitiesForType = a2.getCapabilitiesForType(c3);
                        b7 = uVar2.b("tunneled-playback", c3, capabilitiesForType);
                        h6 = uVar2.h("tunneled-playback", capabilitiesForType);
                        z7 = sVar2.f6010c;
                    } catch (Exception e7) {
                        e = e7;
                        str = c3;
                        str2 = name;
                        i7 = i9;
                        z4 = o7;
                    }
                    if ((z7 || !h6) && (!z7 || b7)) {
                        boolean b8 = uVar2.b("secure-playback", c3, capabilitiesForType);
                        boolean h7 = uVar2.h("secure-playback", capabilitiesForType);
                        boolean z11 = sVar2.f6009b;
                        if ((z11 || !h7) && (!z11 || b8)) {
                            if (i10 >= 29) {
                                isHardwareAccelerated = a2.isHardwareAccelerated();
                                z9 = isHardwareAccelerated;
                                z8 = true;
                            } else {
                                z8 = true;
                                z9 = !h(a2, str4);
                            }
                            boolean h8 = h(a2, str4);
                            if (i10 >= 29) {
                                z10 = a2.isVendor();
                            } else {
                                String a02 = D.a0(a2.getName());
                                z10 = (a02.startsWith("omx.google.") || a02.startsWith("c2.android.") || a02.startsWith("c2.google.")) ? false : z8;
                            }
                            if (!(o7 && z11 == b8) && (o7 || z11)) {
                                str = c3;
                                str3 = name;
                                i7 = i9;
                                z4 = o7;
                                if (!z4 && b8) {
                                    StringBuilder sb = new StringBuilder();
                                    try {
                                        sb.append(str3);
                                        sb.append(".secure");
                                        str2 = str3;
                                    } catch (Exception e8) {
                                        e = e8;
                                        str2 = str3;
                                    }
                                    try {
                                        arrayList.add(m.g(sb.toString(), str4, str, capabilitiesForType, z9, h8, z10, true));
                                        return arrayList;
                                    } catch (Exception e9) {
                                        e = e9;
                                        if (v2.t.f17153a <= 23) {
                                        }
                                        Log.e("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                        throw e;
                                    }
                                }
                                i9 = i7 + 1;
                                sVar2 = sVar;
                                uVar2 = uVar;
                                o7 = z4;
                            } else {
                                str = c3;
                                str3 = name;
                                i7 = i9;
                                z4 = o7;
                                try {
                                    arrayList.add(m.g(name, str4, c3, capabilitiesForType, z9, h8, z10, false));
                                } catch (Exception e10) {
                                    e = e10;
                                    str2 = str3;
                                    if (v2.t.f17153a <= 23 || arrayList.isEmpty()) {
                                        Log.e("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                        throw e;
                                    }
                                    Log.e("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                    i9 = i7 + 1;
                                    sVar2 = sVar;
                                    uVar2 = uVar;
                                    o7 = z4;
                                }
                                i9 = i7 + 1;
                                sVar2 = sVar;
                                uVar2 = uVar;
                                o7 = z4;
                            }
                        }
                    }
                }
                i7 = i9;
                z4 = o7;
                i9 = i7 + 1;
                sVar2 = sVar;
                uVar2 = uVar;
                o7 = z4;
            }
            return arrayList;
        } catch (Exception e11) {
            throw new t("Failed to query underlying media codecs", e11);
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z4, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z4 && str.endsWith(".secure"))) {
            return false;
        }
        int i7 = v2.t.f17153a;
        if (i7 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i7 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = v2.t.f17154b;
            if ("a70".equals(str3) || ("Xiaomi".equals(v2.t.f17155c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i7 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = v2.t.f17154b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i7 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = v2.t.f17154b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i7 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(v2.t.f17155c))) {
            String str6 = v2.t.f17154b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i7 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(v2.t.f17155c)) {
            String str7 = v2.t.f17154b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i7 <= 19 && v2.t.f17154b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i7 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (v2.t.f17153a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (v2.i.h(str)) {
            return true;
        }
        String a02 = D.a0(mediaCodecInfo.getName());
        if (a02.startsWith("arc.")) {
            return false;
        }
        if (a02.startsWith("omx.google.") || a02.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((a02.startsWith("omx.sec.") && a02.contains(".sw.")) || a02.equals("omx.qcom.video.decoder.hevcswvdec") || a02.startsWith("c2.android.") || a02.startsWith("c2.google.")) {
            return true;
        }
        return (a02.startsWith("omx.") || a02.startsWith("c2.")) ? false : true;
    }

    public static int i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i7;
        if (f6013c == -1) {
            int i8 = 0;
            List e7 = e("video/avc", false, false);
            m mVar = e7.isEmpty() ? null : (m) e7.get(0);
            if (mVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f5928d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i9 = 0;
                while (i8 < length) {
                    int i10 = codecProfileLevelArr[i8].level;
                    if (i10 != 1 && i10 != 2) {
                        switch (i10) {
                            case 8:
                            case 16:
                            case 32:
                                i7 = 101376;
                                break;
                            case 64:
                                i7 = 202752;
                                break;
                            case 128:
                            case 256:
                                i7 = 414720;
                                break;
                            case 512:
                                i7 = 921600;
                                break;
                            case 1024:
                                i7 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i7 = 2097152;
                                break;
                            case 8192:
                                i7 = 2228224;
                                break;
                            case 16384:
                                i7 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i7 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i7 = 35651584;
                                break;
                            default:
                                i7 = -1;
                                break;
                        }
                    } else {
                        i7 = 25344;
                    }
                    i9 = Math.max(i7, i9);
                    i8++;
                }
                i8 = Math.max(i9, v2.t.f17153a >= 21 ? 345600 : 172800);
            }
            f6013c = i8;
        }
        return f6013c;
    }
}
