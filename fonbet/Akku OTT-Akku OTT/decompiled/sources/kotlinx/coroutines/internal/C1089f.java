package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC1083i0;
import kotlinx.coroutines.I;
import kotlinx.coroutines.O;
import kotlinx.coroutines.U0;
import kotlinx.coroutines.Z;

@SourceDebugExtension({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,297:1\n224#1,8:361\n236#1:369\n237#1,2:380\n239#1:384\n1#2:298\n1#2:304\n1#2:345\n277#3,5:299\n282#3,12:305\n294#3:339\n277#3,5:340\n282#3,12:346\n294#3:399\n186#4,3:317\n189#4,14:325\n186#4,3:358\n189#4,14:385\n91#5,5:320\n103#5,10:370\n114#5,2:382\n103#5,13:400\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n*L\n214#1:361,8\n215#1:369\n215#1:380,2\n215#1:384\n195#1:304\n213#1:345\n195#1:299,5\n195#1:305,12\n195#1:339\n213#1:340,5\n213#1:346,12\n213#1:399\n195#1:317,3\n195#1:325,14\n213#1:358,3\n213#1:385,14\n196#1:320,5\n215#1:370,10\n215#1:382,2\n236#1:400,13\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1089f<T> extends Z<T> implements CoroutineStackFrame, Continuation<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(C1089f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    @JvmField
    public final I d;

    @JvmField
    public final Continuation<T> e;

    @JvmField
    public Object f;

    @JvmField
    public final Object i;

    /* JADX WARN: Multi-variable type inference failed */
    public C1089f(I i, Continuation<? super T> continuation) {
        super(-1);
        this.d = i;
        this.e = continuation;
        this.f = C1090g.a;
        this.i = C.b(continuation.get$context());
    }

    @Override // kotlinx.coroutines.Z
    public final Continuation<T> d() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext get$context() {
        return this.e.get$context();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.Z
    public final Object i() {
        Object obj = this.f;
        this.f = C1090g.a;
        return obj;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(obj);
        Object a = m1719exceptionOrNullimpl == null ? obj : new kotlinx.coroutines.A(m1719exceptionOrNullimpl, false);
        Continuation<T> continuation = this.e;
        CoroutineContext coroutineContext = continuation.get$context();
        I i = this.d;
        if (i.isDispatchNeeded(coroutineContext)) {
            this.f = a;
            this.c = 0;
            i.dispatch(continuation.get$context(), this);
            return;
        }
        AbstractC1083i0 a2 = U0.a();
        if (a2.a >= 4294967296L) {
            this.f = a;
            this.c = 0;
            a2.X(this);
            return;
        }
        a2.Y(true);
        try {
            CoroutineContext coroutineContext2 = continuation.get$context();
            Object c = C.c(coroutineContext2, this.i);
            try {
                continuation.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
                while (a2.a0()) {
                }
            } finally {
                C.a(coroutineContext2, c);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + O.b(this.e) + ']';
    }
}
