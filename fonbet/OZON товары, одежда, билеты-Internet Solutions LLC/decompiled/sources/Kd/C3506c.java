package Kd;

import Cd.C2742c;
import Kd.AbstractC3507d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.AbstractC7360E;
import je.K0;
import je.s0;
import je.y0;
import ke.InterfaceC7670b;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Kd.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C3506c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3507d f15882a;

    public C3506c(AbstractC3507d abstractC3507d) {
        this.f15882a = abstractC3507d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((r1 instanceof Hd.k) == true) goto L45;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        AbstractC3507d.a aVar;
        ne.g receiver;
        AbstractC3507d.a it = (AbstractC3507d.a) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        AbstractC3507d abstractC3507d = this.f15882a;
        if (abstractC3507d.k() && (receiver = it.b()) != null) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof je.N)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
            }
        }
        ne.g b11 = it.b();
        if (b11 != null) {
            Intrinsics.checkNotNullParameter(b11, "<this>");
            je.Y h11 = InterfaceC7670b.a.h(b11);
            if (h11 == null) {
                Intrinsics.checkNotNullParameter(b11, "<this>");
                AbstractC7360E g10 = InterfaceC7670b.a.g(b11);
                if (g10 == null || (h11 = InterfaceC7670b.a.M(g10)) == null) {
                    je.Y h12 = InterfaceC7670b.a.h(b11);
                    Intrinsics.f(h12);
                    h11 = h12;
                }
            }
            s0 receiver2 = InterfaceC7670b.a.V(h11);
            if (receiver2 != null) {
                Intrinsics.checkNotNullParameter(receiver2, "$receiver");
                if (!(receiver2 instanceof s0)) {
                    throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver2 + ", " + kotlin.jvm.internal.N.b(receiver2.getClass())).toString());
                }
                List<td.i0> parameters = receiver2.getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                if (parameters != null) {
                    List<td.i0> list = parameters;
                    ne.g receiver3 = it.b();
                    Intrinsics.checkNotNullParameter(receiver3, "$receiver");
                    if (!(receiver3 instanceof je.N)) {
                        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver3 + ", " + kotlin.jvm.internal.N.b(receiver3.getClass())).toString());
                    }
                    List<y0> F02 = ((je.N) receiver3).F0();
                    Iterator<T> it2 = list.iterator();
                    Iterator<T> it3 = F02.iterator();
                    ArrayList arrayList = new ArrayList(Math.min(C7714v.z(list, 10), C7714v.z(F02, 10)));
                    while (it2.hasNext() && it3.hasNext()) {
                        Object next = it2.next();
                        ne.j jVar = (ne.j) it3.next();
                        ne.l lVar = (ne.l) next;
                        if (InterfaceC7670b.a.J(jVar)) {
                            aVar = new AbstractC3507d.a(null, it.a(), lVar);
                        } else {
                            K0 o11 = InterfaceC7670b.a.o(jVar);
                            Cd.B a11 = it.a();
                            C2742c o12 = ((g0) abstractC3507d).o();
                            Intrinsics.checkNotNullParameter(o11, "<this>");
                            aVar = new AbstractC3507d.a(o11, o12.b(a11, o11.getAnnotations()), lVar);
                        }
                        arrayList.add(aVar);
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }
}
