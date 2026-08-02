package We;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9684j;

/* loaded from: classes10.dex */
public abstract class S {
    public void onClosed(@NotNull Q webSocket, int i11, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public void onClosing(@NotNull Q webSocket, int i11, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public abstract void onFailure(@NotNull Q q11, @NotNull Throwable th2, L l11);

    public abstract void onMessage(@NotNull Q q11, @NotNull String str);

    public void onMessage(@NotNull Q webSocket, @NotNull C9684j bytes) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
    }

    public abstract void onOpen(@NotNull Q q11, @NotNull L l11);
}
