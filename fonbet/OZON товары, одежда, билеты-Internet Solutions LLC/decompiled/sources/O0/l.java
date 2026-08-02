package O0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8004n;
import m0.G;
import m0.T0;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class l extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super B0>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f19775d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ m f19776e;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", l = {109}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f19777d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m f19778e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f19778e = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f19778e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            C7980b c7980b;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f19777d;
            if (i11 == 0) {
                Sc.s.b(obj);
                c7980b = this.f19778e.f19784f;
                Float f7 = new Float(0.0f);
                T0 d11 = C8004n.d(150, 0, G.b(), 2);
                this.f19777d = 1;
                if (C7980b.f(c7980b, f7, d11, null, this, 12) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m mVar, kotlin.coroutines.d<? super l> dVar) {
        super(2, dVar);
        this.f19776e = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        l lVar = new l(this.f19776e, dVar);
        lVar.f19775d = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super B0> dVar) {
        return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        return C10727i.c((M) this.f19775d, null, null, new a(this.f19776e, null), 3);
    }
}
