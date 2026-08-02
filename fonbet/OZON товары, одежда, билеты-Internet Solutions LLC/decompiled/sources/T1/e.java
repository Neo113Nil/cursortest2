package T1;

import K1.V;
import K1.X;
import Sc.o;
import android.text.style.TtsSpan;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e {
    @NotNull
    public static final TtsSpan a(@NotNull V v11) {
        if (v11 instanceof X) {
            return new TtsSpan.VerbatimBuilder(((X) v11).a()).build();
        }
        throw new o();
    }
}
