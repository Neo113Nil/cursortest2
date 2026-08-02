package Wc0;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.view.OtpFragment$observeViewModel$lambda$20$lambda$19$$inlined$collectFlow$5", f = "OtpFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class l extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f33489d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Be.n f33490e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b f33491f;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f33492a;

        public a(b bVar) {
            this.f33492a = bVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            b.E(this.f33492a, (Xc0.a) t2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Be.n nVar, kotlin.coroutines.d dVar, b bVar) {
        super(2, dVar);
        this.f33490e = nVar;
        this.f33491f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new l(this.f33490e, dVar, this.f33491f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f33489d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f33491f);
            this.f33489d = 1;
            if (this.f33490e.collect(aVar2, this) == aVar) {
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
