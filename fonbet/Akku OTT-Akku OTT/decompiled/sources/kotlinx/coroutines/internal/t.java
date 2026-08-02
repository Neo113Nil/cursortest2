package kotlinx.coroutines.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.AbstractC1044a;

/* loaded from: classes5.dex */
public class t<T> extends AbstractC1044a<T> implements CoroutineStackFrame {

    @JvmField
    public final Continuation<T> d;

    public t(Continuation continuation, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.d = continuation;
    }

    @Override // kotlinx.coroutines.C0
    public final boolean K() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.C0
    public void l(Object obj) {
        C1090g.a(kotlinx.coroutines.C.a(obj), IntrinsicsKt.intercepted(this.d));
    }

    @Override // kotlinx.coroutines.C0
    public void m(Object obj) {
        this.d.resumeWith(kotlinx.coroutines.C.a(obj));
    }
}
