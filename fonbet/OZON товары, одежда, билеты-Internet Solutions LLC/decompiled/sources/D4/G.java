package D4;

import B4.C2581j;
import S0.InterfaceC3970l0;
import S0.InterfaceC3978p0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.C7989f0;

@kotlin.coroutines.jvm.internal.e(c = "androidx.navigation.compose.NavHostKt$NavHost$28$1", f = "NavHost.kt", l = {612}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class G extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f5804d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7989f0<C2581j> f5805e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f5806f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC3970l0 f5807g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(C7989f0 c7989f0, InterfaceC3978p0 interfaceC3978p0, InterfaceC3970l0 interfaceC3970l0, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f5805e = c7989f0;
        this.f5806f = interfaceC3978p0;
        this.f5807g = interfaceC3970l0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new G(this.f5805e, this.f5806f, this.f5807g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((G) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f5804d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C2581j c2581j = (C2581j) ((List) this.f5806f.getValue()).get(((List) r4.getValue()).size() - 2);
            float floatValue = this.f5807g.getFloatValue();
            this.f5804d = 1;
            if (this.f5805e.J(floatValue, c2581j, this) == aVar) {
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
