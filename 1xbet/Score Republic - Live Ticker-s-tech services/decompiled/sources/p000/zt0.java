package p000;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zt0 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ au0 f9952a;

    public zt0(au0 au0Var) {
        this.f9952a = au0Var;
    }

    public final void onBackCancelled() {
        au0 au0Var = this.f9952a;
        f71 f71Var = au0Var.f4889a;
        if (f71Var == null) {
            C0270h1.m2191g("This input is not added to any dispatcher.");
            return;
        }
        if (!au0Var.f4890b) {
            f71Var.m1660f(au0Var, null);
        }
        mr0 mr0Var = (mr0) f71Var.f2335l;
        mr0Var.getClass();
        if (au0Var.equals(mr0Var.f5143h) && -1 == mr0Var.f5142g) {
            bu0 bu0VarM3428c = mr0Var.f5141f;
            if (bu0VarM3428c == null) {
                bu0VarM3428c = mr0Var.m3428c(-1);
            }
            mr0Var.f5141f = null;
            mr0Var.f5142g = 0;
            mr0Var.f5143h = null;
            if (bu0VarM3428c != null) {
                bu0VarM3428c.f990d.m3171a();
            }
            da1 da1Var = mr0Var.f5136a;
            nr0 nr0Var = nr0.f5506j;
            da1Var.getClass();
            da1Var.m1143m0(null, nr0Var);
        }
        au0Var.f4890b = false;
    }

    public final void onBackInvoked() {
        this.f9952a.m3288a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        jr0 jr0VarM3831a = AbstractC0565p1.m3831a(backEvent);
        au0 au0Var = this.f9952a;
        f71 f71Var = au0Var.f4889a;
        if (f71Var == null) {
            C0270h1.m2191g("This input is not added to any dispatcher.");
            return;
        }
        if (au0Var.f4890b) {
            mr0 mr0Var = (mr0) f71Var.f2335l;
            mr0Var.getClass();
            if (au0Var.equals(mr0Var.f5143h) && -1 == mr0Var.f5142g) {
                bu0 bu0VarM3428c = mr0Var.f5141f;
                if (bu0VarM3428c == null) {
                    bu0VarM3428c = mr0Var.m3428c(-1);
                }
                if (bu0VarM3428c != null) {
                    l50 l50Var = bu0VarM3428c.f990d;
                    C0685sa c0685sa = new C0685sa(jr0VarM3831a);
                    switch (l50Var.f4682d) {
                        case 0:
                            t50 t50Var = (t50) l50Var.f4683e;
                            if (t50.m4691J(2)) {
                                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + t50Var);
                            }
                            if (t50Var.f7304h != null) {
                                for (C0443lr c0443lr : t50Var.m4726f(new ArrayList(Collections.singletonList(t50Var.f7304h)), 0, 1)) {
                                    c0443lr.getClass();
                                    if (t50.m4691J(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + c0685sa.f7081c);
                                    }
                                    ArrayList arrayList = c0443lr.f4885c;
                                    ArrayList arrayList2 = new ArrayList();
                                    int size = arrayList.size();
                                    int i = 0;
                                    while (i < size) {
                                        Object obj = arrayList.get(i);
                                        i++;
                                        AbstractC0693si.m4526s(arrayList2, ((i91) obj).f3496k);
                                    }
                                    List listM3389w = AbstractC0471mi.m3389w(AbstractC0471mi.m3390x(arrayList2));
                                    int size2 = listM3389w.size();
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        ((h91) listM3389w.get(i2)).mo2241c(c0685sa, c0443lr.f4883a);
                                    }
                                }
                                Iterator it = t50Var.f7310n.iterator();
                                if (it.hasNext()) {
                                    throw AbstractC0024an.m280c(it);
                                }
                            }
                            break;
                    }
                }
                da1 da1Var = mr0Var.f5136a;
                or0 or0Var = new or0(jr0VarM3831a);
                da1Var.getClass();
                da1Var.m1143m0(null, or0Var);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        jr0 jr0VarM3831a = AbstractC0565p1.m3831a(backEvent);
        au0 au0Var = this.f9952a;
        f71 f71Var = au0Var.f4889a;
        if (f71Var == null) {
            C0270h1.m2191g("This input is not added to any dispatcher.");
        } else {
            if (au0Var.f4890b) {
                return;
            }
            f71Var.m1660f(au0Var, jr0VarM3831a);
            au0Var.f4890b = true;
        }
    }
}
