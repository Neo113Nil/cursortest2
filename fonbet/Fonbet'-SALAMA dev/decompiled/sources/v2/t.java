package v2;

import A1.C0045t0;
import B.v;
import W5.AbstractC0486a1;
import Y4.D;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbbd;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import io.sentry.MeasurementUnit;
import io.sentry.protocol.User;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17153a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f17154b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f17155c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f17156d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f17157e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f17158f;

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f17159g;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f17160h;

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f17161i;
    public static HashMap j;

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f17162k;

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f17163l;

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f17164m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f17165n;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f17153a = i7;
        String str = Build.DEVICE;
        f17154b = str;
        String str2 = Build.MANUFACTURER;
        f17155c = str2;
        String str3 = Build.MODEL;
        f17156d = str3;
        f17157e = str + ", " + str3 + ", " + str2 + ", " + i7;
        f17158f = new byte[0];
        f17159g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f17160h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f17161i = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f17162k = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", User.JsonKeys.GEO, "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f17163l = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f17164m = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f17165n = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static String A(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e7) {
            AbstractC1664a.l("Util", "Failed to read system property ".concat(str), e7);
            return null;
        }
    }

    public static String B(int i7) {
        switch (i7) {
            case -2:
                return MeasurementUnit.NONE;
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return RRWebVideoEvent.EVENT_TAG;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i7 >= 10000 ? AbstractC0486a1.f(i7, "custom (", ")") : "?";
        }
    }

    public static boolean C(int i7) {
        return i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 536870912 || i7 == 805306368 || i7 == 4;
    }

    public static boolean D(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long E(long j3) {
        return (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? j3 : j3 * 1000;
    }

    public static String F(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String a02 = D.a0(str);
        int i7 = 0;
        String str2 = a02.split("-", 2)[0];
        if (j == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f17162k;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i8 = 0; i8 < strArr.length; i8 += 2) {
                hashMap.put(strArr[i8], strArr[i8 + 1]);
            }
            j = hashMap;
        }
        String str4 = (String) j.get(str2);
        if (str4 != null) {
            StringBuilder c3 = t.e.c(str4);
            c3.append(a02.substring(str2.length()));
            a02 = c3.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return a02;
        }
        while (true) {
            String[] strArr2 = f17163l;
            if (i7 >= strArr2.length) {
                return a02;
            }
            if (a02.startsWith(strArr2[i7])) {
                return strArr2[i7 + 1] + a02.substring(strArr2[i7].length());
            }
            i7 += 2;
        }
    }

    public static Object[] G(int i7, Object[] objArr) {
        AbstractC1664a.f(i7 <= objArr.length);
        return Arrays.copyOf(objArr, i7);
    }

    public static long H(String str) {
        Matcher matcher = f17159g.matcher(str);
        if (!matcher.matches()) {
            throw C0045t0.a(null, "Invalid date/time format: " + str);
        }
        int i7 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i7 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i7 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i7 != 0 ? timeInMillis - (i7 * 60000) : timeInMillis;
    }

    public static void I(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void J(ArrayList arrayList, int i7, int i8) {
        if (i7 < 0 || i8 > arrayList.size() || i7 > i8) {
            throw new IllegalArgumentException();
        }
        if (i7 != i8) {
            arrayList.subList(i7, i8).clear();
        }
    }

    public static long K(long j3, long j7, long j8) {
        if (j8 >= j7 && j8 % j7 == 0) {
            return j3 / (j8 / j7);
        }
        if (j8 < j7 && j7 % j8 == 0) {
            return (j7 / j8) * j3;
        }
        return (long) (j3 * (j7 / j8));
    }

    public static void L(long[] jArr, long j3) {
        int i7 = 0;
        if (j3 >= 1000000 && j3 % 1000000 == 0) {
            long j7 = j3 / 1000000;
            while (i7 < jArr.length) {
                jArr[i7] = jArr[i7] / j7;
                i7++;
            }
            return;
        }
        if (j3 >= 1000000 || 1000000 % j3 != 0) {
            double d7 = 1000000 / j3;
            while (i7 < jArr.length) {
                jArr[i7] = (long) (jArr[i7] * d7);
                i7++;
            }
            return;
        }
        long j8 = 1000000 / j3;
        while (i7 < jArr.length) {
            jArr[i7] = jArr[i7] * j8;
            i7++;
        }
    }

    public static String[] M(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static long N(long j3) {
        return (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? j3 : j3 / 1000;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(long[] jArr, long j3, boolean z4) {
        int i7;
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i7 = binarySearch + 1;
            if (i7 >= jArr.length || jArr[i7] != j3) {
                break;
            }
            binarySearch = i7;
        }
        return z4 ? binarySearch : i7;
    }

    public static int c(v vVar, long j3) {
        int i7 = vVar.f965b - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            if (vVar.g(i9) < j3) {
                i8 = i9 + 1;
            } else {
                i7 = i9 - 1;
            }
        }
        int i10 = i7 + 1;
        if (i10 < vVar.f965b && vVar.g(i10) == j3) {
            return i10;
        }
        if (i7 == -1) {
            return 0;
        }
        return i7;
    }

    public static int d(List list, Long l7, boolean z4) {
        int i7;
        int binarySearch = Collections.binarySearch(list, l7);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            while (true) {
                int i8 = binarySearch - 1;
                if (i8 < 0 || ((Comparable) list.get(i8)).compareTo(l7) != 0) {
                    break;
                }
                binarySearch = i8;
            }
            i7 = binarySearch;
        }
        return z4 ? Math.max(0, i7) : i7;
    }

    public static int e(int[] iArr, int i7, boolean z4, boolean z7) {
        int i8;
        int i9;
        int binarySearch = Arrays.binarySearch(iArr, i7);
        if (binarySearch < 0) {
            i9 = -(binarySearch + 2);
        } else {
            while (true) {
                i8 = binarySearch - 1;
                if (i8 < 0 || iArr[i8] != i7) {
                    break;
                }
                binarySearch = i8;
            }
            i9 = z4 ? binarySearch : i8;
        }
        return z7 ? Math.max(0, i9) : i9;
    }

    public static int f(long[] jArr, long j3, boolean z4) {
        int i7;
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            while (true) {
                int i8 = binarySearch - 1;
                if (i8 < 0 || jArr[i8] != j3) {
                    break;
                }
                binarySearch = i8;
            }
            i7 = binarySearch;
        }
        return z4 ? Math.max(0, i7) : i7;
    }

    public static int g(int i7, int i8) {
        return ((i7 + i8) - 1) / i8;
    }

    public static void h(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static float i(float f7, float f8, float f9) {
        return Math.max(f8, Math.min(f7, f9));
    }

    public static int j(int i7, int i8, int i9) {
        return Math.max(i8, Math.min(i7, i9));
    }

    public static long k(long j3, long j7, long j8) {
        return Math.max(j7, Math.min(j3, j8));
    }

    public static boolean l(Object[] objArr, Comparable comparable) {
        for (Object obj : objArr) {
            if (a(obj, comparable)) {
                return true;
            }
        }
        return false;
    }

    public static Handler m(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        AbstractC1664a.i(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String n(byte[] bArr) {
        return new String(bArr, D3.f.f1719c);
    }

    public static int o(int i7) {
        int i8 = f17153a;
        if (i7 == 12) {
            return i8 >= 32 ? 743676 : 0;
        }
        switch (i7) {
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
                return (i8 < 23 && i8 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int p(int i7, String str) {
        int i8 = 0;
        for (String str2 : M(str)) {
            if (i7 == i.g(i.c(str2))) {
                i8++;
            }
        }
        return i8;
    }

    public static String q(int i7, String str) {
        String[] M7 = M(str);
        if (M7.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : M7) {
            if (i7 == i.g(i.c(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static int r(int i7) {
        if (i7 == 2 || i7 == 4) {
            return 6005;
        }
        if (i7 == 10) {
            return 6004;
        }
        if (i7 == 7) {
            return 6005;
        }
        if (i7 == 8) {
            return 6003;
        }
        switch (i7) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case zzbbd.zzt.zzm /* 21 */:
            case 22:
                return 6004;
            default:
                switch (i7) {
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

    public static int s(String str) {
        String[] split;
        int length;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z4 = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            int parseInt = Integer.parseInt(str2);
            return z4 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long t(long j3, float f7) {
        return f7 == 1.0f ? j3 : Math.round(j3 * f7);
    }

    public static long u(long j3) {
        return j3 == -9223372036854775807L ? System.currentTimeMillis() : j3 + SystemClock.elapsedRealtime();
    }

    public static int v(int i7) {
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 2;
        }
        if (i7 != 24) {
            return i7 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static int w(int i7, int i8) {
        if (i7 != 2) {
            if (i7 == 3) {
                return i8;
            }
            if (i7 != 4) {
                if (i7 != 268435456) {
                    if (i7 == 536870912) {
                        return i8 * 3;
                    }
                    if (i7 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i8 * 4;
        }
        return i8 * 2;
    }

    public static long x(long j3, float f7) {
        return f7 == 1.0f ? j3 : Math.round(j3 / f7);
    }

    public static int y(int i7) {
        if (i7 == 13) {
            return 1;
        }
        switch (i7) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String[] z() {
        String[] strArr;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i7 = f17153a;
        if (i7 >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArr = new String[]{i7 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i8 = 0; i8 < strArr.length; i8++) {
            strArr[i8] = F(strArr[i8]);
        }
        return strArr;
    }
}
