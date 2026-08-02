package w2;

import java.io.Closeable;

/* renamed from: w2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2550h implements AutoCloseable, Closeable {

    /* renamed from: k, reason: collision with root package name */
    public final C2545c f20526k;

    public C2550h(C2545c c2545c) {
        this.f20526k = c2545c;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        this.f20526k.close();
    }
}
