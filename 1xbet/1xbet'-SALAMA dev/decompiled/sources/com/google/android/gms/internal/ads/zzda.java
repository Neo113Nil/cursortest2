package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.util.Pair;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zzda {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v21 int, still in use, count: 1, list:
      (r3v21 int) from 0x005d: IF  (r3v21 int) != (1567 int)  -> B:18:0x005f A[HIDDEN] (LINE:94)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v21 int, still in use, count: 1, list:
      (r3v21 int) from 0x005d: IF  (r3v21 int) != (1567 int)  -> B:18:0x005f A[HIDDEN] (LINE:94)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Pair zza(zzz zzzVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Integer num;
        Integer num2;
        String str = zzzVar.zzk;
        if (str != null) {
            String[] strArrSplit = str.split("\\.");
            int i12 = 3;
            int i13 = 2;
            int i14 = 1;
            if (!"video/dolby-vision".equals(zzzVar.zzo)) {
                switch (strArrSplit[0]) {
                    case "s263":
                        String str2 = zzzVar.zzk;
                        Pair pair = new Pair(1, 1);
                        if (strArrSplit.length < 3) {
                            AbstractC0486a1.o(str2, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                        } else {
                            try {
                                return new Pair(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                            } catch (NumberFormatException unused) {
                                AbstractC0486a1.o(str2, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                            }
                        }
                        return pair;
                    case "avc1":
                    case "avc2":
                        String str3 = zzzVar.zzk;
                        int length = strArrSplit.length;
                        if (length < 2) {
                            AbstractC0486a1.o(str3, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                            break;
                        } else {
                            try {
                                if (strArrSplit[1].length() == 6) {
                                    i7 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                                    i8 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                                } else if (length < 3) {
                                    zzdq.zzf("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str3);
                                } else {
                                    i7 = Integer.parseInt(strArrSplit[1]);
                                    i8 = Integer.parseInt(strArrSplit[2]);
                                }
                                if (i7 == 66) {
                                    i13 = 1;
                                } else if (i7 != 77) {
                                    if (i7 == 88) {
                                        i13 = 4;
                                    } else if (i7 == 100) {
                                        i13 = 8;
                                    } else if (i7 == 110) {
                                        i13 = 16;
                                    } else if (i7 != 122) {
                                        i13 = i7 != 244 ? -1 : 64;
                                    } else {
                                        i13 = 32;
                                    }
                                }
                                if (i13 == -1) {
                                    AbstractC0486a1.k(i7, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                                } else {
                                    switch (i8) {
                                        case 10:
                                            break;
                                        case 11:
                                            i14 = 4;
                                            break;
                                        case 12:
                                            i14 = 8;
                                            break;
                                        case 13:
                                            i14 = 16;
                                            break;
                                        default:
                                            switch (i8) {
                                                case 20:
                                                    i14 = 32;
                                                    break;
                                                case zzbbd.zzt.zzm /* 21 */:
                                                    i14 = 64;
                                                    break;
                                                case 22:
                                                    i14 = 128;
                                                    break;
                                                default:
                                                    switch (i8) {
                                                        case 30:
                                                            i14 = 256;
                                                            break;
                                                        case 31:
                                                            i14 = 512;
                                                            break;
                                                        case 32:
                                                            i14 = 1024;
                                                            break;
                                                        default:
                                                            switch (i8) {
                                                                case 40:
                                                                    i14 = 2048;
                                                                    break;
                                                                case 41:
                                                                    i14 = 4096;
                                                                    break;
                                                                case 42:
                                                                    i14 = 8192;
                                                                    break;
                                                                default:
                                                                    switch (i8) {
                                                                        case 50:
                                                                            i14 = 16384;
                                                                            break;
                                                                        case 51:
                                                                            i14 = 32768;
                                                                            break;
                                                                        case 52:
                                                                            i14 = 65536;
                                                                            break;
                                                                        default:
                                                                            i14 = -1;
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
                                    if (i14 != -1) {
                                        return new Pair(Integer.valueOf(i13), Integer.valueOf(i14));
                                    }
                                    AbstractC0486a1.k(i8, "Unknown AVC level: ", "CodecSpecificDataUtil");
                                }
                            } catch (NumberFormatException unused2) {
                                AbstractC0486a1.o(str3, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                            }
                            break;
                        }
                        break;
                    case "vp09":
                        String str4 = zzzVar.zzk;
                        if (strArrSplit.length < 3) {
                            AbstractC0486a1.o(str4, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                            break;
                        } else {
                            try {
                                int i15 = Integer.parseInt(strArrSplit[1]);
                                int i16 = Integer.parseInt(strArrSplit[2]);
                                if (i15 == 0) {
                                    i9 = 1;
                                } else if (i15 == 1) {
                                    i9 = 2;
                                } else if (i15 != 2) {
                                    i9 = i15 != 3 ? -1 : 8;
                                } else {
                                    i9 = 4;
                                }
                                if (i9 == -1) {
                                    AbstractC0486a1.k(i15, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                                } else {
                                    if (i16 != 10) {
                                        if (i16 == 11) {
                                            i14 = 2;
                                        } else if (i16 == 20) {
                                            i14 = 4;
                                        } else if (i16 == 21) {
                                            i14 = 8;
                                        } else if (i16 == 30) {
                                            i14 = 16;
                                        } else if (i16 == 31) {
                                            i14 = 32;
                                        } else if (i16 == 40) {
                                            i14 = 64;
                                        } else if (i16 == 41) {
                                            i14 = 128;
                                        } else if (i16 == 50) {
                                            i14 = 256;
                                        } else if (i16 != 51) {
                                            switch (i16) {
                                                case 60:
                                                    i14 = 2048;
                                                    break;
                                                case 61:
                                                    i14 = 4096;
                                                    break;
                                                case 62:
                                                    i14 = 8192;
                                                    break;
                                                default:
                                                    i14 = -1;
                                                    break;
                                            }
                                        } else {
                                            i14 = 512;
                                        }
                                    }
                                    if (i14 != -1) {
                                        return new Pair(Integer.valueOf(i9), Integer.valueOf(i14));
                                    }
                                    AbstractC0486a1.k(i16, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                                }
                            } catch (NumberFormatException unused3) {
                                AbstractC0486a1.o(str4, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                            }
                            break;
                        }
                        break;
                    case "hev1":
                    case "hvc1":
                        return zzb(zzzVar.zzk, strArrSplit, zzzVar.zzC);
                    case "av01":
                        String str5 = zzzVar.zzk;
                        zzk zzkVar = zzzVar.zzC;
                        if (strArrSplit.length < 4) {
                            AbstractC0486a1.o(str5, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                            break;
                        } else {
                            try {
                                int i17 = Integer.parseInt(strArrSplit[1]);
                                int i18 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                                int i19 = Integer.parseInt(strArrSplit[3]);
                                if (i17 != 0) {
                                    AbstractC0486a1.k(i17, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                                } else {
                                    if (i19 == 8) {
                                        i10 = 1;
                                    } else if (i19 != 10) {
                                        AbstractC0486a1.k(i19, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                                    } else {
                                        i10 = (zzkVar == null || !(zzkVar.zze != null || (i11 = zzkVar.zzd) == 7 || i11 == 6)) ? 2 : 4096;
                                    }
                                    switch (i18) {
                                        case 0:
                                            break;
                                        case 1:
                                            i14 = 2;
                                            break;
                                        case 2:
                                            i14 = 4;
                                            break;
                                        case 3:
                                            i14 = 8;
                                            break;
                                        case 4:
                                            i14 = 16;
                                            break;
                                        case 5:
                                            i14 = 32;
                                            break;
                                        case 6:
                                            i14 = 64;
                                            break;
                                        case 7:
                                            i14 = 128;
                                            break;
                                        case 8:
                                            i14 = 256;
                                            break;
                                        case 9:
                                            i14 = 512;
                                            break;
                                        case 10:
                                            i14 = 1024;
                                            break;
                                        case 11:
                                            i14 = 2048;
                                            break;
                                        case 12:
                                            i14 = 4096;
                                            break;
                                        case 13:
                                            i14 = 8192;
                                            break;
                                        case 14:
                                            i14 = 16384;
                                            break;
                                        case 15:
                                            i14 = 32768;
                                            break;
                                        case 16:
                                            i14 = 65536;
                                            break;
                                        case 17:
                                            i14 = 131072;
                                            break;
                                        case 18:
                                            i14 = 262144;
                                            break;
                                        case 19:
                                            i14 = 524288;
                                            break;
                                        case 20:
                                            i14 = 1048576;
                                            break;
                                        case zzbbd.zzt.zzm /* 21 */:
                                            i14 = 2097152;
                                            break;
                                        case 22:
                                            i14 = 4194304;
                                            break;
                                        case 23:
                                            i14 = 8388608;
                                            break;
                                        default:
                                            i14 = -1;
                                            break;
                                    }
                                    if (i14 != -1) {
                                        return new Pair(Integer.valueOf(i10), Integer.valueOf(i14));
                                    }
                                    AbstractC0486a1.k(i18, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                                }
                            } catch (NumberFormatException unused4) {
                                AbstractC0486a1.o(str5, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                            }
                            break;
                        }
                        break;
                    case "mp4a":
                        String str6 = zzzVar.zzk;
                        if (strArrSplit.length != 3) {
                            AbstractC0486a1.o(str6, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                            break;
                        } else {
                            try {
                                if ("audio/mp4a-latm".equals(zzay.zzd(Integer.parseInt(strArrSplit[1], 16)))) {
                                    int i20 = Integer.parseInt(strArrSplit[2]);
                                    if (i20 == 17) {
                                        i12 = 17;
                                    } else if (i20 == 20) {
                                        i12 = 20;
                                    } else if (i20 == 23) {
                                        i12 = 23;
                                    } else if (i20 == 29) {
                                        i12 = 29;
                                    } else if (i20 == 39) {
                                        i12 = 39;
                                    } else if (i20 != 42) {
                                        switch (i20) {
                                            case 1:
                                                i12 = 1;
                                                break;
                                            case 2:
                                                i12 = 2;
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                i12 = 4;
                                                break;
                                            case 5:
                                                i12 = 5;
                                                break;
                                            case 6:
                                                i12 = 6;
                                                break;
                                            default:
                                                i12 = -1;
                                                break;
                                        }
                                    } else {
                                        i12 = 42;
                                    }
                                    if (i12 != -1) {
                                        return new Pair(Integer.valueOf(i12), 0);
                                    }
                                }
                            } catch (NumberFormatException unused5) {
                                AbstractC0486a1.o(str6, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                            }
                            break;
                        }
                        break;
                }
            } else {
                String str7 = zzzVar.zzk;
                if (strArrSplit.length < 3) {
                    AbstractC0486a1.o(str7, "Ignoring malformed Dolby Vision codec string: ", "CodecSpecificDataUtil");
                } else {
                    Matcher matcher = zzd.matcher(strArrSplit[1]);
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null) {
                            if (strGroup.hashCode() != 1567) {
                                switch (strGroup) {
                                    case "00":
                                        num = 1;
                                        break;
                                    case "01":
                                        num = 2;
                                        break;
                                    case "02":
                                        num = 4;
                                        break;
                                    case "03":
                                        num = 8;
                                        break;
                                    case "04":
                                        num = 16;
                                        break;
                                    case "05":
                                        num = 32;
                                        break;
                                    case "06":
                                        num = 64;
                                        break;
                                    case "07":
                                        num = 128;
                                        break;
                                    case "08":
                                        num = 256;
                                        break;
                                    case "09":
                                        num = 512;
                                        break;
                                    default:
                                        num = null;
                                        break;
                                }
                            } else if (strGroup.equals("10")) {
                                num = 1024;
                            } else {
                                num = null;
                            }
                        } else {
                            num = null;
                        }
                        if (num == null) {
                            AbstractC0486a1.o(strGroup, "Unknown Dolby Vision profile string: ", "CodecSpecificDataUtil");
                        } else {
                            String str8 = strArrSplit[2];
                            if (str8 != null) {
                                str8.hashCode();
                                switch (str8) {
                                    case "01":
                                        num2 = 1;
                                        break;
                                    case "02":
                                        num2 = 2;
                                        break;
                                    case "03":
                                        num2 = 4;
                                        break;
                                    case "04":
                                        num2 = 8;
                                        break;
                                    case "05":
                                        num2 = 16;
                                        break;
                                    case "06":
                                        num2 = 32;
                                        break;
                                    case "07":
                                        num2 = 64;
                                        break;
                                    case "08":
                                        num2 = 128;
                                        break;
                                    case "09":
                                        num2 = 256;
                                        break;
                                    default:
                                        switch (str8) {
                                            case 1567:
                                                if (!str8.equals("10")) {
                                                    num2 = null;
                                                } else {
                                                    num2 = 512;
                                                }
                                                break;
                                            case 1568:
                                                if (!str8.equals("11")) {
                                                    num2 = null;
                                                } else {
                                                    num2 = 1024;
                                                }
                                                break;
                                            case 1569:
                                                if (!str8.equals("12")) {
                                                    num2 = null;
                                                } else {
                                                    num2 = 2048;
                                                }
                                                break;
                                            case 1570:
                                                if (!str8.equals("13")) {
                                                    num2 = null;
                                                } else {
                                                    num2 = 4096;
                                                }
                                                break;
                                            default:
                                                num2 = null;
                                                break;
                                        }
                                }
                            } else {
                                num2 = null;
                            }
                            if (num2 != null) {
                                return new Pair(num, num2);
                            }
                            AbstractC0486a1.o(str8, "Unknown Dolby Vision level string: ", "CodecSpecificDataUtil");
                        }
                    } else {
                        AbstractC0486a1.o(str7, "Ignoring malformed Dolby Vision codec string: ", "CodecSpecificDataUtil");
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0186  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
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
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i7 = 1;
        } else if ("2".equals(strGroup)) {
            i7 = (zzkVar == null || zzkVar.zzd != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                AbstractC0486a1.o(strGroup, "Unknown HEVC profile string: ", "CodecSpecificDataUtil");
                return null;
            }
            i7 = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2) {
                case "L30":
                    num = 1;
                    break;
                case "L60":
                    num = 4;
                    break;
                case "L63":
                    num = 16;
                    break;
                case "L90":
                    num = 64;
                    break;
                case "L93":
                    num = 256;
                    break;
                case "L120":
                    num = 1024;
                    break;
                case "L123":
                    num = 4096;
                    break;
                case "L150":
                    num = 16384;
                    break;
                case "L153":
                    num = 65536;
                    break;
                case "L156":
                    num = 262144;
                    break;
                case "L180":
                    num = 1048576;
                    break;
                case "L183":
                    num = 4194304;
                    break;
                case "L186":
                    num = 16777216;
                    break;
                case "H30":
                    num = 2;
                    break;
                case "H60":
                    num = 8;
                    break;
                case "H63":
                    num = 32;
                    break;
                case "H90":
                    num = 128;
                    break;
                case "H93":
                    num = 512;
                    break;
                case "H120":
                    num = 2048;
                    break;
                case "H123":
                    num = 8192;
                    break;
                case "H150":
                    num = 32768;
                    break;
                case "H153":
                    num = 131072;
                    break;
                case "H156":
                    num = 524288;
                    break;
                case "H180":
                    num = 2097152;
                    break;
                case "H183":
                    num = 8388608;
                    break;
                case "H186":
                    num = 33554432;
                    break;
                default:
                    num = null;
                    break;
            }
        } else {
            num = null;
        }
        if (num != null) {
            return new Pair(Integer.valueOf(i7), num);
        }
        AbstractC0486a1.o(str2, "Unknown HEVC level string: ", "CodecSpecificDataUtil");
        return null;
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
