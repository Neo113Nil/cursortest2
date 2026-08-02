package Bj0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.text.h;
import tj0.InterfaceC9882b;
import yj0.InterfaceC10914a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.shared.traces.presentation.viewmodel.TrackerTracesViewModel$trackPclPageEvents$1", f = "TrackerTracesViewModel.kt", l = {194}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f3896d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC10914a f3897e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ g f3898f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(InterfaceC10914a interfaceC10914a, g gVar, kotlin.coroutines.d<? super f> dVar) {
        super(1, dVar);
        this.f3897e = interfaceC10914a;
        this.f3898f = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new f(this.f3897e, this.f3898f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC9882b interfaceC9882b;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f3896d;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC10914a interfaceC10914a = this.f3897e;
            String b11 = interfaceC10914a.c().b();
            Long y02 = h.y0(interfaceC10914a.d().b());
            Integer w02 = h.w0(interfaceC10914a.b().b());
            interfaceC9882b = this.f3898f.f3901b;
            this.f3896d = 1;
            if (interfaceC9882b.a(b11, w02, y02) == aVar) {
                return aVar;
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
