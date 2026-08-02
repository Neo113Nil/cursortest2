package Za0;

import Sc.s;
import cb0.C5797a;
import eb0.C6340a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.host.config.debug.menu.presentation.screen.main.MainScreenViewModel$handleIntent$1", f = "MainScreenViewModel.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f35778d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f35779e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C5797a f35780f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(e eVar, C5797a c5797a, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f35779e = eVar;
        this.f35780f = c5797a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new f(this.f35779e, this.f35780f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Oa0.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f35778d;
        if (i11 == 0) {
            s.b(obj);
            aVar = this.f35779e.f35758b;
            C6340a a11 = this.f35780f.a();
            Intrinsics.checkNotNullParameter(a11, "<this>");
            Ma0.a aVar3 = new Ma0.a(a11.b(), a11.d(), a11.e(), a11.c());
            this.f35778d = 1;
            if (aVar.a(aVar3, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
