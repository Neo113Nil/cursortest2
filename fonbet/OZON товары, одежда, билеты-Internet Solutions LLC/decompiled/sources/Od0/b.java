package Od0;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface b {
    void beforeHandleDeeplink(@NotNull Ld0.c cVar, @NotNull c cVar2);

    boolean canHandle(@NotNull c cVar);

    @NotNull
    a handleDeeplink(@NotNull Ld0.c cVar, @NotNull c cVar2, @NotNull Context context);
}
