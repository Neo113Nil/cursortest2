package Fc;

import java.util.concurrent.atomic.AtomicInteger;
import tc.InterfaceC9805g;

/* loaded from: classes.dex */
public abstract class a<T> extends AtomicInteger implements InterfaceC9805g<T> {
    @Override // tc.InterfaceC9808j
    public final boolean offer(T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
