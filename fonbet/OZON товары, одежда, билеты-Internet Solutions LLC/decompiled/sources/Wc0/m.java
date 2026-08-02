package Wc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.view.OtpFragment$observeViewModel$lambda$20$lambda$19$$inlined$collectFlow$6", f = "OtpFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class m extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f33493d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f33494e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b f33495f;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f33496a;

        public a(b bVar) {
            this.f33496a = bVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            b.F(this.f33496a, (Xc0.c) t2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
        super(2, dVar);
        this.f33494e = interfaceC2395h;
        this.f33495f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new m(this.f33494e, dVar, this.f33495f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f33493d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f33495f);
            this.f33493d = 1;
            if (this.f33494e.collect(aVar2, this) == aVar) {
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
