package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z82 implements InterfaceC0387k8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9685a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n72 f9686b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f9687c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f9688d;

    public /* synthetic */ z82(n72 n72Var, int i, ArrayList arrayList) {
        this.f9686b = n72Var;
        this.f9688d = i;
        this.f9687c = arrayList;
    }

    @Override // p000.InterfaceC0387k8
    public final ListenableFuture apply(Object obj) {
        int i = this.f9685a;
        int i2 = this.f9688d;
        ArrayList arrayList = this.f9687c;
        n72 n72Var = this.f9686b;
        switch (i) {
            case 0:
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    if (((Boolean) k70.m2991b((Future) arrayList.get(i3))).booleanValue()) {
                        ((List) n72Var.f5324b).get(i3).getClass();
                        dd0.m1158c();
                        return null;
                    }
                }
                qc0 qc0VarM4057p = qc0.m4057p(arrayList2);
                CallableC0208fe callableC0208fe = new CallableC0208fe();
                C0915yi c0915yi = new C0915yi(qc0VarM4057p, true);
                c0915yi.f9307w = new C0878xi(c0915yi, callableC0208fe);
                c0915yi.m5804s();
                return c0915yi;
            default:
                qc0 qc0VarM4057p2 = qc0.m4057p(arrayList);
                a81 a81VarM2841a = ja2.m2841a(new g92(n72Var, (do1) obj, i2, arrayList));
                Executor executor = (Executor) n72Var.f5325c;
                C0915yi c0915yi2 = new C0915yi(qc0VarM4057p2, false);
                c0915yi2.f9307w = new C0878xi(c0915yi2, a81VarM2841a, executor);
                c0915yi2.m5804s();
                return c0915yi2;
        }
    }

    public /* synthetic */ z82(n72 n72Var, ArrayList arrayList, int i) {
        this.f9686b = n72Var;
        this.f9687c = arrayList;
        this.f9688d = i;
    }
}
