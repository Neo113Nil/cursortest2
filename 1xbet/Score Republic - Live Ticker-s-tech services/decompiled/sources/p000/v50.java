package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v50 extends di1 {

    /* JADX INFO: renamed from: i */
    public static final nc1 f8088i = new nc1(26);

    /* JADX INFO: renamed from: f */
    public final boolean f8092f;

    /* JADX INFO: renamed from: c */
    public final HashMap f8089c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f8090d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final HashMap f8091e = new HashMap();

    /* JADX INFO: renamed from: g */
    public boolean f8093g = false;

    /* JADX INFO: renamed from: h */
    public boolean f8094h = false;

    public v50(boolean z) {
        this.f8092f = z;
    }

    @Override // p000.di1
    /* JADX INFO: renamed from: b */
    public final void mo1228b() {
        if (t50.m4691J(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f8093g = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m5073c(c50 c50Var, boolean z) {
        if (t50.m4691J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + c50Var);
        }
        m5075e(c50Var.f1131n, z);
    }

    /* JADX INFO: renamed from: d */
    public final void m5074d(String str, boolean z) {
        if (t50.m4691J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m5075e(str, z);
    }

    /* JADX INFO: renamed from: e */
    public final void m5075e(String str, boolean z) {
        HashMap map = this.f8090d;
        v50 v50Var = (v50) map.get(str);
        if (v50Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(v50Var.f8090d.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    v50Var.m5074d((String) obj, true);
                }
            }
            v50Var.mo1228b();
            map.remove(str);
        }
        HashMap map2 = this.f8091e;
        gi1 gi1Var = (gi1) map2.get(str);
        if (gi1Var != null) {
            gi1Var.m2099a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v50.class == obj.getClass()) {
            v50 v50Var = (v50) obj;
            if (this.f8089c.equals(v50Var.f8089c) && this.f8090d.equals(v50Var.f8090d) && this.f8091e.equals(v50Var.f8091e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m5076f(c50 c50Var) {
        if (this.f8094h) {
            if (t50.m4691J(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f8089c.remove(c50Var.f1131n) == null || !t50.m4691J(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + c50Var);
        }
    }

    public final int hashCode() {
        return this.f8091e.hashCode() + ((this.f8090d.hashCode() + (this.f8089c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f8089c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f8090d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f8091e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
