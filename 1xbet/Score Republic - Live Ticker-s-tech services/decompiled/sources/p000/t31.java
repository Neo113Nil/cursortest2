package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class t31 extends kj0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f7270a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f7271b;

    /* JADX INFO: renamed from: c */
    public final int f7272c;

    public t31(ArrayList arrayList, AtomicInteger atomicInteger) {
        a90.m122f("empty list", !arrayList.isEmpty());
        this.f7270a = arrayList;
        a90.m127k(atomicInteger, "index");
        this.f7271b = atomicInteger;
        int size = arrayList.size();
        int iHashCode = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            iHashCode += ((kj0) obj).hashCode();
        }
        this.f7272c = iHashCode;
    }

    @Override // p000.kj0
    /* JADX INFO: renamed from: a */
    public final ij0 mo1140a(yv0 yv0Var) {
        int andIncrement = this.f7271b.getAndIncrement() & Integer.MAX_VALUE;
        ArrayList arrayList = this.f7270a;
        return ((kj0) arrayList.get(andIncrement % arrayList.size())).mo1140a(yv0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t31)) {
            return false;
        }
        t31 t31Var = (t31) obj;
        ArrayList arrayList = t31Var.f7270a;
        if (t31Var == this) {
            return true;
        }
        if (this.f7272c != t31Var.f7272c || this.f7271b != t31Var.f7271b) {
            return false;
        }
        ArrayList arrayList2 = this.f7270a;
        return arrayList2.size() == arrayList.size() && new HashSet(arrayList2).containsAll(arrayList);
    }

    public final int hashCode() {
        return this.f7272c;
    }

    public final String toString() {
        C0809vn c0809vn = new C0809vn(t31.class.getSimpleName());
        c0809vn.m5172c(this.f7270a, "subchannelPickers");
        return c0809vn.toString();
    }
}
