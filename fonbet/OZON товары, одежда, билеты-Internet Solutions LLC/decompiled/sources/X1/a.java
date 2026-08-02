package X1;

import kotlin.sequences.Sequence;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public interface a<T> {
    @NotNull
    Sequence<T> a();

    default int getCount() {
        return l.d(a());
    }
}
