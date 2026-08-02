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
import b5.C0788a;
import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.C0909j;
import com.google.protobuf.y0;
import com.google.protobuf.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final I0 f3334a;

    /* renamed from: b, reason: collision with root package name */
    public static final I0 f3335b;

    /* renamed from: c, reason: collision with root package name */
    public static final I0 f3336c;

    /* renamed from: d, reason: collision with root package name */
    public static final I0 f3337d;

    /* renamed from: e, reason: collision with root package name */
    public static final I0 f3338e;

    /* renamed from: f, reason: collision with root package name */
    public static final I0 f3339f;

    /* renamed from: g, reason: collision with root package name */
    public static final I0 f3340g;

    /* renamed from: h, reason: collision with root package name */
    public static final I0 f3341h;

    /* renamed from: i, reason: collision with root package name */
    public static final I0 f3342i;
    public static final I0 j;

    /* renamed from: k, reason: collision with root package name */
    public static final I0 f3343k;

    /* renamed from: l, reason: collision with root package name */
    public static final I0 f3344l;

    /* renamed from: m, reason: collision with root package name */
    public static final I0 f3345m;

    /* renamed from: n, reason: collision with root package name */
    public static final I0 f3346n;

    /* renamed from: o, reason: collision with root package name */
    public static final I0 f3347o;

    /* renamed from: p, reason: collision with root package name */
    public static final I0 f3348p;

    static {
        H0 S6 = I0.S();
        S6.g(Double.NaN);
        f3334a = (I0) S6.b();
        H0 S7 = I0.S();
        S7.d();
        I0.C((I0) S7.f12096b);
        I0 i02 = (I0) S7.b();
        f3335b = i02;
        f3336c = i02;
        H0 S8 = I0.S();
        S8.k("__max__");
        I0 i03 = (I0) S8.b();
        f3337d = i03;
        H0 S9 = I0.S();
        I B7 = K.B();
        B7.f(i03, "__type__");
        S9.i(B7);
        f3338e = (I0) S9.b();
        H0 S10 = I0.S();
        S10.k("__vector__");
        I0 i04 = (I0) S10.b();
        f3339f = i04;
        H0 S11 = I0.S();
        I B8 = K.B();
        B8.f(i04, "__type__");
        H0 S12 = I0.S();
        S12.f(C0569e.B());
        B8.f((I0) S12.b(), "value");
        S11.i(B8);
        f3340g = (I0) S11.b();
        H0 S13 = I0.S();
        S13.d();
        I0.D((I0) S13.f12096b, false);
        f3341h = (I0) S13.b();
        H0 S14 = I0.S();
        S14.g(Double.NaN);
        f3342i = (I0) S14.b();
        H0 S15 = I0.S();
        y0 A7 = z0.A();
        A7.f(Long.MIN_VALUE);
        S15.l(A7);
        j = (I0) S15.b();
        H0 S16 = I0.S();
        S16.k("");
        f3343k = (I0) S16.b();
        H0 S17 = I0.S();
        C0909j c0909j = AbstractC0911k.f12212b;
        S17.d();
        I0.x((I0) S17.f12096b, c0909j);
        f3344l = (I0) S17.b();
        h b7 = h.b();
        H0 S18 = I0.S();
        String str = "projects//databases//documents/" + b7.f3318a.c();
        S18.d();
        I0.y((I0) S18.f12096b, str);
        f3345m = (I0) S18.b();
        H0 S19 = I0.S();
        C0788a A8 = b5.b.A();
        A8.d();
        b5.b.v((b5.b) A8.f12096b, -90.0d);
        A8.d();
        b5.b.w((b5.b) A8.f12096b, -180.0d);
        S19.d();
        I0.z((I0) S19.f12096b, (b5.b) A8.b());
        f3346n = (I0) S19.b();
        H0 S20 = I0.S();
        C0569e y4 = C0569e.y();
        S20.d();
        I0.A(y4, (I0) S20.f12096b);
        f3347o = (I0) S20.b();
        H0 S21 = I0.S();
        S21.j(K.w());
        f3348p = (I0) S21.b();
    }

    public static void a(StringBuilder sb, I0 i02) {
        boolean z4 = true;
        switch (t.e.e(i02.R())) {
            case 0:
                sb.append("null");
                return;
            case 1:
                sb.append(i02.H());
                return;
            case 2:
                sb.append(i02.M());
                return;
            case 3:
                sb.append(i02.K());
                return;
            case 4:
                z0 Q6 = i02.Q();
                sb.append("time(" + Q6.z() + "," + Q6.y() + ")");
                return;
            case 5:
                sb.append(i02.P());
                return;
            case 6:
                sb.append(r.i(i02.I()));
                return;
            case 7:
                p3.f.O("Value should be a ReferenceValue", i(i02), new Object[0]);
                sb.append(h.c(i02.O()));
                return;
            case 8:
                b5.b L7 = i02.L();
                sb.append("geo(" + L7.y() + "," + L7.z() + ")");
                return;
            case 9:
                C0569e G2 = i02.G();
                sb.append("[");
                for (int i7 = 0; i7 < G2.A(); i7++) {
                    a(sb, G2.z(i7));
                    if (i7 != G2.A() - 1) {
                        sb.append(",");
                    }
                }
                sb.append("]");
                return;
            case 10:
                K N7 = i02.N();
                ArrayList arrayList = new ArrayList(N7.y().keySet());
                Collections.sort(arrayList);
                sb.append("{");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (z4) {
                        z4 = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append(str);
                    sb.append(":");
                    a(sb, N7.A(str));
                }
                sb.append("}");
                return;
            default:
                p3.f.F("Invalid value type: ".concat(AbstractC0486a1.w(i02.R())), new Object[0]);
                throw null;
        }
    }

    public static int b(I0 i02, I0 i03) {
        int i7 = 1;
        int l7 = l(i02);
        int l8 = l(i03);
        if (l7 != l8) {
            return r.d(l7, l8);
        }
        if (l7 != Integer.MAX_VALUE) {
            switch (l7) {
                case 0:
                    break;
                case 1:
                    boolean H7 = i02.H();
                    boolean H8 = i03.H();
                    H5.k kVar = r.f4389a;
                    if (H7 == H8) {
                        return 0;
                    }
                    return H7 ? 1 : -1;
                case 2:
                    if (i02.R() == 4) {
                        double K7 = i02.K();
                        if (i03.R() == 4) {
                            double K8 = i03.K();
                            H5.k kVar2 = r.f4389a;
                            return p3.f.H(K7, K8);
                        }
                        if (i03.R() == 3) {
                            return r.e(K7, i03.M());
                        }
                    } else if (i02.R() == 3) {
                        long M7 = i02.M();
                        if (i03.R() == 3) {
                            long M8 = i03.M();
                            H5.k kVar3 = r.f4389a;
                            return Long.compare(M7, M8);
                        }
                        if (i03.R() == 4) {
                            return r.e(i03.K(), M7) * (-1);
                        }
                    }
                    p3.f.F("Unexpected values: %s vs %s", i02, i03);
                    throw null;
                case 3:
                    z0 Q6 = i02.Q();
                    z0 Q7 = i03.Q();
                    long z4 = Q6.z();
                    long z7 = Q7.z();
                    H5.k kVar4 = r.f4389a;
                    int compare = Long.compare(z4, z7);
                    return compare != 0 ? compare : r.d(Q6.y(), Q7.y());
                case 4:
                    z0 s7 = D.s(i02);
                    z0 s8 = D.s(i03);
                    long z8 = s7.z();
                    long z9 = s8.z();
                    H5.k kVar5 = r.f4389a;
                    int compare2 = Long.compare(z8, z9);
                    return compare2 != 0 ? compare2 : r.d(s7.y(), s8.y());
                case 5:
                    return i02.P().compareTo(i03.P());
                case 6:
                    return r.c(i02.I(), i03.I());
                case 7:
                    String O7 = i02.O();
                    String O8 = i03.O();
                    String[] split = O7.split("/", -1);
                    String[] split2 = O8.split("/", -1);
                    int min = Math.min(split.length, split2.length);
                    for (int i8 = 0; i8 < min; i8++) {
                        int compareTo = split[i8].compareTo(split2[i8]);
                        if (compareTo != 0) {
                            return compareTo;
                        }
                    }
                    return r.d(split.length, split2.length);
                case 8:
                    b5.b L7 = i02.L();
                    b5.b L8 = i03.L();
                    double y4 = L7.y();
                    double y5 = L8.y();
                    H5.k kVar6 = r.f4389a;
                    int H9 = p3.f.H(y4, y5);
                    return H9 == 0 ? p3.f.H(L7.z(), L8.z()) : H9;
                case 9:
                    return c(i02.G(), i03.G());
                case 10:
                    K N7 = i02.N();
                    K N8 = i03.N();
                    Map y7 = N7.y();
                    Map y8 = N8.y();
                    C0569e G2 = ((I0) y7.get("value")).G();
                    C0569e G7 = ((I0) y8.get("value")).G();
                    int d7 = r.d(G2.A(), G7.A());
                    return d7 != 0 ? d7 : c(G2, G7);
                case 11:
                    K N9 = i02.N();
                    K N10 = i03.N();
                    Iterator it = new TreeMap(N9.y()).entrySet().iterator();
                    Iterator it2 = new TreeMap(N10.y()).entrySet().iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        int compareTo2 = ((String) entry.getKey()).compareTo((String) entry2.getKey());
                        if (compareTo2 != 0) {
                            return compareTo2;
                        }
                        int b7 = b((I0) entry.getValue(), (I0) entry2.getValue());
                        if (b7 != 0) {
                            return b7;
                        }
                    }
                    boolean hasNext = it.hasNext();
                    boolean hasNext2 = it2.hasNext();
                    H5.k kVar7 = r.f4389a;
                    if (hasNext == hasNext2) {
                        i7 = 0;
                    } else if (!hasNext) {
                        i7 = -1;
                    }
                    return i7;
                default:
                    p3.f.F(e1.k.d(l7, "Invalid value type: "), new Object[0]);
                    throw null;
            }
        }
        return 0;
    }

    public static int c(C0569e c0569e, C0569e c0569e2) {
        int min = Math.min(c0569e.A(), c0569e2.A());
        for (int i7 = 0; i7 < min; i7++) {
            int b7 = b(c0569e.z(i7), c0569e2.z(i7));
            if (b7 != 0) {
                return b7;
            }
        }
        return r.d(c0569e.A(), c0569e2.A());
    }

    public static boolean d(InterfaceC0571f interfaceC0571f, I0 i02) {
        Iterator it = interfaceC0571f.a().iterator();
        while (it.hasNext()) {
            if (e((I0) it.next(), i02)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c3, code lost:
    
        if (r5.M() == r6.M()) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c6, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e7, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.K()) == java.lang.Double.doubleToLongBits(r6.K())) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(I0 i02, I0 i03) {
        int l7;
        boolean z4 = true;
        if (i02 == i03) {
            return true;
        }
        if (i02 == null || i03 == null || (l7 = l(i02)) != l(i03)) {
            return false;
        }
        if (l7 != 2) {
            if (l7 == 4) {
                return D.s(i02).equals(D.s(i03));
            }
            if (l7 == Integer.MAX_VALUE) {
                return true;
            }
            switch (l7) {
                case 9:
                    C0569e G2 = i02.G();
                    C0569e G7 = i03.G();
                    if (G2.A() == G7.A()) {
                        for (int i7 = 0; i7 < G2.A(); i7++) {
                            if (e(G2.z(i7), G7.z(i7))) {
                            }
                        }
                        return true;
                    }
                    return false;
                case 10:
                case 11:
                    K N7 = i02.N();
                    K N8 = i03.N();
                    if (N7.x() == N8.x()) {
                        for (Map.Entry entry : N7.y().entrySet()) {
                            if (!e((I0) entry.getValue(), (I0) N8.y().get(entry.getKey()))) {
                            }
                        }
                        return true;
                    }
                    return false;
                default:
                    return i02.equals(i03);
            }
        }
        if (i02.R() != 3 || i03.R() != 3) {
            if (i02.R() != 4 || i03.R() != 4) {
                return false;
            }
        }
    }

    public static boolean f(I0 i02) {
        return i02 != null && i02.R() == 10;
    }

    public static boolean g(I0 i02) {
        return i02 != null && i02.R() == 4;
    }

    public static boolean h(I0 i02) {
        return i02 != null && i02.R() == 3;
    }

    public static boolean i(I0 i02) {
        return i02 != null && i02.R() == 8;
    }

    public static boolean j(I0 i02) {
        return f3339f.equals(i02.N().y().get("__type__"));
    }

    public static I0 k(f fVar, h hVar) {
        H0 S6 = I0.S();
        String str = "projects/" + fVar.f3313a + "/databases/" + fVar.f3314b + "/documents/" + hVar.f3318a.c();
        S6.d();
        I0.y((I0) S6.f12096b, str);
        return (I0) S6.b();
    }

    public static int l(I0 i02) {
        switch (t.e.e(i02.R())) {
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
                if (D.A(i02)) {
                    return 4;
                }
                return f3337d.equals(i02.N().y().get("__type__")) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : j(i02) ? 10 : 11;
            default:
                p3.f.F("Invalid value type: ".concat(AbstractC0486a1.w(i02.R())), new Object[0]);
                throw null;
        }
    }
}
