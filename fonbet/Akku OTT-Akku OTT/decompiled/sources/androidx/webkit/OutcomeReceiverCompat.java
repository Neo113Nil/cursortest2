package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.webkit.Profile;
import java.lang.Throwable;

@Profile.ExperimentalUrlPrefetch
/* loaded from: classes3.dex */
public interface OutcomeReceiverCompat<T, E extends Throwable> {
    default void onError(@NonNull E e) {
    }

    void onResult(T t);
}
