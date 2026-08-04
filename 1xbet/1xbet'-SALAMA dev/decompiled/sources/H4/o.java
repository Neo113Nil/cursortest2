package H4;

import L4.r;
import W5.AbstractC0486a1;
import Y4.C0569e;
import Y4.D;
import Y4.H0;
import Y4.I;
import Y4.I0;
import Y4.InterfaceC0571f;
import Y4.K;
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.C0865j;
import com.google.protobuf.y0;
import com.google.protobuf.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I0 f3334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I0 f3335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final I0 f3336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I0 f3337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final I0 f3338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final I0 f3339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final I0 f3340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final I0 f3341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final I0 f3342i;
    public static final I0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final I0 f3343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final I0 f3344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final I0 f3345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I0 f3346n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final I0 f3347o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final I0 f3348p;

    static {
        H0 h0S = I0.S();
        h0S.g(Double.NaN);
        f3334a = (I0) h0S.b();
        H0 h0S2 = I0.S();
        h0S2.d();
        I0.C((I0) h0S2.f12096b);
        I0 i7 = (I0) h0S2.b();
        f3335b = i7;
        f3336c = i7;
        H0 h0S3 = I0.S();
        h0S3.k("__max__");
        I0 i8 = (I0) h0S3.b();
        f3337d = i8;
        H0 h0S4 = I0.S();
        I iB = K.B();
        iB.f(i8, "__type__");
        h0S4.i(iB);
        f3338e = (I0) h0S4.b();
        H0 h0S5 = I0.S();
        h0S5.k("__vector__");
        I0 i9 = (I0) h0S5.b();
        f3339f = i9;
        H0 h0S6 = I0.S();
        I iB2 = K.B();
        iB2.f(i9, "__type__");
        H0 h0S7 = I0.S();
        h0S7.f(C0569e.B());
        iB2.f((I0) h0S7.b(), "value");
        h0S6.i(iB2);
        f3340g = (I0) h0S6.b();
        H0 h0S8 = I0.S();
        h0S8.d();
        I0.D((I0) h0S8.f12096b, false);
        f3341h = (I0) h0S8.b();
        H0 h0S9 = I0.S();
        h0S9.g(Double.NaN);
        f3342i = (I0) h0S9.b();
        H0 h0S10 = I0.S();
        y0 y0VarA = z0.A();
        y0VarA.f(Long.MIN_VALUE);
        h0S10.l(y0VarA);
        j = (I0) h0S10.b();
        H0 h0S11 = I0.S();
        h0S11.k("");
        f3343k = (I0) h0S11.b();
        H0 h0S12 = I0.S();
        C0865j c0865j = AbstractC0867k.f12212b;
        h0S12.d();
        I0.x((I0) h0S12.f12096b, c0865j);
        f3344l = (I0) h0S12.b();
        h hVarB = h.b();
        H0 h0S13 = I0.S();
        String str = "projects//databases//documents/" + hVarB.f3318a.c();
        h0S13.d();
        I0.y((I0) h0S13.f12096b, str);
        f3345m = (I0) h0S13.b();
        H0 h0S14 = I0.S();
        p015b5.a aVarA = p015b5.b.A();
        aVarA.d();
        p015b5.b.v((p015b5.b) aVarA.f12096b, -90.0d);
        aVarA.d();
        p015b5.b.w((p015b5.b) aVarA.f12096b, -180.0d);
        h0S14.d();
        I0.z((I0) h0S14.f12096b, (p015b5.b) aVarA.b());
        f3346n = (I0) h0S14.b();
        H0 h0S15 = I0.S();
        C0569e c0569eY = C0569e.y();
        h0S15.d();
        I0.A(c0569eY, (I0) h0S15.f12096b);
        f3347o = (I0) h0S15.b();
        H0 h0S16 = I0.S();
        h0S16.j(K.w());
        f3348p = (I0) h0S16.b();
    }

    public static void a(StringBuilder sb, I0 i7) {
        boolean z4 = true;
        switch (p136t.e.e(i7.R())) {
            case 0:
                sb.append("null");
                return;
            case 1:
                sb.append(i7.H());
                return;
            case 2:
                sb.append(i7.M());
                return;
            case 3:
                sb.append(i7.K());
                return;
            case 4:
                z0 z0VarQ = i7.Q();
                sb.append("time(" + z0VarQ.z() + "," + z0VarQ.y() + ")");
                return;
            case 5:
                sb.append(i7.P());
                return;
            case 6:
                sb.append(r.i(i7.I()));
                return;
            case 7:
                p113p3.f.O("Value should be a ReferenceValue", i(i7), new Object[0]);
                sb.append(h.c(i7.O()));
                return;
            case 8:
                p015b5.b bVarL = i7.L();
                sb.append("geo(" + bVarL.y() + "," + bVarL.z() + ")");
                return;
            case 9:
                C0569e c0569eG = i7.G();
                sb.append("[");
                for (int i8 = 0; i8 < c0569eG.A(); i8++) {
                    a(sb, c0569eG.z(i8));
                    if (i8 != c0569eG.A() - 1) {
                        sb.append(",");
                    }
                }
                sb.append("]");
                return;
            case 10:
                K kN = i7.N();
                ArrayList<String> arrayList = new ArrayList(kN.y().keySet());
                Collections.sort(arrayList);
                sb.append("{");
                for (String str : arrayList) {
                    if (z4) {
                        z4 = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append(str);
                    sb.append(":");
                    a(sb, kN.A(str));
                }
                sb.append("}");
                return;
            default:
                p113p3.f.F("Invalid value type: ".concat(AbstractC0486a1.w(i7.R())), new Object[0]);
                throw null;
        }
    }

    public static int b(I0 i7, I0 i8) {
        int i9 = 1;
        int iL = l(i7);
        int iL2 = l(i8);
        if (iL != iL2) {
            return r.d(iL, iL2);
        }
        if (iL != Integer.MAX_VALUE) {
            switch (iL) {
                case 0:
                    break;
                case 1:
                    boolean zH = i7.H();
                    boolean zH2 = i8.H();
                    H5.k kVar = r.f4389a;
                    if (zH == zH2) {
                        return 0;
                    }
                    return zH ? 1 : -1;
                case 2:
                    if (i7.R() == 4) {
                        double dK = i7.K();
                        if (i8.R() == 4) {
                            double dK2 = i8.K();
                            H5.k kVar2 = r.f4389a;
                            return p113p3.f.H(dK, dK2);
                        }
                        if (i8.R() == 3) {
                            return r.e(dK, i8.M());
                        }
                    } else if (i7.R() == 3) {
                        long jM = i7.M();
                        if (i8.R() == 3) {
                            long jM2 = i8.M();
                            H5.k kVar3 = r.f4389a;
                            return Long.compare(jM, jM2);
                        }
                        if (i8.R() == 4) {
                            return r.e(i8.K(), jM) * (-1);
                        }
                    }
                    p113p3.f.F("Unexpected values: %s vs %s", i7, i8);
                    throw null;
                case 3:
                    z0 z0VarQ = i7.Q();
                    z0 z0VarQ2 = i8.Q();
                    long jZ = z0VarQ.z();
                    long jZ2 = z0VarQ2.z();
                    H5.k kVar4 = r.f4389a;
                    int iCompare = Long.compare(jZ, jZ2);
                    return iCompare != 0 ? iCompare : r.d(z0VarQ.y(), z0VarQ2.y());
                case 4:
                    z0 z0VarS = D.s(i7);
                    z0 z0VarS2 = D.s(i8);
                    long jZ3 = z0VarS.z();
                    long jZ4 = z0VarS2.z();
                    H5.k kVar5 = r.f4389a;
                    int iCompare2 = Long.compare(jZ3, jZ4);
                    return iCompare2 != 0 ? iCompare2 : r.d(z0VarS.y(), z0VarS2.y());
                case 5:
                    return i7.P().compareTo(i8.P());
                case 6:
                    return r.c(i7.I(), i8.I());
                case 7:
                    String strO = i7.O();
                    String strO2 = i8.O();
                    String[] strArrSplit = strO.split("/", -1);
                    String[] strArrSplit2 = strO2.split("/", -1);
                    int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
                    for (int i10 = 0; i10 < iMin; i10++) {
                        int iCompareTo = strArrSplit[i10].compareTo(strArrSplit2[i10]);
                        if (iCompareTo != 0) {
                            return iCompareTo;
                        }
                    }
                    return r.d(strArrSplit.length, strArrSplit2.length);
                case 8:
                    p015b5.b bVarL = i7.L();
                    p015b5.b bVarL2 = i8.L();
                    double dY = bVarL.y();
                    double dY2 = bVarL2.y();
                    H5.k kVar6 = r.f4389a;
                    int iH = p113p3.f.H(dY, dY2);
                    return iH == 0 ? p113p3.f.H(bVarL.z(), bVarL2.z()) : iH;
                case 9:
                    return c(i7.G(), i8.G());
                case 10:
                    K kN = i7.N();
                    K kN2 = i8.N();
                    Map mapY = kN.y();
                    Map mapY2 = kN2.y();
                    C0569e c0569eG = ((I0) mapY.get("value")).G();
                    C0569e c0569eG2 = ((I0) mapY2.get("value")).G();
                    int iD = r.d(c0569eG.A(), c0569eG2.A());
                    return iD != 0 ? iD : c(c0569eG, c0569eG2);
                case 11:
                    K kN3 = i7.N();
                    K kN4 = i8.N();
                    Iterator it = new TreeMap(kN3.y()).entrySet().iterator();
                    Iterator it2 = new TreeMap(kN4.y()).entrySet().iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        int iCompareTo2 = ((String) entry.getKey()).compareTo((String) entry2.getKey());
                        if (iCompareTo2 != 0) {
                            return iCompareTo2;
                        }
                        int iB = b((I0) entry.getValue(), (I0) entry2.getValue());
                        if (iB != 0) {
                            return iB;
                        }
                    }
                    boolean zHasNext = it.hasNext();
                    boolean zHasNext2 = it2.hasNext();
                    H5.k kVar7 = r.f4389a;
                    if (zHasNext == zHasNext2) {
                        i9 = 0;
                    } else if (!zHasNext) {
                        i9 = -1;
                    }
                    return i9;
                default:
                    p113p3.f.F(p031e1.k.d(iL, "Invalid value type: "), new Object[0]);
                    throw null;
            }
        }
        return 0;
    }

    public static int c(C0569e c0569e, C0569e c0569e2) {
        int iMin = Math.min(c0569e.A(), c0569e2.A());
        for (int i7 = 0; i7 < iMin; i7++) {
            int iB = b(c0569e.z(i7), c0569e2.z(i7));
            if (iB != 0) {
                return iB;
            }
        }
        return r.d(c0569e.A(), c0569e2.A());
    }

    public static boolean d(InterfaceC0571f interfaceC0571f, I0 i7) {
        Iterator it = interfaceC0571f.a().iterator();
        while (it.hasNext()) {
            if (e((I0) it.next(), i7)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    public static boolean e(I0 i7, I0 i8) {
        int iL;
        boolean z4 = true;
        if (i7 == i8) {
            return true;
        }
        if (i7 == null || i8 == null || (iL = l(i7)) != l(i8)) {
            return false;
        }
        if (iL == 2) {
            if (i7.R() != 3 || i8.R() != 3) {
                if (i7.R() != 4 || i8.R() != 4) {
                    return false;
                }
                if (Double.doubleToLongBits(i7.K()) != Double.doubleToLongBits(i8.K())) {
                    z4 = false;
                }
            } else if (i7.M() != i8.M()) {
                z4 = false;
            }
            return z4;
        }
        if (iL == 4) {
            return D.s(i7).equals(D.s(i8));
        }
        if (iL == Integer.MAX_VALUE) {
            return true;
        }
        switch (iL) {
            case 9:
                C0569e c0569eG = i7.G();
                C0569e c0569eG2 = i8.G();
                if (c0569eG.A() == c0569eG2.A()) {
                    for (int i9 = 0; i9 < c0569eG.A(); i9++) {
                        if (e(c0569eG.z(i9), c0569eG2.z(i9))) {
                        }
                    }
                    return true;
                }
                return false;
            case 10:
            case 11:
                K kN = i7.N();
                K kN2 = i8.N();
                if (kN.x() == kN2.x()) {
                    for (Map.Entry entry : kN.y().entrySet()) {
                        if (!e((I0) entry.getValue(), (I0) kN2.y().get(entry.getKey()))) {
                        }
                    }
                    return true;
                }
                return false;
            default:
                return i7.equals(i8);
        }
    }

    public static boolean f(I0 i7) {
        return i7 != null && i7.R() == 10;
    }

    public static boolean g(I0 i7) {
        return i7 != null && i7.R() == 4;
    }

    public static boolean h(I0 i7) {
        return i7 != null && i7.R() == 3;
    }

    public static boolean i(I0 i7) {
        return i7 != null && i7.R() == 8;
    }

    public static boolean j(I0 i7) {
        return f3339f.equals(i7.N().y().get("__type__"));
    }

    public static I0 k(f fVar, h hVar) {
        H0 h0S = I0.S();
        String str = "projects/" + fVar.f3313a + "/databases/" + fVar.f3314b + "/documents/" + hVar.f3318a.c();
        h0S.d();
        I0.y((I0) h0S.f12096b, str);
        return (I0) h0S.b();
    }

    public static int l(I0 i7) {
        switch (p136t.e.e(i7.R())) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                if (D.A(i7)) {
                    return 4;
                }
                if (f3337d.equals(i7.N().y().get("__type__"))) {
                    return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                }
                return j(i7) ? 10 : 11;
            default:
                p113p3.f.F("Invalid value type: ".concat(AbstractC0486a1.w(i7.R())), new Object[0]);
                throw null;
        }
    }
}
