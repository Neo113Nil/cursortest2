package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class l50 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f4679a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public boolean f4680b = false;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f4681c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4682d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f4683e;

    public l50(int i, Object obj) {
        this.f4682d = i;
        this.f4683e = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m3171a() {
        switch (this.f4682d) {
            case 0:
                t50 t50Var = (t50) this.f4683e;
                if (t50.m4691J(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + t50Var);
                }
                if (t50.m4691J(3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + t50Var.f7304h);
                }
                C0722ta c0722ta = t50Var.f7304h;
                if (c0722ta != null) {
                    c0722ta.f7391r = false;
                    c0722ta.m4776d();
                    C0722ta c0722ta2 = t50Var.f7304h;
                    RunnableC0944za runnableC0944za = new RunnableC0944za(6, t50Var);
                    if (c0722ta2.f7389p == null) {
                        c0722ta2.f7389p = new ArrayList();
                    }
                    c0722ta2.f7389p.add(runnableC0944za);
                    t50Var.f7304h.m4777e(false, true);
                    t50Var.f7305i = true;
                    t50Var.m4696A(true);
                    t50Var.m4699D();
                    t50Var.f7305i = false;
                    t50Var.f7304h = null;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3175e(boolean z) {
        mr0 mr0Var;
        this.f4680b = z;
        ArrayList arrayList = this.f4679a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            bu0 bu0Var = (bu0) obj;
            boolean z2 = bu0Var.f991e && z;
            if (bu0Var.f988b != z2) {
                bu0Var.f988b = z2;
                f71 f71Var = bu0Var.f989c;
                if (f71Var != null && (mr0Var = (mr0) f71Var.f2335l) != null) {
                    mr0Var.m3427b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3172b() {
    }

    /* JADX INFO: renamed from: c */
    public final void m3173c(C0685sa c0685sa) {
    }

    /* JADX INFO: renamed from: d */
    public final void m3174d(C0685sa c0685sa) {
    }
}
