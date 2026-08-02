package Ae;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.InterfaceC10750u;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {336}, m = "invokeSuspend")
/* renamed from: Ae.j0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C2400j0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f1011d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f1012e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h<Object> f1013f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC10750u<M0<Object>> f1014g;

    /* renamed from: Ae.j0$a */
    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<x0<T>> f1015a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ xe.M f1016b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC10750u<M0<T>> f1017c;

        a(kotlin.jvm.internal.M<x0<T>> m11, xe.M m12, InterfaceC10750u<M0<T>> interfaceC10750u) {
            this.f1015a = m11;
            this.f1016b = m12;
            this.f1017c = interfaceC10750u;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [Ae.x0, T] */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            kotlin.jvm.internal.M<x0<T>> m11 = this.f1015a;
            x0<T> x0Var = m11.f71787a;
            if (x0Var != null) {
                x0Var.setValue(t2);
            } else {
                ?? r32 = (T) O0.a(t2);
                this.f1017c.complete(new z0(r32, xe.E0.g(this.f1016b.getCoroutineContext())));
                m11.f71787a = r32;
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2400j0(InterfaceC2395h<Object> interfaceC2395h, InterfaceC10750u<M0<Object>> interfaceC10750u, kotlin.coroutines.d<? super C2400j0> dVar) {
        super(2, dVar);
        this.f1013f = interfaceC2395h;
        this.f1014g = interfaceC10750u;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C2400j0 c2400j0 = new C2400j0(this.f1013f, this.f1014g, dVar);
        c2400j0.f1012e = obj;
        return c2400j0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C2400j0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f1011d;
        InterfaceC10750u<M0<Object>> interfaceC10750u = this.f1014g;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                xe.M m11 = (xe.M) this.f1012e;
                kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
                InterfaceC2395h<Object> interfaceC2395h = this.f1013f;
                a aVar2 = new a(m12, m11, interfaceC10750u);
                this.f1011d = 1;
                if (interfaceC2395h.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        } catch (Throwable th2) {
            interfaceC10750u.L(th2);
            throw th2;
        }
    }
}
