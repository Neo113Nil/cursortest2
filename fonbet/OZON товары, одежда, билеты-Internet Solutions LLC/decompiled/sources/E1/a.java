package E1;

import I1.C3223b;
import I1.C3224c;
import I1.l;
import I1.m;
import I1.r;
import I1.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k1.C7459e;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import y2.q;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: E1.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    static final class C0160a extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0160a f7338b = new C0160a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    private static final boolean a(ArrayList arrayList) {
        Collection collection;
        long n11;
        if (arrayList.size() >= 2) {
            if (arrayList.size() == 0 || arrayList.size() == 1) {
                collection = K.f71697a;
            } else {
                collection = new ArrayList();
                Object obj = arrayList.get(0);
                int P11 = C7714v.P(arrayList);
                int i11 = 0;
                while (i11 < P11) {
                    i11++;
                    Object obj2 = arrayList.get(i11);
                    r rVar = (r) obj2;
                    r rVar2 = (r) obj;
                    collection.add(C7459e.a(P9.a.a(Math.abs(C7459e.g(rVar2.g().l()) - C7459e.g(rVar.g().l())), Math.abs(C7459e.h(rVar2.g().l()) - C7459e.h(rVar.g().l())))));
                    obj = obj2;
                }
            }
            if (collection.size() == 1) {
                n11 = ((C7459e) C7714v.K(collection)).n();
            } else {
                if (collection.isEmpty()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object K11 = C7714v.K(collection);
                int P12 = C7714v.P(collection);
                if (1 <= P12) {
                    int i12 = 1;
                    while (true) {
                        K11 = C7459e.a(C7459e.k(((C7459e) K11).n(), ((C7459e) collection.get(i12)).n()));
                        if (i12 == P12) {
                            break;
                        }
                        i12++;
                    }
                }
                n11 = ((C7459e) K11).n();
            }
            if (C7459e.h(n11) >= C7459e.g(n11)) {
                return false;
            }
        }
        return true;
    }

    public static final void b(@NotNull q qVar, @NotNull r rVar) {
        l k11 = rVar.k();
        int i11 = u.f11751H;
        C3223b c3223b = (C3223b) m.a(k11, u.a());
        if (c3223b != null) {
            qVar.M(q.e.a(c3223b.b(), c3223b.a(), 0, false));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (m.a(rVar.k(), u.x()) != null) {
            List j11 = r.j(rVar, 4);
            int size = j11.size();
            for (int i12 = 0; i12 < size; i12++) {
                r rVar2 = (r) j11.get(i12);
                l k12 = rVar2.k();
                int i13 = u.f11751H;
                if (k12.e(u.y())) {
                    arrayList.add(rVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean a11 = a(arrayList);
        qVar.M(q.e.a(a11 ? 1 : arrayList.size(), a11 ? arrayList.size() : 1, 0, false));
    }

    public static final void c(@NotNull q qVar, @NotNull r rVar) {
        l k11 = rVar.k();
        int i11 = u.f11751H;
        if (((C3224c) m.a(k11, u.b())) != null) {
            qVar.N(q.f.f(0, 0, 0, 0, false, ((Boolean) rVar.k().l(u.y(), b.f7339b)).booleanValue()));
        }
        r o11 = rVar.o();
        if (o11 == null || m.a(o11.k(), u.x()) == null) {
            return;
        }
        C3223b c3223b = (C3223b) m.a(o11.k(), u.a());
        if ((c3223b == null || (c3223b.b() >= 0 && c3223b.a() >= 0)) && rVar.k().e(u.y())) {
            ArrayList arrayList = new ArrayList();
            List j11 = r.j(o11, 4);
            int size = j11.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                r rVar2 = (r) j11.get(i13);
                l k12 = rVar2.k();
                int i14 = u.f11751H;
                if (k12.e(u.y())) {
                    arrayList.add(rVar2);
                    if (rVar2.n().h0() < rVar.n().h0()) {
                        i12++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean a11 = a(arrayList);
            int i15 = a11 ? 0 : i12;
            int i16 = a11 ? i12 : 0;
            l k13 = rVar.k();
            int i17 = u.f11751H;
            qVar.N(q.f.f(i15, 1, i16, 1, false, ((Boolean) k13.l(u.y(), C0160a.f7338b)).booleanValue()));
        }
    }
}
