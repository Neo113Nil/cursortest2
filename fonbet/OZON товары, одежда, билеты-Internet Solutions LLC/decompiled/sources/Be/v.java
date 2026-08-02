package Be;

import Ae.InterfaceC2397i;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class v extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f3689d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f3690e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f3691f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i<Object> f3692g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    v(InterfaceC6511n<? super M, ? super InterfaceC2397i<Object>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, InterfaceC2397i<Object> interfaceC2397i, kotlin.coroutines.d<? super v> dVar) {
        super(2, dVar);
        this.f3691f = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
        this.f3692g = interfaceC2397i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        v vVar = new v(this.f3691f, this.f3692g, dVar);
        vVar.f3690e = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((v) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f3689d;
        if (i11 == 0) {
            Sc.s.b(obj);
            M m11 = (M) this.f3690e;
            this.f3689d = 1;
            if (this.f3691f.invoke(m11, this.f3692g, this) == aVar) {
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
