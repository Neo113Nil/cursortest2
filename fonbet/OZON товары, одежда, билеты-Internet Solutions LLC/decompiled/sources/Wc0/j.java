package Wc0;

import Ae.C2406m0;
import Ae.InterfaceC2397i;
import Jb0.B;
import Jb0.C;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.view.OtpFragment$observeViewModel$lambda$20$lambda$19$$inlined$collectFlow$3", f = "OtpFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f33481d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2406m0 f33482e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b f33483f;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f33484a;

        public a(b bVar) {
            this.f33484a = bVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            B b11;
            C c11;
            Xc0.b bVar = (Xc0.b) t2;
            b bVar2 = this.f33484a;
            b11 = bVar2.f33457b;
            if (b11 != null) {
                t.a(b11.f14356i, bVar);
            }
            c11 = bVar2.f33458c;
            if (c11 != null) {
                t.a(c11.f14366d, bVar);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C2406m0 c2406m0, kotlin.coroutines.d dVar, b bVar) {
        super(2, dVar);
        this.f33482e = c2406m0;
        this.f33483f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new j(this.f33482e, dVar, this.f33483f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f33481d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f33483f);
            this.f33481d = 1;
            if (this.f33482e.collect(aVar2, this) == aVar) {
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
