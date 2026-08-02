package androidx.core.os;

/* loaded from: classes7.dex */
public interface OutcomeReceiverCompat<R, E extends java.lang.Throwable> {
    default void onError(E e) {
    }

    void onResult(R r);
}
