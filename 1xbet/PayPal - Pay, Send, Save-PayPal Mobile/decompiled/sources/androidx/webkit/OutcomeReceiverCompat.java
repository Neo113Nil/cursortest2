package androidx.webkit;

/* loaded from: classes7.dex */
public interface OutcomeReceiverCompat<T, E extends java.lang.Throwable> {
    default void onError(E e) {
    }

    void onResult(T t);
}
