package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: nv */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0521nv implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5552j = 1;

    /* JADX INFO: renamed from: k */
    public final int f5553k;

    /* JADX INFO: renamed from: l */
    public final Object f5554l;

    public RunnableC0521nv(List list, int i, Throwable th) {
        hn0.m2313g(list, "initCallbacks cannot be null");
        this.f5554l = new ArrayList(list);
        this.f5553k = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5552j;
        int i2 = this.f5553k;
        Object obj = this.f5554l;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((AbstractC0484mv) arrayList.get(i3)).mo786a();
                        i3++;
                    }
                } else {
                    while (i3 < size) {
                        ((AbstractC0484mv) arrayList.get(i3)).getClass();
                        i3++;
                    }
                }
                break;
            default:
                ((el1) obj).m1444e(i2);
                break;
        }
    }

    public RunnableC0521nv(el1 el1Var, int i) {
        this.f5553k = i;
        this.f5554l = el1Var;
    }
}
