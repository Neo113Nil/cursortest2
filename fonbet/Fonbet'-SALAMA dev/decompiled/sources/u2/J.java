package u2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class J extends IOException {
    public J(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
    }
}
