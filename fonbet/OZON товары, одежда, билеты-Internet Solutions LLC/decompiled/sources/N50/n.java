package N50;

import Sc.s;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.network.models.a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.demo.presentation.DemoViewModel$loadAccounts$1", f = "DemoViewModel.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class n extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    e f18730d;

    /* renamed from: e, reason: collision with root package name */
    e f18731e;

    /* renamed from: f, reason: collision with root package name */
    int f18732f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e f18733g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f18734h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(e eVar, boolean z11, kotlin.coroutines.d<? super n> dVar) {
        super(2, dVar);
        this.f18733g = eVar;
        this.f18734h = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new n(this.f18733g, this.f18734h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((n) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        e eVar;
        e eVar2;
        Map map;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f18732f;
        e eVar3 = this.f18733g;
        if (i11 == 0) {
            s.b(obj);
            L80.a.a("DemoViewModel", "accounts load START");
            eVar3.f18721m = a.c.f96630a;
            eVar3.handleState();
            try {
                M50.c cVar = eVar3.f18710b;
                boolean z11 = this.f18734h;
                this.f18730d = eVar3;
                this.f18731e = eVar3;
                this.f18732f = 1;
                obj = cVar.d(z11, this);
                if (obj == aVar) {
                    return aVar;
                }
                eVar2 = eVar3;
                eVar = eVar2;
            } catch (Exception e11) {
                e = e11;
                eVar = eVar3;
                L80.a.a("DemoViewModel", "accounts load ERROR");
                eVar3.f18721m = new a.C2102a(e);
                map = null;
                eVar2 = eVar;
                eVar2.f18719k = map;
                L80.a.a("DemoViewModel", "accounts load DONE");
                eVar3.handleState();
                return Unit.f71690a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar2 = this.f18731e;
            eVar = this.f18730d;
            try {
                s.b(obj);
            } catch (Exception e12) {
                e = e12;
                L80.a.a("DemoViewModel", "accounts load ERROR");
                eVar3.f18721m = new a.C2102a(e);
                map = null;
                eVar2 = eVar;
                eVar2.f18719k = map;
                L80.a.a("DemoViewModel", "accounts load DONE");
                eVar3.handleState();
                return Unit.f71690a;
            }
        }
        L80.a.a("DemoViewModel", "accounts load OK");
        eVar3.f18721m = a.b.f96629a;
        map = (Map) obj;
        eVar2.f18719k = map;
        L80.a.a("DemoViewModel", "accounts load DONE");
        eVar3.handleState();
        return Unit.f71690a;
    }
}
