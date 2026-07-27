package j5;

import G0.F;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class d extends y {

    /* renamed from: h, reason: collision with root package name */
    public static final F f10481h;

    /* renamed from: i, reason: collision with root package name */
    public static d f10482i;

    /* renamed from: j, reason: collision with root package name */
    public static final ReentrantLock f10483j;

    /* renamed from: k, reason: collision with root package name */
    public static final Condition f10484k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f10485l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f10486m;

    /* renamed from: e, reason: collision with root package name */
    public int f10487e;

    /* renamed from: f, reason: collision with root package name */
    public int f10488f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f10489g;

    static {
        F f3 = new F(6, (byte) 0);
        f3.f754c = new d[8];
        f10481h = f3;
        ReentrantLock reentrantLock = new ReentrantLock();
        f10483j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.i.d(newCondition, "newCondition(...)");
        f10484k = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f10485l = millis;
        f10486m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j2 = this.f10536c;
        boolean z = this.f10534a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = f10483j;
            reentrantLock.lock();
            try {
                if (this.f10487e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f10487e = 1;
                W1.e.j(this, j2, z);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f10483j;
        reentrantLock.lock();
        try {
            int i2 = this.f10487e;
            this.f10487e = 0;
            if (i2 != 1) {
                return i2 == 2;
            }
            f10481h.d(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        throw null;
    }

    public void k() {
    }
}
