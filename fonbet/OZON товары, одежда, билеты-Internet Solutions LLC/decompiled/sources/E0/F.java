package E0;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class F extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Boolean>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f6986d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ G f6987e;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {69, 77, 79}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f6988d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ xe.B0 f6989e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ G f6990f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xe.B0 b02, G g10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f6989e = b02;
            this.f6990f = g10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f6989e, this.f6990f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        
            if (xe.Y.b(500, r9) != r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
        
            if (xe.E0.c(r10, r9) == r0) goto L27;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0051 -> B:8:0x003a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f6988d;
            G g10 = this.f6990f;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    xe.B0 b02 = this.f6989e;
                    if (b02 != null) {
                        this.f6988d = 1;
                    }
                } else if (i11 == 1) {
                    Sc.s.b(obj);
                } else if (i11 == 2) {
                    Sc.s.b(obj);
                    G.b(g10, 0.0f);
                    this.f6988d = 3;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                G.b(g10, 1.0f);
                this.f6988d = 2;
                if (xe.Y.b(500L, this) == aVar) {
                    return aVar;
                }
                G.b(g10, 0.0f);
                this.f6988d = 3;
            } catch (Throwable th2) {
                G.b(g10, 0.0f);
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(G g10, kotlin.coroutines.d<? super F> dVar) {
        super(2, dVar);
        this.f6987e = g10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        F f7 = new F(this.f6987e, dVar);
        f7.f6986d = obj;
        return f7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Boolean> dVar) {
        return ((F) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        boolean z11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        xe.M m11 = (xe.M) this.f6986d;
        G g10 = this.f6987e;
        atomicReference = g10.f7032a;
        xe.B0 b02 = (xe.B0) atomicReference.getAndSet(null);
        atomicReference2 = g10.f7032a;
        xe.B0 c11 = C10727i.c(m11, null, null, new a(b02, g10, null), 3);
        while (true) {
            if (atomicReference2.compareAndSet(null, c11)) {
                z11 = true;
                break;
            }
            if (atomicReference2.get() != null) {
                z11 = false;
                break;
            }
        }
        return Boolean.valueOf(z11);
    }
}
