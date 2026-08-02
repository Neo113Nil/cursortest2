package G4;

import com.google.firebase.Timestamp;
import com.google.protobuf.AbstractC0911k;
import e3.C1023h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k4.C1343e;

/* renamed from: G4.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0287u implements InterfaceC0290x {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3025a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public C1343e f3026b = new C1343e(Collections.emptyList(), C0270c.f2962c);

    /* renamed from: c, reason: collision with root package name */
    public int f3027c = 1;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0911k f3028d = K4.H.f3985u;

    /* renamed from: e, reason: collision with root package name */
    public final C0288v f3029e;

    /* renamed from: f, reason: collision with root package name */
    public final C1023h f3030f;

    public C0287u(C0288v c0288v) {
        this.f3029e = c0288v;
        this.f3030f = c0288v.f3033e;
    }

    @Override // G4.InterfaceC0290x
    public final void a() {
        if (this.f3025a.isEmpty()) {
            p3.f.O("Document leak -- detected dangling mutation references when queue is empty.", this.f3026b.f14775a.isEmpty(), new Object[0]);
        }
    }

    @Override // G4.InterfaceC0290x
    public final void b(AbstractC0911k abstractC0911k) {
        abstractC0911k.getClass();
        this.f3028d = abstractC0911k;
    }

    @Override // G4.InterfaceC0290x
    public final ArrayList c(Set set) {
        List emptyList = Collections.emptyList();
        H5.k kVar = L4.r.f4389a;
        C1343e c1343e = new C1343e(emptyList, new C0269b(9));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            H4.h hVar = (H4.h) it.next();
            E3.F m7 = this.f3026b.m(new C0270c(hVar, 0));
            while (((Iterator) m7.f1994b).hasNext()) {
                C0270c c0270c = (C0270c) m7.next();
                if (!hVar.equals(c0270c.f2964a)) {
                    break;
                }
                c1343e = c1343e.l(Integer.valueOf(c0270c.f2965b));
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = c1343e.iterator();
        while (true) {
            E3.F f7 = (E3.F) it2;
            if (!((Iterator) f7.f1994b).hasNext()) {
                return arrayList;
            }
            I4.i g3 = g(((Integer) f7.next()).intValue());
            if (g3 != null) {
                arrayList.add(g3);
            }
        }
    }

    @Override // G4.InterfaceC0290x
    public final I4.i d(Timestamp timestamp, ArrayList arrayList, List list) {
        p3.f.O("Mutation batches should not be empty", !list.isEmpty(), new Object[0]);
        int i7 = this.f3027c;
        this.f3027c = i7 + 1;
        ArrayList arrayList2 = this.f3025a;
        int size = arrayList2.size();
        if (size > 0) {
            p3.f.O("Mutation batchIds must be monotonically increasing order", ((I4.i) arrayList2.get(size - 1)).f3673a < i7, new Object[0]);
        }
        I4.i iVar = new I4.i(i7, timestamp, arrayList, list);
        arrayList2.add(iVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            I4.h hVar = (I4.h) it.next();
            this.f3026b = this.f3026b.l(new C0270c(hVar.f3670a, i7));
            ((C0286t) this.f3030f.f12667a).a(hVar.f3670a.d());
        }
        return iVar;
    }

    @Override // G4.InterfaceC0290x
    public final I4.i e(int i7) {
        int l7 = l(i7 + 1);
        if (l7 < 0) {
            l7 = 0;
        }
        ArrayList arrayList = this.f3025a;
        if (arrayList.size() > l7) {
            return (I4.i) arrayList.get(l7);
        }
        return null;
    }

    @Override // G4.InterfaceC0290x
    public final int f() {
        if (this.f3025a.isEmpty()) {
            return -1;
        }
        return this.f3027c - 1;
    }

    @Override // G4.InterfaceC0290x
    public final I4.i g(int i7) {
        int l7 = l(i7);
        if (l7 < 0) {
            return null;
        }
        ArrayList arrayList = this.f3025a;
        if (l7 >= arrayList.size()) {
            return null;
        }
        I4.i iVar = (I4.i) arrayList.get(l7);
        p3.f.O("If found batch must match", iVar.f3673a == i7, new Object[0]);
        return iVar;
    }

    @Override // G4.InterfaceC0290x
    public final AbstractC0911k h() {
        return this.f3028d;
    }

    @Override // G4.InterfaceC0290x
    public final void i(I4.i iVar, AbstractC0911k abstractC0911k) {
        int i7 = iVar.f3673a;
        int l7 = l(i7);
        ArrayList arrayList = this.f3025a;
        p3.f.O("Batches must exist to be %s", l7 >= 0 && l7 < arrayList.size(), "acknowledged");
        p3.f.O("Can only acknowledge the first batch in the mutation queue", l7 == 0, new Object[0]);
        I4.i iVar2 = (I4.i) arrayList.get(l7);
        p3.f.O("Queue ordering failure: expected batch %d, got batch %d", i7 == iVar2.f3673a, Integer.valueOf(i7), Integer.valueOf(iVar2.f3673a));
        abstractC0911k.getClass();
        this.f3028d = abstractC0911k;
    }

    @Override // G4.InterfaceC0290x
    public final List j() {
        return Collections.unmodifiableList(this.f3025a);
    }

    @Override // G4.InterfaceC0290x
    public final void k(I4.i iVar) {
        int l7 = l(iVar.f3673a);
        ArrayList arrayList = this.f3025a;
        p3.f.O("Batches must exist to be %s", l7 >= 0 && l7 < arrayList.size(), "removed");
        p3.f.O("Can only remove the first entry of the mutation queue", l7 == 0, new Object[0]);
        arrayList.remove(0);
        C1343e c1343e = this.f3026b;
        Iterator it = iVar.f3676d.iterator();
        while (it.hasNext()) {
            H4.h hVar = ((I4.h) it.next()).f3670a;
            this.f3029e.f3037i.r(hVar);
            c1343e = c1343e.t(new C0270c(hVar, iVar.f3673a));
        }
        this.f3026b = c1343e;
    }

    public final int l(int i7) {
        ArrayList arrayList = this.f3025a;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return i7 - ((I4.i) arrayList.get(0)).f3673a;
    }

    @Override // G4.InterfaceC0290x
    public final void start() {
        if (this.f3025a.isEmpty()) {
            this.f3027c = 1;
        }
    }
}
