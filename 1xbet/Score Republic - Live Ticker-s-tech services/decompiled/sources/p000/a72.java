package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class a72 extends k62 {

    /* JADX INFO: renamed from: m */
    public long f55m;

    /* JADX INFO: renamed from: n */
    public long f56n;

    /* JADX INFO: renamed from: E */
    public static fu1 m40E(pm1 pm1Var) {
        Object obj;
        Bundle bundleM41F = m41F(pm1Var.f6214c, true);
        String string = (!bundleM41F.containsKey("_o") || (obj = bundleM41F.get("_o")) == null) ? "app" : obj.toString();
        String strM5656r = AbstractC0875xf.m5656r(pm1Var.f6212a, zg1.f9762h, zg1.f9767m);
        if (strM5656r == null) {
            strM5656r = pm1Var.f6212a;
        }
        return new fu1(strM5656r, new eu1(bundleM41F), string, pm1Var.f6213b, 0L);
    }

    /* JADX INFO: renamed from: F */
    public static Bundle m41F(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(m41F((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: I */
    public static final void m42I(qz1 qz1Var, String str, Long l) {
        List listM4208g = qz1Var.m4208g();
        int i = 0;
        while (true) {
            if (i >= listM4208g.size()) {
                i = -1;
                break;
            } else if (str.equals(((wz1) listM4208g.get(i)).m5480u())) {
                break;
            } else {
                i++;
            }
        }
        uz1 uz1VarM5463F = wz1.m5463F();
        uz1VarM5463F.m5009g(str);
        uz1VarM5463F.m5011i(l.longValue());
        if (i < 0) {
            qz1Var.m4212k(uz1VarM5463F);
        } else {
            qz1Var.m5681b();
            ((rz1) qz1Var.f9011k).m4449K(i, (wz1) uz1VarM5463F.m5683d());
        }
    }

    /* JADX INFO: renamed from: J */
    public static final Bundle m43J(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wz1 wz1Var = (wz1) it.next();
            String strM5480u = wz1Var.m5480u();
            if (wz1Var.m5465B()) {
                bundle.putDouble(strM5480u, wz1Var.m5466C());
            } else if (wz1Var.m5485z()) {
                bundle.putFloat(strM5480u, wz1Var.m5464A());
            } else if (wz1Var.m5481v()) {
                bundle.putString(strM5480u, wz1Var.m5482w());
            } else if (wz1Var.m5483x()) {
                bundle.putLong(strM5480u, wz1Var.m5484y());
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: K */
    public static final wz1 m44K(String str, rz1 rz1Var) {
        for (wz1 wz1Var : rz1Var.m4461v()) {
            if (wz1Var.m5480u().equals(str)) {
                return wz1Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static final String m45L(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public static final Serializable m46M(String str, rz1 rz1Var) {
        wz1 wz1VarM44K = m44K(str, rz1Var);
        if (wz1VarM44K == null) {
            return null;
        }
        return m50S(wz1VarM44K);
    }

    /* JADX INFO: renamed from: P */
    public static final void m47P(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final void m48Q(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    /* JADX INFO: renamed from: R */
    public static final String m49R(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    /* JADX INFO: renamed from: S */
    public static final Serializable m50S(wz1 wz1Var) {
        if (wz1Var.m5481v()) {
            return wz1Var.m5482w();
        }
        if (wz1Var.m5483x()) {
            return Long.valueOf(wz1Var.m5484y());
        }
        if (wz1Var.m5465B()) {
            return Double.valueOf(wz1Var.m5466C());
        }
        if (wz1Var.m5468E() > 0) {
            return m60n0(wz1Var.m5467D());
        }
        return null;
    }

    /* JADX INFO: renamed from: T */
    public static final void m51T(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                m48Q(builder, str3, string, hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public static final void m52U(StringBuilder sb, String str, m02 m02Var) {
        if (m02Var == null) {
            return;
        }
        m47P(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (m02Var.m3310w() != 0) {
            m47P(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : m02Var.m3309v()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (m02Var.m3308u() != 0) {
            m47P(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : m02Var.m3307t()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (m02Var.m3312y() != 0) {
            m47P(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (pz1 pz1Var : m02Var.m3311x()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(pz1Var.m4016t() ? Integer.valueOf(pz1Var.m4017u()) : null);
                sb.append(":");
                sb.append(pz1Var.m4018v() ? Long.valueOf(pz1Var.m4019w()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (m02Var.m3298A() != 0) {
            m47P(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (p02 p02Var : m02Var.m3313z()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(p02Var.m3825t() ? Integer.valueOf(p02Var.m3826u()) : null);
                sb.append(": [");
                Iterator it = p02Var.m3827v().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        m47P(3, sb);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: V */
    public static final void m53V(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m47P(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* JADX INFO: renamed from: W */
    public static final void m54W(StringBuilder sb, int i, String str, ax1 ax1Var) {
        String str2;
        if (ax1Var == null) {
            return;
        }
        m47P(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (ax1Var.m518t()) {
            int iM517D = ax1Var.m517D();
            if (iM517D == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iM517D == 2) {
                str2 = "LESS_THAN";
            } else if (iM517D != 3) {
                str2 = iM517D != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            m53V(sb, i, "comparison_type", str2);
        }
        if (ax1Var.m519u()) {
            m53V(sb, i, "match_as_float", Boolean.valueOf(ax1Var.m520v()));
        }
        if (ax1Var.m521w()) {
            m53V(sb, i, "comparison_value", ax1Var.m522x());
        }
        if (ax1Var.m523y()) {
            m53V(sb, i, "min_comparison_value", ax1Var.m524z());
        }
        if (ax1Var.m515A()) {
            m53V(sb, i, "max_comparison_value", ax1Var.m516B());
        }
        m47P(i, sb);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m55e0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m56f0(jp1 jp1Var, int i) {
        if (i < ((pp1) jp1Var).f6232l * 64) {
            return ((1 << (i % 64)) & ((Long) ((pp1) jp1Var).get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public static ArrayList m57g0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l0 */
    public static xo1 m58l0(xo1 xo1Var, byte[] bArr) throws mp1 {
        so1 so1VarM4573a = so1.m4573a();
        if (so1VarM4573a != null) {
            xo1Var.getClass();
            xo1Var.m5685f(bArr, bArr.length, so1VarM4573a);
            return xo1Var;
        }
        xo1Var.getClass();
        int length = bArr.length;
        int i = fo1.f2465a;
        xo1Var.m5685f(bArr, length, so1.f7177b);
        return xo1Var;
    }

    /* JADX INFO: renamed from: m0 */
    public static int m59m0(String str, g02 g02Var) {
        for (int i = 0; i < ((i02) g02Var.f9011k).m2438a2(); i++) {
            if (str.equals(((i02) g02Var.f9011k).m2441b2(i).m4643v())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: n0 */
    public static Bundle[] m60n0(kp1 kp1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = kp1Var.iterator();
        while (it.hasNext()) {
            wz1 wz1Var = (wz1) it.next();
            if (wz1Var != null) {
                Bundle bundle = new Bundle();
                for (wz1 wz1Var2 : wz1Var.m5467D()) {
                    if (wz1Var2.m5481v()) {
                        bundle.putString(wz1Var2.m5480u(), wz1Var2.m5482w());
                    } else if (wz1Var2.m5483x()) {
                        bundle.putLong(wz1Var2.m5480u(), wz1Var2.m5484y());
                    } else if (wz1Var2.m5465B()) {
                        bundle.putDouble(wz1Var2.m5480u(), wz1Var2.m5466C());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: o0 */
    public static HashMap m61o0(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(m61o0((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(m61o0((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(m61o0((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: G */
    public final void m62G(Map map) {
        long epochMilli;
        f02 f02Var = (f02) this.f7192j;
        String strM45L = m45L("Date", map);
        if (TextUtils.isEmpty(strM45L)) {
            return;
        }
        try {
            epochMilli = ZonedDateTime.parse(strM45L, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
        } catch (DateTimeParseException unused) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5313b(strM45L, "Unable to parse header time, time");
            epochMilli = 0;
        }
        if (epochMilli > 0) {
            f02Var.f2252t.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            mo11z();
            if (this.f56n == 0) {
                this.f55m = jElapsedRealtime;
                this.f56n = epochMilli;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final long m63H(long j) {
        mo11z();
        long j2 = this.f56n;
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return (j2 - this.f55m) + j;
    }

    /* JADX INFO: renamed from: N */
    public final void m64N(StringBuilder sb, int i, kp1 kp1Var) {
        if (kp1Var == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = kp1Var.iterator();
        while (it.hasNext()) {
            wz1 wz1Var = (wz1) it.next();
            if (wz1Var != null) {
                m47P(i2, sb);
                sb.append("param {\n");
                m53V(sb, i2, "name", wz1Var.m5479t() ? ((f02) this.f7192j).f2251s.m1044b(wz1Var.m5480u()) : null);
                m53V(sb, i2, "string_value", wz1Var.m5481v() ? wz1Var.m5482w() : null);
                m53V(sb, i2, "int_value", wz1Var.m5483x() ? Long.valueOf(wz1Var.m5484y()) : null);
                m53V(sb, i2, "double_value", wz1Var.m5465B() ? Double.valueOf(wz1Var.m5466C()) : null);
                if (wz1Var.m5468E() > 0) {
                    m64N(sb, i2, wz1Var.m5467D());
                }
                m47P(i2, sb);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m65O(StringBuilder sb, int i, xw1 xw1Var) {
        String str;
        if (xw1Var == null) {
            return;
        }
        m47P(i, sb);
        sb.append("filter {\n");
        if (xw1Var.m5705x()) {
            m53V(sb, i, "complement", Boolean.valueOf(xw1Var.m5706y()));
        }
        if (xw1Var.m5707z()) {
            m53V(sb, i, "param_name", ((f02) this.f7192j).f2251s.m1044b(xw1Var.m5699A()));
        }
        if (xw1Var.m5701t()) {
            int i2 = i + 1;
            fx1 fx1VarM5702u = xw1Var.m5702u();
            if (fx1VarM5702u != null) {
                m47P(i2, sb);
                sb.append("string_filter {\n");
                if (fx1VarM5702u.m1900t()) {
                    switch (fx1VarM5702u.m1899B()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m53V(sb, i2, "match_type", str);
                }
                if (fx1VarM5702u.m1901u()) {
                    m53V(sb, i2, "expression", fx1VarM5702u.m1902v());
                }
                if (fx1VarM5702u.m1903w()) {
                    m53V(sb, i2, "case_sensitive", Boolean.valueOf(fx1VarM5702u.m1904x()));
                }
                if (fx1VarM5702u.m1906z() > 0) {
                    m47P(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : fx1VarM5702u.m1905y()) {
                        m47P(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m47P(i2, sb);
                sb.append("}\n");
            }
        }
        if (xw1Var.m5703v()) {
            m54W(sb, i + 1, "number_filter", xw1Var.m5704w());
        }
        m47P(i, sb);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: X */
    public final void m66X(s02 s02Var, Object obj) {
        p80.m3863h(obj);
        s02Var.m5681b();
        ((t02) s02Var.f9011k).m4636I();
        s02Var.m5681b();
        ((t02) s02Var.f9011k).m4638K();
        s02Var.m5681b();
        ((t02) s02Var.f9011k).m4640M();
        if (obj instanceof String) {
            s02Var.m5681b();
            ((t02) s02Var.f9011k).m4635H((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            s02Var.m5681b();
            ((t02) s02Var.f9011k).m4637J(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            s02Var.m5681b();
            ((t02) s02Var.f9011k).m4639L(dDoubleValue);
        } else {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5313b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m67Y(uz1 uz1Var, Object obj) {
        uz1Var.m5681b();
        ((wz1) uz1Var.f9011k).m5471I();
        uz1Var.m5681b();
        ((wz1) uz1Var.f9011k).m5473K();
        uz1Var.m5681b();
        ((wz1) uz1Var.f9011k).m5475M();
        uz1Var.m5681b();
        ((wz1) uz1Var.f9011k).m5478P();
        if (obj instanceof String) {
            uz1Var.m5010h((String) obj);
            return;
        }
        if (obj instanceof Long) {
            uz1Var.m5011i(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            uz1Var.m5681b();
            ((wz1) uz1Var.f9011k).m5474L(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5313b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                uz1 uz1VarM5463F = wz1.m5463F();
                for (String str : bundle.keySet()) {
                    uz1 uz1VarM5463F2 = wz1.m5463F();
                    uz1VarM5463F2.m5009g(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        uz1VarM5463F2.m5011i(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        uz1VarM5463F2.m5010h((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        uz1VarM5463F2.m5681b();
                        ((wz1) uz1VarM5463F2.f9011k).m5474L(dDoubleValue2);
                    }
                    uz1VarM5463F.m5681b();
                    ((wz1) uz1VarM5463F.f9011k).m5476N((wz1) uz1VarM5463F2.m5683d());
                }
                if (((wz1) uz1VarM5463F.f9011k).m5468E() > 0) {
                    arrayList.add((wz1) uz1VarM5463F.m5683d());
                }
            }
        }
        uz1Var.m5681b();
        ((wz1) uz1Var.f9011k).m5477O(arrayList);
    }

    /* JADX INFO: renamed from: Z */
    public final y52 m68Z(String str, g02 g02Var, qz1 qz1Var, String str2) {
        int iIndexOf;
        fs1.m1890a();
        f02 f02Var = (f02) this.f7192j;
        bt1 bt1Var = f02Var.f2245m;
        if (!bt1Var.m770L(str, jx1.f4141O0)) {
            return null;
        }
        f02Var.f2252t.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(bt1Var.m766H(str, jx1.f4213t0).split(",")));
        x62 x62Var = this.f1566k;
        o62 o62Var = x62Var.f8830s;
        sz1 sz1Var = x62Var.f8821j;
        sz1 sz1Var2 = o62Var.f1566k.f8821j;
        x62.m5533U(sz1Var2);
        String strM4618N = sz1Var2.m4618N(str);
        Uri.Builder builder = new Uri.Builder();
        bt1 bt1Var2 = ((f02) o62Var.f7192j).f2245m;
        builder.scheme(bt1Var2.m766H(str, jx1.f4199m0));
        if (TextUtils.isEmpty(strM4618N)) {
            builder.authority(bt1Var2.m766H(str, jx1.f4201n0));
        } else {
            String strM766H = bt1Var2.m766H(str, jx1.f4201n0);
            StringBuilder sb = new StringBuilder(String.valueOf(strM4618N).length() + 1 + String.valueOf(strM766H).length());
            sb.append(strM4618N);
            sb.append(".");
            sb.append(strM766H);
            builder.authority(sb.toString());
        }
        builder.path(bt1Var2.m766H(str, jx1.f4203o0));
        m48Q(builder, "gmp_app_id", ((i02) g02Var.f9011k).m2384I(), hashSet);
        bt1Var.m765G();
        m48Q(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String strM2366C = ((i02) g02Var.f9011k).m2366C();
        ix1 ix1Var = jx1.f4147R0;
        if (bt1Var.m770L(str, ix1Var)) {
            x62.m5533U(sz1Var);
            if (sz1Var.m4625U(str)) {
                strM2366C = "";
            }
        }
        m48Q(builder, "app_instance_id", strM2366C, hashSet);
        m48Q(builder, "rdid", ((i02) g02Var.f9011k).m2511z(), hashSet);
        m48Q(builder, "bundle_id", g02Var.m1957n(), hashSet);
        String strM4214m = qz1Var.m4214m();
        String strM5656r = AbstractC0875xf.m5656r(strM4214m, zg1.f9767m, zg1.f9762h);
        if (true != TextUtils.isEmpty(strM5656r)) {
            strM4214m = strM5656r;
        }
        m48Q(builder, "app_event_name", strM4214m, hashSet);
        m48Q(builder, "app_version", String.valueOf(((i02) g02Var.f9011k).m2402O()), hashSet);
        String strM2477n2 = ((i02) g02Var.f9011k).m2477n2();
        if (bt1Var.m770L(str, ix1Var)) {
            x62.m5533U(sz1Var);
            if (sz1Var.m4624T(str) && !TextUtils.isEmpty(strM2477n2) && (iIndexOf = strM2477n2.indexOf(".")) != -1) {
                strM2477n2 = strM2477n2.substring(0, iIndexOf);
            }
        }
        m48Q(builder, "os_version", strM2477n2, hashSet);
        m48Q(builder, "timestamp", String.valueOf(qz1Var.m4216o()), hashSet);
        if (((i02) g02Var.f9011k).m2363B()) {
            m48Q(builder, "lat", "1", hashSet);
        }
        m48Q(builder, "privacy_sandbox_version", String.valueOf(((i02) g02Var.f9011k).m2391K0()), hashSet);
        m48Q(builder, "trigger_uri_source", "1", hashSet);
        m48Q(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), hashSet);
        m48Q(builder, "request_uuid", str2, hashSet);
        List<wz1> listM4208g = qz1Var.m4208g();
        Bundle bundle = new Bundle();
        for (wz1 wz1Var : listM4208g) {
            String strM5480u = wz1Var.m5480u();
            if (wz1Var.m5465B()) {
                bundle.putString(strM5480u, String.valueOf(wz1Var.m5466C()));
            } else if (wz1Var.m5485z()) {
                bundle.putString(strM5480u, String.valueOf(wz1Var.m5464A()));
            } else if (wz1Var.m5481v()) {
                bundle.putString(strM5480u, wz1Var.m5482w());
            } else if (wz1Var.m5483x()) {
                bundle.putString(strM5480u, String.valueOf(wz1Var.m5484y()));
            }
        }
        m51T(builder, bt1Var.m766H(str, jx1.f4211s0).split("\\|"), bundle, hashSet);
        List<t02> listUnmodifiableList = Collections.unmodifiableList(((i02) g02Var.f9011k).m2435Z1());
        Bundle bundle2 = new Bundle();
        for (t02 t02Var : listUnmodifiableList) {
            String strM4643v = t02Var.m4643v();
            if (t02Var.m4631C()) {
                bundle2.putString(strM4643v, String.valueOf(t02Var.m4632D()));
            } else if (t02Var.m4629A()) {
                bundle2.putString(strM4643v, String.valueOf(t02Var.m4630B()));
            } else if (t02Var.m4644w()) {
                bundle2.putString(strM4643v, t02Var.m4645x());
            } else if (t02Var.m4646y()) {
                bundle2.putString(strM4643v, String.valueOf(t02Var.m4647z()));
            }
        }
        m51T(builder, bt1Var.m766H(str, jx1.f4209r0).split("\\|"), bundle2, hashSet);
        m48Q(builder, "dma", true != ((i02) g02Var.f9011k).m2382H0() ? "0" : "1", hashSet);
        if (!((i02) g02Var.f9011k).m2388J0().isEmpty()) {
            m48Q(builder, "dma_cps", ((i02) g02Var.f9011k).m2388J0(), hashSet);
        }
        if (((i02) g02Var.f9011k).m2406P0()) {
            wy1 wy1VarM2409Q0 = ((i02) g02Var.f9011k).m2409Q0();
            if (!wy1VarM2409Q0.m5433H().isEmpty()) {
                m48Q(builder, "dl_gclid", wy1VarM2409Q0.m5433H(), hashSet);
            }
            if (!wy1VarM2409Q0.m5435J().isEmpty()) {
                m48Q(builder, "dl_gbraid", wy1VarM2409Q0.m5435J(), hashSet);
            }
            if (!wy1VarM2409Q0.m5437L().isEmpty()) {
                m48Q(builder, "dl_gs", wy1VarM2409Q0.m5437L(), hashSet);
            }
            if (wy1VarM2409Q0.m5439N() > 0) {
                m48Q(builder, "dl_ss_ts", String.valueOf(wy1VarM2409Q0.m5439N()), hashSet);
            }
            if (!wy1VarM2409Q0.m5441P().isEmpty()) {
                m48Q(builder, "mr_gclid", wy1VarM2409Q0.m5441P(), hashSet);
            }
            if (!wy1VarM2409Q0.m5443R().isEmpty()) {
                m48Q(builder, "mr_gbraid", wy1VarM2409Q0.m5443R(), hashSet);
            }
            if (!wy1VarM2409Q0.m5445T().isEmpty()) {
                m48Q(builder, "mr_gs", wy1VarM2409Q0.m5445T(), hashSet);
            }
            if (wy1VarM2409Q0.m5447V() > 0) {
                m48Q(builder, "mr_click_ts", String.valueOf(wy1VarM2409Q0.m5447V()), hashSet);
            }
        }
        return new y52(1, jCurrentTimeMillis, builder.build().toString());
    }

    /* JADX INFO: renamed from: a0 */
    public final rz1 m69a0(bu1 bu1Var) {
        qz1 qz1VarM4439J = rz1.m4439J();
        long j = bu1Var.f997f;
        qz1VarM4439J.m5681b();
        ((rz1) qz1VarM4439J.f9011k).m4456R(j);
        long j2 = bu1Var.f996e;
        qz1VarM4439J.m5681b();
        ((rz1) qz1VarM4439J.f9011k).m4459t(j2);
        eu1 eu1Var = bu1Var.f998g;
        Objects.requireNonNull(eu1Var);
        Bundle bundle = eu1Var.f2185j;
        for (String str : bundle.keySet()) {
            uz1 uz1VarM5463F = wz1.m5463F();
            uz1VarM5463F.m5009g(str);
            Object obj = bundle.get(str);
            p80.m3863h(obj);
            m67Y(uz1VarM5463F, obj);
            qz1VarM4439J.m4212k(uz1VarM5463F);
        }
        String str2 = bu1Var.f994c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            uz1 uz1VarM5463F2 = wz1.m5463F();
            uz1VarM5463F2.m5009g("_o");
            uz1VarM5463F2.m5010h(str2);
            qz1VarM4439J.m4211j((wz1) uz1VarM5463F2.m5683d());
        }
        return (rz1) qz1VarM4439J.m5683d();
    }

    /* JADX INFO: renamed from: b0 */
    public final String m70b0(e02 e02Var) {
        String str;
        String str2;
        String str3;
        cz1 cz1VarM2397M0;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (e02Var.m1343y()) {
            m53V(sb, 0, "upload_subdomain", e02Var.m1344z());
        }
        if (e02Var.m1341w()) {
            m53V(sb, 0, "sgtm_join_id", e02Var.m1342x());
        }
        for (i02 i02Var : e02Var.m1338t()) {
            if (i02Var != null) {
                m47P(1, sb);
                sb.append("bundle {\n");
                if (i02Var.m2417T()) {
                    m53V(sb, 1, "protocol_version", Integer.valueOf(i02Var.m2418T0()));
                }
                f02 f02Var = (f02) this.f7192j;
                bt1 bt1Var = f02Var.f2245m;
                cy1 cy1Var = f02Var.f2251s;
                if (bt1Var.m770L(i02Var.m2493t(), jx1.f4137M0) && i02Var.m2512z0()) {
                    m53V(sb, 1, "session_stitching_token", i02Var.m2361A0());
                }
                m53V(sb, 1, "platform", i02Var.m2474m2());
                if (i02Var.m2499v()) {
                    m53V(sb, 1, "gmp_version", Long.valueOf(i02Var.m2502w()));
                }
                if (i02Var.m2505x()) {
                    m53V(sb, 1, "uploading_gmp_version", Long.valueOf(i02Var.m2508y()));
                }
                if (i02Var.m2500v0()) {
                    m53V(sb, 1, "dynamite_version", Long.valueOf(i02Var.m2503w0()));
                }
                if (i02Var.m2405P()) {
                    m53V(sb, 1, "config_version", Long.valueOf(i02Var.m2408Q()));
                }
                m53V(sb, 1, "gmp_app_id", i02Var.m2384I());
                m53V(sb, 1, "app_id", i02Var.m2493t());
                m53V(sb, 1, "app_version", i02Var.m2496u());
                if (i02Var.m2399N()) {
                    m53V(sb, 1, "app_version_major", Integer.valueOf(i02Var.m2402O()));
                }
                m53V(sb, 1, "firebase_instance_id", i02Var.m2396M());
                if (i02Var.m2369D()) {
                    m53V(sb, 1, "dev_cert_hash", Long.valueOf(i02Var.m2372E()));
                }
                m53V(sb, 1, "app_store", i02Var.m2492s2());
                if (i02Var.m2444c2()) {
                    m53V(sb, 1, "upload_timestamp_millis", Long.valueOf(i02Var.m2447d2()));
                }
                if (i02Var.m2450e2()) {
                    m53V(sb, 1, "start_timestamp_millis", Long.valueOf(i02Var.m2453f2()));
                }
                if (i02Var.m2456g2()) {
                    m53V(sb, 1, "end_timestamp_millis", Long.valueOf(i02Var.m2459h2()));
                }
                if (i02Var.m2462i2()) {
                    m53V(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(i02Var.m2465j2()));
                }
                if (i02Var.m2468k2()) {
                    m53V(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(i02Var.m2471l2()));
                }
                m53V(sb, 1, "app_instance_id", i02Var.m2366C());
                m53V(sb, 1, "resettable_device_id", i02Var.m2511z());
                m53V(sb, 1, "ds_id", i02Var.m2414S());
                if (i02Var.m2360A()) {
                    m53V(sb, 1, "limited_ad_tracking", Boolean.valueOf(i02Var.m2363B()));
                }
                m53V(sb, 1, "os_version", i02Var.m2477n2());
                m53V(sb, 1, "device_model", i02Var.m2480o2());
                m53V(sb, 1, "user_default_language", i02Var.m2483p2());
                if (i02Var.m2486q2()) {
                    m53V(sb, 1, "time_zone_offset_minutes", Integer.valueOf(i02Var.m2489r2()));
                }
                if (i02Var.m2375F()) {
                    m53V(sb, 1, "bundle_sequential_index", Integer.valueOf(i02Var.m2378G()));
                }
                if (i02Var.m2400N0()) {
                    m53V(sb, 1, "delivery_index", Integer.valueOf(i02Var.m2403O0()));
                }
                if (i02Var.m2387J()) {
                    m53V(sb, 1, "service_upload", Boolean.valueOf(i02Var.m2390K()));
                }
                m53V(sb, 1, "health_monitor", i02Var.m2381H());
                if (i02Var.m2494t0()) {
                    m53V(sb, 1, "retry_counter", Integer.valueOf(i02Var.m2497u0()));
                }
                if (i02Var.m2506x0()) {
                    m53V(sb, 1, "consent_signals", i02Var.m2509y0());
                }
                if (i02Var.m2379G0()) {
                    m53V(sb, 1, "is_dma_region", Boolean.valueOf(i02Var.m2382H0()));
                }
                if (i02Var.m2385I0()) {
                    m53V(sb, 1, "core_platform_services", i02Var.m2388J0());
                }
                if (i02Var.m2373E0()) {
                    m53V(sb, 1, "consent_diagnostics", i02Var.m2376F0());
                }
                if (i02Var.m2364B0()) {
                    m53V(sb, 1, "target_os_version", Long.valueOf(i02Var.m2367C0()));
                }
                fs1.m1890a();
                if (bt1Var.m770L(i02Var.m2493t(), jx1.f4141O0)) {
                    m53V(sb, 1, "ad_services_version", Integer.valueOf(i02Var.m2391K0()));
                    if (i02Var.m2394L0() && (cz1VarM2397M0 = i02Var.m2397M0()) != null) {
                        m47P(2, sb);
                        sb.append("attribution_eligibility_status {\n");
                        m53V(sb, 2, "eligible", Boolean.valueOf(cz1VarM2397M0.m1060t()));
                        m53V(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(cz1VarM2397M0.m1061u()));
                        m53V(sb, 2, "pre_r", Boolean.valueOf(cz1VarM2397M0.m1062v()));
                        m53V(sb, 2, "r_extensions_too_old", Boolean.valueOf(cz1VarM2397M0.m1063w()));
                        m53V(sb, 2, "adservices_extension_too_old", Boolean.valueOf(cz1VarM2397M0.m1064x()));
                        m53V(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(cz1VarM2397M0.m1065y()));
                        m53V(sb, 2, "measurement_manager_disabled", Boolean.valueOf(cz1VarM2397M0.m1066z()));
                        m47P(2, sb);
                        sb.append("}\n");
                    }
                }
                if (i02Var.m2406P0()) {
                    wy1 wy1VarM2409Q0 = i02Var.m2409Q0();
                    m47P(2, sb);
                    sb.append("ad_campaign_info {\n");
                    if (wy1VarM2409Q0.m5432G()) {
                        m53V(sb, 2, "deep_link_gclid", wy1VarM2409Q0.m5433H());
                    }
                    if (wy1VarM2409Q0.m5434I()) {
                        m53V(sb, 2, "deep_link_gbraid", wy1VarM2409Q0.m5435J());
                    }
                    if (wy1VarM2409Q0.m5436K()) {
                        m53V(sb, 2, "deep_link_gad_source", wy1VarM2409Q0.m5437L());
                    }
                    if (wy1VarM2409Q0.m5448W()) {
                        m53V(sb, 2, "deep_link_url", wy1VarM2409Q0.m5449X());
                    }
                    if (wy1VarM2409Q0.m5438M()) {
                        m53V(sb, 2, "deep_link_session_millis", Long.valueOf(wy1VarM2409Q0.m5439N()));
                    }
                    if (wy1VarM2409Q0.m5440O()) {
                        m53V(sb, 2, "market_referrer_gclid", wy1VarM2409Q0.m5441P());
                    }
                    if (wy1VarM2409Q0.m5442Q()) {
                        m53V(sb, 2, "market_referrer_gbraid", wy1VarM2409Q0.m5443R());
                    }
                    if (wy1VarM2409Q0.m5444S()) {
                        m53V(sb, 2, "market_referrer_gad_source", wy1VarM2409Q0.m5445T());
                    }
                    if (wy1VarM2409Q0.m5446U()) {
                        m53V(sb, 2, "market_referrer_click_millis", Long.valueOf(wy1VarM2409Q0.m5447V()));
                    }
                    m47P(2, sb);
                    sb.append("}\n");
                }
                if (i02Var.m2420U()) {
                    m53V(sb, 1, "batching_timestamp_millis", Long.valueOf(i02Var.m2423V()));
                }
                if (i02Var.m2412R0()) {
                    r02 r02VarM2415S0 = i02Var.m2415S0();
                    m47P(2, sb);
                    sb.append("sgtm_diagnostics {\n");
                    int iM4228x = r02VarM2415S0.m4228x();
                    if (iM4228x == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iM4228x == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iM4228x != 3) {
                        str2 = iM4228x != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    m53V(sb, 2, "upload_type", str2);
                    m53V(sb, 2, "client_upload_eligibility", j11.m2776k(r02VarM2415S0.m4226t()));
                    int iM4229y = r02VarM2415S0.m4229y();
                    if (iM4229y == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iM4229y == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iM4229y == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iM4229y != 4) {
                        str3 = iM4229y != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    m53V(sb, 2, "service_upload_eligibility", str3);
                    m47P(2, sb);
                    sb.append("}\n");
                }
                if (i02Var.m2426W()) {
                    mz1 mz1VarM2429X = i02Var.m2429X();
                    m47P(2, sb);
                    sb.append("consent_info_extra {\n");
                    for (kz1 kz1Var : mz1VarM2429X.m3453t()) {
                        m47P(3, sb);
                        sb.append("limited_data_modes {\n");
                        int iM3129u = kz1Var.m3129u();
                        if (iM3129u == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iM3129u == 2) {
                            str = "AD_STORAGE";
                        } else if (iM3129u != 3) {
                            str = iM3129u != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        m53V(sb, 3, "type", str);
                        int iM3130v = kz1Var.m3130v();
                        m53V(sb, 3, "mode", iM3130v != 1 ? iM3130v != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        m47P(3, sb);
                        sb.append("}\n");
                    }
                    m47P(2, sb);
                    sb.append("}\n");
                }
                kp1<t02> kp1VarM2435Z1 = i02Var.m2435Z1();
                if (kp1VarM2435Z1 != null) {
                    for (t02 t02Var : kp1VarM2435Z1) {
                        if (t02Var != null) {
                            m47P(2, sb);
                            sb.append("user_property {\n");
                            m53V(sb, 2, "set_timestamp_millis", t02Var.m4641t() ? Long.valueOf(t02Var.m4642u()) : null);
                            m53V(sb, 2, "name", cy1Var.m1045c(t02Var.m4643v()));
                            m53V(sb, 2, "string_value", t02Var.m4645x());
                            m53V(sb, 2, "int_value", t02Var.m4646y() ? Long.valueOf(t02Var.m4647z()) : null);
                            m53V(sb, 2, "double_value", t02Var.m4631C() ? Double.valueOf(t02Var.m4632D()) : null);
                            m47P(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                kp1<ez1> kp1VarM2393L = i02Var.m2393L();
                if (kp1VarM2393L != null) {
                    for (ez1 ez1Var : kp1VarM2393L) {
                        if (ez1Var != null) {
                            m47P(2, sb);
                            sb.append("audience_membership {\n");
                            if (ez1Var.m1533t()) {
                                m53V(sb, 2, "audience_id", Integer.valueOf(ez1Var.m1534u()));
                            }
                            if (ez1Var.m1538y()) {
                                m53V(sb, 2, "new_audience", Boolean.valueOf(ez1Var.m1539z()));
                            }
                            m52U(sb, "current_data", ez1Var.m1535v());
                            if (ez1Var.m1536w()) {
                                m52U(sb, "previous_data", ez1Var.m1537x());
                            }
                            m47P(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                List<rz1> listM2419T1 = i02Var.m2419T1();
                if (listM2419T1 != null) {
                    for (rz1 rz1Var : listM2419T1) {
                        if (rz1Var != null) {
                            m47P(2, sb);
                            sb.append("event {\n");
                            m53V(sb, 2, "name", cy1Var.m1043a(rz1Var.m4464y()));
                            if (rz1Var.m4465z()) {
                                m53V(sb, 2, "timestamp_millis", Long.valueOf(rz1Var.m4440A()));
                            }
                            if (bt1Var.m770L(null, jx1.f4178e1) && rz1Var.m4445F()) {
                                m53V(sb, 2, "corrected_timestamp_millis", Long.valueOf(rz1Var.m4446G()));
                            }
                            if (rz1Var.m4441B()) {
                                m53V(sb, 2, "previous_timestamp_millis", Long.valueOf(rz1Var.m4442C()));
                            }
                            if (rz1Var.m4443D()) {
                                m53V(sb, 2, "count", Integer.valueOf(rz1Var.m4444E()));
                            }
                            if (rz1Var.m4462w() != 0) {
                                m64N(sb, 2, (kp1) rz1Var.m4461v());
                            }
                            m47P(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                m47P(1, sb);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c0 */
    public final String m71c0(ex1 ex1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (ex1Var.m1511t()) {
            m53V(sb, 0, "filter_id", Integer.valueOf(ex1Var.m1512u()));
        }
        m53V(sb, 0, "property_name", ((f02) this.f7192j).f2251s.m1045c(ex1Var.m1513v()));
        String strM49R = m49R(ex1Var.m1515x(), ex1Var.m1516y(), ex1Var.m1509A());
        if (!strM49R.isEmpty()) {
            m53V(sb, 0, "filter_type", strM49R);
        }
        m65O(sb, 1, ex1Var.m1514w());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: d0 */
    public final Parcelable m72d0(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (r41 unused) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    /* JADX INFO: renamed from: h0 */
    public final List m73h0(jp1 jp1Var, List list) {
        int i;
        f02 f02Var = (f02) this.f7192j;
        ArrayList arrayList = new ArrayList(jp1Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                ky1 ky1Var = f02Var.f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4603r.m5313b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    ky1 ky1Var2 = f02Var.f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4603r.m5314c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m74i0(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((f02) this.f7192j).f2252t.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    /* JADX INFO: renamed from: j0 */
    public final long m75j0(byte[] bArr) {
        p80.m3863h(bArr);
        f02 f02Var = (f02) this.f7192j;
        f72 f72Var = f02Var.f2250r;
        f02.m1558k(f72Var);
        f72Var.mo11z();
        MessageDigest messageDigestM1685T = f72.m1685T();
        if (messageDigestM1685T != null) {
            return f72.m1686U(messageDigestM1685T.digest(bArr));
        }
        ky1 ky1Var = f02Var.f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4600o.m5312a("Failed to get MD5");
        return 0L;
    }

    /* JADX INFO: renamed from: k0 */
    public final byte[] m76k0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5313b(e, "Failed to gzip content");
            throw e;
        }
    }

    @Override // p000.k62
    /* JADX INFO: renamed from: D */
    public final void mo34D() {
    }
}
