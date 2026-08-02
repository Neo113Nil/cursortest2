package V40;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.N;
import xe.Y;

@e(c = "ru.ozon.fintech.features.cbottomonboarding.interactor.v1.OnboardingSlidesInteractor$startTimer$1", f = "OnboardingSlidesInteractor.kt", l = {287}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f28104d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f28105e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b f28106f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, d<? super c> dVar) {
        super(2, dVar);
        this.f28106f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        c cVar = new c(this.f28106f, dVar);
        cVar.f28105e = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0031 -> B:5:0x0034). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28104d;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.f28105e;
            if (N.f(m11)) {
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (M) this.f28105e;
            s.b(obj);
            this.f28106f.u();
            if (N.f(m11)) {
                this.f28105e = m11;
                this.f28104d = 1;
                if (Y.b(20L, this) == aVar) {
                    return aVar;
                }
                this.f28106f.u();
                if (N.f(m11)) {
                    return Unit.f71690a;
                }
            }
        }
    }
}
