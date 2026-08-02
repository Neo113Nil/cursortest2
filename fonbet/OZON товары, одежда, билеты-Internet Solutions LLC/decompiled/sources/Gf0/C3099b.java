package Gf0;

import Ae.B0;
import Ae.InterfaceC2397i;
import Sc.C4005g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mf0.InterfaceC8142d;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.addDomain.AddDomainScreen$Content$1$1", f = "AddDomainScreen.kt", l = {51}, m = "invokeSuspend")
/* renamed from: Gf0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3099b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f10163d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ M f10164e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC8142d f10165f;

    /* renamed from: Gf0.b$a */
    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8142d f10166a;

        a(InterfaceC8142d interfaceC8142d) {
            this.f10166a = interfaceC8142d;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            if (!Intrinsics.d((B) obj, O.f10148a)) {
                throw new Sc.o();
            }
            this.f10166a.a();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3099b(M m11, InterfaceC8142d interfaceC8142d, kotlin.coroutines.d<? super C3099b> dVar) {
        super(2, dVar);
        this.f10164e = m11;
        this.f10165f = interfaceC8142d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C3099b(this.f10164e, this.f10165f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3099b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f10163d;
        if (i11 == 0) {
            Sc.s.b(obj);
            B0<B> h02 = this.f10164e.h0();
            a aVar2 = new a(this.f10165f);
            this.f10163d = 1;
            if (h02.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        throw new C4005g();
    }
}
