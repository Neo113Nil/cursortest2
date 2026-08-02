package Nb0;

import Ib0.i;
import Sc.InterfaceC4008j;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.B0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.forceSignIn.ForceSignInUseCase$execute$postResult$2", f = "ForceSignInUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends j implements Function2<M, kotlin.coroutines.d<? super B0>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ i f18899d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ a f18900e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f18901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(i iVar, a aVar, boolean z11, kotlin.coroutines.d<? super c> dVar) {
        super(2, dVar);
        this.f18899d = iVar;
        this.f18900e = aVar;
        this.f18901f = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f18899d, this.f18900e, this.f18901f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super B0> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        interfaceC4008j = this.f18899d.f18930a;
        Ib0.e eVar = (Ib0.e) interfaceC4008j.getValue();
        a aVar2 = this.f18900e;
        Intrinsics.checkNotNullParameter(aVar2, "<this>");
        return eVar.j(this.f18901f ? new i.a(Gb0.d.FORCE_LOGIN) : aVar2.b() ? new i.c(Gb0.d.FORCE_LOGIN, aVar2.a()) : new i.b(Gb0.d.FORCE_LOGIN));
    }
}
