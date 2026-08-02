package Mb0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Mb0.b;
import Sc.InterfaceC4003e;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@e(c = "ru.ozon.id.forceLogout.ForceLogoutUseCase$1", f = "ForceLogoutUseCase.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f17797d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b f17798e;

    /* renamed from: Mb0.a$a, reason: collision with other inner class name */
    /* synthetic */ class C0341a implements InterfaceC2397i, InterfaceC7732n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f17799a;

        C0341a(b bVar) {
            this.f17799a = bVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            Object b11 = b.b(this.f17799a, (b.a) obj, dVar);
            return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC2397i) && (obj instanceof InterfaceC7732n)) {
                return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return new C7735q(2, this.f17799a, b.class, "onExecute", "onExecute(Lru/ozon/id/forceLogout/ForceLogoutUseCase$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, kotlin.coroutines.d<? super a> dVar) {
        super(2, dVar);
        this.f17798e = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new a(this.f17798e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f17797d;
        if (i11 == 0) {
            s.b(obj);
            b bVar = this.f17798e;
            InterfaceC2395h l11 = C2399j.l(C2399j.H(bVar.f17805f), 250L);
            C0341a c0341a = new C0341a(bVar);
            this.f17797d = 1;
            if (l11.collect(c0341a, this) == aVar) {
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
