package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.util.Pair;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.ii, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1120ii {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13966a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f13967b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f13968c = Pattern.compile("^\\D?(\\d+)$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair a(C1407p c1407p) {
        char c5;
        int parseInt;
        int parseInt2;
        int i;
        int i5;
        Integer num;
        Integer num2;
        String str = c1407p.f14901j;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        boolean equals = "video/dolby-vision".equals(c1407p.f14904m);
        int i6 = 3;
        int i7 = 2;
        int i8 = 1;
        String str2 = c1407p.f14901j;
        if (!equals) {
            String str3 = split[0];
            switch (str3.hashCode()) {
                case 3004662:
                    if (str3.equals("av01")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3006243:
                    if (str3.equals("avc1")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3006244:
                    if (str3.equals("avc2")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3199032:
                    if (str3.equals("hev1")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3214780:
                    if (str3.equals("hvc1")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3356560:
                    if (str3.equals("mp4a")) {
                        c5 = 7;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3475740:
                    if (str3.equals("s263")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3624515:
                    if (str3.equals("vp09")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                    Pair pair = new Pair(1, 1);
                    if (split.length < 3) {
                        AbstractC0467k.B(str2, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                    } else {
                        try {
                            return new Pair(Integer.valueOf(Integer.parseInt(split[1])), Integer.valueOf(Integer.parseInt(split[2])));
                        } catch (NumberFormatException unused) {
                            AbstractC0467k.B(str2, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                        }
                    }
                    return pair;
                case 1:
                case 2:
                    int length = split.length;
                    if (length >= 2) {
                        try {
                            if (split[1].length() == 6) {
                                parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                            } else {
                                if (length < 3) {
                                    JB.l("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str2);
                                    return null;
                                }
                                parseInt = Integer.parseInt(split[1]);
                                parseInt2 = Integer.parseInt(split[2]);
                            }
                            if (parseInt == 66) {
                                i7 = 1;
                            } else if (parseInt != 77) {
                                i7 = parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : 16 : 8 : 4;
                            }
                            if (i7 == -1) {
                                AbstractC0467k.y(parseInt, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                                return null;
                            }
                            switch (parseInt2) {
                                case 10:
                                    break;
                                case 11:
                                    i8 = 4;
                                    break;
                                case 12:
                                    i8 = 8;
                                    break;
                                case 13:
                                    i8 = 16;
                                    break;
                                default:
                                    switch (parseInt2) {
                                        case 20:
                                            i8 = 32;
                                            break;
                                        case C1639u7.zzm /* 21 */:
                                            i8 = 64;
                                            break;
                                        case 22:
                                            i8 = 128;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 30:
                                                    i8 = 256;
                                                    break;
                                                case 31:
                                                    i8 = 512;
                                                    break;
                                                case 32:
                                                    i8 = 1024;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 40:
                                                            i8 = 2048;
                                                            break;
                                                        case 41:
                                                            i8 = 4096;
                                                            break;
                                                        case 42:
                                                            i8 = 8192;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 50:
                                                                    i8 = 16384;
                                                                    break;
                                                                case 51:
                                                                    i8 = 32768;
                                                                    break;
                                                                case 52:
                                                                    i8 = 65536;
                                                                    break;
                                                                default:
                                                                    i8 = -1;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                            if (i8 != -1) {
                                return new Pair(Integer.valueOf(i7), Integer.valueOf(i8));
                            }
                            AbstractC0467k.y(parseInt2, "Unknown AVC level: ", "CodecSpecificDataUtil");
                            return null;
                        } catch (NumberFormatException unused2) {
                            AbstractC0467k.B(str2, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        AbstractC0467k.B(str2, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case 3:
                    if (split.length >= 3) {
                        try {
                            int parseInt3 = Integer.parseInt(split[1]);
                            int parseInt4 = Integer.parseInt(split[2]);
                            int i9 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i9 == -1) {
                                AbstractC0467k.y(parseInt3, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                                return null;
                            }
                            if (parseInt4 != 10) {
                                if (parseInt4 == 11) {
                                    i8 = 2;
                                } else if (parseInt4 == 20) {
                                    i8 = 4;
                                } else if (parseInt4 == 21) {
                                    i8 = 8;
                                } else if (parseInt4 == 30) {
                                    i8 = 16;
                                } else if (parseInt4 == 31) {
                                    i8 = 32;
                                } else if (parseInt4 == 40) {
                                    i8 = 64;
                                } else if (parseInt4 == 41) {
                                    i8 = 128;
                                } else if (parseInt4 == 50) {
                                    i8 = 256;
                                } else if (parseInt4 != 51) {
                                    switch (parseInt4) {
                                        case 60:
                                            i8 = 2048;
                                            break;
                                        case 61:
                                            i8 = 4096;
                                            break;
                                        case 62:
                                            i8 = 8192;
                                            break;
                                        default:
                                            i8 = -1;
                                            break;
                                    }
                                } else {
                                    i8 = 512;
                                }
                            }
                            if (i8 != -1) {
                                return new Pair(Integer.valueOf(i9), Integer.valueOf(i8));
                            }
                            AbstractC0467k.y(parseInt4, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                            return null;
                        } catch (NumberFormatException unused3) {
                            AbstractC0467k.B(str2, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        AbstractC0467k.B(str2, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case 4:
                case 5:
                    return b(str2, split, c1407p.f14885A);
                case 6:
                    if (split.length >= 4) {
                        try {
                            int parseInt5 = Integer.parseInt(split[1]);
                            int parseInt6 = Integer.parseInt(split[2].substring(0, 2));
                            int parseInt7 = Integer.parseInt(split[3]);
                            if (parseInt5 != 0) {
                                AbstractC0467k.y(parseInt5, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                                return null;
                            }
                            if (parseInt7 == 8) {
                                i = 1;
                            } else {
                                if (parseInt7 != 10) {
                                    AbstractC0467k.y(parseInt7, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                                    return null;
                                }
                                C1242lE c1242lE = c1407p.f14885A;
                                i = (c1242lE == null || !(c1242lE.f14335d != null || (i5 = c1242lE.f14334c) == 7 || i5 == 6)) ? 2 : 4096;
                            }
                            switch (parseInt6) {
                                case 0:
                                    break;
                                case 1:
                                    i8 = 2;
                                    break;
                                case 2:
                                    i8 = 4;
                                    break;
                                case 3:
                                    i8 = 8;
                                    break;
                                case 4:
                                    i8 = 16;
                                    break;
                                case 5:
                                    i8 = 32;
                                    break;
                                case 6:
                                    i8 = 64;
                                    break;
                                case 7:
                                    i8 = 128;
                                    break;
                                case 8:
                                    i8 = 256;
                                    break;
                                case 9:
                                    i8 = 512;
                                    break;
                                case 10:
                                    i8 = 1024;
                                    break;
                                case 11:
                                    i8 = 2048;
                                    break;
                                case 12:
                                    i8 = 4096;
                                    break;
                                case 13:
                                    i8 = 8192;
                                    break;
                                case 14:
                                    i8 = 16384;
                                    break;
                                case 15:
                                    i8 = 32768;
                                    break;
                                case 16:
                                    i8 = 65536;
                                    break;
                                case 17:
                                    i8 = 131072;
                                    break;
                                case 18:
                                    i8 = 262144;
                                    break;
                                case 19:
                                    i8 = 524288;
                                    break;
                                case 20:
                                    i8 = 1048576;
                                    break;
                                case C1639u7.zzm /* 21 */:
                                    i8 = 2097152;
                                    break;
                                case 22:
                                    i8 = 4194304;
                                    break;
                                case 23:
                                    i8 = 8388608;
                                    break;
                                default:
                                    i8 = -1;
                                    break;
                            }
                            if (i8 != -1) {
                                return new Pair(Integer.valueOf(i), Integer.valueOf(i8));
                            }
                            AbstractC0467k.y(parseInt6, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                            return null;
                        } catch (NumberFormatException unused4) {
                            AbstractC0467k.B(str2, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        AbstractC0467k.B(str2, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case 7:
                    if (split.length == 3) {
                        try {
                            if ("audio/mp4a-latm".equals(AbstractC1593t6.d(Integer.parseInt(split[1], 16)))) {
                                int parseInt8 = Integer.parseInt(split[2]);
                                if (parseInt8 == 17) {
                                    i6 = 17;
                                } else if (parseInt8 == 20) {
                                    i6 = 20;
                                } else if (parseInt8 == 23) {
                                    i6 = 23;
                                } else if (parseInt8 == 29) {
                                    i6 = 29;
                                } else if (parseInt8 == 39) {
                                    i6 = 39;
                                } else if (parseInt8 != 42) {
                                    switch (parseInt8) {
                                        case 1:
                                            i6 = 1;
                                            break;
                                        case 2:
                                            i6 = 2;
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            i6 = 4;
                                            break;
                                        case 5:
                                            i6 = 5;
                                            break;
                                        case 6:
                                            i6 = 6;
                                            break;
                                        default:
                                            i6 = -1;
                                            break;
                                    }
                                } else {
                                    i6 = 42;
                                }
                                if (i6 != -1) {
                                    return new Pair(Integer.valueOf(i6), 0);
                                }
                            }
                            return null;
                        } catch (NumberFormatException unused5) {
                            AbstractC0467k.B(str2, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        AbstractC0467k.B(str2, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                default:
                    return null;
            }
            return null;
        }
        if (split.length < 3) {
            AbstractC0467k.B(str2, "Ignoring malformed Dolby Vision codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f13968c.matcher(split[1]);
        if (!matcher.matches()) {
            AbstractC0467k.B(str2, "Ignoring malformed Dolby Vision codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        if (group != null) {
            int hashCode = group.hashCode();
            if (hashCode != 1567) {
                switch (hashCode) {
                    case 1536:
                        if (group.equals("00")) {
                            num = 1;
                            break;
                        }
                        break;
                    case 1537:
                        if (group.equals("01")) {
                            num = 2;
                            break;
                        }
                        break;
                    case 1538:
                        if (group.equals("02")) {
                            num = 4;
                            break;
                        }
                        break;
                    case 1539:
                        if (group.equals("03")) {
                            num = 8;
                            break;
                        }
                        break;
                    case 1540:
                        if (group.equals("04")) {
                            num = 16;
                            break;
                        }
                        break;
                    case 1541:
                        if (group.equals("05")) {
                            num = 32;
                            break;
                        }
                        break;
                    case 1542:
                        if (group.equals("06")) {
                            num = 64;
                            break;
                        }
                        break;
                    case 1543:
                        if (group.equals("07")) {
                            num = 128;
                            break;
                        }
                        break;
                    case 1544:
                        if (group.equals("08")) {
                            num = 256;
                            break;
                        }
                        break;
                    case 1545:
                        if (group.equals("09")) {
                            num = 512;
                            break;
                        }
                        break;
                }
                if (num == null) {
                    AbstractC0467k.B(group, "Unknown Dolby Vision profile string: ", "CodecSpecificDataUtil");
                    return null;
                }
                String str4 = split[2];
                if (str4 != null) {
                    int hashCode2 = str4.hashCode();
                    switch (hashCode2) {
                        case 1537:
                            if (str4.equals("01")) {
                                num2 = 1;
                                break;
                            }
                            break;
                        case 1538:
                            if (str4.equals("02")) {
                                num2 = 2;
                                break;
                            }
                            break;
                        case 1539:
                            if (str4.equals("03")) {
                                num2 = 4;
                                break;
                            }
                            break;
                        case 1540:
                            if (str4.equals("04")) {
                                num2 = 8;
                                break;
                            }
                            break;
                        case 1541:
                            if (str4.equals("05")) {
                                num2 = 16;
                                break;
                            }
                            break;
                        case 1542:
                            if (str4.equals("06")) {
                                num2 = 32;
                                break;
                            }
                            break;
                        case 1543:
                            if (str4.equals("07")) {
                                num2 = 64;
                                break;
                            }
                            break;
                        case 1544:
                            if (str4.equals("08")) {
                                num2 = 128;
                                break;
                            }
                            break;
                        case 1545:
                            if (str4.equals("09")) {
                                num2 = 256;
                                break;
                            }
                            break;
                        default:
                            switch (hashCode2) {
                                case 1567:
                                    if (str4.equals("10")) {
                                        num2 = 512;
                                        break;
                                    }
                                    break;
                                case 1568:
                                    if (str4.equals("11")) {
                                        num2 = 1024;
                                        break;
                                    }
                                    break;
                                case 1569:
                                    if (str4.equals("12")) {
                                        num2 = 2048;
                                        break;
                                    }
                                    break;
                                case 1570:
                                    if (str4.equals("13")) {
                                        num2 = 4096;
                                        break;
                                    }
                                    break;
                            }
                    }
                    if (num2 == null) {
                        return new Pair(num, num2);
                    }
                    AbstractC0467k.B(str4, "Unknown Dolby Vision level string: ", "CodecSpecificDataUtil");
                    return null;
                }
                num2 = null;
                if (num2 == null) {
                }
            } else if (group.equals("10")) {
                num = 1024;
                if (num == null) {
                }
            }
        }
        num = null;
        if (num == null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ae, code lost:
    
        if (r11.equals("L123") != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair b(String str, String[] strArr, C1242lE c1242lE) {
        int i;
        Integer num;
        if (strArr.length < 4) {
            AbstractC0467k.B(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f13968c.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC0467k.B(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        char c5 = 6;
        if ("1".equals(group)) {
            i = 1;
        } else if ("2".equals(group)) {
            i = (c1242lE == null || c1242lE.f14334c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(group)) {
                AbstractC0467k.B(group, "Unknown HEVC profile string: ", "CodecSpecificDataUtil");
                return null;
            }
            i = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (str2.equals("H30")) {
                        c5 = '\r';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 70914:
                    if (str2.equals("H60")) {
                        c5 = 14;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        c5 = 15;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 71007:
                    if (str2.equals("H90")) {
                        c5 = 16;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        c5 = 17;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 74758:
                    if (str2.equals("L60")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        c5 = 18;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        c5 = 19;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        c5 = 20;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        c5 = 21;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        c5 = 22;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        c5 = 23;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        c5 = 24;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        c5 = 25;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2312806:
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        c5 = 7;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        c5 = '\b';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        c5 = '\t';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        c5 = '\n';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        c5 = 11;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
                        c5 = '\f';
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                    num = 1;
                    break;
                case 1:
                    num = 4;
                    break;
                case 2:
                    num = 16;
                    break;
                case 3:
                    num = 64;
                    break;
                case 4:
                    num = 256;
                    break;
                case 5:
                    num = 1024;
                    break;
                case 6:
                    num = 4096;
                    break;
                case 7:
                    num = 16384;
                    break;
                case '\b':
                    num = 65536;
                    break;
                case '\t':
                    num = 262144;
                    break;
                case '\n':
                    num = 1048576;
                    break;
                case 11:
                    num = 4194304;
                    break;
                case '\f':
                    num = 16777216;
                    break;
                case '\r':
                    num = 2;
                    break;
                case 14:
                    num = 8;
                    break;
                case 15:
                    num = 32;
                    break;
                case 16:
                    num = 128;
                    break;
                case 17:
                    num = 512;
                    break;
                case 18:
                    num = 2048;
                    break;
                case 19:
                    num = 8192;
                    break;
                case 20:
                    num = 32768;
                    break;
                case C1639u7.zzm /* 21 */:
                    num = 131072;
                    break;
                case 22:
                    num = 524288;
                    break;
                case 23:
                    num = 2097152;
                    break;
                case 24:
                    num = 8388608;
                    break;
                case 25:
                    num = 33554432;
                    break;
            }
            if (num == null) {
                return new Pair(Integer.valueOf(i), num);
            }
            AbstractC0467k.B(str2, "Unknown HEVC level string: ", "CodecSpecificDataUtil");
            return null;
        }
        num = null;
        if (num == null) {
        }
    }

    public static String c(int i, boolean z3, int i5, int i6, int[] iArr, int i7) {
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", f13967b[i], Integer.valueOf(i5), Integer.valueOf(i6), Character.valueOf(true != z3 ? 'L' : 'H'), Integer.valueOf(i7)));
        int i8 = 6;
        while (i8 > 0) {
            int i9 = i8 - 1;
            if (iArr[i9] != 0) {
                break;
            }
            i8 = i9;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i10])));
        }
        return sb.toString();
    }
}
