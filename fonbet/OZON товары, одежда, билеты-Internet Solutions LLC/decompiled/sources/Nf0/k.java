package Nf0;

import Ae.x0;
import Nf0.h;
import Sc.s;
import bg0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.tests.NetworkClientTestsViewModel$runTests$1", f = "NetworkClientTestsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j f19548d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f19549e;

    public static final class a extends M1.b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f19550a;

        a(h.b bVar) {
            this.f19550a = bVar.f();
            bVar.g();
        }

        public final boolean t() {
            return this.f19550a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(j jVar, int i11, kotlin.coroutines.d<? super k> dVar) {
        super(2, dVar);
        this.f19548d = jVar;
        this.f19549e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k(this.f19548d, this.f19549e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        x0 x0Var4;
        x0 x0Var5;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        j jVar = this.f19548d;
        x0Var = jVar.f19545b;
        x0Var2 = jVar.f19545b;
        x0Var.setValue(h.a((h) x0Var2.getValue()));
        x0Var3 = jVar.f19545b;
        ArrayList ozonNetworkClients = C7714v.W0(((h) x0Var3.getValue()).b());
        int i11 = this.f19549e;
        h.b bVar = (h.b) ozonNetworkClients.get(i11);
        List b11 = j.d0(jVar).b(bVar.b(), new a(bVar));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : b11) {
            if (obj2 instanceof i.a) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : b11) {
            if (obj3 instanceof i.c) {
                arrayList2.add(obj3);
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            h.b bVar2 = (h.b) ozonNetworkClients.get(i11);
            K k11 = K.f71697a;
            ozonNetworkClients.set(i11, h.b.a(bVar2, true, k11, k11));
        } else {
            h.b bVar3 = (h.b) ozonNetworkClients.get(i11);
            ArrayList arrayList3 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((i.a) it.next()).a());
            }
            ArrayList arrayList4 = new ArrayList(C7714v.z(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((i.c) it2.next()).a());
            }
            ozonNetworkClients.set(i11, h.b.a(bVar3, false, arrayList3, arrayList4));
        }
        x0Var4 = jVar.f19545b;
        x0Var5 = jVar.f19545b;
        h hVar = (h) x0Var5.getValue();
        h.a.C0387a testState = h.a.C0387a.f19532a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(testState, "testState");
        Intrinsics.checkNotNullParameter(ozonNetworkClients, "ozonNetworkClients");
        x0Var4.setValue(new h(testState, ozonNetworkClients));
        return Unit.f71690a;
    }
}
