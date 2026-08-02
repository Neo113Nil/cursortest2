package org.jctools.queues;

/* loaded from: classes5.dex */
public interface MessagePassingQueue<T> {
    public static final int UNBOUNDED_CAPACITY = -1;

    public interface Consumer<T> {
        void accept(T t);
    }

    /* loaded from: classes18.dex */
    public interface ExitCondition {
        boolean keepRunning();
    }

    /* loaded from: classes18.dex */
    public interface Supplier<T> {
        T get();
    }

    /* loaded from: classes18.dex */
    public interface WaitStrategy {
        int idle(int i);
    }

    int capacity();

    void clear();

    int drain(org.jctools.queues.MessagePassingQueue.Consumer<T> consumer);

    int drain(org.jctools.queues.MessagePassingQueue.Consumer<T> consumer, int i);

    void drain(org.jctools.queues.MessagePassingQueue.Consumer<T> consumer, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition);

    int fill(org.jctools.queues.MessagePassingQueue.Supplier<T> supplier);

    int fill(org.jctools.queues.MessagePassingQueue.Supplier<T> supplier, int i);

    void fill(org.jctools.queues.MessagePassingQueue.Supplier<T> supplier, org.jctools.queues.MessagePassingQueue.WaitStrategy waitStrategy, org.jctools.queues.MessagePassingQueue.ExitCondition exitCondition);

    boolean isEmpty();

    boolean offer(T t);

    T peek();

    T poll();

    boolean relaxedOffer(T t);

    T relaxedPeek();

    T relaxedPoll();

    int size();
}
