package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j82 extends bs1 {

    /* JADX INFO: renamed from: l */
    public final boolean f3854l;

    /* JADX INFO: renamed from: m */
    public final boolean f3855m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ y12 f3856n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j82(y12 y12Var, boolean z, boolean z2) {
        super("log");
        this.f3856n = y12Var;
        this.f3854l = z;
        this.f3855m = z2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1 A[LOOP:0: B:23:0x0097->B:25:0x00a1, LOOP_END] */
    @Override // p000.bs1
    /* JADX INFO: renamed from: a */
    public final ht1 mo749a(f71 f71Var, List list) {
        int i;
        int i2;
        String strMo753f;
        ArrayList arrayList;
        wo1.m5398y("log", 1, list);
        int size = list.size();
        nt1 nt1Var = ht1.f3330b;
        y12 y12Var = this.f3856n;
        if (size == 1) {
            ((an0) y12Var.f9131m).m326z(3, ((a81) f71Var.f2335l).m96t(f71Var, (ht1) list.get(0)).mo753f(), Collections.EMPTY_LIST, this.f3854l, this.f3855m);
            return nt1Var;
        }
        ht1 ht1Var = (ht1) list.get(0);
        a81 a81Var = (a81) f71Var.f2335l;
        a81 a81Var2 = (a81) f71Var.f2335l;
        int iM5373D = wo1.m5373D(a81Var.m96t(f71Var, ht1Var).mo755h().doubleValue());
        if (iM5373D != 2) {
            i = 3;
            if (iM5373D == 3) {
                i2 = 1;
            } else if (iM5373D == 5) {
                i2 = 5;
            } else if (iM5373D == 6) {
                i2 = 2;
            }
            strMo753f = a81Var2.m96t(f71Var, (ht1) list.get(1)).mo753f();
            if (list.size() == 2) {
                ((an0) y12Var.f9131m).m326z(i2, strMo753f, Collections.EMPTY_LIST, this.f3854l, this.f3855m);
                return nt1Var;
            }
            arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(a81Var2.m96t(f71Var, (ht1) list.get(i3)).mo753f());
            }
            ((an0) y12Var.f9131m).m326z(i2, strMo753f, arrayList, this.f3854l, this.f3855m);
            return nt1Var;
        }
        i = 4;
        i2 = i;
        strMo753f = a81Var2.m96t(f71Var, (ht1) list.get(1)).mo753f();
        if (list.size() == 2) {
            ((an0) y12Var.f9131m).m326z(i2, strMo753f, Collections.EMPTY_LIST, this.f3854l, this.f3855m);
            return nt1Var;
        }
        arrayList = new ArrayList();
        while (i3 < Math.min(list.size(), 5)) {
            arrayList.add(a81Var2.m96t(f71Var, (ht1) list.get(i3)).mo753f());
        }
        ((an0) y12Var.f9131m).m326z(i2, strMo753f, arrayList, this.f3854l, this.f3855m);
        return nt1Var;
    }
}
