package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5380a extends Q implements G.k, G.q {

    /* renamed from: r, reason: collision with root package name */
    final G f43013r;

    /* renamed from: s, reason: collision with root package name */
    boolean f43014s;

    /* renamed from: t, reason: collision with root package name */
    int f43015t;

    /* renamed from: u, reason: collision with root package name */
    boolean f43016u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5380a(@NonNull G g10) {
        super(0);
        g10.p0();
        if (g10.s0() != null) {
            g10.s0().e().getClassLoader();
        }
        this.f43015t = -1;
        this.f43016u = false;
        this.f43013r = g10;
    }

    final void A() {
        ArrayList<Q.a> arrayList = this.f42963a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            Q.a aVar = arrayList.get(size);
            if (aVar.f42982c) {
                if (aVar.f42980a == 8) {
                    aVar.f42982c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i11 = aVar.f42981b.mContainerId;
                    aVar.f42980a = 2;
                    aVar.f42982c = false;
                    for (int i12 = size - 1; i12 >= 0; i12--) {
                        Q.a aVar2 = arrayList.get(i12);
                        if (aVar2.f42982c && aVar2.f42981b.mContainerId == i11) {
                            arrayList.remove(i12);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    final int B(boolean z11, boolean z12) {
        if (this.f43014s) {
            throw new IllegalStateException("commit already called");
        }
        if (G.D0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new c0());
            C("  ", printWriter, true);
            printWriter.close();
        }
        this.f43014s = true;
        boolean z13 = this.f42969g;
        G g10 = this.f43013r;
        if (z13) {
            this.f43015t = g10.m();
        } else {
            this.f43015t = -1;
        }
        if (z12) {
            g10.X(this, z11);
        }
        return this.f43015t;
    }

    public final void C(String str, PrintWriter printWriter, boolean z11) {
        String str2;
        if (z11) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f42971i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f43015t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f43014s);
            if (this.f42968f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f42968f));
            }
            if (this.f42964b != 0 || this.f42965c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f42964b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f42965c));
            }
            if (this.f42966d != 0 || this.f42967e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f42966d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f42967e));
            }
            if (this.f42972j != 0 || this.f42973k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f42972j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f42973k);
            }
            if (this.f42974l != 0 || this.f42975m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f42974l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f42975m);
            }
        }
        ArrayList<Q.a> arrayList = this.f42963a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Q.a aVar = arrayList.get(i11);
            switch (aVar.f42980a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f42980a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i11);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f42981b);
            if (z11) {
                if (aVar.f42983d != 0 || aVar.f42984e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f42983d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f42984e));
                }
                if (aVar.f42985f != 0 || aVar.f42986g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f42985f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f42986g));
                }
            }
        }
    }

    @Override // androidx.fragment.app.G.q
    public final boolean a(@NonNull ArrayList<C5380a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (G.D0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f42969g) {
            return true;
        }
        this.f43013r.f42873d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.G.k
    public final int getId() {
        return this.f43015t;
    }

    @Override // androidx.fragment.app.G.k
    public final String getName() {
        return this.f42971i;
    }

    @Override // androidx.fragment.app.Q
    public final int i() {
        return B(false, true);
    }

    @Override // androidx.fragment.app.Q
    public final int j() {
        return B(true, true);
    }

    @Override // androidx.fragment.app.Q
    public final void k() {
        if (this.f42969g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f42970h = false;
        this.f43013r.a0(this, false);
    }

    @Override // androidx.fragment.app.Q
    public final void l() {
        if (this.f42969g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f42970h = false;
        this.f43013r.a0(this, true);
    }

    @Override // androidx.fragment.app.Q
    @NonNull
    public final void m(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        G g10 = componentCallbacksC5392m.mFragmentManager;
        if (g10 == null || g10 == this.f43013r) {
            super.m(componentCallbacksC5392m);
            return;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC5392m.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.Q
    final void n(int i11, ComponentCallbacksC5392m componentCallbacksC5392m, String str, int i12) {
        super.n(i11, componentCallbacksC5392m, str, i12);
        componentCallbacksC5392m.mFragmentManager = this.f43013r;
    }

    @Override // androidx.fragment.app.Q
    @NonNull
    public final void o(@NonNull ComposerFragment composerFragment) {
        G g10 = composerFragment.mFragmentManager;
        if (g10 == null || g10 == this.f43013r) {
            super.o(composerFragment);
            return;
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + composerFragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.Q
    public final boolean p() {
        return this.f42963a.isEmpty();
    }

    @Override // androidx.fragment.app.Q
    @NonNull
    public final void q(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        G g10 = componentCallbacksC5392m.mFragmentManager;
        if (g10 == null || g10 == this.f43013r) {
            super.q(componentCallbacksC5392m);
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC5392m.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f43015t >= 0) {
            sb2.append(" #");
            sb2.append(this.f43015t);
        }
        if (this.f42971i != null) {
            sb2.append(" ");
            sb2.append(this.f42971i);
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.fragment.app.Q
    @NonNull
    public final void u(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m, @NonNull AbstractC5434v.b bVar) {
        G g10 = componentCallbacksC5392m.mFragmentManager;
        G g11 = this.f43013r;
        if (g10 != g11) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + g11);
        }
        if (bVar == AbstractC5434v.b.INITIALIZED && componentCallbacksC5392m.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != AbstractC5434v.b.DESTROYED) {
            super.u(componentCallbacksC5392m, bVar);
            return;
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.Q
    @NonNull
    public final void v(ComponentCallbacksC5392m componentCallbacksC5392m) {
        G g10;
        if (componentCallbacksC5392m == null || (g10 = componentCallbacksC5392m.mFragmentManager) == null || g10 == this.f43013r) {
            super.v(componentCallbacksC5392m);
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC5392m.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.Q
    @NonNull
    public final void y(@NonNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        G g10 = componentCallbacksC5392m.mFragmentManager;
        if (g10 == null || g10 == this.f43013r) {
            super.y(componentCallbacksC5392m);
            return;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC5392m.toString() + " is already attached to a FragmentManager.");
    }

    final void z(int i11) {
        if (this.f42969g) {
            if (G.D0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i11);
            }
            ArrayList<Q.a> arrayList = this.f42963a;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                Q.a aVar = arrayList.get(i12);
                ComponentCallbacksC5392m componentCallbacksC5392m = aVar.f42981b;
                if (componentCallbacksC5392m != null) {
                    componentCallbacksC5392m.mBackStackNesting += i11;
                    if (G.D0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f42981b + " to " + aVar.f42981b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5380a(@NonNull C5380a c5380a) {
        super(0);
        c5380a.f43013r.p0();
        if (c5380a.f43013r.s0() != null) {
            c5380a.f43013r.s0().e().getClassLoader();
        }
        Iterator<Q.a> it = c5380a.f42963a.iterator();
        while (it.hasNext()) {
            Q.a next = it.next();
            ArrayList<Q.a> arrayList = this.f42963a;
            Q.a aVar = new Q.a();
            aVar.f42980a = next.f42980a;
            aVar.f42981b = next.f42981b;
            aVar.f42982c = next.f42982c;
            aVar.f42983d = next.f42983d;
            aVar.f42984e = next.f42984e;
            aVar.f42985f = next.f42985f;
            aVar.f42986g = next.f42986g;
            aVar.f42987h = next.f42987h;
            aVar.f42988i = next.f42988i;
            arrayList.add(aVar);
        }
        this.f42964b = c5380a.f42964b;
        this.f42965c = c5380a.f42965c;
        this.f42966d = c5380a.f42966d;
        this.f42967e = c5380a.f42967e;
        this.f42968f = c5380a.f42968f;
        this.f42969g = c5380a.f42969g;
        this.f42970h = c5380a.f42970h;
        this.f42971i = c5380a.f42971i;
        this.f42974l = c5380a.f42974l;
        this.f42975m = c5380a.f42975m;
        this.f42972j = c5380a.f42972j;
        this.f42973k = c5380a.f42973k;
        if (c5380a.f42976n != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f42976n = arrayList2;
            arrayList2.addAll(c5380a.f42976n);
        }
        if (c5380a.f42977o != null) {
            ArrayList<String> arrayList3 = new ArrayList<>();
            this.f42977o = arrayList3;
            arrayList3.addAll(c5380a.f42977o);
        }
        this.f42978p = c5380a.f42978p;
        this.f43015t = -1;
        this.f43016u = false;
        this.f43013r = c5380a.f43013r;
        this.f43014s = c5380a.f43014s;
        this.f43015t = c5380a.f43015t;
        this.f43016u = c5380a.f43016u;
    }
}
