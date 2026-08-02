package L4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: L4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0222e extends K {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f3081h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f3082j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f3083k;

    /* renamed from: l, reason: collision with root package name */
    public static C0222e f3084l;

    /* renamed from: e, reason: collision with root package name */
    public int f3085e;
    public C0222e f;

    /* renamed from: g, reason: collision with root package name */
    public long f3086g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f3081h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.l.e("newCondition(...)", newCondition);
        i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f3082j = millis;
        f3083k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j5 = this.f3068c;
        boolean z3 = this.f3066a;
        if (j5 != 0 || z3) {
            ReentrantLock reentrantLock = f3081h;
            reentrantLock.lock();
            try {
                if (this.f3085e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f3085e = 1;
                j3.i.b(this, j5, z3);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f3081h;
        reentrantLock.lock();
        try {
            int i5 = this.f3085e;
            this.f3085e = 0;
            if (i5 != 1) {
                return i5 == 2;
            }
            C0222e c0222e = f3084l;
            while (c0222e != null) {
                C0222e c0222e2 = c0222e.f;
                if (c0222e2 == this) {
                    c0222e.f = this.f;
                    this.f = null;
                    return false;
                }
                c0222e = c0222e2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
