package c;

import android.util.Log;
import d2.C0279i;
import e2.AbstractC0292g;
import e2.C0289d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.k implements o2.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2518e;
    public final /* synthetic */ R0.n f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(R0.n nVar, int i3) {
        super(1);
        this.f2518e = i3;
        this.f = nVar;
    }

    @Override // o2.l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f2518e) {
            case 0:
                kotlin.jvm.internal.j.e((b) obj, "backEvent");
                R0.n nVar = this.f;
                C0289d c0289d = (C0289d) nVar.f1224c;
                ListIterator listIterator = c0289d.listIterator(c0289d.b());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((P.h) obj2).f1100a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                P.h hVar = (P.h) obj2;
                nVar.f1225d = hVar;
                if (hVar == null) {
                    return C0279i.f4852a;
                }
                boolean j3 = P.k.j(3);
                P.k kVar = hVar.f1101b;
                if (j3) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + kVar);
                }
                kVar.getClass();
                HashSet hashSet = new HashSet();
                a1.e eVar = kVar.f1103b;
                eVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (P.l lVar : ((HashMap) eVar.f1789c).values()) {
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((P.l) it.next()).getClass();
                    throw null;
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    P.b bVar = (P.b) it2.next();
                    bVar.getClass();
                    if (P.k.j(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
                    }
                    boolean isAttachedToWindow = bVar.f1077a.isAttachedToWindow();
                    synchronized (bVar.f1078b) {
                        try {
                            Iterator it3 = bVar.f1078b.iterator();
                            while (it3.hasNext()) {
                                ((P.p) it3.next()).getClass();
                            }
                            bVar.a(bVar.f1078b);
                            Iterator it4 = AbstractC0292g.g0(bVar.f1079c).iterator();
                            while (it4.hasNext()) {
                                P.p pVar = (P.p) it4.next();
                                if (P.k.j(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + bVar.f1077a + " is not attached to window. ") + "Cancelling running operation " + pVar);
                                }
                                pVar.a(bVar.f1077a);
                            }
                            Iterator it5 = AbstractC0292g.g0(bVar.f1078b).iterator();
                            while (it5.hasNext()) {
                                P.p pVar2 = (P.p) it5.next();
                                if (P.k.j(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + bVar.f1077a + " is not attached to window. ") + "Cancelling pending operation " + pVar2);
                                }
                                pVar2.a(bVar.f1077a);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            default:
                b backEvent = (b) obj;
                kotlin.jvm.internal.j.e(backEvent, "backEvent");
                R0.n nVar2 = this.f;
                P.h hVar2 = (P.h) nVar2.f1225d;
                if (hVar2 == null) {
                    C0289d c0289d2 = (C0289d) nVar2.f1224c;
                    ListIterator listIterator2 = c0289d2.listIterator(c0289d2.b());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((P.h) obj3).f1100a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    hVar2 = (P.h) obj3;
                }
                if (hVar2 != null) {
                    boolean j4 = P.k.j(2);
                    P.k kVar2 = hVar2.f1101b;
                    if (j4) {
                        Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + kVar2);
                    }
                    if (kVar2.f1105d != null) {
                        ArrayList arrayList2 = new ArrayList(Collections.singletonList(kVar2.f1105d));
                        HashSet hashSet2 = new HashSet();
                        Iterator it6 = ((P.a) arrayList2.get(0)).f1073a.iterator();
                        while (it6.hasNext()) {
                            P.f fVar = ((P.m) it6.next()).f1110b;
                        }
                        Iterator it7 = hashSet2.iterator();
                        while (it7.hasNext()) {
                            P.b bVar2 = (P.b) it7.next();
                            bVar2.getClass();
                            if (P.k.j(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.f2481c);
                            }
                            ArrayList arrayList3 = bVar2.f1079c;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it8 = arrayList3.iterator();
                            while (it8.hasNext()) {
                                ((P.p) it8.next()).getClass();
                                e2.m.V(arrayList4, null);
                            }
                            List f0 = AbstractC0292g.f0(AbstractC0292g.h0(arrayList4));
                            int size = f0.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                ((P.o) f0.get(i3)).a(backEvent, bVar2.f1077a);
                            }
                        }
                        Iterator it9 = kVar2.f.iterator();
                        if (it9.hasNext()) {
                            it9.next().getClass();
                            throw new ClassCastException();
                        }
                    }
                }
                return C0279i.f4852a;
        }
    }
}
