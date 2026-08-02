package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ot1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f5911a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5912b;

    public ot1(int i) {
        this.f5912b = i;
    }

    /* JADX INFO: renamed from: c */
    public static ft1 m3787c(f71 f71Var, List list) {
        gu1 gu1Var = gu1.f2912k;
        wo1.m5398y("FN", 2, list);
        ht1 ht1VarM96t = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) list.get(0));
        ht1 ht1VarM96t2 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) list.get(1));
        if (!(ht1VarM96t2 instanceof dp1)) {
            C0270h1.m2190f(AbstractC0024an.m283f("FN requires an ArrayValue of parameter names found ", ht1VarM96t2.getClass().getCanonicalName()));
            return null;
        }
        List listM1280q = ((dp1) ht1VarM96t2).m1280q();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new ft1(ht1VarM96t.mo753f(), (ArrayList) listM1280q, arrayList, f71Var);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m3788d(ht1 ht1Var, ht1 ht1Var2) {
        if (ht1Var instanceof zs1) {
            ht1Var = new lt1(ht1Var.mo753f());
        }
        if (ht1Var2 instanceof zs1) {
            ht1Var2 = new lt1(ht1Var2.mo753f());
        }
        if ((ht1Var instanceof lt1) && (ht1Var2 instanceof lt1)) {
            return ((lt1) ht1Var).f4908j.compareTo(((lt1) ht1Var2).f4908j) < 0;
        }
        double dDoubleValue = ht1Var.mo755h().doubleValue();
        double dDoubleValue2 = ht1Var2.mo755h().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static ht1 m3789e(cu1 cu1Var, ht1 ht1Var, ht1 ht1Var2) {
        if (ht1Var instanceof Iterable) {
            return m3791g(cu1Var, ((Iterable) ht1Var).iterator(), ht1Var2);
        }
        C0270h1.m2190f("Non-iterable type in for...of loop.");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m3790f(ht1 ht1Var, ht1 ht1Var2) {
        if (ht1Var.getClass().equals(ht1Var2.getClass())) {
            if ((ht1Var instanceof nt1) || (ht1Var instanceof et1)) {
                return true;
            }
            if (ht1Var instanceof gr1) {
                return (Double.isNaN(ht1Var.mo755h().doubleValue()) || Double.isNaN(ht1Var2.mo755h().doubleValue()) || ht1Var.mo755h().doubleValue() != ht1Var2.mo755h().doubleValue()) ? false : true;
            }
            if (ht1Var instanceof lt1) {
                return ht1Var.mo753f().equals(ht1Var2.mo753f());
            }
            if (ht1Var instanceof up1) {
                return ht1Var.mo752e().equals(ht1Var2.mo752e());
            }
            return ht1Var == ht1Var2;
        }
        if (((ht1Var instanceof nt1) || (ht1Var instanceof et1)) && ((ht1Var2 instanceof nt1) || (ht1Var2 instanceof et1))) {
            return true;
        }
        boolean z = ht1Var instanceof gr1;
        if (z && (ht1Var2 instanceof lt1)) {
            return m3790f(ht1Var, new gr1(ht1Var2.mo755h()));
        }
        boolean z2 = ht1Var instanceof lt1;
        if (z2 && (ht1Var2 instanceof gr1)) {
            return m3790f(new gr1(ht1Var.mo755h()), ht1Var2);
        }
        if (ht1Var instanceof up1) {
            return m3790f(new gr1(ht1Var.mo755h()), ht1Var2);
        }
        if (ht1Var2 instanceof up1) {
            return m3790f(ht1Var, new gr1(ht1Var2.mo755h()));
        }
        if ((z2 || z) && (ht1Var2 instanceof zs1)) {
            return m3790f(ht1Var, new lt1(ht1Var2.mo753f()));
        }
        if ((ht1Var instanceof zs1) && ((ht1Var2 instanceof lt1) || (ht1Var2 instanceof gr1))) {
            return m3790f(new lt1(ht1Var.mo753f()), ht1Var2);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static ht1 m3791g(cu1 cu1Var, Iterator it, ht1 ht1Var) {
        f71 f71VarM1650C;
        if (it != null) {
            while (it.hasNext()) {
                ht1 ht1Var2 = (ht1) it.next();
                switch (cu1Var.f1458a) {
                    case 0:
                        f71VarM1650C = cu1Var.f1459b.m1650C();
                        String str = cu1Var.f1460c;
                        f71VarM1650C.m1653F(str, ht1Var2);
                        ((HashMap) f71VarM1650C.f2337n).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        f71VarM1650C = cu1Var.f1459b.m1650C();
                        f71VarM1650C.m1653F(cu1Var.f1460c, ht1Var2);
                        break;
                    default:
                        f71VarM1650C = cu1Var.f1459b;
                        f71VarM1650C.m1653F(cu1Var.f1460c, ht1Var2);
                        break;
                }
                ht1 ht1VarM1648A = f71VarM1650C.m1648A((dp1) ht1Var);
                if (ht1VarM1648A instanceof nq1) {
                    nq1 nq1Var = (nq1) ht1VarM1648A;
                    String str2 = nq1Var.f5503k;
                    if ("break".equals(str2)) {
                        return ht1.f3330b;
                    }
                    if ("return".equals(str2)) {
                        return nq1Var;
                    }
                }
            }
        }
        return ht1.f3330b;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m3792h(ht1 ht1Var, ht1 ht1Var2) {
        if (ht1Var instanceof zs1) {
            ht1Var = new lt1(ht1Var.mo753f());
        }
        if (ht1Var2 instanceof zs1) {
            ht1Var2 = new lt1(ht1Var2.mo753f());
        }
        return (((ht1Var instanceof lt1) && (ht1Var2 instanceof lt1)) || !(Double.isNaN(ht1Var.mo755h().doubleValue()) || Double.isNaN(ht1Var2.mo755h().doubleValue()))) && !m3788d(ht1Var2, ht1Var);
    }

    /* JADX WARN: Code duplicated, block: B:399:0x0bc8  */
    /* JADX WARN: Code duplicated, block: B:563:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v315 */
    /* JADX WARN: Type inference failed for: r10v320 */
    /* JADX WARN: Type inference failed for: r10v340, types: [dp1] */
    /* JADX WARN: Type inference failed for: r10v347, types: [ct1] */
    /* JADX WARN: Type inference failed for: r10v383 */
    /* JADX WARN: Type inference failed for: r10v384 */
    /* JADX WARN: Type inference failed for: r12v0, types: [f71] */
    /* JADX WARN: Type inference failed for: r7v54, types: [ht1] */
    /* JADX INFO: renamed from: a */
    public final ht1 m3793a(String str, f71 f71Var, ArrayList arrayList) {
        boolean zM3790f;
        boolean zM3790f2;
        ht1 ht1Var;
        ht1 ht1VarM1648A;
        nt1 nt1Var;
        nq1 nq1Var;
        ht1 lt1Var;
        ?? dp1Var;
        String str2;
        int i = 1;
        int i2 = 2;
        int i3 = 0;
        switch (this.f5912b) {
            case 0:
                gu1 gu1Var = gu1.f2912k;
                switch (wo1.m5371B(str).ordinal()) {
                    case 4:
                        wo1.m5396w("BITWISE_AND", 2, arrayList);
                        return new gr1(Double.valueOf(wo1.m5373D(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue()) & wo1.m5373D(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue())));
                    case 5:
                        wo1.m5396w("BITWISE_LEFT_SHIFT", 2, arrayList);
                        return new gr1(Double.valueOf(wo1.m5373D(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue()) << ((int) (((long) wo1.m5373D(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue())) & 31))));
                    case 6:
                        wo1.m5396w("BITWISE_NOT", 1, arrayList);
                        return new gr1(Double.valueOf(~wo1.m5373D(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue())));
                    case 7:
                        wo1.m5396w("BITWISE_OR", 2, arrayList);
                        return new gr1(Double.valueOf(wo1.m5373D(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue()) | wo1.m5373D(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue())));
                    case 8:
                        wo1.m5396w("BITWISE_RIGHT_SHIFT", 2, arrayList);
                        return new gr1(Double.valueOf(wo1.m5373D(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue()) >> ((int) (((long) wo1.m5373D(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue())) & 31))));
                    case 9:
                        wo1.m5396w("BITWISE_UNSIGNED_RIGHT_SHIFT", 2, arrayList);
                        return new gr1(Double.valueOf((((long) wo1.m5373D(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue())) & 4294967295L) >>> ((int) (((long) wo1.m5373D(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue())) & 31))));
                    case 10:
                        wo1.m5396w("BITWISE_XOR", 2, arrayList);
                        return new gr1(Double.valueOf(wo1.m5373D(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue()) ^ wo1.m5373D(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue())));
                    default:
                        m3794b(str);
                        throw null;
                }
            case 1:
                wo1.m5396w(wo1.m5371B(str).name(), 2, arrayList);
                ht1 ht1VarM96t = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                ht1 ht1VarM96t2 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1));
                int iOrdinal = wo1.m5371B(str).ordinal();
                if (iOrdinal != 23) {
                    if (iOrdinal == 48) {
                        zM3790f2 = m3790f(ht1VarM96t, ht1VarM96t2);
                    } else if (iOrdinal == 42) {
                        zM3790f = m3788d(ht1VarM96t, ht1VarM96t2);
                    } else if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case 37:
                                zM3790f = m3788d(ht1VarM96t2, ht1VarM96t);
                                break;
                            case 38:
                                zM3790f = m3792h(ht1VarM96t2, ht1VarM96t);
                                break;
                            case 39:
                                zM3790f = wo1.m5372C(ht1VarM96t, ht1VarM96t2);
                                break;
                            case 40:
                                zM3790f2 = wo1.m5372C(ht1VarM96t, ht1VarM96t2);
                                break;
                            default:
                                m3794b(str);
                                throw null;
                        }
                    } else {
                        zM3790f = m3792h(ht1VarM96t, ht1VarM96t2);
                    }
                    zM3790f = !zM3790f2;
                } else {
                    zM3790f = m3790f(ht1VarM96t, ht1VarM96t2);
                }
                return zM3790f ? ht1.f3335g : ht1.f3336h;
            case 2:
                gu1 gu1Var2 = gu1.f2912k;
                int iOrdinal2 = wo1.m5371B(str).ordinal();
                if (iOrdinal2 == 2) {
                    wo1.m5396w("APPLY", 3, arrayList);
                    ht1 ht1Var2 = (ht1) arrayList.get(0);
                    a81 a81Var = (a81) f71Var.f2335l;
                    a81 a81Var2 = (a81) f71Var.f2335l;
                    ht1 ht1VarM96t3 = a81Var.m96t(f71Var, ht1Var2);
                    String strMo753f = a81Var2.m96t(f71Var, (ht1) arrayList.get(1)).mo753f();
                    ht1 ht1VarM96t4 = a81Var2.m96t(f71Var, (ht1) arrayList.get(2));
                    if (!(ht1VarM96t4 instanceof dp1)) {
                        C0270h1.m2190f(AbstractC0024an.m283f("Function arguments for Apply are not a list found ", ht1VarM96t4.getClass().getCanonicalName()));
                        return null;
                    }
                    if (!strMo753f.isEmpty()) {
                        return ht1VarM96t3.mo754g(strMo753f, f71Var, (ArrayList) ((dp1) ht1VarM96t4).m1280q());
                    }
                    C0270h1.m2190f("Function name for apply is undefined");
                    return null;
                }
                if (iOrdinal2 == 15) {
                    wo1.m5396w("BREAK", 0, arrayList);
                    return ht1.f3332d;
                }
                if (iOrdinal2 == 25) {
                    return m3787c(f71Var, arrayList);
                }
                if (iOrdinal2 == 41) {
                    wo1.m5398y("IF", 2, arrayList);
                    ht1 ht1Var3 = (ht1) arrayList.get(0);
                    a81 a81Var3 = (a81) f71Var.f2335l;
                    a81 a81Var4 = (a81) f71Var.f2335l;
                    ht1 ht1VarM96t5 = a81Var3.m96t(f71Var, ht1Var3);
                    ht1 ht1VarM96t6 = a81Var4.m96t(f71Var, (ht1) arrayList.get(1));
                    ht1 ht1VarM96t7 = arrayList.size() > 2 ? a81Var4.m96t(f71Var, (ht1) arrayList.get(2)) : null;
                    nt1 nt1Var2 = ht1.f3330b;
                    if (!ht1VarM96t5.mo752e().booleanValue()) {
                        if (ht1VarM96t7 != null) {
                            ht1VarM1648A = f71Var.m1648A((dp1) ht1VarM96t7);
                        } else {
                            ht1Var = nt1Var2;
                        }
                        if (true != (ht1Var instanceof nq1)) {
                            return nt1Var2;
                        }
                        return ht1Var;
                    }
                    ht1VarM1648A = f71Var.m1648A((dp1) ht1VarM96t6);
                    ht1Var = ht1VarM1648A;
                    if (true != (ht1Var instanceof nq1)) {
                        return nt1Var2;
                    }
                    return ht1Var;
                }
                if (iOrdinal2 == 54) {
                    return new dp1(arrayList);
                }
                if (iOrdinal2 == 57) {
                    if (arrayList.isEmpty()) {
                        return ht1.f3334f;
                    }
                    wo1.m5396w("RETURN", 1, arrayList);
                    return new nq1("return", ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)));
                }
                if (iOrdinal2 != 19) {
                    if (iOrdinal2 == 20) {
                        wo1.m5398y("DEFINE_FUNCTION", 2, arrayList);
                        ft1 ft1VarM3787c = m3787c(f71Var, arrayList);
                        String str3 = ft1VarM3787c.f974j;
                        if (str3 == null) {
                            f71Var.m1652E("", ft1VarM3787c);
                            return ft1VarM3787c;
                        }
                        f71Var.m1652E(str3, ft1VarM3787c);
                        return ft1VarM3787c;
                    }
                    if (iOrdinal2 == 60) {
                        wo1.m5396w("SWITCH", 3, arrayList);
                        ht1 ht1Var4 = (ht1) arrayList.get(0);
                        a81 a81Var5 = (a81) f71Var.f2335l;
                        a81 a81Var6 = (a81) f71Var.f2335l;
                        ht1 ht1VarM96t8 = a81Var5.m96t(f71Var, ht1Var4);
                        ht1 ht1VarM96t9 = a81Var6.m96t(f71Var, (ht1) arrayList.get(1));
                        ht1 ht1VarM96t10 = a81Var6.m96t(f71Var, (ht1) arrayList.get(2));
                        if (!(ht1VarM96t9 instanceof dp1)) {
                            C0270h1.m2190f("Malformed SWITCH statement, cases are not a list");
                            return null;
                        }
                        if (!(ht1VarM96t10 instanceof dp1)) {
                            C0270h1.m2190f("Malformed SWITCH statement, case statements are not a list");
                            return null;
                        }
                        dp1 dp1Var2 = (dp1) ht1VarM96t9;
                        dp1 dp1Var3 = (dp1) ht1VarM96t10;
                        boolean z = false;
                        for (int i4 = 0; i4 < dp1Var2.m1282s(); i4++) {
                            if (z || ht1VarM96t8.equals(a81Var6.m96t(f71Var, dp1Var2.m1283t(i4)))) {
                                ht1 ht1VarM96t11 = a81Var6.m96t(f71Var, dp1Var3.m1283t(i4));
                                if (ht1VarM96t11 instanceof nq1) {
                                    return ((nq1) ht1VarM96t11).f5503k.equals("break") ? ht1.f3330b : ht1VarM96t11;
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (dp1Var2.m1282s() + 1 == dp1Var3.m1282s()) {
                            ht1 ht1VarM96t12 = a81Var6.m96t(f71Var, dp1Var3.m1283t(dp1Var2.m1282s()));
                            if (ht1VarM96t12 instanceof nq1) {
                                String str4 = ((nq1) ht1VarM96t12).f5503k;
                                if (str4.equals("return") || str4.equals("continue")) {
                                    return ht1VarM96t12;
                                }
                            }
                        }
                        return ht1.f3330b;
                    }
                    if (iOrdinal2 == 61) {
                        wo1.m5396w("TERNARY", 3, arrayList);
                        ht1 ht1Var5 = (ht1) arrayList.get(0);
                        a81 a81Var7 = (a81) f71Var.f2335l;
                        a81 a81Var8 = (a81) f71Var.f2335l;
                        return a81Var7.m96t(f71Var, ht1Var5).mo752e().booleanValue() ? a81Var8.m96t(f71Var, (ht1) arrayList.get(1)) : a81Var8.m96t(f71Var, (ht1) arrayList.get(2));
                    }
                    switch (iOrdinal2) {
                        case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                            return f71Var.m1650C().m1648A(new dp1(arrayList));
                        case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                            wo1.m5396w("BREAK", 0, arrayList);
                            return ht1.f3333e;
                        case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                            break;
                        default:
                            m3794b(str);
                            throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    return ht1.f3330b;
                }
                ht1 ht1VarM96t13 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                return ht1VarM96t13 instanceof dp1 ? f71Var.m1648A((dp1) ht1VarM96t13) : ht1.f3330b;
            case 3:
                gu1 gu1Var3 = gu1.f2912k;
                int iOrdinal3 = wo1.m5371B(str).ordinal();
                if (iOrdinal3 == 1) {
                    wo1.m5396w("AND", 2, arrayList);
                    ht1 ht1VarM96t14 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                    if (ht1VarM96t14.mo752e().booleanValue()) {
                        return ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1));
                    }
                    return ht1VarM96t14;
                }
                if (iOrdinal3 == 47) {
                    wo1.m5396w("NOT", 1, arrayList);
                    return new up1(Boolean.valueOf(!((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo752e().booleanValue()));
                }
                if (iOrdinal3 != 50) {
                    m3794b(str);
                    throw null;
                }
                wo1.m5396w("OR", 2, arrayList);
                ht1 ht1VarM96t15 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                if (ht1VarM96t15.mo752e().booleanValue()) {
                    return ht1VarM96t15;
                }
                return ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1));
            case 4:
                gu1 gu1Var4 = gu1.f2912k;
                int iOrdinal4 = wo1.m5371B(str).ordinal();
                if (iOrdinal4 == 65) {
                    wo1.m5396w("WHILE", 4, arrayList);
                    ht1 ht1Var6 = (ht1) arrayList.get(0);
                    ht1 ht1Var7 = (ht1) arrayList.get(1);
                    ht1 ht1Var8 = (ht1) arrayList.get(2);
                    ht1 ht1Var9 = (ht1) arrayList.get(3);
                    a81 a81Var9 = (a81) f71Var.f2335l;
                    a81 a81Var10 = (a81) f71Var.f2335l;
                    ht1 ht1VarM96t16 = a81Var9.m96t(f71Var, ht1Var9);
                    if (a81Var10.m96t(f71Var, ht1Var8).mo752e().booleanValue()) {
                        ht1 ht1VarM1648A2 = f71Var.m1648A((dp1) ht1VarM96t16);
                        if (ht1VarM1648A2 instanceof nq1) {
                            nq1 nq1Var2 = (nq1) ht1VarM1648A2;
                            String str5 = nq1Var2.f5503k;
                            if ("break".equals(str5)) {
                                return ht1.f3330b;
                            }
                            if ("return".equals(str5)) {
                                return nq1Var2;
                            }
                        }
                    }
                    while (a81Var10.m96t(f71Var, ht1Var6).mo752e().booleanValue()) {
                        ht1 ht1VarM1648A3 = f71Var.m1648A((dp1) ht1VarM96t16);
                        if (ht1VarM1648A3 instanceof nq1) {
                            nq1 nq1Var3 = (nq1) ht1VarM1648A3;
                            String str6 = nq1Var3.f5503k;
                            if ("break".equals(str6)) {
                                return ht1.f3330b;
                            }
                            if ("return".equals(str6)) {
                                return nq1Var3;
                            }
                        }
                        f71Var.m1679z(ht1Var7);
                    }
                    return ht1.f3330b;
                }
                switch (iOrdinal4) {
                    case 26:
                        wo1.m5396w("FOR_IN", 3, arrayList);
                        if (!(arrayList.get(0) instanceof lt1)) {
                            C0270h1.m2190f("Variable name in FOR_IN must be a string");
                            return null;
                        }
                        String strMo753f2 = ((ht1) arrayList.get(0)).mo753f();
                        ht1 ht1VarM96t17 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1));
                        ht1 ht1VarM96t18 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(2));
                        Iterator itMo750b = ht1VarM96t17.mo750b();
                        if (itMo750b != null) {
                            while (itMo750b.hasNext()) {
                                f71Var.m1653F(strMo753f2, (ht1) itMo750b.next());
                                ht1 ht1VarM1648A4 = f71Var.m1648A((dp1) ht1VarM96t18);
                                if (ht1VarM1648A4 instanceof nq1) {
                                    nq1Var = (nq1) ht1VarM1648A4;
                                    String str7 = nq1Var.f5503k;
                                    if ("break".equals(str7)) {
                                        nt1Var = ht1.f3330b;
                                    } else if ("return".equals(str7)) {
                                        return nq1Var;
                                    }
                                }
                            }
                            nt1Var = ht1.f3330b;
                        } else {
                            nt1Var = ht1.f3330b;
                        }
                        return nt1Var;
                    case 27:
                        wo1.m5396w("FOR_IN_CONST", 3, arrayList);
                        if (arrayList.get(0) instanceof lt1) {
                            return m3791g(new cu1(f71Var, ((ht1) arrayList.get(0)).mo753f(), i3), ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo750b(), ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(2)));
                        }
                        C0270h1.m2190f("Variable name in FOR_IN_CONST must be a string");
                        return null;
                    case 28:
                        wo1.m5396w("FOR_IN_LET", 3, arrayList);
                        if (!(arrayList.get(0) instanceof lt1)) {
                            C0270h1.m2190f("Variable name in FOR_IN_LET must be a string");
                            return null;
                        }
                        String strMo753f3 = ((ht1) arrayList.get(0)).mo753f();
                        ht1 ht1VarM96t19 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1));
                        ht1 ht1VarM96t20 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(2));
                        Iterator itMo750b2 = ht1VarM96t19.mo750b();
                        if (itMo750b2 != null) {
                            while (itMo750b2.hasNext()) {
                                ht1 ht1Var10 = (ht1) itMo750b2.next();
                                f71 f71VarM1650C = f71Var.m1650C();
                                f71VarM1650C.m1653F(strMo753f3, ht1Var10);
                                ht1 ht1VarM1648A5 = f71VarM1650C.m1648A((dp1) ht1VarM96t20);
                                if (ht1VarM1648A5 instanceof nq1) {
                                    nq1Var = (nq1) ht1VarM1648A5;
                                    String str8 = nq1Var.f5503k;
                                    if ("break".equals(str8)) {
                                        nt1Var = ht1.f3330b;
                                    } else if ("return".equals(str8)) {
                                        return nq1Var;
                                    }
                                }
                            }
                            nt1Var = ht1.f3330b;
                        } else {
                            nt1Var = ht1.f3330b;
                        }
                        return nt1Var;
                    case 29:
                        wo1.m5396w("FOR_LET", 4, arrayList);
                        ht1 ht1Var11 = (ht1) arrayList.get(0);
                        a81 a81Var11 = (a81) f71Var.f2335l;
                        a81 a81Var12 = (a81) f71Var.f2335l;
                        ht1 ht1VarM96t21 = a81Var11.m96t(f71Var, ht1Var11);
                        if (!(ht1VarM96t21 instanceof dp1)) {
                            C0270h1.m2190f("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        }
                        dp1 dp1Var4 = (dp1) ht1VarM96t21;
                        ht1 ht1Var12 = (ht1) arrayList.get(1);
                        ht1 ht1Var13 = (ht1) arrayList.get(2);
                        ht1 ht1VarM96t22 = a81Var12.m96t(f71Var, (ht1) arrayList.get(3));
                        f71 f71VarM1650C2 = f71Var.m1650C();
                        for (int i5 = 0; i5 < dp1Var4.m1282s(); i5++) {
                            String strMo753f4 = dp1Var4.m1283t(i5).mo753f();
                            f71VarM1650C2.m1652E(strMo753f4, f71Var.m1654G(strMo753f4));
                        }
                        while (a81Var12.m96t(f71Var, ht1Var12).mo752e().booleanValue()) {
                            ht1 ht1VarM1648A6 = f71Var.m1648A((dp1) ht1VarM96t22);
                            if (ht1VarM1648A6 instanceof nq1) {
                                nq1 nq1Var4 = (nq1) ht1VarM1648A6;
                                String str9 = nq1Var4.f5503k;
                                if ("break".equals(str9)) {
                                    return ht1.f3330b;
                                }
                                if ("return".equals(str9)) {
                                    return nq1Var4;
                                }
                            }
                            f71 f71VarM1650C3 = f71Var.m1650C();
                            for (int i6 = 0; i6 < dp1Var4.m1282s(); i6++) {
                                String strMo753f5 = dp1Var4.m1283t(i6).mo753f();
                                f71VarM1650C3.m1652E(strMo753f5, f71VarM1650C2.m1654G(strMo753f5));
                            }
                            f71VarM1650C3.m1679z(ht1Var13);
                            f71VarM1650C2 = f71VarM1650C3;
                        }
                        return ht1.f3330b;
                    case 30:
                        wo1.m5396w("FOR_OF", 3, arrayList);
                        if (arrayList.get(0) instanceof lt1) {
                            return m3789e(new cu1(f71Var, ((ht1) arrayList.get(0)).mo753f(), i2), ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)), ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(2)));
                        }
                        C0270h1.m2190f("Variable name in FOR_OF must be a string");
                        return null;
                    case 31:
                        wo1.m5396w("FOR_OF_CONST", 3, arrayList);
                        if (arrayList.get(0) instanceof lt1) {
                            return m3789e(new cu1(f71Var, ((ht1) arrayList.get(0)).mo753f(), i3), ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)), ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(2)));
                        }
                        C0270h1.m2190f("Variable name in FOR_OF_CONST must be a string");
                        return null;
                    case 32:
                        wo1.m5396w("FOR_OF_LET", 3, arrayList);
                        if (arrayList.get(0) instanceof lt1) {
                            return m3789e(new cu1(f71Var, ((ht1) arrayList.get(0)).mo753f(), i), ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)), ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(2)));
                        }
                        C0270h1.m2190f("Variable name in FOR_OF_LET must be a string");
                        return null;
                    default:
                        m3794b(str);
                        throw null;
                }
            case 5:
                gu1 gu1Var5 = gu1.f2912k;
                int iOrdinal5 = wo1.m5371B(str).ordinal();
                if (iOrdinal5 == 0) {
                    wo1.m5396w("ADD", 2, arrayList);
                    ht1 ht1VarM96t23 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                    ht1 ht1VarM96t24 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1));
                    lt1Var = ((ht1VarM96t23 instanceof zs1) || (ht1VarM96t23 instanceof lt1) || (ht1VarM96t24 instanceof zs1) || (ht1VarM96t24 instanceof lt1)) ? new lt1(String.valueOf(ht1VarM96t23.mo753f()).concat(String.valueOf(ht1VarM96t24.mo753f()))) : new gr1(Double.valueOf(ht1VarM96t24.mo755h().doubleValue() + ht1VarM96t23.mo755h().doubleValue()));
                } else if (iOrdinal5 == 21) {
                    wo1.m5396w("DIVIDE", 2, arrayList);
                    lt1Var = new gr1(Double.valueOf(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue() / ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue()));
                } else {
                    if (iOrdinal5 == 59) {
                        wo1.m5396w("SUBTRACT", 2, arrayList);
                        return new gr1(Double.valueOf(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue() + (-((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue())));
                    }
                    if (iOrdinal5 == 52 || iOrdinal5 == 53) {
                        wo1.m5396w(str, 2, arrayList);
                        ht1 ht1VarM96t25 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                        f71Var.m1679z((ht1) arrayList.get(1));
                        return ht1VarM96t25;
                    }
                    if (iOrdinal5 == 55 || iOrdinal5 == 56) {
                        wo1.m5396w(str, 1, arrayList);
                        return ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                    }
                    switch (iOrdinal5) {
                        case 44:
                            wo1.m5396w("MODULUS", 2, arrayList);
                            lt1Var = new gr1(Double.valueOf(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue() % ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue()));
                            break;
                        case 45:
                            wo1.m5396w("MULTIPLY", 2, arrayList);
                            return new gr1(Double.valueOf(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1)).mo755h().doubleValue() * ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue()));
                        case 46:
                            wo1.m5396w("NEGATE", 1, arrayList);
                            return new gr1(Double.valueOf(-((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo755h().doubleValue()));
                        default:
                            m3794b(str);
                            throw null;
                    }
                }
                return lt1Var;
            case 6:
                if (str == null || str.isEmpty() || !f71Var.m1651D(str)) {
                    C0270h1.m2190f(AbstractC0024an.m283f("Command not found: ", str));
                    return null;
                }
                ht1 ht1VarM1654G = f71Var.m1654G(str);
                if (ht1VarM1654G instanceof bs1) {
                    return ((bs1) ht1VarM1654G).mo749a(f71Var, arrayList);
                }
                C0270h1.m2190f(AbstractC0024an.m284g("Function ", str, " is not defined"));
                return null;
            default:
                gu1 gu1Var6 = gu1.f2912k;
                int iOrdinal6 = wo1.m5371B(str).ordinal();
                if (iOrdinal6 == 3) {
                    wo1.m5396w("ASSIGN", 2, arrayList);
                    ht1 ht1VarM96t26 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                    if (!(ht1VarM96t26 instanceof lt1)) {
                        C0270h1.m2190f(AbstractC0024an.m283f("Expected string for assign var. got ", ht1VarM96t26.getClass().getCanonicalName()));
                        return null;
                    }
                    String str10 = ((lt1) ht1VarM96t26).f4908j;
                    if (!f71Var.m1651D(str10)) {
                        C0270h1.m2190f(AbstractC0024an.m283f("Attempting to assign undefined value ", str10));
                        return null;
                    }
                    ht1 ht1VarM96t27 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1));
                    f71Var.m1652E(str10, ht1VarM96t27);
                    return ht1VarM96t27;
                }
                if (iOrdinal6 == 14) {
                    wo1.m5398y("CONST", 2, arrayList);
                    if (arrayList.size() % 2 != 0) {
                        C0270h1.m2190f(j11.m2773h("CONST requires an even number of arguments, found ", arrayList.size()));
                        return null;
                    }
                    while (i3 < arrayList.size() - 1) {
                        ht1 ht1VarM96t28 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(i3));
                        if (!(ht1VarM96t28 instanceof lt1)) {
                            C0270h1.m2190f(AbstractC0024an.m283f("Expected string for const name. got ", ht1VarM96t28.getClass().getCanonicalName()));
                            return null;
                        }
                        String str11 = ((lt1) ht1VarM96t28).f4908j;
                        f71Var.m1653F(str11, ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(i3 + 1)));
                        ((HashMap) f71Var.f2337n).put(str11, Boolean.TRUE);
                        i3 += 2;
                    }
                    return ht1.f3330b;
                }
                if (iOrdinal6 == 24) {
                    wo1.m5398y("EXPRESSION_LIST", 1, arrayList);
                    dp1Var = ht1.f3330b;
                    while (i3 < arrayList.size()) {
                        ht1 ht1VarM96t29 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(i3));
                        if (ht1VarM96t29 instanceof nq1) {
                            C0270h1.m2191g("ControlValue cannot be in an expression list");
                            return null;
                        }
                        i3++;
                        dp1Var = ht1VarM96t29;
                    }
                } else {
                    if (iOrdinal6 == 33) {
                        wo1.m5396w("GET", 1, arrayList);
                        ht1 ht1VarM96t30 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                        if (ht1VarM96t30 instanceof lt1) {
                            return f71Var.m1654G(((lt1) ht1VarM96t30).f4908j);
                        }
                        C0270h1.m2190f(AbstractC0024an.m283f("Expected string for get var. got ", ht1VarM96t30.getClass().getCanonicalName()));
                        return null;
                    }
                    if (iOrdinal6 == 49) {
                        wo1.m5396w("NULL", 0, arrayList);
                        return ht1.f3331c;
                    }
                    if (iOrdinal6 == 58) {
                        wo1.m5396w("SET_PROPERTY", 3, arrayList);
                        ht1 ht1Var14 = (ht1) arrayList.get(0);
                        a81 a81Var13 = (a81) f71Var.f2335l;
                        a81 a81Var14 = (a81) f71Var.f2335l;
                        ht1 ht1VarM96t31 = a81Var13.m96t(f71Var, ht1Var14);
                        ht1 ht1VarM96t32 = a81Var14.m96t(f71Var, (ht1) arrayList.get(1));
                        ht1 ht1VarM96t33 = a81Var14.m96t(f71Var, (ht1) arrayList.get(2));
                        if (ht1VarM96t31 == ht1.f3330b || ht1VarM96t31 == ht1.f3331c) {
                            throw new IllegalStateException("Can't set property " + ht1VarM96t32.mo753f() + " of " + ht1VarM96t31.mo753f());
                        }
                        if ((ht1VarM96t31 instanceof dp1) && (ht1VarM96t32 instanceof gr1)) {
                            ((dp1) ht1VarM96t31).m1284u(((gr1) ht1VarM96t32).f2863j.intValue(), ht1VarM96t33);
                            return ht1VarM96t33;
                        }
                        if (!(ht1VarM96t31 instanceof zs1)) {
                            return ht1VarM96t33;
                        }
                        ((zs1) ht1VarM96t31).mo751c(ht1VarM96t32.mo753f(), ht1VarM96t33);
                        return ht1VarM96t33;
                    }
                    if (iOrdinal6 != 17) {
                        if (iOrdinal6 != 18) {
                            if (iOrdinal6 == 35 || iOrdinal6 == 36) {
                                wo1.m5396w("GET_PROPERTY", 2, arrayList);
                                ht1 ht1VarM96t34 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                                ht1 ht1VarM96t35 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1));
                                if ((ht1VarM96t34 instanceof dp1) && wo1.m5370A(ht1VarM96t35)) {
                                    return ((dp1) ht1VarM96t34).m1283t(ht1VarM96t35.mo755h().intValue());
                                }
                                if (ht1VarM96t34 instanceof zs1) {
                                    return ((zs1) ht1VarM96t34).mo756j(ht1VarM96t35.mo753f());
                                }
                                if (ht1VarM96t34 instanceof lt1) {
                                    if ("length".equals(ht1VarM96t35.mo753f())) {
                                        return new gr1(Double.valueOf(((lt1) ht1VarM96t34).f4908j.length()));
                                    }
                                    if (wo1.m5370A(ht1VarM96t35)) {
                                        double dDoubleValue = ht1VarM96t35.mo755h().doubleValue();
                                        String str12 = ((lt1) ht1VarM96t34).f4908j;
                                        if (dDoubleValue < str12.length()) {
                                            return new lt1(String.valueOf(str12.charAt(ht1VarM96t35.mo755h().intValue())));
                                        }
                                    }
                                }
                                return ht1.f3330b;
                            }
                            switch (iOrdinal6) {
                                case 62:
                                    wo1.m5396w("TYPEOF", 1, arrayList);
                                    ht1 ht1VarM96t36 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                                    if (ht1VarM96t36 instanceof nt1) {
                                        str2 = "undefined";
                                    } else if (ht1VarM96t36 instanceof up1) {
                                        str2 = "boolean";
                                    } else if (ht1VarM96t36 instanceof gr1) {
                                        str2 = "number";
                                    } else if (ht1VarM96t36 instanceof lt1) {
                                        str2 = "string";
                                    } else if (ht1VarM96t36 instanceof ft1) {
                                        str2 = "function";
                                    } else {
                                        if ((ht1VarM96t36 instanceof it1) || (ht1VarM96t36 instanceof nq1)) {
                                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", ht1VarM96t36));
                                        }
                                        str2 = "object";
                                    }
                                    return new lt1(str2);
                                case 63:
                                    wo1.m5396w("UNDEFINED", 0, arrayList);
                                    return ht1.f3330b;
                                case 64:
                                    wo1.m5398y("VAR", 1, arrayList);
                                    int size = arrayList.size();
                                    while (i3 < size) {
                                        Object obj = arrayList.get(i3);
                                        i3++;
                                        ht1 ht1VarM96t37 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) obj);
                                        if (!(ht1VarM96t37 instanceof lt1)) {
                                            C0270h1.m2190f(AbstractC0024an.m283f("Expected string for var name. got ", ht1VarM96t37.getClass().getCanonicalName()));
                                            return null;
                                        }
                                        f71Var.m1653F(((lt1) ht1VarM96t37).f4908j, ht1.f3330b);
                                    }
                                    return ht1.f3330b;
                                default:
                                    m3794b(str);
                                    throw null;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new ct1();
                        }
                        if (arrayList.size() % 2 != 0) {
                            C0270h1.m2190f(j11.m2773h("CREATE_OBJECT requires an even number of arguments, found ", arrayList.size()));
                            return null;
                        }
                        dp1Var = new ct1();
                        while (i3 < arrayList.size() - 1) {
                            ht1 ht1VarM96t38 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(i3));
                            ht1 ht1VarM96t39 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(i3 + 1));
                            if ((ht1VarM96t38 instanceof nq1) || (ht1VarM96t39 instanceof nq1)) {
                                C0270h1.m2191g("Failed to evaluate map entry");
                                return null;
                            }
                            dp1Var.mo751c(ht1VarM96t38.mo753f(), ht1VarM96t39);
                            i3 += 2;
                        }
                    } else {
                        if (arrayList.isEmpty()) {
                            return new dp1();
                        }
                        dp1Var = new dp1();
                        int size2 = arrayList.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            Object obj2 = arrayList.get(i7);
                            i7++;
                            ht1 ht1VarM96t40 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) obj2);
                            if (ht1VarM96t40 instanceof nq1) {
                                C0270h1.m2191g("Failed to evaluate array element");
                                return null;
                            }
                            dp1Var.m1284u(i3, ht1VarM96t40);
                            i3++;
                        }
                    }
                }
                return dp1Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3794b(String str) {
        if (!this.f5911a.contains(wo1.m5371B(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
