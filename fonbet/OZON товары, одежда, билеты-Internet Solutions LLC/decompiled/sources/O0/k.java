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

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super B0>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f19767d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ m f19768e;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", l = {86}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f19769d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m f19770e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f19770e = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f19770e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            C7980b c7980b;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f19769d;
            if (i11 == 0) {
                Sc.s.b(obj);
                c7980b = this.f19770e.f19784f;
                Float f7 = new Float(1.0f);
                T0 d11 = C8004n.d(75, 0, G.b(), 2);
                this.f19769d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", l = {92}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f19771d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m f19772e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m mVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f19772e = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f19772e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            C7980b c7980b;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f19771d;
            if (i11 == 0) {
                Sc.s.b(obj);
                c7980b = this.f19772e.f19785g;
                Float f7 = new Float(1.0f);
                T0 d11 = C8004n.d(225, 0, G.a(), 2);
                this.f19771d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", l = {98}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f19773d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m f19774e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m mVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f19774e = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new c(this.f19774e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            C7980b c7980b;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f19773d;
            if (i11 == 0) {
                Sc.s.b(obj);
                c7980b = this.f19774e.f19786h;
                Float f7 = new Float(1.0f);
                T0 d11 = C8004n.d(225, 0, G.b(), 2);
                this.f19773d = 1;
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
    k(m mVar, kotlin.coroutines.d<? super k> dVar) {
        super(2, dVar);
        this.f19768e = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        k kVar = new k(this.f19768e, dVar);
        kVar.f19767d = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super B0> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        M m11 = (M) this.f19767d;
        m mVar = this.f19768e;
        C10727i.c(m11, null, null, new a(mVar, null), 3);
        C10727i.c(m11, null, null, new b(mVar, null), 3);
        return C10727i.c(m11, null, null, new c(mVar, null), 3);
    }
}
