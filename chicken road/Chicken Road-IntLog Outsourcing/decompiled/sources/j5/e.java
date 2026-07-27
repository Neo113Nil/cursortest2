package j5;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class e implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public f f10490a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10491b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f10492c;

    /* renamed from: d, reason: collision with root package name */
    public int f10493d = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10490a == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f10490a = null;
        this.f10492c = null;
        this.f10493d = -1;
    }
}
