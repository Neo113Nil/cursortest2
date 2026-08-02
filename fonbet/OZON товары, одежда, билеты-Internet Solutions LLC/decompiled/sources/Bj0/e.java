package Bj0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.text.h;
import tj0.InterfaceC9882b;
import yj0.InterfaceC10914a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.shared.traces.presentation.viewmodel.TrackerTracesViewModel$trackEvents$1", f = "TrackerTracesViewModel.kt", l = {180}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f3893d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC10914a f3894e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ g f3895f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(InterfaceC10914a interfaceC10914a, g gVar, kotlin.coroutines.d<? super e> dVar) {
        super(1, dVar);
        this.f3894e = interfaceC10914a;
        this.f3895f = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new e(this.f3894e, this.f3895f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC9882b interfaceC9882b;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f3893d;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC10914a interfaceC10914a = this.f3894e;
            String b11 = interfaceC10914a.c().b();
            Long y02 = h.y0(interfaceC10914a.d().b());
            Integer w02 = h.w0(interfaceC10914a.b().b());
            interfaceC9882b = this.f3895f.f3900a;
            this.f3893d = 1;
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
