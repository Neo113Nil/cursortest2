package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.InterfaceC1120x0;

/* renamed from: kotlinx.coroutines.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1044a<T> extends C0 implements Continuation<T>, K {
    public final CoroutineContext c;

    public AbstractC1044a(CoroutineContext coroutineContext, boolean z) {
        super(z);
        I((InterfaceC1120x0) coroutineContext.get(InterfaceC1120x0.a.a));
        this.c = coroutineContext.plus(this);
    }

    @Override // kotlinx.coroutines.C0
    public final void H(B b) {
        J.a(this.c, b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.C0
    public final void R(Object obj) {
        if (!(obj instanceof A)) {
            b0(obj);
        } else {
            A a = (A) obj;
            a0(a.a, A.b.get(a) != 0);
        }
    }

    public void a0(Throwable th, boolean z) {
    }

    public void b0(T t) {
    }

    public final void c0(M m, AbstractC1044a abstractC1044a, Function2 function2) {
        int ordinal = m.ordinal();
        if (ordinal == 0) {
            kotlinx.coroutines.intrinsics.a.c(function2, abstractC1044a, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                ContinuationKt.startCoroutine(function2, abstractC1044a, this);
                return;
            }
            if (ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Continuation probeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(this);
            try {
                CoroutineContext coroutineContext = probeCoroutineCreated.get$context();
                Object c = kotlinx.coroutines.internal.C.c(coroutineContext, null);
                try {
                    DebugProbesKt.probeCoroutineResumed(probeCoroutineCreated);
                    Object wrapWithContinuationImpl = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, abstractC1044a, probeCoroutineCreated) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(abstractC1044a, probeCoroutineCreated);
                    kotlinx.coroutines.internal.C.a(coroutineContext, c);
                    if (wrapWithContinuationImpl != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        probeCoroutineCreated.resumeWith(Result.m1716constructorimpl(wrapWithContinuationImpl));
                    }
                } catch (Throwable th) {
                    kotlinx.coroutines.internal.C.a(coroutineContext, c);
                    throw th;
                }
            } catch (Throwable th2) {
                Result.Companion companion = Result.INSTANCE;
                probeCoroutineCreated.resumeWith(Result.m1716constructorimpl(ResultKt.createFailure(th2)));
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext get$context() {
        return this.c;
    }

    @Override // kotlinx.coroutines.K
    public final CoroutineContext getCoroutineContext() {
        return this.c;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(obj);
        if (m1719exceptionOrNullimpl != null) {
            obj = new A(m1719exceptionOrNullimpl, false);
        }
        Object N = N(obj);
        if (N == F0.b) {
            return;
        }
        m(N);
    }

    @Override // kotlinx.coroutines.C0
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
