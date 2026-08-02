package Wa;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ra.d f33409a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f33410b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f33411c;

    /* renamed from: d, reason: collision with root package name */
    private volatile ByteBuffer f33412d;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f33413e;

    public b(@NotNull Ra.d delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f33409a = delegate;
        this.f33410b = new ReentrantLock();
        this.f33411c = new AtomicBoolean(false);
        this.f33413e = 1;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f33411c.compareAndSet(false, true)) {
            super.close();
            this.f33409a.a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            ReentrantLock reentrantLock = this.f33410b;
            reentrantLock.lock();
            while (true) {
                try {
                    int i11 = 3;
                    byte b11 = -1;
                    if (this.f33413e >= 3) {
                        return -1;
                    }
                    if (this.f33411c.get()) {
                        this.f33413e = 4;
                        return -1;
                    }
                    if (this.f33413e == 1) {
                        this.f33412d = this.f33409a.c();
                        if (this.f33412d != null) {
                            i11 = 2;
                        }
                        this.f33413e = i11;
                    } else if (this.f33413e != 2) {
                        continue;
                    } else {
                        ByteBuffer byteBuffer = this.f33412d;
                        if (byteBuffer == null) {
                            throw new IllegalStateException("Buffer can't be null with state - " + this.f33413e + "!");
                        }
                        if (byteBuffer.hasRemaining()) {
                            b11 = byteBuffer.get();
                        }
                        if (b11 >= 0) {
                            return b11;
                        }
                        this.f33413e = 1;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        } catch (Throwable th2) {
            this.f33409a.b(th2);
            throw null;
        }
    }

    @Override // java.io.InputStream
    public final int read(@NotNull byte[] b11, int i11, int i12) {
        Intrinsics.checkNotNullParameter(b11, "b");
        try {
            ReentrantLock reentrantLock = this.f33410b;
            reentrantLock.lock();
            while (true) {
                try {
                    int i13 = 3;
                    int i14 = -1;
                    if (this.f33413e >= 3) {
                        return -1;
                    }
                    if (this.f33411c.get()) {
                        this.f33413e = 4;
                        return -1;
                    }
                    if (this.f33413e == 1) {
                        this.f33412d = this.f33409a.c();
                        if (this.f33412d != null) {
                            i13 = 2;
                        }
                        this.f33413e = i13;
                    } else if (this.f33413e != 2) {
                        continue;
                    } else {
                        ByteBuffer byteBuffer = this.f33412d;
                        if (byteBuffer != null) {
                            int min = Math.min(i12, byteBuffer.remaining());
                            if (min > 0) {
                                byteBuffer.get(b11, i11, min);
                                i14 = min;
                            }
                            if (i14 >= 0) {
                                return i14;
                            }
                            this.f33413e = 1;
                        } else {
                            throw new IllegalStateException("Buffer can't be null with state - " + this.f33413e + "!");
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        } catch (Throwable th2) {
            this.f33409a.b(th2);
            throw null;
        }
    }
}
