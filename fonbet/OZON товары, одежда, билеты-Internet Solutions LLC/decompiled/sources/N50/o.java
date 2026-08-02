package N50;

import Sc.s;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.network.models.a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.demo.presentation.DemoViewModel$loadMessages$1", f = "DemoViewModel.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class o extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    e f18735d;

    /* renamed from: e, reason: collision with root package name */
    e f18736e;

    /* renamed from: f, reason: collision with root package name */
    int f18737f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e f18738g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f18739h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(e eVar, boolean z11, kotlin.coroutines.d<? super o> dVar) {
        super(2, dVar);
        this.f18738g = eVar;
        this.f18739h = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new o(this.f18738g, this.f18739h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        e eVar;
        e eVar2;
        List list;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f18737f;
        e eVar3 = this.f18738g;
        if (i11 == 0) {
            s.b(obj);
            L80.a.a("DemoViewModel", "messages load START");
            eVar3.f18722n = a.c.f96630a;
            eVar3.handleState();
            try {
                M50.c cVar = eVar3.f18710b;
                boolean z11 = this.f18739h;
                this.f18735d = eVar3;
                this.f18736e = eVar3;
                this.f18737f = 1;
                obj = cVar.e(z11, this);
                if (obj == aVar) {
                    return aVar;
                }
                eVar2 = eVar3;
                eVar = eVar2;
            } catch (Exception e11) {
                e = e11;
                eVar = eVar3;
                L80.a.a("DemoViewModel", "messages load ERROR");
                eVar3.f18722n = new a.C2102a(e);
                list = null;
                eVar2 = eVar;
                eVar2.f18720l = list;
                L80.a.a("DemoViewModel", "messages load DONE");
                eVar3.handleState();
                return Unit.f71690a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar2 = this.f18736e;
            eVar = this.f18735d;
            try {
                s.b(obj);
            } catch (Exception e12) {
                e = e12;
                L80.a.a("DemoViewModel", "messages load ERROR");
                eVar3.f18722n = new a.C2102a(e);
                list = null;
                eVar2 = eVar;
                eVar2.f18720l = list;
                L80.a.a("DemoViewModel", "messages load DONE");
                eVar3.handleState();
                return Unit.f71690a;
            }
        }
        L80.a.a("DemoViewModel", "messages load OK");
        eVar3.f18722n = a.b.f96629a;
        list = (List) obj;
        eVar2.f18720l = list;
        L80.a.a("DemoViewModel", "messages load DONE");
        eVar3.handleState();
        return Unit.f71690a;
    }
}
