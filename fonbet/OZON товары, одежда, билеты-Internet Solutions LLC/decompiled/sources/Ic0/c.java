package Ic0;

import Ae.C0;
import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ic0.d;
import Sc.InterfaceC4003e;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.initAuth.InitAuthUseCase$1", f = "InitAuthUseCase.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12185d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d f12186e;

    /* synthetic */ class a implements InterfaceC2397i, InterfaceC7732n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f12187a;

        a(d dVar) {
            this.f12187a = dVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            Object f7 = this.f12187a.f((d.a) obj, dVar);
            return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC2397i) && (obj instanceof InterfaceC7732n)) {
                return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return new C7735q(2, this.f12187a, d.class, "onExecute", "onExecute(Lru/ozon/id/nativeauth/initAuth/InitAuthUseCase$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, kotlin.coroutines.d<? super c> dVar2) {
        super(2, dVar2);
        this.f12186e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f12186e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12185d;
        if (i11 == 0) {
            s.b(obj);
            d dVar = this.f12186e;
            c02 = dVar.f12193f;
            InterfaceC2395h l11 = C2399j.l(c02, 300L);
            a aVar2 = new a(dVar);
            this.f12185d = 1;
            if (l11.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
