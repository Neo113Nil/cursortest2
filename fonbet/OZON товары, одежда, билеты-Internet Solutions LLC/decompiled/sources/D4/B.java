package D4;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import B4.C2581j;
import S0.InterfaceC3970l0;
import S0.InterfaceC3978p0;
import androidx.activity.C5035b;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@kotlin.coroutines.jvm.internal.e(c = "androidx.navigation.compose.NavHostKt$NavHost$25$1", f = "NavHost.kt", l = {521}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class B extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2395h<C5035b>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f5790d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f5791e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2830e f5792f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC3970l0 f5793g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f5794h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f5795i;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<Boolean> f5796a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3970l0 f5797b;

        a(InterfaceC3978p0<Boolean> interfaceC3978p0, InterfaceC3970l0 interfaceC3970l0) {
            this.f5796a = interfaceC3978p0;
            this.f5797b = interfaceC3970l0;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            this.f5796a.setValue(Boolean.TRUE);
            this.f5797b.h(((C5035b) obj).a());
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(C2830e c2830e, InterfaceC3970l0 interfaceC3970l0, InterfaceC3978p0 interfaceC3978p0, InterfaceC3978p0 interfaceC3978p02, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f5792f = c2830e;
        this.f5793g = interfaceC3970l0;
        this.f5794h = interfaceC3978p0;
        this.f5795i = interfaceC3978p02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        B b11 = new B(this.f5792f, this.f5793g, this.f5794h, this.f5795i, dVar);
        b11.f5791e = obj;
        return b11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2395h<C5035b> interfaceC2395h, kotlin.coroutines.d<? super Unit> dVar) {
        return ((B) create(interfaceC2395h, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C2581j c2581j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f5790d;
        C2830e c2830e = this.f5792f;
        InterfaceC3978p0<Boolean> interfaceC3978p0 = this.f5795i;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                InterfaceC2395h interfaceC2395h = (InterfaceC2395h) this.f5791e;
                InterfaceC3970l0 interfaceC3970l0 = this.f5793g;
                interfaceC3970l0.h(0.0f);
                InterfaceC3978p0 interfaceC3978p02 = this.f5794h;
                C2581j c2581j2 = (C2581j) C7714v.Z((List) interfaceC3978p02.getValue());
                Intrinsics.f(c2581j2);
                c2830e.o(c2581j2);
                c2830e.o((C2581j) ((List) interfaceC3978p02.getValue()).get(((List) interfaceC3978p02.getValue()).size() - 2));
                a aVar2 = new a(interfaceC3978p0, interfaceC3970l0);
                this.f5791e = c2581j2;
                this.f5790d = 1;
                if (interfaceC2395h.collect(aVar2, this) == aVar) {
                    return aVar;
                }
                c2581j = c2581j2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2581j = (C2581j) this.f5791e;
                Sc.s.b(obj);
            }
            interfaceC3978p0.setValue(Boolean.FALSE);
            c2830e.j(c2581j, false);
        } catch (CancellationException unused) {
            interfaceC3978p0.setValue(Boolean.FALSE);
        }
        return Unit.f71690a;
    }
}
