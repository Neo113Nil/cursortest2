package rx.internal.util.atomic;

/* loaded from: classes18.dex */
public final class LinkedQueueNode<E> extends java.util.concurrent.atomic.AtomicReference<rx.internal.util.atomic.LinkedQueueNode<E>> {
    private static final long serialVersionUID = 2404266111789071508L;
    private E Camera2StreamConfigurationMap;

    public LinkedQueueNode() {
    }

    public LinkedQueueNode(E e) {
        spValue(e);
    }

    public final E getAndNullValue() {
        E lpValue = lpValue();
        spValue(null);
        return lpValue;
    }

    public final E lpValue() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void spValue(E e) {
        this.Camera2StreamConfigurationMap = e;
    }

    public final void soNext(rx.internal.util.atomic.LinkedQueueNode<E> linkedQueueNode) {
        lazySet(linkedQueueNode);
    }

    public final rx.internal.util.atomic.LinkedQueueNode<E> lvNext() {
        return get();
    }
}
