package p146u2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class J extends IOException {
    public J(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
    }
}
