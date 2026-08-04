package G4;

import com.google.firebase.Timestamp;
import com.google.protobuf.AbstractC0867k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: G4.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0287u implements InterfaceC0290x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3025a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p075k4.e f3026b = new p075k4.e(Collections.emptyList(), C0270c.f2962c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3027c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC0867k f3028d = K4.H.f3985u;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0288v f3029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p033e3.h f3030f;

    public C0287u(C0288v c0288v) {
        this.f3029e = c0288v;
        this.f3030f = c0288v.f3033e;
    }

    @Override // G4.InterfaceC0290x
    public final void a() {
        if (this.f3025a.isEmpty()) {
            p113p3.f.O("Document leak -- detected dangling mutation references when queue is empty.", this.f3026b.f14781a.isEmpty(), new Object[0]);
        }
    }

    @Override // G4.InterfaceC0290x
    public final void b(AbstractC0867k abstractC0867k) {
        abstractC0867k.getClass();
        this.f3028d = abstractC0867k;
    }

    @Override // G4.InterfaceC0290x
    public final ArrayList c(Set set) {
        List listEmptyList = Collections.emptyList();
        H5.k kVar = L4.r.f4389a;
        p075k4.e eVar = new p075k4.e(listEmptyList, new C0269b(9));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            H4.h hVar = (H4.h) it.next();
            E3.F fM = this.f3026b.m(new C0270c(hVar, 0));
            while (((Iterator) fM.f1994b).hasNext()) {
                C0270c c0270c = (C0270c) fM.next();
                if (!hVar.equals(c0270c.f2964a)) {
                    break;
                }
                eVar = eVar.l(Integer.valueOf(c0270c.f2965b));
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = eVar.iterator();
        while (true) {
            E3.F f7 = (E3.F) it2;
            if (!((Iterator) f7.f1994b).hasNext()) {
                return arrayList;
            }
            I4.i iVarG = g(((Integer) f7.next()).intValue());
            if (iVarG != null) {
                arrayList.add(iVarG);
            }
        }
    }

    @Override // G4.InterfaceC0290x
    public final I4.i d(Timestamp timestamp, ArrayList arrayList, List list) {
        p113p3.f.O("Mutation batches should not be empty", !list.isEmpty(), new Object[0]);
        int i7 = this.f3027c;
        this.f3027c = i7 + 1;
        ArrayList arrayList2 = this.f3025a;
        int size = arrayList2.size();
        if (size > 0) {
            p113p3.f.O("Mutation batchIds must be monotonically increasing order", ((I4.i) arrayList2.get(size - 1)).f3673a < i7, new Object[0]);
        }
        I4.i iVar = new I4.i(i7, timestamp, arrayList, list);
        arrayList2.add(iVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            I4.h hVar = (I4.h) it.next();
            this.f3026b = this.f3026b.l(new C0270c(hVar.f3670a, i7));
            ((C0286t) this.f3030f.f12673a).a(hVar.f3670a.d());
        }
        return iVar;
    }

    @Override // G4.InterfaceC0290x
    public final I4.i e(int i7) {
        int iL = l(i7 + 1);
        if (iL < 0) {
            iL = 0;
        }
        ArrayList arrayList = this.f3025a;
        if (arrayList.size() > iL) {
            return (I4.i) arrayList.get(iL);
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
        int iL = l(i7);
        if (iL < 0) {
            return null;
        }
        ArrayList arrayList = this.f3025a;
        if (iL >= arrayList.size()) {
            return null;
        }
        I4.i iVar = (I4.i) arrayList.get(iL);
        p113p3.f.O("If found batch must match", iVar.f3673a == i7, new Object[0]);
        return iVar;
    }

    @Override // G4.InterfaceC0290x
    public final AbstractC0867k h() {
        return this.f3028d;
    }

    @Override // G4.InterfaceC0290x
    public final void i(I4.i iVar, AbstractC0867k abstractC0867k) {
        int i7 = iVar.f3673a;
        int iL = l(i7);
        ArrayList arrayList = this.f3025a;
        p113p3.f.O("Batches must exist to be %s", iL >= 0 && iL < arrayList.size(), "acknowledged");
        p113p3.f.O("Can only acknowledge the first batch in the mutation queue", iL == 0, new Object[0]);
        I4.i iVar2 = (I4.i) arrayList.get(iL);
        p113p3.f.O("Queue ordering failure: expected batch %d, got batch %d", i7 == iVar2.f3673a, Integer.valueOf(i7), Integer.valueOf(iVar2.f3673a));
        abstractC0867k.getClass();
        this.f3028d = abstractC0867k;
    }

    @Override // G4.InterfaceC0290x
    public final List j() {
        return Collections.unmodifiableList(this.f3025a);
    }

    @Override // G4.InterfaceC0290x
    public final void k(I4.i iVar) {
        int iL = l(iVar.f3673a);
        ArrayList arrayList = this.f3025a;
        p113p3.f.O("Batches must exist to be %s", iL >= 0 && iL < arrayList.size(), "removed");
        p113p3.f.O("Can only remove the first entry of the mutation queue", iL == 0, new Object[0]);
        arrayList.remove(0);
        p075k4.e eVarT = this.f3026b;
        Iterator it = iVar.f3676d.iterator();
        while (it.hasNext()) {
            H4.h hVar = ((I4.h) it.next()).f3670a;
            this.f3029e.f3037i.r(hVar);
            eVarT = eVarT.t(new C0270c(hVar, iVar.f3673a));
        }
        this.f3026b = eVarT;
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
