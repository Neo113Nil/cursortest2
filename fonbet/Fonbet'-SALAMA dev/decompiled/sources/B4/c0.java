package B4;

import E4.C0173f;
import E4.EnumC0172e;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k4.AbstractC1341c;
import k4.C1343e;

/* loaded from: classes2.dex */
public final class c0 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final Z f1140a;

    /* renamed from: b, reason: collision with root package name */
    public final E4.O f1141b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseFirestore f1142c;

    /* renamed from: d, reason: collision with root package name */
    public List f1143d;

    /* renamed from: e, reason: collision with root package name */
    public int f1144e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f1145f;

    public c0(Z z4, E4.O o7, FirebaseFirestore firebaseFirestore) {
        z4.getClass();
        this.f1140a = z4;
        o7.getClass();
        this.f1141b = o7;
        firebaseFirestore.getClass();
        this.f1142c = firebaseFirestore;
        this.f1145f = new f0(!o7.f2161f.f14775a.isEmpty(), o7.f2160e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f1142c.equals(c0Var.f1142c) && this.f1140a.equals(c0Var.f1140a) && this.f1141b.equals(c0Var.f1141b) && this.f1145f.equals(c0Var.f1145f);
    }

    public final int hashCode() {
        return this.f1145f.hashCode() + ((this.f1141b.hashCode() + ((this.f1140a.hashCode() + (this.f1142c.hashCode() * 31)) * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b0(this, (E3.F) this.f1141b.f2157b.f3320b.iterator());
    }

    public final List l() {
        int i7;
        int i8;
        boolean z4;
        int i9;
        H4.k kVar;
        boolean z7;
        boolean b7 = t.e.b(2, 1);
        E4.O o7 = this.f1141b;
        if (b7 && o7.f2163h) {
            throw new IllegalArgumentException("To include metadata changes with your document changes, you must also pass MetadataChanges.INCLUDE to addSnapshotListener().");
        }
        if (this.f1143d == null || this.f1144e != 1) {
            ArrayList arrayList = new ArrayList();
            boolean isEmpty = o7.f2158c.f3319a.isEmpty();
            ArrayList arrayList2 = o7.f2159d;
            FirebaseFirestore firebaseFirestore = this.f1142c;
            C1343e c1343e = o7.f2161f;
            boolean z8 = o7.f2160e;
            if (isEmpty) {
                Iterator it = arrayList2.iterator();
                H4.k kVar2 = null;
                int i10 = 0;
                while (it.hasNext()) {
                    C0173f c0173f = (C0173f) it.next();
                    H4.k kVar3 = c0173f.f2180b;
                    boolean z9 = z8;
                    Iterator it2 = it;
                    C1343e c1343e2 = c1343e;
                    a0 a0Var = new a0(firebaseFirestore, kVar3.f3323a, kVar3, z8, c1343e.f14775a.l(kVar3.f3323a));
                    p3.f.O("Invalid added event for first snapshot", c0173f.f2179a == EnumC0172e.f2175b, new Object[0]);
                    if (kVar2 != null) {
                        kVar = kVar3;
                        if (o7.f2156a.a().compare(kVar2, kVar) >= 0) {
                            z7 = false;
                            p3.f.O("Got added events in wrong order", z7, new Object[0]);
                            arrayList.add(new C0065i(a0Var, 1, -1, i10));
                            c1343e = c1343e2;
                            i10++;
                            kVar2 = kVar;
                            z8 = z9;
                            it = it2;
                        }
                    } else {
                        kVar = kVar3;
                    }
                    z7 = true;
                    p3.f.O("Got added events in wrong order", z7, new Object[0]);
                    arrayList.add(new C0065i(a0Var, 1, -1, i10));
                    c1343e = c1343e2;
                    i10++;
                    kVar2 = kVar;
                    z8 = z9;
                    it = it2;
                }
            } else {
                int i11 = 2;
                Iterator it3 = arrayList2.iterator();
                H4.i iVar = o7.f2158c;
                while (it3.hasNext()) {
                    C0173f c0173f2 = (C0173f) it3.next();
                    if (c0173f2.f2179a != EnumC0172e.f2177d) {
                        H4.k kVar4 = c0173f2.f2180b;
                        a0 a0Var2 = new a0(firebaseFirestore, kVar4.f3323a, kVar4, z8, c1343e.f14775a.l(kVar4.f3323a));
                        EnumC0172e enumC0172e = c0173f2.f2179a;
                        int ordinal = enumC0172e.ordinal();
                        if (ordinal == 0) {
                            i7 = 3;
                        } else if (ordinal == 1) {
                            i7 = 1;
                        } else {
                            if (ordinal != i11 && ordinal != 3) {
                                throw new IllegalArgumentException("Unknown view change type: " + enumC0172e);
                            }
                            i7 = i11;
                        }
                        if (i7 != 1) {
                            AbstractC1341c abstractC1341c = iVar.f3319a;
                            H4.h hVar = kVar4.f3323a;
                            H4.k kVar5 = (H4.k) abstractC1341c.m(hVar);
                            i8 = kVar5 == null ? -1 : iVar.f3320b.f14775a.C(kVar5);
                            p3.f.O("Index for document not found", i8 >= 0, new Object[0]);
                            iVar = iVar.l(hVar);
                        } else {
                            i8 = -1;
                        }
                        if (i7 != 3) {
                            iVar.getClass();
                            H4.h hVar2 = kVar4.f3323a;
                            H4.i l7 = iVar.l(hVar2);
                            AbstractC1341c D7 = l7.f3319a.D(hVar2, kVar4);
                            C1343e l8 = l7.f3320b.l(kVar4);
                            H4.i iVar2 = new H4.i(D7, l8);
                            H4.k kVar6 = (H4.k) D7.m(hVar2);
                            i9 = kVar6 == null ? -1 : l8.f14775a.C(kVar6);
                            z4 = false;
                            p3.f.O("Index for document not found", i9 >= 0, new Object[0]);
                            iVar = iVar2;
                        } else {
                            z4 = false;
                            i9 = -1;
                        }
                        arrayList.add(new C0065i(a0Var2, i7, i8, i9));
                        i11 = 2;
                    }
                }
            }
            this.f1143d = Collections.unmodifiableList(arrayList);
            this.f1144e = 1;
        }
        return this.f1143d;
    }

    public final ArrayList m() {
        E4.O o7 = this.f1141b;
        ArrayList arrayList = new ArrayList(o7.f2157b.f3319a.size());
        Iterator it = o7.f2157b.f3320b.iterator();
        while (true) {
            E3.F f7 = (E3.F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                return arrayList;
            }
            H4.k kVar = (H4.k) f7.next();
            arrayList.add(new a0(this.f1142c, kVar.f3323a, kVar, o7.f2160e, o7.f2161f.f14775a.l(kVar.f3323a)));
        }
    }
}
