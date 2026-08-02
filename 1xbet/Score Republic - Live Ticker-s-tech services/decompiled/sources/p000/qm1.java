package p000;

import android.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qm1 {

    /* JADX INFO: renamed from: a */
    public final String f6539a;

    /* JADX INFO: renamed from: b */
    public final int f6540b;

    /* JADX INFO: renamed from: c */
    public Boolean f6541c;

    /* JADX INFO: renamed from: d */
    public Boolean f6542d;

    /* JADX INFO: renamed from: e */
    public Long f6543e;

    /* JADX INFO: renamed from: f */
    public Long f6544f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6545g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ qo1 f6546h;

    /* JADX INFO: renamed from: i */
    public final zo1 f6547i;

    public qm1(qo1 qo1Var, String str, int i, zo1 zo1Var, int i2) {
        this.f6545g = i2;
        this.f6546h = qo1Var;
        this.f6539a = str;
        this.f6540b = i;
        this.f6547i = zo1Var;
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m4112c(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: d */
    public static Boolean m4113d(String str, fx1 fx1Var, ky1 ky1Var) {
        List listM1905y;
        p80.m3863h(fx1Var);
        if (str != null && fx1Var.m1900t() && fx1Var.m1899B() != 1 && (fx1Var.m1899B() != 7 ? fx1Var.m1901u() : fx1Var.m1906z() != 0)) {
            int iM1899B = fx1Var.m1899B();
            boolean zM1904x = fx1Var.m1904x();
            String strM1902v = (zM1904x || iM1899B == 2 || iM1899B == 7) ? fx1Var.m1902v() : fx1Var.m1902v().toUpperCase(Locale.ENGLISH);
            if (fx1Var.m1906z() == 0) {
                listM1905y = null;
            } else {
                listM1905y = fx1Var.m1905y();
                if (!zM1904x) {
                    ArrayList arrayList = new ArrayList(listM1905y.size());
                    Iterator it = listM1905y.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listM1905y = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iM1899B == 2 ? strM1902v : null;
            if (iM1899B != 7 ? strM1902v != null : listM1905y != null && !listM1905y.isEmpty()) {
                if (!zM1904x && iM1899B != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iM1899B - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zM1904x ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (ky1Var != null) {
                                    ky1Var.f4603r.m5313b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strM1902v));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strM1902v));
                    case 4:
                        return Boolean.valueOf(str.contains(strM1902v));
                    case 5:
                        return Boolean.valueOf(str.equals(strM1902v));
                    case 6:
                        if (listM1905y != null) {
                            return Boolean.valueOf(listM1905y.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    /* JADX INFO: renamed from: e */
    public static Boolean m4114e(BigDecimal bigDecimal, ax1 ax1Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i;
        p80.m3863h(ax1Var);
        if (ax1Var.m518t()) {
            if (ax1Var.m517D() != 1 && (ax1Var.m517D() != 5 ? ax1Var.m521w() : ax1Var.m523y() && ax1Var.m515A())) {
                int iM517D = ax1Var.m517D();
                try {
                    if (ax1Var.m517D() == 5) {
                        if (a72.m55e0(ax1Var.m524z()) && a72.m55e0(ax1Var.m516B())) {
                            BigDecimal bigDecimal5 = new BigDecimal(ax1Var.m524z());
                            bigDecimal4 = new BigDecimal(ax1Var.m516B());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (iM517D == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i = iM517D - 1;
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (a72.m55e0(ax1Var.m522x())) {
                        bigDecimal2 = new BigDecimal(ax1Var.m522x());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (iM517D == 5) {
                            i = iM517D - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i = iM517D - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0279  */
    /* JADX WARN: Code duplicated, block: B:105:0x0299  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02de  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:131:0x030a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0310  */
    /* JADX WARN: Code duplicated, block: B:135:0x0324  */
    /* JADX WARN: Code duplicated, block: B:137:0x032a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0332  */
    /* JADX WARN: Code duplicated, block: B:141:0x033c  */
    /* JADX WARN: Code duplicated, block: B:150:0x035f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0368  */
    /* JADX WARN: Code duplicated, block: B:158:0x039f A[EDGE_INSN: B:158:0x039f->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03b2 A[EDGE_INSN: B:159:0x03b2->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:199:0x0343 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac A[LOOP:1: B:59:0x0189->B:64:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:82:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0260  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public boolean m4115a(Long l, Long l2, rz1 rz1Var, long j, du1 du1Var, boolean z) {
        HashSet hashSet;
        Iterator it;
        C0089c8 c0089c8;
        Iterator it2;
        Iterator it3;
        xw1 xw1Var;
        boolean z2;
        String strM5699A;
        Object obj;
        Boolean boolM4114e;
        Boolean boolM4114e2;
        String str;
        ax1 ax1VarM5704w;
        long j2;
        Boolean boolM4114e3;
        wz1 wz1Var;
        Long lValueOf;
        Double dValueOf;
        xw1 xw1Var2;
        Boolean boolM4114e4;
        int i;
        sr1.m4588a();
        qo1 qo1Var = this.f6546h;
        f02 f02Var = (f02) qo1Var.f7192j;
        bt1 bt1Var = f02Var.f2245m;
        ky1 ky1Var = f02Var.f2247o;
        cy1 cy1Var = f02Var.f2251s;
        ix1 ix1Var = jx1.f4123F0;
        String str2 = this.f6539a;
        boolean zM770L = bt1Var.m770L(str2, ix1Var);
        vw1 vw1Var = (vw1) this.f6547i;
        long j3 = vw1Var.m5207E() ? du1Var.f1833e : j;
        f02.m1560m(ky1Var);
        wc1 wc1Var = ky1Var.f4608w;
        wc1 wc1Var2 = ky1Var.f4603r;
        boolean zIsLoggable = Log.isLoggable(ky1Var.m3114K(), 2);
        int i2 = this.f6540b;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            f02.m1560m(ky1Var);
            wc1Var.m5315d("Evaluating filter. audience, filter, event", Integer.valueOf(i2), vw1Var.m5210t() ? Integer.valueOf(vw1Var.m5211u()) : null, cy1Var.m1043a(vw1Var.m5212v()));
            f02.m1560m(ky1Var);
            a72 a72Var = qo1Var.f1566k.f8827p;
            x62.m5533U(a72Var);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (vw1Var.m5210t()) {
                i = 0;
                a72.m53V(sb, 0, "filter_id", Integer.valueOf(vw1Var.m5211u()));
            } else {
                i = 0;
            }
            a72.m53V(sb, i, "event_name", ((f02) a72Var.f7192j).f2251s.m1043a(vw1Var.m5212v()));
            String strM49R = a72.m49R(vw1Var.m5204B(), vw1Var.m5205C(), vw1Var.m5207E());
            if (!strM49R.isEmpty()) {
                a72.m53V(sb, 0, "filter_type", strM49R);
            }
            if (vw1Var.m5216z()) {
                a72.m54W(sb, 1, "event_count_filter", vw1Var.m5203A());
            }
            if (vw1Var.m5214x() > 0) {
                sb.append("  filters {\n");
                Iterator it4 = vw1Var.m5213w().iterator();
                while (it4.hasNext()) {
                    a72Var.m65O(sb, 2, (xw1) it4.next());
                }
            }
            a72.m47P(1, sb);
            sb.append("}\n}\n");
            wc1Var.m5313b(sb.toString(), "Filter definition");
        }
        if (!vw1Var.m5210t() || vw1Var.m5211u() > 256) {
            f02.m1560m(ky1Var);
            wc1Var2.m5314c(ky1.m3106I(str2), String.valueOf(vw1Var.m5210t() ? Integer.valueOf(vw1Var.m5211u()) : null), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean z3 = vw1Var.m5204B() || vw1Var.m5205C() || vw1Var.m5207E();
        if (z && !z3) {
            f02.m1560m(ky1Var);
            wc1Var.m5314c(Integer.valueOf(i2), vw1Var.m5210t() ? Integer.valueOf(vw1Var.m5211u()) : null, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        String strM4464y = rz1Var.m4464y();
        if (!vw1Var.m5216z()) {
            hashSet = new HashSet();
            it = vw1Var.m5213w().iterator();
            while (true) {
                if (it.hasNext()) {
                    c0089c8 = new C0089c8(0);
                    it2 = rz1Var.m4461v().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = vw1Var.m5213w().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zM770L = zM770L;
                                    ky1Var = ky1Var;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                xw1Var = (xw1) it3.next();
                                if (xw1Var.m5705x()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                strM5699A = xw1Var.m5699A();
                                if (strM5699A.isEmpty()) {
                                    obj = c0089c8.get(strM5699A);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                zM770L = zM770L;
                                                ky1Var = ky1Var;
                                                if (obj == null) {
                                                    f02.m1560m(ky1Var);
                                                    wc1Var2.m5314c(cy1Var.m1043a(strM4464y), cy1Var.m1044b(strM5699A), "Unknown param type. event, param");
                                                    break;
                                                }
                                                f02.m1560m(ky1Var);
                                                wc1Var.m5314c(cy1Var.m1043a(strM4464y), cy1Var.m1044b(strM5699A), "Missing param for filter. event, param");
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (xw1Var.m5701t()) {
                                                if (xw1Var.m5703v()) {
                                                    zM770L = zM770L;
                                                    ky1Var = ky1Var;
                                                    f02.m1560m(ky1Var);
                                                    wc1Var2.m5314c(cy1Var.m1043a(strM4464y), cy1Var.m1044b(strM5699A), "No filter for String param. event, param");
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (a72.m55e0(str)) {
                                                    zM770L = zM770L;
                                                    ky1Var = ky1Var;
                                                    f02.m1560m(ky1Var);
                                                    wc1Var2.m5314c(cy1Var.m1043a(strM4464y), cy1Var.m1044b(strM5699A), "Invalid param value for number filter. event, param");
                                                    break;
                                                }
                                                ax1VarM5704w = xw1Var.m5704w();
                                                if (a72.m55e0(str)) {
                                                    zM770L = zM770L;
                                                    ky1Var = ky1Var;
                                                    j2 = 0;
                                                    boolM4114e3 = m4114e(new BigDecimal(str), ax1VarM5704w, 0.0d);
                                                } else {
                                                    boolM4114e3 = null;
                                                }
                                                if (boolM4114e3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolM4114e3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                ky1Var = ky1Var;
                                                zM770L = zM770L;
                                            } else {
                                                fx1 fx1VarM5702u = xw1Var.m5702u();
                                                f02.m1560m(ky1Var);
                                                boolM4114e3 = m4113d((String) obj, fx1VarM5702u, ky1Var);
                                            }
                                            j2 = 0;
                                            if (boolM4114e3 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolM4114e3.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            ky1Var = ky1Var;
                                            zM770L = zM770L;
                                        } else if (xw1Var.m5703v()) {
                                            double dDoubleValue = ((Double) obj).doubleValue();
                                            boolM4114e2 = m4114e(new BigDecimal(dDoubleValue), xw1Var.m5704w(), Math.ulp(dDoubleValue));
                                            if (boolM4114e2 != null) {
                                                if (boolM4114e2.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        } else {
                                            f02.m1560m(ky1Var);
                                            wc1Var2.m5314c(cy1Var.m1043a(strM4464y), cy1Var.m1044b(strM5699A), "No number filter for double param. event, param");
                                        }
                                    } else if (xw1Var.m5703v()) {
                                        boolM4114e = m4114e(new BigDecimal(((Long) obj).longValue()), xw1Var.m5704w(), 0.0d);
                                        if (boolM4114e != null) {
                                            if (boolM4114e.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        f02.m1560m(ky1Var);
                                        wc1Var2.m5314c(cy1Var.m1043a(strM4464y), cy1Var.m1044b(strM5699A), "No number filter for long param. event, param");
                                    }
                                } else {
                                    f02.m1560m(ky1Var);
                                    wc1Var2.m5313b(cy1Var.m1043a(strM4464y), "Event has empty param name. event");
                                }
                            }
                        } else {
                            wz1Var = (wz1) it2.next();
                            if (!hashSet.contains(wz1Var.m5480u())) {
                                if (wz1Var.m5483x()) {
                                    String strM5480u = wz1Var.m5480u();
                                    if (wz1Var.m5483x()) {
                                        lValueOf = Long.valueOf(wz1Var.m5484y());
                                    } else {
                                        lValueOf = null;
                                    }
                                    c0089c8.put(strM5480u, lValueOf);
                                } else if (wz1Var.m5465B()) {
                                    String strM5480u2 = wz1Var.m5480u();
                                    if (wz1Var.m5465B()) {
                                        dValueOf = Double.valueOf(wz1Var.m5466C());
                                    } else {
                                        dValueOf = null;
                                    }
                                    c0089c8.put(strM5480u2, dValueOf);
                                } else if (wz1Var.m5481v()) {
                                    c0089c8.put(wz1Var.m5480u(), wz1Var.m5482w());
                                } else {
                                    f02.m1560m(ky1Var);
                                    wc1Var2.m5314c(cy1Var.m1043a(strM4464y), cy1Var.m1044b(wz1Var.m5480u()), "Unknown value for param. event, param");
                                }
                            }
                        }
                    }
                } else {
                    xw1Var2 = (xw1) it.next();
                    if (xw1Var2.m5699A().isEmpty()) {
                        f02.m1560m(ky1Var);
                        wc1Var2.m5313b(cy1Var.m1043a(strM4464y), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(xw1Var2.m5699A());
                    }
                }
                zM770L = zM770L;
                ky1Var = ky1Var;
                break;
            }
        }
        try {
            boolM4114e4 = m4114e(new BigDecimal(j3), vw1Var.m5203A(), 0.0d);
        } catch (NumberFormatException unused) {
            boolM4114e4 = null;
        }
        if (boolM4114e4 != null) {
            if (boolM4114e4.booleanValue()) {
                hashSet = new HashSet();
                it = vw1Var.m5213w().iterator();
                while (true) {
                    if (it.hasNext()) {
                        c0089c8 = new C0089c8(0);
                        it2 = rz1Var.m4461v().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = vw1Var.m5213w().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zM770L = zM770L;
                                        ky1Var = ky1Var;
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    xw1Var = (xw1) it3.next();
                                    if (xw1Var.m5705x() || !xw1Var.m5706y()) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    strM5699A = xw1Var.m5699A();
                                    if (strM5699A.isEmpty()) {
                                        obj = c0089c8.get(strM5699A);
                                        if (obj instanceof Long) {
                                            if (obj instanceof Double) {
                                                if (obj instanceof String) {
                                                    zM770L = zM770L;
                                                    ky1Var = ky1Var;
                                                    if (obj == null) {
                                                        f02.m1560m(ky1Var);
                                                        wc1Var2.m5314c(cy1Var.m1043a(strM4464y), cy1Var.m1044b(strM5699A), "Unknown param type. event, param");
                                                        break;
                                                    }
                                                    f02.m1560m(ky1Var);
                                                    wc1Var.m5314c(cy1Var.m1043a(strM4464y), cy1Var.m1044b(strM5699A), "Missing param for filter. event, param");
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                if (xw1Var.m5701t()) {
                                                    if (xw1Var.m5703v()) {
                                                        zM770L = zM770L;
                                                        ky1Var = ky1Var;
                                                        f02.m1560m(ky1Var);
                                                        wc1Var2.m5314c(cy1Var.m1043a(strM4464y), cy1Var.m1044b(strM5699A), "No filter for String param. event, param");
                                                        break;
                                                    }
                                                    str = (String) obj;
                                                    if (a72.m55e0(str)) {
                                                        zM770L = zM770L;
                                                        ky1Var = ky1Var;
                                                        f02.m1560m(ky1Var);
                                                        wc1Var2.m5314c(cy1Var.m1043a(strM4464y), cy1Var.m1044b(strM5699A), "Invalid param value for number filter. event, param");
                                                        break;
                                                    }
                                                    ax1VarM5704w = xw1Var.m5704w();
                                                    if (a72.m55e0(str)) {
                                                        boolM4114e3 = null;
                                                    } else {
                                                        try {
                                                            zM770L = zM770L;
                                                            ky1Var = ky1Var;
                                                            j2 = 0;
                                                            try {
                                                                boolM4114e3 = m4114e(new BigDecimal(str), ax1VarM5704w, 0.0d);
                                                            } catch (NumberFormatException unused2) {
                                                                boolM4114e3 = null;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                            zM770L = zM770L;
                                                            ky1Var = ky1Var;
                                                            j2 = 0;
                                                        }
                                                    }
                                                    if (boolM4114e3 != null) {
                                                        break;
                                                    }
                                                    if (boolM4114e3.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    ky1Var = ky1Var;
                                                    zM770L = zM770L;
                                                } else {
                                                    fx1 fx1VarM5702u2 = xw1Var.m5702u();
                                                    f02.m1560m(ky1Var);
                                                    boolM4114e3 = m4113d((String) obj, fx1VarM5702u2, ky1Var);
                                                }
                                                j2 = 0;
                                                if (boolM4114e3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolM4114e3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                ky1Var = ky1Var;
                                                zM770L = zM770L;
                                            } else if (xw1Var.m5703v()) {
                                                f02.m1560m(ky1Var);
                                                wc1Var2.m5314c(cy1Var.m1043a(strM4464y), cy1Var.m1044b(strM5699A), "No number filter for double param. event, param");
                                            } else {
                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                try {
                                                    boolM4114e2 = m4114e(new BigDecimal(dDoubleValue2), xw1Var.m5704w(), Math.ulp(dDoubleValue2));
                                                } catch (NumberFormatException unused4) {
                                                    boolM4114e2 = null;
                                                }
                                                if (boolM4114e2 != null) {
                                                    if (boolM4114e2.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                        } else if (xw1Var.m5703v()) {
                                            f02.m1560m(ky1Var);
                                            wc1Var2.m5314c(cy1Var.m1043a(strM4464y), cy1Var.m1044b(strM5699A), "No number filter for long param. event, param");
                                        } else {
                                            try {
                                                boolM4114e = m4114e(new BigDecimal(((Long) obj).longValue()), xw1Var.m5704w(), 0.0d);
                                            } catch (NumberFormatException unused5) {
                                                boolM4114e = null;
                                            }
                                            if (boolM4114e != null) {
                                                if (boolM4114e.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    } else {
                                        f02.m1560m(ky1Var);
                                        wc1Var2.m5313b(cy1Var.m1043a(strM4464y), "Event has empty param name. event");
                                    }
                                }
                            } else {
                                wz1Var = (wz1) it2.next();
                                if (!hashSet.contains(wz1Var.m5480u())) {
                                    if (wz1Var.m5483x()) {
                                        String strM5480u3 = wz1Var.m5480u();
                                        if (wz1Var.m5483x()) {
                                            lValueOf = Long.valueOf(wz1Var.m5484y());
                                        } else {
                                            lValueOf = null;
                                        }
                                        c0089c8.put(strM5480u3, lValueOf);
                                    } else if (wz1Var.m5465B()) {
                                        String strM5480u4 = wz1Var.m5480u();
                                        if (wz1Var.m5465B()) {
                                            dValueOf = Double.valueOf(wz1Var.m5466C());
                                        } else {
                                            dValueOf = null;
                                        }
                                        c0089c8.put(strM5480u4, dValueOf);
                                    } else if (wz1Var.m5481v()) {
                                        c0089c8.put(wz1Var.m5480u(), wz1Var.m5482w());
                                    } else {
                                        f02.m1560m(ky1Var);
                                        wc1Var2.m5314c(cy1Var.m1043a(strM4464y), cy1Var.m1044b(wz1Var.m5480u()), "Unknown value for param. event, param");
                                    }
                                }
                            }
                        }
                    } else {
                        xw1Var2 = (xw1) it.next();
                        if (xw1Var2.m5699A().isEmpty()) {
                            f02.m1560m(ky1Var);
                            wc1Var2.m5313b(cy1Var.m1043a(strM4464y), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(xw1Var2.m5699A());
                        }
                    }
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        zM770L = zM770L;
        ky1Var = ky1Var;
        break;
        f02.m1560m(ky1Var);
        wc1Var.m5313b(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f6541c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f6542d = bool2;
        if (!z3 || !rz1Var.m4465z()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(rz1Var.m4440A());
        if (vw1Var.m5205C()) {
            if (zM770L && vw1Var.m5216z()) {
                lValueOf2 = l;
            }
            this.f6544f = lValueOf2;
            return true;
        }
        if (zM770L && vw1Var.m5216z()) {
            lValueOf2 = l2;
        }
        this.f6543e = lValueOf2;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m4116b(Long l, Long l2, t02 t02Var, boolean z) {
        boolean z2;
        Boolean boolM4112c;
        Boolean boolM4114e;
        Boolean boolM4114e2;
        Boolean boolM4114e3;
        sr1.m4588a();
        f02 f02Var = (f02) this.f6546h.f7192j;
        bt1 bt1Var = f02Var.f2245m;
        cy1 cy1Var = f02Var.f2251s;
        ky1 ky1Var = f02Var.f2247o;
        boolean zM770L = bt1Var.m770L(this.f6539a, jx1.f4119D0);
        ex1 ex1Var = (ex1) this.f6547i;
        boolean zM1515x = ex1Var.m1515x();
        boolean zM1516y = ex1Var.m1516y();
        boolean zM1509A = ex1Var.m1509A();
        boolean z3 = zM1515x || zM1516y || zM1509A;
        if (z && !z3) {
            f02.m1560m(ky1Var);
            ky1Var.f4608w.m5314c(Integer.valueOf(this.f6540b), ex1Var.m1511t() ? Integer.valueOf(ex1Var.m1512u()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        xw1 xw1VarM1514w = ex1Var.m1514w();
        boolean zM5706y = xw1VarM1514w.m5706y();
        if (!t02Var.m4646y()) {
            z2 = zM1509A;
            if (!t02Var.m4631C()) {
                if (!t02Var.m4644w()) {
                    f02.m1560m(ky1Var);
                    ky1Var.f4603r.m5313b(cy1Var.m1045c(t02Var.m4643v()), "User property has no value, property");
                } else if (xw1VarM1514w.m5701t()) {
                    String strM4645x = t02Var.m4645x();
                    fx1 fx1VarM5702u = xw1VarM1514w.m5702u();
                    f02.m1560m(ky1Var);
                    boolM4112c = m4112c(m4113d(strM4645x, fx1VarM5702u, ky1Var), zM5706y);
                } else if (!xw1VarM1514w.m5703v()) {
                    f02.m1560m(ky1Var);
                    ky1Var.f4603r.m5313b(cy1Var.m1045c(t02Var.m4643v()), "No string or number filter defined. property");
                } else if (a72.m55e0(t02Var.m4645x())) {
                    String strM4645x2 = t02Var.m4645x();
                    ax1 ax1VarM5704w = xw1VarM1514w.m5704w();
                    if (a72.m55e0(strM4645x2)) {
                        try {
                            boolM4114e = m4114e(new BigDecimal(strM4645x2), ax1VarM5704w, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolM4114e = null;
                        }
                    } else {
                        boolM4114e = null;
                    }
                    boolM4112c = m4112c(boolM4114e, zM5706y);
                } else {
                    f02.m1560m(ky1Var);
                    ky1Var.f4603r.m5314c(cy1Var.m1045c(t02Var.m4643v()), t02Var.m4645x(), "Invalid user property value for Numeric number filter. property, value");
                }
                boolM4112c = null;
            } else if (xw1VarM1514w.m5703v()) {
                double dM4632D = t02Var.m4632D();
                try {
                    boolM4114e2 = m4114e(new BigDecimal(dM4632D), xw1VarM1514w.m5704w(), Math.ulp(dM4632D));
                } catch (NumberFormatException unused2) {
                    boolM4114e2 = null;
                }
                boolM4112c = m4112c(boolM4114e2, zM5706y);
            } else {
                f02.m1560m(ky1Var);
                ky1Var.f4603r.m5313b(cy1Var.m1045c(t02Var.m4643v()), "No number filter for double property. property");
                boolM4112c = null;
            }
        } else if (xw1VarM1514w.m5703v()) {
            z2 = zM1509A;
            try {
                boolM4114e3 = m4114e(new BigDecimal(t02Var.m4647z()), xw1VarM1514w.m5704w(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolM4114e3 = null;
            }
            boolM4112c = m4112c(boolM4114e3, zM5706y);
        } else {
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5313b(cy1Var.m1045c(t02Var.m4643v()), "No number filter for long property. property");
            z2 = zM1509A;
            boolM4112c = null;
        }
        f02.m1560m(ky1Var);
        ky1Var.f4608w.m5313b(boolM4112c == null ? "null" : boolM4112c, "Property filter result");
        if (boolM4112c == null) {
            return false;
        }
        this.f6541c = Boolean.TRUE;
        if (!z2 || boolM4112c.booleanValue()) {
            if (!z || ex1Var.m1515x()) {
                this.f6542d = boolM4112c;
            }
            if (boolM4112c.booleanValue() && z3 && t02Var.m4641t()) {
                long jM4642u = t02Var.m4642u();
                if (l != null) {
                    jM4642u = l.longValue();
                }
                if (zM770L && ex1Var.m1515x() && !ex1Var.m1516y() && l2 != null) {
                    jM4642u = l2.longValue();
                }
                if (ex1Var.m1516y()) {
                    this.f6544f = Long.valueOf(jM4642u);
                } else {
                    this.f6543e = Long.valueOf(jM4642u);
                }
            }
        }
        return true;
    }
}
