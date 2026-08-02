package androidx.compose.foundation.gestures;

import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import r0.C9113N;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {527}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class S extends kotlin.coroutines.jvm.internal.j implements Function2<C7459e, kotlin.coroutines.d<? super C7459e>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f39096d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ long f39097e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ N f39098f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S(N n11, kotlin.coroutines.d<? super S> dVar) {
        super(2, dVar);
        this.f39098f = n11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        S s11 = new S(this.f39098f, dVar);
        s11.f39097e = ((C7459e) obj).n();
        return s11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C7459e c7459e, kotlin.coroutines.d<? super C7459e> dVar) {
        return ((S) create(C7459e.a(c7459e.n()), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39096d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        long j11 = this.f39097e;
        C9113N c9113n = this.f39098f.f39065q;
        this.f39096d = 1;
        Object d11 = J.d(c9113n, j11, this);
        return d11 == aVar ? aVar : d11;
    }
}
