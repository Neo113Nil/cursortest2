package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.core.view.InputDeviceCompat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzdk {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x039a, code lost:
    
        if (r8.equals("hvc1") != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x03a3, code lost:
    
        if (r8.equals("hev1") != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x03b4, code lost:
    
        if (r8.equals("avc2") != false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03bf, code lost:
    
        r0 = r22.zzk;
        r1 = r3.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x03c4, code lost:
    
        if (r1 >= 2) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03c6, code lost:
    
        com.google.android.gms.internal.ads.zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(java.lang.String.valueOf(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03d8, code lost:
    
        if (r3[1].length() != 6) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03da, code lost:
    
        r1 = java.lang.Integer.parseInt(r3[1].substring(0, 2), 16);
        r0 = java.lang.Integer.parseInt(r3[1].substring(4), 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x03ff, code lost:
    
        if (r1 == 66) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0403, code lost:
    
        if (r1 == 77) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0407, code lost:
    
        if (r1 == 88) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x040b, code lost:
    
        if (r1 == 100) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x040f, code lost:
    
        if (r1 == 110) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0413, code lost:
    
        if (r1 == 122) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0417, code lost:
    
        if (r1 == 244) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0419, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x041b, code lost:
    
        r5 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x041e, code lost:
    
        r5 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0421, code lost:
    
        r5 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0423, code lost:
    
        r5 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0425, code lost:
    
        r5 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0428, code lost:
    
        if (r5 != (-1)) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x042a, code lost:
    
        com.google.android.gms.internal.ads.zzea.zzf("CodecSpecificDataUtil", "Unknown AVC profile: " + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x043c, code lost:
    
        switch(r0) {
            case 10: goto L281;
            case 11: goto L280;
            case 12: goto L279;
            case 13: goto L278;
            default: goto L261;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x043f, code lost:
    
        switch(r0) {
            case 20: goto L277;
            case 21: goto L276;
            case 22: goto L275;
            default: goto L262;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0442, code lost:
    
        switch(r0) {
            case 30: goto L274;
            case 31: goto L273;
            case 32: goto L272;
            default: goto L263;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0445, code lost:
    
        switch(r0) {
            case 40: goto L271;
            case 41: goto L270;
            case 42: goto L269;
            default: goto L264;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0448, code lost:
    
        switch(r0) {
            case 50: goto L268;
            case 51: goto L267;
            case 52: goto L266;
            default: goto L265;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x044b, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0478, code lost:
    
        if (r1 != (-1)) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x047a, code lost:
    
        com.google.android.gms.internal.ads.zzea.zzf("CodecSpecificDataUtil", "Unknown AVC level: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x044d, code lost:
    
        r1 = 65536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0450, code lost:
    
        r1 = 32768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0454, code lost:
    
        r1 = 16384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0457, code lost:
    
        r1 = 8192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x045a, code lost:
    
        r1 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x045c, code lost:
    
        r1 = 2048;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x045f, code lost:
    
        r1 = 1024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0462, code lost:
    
        r1 = 512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0465, code lost:
    
        r1 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0468, code lost:
    
        r1 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x046b, code lost:
    
        r1 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x046e, code lost:
    
        r1 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0471, code lost:
    
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0473, code lost:
    
        r1 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0475, code lost:
    
        r1 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0477, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0427, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x03ef, code lost:
    
        if (r1 < 3) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x03f1, code lost:
    
        r1 = java.lang.Integer.parseInt(r3[1]);
        r0 = java.lang.Integer.parseInt(r3[2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x049a, code lost:
    
        com.google.android.gms.internal.ads.zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x04aa, code lost:
    
        com.google.android.gms.internal.ads.zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(java.lang.String.valueOf(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x03bd, code lost:
    
        if (r8.equals("avc1") != false) goto L227;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0606  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zza(zzz zzzVar) {
        int i;
        int i2;
        int i3;
        Integer num;
        Integer num2;
        String str = zzzVar.zzk;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        int i4 = 8;
        int i5 = 3;
        int i6 = 2;
        if (!"video/dolby-vision".equals(zzzVar.zzo)) {
            int i7 = 0;
            String str2 = split[0];
            switch (str2.hashCode()) {
                case 2986313:
                    if (str2.equals("ac-4")) {
                        if (split.length != 4) {
                            zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(str));
                            break;
                        } else {
                            try {
                                int parseInt = Integer.parseInt(split[1]);
                                int parseInt2 = Integer.parseInt(split[2]);
                                int parseInt3 = Integer.parseInt(split[3]);
                                if (parseInt != 0) {
                                    if (parseInt != 1) {
                                        if (parseInt == 2) {
                                            if (parseInt2 == 1) {
                                                i = 1026;
                                                i7 = 1;
                                            } else if (parseInt2 == 2) {
                                                i = 1028;
                                                i7 = 2;
                                            }
                                        }
                                        i7 = parseInt2;
                                        i = -1;
                                    } else if (parseInt2 == 0) {
                                        i = InputDeviceCompat.SOURCE_DPAD;
                                    } else {
                                        if (parseInt2 == 1) {
                                            i = 514;
                                            i7 = 1;
                                        }
                                        i7 = parseInt2;
                                        i = -1;
                                    }
                                    if (i != -1) {
                                        if (parseInt3 == 0) {
                                            i4 = 1;
                                        } else if (parseInt3 == 1) {
                                            i4 = 2;
                                        } else if (parseInt3 == 2) {
                                            i4 = 4;
                                        } else if (parseInt3 != 3) {
                                            i4 = parseInt3 != 4 ? -1 : 16;
                                        }
                                        if (i4 != -1) {
                                            break;
                                        } else {
                                            zzea.zzf("CodecSpecificDataUtil", "Unknown AC-4 level: " + parseInt3);
                                            break;
                                        }
                                    } else {
                                        zzea.zzf("CodecSpecificDataUtil", "Unknown AC-4 profile: " + parseInt + "." + i7);
                                        break;
                                    }
                                } else {
                                    if (parseInt2 == 0) {
                                        i = 257;
                                        if (i != -1) {
                                        }
                                    }
                                    i7 = parseInt2;
                                    i = -1;
                                    if (i != -1) {
                                    }
                                }
                            } catch (NumberFormatException unused) {
                                zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(str));
                                return null;
                            }
                        }
                    }
                    break;
                case 3004662:
                    if (str2.equals("av01")) {
                        String str3 = zzzVar.zzk;
                        zzk zzkVar = zzzVar.zzE;
                        if (split.length < 4) {
                            zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str3)));
                            break;
                        } else {
                            try {
                                int parseInt4 = Integer.parseInt(split[1]);
                                int parseInt5 = Integer.parseInt(split[2].substring(0, 2));
                                int parseInt6 = Integer.parseInt(split[3]);
                                if (parseInt4 == 0) {
                                    if (parseInt6 == 8) {
                                        i2 = 1;
                                    } else if (parseInt6 != 10) {
                                        zzea.zzf("CodecSpecificDataUtil", "Unknown AV1 bit depth: " + parseInt6);
                                        break;
                                    } else {
                                        i2 = (zzkVar == null || !(zzkVar.zze != null || (i3 = zzkVar.zzd) == 7 || i3 == 6)) ? 2 : 4096;
                                    }
                                    switch (parseInt5) {
                                        case 0:
                                            i6 = 1;
                                            break;
                                        case 1:
                                            break;
                                        case 2:
                                            i6 = 4;
                                            break;
                                        case 3:
                                            i6 = 8;
                                            break;
                                        case 4:
                                            i6 = 16;
                                            break;
                                        case 5:
                                            i6 = 32;
                                            break;
                                        case 6:
                                            i6 = 64;
                                            break;
                                        case 7:
                                            i6 = 128;
                                            break;
                                        case 8:
                                            i6 = 256;
                                            break;
                                        case 9:
                                            i6 = 512;
                                            break;
                                        case 10:
                                            i6 = 1024;
                                            break;
                                        case 11:
                                            i6 = 2048;
                                            break;
                                        case 12:
                                            i6 = 4096;
                                            break;
                                        case 13:
                                            i6 = 8192;
                                            break;
                                        case 14:
                                            i6 = 16384;
                                            break;
                                        case 15:
                                            i6 = 32768;
                                            break;
                                        case 16:
                                            i6 = 65536;
                                            break;
                                        case 17:
                                            i6 = 131072;
                                            break;
                                        case 18:
                                            i6 = 262144;
                                            break;
                                        case 19:
                                            i6 = 524288;
                                            break;
                                        case 20:
                                            i6 = 1048576;
                                            break;
                                        case 21:
                                            i6 = 2097152;
                                            break;
                                        case 22:
                                            i6 = 4194304;
                                            break;
                                        case 23:
                                            i6 = 8388608;
                                            break;
                                        default:
                                            i6 = -1;
                                            break;
                                    }
                                    if (i6 != -1) {
                                        break;
                                    } else {
                                        zzea.zzf("CodecSpecificDataUtil", "Unknown AV1 level: " + parseInt5);
                                        break;
                                    }
                                } else {
                                    zzea.zzf("CodecSpecificDataUtil", "Unknown AV1 profile: " + parseInt4);
                                    break;
                                }
                            } catch (NumberFormatException unused2) {
                                zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str3)));
                                return null;
                            }
                        }
                    }
                    break;
                case 3006243:
                    break;
                case 3006244:
                    break;
                case 3199032:
                    break;
                case 3214780:
                    break;
                case 3356560:
                    if (str2.equals("mp4a")) {
                        String str4 = zzzVar.zzk;
                        if (split.length != 3) {
                            zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str4)));
                            break;
                        } else {
                            try {
                                if ("audio/mp4a-latm".equals(zzay.zzd(Integer.parseInt(split[1], 16)))) {
                                    int parseInt7 = Integer.parseInt(split[2]);
                                    if (parseInt7 == 17) {
                                        i5 = 17;
                                    } else if (parseInt7 == 20) {
                                        i5 = 20;
                                    } else if (parseInt7 == 23) {
                                        i5 = 23;
                                    } else if (parseInt7 == 29) {
                                        i5 = 29;
                                    } else if (parseInt7 == 39) {
                                        i5 = 39;
                                    } else if (parseInt7 != 42) {
                                        switch (parseInt7) {
                                            case 1:
                                                i5 = 1;
                                                break;
                                            case 2:
                                                i5 = 2;
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                i5 = 4;
                                                break;
                                            case 5:
                                                i5 = 5;
                                                break;
                                            case 6:
                                                i5 = 6;
                                                break;
                                            default:
                                                i5 = -1;
                                                break;
                                        }
                                    } else {
                                        i5 = 42;
                                    }
                                    if (i5 != -1) {
                                        break;
                                    }
                                }
                            } catch (NumberFormatException unused3) {
                                zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str4)));
                                return null;
                            }
                        }
                    }
                    break;
                case 3475740:
                    if (str2.equals("s263")) {
                        String str5 = zzzVar.zzk;
                        Pair pair = new Pair(1, 1);
                        if (split.length < 3) {
                            zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str5)));
                            break;
                        } else {
                            try {
                                break;
                            } catch (NumberFormatException unused4) {
                                zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str5)));
                                return pair;
                            }
                        }
                    }
                    break;
                case 3624515:
                    if (str2.equals("vp09")) {
                        String str6 = zzzVar.zzk;
                        if (split.length < 3) {
                            zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str6)));
                            break;
                        } else {
                            try {
                                int parseInt8 = Integer.parseInt(split[1]);
                                int parseInt9 = Integer.parseInt(split[2]);
                                int i8 = parseInt8 != 0 ? parseInt8 != 1 ? parseInt8 != 2 ? parseInt8 != 3 ? -1 : 8 : 4 : 2 : 1;
                                if (i8 != -1) {
                                    if (parseInt9 == 10) {
                                        i6 = 1;
                                    } else if (parseInt9 != 11) {
                                        if (parseInt9 == 20) {
                                            i6 = 4;
                                        } else if (parseInt9 == 21) {
                                            i6 = 8;
                                        } else if (parseInt9 == 30) {
                                            i6 = 16;
                                        } else if (parseInt9 == 31) {
                                            i6 = 32;
                                        } else if (parseInt9 == 40) {
                                            i6 = 64;
                                        } else if (parseInt9 == 41) {
                                            i6 = 128;
                                        } else if (parseInt9 == 50) {
                                            i6 = 256;
                                        } else if (parseInt9 != 51) {
                                            switch (parseInt9) {
                                                case 60:
                                                    i6 = 2048;
                                                    break;
                                                case 61:
                                                    i6 = 4096;
                                                    break;
                                                case 62:
                                                    i6 = 8192;
                                                    break;
                                                default:
                                                    i6 = -1;
                                                    break;
                                            }
                                        } else {
                                            i6 = 512;
                                        }
                                    }
                                    if (i6 != -1) {
                                        break;
                                    } else {
                                        zzea.zzf("CodecSpecificDataUtil", "Unknown VP9 level: " + parseInt9);
                                        break;
                                    }
                                } else {
                                    zzea.zzf("CodecSpecificDataUtil", "Unknown VP9 profile: " + parseInt8);
                                    break;
                                }
                            } catch (NumberFormatException unused5) {
                                zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str6)));
                                return null;
                            }
                        }
                    }
                    break;
            }
            return null;
        }
        if (split.length < 3) {
            zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
            return null;
        }
        Matcher matcher = zzd.matcher(split[1]);
        if (!matcher.matches()) {
            zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
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
                    zzea.zzf("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(group)));
                    return null;
                }
                String str7 = split[2];
                if (str7 != null) {
                    int hashCode2 = str7.hashCode();
                    switch (hashCode2) {
                        case 1537:
                            if (str7.equals("01")) {
                                num2 = 1;
                                break;
                            }
                            break;
                        case 1538:
                            if (str7.equals("02")) {
                                num2 = 2;
                                break;
                            }
                            break;
                        case 1539:
                            if (str7.equals("03")) {
                                num2 = 4;
                                break;
                            }
                            break;
                        case 1540:
                            if (str7.equals("04")) {
                                num2 = 8;
                                break;
                            }
                            break;
                        case 1541:
                            if (str7.equals("05")) {
                                num2 = 16;
                                break;
                            }
                            break;
                        case 1542:
                            if (str7.equals("06")) {
                                num2 = 32;
                                break;
                            }
                            break;
                        case 1543:
                            if (str7.equals("07")) {
                                num2 = 64;
                                break;
                            }
                            break;
                        case 1544:
                            if (str7.equals("08")) {
                                num2 = 128;
                                break;
                            }
                            break;
                        case 1545:
                            if (str7.equals("09")) {
                                num2 = 256;
                                break;
                            }
                            break;
                        default:
                            switch (hashCode2) {
                                case 1567:
                                    if (str7.equals("10")) {
                                        num2 = 512;
                                        break;
                                    }
                                    break;
                                case 1568:
                                    if (str7.equals("11")) {
                                        num2 = 1024;
                                        break;
                                    }
                                    break;
                                case 1569:
                                    if (str7.equals("12")) {
                                        num2 = 2048;
                                        break;
                                    }
                                    break;
                                case 1570:
                                    if (str7.equals("13")) {
                                        num2 = 4096;
                                        break;
                                    }
                                    break;
                            }
                    }
                    if (num2 == null) {
                        return new Pair(num, num2);
                    }
                    zzea.zzf("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str7)));
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
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zzb(String str, String[] strArr, zzk zzkVar) {
        int i;
        Integer num;
        if (strArr.length < 4) {
            zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            zzea.zzf("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String group = matcher.group(1);
        if ("1".equals(group)) {
            i = 1;
        } else {
            i = 6;
            if ("2".equals(group)) {
                i = (zzkVar == null || zzkVar.zzd != 6) ? 2 : 4096;
            } else if (!"6".equals(group)) {
                zzea.zzf("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                return null;
            }
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (str2.equals("H30")) {
                        num = 2;
                        break;
                    }
                    break;
                case 70914:
                    if (str2.equals("H60")) {
                        num = 8;
                        break;
                    }
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        num = 32;
                        break;
                    }
                    break;
                case 71007:
                    if (str2.equals("H90")) {
                        num = 128;
                        break;
                    }
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        num = 512;
                        break;
                    }
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        num = 1;
                        break;
                    }
                    break;
                case 74758:
                    if (str2.equals("L60")) {
                        num = 4;
                        break;
                    }
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        num = 16;
                        break;
                    }
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        num = 64;
                        break;
                    }
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        num = 256;
                        break;
                    }
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        num = 2048;
                        break;
                    }
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        num = 8192;
                        break;
                    }
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        num = 32768;
                        break;
                    }
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        num = 131072;
                        break;
                    }
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        num = 524288;
                        break;
                    }
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        num = 2097152;
                        break;
                    }
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        num = 8388608;
                        break;
                    }
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        num = 33554432;
                        break;
                    }
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        num = 1024;
                        break;
                    }
                    break;
                case 2312806:
                    if (str2.equals("L123")) {
                        num = 4096;
                        break;
                    }
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        num = 16384;
                        break;
                    }
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        num = 65536;
                        break;
                    }
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        num = 262144;
                        break;
                    }
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        num = 1048576;
                        break;
                    }
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        num = 4194304;
                        break;
                    }
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
                        num = 16777216;
                        break;
                    }
                    break;
            }
            if (num == null) {
                return new Pair(Integer.valueOf(i), num);
            }
            zzea.zzf("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(String.valueOf(str2)));
            return null;
        }
        num = null;
        if (num == null) {
        }
    }

    public static String zzc(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String zzd(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {zzc[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i4)};
        String str = zzex.zza;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i5 = 6;
        while (i5 > 0) {
            int i6 = i5 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i5 = i6;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }

    public static byte[] zze(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }
}
