package androidx.compose.animation;

import androidx.compose.animation.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C7998k;
import m0.C8010q;
import m0.EnumC7994i;
import m0.InterfaceC8002m;
import org.jetbrains.annotations.NotNull;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {228}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class v extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f38833d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ u.a f38834e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f38835f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ u f38836g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(u.a aVar, long j11, u uVar, kotlin.coroutines.d<? super v> dVar) {
        super(2, dVar);
        this.f38834e = aVar;
        this.f38835f = j11;
        this.f38836g = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new v(this.f38834e, this.f38835f, this.f38836g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((v) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f38833d;
        u.a aVar2 = this.f38834e;
        u uVar = this.f38836g;
        if (i11 == 0) {
            Sc.s.b(obj);
            C7980b<Z1.q, C8010q> a11 = aVar2.a();
            Z1.q a12 = Z1.q.a(this.f38835f);
            InterfaceC8002m<Z1.q> J12 = uVar.J1();
            this.f38833d = 1;
            obj = C7980b.f(a11, a12, J12, null, this, 12);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        if (((C7998k) obj).a() == EnumC7994i.Finished) {
            uVar.getClass();
        }
        return Unit.f71690a;
    }
}
