package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.C1089f;

@SourceDebugExtension({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,208:1\n1#2:209\n103#3,10:210\n114#3,2:224\n206#4:220\n207#4:223\n57#5,2:221\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n*L\n83#1:210,10\n83#1:224,2\n96#1:220\n96#1:223\n96#1:221,2\n*E\n"})
/* loaded from: classes5.dex */
public abstract class Z<T> extends kotlinx.coroutines.scheduling.g {

    @JvmField
    public int c;

    public Z(int i) {
        this.c = i;
    }

    public abstract Continuation<T> d();

    public Throwable e(Object obj) {
        A a = obj instanceof A ? (A) obj : null;
        if (a != null) {
            return a.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T g(Object obj) {
        return obj;
    }

    public final void h(Throwable th) {
        J.a(d().get$context(), new N("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r4 = (kotlinx.coroutines.InterfaceC1120x0) r5.get(kotlinx.coroutines.InterfaceC1120x0.a.a);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            Continuation<T> d = d();
            Intrinsics.checkNotNull(d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C1089f c1089f = (C1089f) d;
            Continuation<T> continuation = c1089f.e;
            Object obj = c1089f.i;
            CoroutineContext coroutineContext = continuation.get$context();
            Object c = kotlinx.coroutines.internal.C.c(coroutineContext, obj);
            InterfaceC1120x0 interfaceC1120x0 = null;
            Z0<?> c2 = c != kotlinx.coroutines.internal.C.a ? H.c(continuation, coroutineContext, c) : null;
            try {
                CoroutineContext coroutineContext2 = continuation.get$context();
                Object i = i();
                Throwable e = e(i);
                if (e == null) {
                    int i2 = this.c;
                    boolean z = true;
                    if (i2 != 1 && i2 != 2) {
                        z = false;
                    }
                }
                if (interfaceC1120x0 != null && !interfaceC1120x0.isActive()) {
                    CancellationException cancellationException = interfaceC1120x0.getCancellationException();
                    c(cancellationException);
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m1716constructorimpl(ResultKt.createFailure(cancellationException)));
                } else if (e != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    continuation.resumeWith(Result.m1716constructorimpl(ResultKt.createFailure(e)));
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    continuation.resumeWith(Result.m1716constructorimpl(g(i)));
                }
                Unit unit = Unit.INSTANCE;
                if (c2 != null && !c2.d0()) {
                    return;
                }
                kotlinx.coroutines.internal.C.a(coroutineContext, c);
            } catch (Throwable th) {
                if (c2 == null || c2.d0()) {
                    kotlinx.coroutines.internal.C.a(coroutineContext, c);
                }
                throw th;
            }
        } catch (Throwable th2) {
            h(th2);
        }
    }

    public void c(CancellationException cancellationException) {
    }
}
