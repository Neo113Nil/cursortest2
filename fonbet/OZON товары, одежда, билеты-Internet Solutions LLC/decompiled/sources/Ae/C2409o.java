package Ae;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {46}, m = "invokeSuspend")
/* renamed from: Ae.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2409o extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f1060d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h<Object> f1061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2409o(InterfaceC2395h<Object> interfaceC2395h, kotlin.coroutines.d<? super C2409o> dVar) {
        super(2, dVar);
        this.f1061e = interfaceC2395h;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C2409o(this.f1061e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C2409o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f1060d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f1060d = 1;
            if (C2399j.g(this.f1061e, this) == aVar) {
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
