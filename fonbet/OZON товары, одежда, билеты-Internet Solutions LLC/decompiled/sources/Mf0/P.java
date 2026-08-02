package Mf0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import pf0.InterfaceC8918a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.main.ONDebugMenuViewModel$deleteExtraHeader$1", f = "ONDebugMenuViewModel.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class P extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f17991d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ O f17992e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f17993f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(O o11, String str, kotlin.coroutines.d<? super P> dVar) {
        super(2, dVar);
        this.f17992e = o11;
        this.f17993f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new P(this.f17992e, this.f17993f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((P) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f17991d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC8918a e02 = O.e0(this.f17992e);
            this.f17991d = 1;
            if (e02.d(this.f17993f, this) == aVar) {
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
