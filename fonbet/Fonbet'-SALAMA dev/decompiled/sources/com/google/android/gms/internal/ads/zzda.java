package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzda {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zza(zzz zzzVar) {
        char c3;
        int parseInt;
        int parseInt2;
        int i7;
        int i8;
        Integer num;
        Integer num2;
        String str = zzzVar.zzk;
        if (str != null) {
            String[] split = str.split("\\.");
            int i9 = 3;
            int i10 = 2;
            int i11 = 1;
            if (!"video/dolby-vision".equals(zzzVar.zzo)) {
                String str2 = split[0];
                switch (str2.hashCode()) {
                    case 3004662:
                        if (str2.equals("av01")) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 3006243:
                        if (str2.equals("avc1")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 3006244:
                        if (str2.equals("avc2")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 3199032:
                        if (str2.equals("hev1")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 3214780:
                        if (str2.equals("hvc1")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 3356560:
                        if (str2.equals("mp4a")) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 3475740:
                        if (str2.equals("s263")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 3624515:
                        if (str2.equals("vp09")) {
                            c3 = 3;
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
                        String str3 = zzzVar.zzk;
                        Pair pair = new Pair(1, 1);
                        if (split.length < 3) {
                            AbstractC0486a1.o(str3, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                        } else {
                            try {
                                return new Pair(Integer.valueOf(Integer.parseInt(split[1])), Integer.valueOf(Integer.parseInt(split[2])));
                            } catch (NumberFormatException unused) {
                                AbstractC0486a1.o(str3, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                            }
                        }
                        return pair;
                    case 1:
                    case 2:
                        String str4 = zzzVar.zzk;
                        int length = split.length;
                        if (length >= 2) {
                            try {
                                if (split[1].length() != 6) {
                                    if (length < 3) {
                                        zzdq.zzf("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str4);
                                        break;
                                    } else {
                                        parseInt = Integer.parseInt(split[1]);
                                        parseInt2 = Integer.parseInt(split[2]);
                                    }
                                } else {
                                    parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                    parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                                }
                                if (parseInt == 66) {
                                    i10 = 1;
                                } else if (parseInt != 77) {
                                    i10 = parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : 16 : 8 : 4;
                                }
                                if (i10 == -1) {
                                    AbstractC0486a1.k(parseInt, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                                    break;
                                } else {
                                    switch (parseInt2) {
                                        case 10:
                                            break;
                                        case 11:
                                            i11 = 4;
                                            break;
                                        case 12:
                                            i11 = 8;
                                            break;
                                        case 13:
                                            i11 = 16;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 20:
                                                    i11 = 32;
                                                    break;
                                                case zzbbd.zzt.zzm /* 21 */:
                                                    i11 = 64;
                                                    break;
                                                case 22:
                                                    i11 = 128;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 30:
                                                            i11 = 256;
                                                            break;
                                                        case 31:
                                                            i11 = 512;
                                                            break;
                                                        case 32:
                                                            i11 = 1024;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 40:
                                                                    i11 = 2048;
                                                                    break;
                                                                case 41:
                                                                    i11 = 4096;
                                                                    break;
                                                                case 42:
                                                                    i11 = 8192;
                                                                    break;
                                                                default:
                                                                    switch (parseInt2) {
                                                                        case 50:
                                                                            i11 = 16384;
                                                                            break;
                                                                        case 51:
                                                                            i11 = 32768;
                                                                            break;
                                                                        case 52:
                                                                            i11 = 65536;
                                                                            break;
                                                                        default:
                                                                            i11 = -1;
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                    if (i11 != -1) {
                                        return new Pair(Integer.valueOf(i10), Integer.valueOf(i11));
                                    }
                                    AbstractC0486a1.k(parseInt2, "Unknown AVC level: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } catch (NumberFormatException unused2) {
                                AbstractC0486a1.o(str4, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } else {
                            AbstractC0486a1.o(str4, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                            break;
                        }
                    case 3:
                        String str5 = zzzVar.zzk;
                        if (split.length >= 3) {
                            try {
                                int parseInt3 = Integer.parseInt(split[1]);
                                int parseInt4 = Integer.parseInt(split[2]);
                                int i12 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                                if (i12 == -1) {
                                    AbstractC0486a1.k(parseInt3, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                                    break;
                                } else {
                                    if (parseInt4 != 10) {
                                        if (parseInt4 == 11) {
                                            i11 = 2;
                                        } else if (parseInt4 == 20) {
                                            i11 = 4;
                                        } else if (parseInt4 == 21) {
                                            i11 = 8;
                                        } else if (parseInt4 == 30) {
                                            i11 = 16;
                                        } else if (parseInt4 == 31) {
                                            i11 = 32;
                                        } else if (parseInt4 == 40) {
                                            i11 = 64;
                                        } else if (parseInt4 == 41) {
                                            i11 = 128;
                                        } else if (parseInt4 == 50) {
                                            i11 = 256;
                                        } else if (parseInt4 != 51) {
                                            switch (parseInt4) {
                                                case 60:
                                                    i11 = 2048;
                                                    break;
                                                case 61:
                                                    i11 = 4096;
                                                    break;
                                                case 62:
                                                    i11 = 8192;
                                                    break;
                                                default:
                                                    i11 = -1;
                                                    break;
                                            }
                                        } else {
                                            i11 = 512;
                                        }
                                    }
                                    if (i11 != -1) {
                                        return new Pair(Integer.valueOf(i12), Integer.valueOf(i11));
                                    }
                                    AbstractC0486a1.k(parseInt4, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } catch (NumberFormatException unused3) {
                                AbstractC0486a1.o(str5, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } else {
                            AbstractC0486a1.o(str5, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                            break;
                        }
                    case 4:
                    case 5:
                        return zzb(zzzVar.zzk, split, zzzVar.zzC);
                    case 6:
                        String str6 = zzzVar.zzk;
                        zzk zzkVar = zzzVar.zzC;
                        if (split.length >= 4) {
                            try {
                                int parseInt5 = Integer.parseInt(split[1]);
                                int parseInt6 = Integer.parseInt(split[2].substring(0, 2));
                                int parseInt7 = Integer.parseInt(split[3]);
                                if (parseInt5 != 0) {
                                    AbstractC0486a1.k(parseInt5, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                                    break;
                                } else {
                                    if (parseInt7 == 8) {
                                        i7 = 1;
                                    } else if (parseInt7 != 10) {
                                        AbstractC0486a1.k(parseInt7, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                                        break;
                                    } else {
                                        i7 = (zzkVar == null || !(zzkVar.zze != null || (i8 = zzkVar.zzd) == 7 || i8 == 6)) ? 2 : 4096;
                                    }
                                    switch (parseInt6) {
                                        case 0:
                                            break;
                                        case 1:
                                            i11 = 2;
                                            break;
                                        case 2:
                                            i11 = 4;
                                            break;
                                        case 3:
                                            i11 = 8;
                                            break;
                                        case 4:
                                            i11 = 16;
                                            break;
                                        case 5:
                                            i11 = 32;
                                            break;
                                        case 6:
                                            i11 = 64;
                                            break;
                                        case 7:
                                            i11 = 128;
                                            break;
                                        case 8:
                                            i11 = 256;
                                            break;
                                        case 9:
                                            i11 = 512;
                                            break;
                                        case 10:
                                            i11 = 1024;
                                            break;
                                        case 11:
                                            i11 = 2048;
                                            break;
                                        case 12:
                                            i11 = 4096;
                                            break;
                                        case 13:
                                            i11 = 8192;
                                            break;
                                        case 14:
                                            i11 = 16384;
                                            break;
                                        case 15:
                                            i11 = 32768;
                                            break;
                                        case 16:
                                            i11 = 65536;
                                            break;
                                        case 17:
                                            i11 = 131072;
                                            break;
                                        case 18:
                                            i11 = 262144;
                                            break;
                                        case 19:
                                            i11 = 524288;
                                            break;
                                        case 20:
                                            i11 = 1048576;
                                            break;
                                        case zzbbd.zzt.zzm /* 21 */:
                                            i11 = 2097152;
                                            break;
                                        case 22:
                                            i11 = 4194304;
                                            break;
                                        case 23:
                                            i11 = 8388608;
                                            break;
                                        default:
                                            i11 = -1;
                                            break;
                                    }
                                    if (i11 != -1) {
                                        return new Pair(Integer.valueOf(i7), Integer.valueOf(i11));
                                    }
                                    AbstractC0486a1.k(parseInt6, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } catch (NumberFormatException unused4) {
                                AbstractC0486a1.o(str6, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } else {
                            AbstractC0486a1.o(str6, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                            break;
                        }
                    case 7:
                        String str7 = zzzVar.zzk;
                        if (split.length == 3) {
                            try {
                                if ("audio/mp4a-latm".equals(zzay.zzd(Integer.parseInt(split[1], 16)))) {
                                    int parseInt8 = Integer.parseInt(split[2]);
                                    if (parseInt8 == 17) {
                                        i9 = 17;
                                    } else if (parseInt8 == 20) {
                                        i9 = 20;
                                    } else if (parseInt8 == 23) {
                                        i9 = 23;
                                    } else if (parseInt8 == 29) {
                                        i9 = 29;
                                    } else if (parseInt8 == 39) {
                                        i9 = 39;
                                    } else if (parseInt8 != 42) {
                                        switch (parseInt8) {
                                            case 1:
                                                i9 = 1;
                                                break;
                                            case 2:
                                                i9 = 2;
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                i9 = 4;
                                                break;
                                            case 5:
                                                i9 = 5;
                                                break;
                                            case 6:
                                                i9 = 6;
                                                break;
                                            default:
                                                i9 = -1;
                                                break;
                                        }
                                    } else {
                                        i9 = 42;
                                    }
                                    if (i9 != -1) {
                                        return new Pair(Integer.valueOf(i9), 0);
                                    }
                                }
                            } catch (NumberFormatException unused5) {
                                AbstractC0486a1.o(str7, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } else {
                            AbstractC0486a1.o(str7, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                            break;
                        }
                        break;
                }
            } else {
                String str8 = zzzVar.zzk;
                if (split.length < 3) {
                    AbstractC0486a1.o(str8, "Ignoring malformed Dolby Vision codec string: ", "CodecSpecificDataUtil");
                } else {
                    Matcher matcher = zzd.matcher(split[1]);
                    if (matcher.matches()) {
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
                                    AbstractC0486a1.o(group, "Unknown Dolby Vision profile string: ", "CodecSpecificDataUtil");
                                } else {
                                    String str9 = split[2];
                                    if (str9 != null) {
                                        int hashCode2 = str9.hashCode();
                                        switch (hashCode2) {
                                            case 1537:
                                                if (str9.equals("01")) {
                                                    num2 = 1;
                                                    break;
                                                }
                                                break;
                                            case 1538:
                                                if (str9.equals("02")) {
                                                    num2 = 2;
                                                    break;
                                                }
                                                break;
                                            case 1539:
                                                if (str9.equals("03")) {
                                                    num2 = 4;
                                                    break;
                                                }
                                                break;
                                            case 1540:
                                                if (str9.equals("04")) {
                                                    num2 = 8;
                                                    break;
                                                }
                                                break;
                                            case 1541:
                                                if (str9.equals("05")) {
                                                    num2 = 16;
                                                    break;
                                                }
                                                break;
                                            case 1542:
                                                if (str9.equals("06")) {
                                                    num2 = 32;
                                                    break;
                                                }
                                                break;
                                            case 1543:
                                                if (str9.equals("07")) {
                                                    num2 = 64;
                                                    break;
                                                }
                                                break;
                                            case 1544:
                                                if (str9.equals("08")) {
                                                    num2 = 128;
                                                    break;
                                                }
                                                break;
                                            case 1545:
                                                if (str9.equals("09")) {
                                                    num2 = 256;
                                                    break;
                                                }
                                                break;
                                            default:
                                                switch (hashCode2) {
                                                    case 1567:
                                                        if (str9.equals("10")) {
                                                            num2 = 512;
                                                            break;
                                                        }
                                                        break;
                                                    case 1568:
                                                        if (str9.equals("11")) {
                                                            num2 = 1024;
                                                            break;
                                                        }
                                                        break;
                                                    case 1569:
                                                        if (str9.equals("12")) {
                                                            num2 = 2048;
                                                            break;
                                                        }
                                                        break;
                                                    case 1570:
                                                        if (str9.equals("13")) {
                                                            num2 = 4096;
                                                            break;
                                                        }
                                                        break;
                                                }
                                        }
                                        if (num2 == null) {
                                            return new Pair(num, num2);
                                        }
                                        AbstractC0486a1.o(str9, "Unknown Dolby Vision level string: ", "CodecSpecificDataUtil");
                                    }
                                    num2 = null;
                                    if (num2 == null) {
                                    }
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
                    } else {
                        AbstractC0486a1.o(str8, "Ignoring malformed Dolby Vision codec string: ", "CodecSpecificDataUtil");
                    }
                }
            }
        }
        return null;
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
    public static Pair zzb(String str, String[] strArr, zzk zzkVar) {
        int i7;
        Integer num;
        if (strArr.length < 4) {
            AbstractC0486a1.o(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC0486a1.o(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        char c3 = 6;
        if ("1".equals(group)) {
            i7 = 1;
        } else if ("2".equals(group)) {
            i7 = (zzkVar == null || zzkVar.zzd != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(group)) {
                AbstractC0486a1.o(group, "Unknown HEVC profile string: ", "CodecSpecificDataUtil");
                return null;
            }
            i7 = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (str2.equals("H30")) {
                        c3 = '\r';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 70914:
                    if (str2.equals("H60")) {
                        c3 = 14;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        c3 = 15;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 71007:
                    if (str2.equals("H90")) {
                        c3 = 16;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        c3 = 17;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 74758:
                    if (str2.equals("L60")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        c3 = 18;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        c3 = 19;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        c3 = 20;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        c3 = 21;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        c3 = 22;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        c3 = 23;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        c3 = 24;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        c3 = 25;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2312806:
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        c3 = '\t';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        c3 = '\n';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        c3 = 11;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
                        c3 = '\f';
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
                case zzbbd.zzt.zzm /* 21 */:
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
                return new Pair(Integer.valueOf(i7), num);
            }
            AbstractC0486a1.o(str2, "Unknown HEVC level string: ", "CodecSpecificDataUtil");
            return null;
        }
        num = null;
        if (num == null) {
        }
    }

    public static String zzc(int i7, int i8, int i9) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
    }

    public static String zzd(int i7, boolean z4, int i8, int i9, int[] iArr, int i10) {
        int i11;
        Object[] objArr = {zzc[i7], Integer.valueOf(i8), Integer.valueOf(i9), Character.valueOf(true != z4 ? 'L' : 'H'), Integer.valueOf(i10)};
        int i12 = zzen.zza;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i13 = 6;
        while (true) {
            if (i13 <= 0) {
                break;
            }
            int i14 = i13 - 1;
            if (iArr[i14] != 0) {
                break;
            }
            i13 = i14;
        }
        for (i11 = 0; i11 < i13; i11++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i11])));
        }
        return sb.toString();
    }

    public static byte[] zze(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = new byte[i8 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i7, bArr2, 4, i8);
        return bArr2;
    }
}
