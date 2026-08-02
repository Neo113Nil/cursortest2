package J0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8008p;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1$1", f = "SnackbarHost.kt", l = {370}, m = "invokeSuspend")
/* renamed from: J0.t2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3346t2 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f13410d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7980b<Float, C8008p> f13411e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f13412f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ m0.T0 f13413g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3346t2(C7980b c7980b, boolean z11, m0.T0 t02, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f13411e = c7980b;
        this.f13412f = z11;
        this.f13413g = t02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C3346t2(this.f13411e, this.f13412f, this.f13413g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3346t2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f13410d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Float f7 = new Float(this.f13412f ? 1.0f : 0.8f);
            this.f13410d = 1;
            if (C7980b.f(this.f13411e, f7, this.f13413g, null, this, 12) == aVar) {
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
