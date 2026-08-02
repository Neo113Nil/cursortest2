package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class J<T> extends AbstractC1056a<T> {
    public final SuspendLambda a;

    /* JADX WARN: Multi-variable type inference failed */
    public J(Function2<? super InterfaceC1061f<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.a = (SuspendLambda) function2;
    }
}
