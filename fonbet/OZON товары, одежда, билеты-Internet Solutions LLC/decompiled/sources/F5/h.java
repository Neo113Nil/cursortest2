package F5;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ g f9044d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ B5.g f9045e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f9046f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f9047g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(g gVar, B5.g gVar2, float f7, boolean z11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f9044d = gVar;
        this.f9045e = gVar2;
        this.f9046f = f7;
        this.f9047g = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
        return new h(this.f9044d, this.f9045e, this.f9046f, this.f9047g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        g gVar = this.f9044d;
        g.o(gVar, this.f9045e);
        gVar.E(this.f9046f);
        g.s(gVar, 1);
        g.x(gVar, false);
        if (this.f9047g) {
            g.w(gVar);
        }
        return Unit.f71690a;
    }
}
