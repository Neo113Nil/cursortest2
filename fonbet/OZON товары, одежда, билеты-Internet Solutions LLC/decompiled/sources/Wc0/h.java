package Wc0;

import Ae.C2406m0;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.data.models.OtpVO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.view.OtpFragment$observeViewModel$lambda$20$lambda$19$$inlined$collectFlow$1", f = "OtpFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f33473d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2406m0 f33474e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b f33475f;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f33476a;

        public a(b bVar) {
            this.f33476a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            Jb0.o oVar;
            OtpVO otpVO = (OtpVO) t2;
            b bVar = this.f33476a;
            oVar = bVar.f33456a;
            if (oVar != null) {
                b.G(bVar, oVar, otpVO);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C2406m0 c2406m0, kotlin.coroutines.d dVar, b bVar) {
        super(2, dVar);
        this.f33474e = c2406m0;
        this.f33475f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f33474e, dVar, this.f33475f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f33473d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f33475f);
            this.f33473d = 1;
            if (this.f33474e.collect(aVar2, this) == aVar) {
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
