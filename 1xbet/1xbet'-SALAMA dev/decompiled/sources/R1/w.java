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
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f6011a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f6012b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f6013c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (p151v2.t.f17159a < 26 && p151v2.t.f17160b.equals("R9") && arrayList.size() == 1 && ((m) arrayList.get(0)).f5925a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(m.g("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new M(new q(1), 3));
        }
        int i7 = p151v2.t.f17159a;
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
        Pair pairD;
        if ("audio/eac3-joc".equals(x4.f283C)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(x4.f283C) || (pairD = d(x4)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
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
    /* JADX WARN: Code duplicated, block: B:152:0x0221  */
    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    /* JADX WARN: Code duplicated, block: B:235:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:236:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:264:0x035d A[PHI: r2
      0x035d: PHI (r2v45 int) = (r2v44 int), (r2v47 int), (r2v48 int), (r2v49 int), (r2v50 int) binds: [B:245:0x0334, B:249:0x033c, B:251:0x0340, B:253:0x0344, B:255:0x0348] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:285:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:288:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:458:0x0645  */
    /* JADX WARN: Code duplicated, block: B:459:0x064c  */
    /* JADX WARN: Code duplicated, block: B:460:0x064f  */
    /* JADX WARN: Code duplicated, block: B:461:0x0652  */
    /* JADX WARN: Code duplicated, block: B:462:0x0655  */
    /* JADX WARN: Code duplicated, block: B:463:0x0658  */
    /* JADX WARN: Code duplicated, block: B:464:0x065b  */
    /* JADX WARN: Code duplicated, block: B:465:0x065e  */
    /* JADX WARN: Code duplicated, block: B:466:0x065f A[PHI: r6
      0x065f: PHI (r6v30 int) = 
      (r6v0 int)
      (r6v27 int)
      (r6v28 int)
      (r6v29 int)
      (r6v32 int)
      (r6v33 int)
      (r6v34 int)
      (r6v35 int)
      (r6v36 int)
      (r6v37 int)
      (r6v38 int)
      (r6v39 int)
      (r6v40 int)
      (r6v41 int)
      (r6v42 int)
      (r6v43 int)
     binds: [B:459:0x064c, B:480:0x0683, B:479:0x0681, B:478:0x067f, B:477:0x067c, B:476:0x0679, B:475:0x0676, B:474:0x0673, B:473:0x0670, B:472:0x066e, B:471:0x066b, B:470:0x0668, B:469:0x0666, B:468:0x0664, B:467:0x0661, B:465:0x065e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:467:0x0661  */
    /* JADX WARN: Code duplicated, block: B:468:0x0664  */
    /* JADX WARN: Code duplicated, block: B:469:0x0666  */
    /* JADX WARN: Code duplicated, block: B:470:0x0668  */
    /* JADX WARN: Code duplicated, block: B:471:0x066b  */
    /* JADX WARN: Code duplicated, block: B:472:0x066e  */
    /* JADX WARN: Code duplicated, block: B:473:0x0670  */
    /* JADX WARN: Code duplicated, block: B:474:0x0673  */
    /* JADX WARN: Code duplicated, block: B:475:0x0676  */
    /* JADX WARN: Code duplicated, block: B:476:0x0679  */
    /* JADX WARN: Code duplicated, block: B:477:0x067c  */
    /* JADX WARN: Code duplicated, block: B:478:0x067f  */
    /* JADX WARN: Code duplicated, block: B:479:0x0681  */
    /* JADX WARN: Code duplicated, block: B:480:0x0683  */
    /* JADX WARN: Code duplicated, block: B:482:0x0687  */
    /* JADX WARN: Code duplicated, block: B:483:0x068d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0119  */
    /* JADX WARN: Code duplicated, block: B:78:0x0124  */
    public static Pair d(X x4) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        byte b7;
        Integer num;
        int i15;
        int i16;
        int i17;
        Integer num2;
        Integer num3;
        Pattern pattern = f6011a;
        int i18 = 16;
        int i19 = 2;
        String str = x4.f312z;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        boolean zEquals = "video/dolby-vision".equals(x4.f283C);
        String str2 = x4.f312z;
        if (zEquals) {
            if (strArrSplit.length < 3) {
                L.l("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                return null;
            }
            Matcher matcher = pattern.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                L.l("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                switch (strGroup) {
                    case "00":
                        num2 = 1;
                        break;
                    case "01":
                        num2 = 2;
                        break;
                    case "02":
                        num2 = 4;
                        break;
                    case "03":
                        num2 = 8;
                        break;
                    case "04":
                        num2 = 16;
                        break;
                    case "05":
                        num2 = 32;
                        break;
                    case "06":
                        num2 = 64;
                        break;
                    case "07":
                        num2 = 128;
                        break;
                    case "08":
                        num2 = 256;
                        break;
                    case "09":
                        num2 = 512;
                        break;
                    default:
                        num2 = null;
                        break;
                }
            } else {
                num2 = null;
            }
            if (num2 == null) {
                L.l("Unknown Dolby Vision profile string: ", strGroup, "MediaCodecUtil");
                return null;
            }
            String str3 = strArrSplit[2];
            if (str3 != null) {
                switch (str3) {
                    case "01":
                        num3 = 1;
                        break;
                    case "02":
                        num3 = 2;
                        break;
                    case "03":
                        num3 = 4;
                        break;
                    case "04":
                        num3 = 8;
                        break;
                    case "05":
                        num3 = 16;
                        break;
                    case "06":
                        num3 = 32;
                        break;
                    case "07":
                        num3 = 64;
                        break;
                    case "08":
                        num3 = 128;
                        break;
                    case "09":
                        num3 = 256;
                        break;
                    case "10":
                        num3 = 512;
                        break;
                    case "11":
                        num3 = 1024;
                        break;
                    case "12":
                        num3 = 2048;
                        break;
                    case "13":
                        num3 = 4096;
                        break;
                    default:
                        num3 = null;
                        break;
                }
            } else {
                num3 = null;
            }
            if (num3 != null) {
                return new Pair(num2, num3);
            }
            L.l("Unknown Dolby Vision level string: ", str3, "MediaCodecUtil");
            return null;
        }
        String str4 = strArrSplit[0];
        str4.getClass();
        switch (str4) {
            case "av01":
                if (strArrSplit.length < 4) {
                    L.l("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                try {
                    int i20 = Integer.parseInt(strArrSplit[1]);
                    int i21 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i22 = Integer.parseInt(strArrSplit[3]);
                    if (i20 != 0) {
                        p150v0.a.j(i20, "Unknown AV1 profile: ", "MediaCodecUtil");
                        return null;
                    }
                    if (i22 != 8 && i22 != 10) {
                        p150v0.a.j(i22, "Unknown AV1 bit depth: ", "MediaCodecUtil");
                        return null;
                    }
                    if (i22 == 8) {
                        i7 = 1;
                    } else {
                        p156w2.b bVar = x4.f295O;
                        i7 = (bVar == null || !(bVar.f17965d != null || (i8 = bVar.f17964c) == 7 || i8 == 6)) ? 2 : 4096;
                    }
                    switch (i21) {
                        case 0:
                            i18 = 1;
                            i9 = -1;
                            break;
                        case 1:
                            i18 = 2;
                            i9 = -1;
                            break;
                        case 2:
                            i18 = 4;
                            i9 = -1;
                            break;
                        case 3:
                            i18 = 8;
                            i9 = -1;
                            break;
                        case 4:
                            i9 = -1;
                            break;
                        case 5:
                            i18 = 32;
                            i9 = -1;
                            break;
                        case 6:
                            i18 = 64;
                            i9 = -1;
                            break;
                        case 7:
                            i18 = 128;
                            i9 = -1;
                            break;
                        case 8:
                            i18 = 256;
                            i9 = -1;
                            break;
                        case 9:
                            i18 = 512;
                            i9 = -1;
                            break;
                        case 10:
                            i18 = 1024;
                            i9 = -1;
                            break;
                        case 11:
                            i18 = 2048;
                            i9 = -1;
                            break;
                        case 12:
                            i18 = 4096;
                            i9 = -1;
                            break;
                        case 13:
                            i9 = -1;
                            i18 = 8192;
                            break;
                        case 14:
                            i18 = 16384;
                            i9 = -1;
                            break;
                        case 15:
                            i18 = 32768;
                            i9 = -1;
                            break;
                        case 16:
                            i9 = -1;
                            i18 = 65536;
                            break;
                        case 17:
                            i18 = 131072;
                            i9 = -1;
                            break;
                        case 18:
                            i18 = 262144;
                            i9 = -1;
                            break;
                        case 19:
                            i18 = 524288;
                            i9 = -1;
                            break;
                        case 20:
                            i18 = 1048576;
                            i9 = -1;
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            i18 = 2097152;
                            i9 = -1;
                            break;
                        case 22:
                            i18 = 4194304;
                            i9 = -1;
                            break;
                        case 23:
                            i18 = 8388608;
                            i9 = -1;
                            break;
                        default:
                            i9 = -1;
                            i18 = -1;
                            break;
                    }
                    if (i18 != i9) {
                        return new Pair(Integer.valueOf(i7), Integer.valueOf(i18));
                    }
                    p150v0.a.j(i21, "Unknown AV1 level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused) {
                    L.l("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
            case "avc1":
            case "avc2":
                if (strArrSplit.length < 2) {
                    L.l("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i10 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i11 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        if (strArrSplit.length < 3) {
                            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str2);
                            return null;
                        }
                        i10 = Integer.parseInt(strArrSplit[1]);
                        i11 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i10 != 66) {
                        if (i10 != 77) {
                            if (i10 == 88) {
                                i19 = 4;
                            } else if (i10 == 100) {
                                i19 = 8;
                            } else if (i10 == 110) {
                                i19 = 16;
                            } else if (i10 == 122) {
                                i19 = 32;
                            } else if (i10 != 244) {
                                i12 = -1;
                                i19 = -1;
                            } else {
                                i19 = 64;
                            }
                        }
                        if (i19 == i12) {
                            p150v0.a.j(i10, "Unknown AVC profile: ", "MediaCodecUtil");
                            return null;
                        }
                        switch (i11) {
                            case 10:
                                i18 = 1;
                                i13 = -1;
                                break;
                            case 11:
                                i18 = 4;
                                i13 = -1;
                                break;
                            case 12:
                                i18 = 8;
                                i13 = -1;
                                break;
                            case 13:
                                i13 = -1;
                                break;
                            default:
                                switch (i11) {
                                    case 20:
                                        i18 = 32;
                                        i13 = -1;
                                        break;
                                    case zzbbd.zzt.zzm /* 21 */:
                                        i18 = 64;
                                        i13 = -1;
                                        break;
                                    case 22:
                                        i18 = 128;
                                        i13 = -1;
                                        break;
                                    default:
                                        switch (i11) {
                                            case 30:
                                                i18 = 256;
                                                i13 = -1;
                                                break;
                                            case 31:
                                                i18 = 512;
                                                i13 = -1;
                                                break;
                                            case 32:
                                                i18 = 1024;
                                                i13 = -1;
                                                break;
                                            default:
                                                switch (i11) {
                                                    case 40:
                                                        i18 = 2048;
                                                        i13 = -1;
                                                        break;
                                                    case 41:
                                                        i18 = 4096;
                                                        i13 = -1;
                                                        break;
                                                    case 42:
                                                        i18 = 8192;
                                                        i13 = -1;
                                                        break;
                                                    default:
                                                        switch (i11) {
                                                            case 50:
                                                                i18 = 16384;
                                                                i13 = -1;
                                                                break;
                                                            case 51:
                                                                i18 = 32768;
                                                                i13 = -1;
                                                                break;
                                                            case 52:
                                                                i18 = 65536;
                                                                i13 = -1;
                                                                break;
                                                            default:
                                                                i13 = -1;
                                                                i18 = -1;
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        if (i18 == i13) {
                            return new Pair(Integer.valueOf(i19), Integer.valueOf(i18));
                        }
                        p150v0.a.j(i11, "Unknown AVC level: ", "MediaCodecUtil");
                        return null;
                    }
                    i19 = 1;
                    i12 = -1;
                    if (i19 == i12) {
                        p150v0.a.j(i10, "Unknown AVC profile: ", "MediaCodecUtil");
                        return null;
                    }
                    switch (i11) {
                        case 10:
                            i18 = 1;
                            i13 = -1;
                            break;
                        case 11:
                            i18 = 4;
                            i13 = -1;
                            break;
                        case 12:
                            i18 = 8;
                            i13 = -1;
                            break;
                        case 13:
                            i13 = -1;
                            break;
                        default:
                            switch (i11) {
                                case 20:
                                    i18 = 32;
                                    i13 = -1;
                                    break;
                                case zzbbd.zzt.zzm /* 21 */:
                                    i18 = 64;
                                    i13 = -1;
                                    break;
                                case 22:
                                    i18 = 128;
                                    i13 = -1;
                                    break;
                                default:
                                    switch (i11) {
                                        case 30:
                                            i18 = 256;
                                            i13 = -1;
                                            break;
                                        case 31:
                                            i18 = 512;
                                            i13 = -1;
                                            break;
                                        case 32:
                                            i18 = 1024;
                                            i13 = -1;
                                            break;
                                        default:
                                            switch (i11) {
                                                case 40:
                                                    i18 = 2048;
                                                    i13 = -1;
                                                    break;
                                                case 41:
                                                    i18 = 4096;
                                                    i13 = -1;
                                                    break;
                                                case 42:
                                                    i18 = 8192;
                                                    i13 = -1;
                                                    break;
                                                default:
                                                    switch (i11) {
                                                        case 50:
                                                            i18 = 16384;
                                                            i13 = -1;
                                                            break;
                                                        case 51:
                                                            i18 = 32768;
                                                            i13 = -1;
                                                            break;
                                                        case 52:
                                                            i18 = 65536;
                                                            i13 = -1;
                                                            break;
                                                        default:
                                                            i13 = -1;
                                                            i18 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i18 == i13) {
                        return new Pair(Integer.valueOf(i19), Integer.valueOf(i18));
                    }
                    p150v0.a.j(i11, "Unknown AVC level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused2) {
                    L.l("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
            case "hev1":
            case "hvc1":
                char c3 = 11;
                if (strArrSplit.length < 4) {
                    L.l("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                Matcher matcher2 = pattern.matcher(strArrSplit[1]);
                if (!matcher2.matches()) {
                    L.l("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                String strGroup2 = matcher2.group(1);
                if ("1".equals(strGroup2)) {
                    i14 = 1;
                } else {
                    if (!"2".equals(strGroup2)) {
                        L.l("Unknown HEVC profile string: ", strGroup2, "MediaCodecUtil");
                        return null;
                    }
                    i14 = 2;
                }
                String str5 = strArrSplit[3];
                if (str5 != null) {
                    switch (str5.hashCode()) {
                        case 70821:
                            if (!str5.equals("H30")) {
                                b7 = -1;
                            } else {
                                b7 = 0;
                            }
                            break;
                        case 70914:
                            if (!str5.equals("H60")) {
                                b7 = -1;
                            } else {
                                b7 = 1;
                            }
                            break;
                        case 70917:
                            if (!str5.equals("H63")) {
                                b7 = -1;
                            } else {
                                b7 = 2;
                            }
                            break;
                        case 71007:
                            if (!str5.equals("H90")) {
                                b7 = -1;
                            } else {
                                b7 = 3;
                            }
                            break;
                        case 71010:
                            if (!str5.equals("H93")) {
                                b7 = -1;
                            } else {
                                b7 = 4;
                            }
                            break;
                        case 74665:
                            if (!str5.equals("L30")) {
                                b7 = -1;
                            } else {
                                b7 = 5;
                            }
                            break;
                        case 74758:
                            if (!str5.equals("L60")) {
                                b7 = -1;
                            } else {
                                b7 = 6;
                            }
                            break;
                        case 74761:
                            if (!str5.equals("L63")) {
                                b7 = -1;
                            } else {
                                b7 = 7;
                            }
                            break;
                        case 74851:
                            if (!str5.equals("L90")) {
                                b7 = -1;
                            } else {
                                b7 = 8;
                            }
                            break;
                        case 74854:
                            if (!str5.equals("L93")) {
                                b7 = -1;
                            } else {
                                b7 = 9;
                            }
                            break;
                        case 2193639:
                            if (!str5.equals("H120")) {
                                b7 = -1;
                            } else {
                                b7 = 10;
                            }
                            break;
                        case 2193642:
                            if (!str5.equals("H123")) {
                                b7 = -1;
                            } else {
                                b7 = c3;
                            }
                            break;
                        case 2193732:
                            if (!str5.equals("H150")) {
                                b7 = -1;
                            } else {
                                c3 = '\f';
                                b7 = c3;
                            }
                            break;
                        case 2193735:
                            if (!str5.equals("H153")) {
                                b7 = -1;
                            } else {
                                c3 = '\r';
                                b7 = c3;
                            }
                            break;
                        case 2193738:
                            if (!str5.equals("H156")) {
                                b7 = -1;
                            } else {
                                c3 = 14;
                                b7 = c3;
                            }
                            break;
                        case 2193825:
                            if (!str5.equals("H180")) {
                                b7 = -1;
                            } else {
                                c3 = 15;
                                b7 = c3;
                            }
                            break;
                        case 2193828:
                            if (!str5.equals("H183")) {
                                b7 = -1;
                            } else {
                                b7 = 16;
                            }
                            break;
                        case 2193831:
                            if (!str5.equals("H186")) {
                                b7 = -1;
                            } else {
                                c3 = 17;
                                b7 = c3;
                            }
                            break;
                        case 2312803:
                            if (!str5.equals("L120")) {
                                b7 = -1;
                            } else {
                                c3 = 18;
                                b7 = c3;
                            }
                            break;
                        case 2312806:
                            if (!str5.equals("L123")) {
                                b7 = -1;
                            } else {
                                c3 = 19;
                                b7 = c3;
                            }
                            break;
                        case 2312896:
                            if (!str5.equals("L150")) {
                                b7 = -1;
                            } else {
                                b7 = 20;
                            }
                            break;
                        case 2312899:
                            if (!str5.equals("L153")) {
                                b7 = -1;
                            } else {
                                c3 = 21;
                                b7 = c3;
                            }
                            break;
                        case 2312902:
                            if (!str5.equals("L156")) {
                                b7 = -1;
                            } else {
                                c3 = 22;
                                b7 = c3;
                            }
                            break;
                        case 2312989:
                            if (!str5.equals("L180")) {
                                b7 = -1;
                            } else {
                                c3 = 23;
                                b7 = c3;
                            }
                            break;
                        case 2312992:
                            if (!str5.equals("L183")) {
                                b7 = -1;
                            } else {
                                c3 = 24;
                                b7 = c3;
                            }
                            break;
                        case 2312995:
                            if (!str5.equals("L186")) {
                                b7 = -1;
                            } else {
                                c3 = 25;
                                b7 = c3;
                            }
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    switch (b7) {
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
                        case 8:
                            num = 64;
                            break;
                        case 9:
                            num = 256;
                            break;
                        case 10:
                            num = 2048;
                            break;
                        case 11:
                            num = 8192;
                            break;
                        case 12:
                            num = 32768;
                            break;
                        case 13:
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
                        default:
                            num = null;
                            break;
                    }
                } else {
                    num = null;
                }
                if (num != null) {
                    return new Pair(Integer.valueOf(i14), num);
                }
                L.l("Unknown HEVC level string: ", str5, "MediaCodecUtil");
                return null;
            case "mp4a":
                if (strArrSplit.length != 3) {
                    L.l("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                try {
                    if (!"audio/mp4a-latm".equals(p151v2.i.d(Integer.parseInt(strArrSplit[1], 16)))) {
                        return null;
                    }
                    int i23 = Integer.parseInt(strArrSplit[2]);
                    int i24 = 17;
                    if (i23 == 17) {
                        i19 = i24;
                        i15 = -1;
                    } else {
                        if (i23 != 20) {
                            i24 = 23;
                            if (i23 != 23) {
                                i24 = 29;
                                if (i23 != 29) {
                                    i24 = 39;
                                    if (i23 != 39) {
                                        i24 = 42;
                                        if (i23 != 42) {
                                            switch (i23) {
                                                case 1:
                                                    i19 = 1;
                                                    break;
                                                case 2:
                                                    break;
                                                case 3:
                                                    i19 = 3;
                                                    break;
                                                case 4:
                                                    i19 = 4;
                                                    break;
                                                case 5:
                                                    i19 = 5;
                                                    break;
                                                case 6:
                                                    i15 = -1;
                                                    i19 = 6;
                                                    break;
                                                default:
                                                    i15 = -1;
                                                    i19 = -1;
                                                    break;
                                            }
                                        } else {
                                            i19 = i24;
                                        }
                                    } else {
                                        i19 = i24;
                                    }
                                } else {
                                    i19 = i24;
                                }
                            } else {
                                i19 = i24;
                            }
                        } else {
                            i19 = 20;
                        }
                        i15 = -1;
                    }
                    if (i19 != i15) {
                        return new Pair(Integer.valueOf(i19), 0);
                    }
                    return null;
                } catch (NumberFormatException unused3) {
                    L.l("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
            case "vp09":
                if (strArrSplit.length < 3) {
                    L.l("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                try {
                    int i25 = Integer.parseInt(strArrSplit[1]);
                    int i26 = Integer.parseInt(strArrSplit[2]);
                    if (i25 == 0) {
                        i16 = 1;
                    } else if (i25 == 1) {
                        i16 = 2;
                    } else if (i25 != 2) {
                        i16 = i25 != 3 ? -1 : 8;
                    } else {
                        i16 = 4;
                    }
                    if (i16 == -1) {
                        p150v0.a.j(i25, "Unknown VP9 profile: ", "MediaCodecUtil");
                        return null;
                    }
                    if (i26 == 10) {
                        i18 = 1;
                    } else if (i26 == 11) {
                        i18 = 2;
                    } else if (i26 == 20) {
                        i18 = 4;
                    } else {
                        if (i26 != 21) {
                            if (i26 != 30) {
                                if (i26 == 31) {
                                    i18 = 32;
                                } else if (i26 == 40) {
                                    i18 = 64;
                                } else if (i26 == 41) {
                                    i18 = 128;
                                } else if (i26 == 50) {
                                    i18 = 256;
                                } else if (i26 != 51) {
                                    switch (i26) {
                                        case 60:
                                            i18 = 2048;
                                            break;
                                        case 61:
                                            i18 = 4096;
                                            break;
                                        case 62:
                                            i18 = 8192;
                                            break;
                                        default:
                                            i17 = -1;
                                            i18 = -1;
                                            break;
                                    }
                                } else {
                                    i18 = 512;
                                }
                            }
                            if (i18 == i17) {
                                return new Pair(Integer.valueOf(i16), Integer.valueOf(i18));
                            }
                            p150v0.a.j(i26, "Unknown VP9 level: ", "MediaCodecUtil");
                            return null;
                        }
                        i18 = 8;
                    }
                    i17 = -1;
                    if (i18 == i17) {
                        return new Pair(Integer.valueOf(i16), Integer.valueOf(i18));
                    }
                    p150v0.a.j(i26, "Unknown VP9 level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused4) {
                    L.l("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
            default:
                return null;
        }
    }

    public static synchronized List e(String str, boolean z4, boolean z7) {
        try {
            s sVar = new s(str, z4, z7);
            HashMap map = f6012b;
            List list = (List) map.get(sVar);
            if (list != null) {
                return list;
            }
            int i7 = p151v2.t.f17159a;
            ArrayList arrayListF = f(sVar, i7 >= 21 ? new B.v(z4, z7) : new V(9));
            if (z4 && arrayListF.isEmpty() && 21 <= i7 && i7 <= 23) {
                arrayListF = f(sVar, new V(9));
                if (!arrayListF.isEmpty()) {
                    Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((m) arrayListF.get(0)).f5925a);
                }
            }
            a(str, arrayListF);
            AbstractC0167z abstractC0167zE = AbstractC0167z.E(arrayListF);
            map.put(sVar, abstractC0167zE);
            return abstractC0167zE;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    public static ArrayList f(s sVar, u uVar) throws t {
        String strC;
        String str;
        String str2;
        int i7;
        boolean z4;
        boolean z7;
        boolean zIsHardwareAccelerated;
        boolean zIsVendor;
        String str3;
        s sVar2 = sVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str4 = sVar2.f6008a;
            int i8 = uVar.i();
            boolean zO = uVar.o();
            int i9 = 0;
            while (i9 < i8) {
                MediaCodecInfo mediaCodecInfoA = uVar.a(i9);
                int i10 = p151v2.t.f17159a;
                if (i10 < 29 || !mediaCodecInfoA.isAlias()) {
                    String name = mediaCodecInfoA.getName();
                    if (g(mediaCodecInfoA, name, zO, str4) && (strC = c(mediaCodecInfoA, name, str4)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(strC);
                            boolean zB = uVar.b("tunneled-playback", strC, capabilitiesForType);
                            boolean zH = uVar.h("tunneled-playback", capabilitiesForType);
                            boolean z8 = sVar2.f6010c;
                            if ((z8 || !zH) && (!z8 || zB)) {
                                boolean zB2 = uVar.b("secure-playback", strC, capabilitiesForType);
                                boolean zH2 = uVar.h("secure-playback", capabilitiesForType);
                                boolean z9 = sVar2.f6009b;
                                if ((z9 || !zH2) && (!z9 || zB2)) {
                                    if (i10 >= 29) {
                                        zIsHardwareAccelerated = mediaCodecInfoA.isHardwareAccelerated();
                                        z7 = true;
                                    } else {
                                        z7 = true;
                                        zIsHardwareAccelerated = !h(mediaCodecInfoA, str4);
                                    }
                                    boolean zH3 = h(mediaCodecInfoA, str4);
                                    if (i10 >= 29) {
                                        zIsVendor = mediaCodecInfoA.isVendor();
                                    } else {
                                        String strA0 = D.a0(mediaCodecInfoA.getName());
                                        zIsVendor = (strA0.startsWith("omx.google.") || strA0.startsWith("c2.android.") || strA0.startsWith("c2.google.")) ? false : z7;
                                    }
                                    if (!(zO && z9 == zB2) && (zO || z9)) {
                                        str = strC;
                                        str3 = name;
                                        i7 = i9;
                                        z4 = zO;
                                        if (!z4 && zB2) {
                                            StringBuilder sb = new StringBuilder();
                                            try {
                                                sb.append(str3);
                                                sb.append(".secure");
                                                str2 = str3;
                                                try {
                                                    arrayList.add(m.g(sb.toString(), str4, str, capabilitiesForType, zIsHardwareAccelerated, zH3, zIsVendor, true));
                                                    return arrayList;
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    if (p151v2.t.f17159a <= 23) {
                                                    }
                                                    Log.e("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                            } catch (Exception e8) {
                                                e = e8;
                                                str2 = str3;
                                            }
                                        }
                                    } else {
                                        str = strC;
                                        str3 = name;
                                        i7 = i9;
                                        z4 = zO;
                                        try {
                                            arrayList.add(m.g(name, str4, strC, capabilitiesForType, zIsHardwareAccelerated, zH3, zIsVendor, false));
                                        } catch (Exception e9) {
                                            e = e9;
                                            str2 = str3;
                                            if (p151v2.t.f17159a <= 23 || arrayList.isEmpty()) {
                                                Log.e("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                            Log.e("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                        }
                                    }
                                } else {
                                    i7 = i9;
                                    z4 = zO;
                                }
                            } else {
                                i7 = i9;
                                z4 = zO;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            str = strC;
                            str2 = name;
                            i7 = i9;
                            z4 = zO;
                        }
                    } else {
                        i7 = i9;
                        z4 = zO;
                    }
                } else {
                    i7 = i9;
                    z4 = zO;
                }
                i9 = i7 + 1;
                sVar2 = sVar;
                zO = z4;
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
        int i7 = p151v2.t.f17159a;
        if (i7 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i7 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = p151v2.t.f17160b;
            if ("a70".equals(str3) || ("Xiaomi".equals(p151v2.t.f17161c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i7 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = p151v2.t.f17160b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i7 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = p151v2.t.f17160b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i7 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(p151v2.t.f17161c))) {
            String str6 = p151v2.t.f17160b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i7 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(p151v2.t.f17161c)) {
            String str7 = p151v2.t.f17160b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i7 <= 19 && p151v2.t.f17160b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i7 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (p151v2.t.f17159a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (p151v2.i.h(str)) {
            return true;
        }
        String strA0 = D.a0(mediaCodecInfo.getName());
        if (strA0.startsWith("arc.")) {
            return false;
        }
        if (strA0.startsWith("omx.google.") || strA0.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strA0.startsWith("omx.sec.") && strA0.contains(".sw.")) || strA0.equals("omx.qcom.video.decoder.hevcswvdec") || strA0.startsWith("c2.android.") || strA0.startsWith("c2.google.")) {
            return true;
        }
        return (strA0.startsWith("omx.") || strA0.startsWith("c2.")) ? false : true;
    }

    public static int i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i7;
        if (f6013c == -1) {
            int iMax = 0;
            List listE = e("video/avc", false, false);
            m mVar = listE.isEmpty() ? null : (m) listE.get(0);
            if (mVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f5928d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i8 = codecProfileLevelArr[iMax].level;
                    if (i8 != 1 && i8 != 2) {
                        switch (i8) {
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
                    iMax2 = Math.max(i7, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, p151v2.t.f17159a >= 21 ? 345600 : 172800);
            }
            f6013c = iMax;
        }
        return f6013c;
    }
}
