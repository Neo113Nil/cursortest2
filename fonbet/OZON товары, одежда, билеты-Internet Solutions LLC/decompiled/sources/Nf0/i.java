package Nf0;

import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.x0;
import Cf0.J;
import Nf0.h;
import Sc.C4005g;
import Sc.s;
import We.E;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import pf0.m;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.tests.NetworkClientTestsViewModel$initialState$1", f = "NetworkClientTestsViewModel.kt", l = {DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f19541d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ j f19542e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f19543a;

        a(j jVar) {
            this.f19543a = jVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            x0 x0Var;
            x0Var = this.f19543a.f19545b;
            List<bg0.c> list = (List) obj;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (bg0.c cVar : list) {
                E a11 = cVar.a();
                boolean t2 = cVar.b().t();
                boolean u11 = cVar.b().u();
                String c11 = cVar.c();
                K k11 = K.f71697a;
                arrayList.add(new h.b(a11, c11, t2, u11, false, k11, k11));
            }
            x0Var.setValue(new h(1, arrayList));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, kotlin.coroutines.d<? super i> dVar) {
        super(2, dVar);
        this.f19542e = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new i(this.f19542e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f19541d;
        if (i11 == 0) {
            s.b(obj);
            J j11 = m.f80514a;
            if (j11 == null) {
                throw new RuntimeException("NetworkDi must be initialized.");
            }
            M0<List<bg0.c>> a11 = j11.n().a();
            a aVar2 = new a(this.f19542e);
            this.f19541d = 1;
            if (a11.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }
}
