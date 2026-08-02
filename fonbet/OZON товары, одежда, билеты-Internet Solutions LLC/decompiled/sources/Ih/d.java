package Ih;

import Qj0.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public interface d {
    @NotNull
    U beginTrace(@NotNull String str);

    void endTrace(@NotNull String str);

    boolean hasTrace(@NotNull String str);

    U removeTrace(@NotNull String str);
}
