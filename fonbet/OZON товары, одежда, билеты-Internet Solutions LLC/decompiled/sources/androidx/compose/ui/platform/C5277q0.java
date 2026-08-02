package androidx.compose.ui.platform;

import S0.InterfaceC3955f0;
import Sc.r;
import android.view.Choreographer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* renamed from: androidx.compose.ui.platform.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5277q0 implements InterfaceC3955f0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Choreographer f40994a;

    /* renamed from: b, reason: collision with root package name */
    private final C5274p0 f40995b;

    /* renamed from: androidx.compose.ui.platform.q0$a */
    static final class a extends AbstractC7737t implements Function1<Throwable, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5274p0 f40996b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f40997c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5274p0 c5274p0, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f40996b = c5274p0;
            this.f40997c = frameCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            this.f40996b.a1(this.f40997c);
            return Unit.f71690a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.q0$b */
    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function1<Throwable, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f40999c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f40999c = frameCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            C5277q0.this.a().removeFrameCallback(this.f40999c);
            return Unit.f71690a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.q0$c */
    static final class c implements Choreographer.FrameCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C10737n f41000a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Long, R> f41001b;

        c(C10737n c10737n, C5277q0 c5277q0, Function1 function1) {
            this.f41000a = c10737n;
            this.f41001b = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j11) {
            Object a11;
            Function1<Long, R> function1 = this.f41001b;
            try {
                r.Companion companion = Sc.r.INSTANCE;
                a11 = function1.invoke(Long.valueOf(j11));
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                a11 = Sc.s.a(th2);
            }
            this.f41000a.resumeWith(a11);
        }
    }

    public C5277q0(@NotNull Choreographer choreographer, C5274p0 c5274p0) {
        this.f40994a = choreographer;
        this.f40995b = c5274p0;
    }

    @NotNull
    public final Choreographer a() {
        return this.f40994a;
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
        C5274p0 c5274p0 = this.f40995b;
        if (c5274p0 == null) {
            CoroutineContext.Element element = frame.getContext().get(kotlin.coroutines.e.INSTANCE);
            c5274p0 = element instanceof C5274p0 ? (C5274p0) element : null;
        }
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        c cVar = new c(c10737n, this, function1);
        Choreographer choreographer = this.f40994a;
        if (c5274p0 == null || !Intrinsics.d(c5274p0.T0(), choreographer)) {
            choreographer.postFrameCallback(cVar);
            c10737n.q(new b(cVar));
        } else {
            c5274p0.W0(cVar);
            c10737n.q(new a(c5274p0, cVar));
        }
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }
}
