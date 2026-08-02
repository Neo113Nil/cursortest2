package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
public interface MessagePassingQueue<M> {
    boolean isEmpty();

    boolean offer(M m);

    M peek();

    M poll();

    int size();
}
