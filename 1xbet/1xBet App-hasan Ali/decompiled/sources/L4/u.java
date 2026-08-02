package L4;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class u implements Closeable, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public boolean f3119k;

    /* renamed from: l, reason: collision with root package name */
    public int f3120l;

    /* renamed from: m, reason: collision with root package name */
    public final ReentrantLock f3121m = new ReentrantLock();

    /* renamed from: n, reason: collision with root package name */
    public final RandomAccessFile f3122n;

    public u(RandomAccessFile randomAccessFile) {
        this.f3122n = randomAccessFile;
    }

    public final long b() {
        long length;
        ReentrantLock reentrantLock = this.f3121m;
        reentrantLock.lock();
        try {
            if (this.f3119k) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f3122n.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f3121m;
        reentrantLock.lock();
        try {
            if (this.f3119k) {
                return;
            }
            this.f3119k = true;
            if (this.f3120l != 0) {
                return;
            }
            synchronized (this) {
                this.f3122n.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final m d(long j5) {
        ReentrantLock reentrantLock = this.f3121m;
        reentrantLock.lock();
        try {
            if (this.f3119k) {
                throw new IllegalStateException("closed");
            }
            this.f3120l++;
            reentrantLock.unlock();
            return new m(this, j5);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
