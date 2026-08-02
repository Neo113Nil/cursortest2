package B0;

import B1.m0;
import java.util.ArrayList;
import java.util.List;
import k1.C7460f;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class a2 implements B1.V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f1659a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<List<C7460f>> f1660b;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f1661b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f1662c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList arrayList, ArrayList arrayList2) {
            super(1);
            this.f1661b = arrayList;
            this.f1662c = arrayList2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            ArrayList arrayList = this.f1661b;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Pair pair = (Pair) arrayList.get(i11);
                    aVar2.f((B1.m0) pair.a(), ((Z1.m) pair.b()).g(), 0.0f);
                }
            }
            ArrayList arrayList2 = this.f1662c;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    Pair pair2 = (Pair) arrayList2.get(i12);
                    B1.m0 m0Var = (B1.m0) pair2.a();
                    Function0 function0 = (Function0) pair2.b();
                    aVar2.f(m0Var, function0 != null ? ((Z1.m) function0.invoke()).g() : 0L, 0.0f);
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a2(@NotNull Function0<Boolean> function0, @NotNull Function0<? extends List<C7460f>> function02) {
        this.f1659a = function0;
        this.f1660b = function02;
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final B1.W mo2measure3p2s80s(@NotNull B1.Y y11, @NotNull List<? extends B1.U> list, long j11) {
        B1.W z02;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            B1.U u11 = list.get(i11);
            if (!(u11.m() instanceof e2)) {
                arrayList.add(u11);
            }
        }
        List<C7460f> invoke = this.f1660b.invoke();
        ArrayList arrayList2 = null;
        if (invoke != null) {
            ArrayList arrayList3 = new ArrayList(invoke.size());
            int size2 = invoke.size();
            for (int i12 = 0; i12 < size2; i12++) {
                C7460f c7460f = invoke.get(i12);
                Pair pair = c7460f != null ? new Pair(((B1.U) arrayList.get(i12)).a0(Z1.c.b((int) Math.floor(c7460f.u()), (int) Math.floor(c7460f.m()), 5)), Z1.m.a(Z1.n.a(Math.round(c7460f.n()), Math.round(c7460f.q())))) : null;
                if (pair != null) {
                    arrayList3.add(pair);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i13 = 0; i13 < size3; i13++) {
            B1.U u12 = list.get(i13);
            if (u12.m() instanceof e2) {
                arrayList4.add(u12);
            }
        }
        z02 = y11.z0(Z1.b.k(j11), Z1.b.j(j11), kotlin.collections.U.c(), new a(arrayList2, C2510t.e(arrayList4, this.f1659a)));
        return z02;
    }
}
