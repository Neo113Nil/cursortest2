package Wc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Jb0.B;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.view.OtpFragment$observeViewModel$lambda$20$lambda$19$$inlined$collectFlow$2", f = "OtpFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f33477d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f33478e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b f33479f;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f33480a;

        public a(b bVar) {
            this.f33480a = bVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            B b11;
            CharSequence charSequence = (CharSequence) t2;
            b bVar = this.f33480a;
            b11 = bVar.f33457b;
            if (b11 != null) {
                b.y(bVar, b11, charSequence);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, b bVar) {
        super(2, dVar);
        this.f33478e = interfaceC2395h;
        this.f33479f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new i(this.f33478e, dVar, this.f33479f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f33477d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f33479f);
            this.f33477d = 1;
            if (this.f33478e.collect(aVar2, this) == aVar) {
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
