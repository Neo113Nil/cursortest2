package T2;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.C1557sF;
import com.google.android.gms.internal.ads.InterfaceC1231l3;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import u.AbstractC2470q;
import u.C0;
import u.D0;

/* loaded from: classes.dex */
public final class z implements InterfaceC1231l3, C0 {

    /* renamed from: k, reason: collision with root package name */
    public long f5754k;

    /* renamed from: l, reason: collision with root package name */
    public long f5755l;

    /* renamed from: m, reason: collision with root package name */
    public Object f5756m;

    public z() {
        this.f5754k = -9223372036854775807L;
        this.f5755l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1231l3
    public long a() {
        return this.f5755l;
    }

    @Override // u.C0
    public boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1231l3
    public void c(MessageDigest[] messageDigestArr, long j5, int i) {
        MappedByteBuffer map = ((FileChannel) this.f5756m).map(FileChannel.MapMode.READ_ONLY, this.f5754k + j5, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    public long d(long j5) {
        long j6 = j5 + this.f5755l;
        if (j6 <= 0) {
            return 0L;
        }
        long j7 = this.f5754k;
        long j8 = j6 / j7;
        Long.signum(j8);
        return j6 - (j8 * j7);
    }

    public AbstractC2470q e(long j5, AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        long j6 = this.f5755l;
        long j7 = j5 + j6;
        long j8 = this.f5754k;
        return j7 > j8 ? ((D0) this.f5756m).p(j8 - j6, abstractC2470q, abstractC2470q3, abstractC2470q2) : abstractC2470q2;
    }

    public void f(long j5) {
        synchronized (this.f5756m) {
            this.f5754k = j5;
        }
    }

    @Override // u.C0
    public AbstractC2470q g(long j5, AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        return ((D0) this.f5756m).g(d(j5), abstractC2470q, abstractC2470q2, e(j5, abstractC2470q, abstractC2470q3, abstractC2470q2));
    }

    public void h(Exception exc) {
        boolean z3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f5756m) == null) {
            this.f5756m = exc;
        }
        if (this.f5754k == -9223372036854775807L) {
            synchronized (C1557sF.f15429Z) {
                z3 = C1557sF.f15431b0 > 0;
            }
            if (!z3) {
                this.f5754k = 200 + elapsedRealtime;
            }
        }
        long j5 = this.f5754k;
        if (j5 == -9223372036854775807L || elapsedRealtime < j5) {
            this.f5755l = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.f5756m;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.f5756m;
        this.f5756m = null;
        this.f5754k = -9223372036854775807L;
        this.f5755l = -9223372036854775807L;
        throw exc3;
    }

    public boolean i() {
        synchronized (this.f5756m) {
            try {
                P2.o.f4767B.f4776j.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f5755l + this.f5754k > elapsedRealtime) {
                    return false;
                }
                this.f5755l = elapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u.C0
    public long m(AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        return Long.MAX_VALUE;
    }

    @Override // u.C0
    public AbstractC2470q p(long j5, AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        return ((D0) this.f5756m).p(d(j5), abstractC2470q, abstractC2470q2, e(j5, abstractC2470q, abstractC2470q3, abstractC2470q2));
    }

    @Override // u.C0
    public AbstractC2470q r(AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        return p(Long.MAX_VALUE, abstractC2470q, abstractC2470q2, abstractC2470q3);
    }

    public z(long j5) {
        this.f5755l = Long.MIN_VALUE;
        this.f5756m = new Object();
        this.f5754k = j5;
    }

    public z(FileChannel fileChannel, long j5, long j6) {
        this.f5756m = fileChannel;
        this.f5754k = j5;
        this.f5755l = j6;
    }
}
