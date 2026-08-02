package S0;

import Sc.r;
import android.view.Choreographer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.C10737n;

/* loaded from: classes8.dex */
final class H implements InterfaceC3955f0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final H f25203a = new H();

    /* renamed from: b, reason: collision with root package name */
    private static final Choreographer f25204b;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Choreographer>, Object> {
        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(2, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Choreographer> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            return Choreographer.getInstance();
        }
    }

    static final class b extends AbstractC7737t implements Function1<Throwable, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f25205b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f25205b = frameCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            H.f25204b.removeFrameCallback(this.f25205b);
            return Unit.f71690a;
        }
    }

    static final class c implements Choreographer.FrameCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C10737n f25206a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Long, R> f25207b;

        c(Function1 function1, C10737n c10737n) {
            this.f25206a = c10737n;
            this.f25207b = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j11) {
            Object a11;
            H h11 = H.f25203a;
            Function1<Long, R> function1 = this.f25207b;
            try {
                r.Companion companion = Sc.r.INSTANCE;
                a11 = function1.invoke(Long.valueOf(j11));
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                a11 = Sc.s.a(th2);
            }
            this.f25206a.resumeWith(a11);
        }
    }

    static {
        C10720e0 c10720e0 = C10720e0.f105451a;
        f25204b = (Choreographer) C10727i.d(De.s.f6650a.x(), new a(2, null));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r11, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.a<E> aVar) {
        return (E) CoroutineContext.Element.a.b(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.a<?> aVar) {
        return CoroutineContext.Element.a.c(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(coroutineContext, this);
    }

    @Override // S0.InterfaceC3955f0
    public final <R> Object v(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> frame) {
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        c cVar = new c(function1, c10737n);
        f25204b.postFrameCallback(cVar);
        c10737n.q(new b(cVar));
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }
}
