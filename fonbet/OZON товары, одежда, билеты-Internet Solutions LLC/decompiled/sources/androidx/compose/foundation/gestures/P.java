package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import r0.C9113N;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", l = {522}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class P extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f39091d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ N f39092e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f39093f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f39094g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(N n11, float f7, float f11, kotlin.coroutines.d<? super P> dVar) {
        super(2, dVar);
        this.f39092e = n11;
        this.f39093f = f7;
        this.f39094g = f11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new P(this.f39092e, this.f39093f, this.f39094g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((P) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39091d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C9113N c9113n = this.f39092e.f39065q;
            long a11 = P9.a.a(this.f39093f, this.f39094g);
            this.f39091d = 1;
            if (J.d(c9113n, a11, this) == aVar) {
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
