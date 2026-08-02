package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class s50 implements q50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t50 f7031a;

    public s50(t50 t50Var) {
        this.f7031a = t50Var;
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: a */
    public final boolean mo4037a(ArrayList arrayList, ArrayList arrayList2) {
        boolean zM4708R;
        t50 t50Var = this.f7031a;
        ArrayList arrayList3 = t50Var.f7310n;
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + t50Var.f7297a);
        }
        if (t50Var.f7300d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zM4708R = false;
        } else {
            ArrayList arrayList4 = t50Var.f7300d;
            C0722ta c0722ta = (C0722ta) arrayList4.get(arrayList4.size() - 1);
            t50Var.f7304h = c0722ta;
            ArrayList arrayList5 = c0722ta.f7374a;
            int size = arrayList5.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList5.get(i);
                i++;
                c50 c50Var = ((b60) obj).f734b;
                if (c50Var != null) {
                    c50Var.f1139v = true;
                }
            }
            zM4708R = t50Var.m4708R(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                linkedHashSet.addAll(t50.m4690E((C0722ta) obj2));
            }
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList3.get(i3);
                i3++;
                if (obj3 != null) {
                    dd0.m1158c();
                    return false;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        return zM4708R;
    }
}
