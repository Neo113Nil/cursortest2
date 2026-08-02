package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioFormat;
import android.os.Build;
import android.text.TextUtils;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.lo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1260lo {

    /* renamed from: a, reason: collision with root package name */
    public static final int f14419a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f14420b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f14421c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f14422d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f14423e;
    public static final byte[] f;

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f14424g;

    /* renamed from: h, reason: collision with root package name */
    public static HashMap f14425h;
    public static final String[] i;

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f14426j;

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f14427k;

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f14428l;

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f14429m;

    static {
        int i5 = Build.VERSION.SDK_INT;
        f14419a = i5;
        String str = Build.DEVICE;
        f14420b = str;
        String str2 = Build.MANUFACTURER;
        f14421c = str2;
        String str3 = Build.MODEL;
        f14422d = str3;
        f14423e = str + ", " + str3 + ", " + str2 + ", " + i5;
        f = new byte[0];
        f14424g = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f14426j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f14427k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f14428l = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f14429m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String n5 = AbstractC0952et.n(str);
        int i5 = 0;
        String str2 = n5.split("-", 2)[0];
        if (f14425h == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = i;
            int length2 = strArr.length;
            HashMap hashMap = new HashMap(length + 88);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i6 = 0; i6 < 88; i6 += 2) {
                hashMap.put(strArr[i6], strArr[i6 + 1]);
            }
            f14425h = hashMap;
        }
        String str4 = (String) f14425h.get(str2);
        if (str4 != null) {
            n5 = str4.concat(String.valueOf(n5.substring(str2.length())));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return n5;
        }
        while (true) {
            String[] strArr2 = f14426j;
            int length3 = strArr2.length;
            if (i5 >= 18) {
                return n5;
            }
            if (n5.startsWith(strArr2[i5])) {
                return String.valueOf(strArr2[i5 + 1]).concat(String.valueOf(n5.substring(strArr2[i5].length())));
            }
            i5 += 2;
        }
    }

    public static void b(long[] jArr, long j5) {
        long j6;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i5 = 0;
        if (j5 >= 1000000 && j5 % 1000000 == 0) {
            long x5 = AbstractC1400ot.x(j5, 1000000L, RoundingMode.UNNECESSARY);
            while (i5 < jArr.length) {
                jArr[i5] = AbstractC1400ot.x(jArr[i5], x5, roundingMode);
                i5++;
            }
            return;
        }
        if (j5 < 1000000 && 1000000 % j5 == 0) {
            long x6 = AbstractC1400ot.x(1000000L, j5, RoundingMode.UNNECESSARY);
            while (i5 < jArr.length) {
                jArr[i5] = AbstractC1400ot.P(jArr[i5], x6);
                i5++;
            }
            return;
        }
        int i6 = 0;
        while (i6 < jArr.length) {
            long j7 = jArr[i6];
            if (j7 != 0) {
                if (j5 >= j7 && j5 % j7 == 0) {
                    jArr[i6] = AbstractC1400ot.x(1000000L, AbstractC1400ot.x(j5, j7, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j5 >= j7 || j7 % j5 != 0) {
                    j6 = j5;
                    jArr[i6] = g(j7, 1000000L, j6, roundingMode);
                    i6++;
                    j5 = j6;
                } else {
                    jArr[i6] = AbstractC1400ot.P(1000000L, AbstractC1400ot.x(j7, j5, RoundingMode.UNNECESSARY));
                }
            }
            j6 = j5;
            i6++;
            j5 = j6;
        }
    }

    public static boolean c(int i5) {
        return i5 == 3 || i5 == 2 || i5 == 268435456 || i5 == 21 || i5 == 1342177280 || i5 == 22 || i5 == 1610612736 || i5 == 4;
    }

    public static boolean d(Context context) {
        int i5 = f14419a;
        if (i5 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        String str = f14422d;
        if (i5 == 30 && (AbstractC0952et.Q("moto g(20)", str) || AbstractC0952et.Q("rmx3231", str))) {
            return true;
        }
        return i5 == 34 && AbstractC0952et.Q("sm-x200", str);
    }

    public static boolean e(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Object[] f(int i5, Object[] objArr) {
        AbstractC1668us.S(i5 <= objArr.length);
        return Arrays.copyOf(objArr, i5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (java.lang.Math.abs(r11 - r2) == 0.5d) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long g(long j5, long j6, long j7, RoundingMode roundingMode) {
        double d5;
        long j8;
        long j9;
        long P5 = AbstractC1400ot.P(j5, j6);
        if (P5 != Long.MAX_VALUE && P5 != Long.MIN_VALUE) {
            return AbstractC1400ot.x(P5, j7, roundingMode);
        }
        long J = AbstractC1400ot.J(Math.abs(j6), Math.abs(j7));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long x5 = AbstractC1400ot.x(j6, J, roundingMode2);
        long x6 = AbstractC1400ot.x(j7, J, roundingMode2);
        long J4 = AbstractC1400ot.J(Math.abs(j5), Math.abs(x6));
        long x7 = AbstractC1400ot.x(j5, J4, roundingMode2);
        long x8 = AbstractC1400ot.x(x6, J4, roundingMode2);
        long P6 = AbstractC1400ot.P(x7, x5);
        if (P6 != Long.MAX_VALUE && P6 != Long.MIN_VALUE) {
            return AbstractC1400ot.x(P6, x8, roundingMode);
        }
        double d6 = (x5 / x8) * x7;
        if (d6 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d6 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i5 = Vv.f11965a;
        if (!AbstractC1400ot.E(d6)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (Uv.f11842a[roundingMode.ordinal()]) {
            case 1:
                AbstractC0952et.J(Vv.b(d6));
                d5 = d6;
                if (!((-9.223372036854776E18d) - d5 >= 1.0d) || !(d5 < 9.223372036854776E18d)) {
                    return (long) d5;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d6 + " and rounding mode " + String.valueOf(roundingMode));
            case 2:
                if (d6 < 0.0d && !Vv.b(d6)) {
                    j8 = (long) d6;
                    j9 = -1;
                    d5 = j8 + j9;
                    if (!(((-9.223372036854776E18d) - d5 >= 1.0d) & (d5 < 9.223372036854776E18d))) {
                    }
                }
                d5 = d6;
                if (!(((-9.223372036854776E18d) - d5 >= 1.0d) & (d5 < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d6 > 0.0d && !Vv.b(d6)) {
                    j8 = (long) d6;
                    j9 = 1;
                    d5 = j8 + j9;
                    if (!(((-9.223372036854776E18d) - d5 >= 1.0d) & (d5 < 9.223372036854776E18d))) {
                    }
                }
                d5 = d6;
                if (!(((-9.223372036854776E18d) - d5 >= 1.0d) & (d5 < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                d5 = d6;
                if (!(((-9.223372036854776E18d) - d5 >= 1.0d) & (d5 < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!Vv.b(d6)) {
                    d5 = ((long) d6) + (d6 > 0.0d ? 1 : -1);
                    if (!(((-9.223372036854776E18d) - d5 >= 1.0d) & (d5 < 9.223372036854776E18d))) {
                    }
                }
                d5 = d6;
                if (!(((-9.223372036854776E18d) - d5 >= 1.0d) & (d5 < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                d5 = Math.rint(d6);
                if (!(((-9.223372036854776E18d) - d5 >= 1.0d) & (d5 < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                d5 = Math.rint(d6);
                if (Math.abs(d6 - d5) == 0.5d) {
                    d5 = Math.copySign(0.5d, d6) + d6;
                }
                if (!(((-9.223372036854776E18d) - d5 >= 1.0d) & (d5 < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                d5 = Math.rint(d6);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static String h(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e3) {
            JB.g("Util", "Failed to read system property ".concat(str), e3);
            return null;
        }
    }

    public static int i(int[] iArr, int i5, boolean z3, boolean z5) {
        int i6;
        int i7;
        int binarySearch = Arrays.binarySearch(iArr, i5);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            while (true) {
                i6 = binarySearch - 1;
                if (i6 < 0 || iArr[i6] != i5) {
                    break;
                }
                binarySearch = i6;
            }
            i7 = z3 ? binarySearch : i6;
        }
        return z5 ? Math.max(0, i7) : i7;
    }

    public static int j(long[] jArr, long j5, boolean z3) {
        int i5;
        int binarySearch = Arrays.binarySearch(jArr, j5);
        if (binarySearch < 0) {
            i5 = -(binarySearch + 2);
        } else {
            while (true) {
                int i6 = binarySearch - 1;
                if (i6 < 0 || jArr[i6] != j5) {
                    break;
                }
                binarySearch = i6;
            }
            i5 = binarySearch;
        }
        return z3 ? Math.max(0, i5) : i5;
    }

    public static int k(int i5, int i6, int i7, byte[] bArr) {
        while (i5 < i6) {
            i7 = f14427k[(i7 >>> 24) ^ (bArr[i5] & 255)] ^ (i7 << 8);
            i5++;
        }
        return i7;
    }

    public static int l(int i5) {
        if (i5 == 20) {
            return 30;
        }
        if (i5 == 22) {
            return 31;
        }
        if (i5 == 30) {
            return 34;
        }
        switch (i5) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i5) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m(int i5) {
        switch (i5) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (f14419a >= 32) {
                    return 737532;
                }
                break;
            case 12:
                return 743676;
        }
    }

    public static int n(int i5) {
        if (i5 != 2) {
            if (i5 == 3) {
                return 1;
            }
            if (i5 != 4) {
                if (i5 != 21) {
                    if (i5 != 22) {
                        if (i5 != 268435456) {
                            if (i5 != 1342177280) {
                                if (i5 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int o(int i5) {
        if (i5 == 2 || i5 == 4) {
            return 6005;
        }
        if (i5 == 10) {
            return 6004;
        }
        if (i5 == 7) {
            return 6005;
        }
        if (i5 == 8) {
            return 6003;
        }
        switch (i5) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case C1639u7.zzm /* 21 */:
            case 22:
                return 6004;
            default:
                switch (i5) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int p(String str) {
        String[] split;
        int length;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z3 = length >= 3 && "neg".equals(split[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int parseInt = Integer.parseInt(str2);
            return z3 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static int q(int i5) {
        if (i5 == 8) {
            return 3;
        }
        if (i5 == 16) {
            return 2;
        }
        if (i5 != 24) {
            return i5 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static long r(float f5, long j5) {
        return f5 == 1.0f ? j5 : Math.round(j5 * f5);
    }

    public static long s(long j5) {
        return (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? j5 : j5 * 1000;
    }

    public static long t(int i5, long j5) {
        return u(j5, 1000000L, i5, RoundingMode.DOWN);
    }

    public static long u(long j5, long j6, long j7, RoundingMode roundingMode) {
        if (j5 == 0 || j6 == 0) {
            return 0L;
        }
        return (j7 < j6 || j7 % j6 != 0) ? (j7 >= j6 || j6 % j7 != 0) ? (j7 < j5 || j7 % j5 != 0) ? (j7 >= j5 || j5 % j7 != 0) ? g(j5, j6, j7, roundingMode) : AbstractC1400ot.P(j6, AbstractC1400ot.x(j5, j7, RoundingMode.UNNECESSARY)) : AbstractC1400ot.x(j6, AbstractC1400ot.x(j7, j5, RoundingMode.UNNECESSARY), roundingMode) : AbstractC1400ot.P(j5, AbstractC1400ot.x(j6, j7, RoundingMode.UNNECESSARY)) : AbstractC1400ot.x(j5, AbstractC1400ot.x(j7, j6, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long v(long j5) {
        return (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? j5 : j5 / 1000;
    }

    public static AudioFormat w(int i5, int i6, int i7) {
        return new AudioFormat.Builder().setSampleRate(i5).setChannelMask(i6).setEncoding(i7).build();
    }
}
