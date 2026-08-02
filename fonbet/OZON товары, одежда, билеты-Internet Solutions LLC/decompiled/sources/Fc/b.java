package Fc;

import java.util.concurrent.atomic.AtomicLong;
import tc.InterfaceC9805g;

/* loaded from: classes.dex */
public abstract class b<T> extends AtomicLong implements InterfaceC9805g<T> {
    @Override // tc.InterfaceC9808j
    public final boolean offer(T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
