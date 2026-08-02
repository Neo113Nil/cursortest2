package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ft1 extends bs1 {

    /* JADX INFO: renamed from: l */
    public final ArrayList f2497l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f2498m;

    /* JADX INFO: renamed from: n */
    public final f71 f2499n;

    public ft1(String str, ArrayList arrayList, List list, f71 f71Var) {
        super(str);
        this.f2497l = new ArrayList();
        this.f2499n = f71Var;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.f2497l.add(((ht1) obj).mo753f());
            }
        }
        this.f2498m = new ArrayList(list);
    }

    @Override // p000.bs1
    /* JADX INFO: renamed from: a */
    public final ht1 mo749a(f71 f71Var, List list) {
        nt1 nt1Var;
        f71 f71VarM1650C = this.f2499n.m1650C();
        a81 a81Var = (a81) f71VarM1650C.f2335l;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f2497l;
            int size = arrayList.size();
            nt1Var = ht1.f3330b;
            if (i2 >= size) {
                break;
            }
            if (i2 < list.size()) {
                f71VarM1650C.m1653F((String) arrayList.get(i2), ((a81) f71Var.f2335l).m96t(f71Var, (ht1) list.get(i2)));
            } else {
                f71VarM1650C.m1653F((String) arrayList.get(i2), nt1Var);
            }
            i2++;
        }
        ArrayList arrayList2 = this.f2498m;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            ht1 ht1Var = (ht1) obj;
            ht1 ht1VarM96t = a81Var.m96t(f71VarM1650C, ht1Var);
            if (ht1VarM96t instanceof it1) {
                ht1VarM96t = a81Var.m96t(f71VarM1650C, ht1Var);
            }
            if (ht1VarM96t instanceof nq1) {
                return ((nq1) ht1VarM96t).f5502j;
            }
        }
        return nt1Var;
    }

    @Override // p000.bs1, p000.ht1
    /* JADX INFO: renamed from: p */
    public final ht1 mo758p() {
        return new ft1(this);
    }

    public ft1(ft1 ft1Var) {
        super(ft1Var.f974j);
        ArrayList arrayList = new ArrayList(ft1Var.f2497l.size());
        this.f2497l = arrayList;
        arrayList.addAll(ft1Var.f2497l);
        ArrayList arrayList2 = new ArrayList(ft1Var.f2498m.size());
        this.f2498m = arrayList2;
        arrayList2.addAll(ft1Var.f2498m);
        this.f2499n = ft1Var.f2499n;
    }
}
