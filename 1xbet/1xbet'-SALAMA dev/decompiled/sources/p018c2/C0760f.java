package p018c2;

import java.io.IOException;

/* JADX INFO: renamed from: c2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0760f extends IOException {
    public C0760f(int i7) {
        super("Illegal clipping: ".concat(i7 != 0 ? i7 != 1 ? i7 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
    }
}
