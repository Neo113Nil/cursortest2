package Ge;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import io.reactivex.r;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1", f = "RxConvert.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class o extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f10102d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f10103e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h<Object> f10104f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ r<Object> f10105g;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r<T> f10106a;

        a(r<T> rVar) {
            this.f10106a = rVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            this.f10106a.onNext(t2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(InterfaceC2395h<Object> interfaceC2395h, r<Object> rVar, kotlin.coroutines.d<? super o> dVar) {
        super(2, dVar);
        this.f10104f = interfaceC2395h;
        this.f10105g = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        o oVar = new o(this.f10104f, this.f10105g, dVar);
        oVar.f10103e = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        Throwable th2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f10102d;
        r<Object> rVar = this.f10105g;
        if (i11 == 0) {
            s.b(obj);
            M m12 = (M) this.f10103e;
            try {
                InterfaceC2395h<Object> interfaceC2395h = this.f10104f;
                a aVar2 = new a(rVar);
                this.f10103e = m12;
                this.f10102d = 1;
                if (interfaceC2395h.collect(aVar2, this) == aVar) {
                    return aVar;
                }
                m11 = m12;
            } catch (Throwable th3) {
                m11 = m12;
                th2 = th3;
                if (!(th2 instanceof CancellationException)) {
                }
                return Unit.f71690a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (M) this.f10103e;
            try {
                s.b(obj);
            } catch (Throwable th4) {
                th2 = th4;
                if (!(th2 instanceof CancellationException)) {
                    rVar.onComplete();
                } else if (!rVar.b(th2)) {
                    h.a(m11.getCoroutineContext(), th2);
                }
                return Unit.f71690a;
            }
        }
        rVar.onComplete();
        return Unit.f71690a;
    }
}
