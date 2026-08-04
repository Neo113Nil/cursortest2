package W5;

import java.io.Closeable;

/* JADX INFO: renamed from: W5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0514k implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X5.f f7260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H0 f7261b;

    public C0514k(X5.f fVar, H0 h6) {
        this.f7260a = fVar;
        this.f7261b = h6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7260a.close();
    }
}
