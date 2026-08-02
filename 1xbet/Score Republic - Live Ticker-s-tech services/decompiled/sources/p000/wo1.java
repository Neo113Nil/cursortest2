package p000;

import android.content.Context;
import android.os.Looper;
import android.os.Trace;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wo1 {

    /* JADX INFO: renamed from: a */
    public static final nc1 f8603a = new nc1(23);

    /* JADX INFO: renamed from: b */
    public static final g72 f8604b;

    /* JADX INFO: renamed from: c */
    public static final g72 f8605c;

    static {
        int i = 3;
        f8604b = new g72("NONE", i);
        f8605c = new g72("PENDING", i);
    }

    /* JADX INFO: renamed from: A */
    public static boolean m5370A(ht1 ht1Var) {
        if (ht1Var == null) {
            return false;
        }
        Double dMo755h = ht1Var.mo755h();
        return !dMo755h.isNaN() && dMo755h.doubleValue() >= 0.0d && dMo755h.equals(Double.valueOf(Math.floor(dMo755h.doubleValue())));
    }

    /* JADX INFO: renamed from: B */
    public static gu1 m5371B(String str) {
        gu1 gu1Var;
        if (str == null || str.isEmpty()) {
            gu1Var = null;
        } else {
            gu1Var = (gu1) gu1.f2933u0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (gu1Var != null) {
            return gu1Var;
        }
        C0270h1.m2190f(AbstractC0024an.m283f("Unsupported commandId ", str));
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m5372C(ht1 ht1Var, ht1 ht1Var2) {
        if (!ht1Var.getClass().equals(ht1Var2.getClass())) {
            return false;
        }
        if ((ht1Var instanceof nt1) || (ht1Var instanceof et1)) {
            return true;
        }
        if (ht1Var instanceof gr1) {
            if (Double.isNaN(ht1Var.mo755h().doubleValue()) || Double.isNaN(ht1Var2.mo755h().doubleValue())) {
                return false;
            }
            return ht1Var.mo755h().equals(ht1Var2.mo755h());
        }
        if (ht1Var instanceof lt1) {
            return ht1Var.mo753f().equals(ht1Var2.mo753f());
        }
        if (ht1Var instanceof up1) {
            return ht1Var.mo752e().equals(ht1Var2.mo752e());
        }
        return ht1Var == ht1Var2;
    }

    /* JADX INFO: renamed from: D */
    public static int m5373D(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    /* JADX INFO: renamed from: E */
    public static double m5374E(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return ((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    /* JADX INFO: renamed from: F */
    public static Object m5375F(ht1 ht1Var) {
        if (ht1.f3331c.equals(ht1Var)) {
            return null;
        }
        if (ht1.f3330b.equals(ht1Var)) {
            return "";
        }
        if (ht1Var instanceof ct1) {
            return m5376G((ct1) ht1Var);
        }
        if (!(ht1Var instanceof dp1)) {
            return !ht1Var.mo755h().isNaN() ? ht1Var.mo755h() : ht1Var.mo753f();
        }
        ArrayList arrayList = new ArrayList();
        dp1 dp1Var = (dp1) ht1Var;
        int i = 0;
        while (i < dp1Var.m1282s()) {
            if (i >= dp1Var.m1282s()) {
                throw new NoSuchElementException(j11.m2774i(new StringBuilder(String.valueOf(i).length() + 21), "Out of bounds index: ", i));
            }
            int i2 = i + 1;
            Object objM5375F = m5375F(dp1Var.m1283t(i));
            if (objM5375F != null) {
                arrayList.add(objM5375F);
            }
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    public static HashMap m5376G(ct1 ct1Var) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(ct1Var.f1452j.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Object objM5375F = m5375F(ct1Var.mo756j(str));
            if (objM5375F != null) {
                map.put(str, objM5375F);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: H */
    public static void m5377H(f71 f71Var) {
        int iM5373D = m5373D(f71Var.m1654G("runtime.counter").mo755h().doubleValue() + 1.0d);
        if (iM5373D <= 1000000) {
            f71Var.m1652E("runtime.counter", new gr1(Double.valueOf(iM5373D)));
        } else {
            C0270h1.m2191g("Instructions allowed exceeded");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5378a(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: d */
    public static void m5379d(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final o21 m5380e(Throwable th) {
        th.getClass();
        return new o21(th);
    }

    /* JADX INFO: renamed from: f */
    public static final t10 m5381f(ba1 ba1Var, InterfaceC0180en interfaceC0180en, int i, EnumC0576pc enumC0576pc) {
        return ((((i < 0 || i >= 2) && i != -2) || enumC0576pc != EnumC0576pc.f6081k) && !((i == 0 || i == -3) && enumC0576pc == EnumC0576pc.f6080j)) ? new C0838wf(ba1Var, interfaceC0180en, i, enumC0576pc) : ba1Var;
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m5382g(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    /* JADX INFO: renamed from: h */
    public static List m5383h(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    /* JADX INFO: renamed from: i */
    public static List m5384i(String str, Map map) {
        List listM5383h = m5383h(str, map);
        if (listM5383h == null) {
            return null;
        }
        for (int i = 0; i < listM5383h.size(); i++) {
            if (!(listM5383h.get(i) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listM5383h.get(i), Integer.valueOf(i), listM5383h));
            }
        }
        return listM5383h;
    }

    /* JADX INFO: renamed from: j */
    public static Double m5385j(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    /* JADX INFO: renamed from: k */
    public static Integer m5386k(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d = (Double) obj;
        int iIntValue = d.intValue();
        if (iIntValue == d.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d);
    }

    /* JADX INFO: renamed from: l */
    public static Map m5387l(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    /* JADX INFO: renamed from: m */
    public static String m5388m(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    /* JADX INFO: renamed from: n */
    public static Long m5389n(String str, Map map) {
        String strM5388m = m5388m(str, map);
        if (strM5388m == null) {
            return null;
        }
        try {
            return Long.valueOf(m5392s(strM5388m));
        } catch (ParseException e) {
            dd0.m1163h(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static List m5390o(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: p */
    public static long m5391p(int i, long j) {
        long j2;
        int i2 = i;
        long j3 = i2;
        if (j3 <= -1000000000 || j3 >= 1000000000) {
            long j4 = j3 / 1000000000;
            j2 = j + j4;
            if (!((j ^ j4) < 0) && !((j ^ j2) >= 0)) {
                throw new ArithmeticException("overflow: checkedAdd(" + j + ", " + j4 + ")");
            }
            i2 = (int) (j3 % 1000000000);
        } else {
            j2 = j;
        }
        if (j2 > 0 && i2 < 0) {
            i2 = (int) (((long) i2) + 1000000000);
            j2--;
        }
        if (j2 < 0 && i2 > 0) {
            i2 = (int) (((long) i2) - 1000000000);
            j2++;
        }
        if (j2 >= -315576000000L && j2 <= 315576000000L) {
            long j5 = i2;
            if (j5 >= -999999999 && j5 < 1000000000 && ((j2 >= 0 && i2 >= 0) || (j2 <= 0 && i2 <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j2);
                long j6 = i2;
                long j7 = nanos + j6;
                return (((j6 ^ nanos) > 0L ? 1 : ((j6 ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j7) >= 0) ? j7 : ((j7 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j2 + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i2 + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }

    /* JADX INFO: renamed from: s */
    public static long m5392s(String str) throws ParseException {
        boolean z;
        String strSubstring;
        int iCharAt;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z = true;
        } else {
            z = false;
        }
        String strSubstring2 = str.substring(0, str.length() - 1);
        int iIndexOf = strSubstring2.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long j = Long.parseLong(strSubstring2);
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i = 0; i < 9; i++) {
                iCharAt *= 10;
                if (i < strSubstring.length()) {
                    if (strSubstring.charAt(i) < '0' || strSubstring.charAt(i) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt = (strSubstring.charAt(i) - '0') + iCharAt;
                }
            }
        }
        if (j < 0) {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (z) {
            j = -j;
            iCharAt = -iCharAt;
        }
        try {
            return m5391p(iCharAt, j);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }

    /* JADX INFO: renamed from: t */
    public static qd0 m5393t(int i, InterfaceC0043az interfaceC0043az) {
        return new qd0(new C0163e6(i, 5), interfaceC0043az, f8603a, 20, false);
    }

    /* JADX INFO: renamed from: u */
    public static void m5394u(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m5395v(Object obj) {
        if (obj instanceof o21) {
            throw ((o21) obj).f5584j;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m5396w(String str, int i, List list) {
        if (list.size() == i) {
            return;
        }
        re1.m4349d(i, list.size(), str, " operation requires ");
    }

    /* JADX INFO: renamed from: x */
    public static so1 m5397x() {
        ClassLoader classLoader = wo1.class.getClassLoader();
        if (so1.class.equals(so1.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new wo1[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e2) {
                    Logger.getLogger(ro1.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(so1.class.getSimpleName()), (Throwable) e2);
                }
            }
            if (arrayList.size() == 1) {
                return (so1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (so1) so1.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e3) {
                throw new IllegalStateException(e3);
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m5398y(String str, int i, List list) {
        if (list.size() >= i) {
            return;
        }
        re1.m4349d(i, list.size(), str, " operation requires at least ");
    }

    /* JADX INFO: renamed from: z */
    public static void m5399z(String str, int i, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        re1.m4349d(i, arrayList.size(), str, " operation requires at most ");
    }

    /* JADX INFO: renamed from: b */
    public e90 mo5349b(Context context, Looper looper, C0902y5 c0902y5, Object obj, j90 j90Var, k90 k90Var) {
        return mo5350c(context, looper, c0902y5, obj, (el1) j90Var, (el1) k90Var);
    }

    /* JADX INFO: renamed from: c */
    public e90 mo5350c(Context context, Looper looper, C0902y5 c0902y5, Object obj, el1 el1Var, el1 el1Var2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo1230q(ja1 ja1Var);

    /* JADX INFO: renamed from: r */
    public abstract void mo1231r(er0 er0Var);
}
