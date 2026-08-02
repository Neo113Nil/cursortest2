package L4;

import java.util.concurrent.locks.ReentrantLock;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class m implements I, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final u f3096k;

    /* renamed from: l, reason: collision with root package name */
    public long f3097l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3098m;

    public m(u uVar, long j5) {
        kotlin.jvm.internal.l.f("fileHandle", uVar);
        this.f3096k = uVar;
        this.f3097l = j5;
    }

    @Override // L4.I
    public final K c() {
        return K.f3065d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3098m) {
            return;
        }
        this.f3098m = true;
        u uVar = this.f3096k;
        ReentrantLock reentrantLock = uVar.f3121m;
        reentrantLock.lock();
        try {
            int i = uVar.f3120l - 1;
            uVar.f3120l = i;
            if (i == 0) {
                if (uVar.f3119k) {
                    synchronized (uVar) {
                        uVar.f3122n.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // L4.I
    public final long e(C0226i c0226i, long j5) {
        long j6;
        long j7;
        int i;
        kotlin.jvm.internal.l.f("sink", c0226i);
        if (this.f3098m) {
            throw new IllegalStateException("closed");
        }
        u uVar = this.f3096k;
        long j8 = this.f3097l;
        uVar.getClass();
        if (j5 < 0) {
            throw new IllegalArgumentException(AbstractC2107A.r("byteCount < 0: ", j5).toString());
        }
        long j9 = j5 + j8;
        long j10 = j8;
        while (true) {
            if (j10 >= j9) {
                j6 = -1;
                break;
            }
            D L5 = c0226i.L(1);
            byte[] bArr = L5.f3053a;
            int i5 = L5.f3055c;
            j6 = -1;
            int min = (int) Math.min(j9 - j10, 8192 - i5);
            synchronized (uVar) {
                kotlin.jvm.internal.l.f("array", bArr);
                uVar.f3122n.seek(j10);
                i = 0;
                while (true) {
                    if (i >= min) {
                        break;
                    }
                    int read = uVar.f3122n.read(bArr, i5, min - i);
                    if (read != -1) {
                        i += read;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (L5.f3054b == L5.f3055c) {
                    c0226i.f3090k = L5.a();
                    E.a(L5);
                }
                if (j8 == j10) {
                    j7 = -1;
                }
            } else {
                L5.f3055c += i;
                long j11 = i;
                j10 += j11;
                c0226i.f3091l += j11;
            }
        }
        j7 = j10 - j8;
        if (j7 != j6) {
            this.f3097l += j7;
        }
        return j7;
    }
}
