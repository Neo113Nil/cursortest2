package I90;

import Sc.s;
import g30.InterfaceC6618a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.theme.FintechThemeViewModel$handleOnClick$1", f = "FintechThemeViewModel.kt", l = {226}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f12077d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f12078e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f12079f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(f fVar, int i11, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f12078e = fVar;
        this.f12079f = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f12078e, this.f12079f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.fintech.settings.domain.a aVar;
        InterfaceC6618a interfaceC6618a;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f12077d;
        if (i11 == 0) {
            s.b(obj);
            this.f12077d = 1;
            if (Y.b(100L, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        f fVar = this.f12078e;
        aVar = fVar.f12060a;
        int i12 = this.f12079f;
        aVar.D(i12);
        androidx.appcompat.app.j.L(i12);
        interfaceC6618a = fVar.f12067h;
        interfaceC6618a.b0(new Integer(i12));
        return Unit.f71690a;
    }
}
