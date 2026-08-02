package J0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import t0.C9717f;
import t0.C9718g;
import t0.s;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1", f = "FloatingActionButton.kt", l = {293}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class G extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12777d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f12778e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ t0.q f12779f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ G0 f12780g;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f12781a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ xe.M f12782b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G0 f12783c;

        a(ArrayList arrayList, xe.M m11, G0 g02) {
            this.f12781a = arrayList;
            this.f12782b = m11;
            this.f12783c = g02;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            t0.n nVar = (t0.n) obj;
            boolean z11 = nVar instanceof t0.j;
            ArrayList arrayList = this.f12781a;
            if (z11) {
                arrayList.add(nVar);
            } else if (nVar instanceof t0.k) {
                arrayList.remove(((t0.k) nVar).a());
            } else if (nVar instanceof C9717f) {
                arrayList.add(nVar);
            } else if (nVar instanceof C9718g) {
                arrayList.remove(((C9718g) nVar).a());
            } else if (nVar instanceof s.b) {
                arrayList.add(nVar);
            } else if (nVar instanceof s.c) {
                arrayList.remove(((s.c) nVar).a());
            } else if (nVar instanceof s.a) {
                arrayList.remove(((s.a) nVar).a());
            }
            C10727i.c(this.f12782b, null, null, new F(this.f12783c, (t0.n) C7714v.Z(arrayList), null), 3);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(t0.q qVar, G0 g02, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f12779f = qVar;
        this.f12780g = g02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        G g10 = new G(this.f12779f, this.f12780g, dVar);
        g10.f12778e = obj;
        return g10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((G) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12777d;
        if (i11 == 0) {
            Sc.s.b(obj);
            xe.M m11 = (xe.M) this.f12778e;
            ArrayList arrayList = new ArrayList();
            InterfaceC2395h<t0.n> interactions = this.f12779f.getInteractions();
            a aVar2 = new a(arrayList, m11, this.f12780g);
            this.f12777d = 1;
            if (interactions.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
