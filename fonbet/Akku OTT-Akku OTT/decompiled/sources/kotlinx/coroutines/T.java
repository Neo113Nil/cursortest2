package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* loaded from: classes5.dex */
public class T<T> extends AbstractC1044a<T> implements S<T> {
    @Override // kotlinx.coroutines.S
    public final Object await(Continuation<? super T> continuation) {
        Object n = n(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return n;
    }
}
