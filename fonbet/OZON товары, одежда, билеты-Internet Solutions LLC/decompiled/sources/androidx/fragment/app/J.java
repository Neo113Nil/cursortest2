package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.A0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
final class J extends w0 {

    /* renamed from: g, reason: collision with root package name */
    private static final z0.b f42930g = new a();

    /* renamed from: d, reason: collision with root package name */
    private final boolean f42934d;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, ComponentCallbacksC5392m> f42931a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, J> f42932b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, A0> f42933c = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f42935e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f42936f = false;

    final class a implements z0.b {
        @Override // androidx.lifecycle.z0.b
        @NonNull
        public final <T extends w0> T create(@NonNull Class<T> cls) {
            return new J(true);
        }
    }

    J(boolean z11) {
        this.f42934d = z11;
    }

    private void g0(@NonNull String str, boolean z11) {
        HashMap<String, J> hashMap = this.f42932b;
        J j11 = hashMap.get(str);
        if (j11 != null) {
            if (z11) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(j11.f42932b.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j11.f0((String) it.next(), true);
                }
            }
            j11.onCleared();
            hashMap.remove(str);
        }
        HashMap<String, A0> hashMap2 = this.f42933c;
        A0 a02 = hashMap2.get(str);
        if (a02 != null) {
            a02.a();
            hashMap2.remove(str);
        }
    }

    @NonNull
    static J j0(A0 a02) {
        return (J) new z0(a02, f42930g).a(J.class);
    }

    final void d0(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        if (this.f42936f) {
            if (G.D0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap<String, ComponentCallbacksC5392m> hashMap = this.f42931a;
        if (hashMap.containsKey(componentCallbacksC5392m.mWho)) {
            return;
        }
        hashMap.put(componentCallbacksC5392m.mWho, componentCallbacksC5392m);
        if (G.D0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + componentCallbacksC5392m);
        }
    }

    final void e0(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, boolean z11) {
        if (G.D0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + componentCallbacksC5392m);
        }
        g0(componentCallbacksC5392m.mWho, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J.class == obj.getClass()) {
            J j11 = (J) obj;
            if (this.f42931a.equals(j11.f42931a) && this.f42932b.equals(j11.f42932b) && this.f42933c.equals(j11.f42933c)) {
                return true;
            }
        }
        return false;
    }

    final void f0(@NonNull String str, boolean z11) {
        if (G.D0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        g0(str, z11);
    }

    final ComponentCallbacksC5392m h0(String str) {
        return this.f42931a.get(str);
    }

    public final int hashCode() {
        return this.f42933c.hashCode() + ((this.f42932b.hashCode() + (this.f42931a.hashCode() * 31)) * 31);
    }

    @NonNull
    final J i0(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        HashMap<String, J> hashMap = this.f42932b;
        J j11 = hashMap.get(componentCallbacksC5392m.mWho);
        if (j11 != null) {
            return j11;
        }
        J j12 = new J(this.f42934d);
        hashMap.put(componentCallbacksC5392m.mWho, j12);
        return j12;
    }

    @NonNull
    final ArrayList k0() {
        return new ArrayList(this.f42931a.values());
    }

    @NonNull
    final A0 l0(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        HashMap<String, A0> hashMap = this.f42933c;
        A0 a02 = hashMap.get(componentCallbacksC5392m.mWho);
        if (a02 != null) {
            return a02;
        }
        A0 a03 = new A0();
        hashMap.put(componentCallbacksC5392m.mWho, a03);
        return a03;
    }

    final boolean m0() {
        return this.f42935e;
    }

    final void n0(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        if (this.f42936f) {
            if (G.D0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f42931a.remove(componentCallbacksC5392m.mWho) == null || !G.D0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + componentCallbacksC5392m);
        }
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        if (G.D0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f42935e = true;
    }

    final void p0(boolean z11) {
        this.f42936f = z11;
    }

    final boolean q0(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        if (this.f42931a.containsKey(componentCallbacksC5392m.mWho) && this.f42934d) {
            return this.f42935e;
        }
        return true;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<ComponentCallbacksC5392m> it = this.f42931a.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f42932b.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f42933c.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
