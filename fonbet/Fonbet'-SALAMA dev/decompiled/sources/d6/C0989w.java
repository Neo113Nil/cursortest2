package d6;

import U5.J;
import U5.L;
import W5.C0539s1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: d6.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0989w extends L {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12481a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f12482b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12483c;

    public C0989w(ArrayList arrayList, AtomicInteger atomicInteger) {
        p3.f.d("empty list", !arrayList.isEmpty());
        this.f12481a = arrayList;
        p3.f.k(atomicInteger, "index");
        this.f12482b = atomicInteger;
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((L) it.next()).hashCode();
        }
        this.f12483c = i7;
    }

    @Override // U5.L
    public final J a(C0539s1 c0539s1) {
        int andIncrement = this.f12482b.getAndIncrement() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        ArrayList arrayList = this.f12481a;
        return ((L) arrayList.get(andIncrement % arrayList.size())).a(c0539s1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0989w)) {
            return false;
        }
        C0989w c0989w = (C0989w) obj;
        if (c0989w == this) {
            return true;
        }
        if (this.f12483c != c0989w.f12483c || this.f12482b != c0989w.f12482b) {
            return false;
        }
        ArrayList arrayList = this.f12481a;
        int size = arrayList.size();
        ArrayList arrayList2 = c0989w.f12481a;
        return size == arrayList2.size() && new HashSet(arrayList).containsAll(arrayList2);
    }

    public final int hashCode() {
        return this.f12483c;
    }

    public final String toString() {
        D3.j jVar = new D3.j(C0989w.class.getSimpleName());
        jVar.a(this.f12481a, "subchannelPickers");
        return jVar.toString();
    }
}
