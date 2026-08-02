package S60;

import Sc.s;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@e(c = "ru.ozon.fintech.features.metrix.domain.FintechMetrixInteractorImpl$mayBeProcessStartEvents$1", f = "FintechMetrixInteractorImpl.kt", l = {173}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f25955d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f25956e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ArrayList f25957f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f25958g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, ArrayList arrayList, boolean z11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f25956e = cVar;
        this.f25957f = arrayList;
        this.f25958g = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f25956e, this.f25957f, this.f25958g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f25955d;
        if (i11 == 0) {
            s.b(obj);
            this.f25955d = 1;
            if (Y.b(5000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.f25956e.i(this.f25958g ? "native" : "web", this.f25957f, false);
        return Unit.f71690a;
    }
}
