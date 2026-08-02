package G4;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import k4.C1343e;
import w1.V0;

/* renamed from: G4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0276i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0279l f2980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2981c;

    public /* synthetic */ RunnableC0276i(C0279l c0279l, ArrayList arrayList, int i7) {
        this.f2979a = i7;
        this.f2980b = c0279l;
        this.f2981c = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f2981c;
        final int i7 = 1;
        final int i8 = 0;
        C0279l c0279l = this.f2980b;
        switch (this.f2979a) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0280m c0280m = (C0280m) it.next();
                    int i9 = c0280m.f3003a;
                    C1343e c1343e = c0280m.f3005c;
                    V0 v02 = c0279l.f2998h;
                    v02.getClass();
                    Iterator it2 = c1343e.iterator();
                    while (true) {
                        E3.F f7 = (E3.F) it2;
                        if (((Iterator) f7.f1994b).hasNext()) {
                            C0270c c0270c = new C0270c((H4.h) f7.next(), i9);
                            v02.f17562b = ((C1343e) v02.f17562b).l(c0270c);
                            v02.f17563c = ((C1343e) v02.f17563c).l(c0270c);
                        } else {
                            C1343e c1343e2 = c0280m.f3006d;
                            Iterator it3 = c1343e2.iterator();
                            while (true) {
                                E3.F f8 = (E3.F) it3;
                                if (((Iterator) f8.f1994b).hasNext()) {
                                    c0279l.f2991a.r().q((H4.h) f8.next());
                                } else {
                                    Iterator it4 = c1343e2.iterator();
                                    while (true) {
                                        E3.F f9 = (E3.F) it4;
                                        if (((Iterator) f9.f1994b).hasNext()) {
                                            C0270c c0270c2 = new C0270c((H4.h) f9.next(), i9);
                                            v02.f17562b = ((C1343e) v02.f17562b).t(c0270c2);
                                            v02.f17563c = ((C1343e) v02.f17563c).t(c0270c2);
                                        } else {
                                            if (!c0280m.f3004b) {
                                                SparseArray sparseArray = c0279l.f3000k;
                                                Z z4 = (Z) sparseArray.get(i9);
                                                p3.f.O("Can't set limbo-free snapshot version for unknown target: %s", z4 != null ? i7 : 0, Integer.valueOf(i9));
                                                H4.n nVar = z4.f2957e;
                                                Z z7 = new Z(z4.f2953a, z4.f2954b, z4.f2955c, z4.f2956d, nVar, nVar, z4.f2959g, z4.f2960h);
                                                sparseArray.put(i9, z7);
                                                if (C0279l.e(z4, z7, null)) {
                                                    c0279l.f2999i.c(z7);
                                                }
                                            }
                                            i7 = 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            default:
                Collection x4 = c0279l.f2992b.x();
                C0269b c0269b = H4.a.f3298f;
                final InterfaceC0273f interfaceC0273f = c0279l.f2992b;
                Objects.requireNonNull(interfaceC0273f);
                L4.h hVar = new L4.h() { // from class: G4.j
                    @Override // L4.h
                    public final void accept(Object obj) {
                        switch (i8) {
                            case 0:
                                interfaceC0273f.H((H4.a) obj);
                                break;
                            default:
                                interfaceC0273f.g((H4.a) obj);
                                break;
                        }
                    }
                };
                final InterfaceC0273f interfaceC0273f2 = c0279l.f2992b;
                Objects.requireNonNull(interfaceC0273f2);
                L4.h hVar2 = new L4.h() { // from class: G4.j
                    @Override // L4.h
                    public final void accept(Object obj) {
                        switch (i7) {
                            case 0:
                                interfaceC0273f2.H((H4.a) obj);
                                break;
                            default:
                                interfaceC0273f2.g((H4.a) obj);
                                break;
                        }
                    }
                };
                H5.k kVar = L4.r.f4389a;
                ArrayList arrayList2 = new ArrayList(x4);
                Collections.sort(arrayList2, c0269b);
                ArrayList arrayList3 = new ArrayList(arrayList);
                Collections.sort(arrayList3, c0269b);
                L4.r.f(arrayList2.iterator(), arrayList3.iterator(), c0269b, hVar, hVar2);
                break;
        }
    }
}
