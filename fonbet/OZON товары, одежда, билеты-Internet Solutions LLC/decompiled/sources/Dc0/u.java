package Dc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.fintech.presentation.camera.FintechRecoveryCameraFragment$observeViewModel$lambda$20$$inlined$collectFlow$3", f = "FintechRecoveryCameraFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class u extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f6539d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f6540e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ q f6541f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Jb0.g f6542g;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f6543a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Jb0.g f6544b;

        public a(q qVar, Jb0.g gVar) {
            this.f6543a = qVar;
            this.f6544b = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            q.F(this.f6543a, this.f6544b, (Fc0.c) t2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, q qVar, Jb0.g gVar) {
        super(2, dVar);
        this.f6540e = interfaceC2395h;
        this.f6541f = qVar;
        this.f6542g = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new u(this.f6540e, dVar, this.f6541f, this.f6542g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((u) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f6539d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f6541f, this.f6542g);
            this.f6539d = 1;
            if (this.f6540e.collect(aVar2, this) == aVar) {
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
