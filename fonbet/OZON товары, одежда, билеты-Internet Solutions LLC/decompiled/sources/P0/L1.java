package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8008p;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", l = {422}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class L1 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f20673d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7980b<Float, C8008p> f20674e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f20675f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ m0.T0 f20676g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f20677h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L1(C7980b c7980b, boolean z11, m0.T0 t02, Function0 function0, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f20674e = c7980b;
        this.f20675f = z11;
        this.f20676g = t02;
        this.f20677h = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new L1(this.f20674e, this.f20675f, this.f20676g, this.f20677h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((L1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        L1 l12;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f20673d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Float f7 = new Float(this.f20675f ? 1.0f : 0.0f);
            this.f20673d = 1;
            l12 = this;
            if (C7980b.f(this.f20674e, f7, this.f20676g, null, l12, 12) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            l12 = this;
        }
        l12.f20677h.invoke();
        return Unit.f71690a;
    }
}
