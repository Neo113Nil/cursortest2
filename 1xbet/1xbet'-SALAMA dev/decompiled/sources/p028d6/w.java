package p028d6;

import D3.j;
import U5.J;
import U5.L;
import W5.C0539s1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f12488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12489c;

    public w(ArrayList arrayList, AtomicInteger atomicInteger) {
        f.d("empty list", !arrayList.isEmpty());
        this.f12487a = arrayList;
        f.k(atomicInteger, "index");
        this.f12488b = atomicInteger;
        Iterator it = arrayList.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((L) it.next()).hashCode();
        }
        this.f12489c = iHashCode;
    }

    @Override // U5.L
    public final J a(C0539s1 c0539s1) {
        int andIncrement = this.f12488b.getAndIncrement() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        ArrayList arrayList = this.f12487a;
        return ((L) arrayList.get(andIncrement % arrayList.size())).a(c0539s1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (wVar == this) {
            return true;
        }
        if (this.f12489c != wVar.f12489c || this.f12488b != wVar.f12488b) {
            return false;
        }
        ArrayList arrayList = this.f12487a;
        int size = arrayList.size();
        ArrayList arrayList2 = wVar.f12487a;
        return size == arrayList2.size() && new HashSet(arrayList).containsAll(arrayList2);
    }

    public final int hashCode() {
        return this.f12489c;
    }

    public final String toString() {
        j jVar = new j(w.class.getSimpleName());
        jVar.a(this.f12487a, "subchannelPickers");
        return jVar.toString();
    }
}
