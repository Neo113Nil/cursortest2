package kotlinx.coroutines;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,310:1\n1#2:311\n103#3,13:312\n*S KotlinDebug\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n*L\n265#1:312,13\n*E\n"})
/* loaded from: classes5.dex */
public final class Z0<T> extends kotlinx.coroutines.internal.t<T> {
    public final ThreadLocal<Pair<CoroutineContext, Object>> e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Z0(Continuation continuation, CoroutineContext coroutineContext) {
        super(continuation, coroutineContext.get(r0) == null ? coroutineContext.plus(r0) : coroutineContext);
        a1 a1Var = a1.a;
        this.e = new ThreadLocal<>();
        if (continuation.get$context().get(ContinuationInterceptor.INSTANCE) instanceof I) {
            return;
        }
        Object c = kotlinx.coroutines.internal.C.c(coroutineContext, null);
        kotlinx.coroutines.internal.C.a(coroutineContext, c);
        e0(coroutineContext, c);
    }

    public final boolean d0() {
        boolean z = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z;
    }

    public final void e0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(TuplesKt.to(coroutineContext, obj));
    }

    @Override // kotlinx.coroutines.internal.t, kotlinx.coroutines.C0
    public final void m(Object obj) {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.e.get();
            if (pair != null) {
                kotlinx.coroutines.internal.C.a(pair.component1(), pair.component2());
            }
            this.e.remove();
        }
        Object a = C.a(obj);
        Continuation<T> continuation = this.d;
        CoroutineContext coroutineContext = continuation.get$context();
        Object c = kotlinx.coroutines.internal.C.c(coroutineContext, null);
        Z0<?> c2 = c != kotlinx.coroutines.internal.C.a ? H.c(continuation, coroutineContext, c) : null;
        try {
            this.d.resumeWith(a);
            Unit unit = Unit.INSTANCE;
            if (c2 == null || c2.d0()) {
                kotlinx.coroutines.internal.C.a(coroutineContext, c);
            }
        } catch (Throwable th) {
            if (c2 == null || c2.d0()) {
                kotlinx.coroutines.internal.C.a(coroutineContext, c);
            }
            throw th;
        }
    }
}
