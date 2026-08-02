package p000;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.C0028a;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class i91 {

    /* JADX INFO: renamed from: a */
    public int f3486a;

    /* JADX INFO: renamed from: b */
    public int f3487b;

    /* JADX INFO: renamed from: c */
    public final c50 f3488c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f3489d;

    /* JADX INFO: renamed from: e */
    public boolean f3490e;

    /* JADX INFO: renamed from: f */
    public boolean f3491f;

    /* JADX INFO: renamed from: g */
    public boolean f3492g;

    /* JADX INFO: renamed from: h */
    public boolean f3493h;

    /* JADX INFO: renamed from: i */
    public boolean f3494i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f3495j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f3496k;

    /* JADX INFO: renamed from: l */
    public final C0028a f3497l;

    public i91(int i, int i2, C0028a c0028a) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        c50 c50Var = c0028a.f537c;
        c50Var.getClass();
        if (i == 0 || i2 == 0) {
            throw null;
        }
        c50Var.getClass();
        this.f3486a = i;
        this.f3487b = i2;
        this.f3488c = c50Var;
        this.f3489d = new ArrayList();
        this.f3494i = true;
        ArrayList arrayList = new ArrayList();
        this.f3495j = arrayList;
        this.f3496k = arrayList;
        this.f3497l = c0028a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2576a(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f3493h = false;
        if (this.f3490e) {
            return;
        }
        this.f3490e = true;
        if (this.f3495j.isEmpty()) {
            m2577b();
            return;
        }
        for (h91 h91Var : AbstractC0471mi.m3389w(this.f3496k)) {
            h91Var.getClass();
            if (!h91Var.f3133b) {
                h91Var.mo1496a(viewGroup);
            }
            h91Var.f3133b = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2577b() {
        this.f3493h = false;
        if (!this.f3491f) {
            if (t50.m4691J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f3491f = true;
            ArrayList arrayList = this.f3489d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.f3488c.f1139v = false;
        this.f3497l.m427k();
    }

    /* JADX INFO: renamed from: c */
    public final void m2578c(h91 h91Var) {
        h91Var.getClass();
        ArrayList arrayList = this.f3495j;
        if (arrayList.remove(h91Var) && arrayList.isEmpty()) {
            m2577b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2579d(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        int iM292o = AbstractC0024an.m292o(i2);
        c50 c50Var = this.f3488c;
        if (iM292o == 0) {
            if (this.f3486a != 1) {
                if (t50.m4691J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + c50Var + " mFinalState = " + j11.m2778m(this.f3486a) + " -> " + j11.m2778m(i) + '.');
                }
                this.f3486a = i;
                return;
            }
            return;
        }
        if (iM292o == 1) {
            if (this.f3486a == 1) {
                if (t50.m4691J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + c50Var + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + j11.m2777l(this.f3487b) + " to ADDING.");
                }
                this.f3486a = 2;
                this.f3487b = 2;
                this.f3494i = true;
                return;
            }
            return;
        }
        if (iM292o != 2) {
            return;
        }
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + c50Var + " mFinalState = " + j11.m2778m(this.f3486a) + " -> REMOVED. mLifecycleImpact  = " + j11.m2777l(this.f3487b) + " to REMOVING.");
        }
        this.f3486a = 1;
        this.f3487b = 3;
        this.f3494i = true;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + j11.m2778m(this.f3486a) + " lifecycleImpact = " + j11.m2777l(this.f3487b) + " fragment = " + this.f3488c + '}';
    }
}
