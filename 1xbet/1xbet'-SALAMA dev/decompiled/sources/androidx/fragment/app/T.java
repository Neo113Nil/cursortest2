package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class T extends androidx.lifecycle.S {
    public static final K j = new K();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9411g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f9408d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f9409e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f9410f = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9412h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9413i = false;

    public T(boolean z4) {
        this.f9411g = z4;
    }

    @Override // androidx.lifecycle.S
    public final void b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f9412h = true;
    }

    public final void c(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, boolean z4) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0701v);
        }
        e(abstractComponentCallbacksC0701v.f9537e, z4);
    }

    public final void d(String str, boolean z4) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z4);
    }

    public final void e(String str, boolean z4) {
        HashMap map = this.f9409e;
        T t7 = (T) map.get(str);
        if (t7 != null) {
            if (z4) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(t7.f9409e.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    t7.d((String) it.next(), true);
                }
            }
            t7.b();
            map.remove(str);
        }
        HashMap map2 = this.f9410f;
        androidx.lifecycle.X x4 = (androidx.lifecycle.X) map2.get(str);
        if (x4 != null) {
            x4.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T.class != obj.getClass()) {
            return false;
        }
        T t7 = (T) obj;
        return this.f9408d.equals(t7.f9408d) && this.f9409e.equals(t7.f9409e) && this.f9410f.equals(t7.f9410f);
    }

    public final void f(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        if (this.f9413i) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f9408d.remove(abstractComponentCallbacksC0701v.f9537e) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0701v);
        }
    }

    public final int hashCode() {
        return this.f9410f.hashCode() + ((this.f9409e.hashCode() + (this.f9408d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f9408d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f9409e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f9410f.keySet().iterator();
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
