package Le0;

import Ae.C0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreTilesController$changeTheme$1$1", f = "LibreTilesController.kt", l = {117}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class G extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f16875d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ B f16876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(B b11, kotlin.coroutines.d<? super G> dVar) {
        super(2, dVar);
        this.f16876e = b11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new G(this.f16876e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((G) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C0 c02;
        we0.y yVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f16875d;
        if (i11 == 0) {
            Sc.s.b(obj);
            B b11 = this.f16876e;
            c02 = b11.f16862i;
            yVar = b11.f16861h;
            this.f16875d = 1;
            if (c02.emit(yVar, this) == aVar) {
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
