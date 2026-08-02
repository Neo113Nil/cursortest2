package p000;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wa2 {

    /* JADX INFO: renamed from: a */
    public final String f8486a;

    /* JADX INFO: renamed from: b */
    public final boolean f8487b;

    /* JADX INFO: renamed from: c */
    public final m02 f8488c;

    /* JADX INFO: renamed from: d */
    public final BitSet f8489d;

    /* JADX INFO: renamed from: e */
    public final BitSet f8490e;

    /* JADX INFO: renamed from: f */
    public final C0089c8 f8491f;

    /* JADX INFO: renamed from: g */
    public final C0089c8 f8492g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ qo1 f8493h;

    public wa2(qo1 qo1Var, String str, m02 m02Var, BitSet bitSet, BitSet bitSet2, C0089c8 c0089c8, C0089c8 c0089c9) {
        this.f8493h = qo1Var;
        this.f8486a = str;
        this.f8489d = bitSet;
        this.f8490e = bitSet2;
        this.f8491f = c0089c8;
        this.f8492g = new C0089c8(0);
        for (Integer num : (C0941z7) c0089c9.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c0089c9.get(num));
            this.f8492g.put(num, arrayList);
        }
        this.f8487b = false;
        this.f8488c = m02Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m5309a(qm1 qm1Var) {
        int iM5211u;
        switch (qm1Var.f6545g) {
            case 0:
                iM5211u = ((vw1) qm1Var.f6547i).m5211u();
                break;
            default:
                iM5211u = ((ex1) qm1Var.f6547i).m1512u();
                break;
        }
        boolean z = true;
        if (qm1Var.f6541c != null) {
            this.f8490e.set(iM5211u, true);
        }
        Boolean bool = qm1Var.f6542d;
        if (bool != null) {
            this.f8489d.set(iM5211u, bool.booleanValue());
        }
        if (qm1Var.f6543e != null) {
            Integer numValueOf = Integer.valueOf(iM5211u);
            C0089c8 c0089c8 = this.f8491f;
            Long l = (Long) c0089c8.get(numValueOf);
            long jLongValue = qm1Var.f6543e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                c0089c8.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (qm1Var.f6544f != null) {
            Integer numValueOf2 = Integer.valueOf(iM5211u);
            C0089c8 c0089c9 = this.f8492g;
            List arrayList = (List) c0089c9.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c0089c9.put(numValueOf2, arrayList);
            }
            boolean zM5216z = false;
            switch (qm1Var.f6545g) {
                case 0:
                    z = false;
                    break;
            }
            if (z) {
                arrayList.clear();
            }
            sr1.m4588a();
            f02 f02Var = (f02) this.f8493h.f7192j;
            bt1 bt1Var = f02Var.f2245m;
            ix1 ix1Var = jx1.f4123F0;
            String str = this.f8486a;
            if (bt1Var.m770L(str, ix1Var)) {
                switch (qm1Var.f6545g) {
                    case 0:
                        zM5216z = ((vw1) qm1Var.f6547i).m5216z();
                        break;
                }
                if (zM5216z) {
                    arrayList.clear();
                }
            }
            sr1.m4588a();
            boolean zM770L = f02Var.f2245m.m770L(str, ix1Var);
            Long l2 = qm1Var.f6544f;
            if (!zM770L) {
                arrayList.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(l2.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    /* JADX INFO: renamed from: b */
    public final ez1 m5310b(int i) {
        ArrayList arrayList;
        List list;
        dz1 dz1VarM1528A = ez1.m1528A();
        dz1VarM1528A.m5681b();
        ((ez1) dz1VarM1528A.f9011k).m1529B(i);
        dz1VarM1528A.m5681b();
        ((ez1) dz1VarM1528A.f9011k).m1532E(this.f8487b);
        m02 m02Var = this.f8488c;
        if (m02Var != null) {
            dz1VarM1528A.m5681b();
            ((ez1) dz1VarM1528A.f9011k).m1531D(m02Var);
        }
        l02 l02VarM3296B = m02.m3296B();
        ArrayList arrayListM57g0 = a72.m57g0(this.f8489d);
        l02VarM3296B.m5681b();
        ((m02) l02VarM3296B.f9011k).m3301F(arrayListM57g0);
        ArrayList arrayListM57g1 = a72.m57g0(this.f8490e);
        l02VarM3296B.m5681b();
        ((m02) l02VarM3296B.f9011k).m3299D(arrayListM57g1);
        C0089c8 c0089c8 = this.f8491f;
        if (c0089c8 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(c0089c8.f8453l);
            for (Integer num : (C0941z7) c0089c8.keySet()) {
                int iIntValue = num.intValue();
                Long l = (Long) c0089c8.get(num);
                if (l != null) {
                    oz1 oz1VarM4015x = pz1.m4015x();
                    oz1VarM4015x.m5681b();
                    ((pz1) oz1VarM4015x.f9011k).m4020y(iIntValue);
                    long jLongValue = l.longValue();
                    oz1VarM4015x.m5681b();
                    ((pz1) oz1VarM4015x.f9011k).m4021z(jLongValue);
                    arrayList2.add((pz1) oz1VarM4015x.m5683d());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            l02VarM3296B.m5681b();
            ((m02) l02VarM3296B.f9011k).m3303H(arrayList);
        }
        C0089c8 c0089c9 = this.f8492g;
        if (c0089c9 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(c0089c9.f8453l);
            for (Integer num2 : (C0941z7) c0089c9.keySet()) {
                o02 o02VarM3823y = p02.m3823y();
                int iIntValue2 = num2.intValue();
                o02VarM3823y.m5681b();
                ((p02) o02VarM3823y.f9011k).m3830z(iIntValue2);
                List list2 = (List) c0089c9.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    o02VarM3823y.m5681b();
                    ((p02) o02VarM3823y.f9011k).m3824A(list2);
                }
                arrayList3.add((p02) o02VarM3823y.m5683d());
            }
            list = arrayList3;
        }
        l02VarM3296B.m5681b();
        ((m02) l02VarM3296B.f9011k).m3305J(list);
        dz1VarM1528A.m5681b();
        ((ez1) dz1VarM1528A.f9011k).m1530C((m02) l02VarM3296B.m5683d());
        return (ez1) dz1VarM1528A.m5683d();
    }

    public wa2(qo1 qo1Var, String str) {
        this.f8493h = qo1Var;
        this.f8486a = str;
        this.f8487b = true;
        this.f8489d = new BitSet();
        this.f8490e = new BitSet();
        this.f8491f = new C0089c8(0);
        this.f8492g = new C0089c8(0);
    }
}
