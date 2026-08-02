package O1;

import F1.n;
import F1.o;
import F1.s;
import java.util.Timer;
import u2.C1624a;
import v2.AbstractC1664a;
import v2.t;
import w1.AbstractC1706i0;
import w1.AbstractC1707i1;
import w1.P2;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public long f4933a;

    /* renamed from: b, reason: collision with root package name */
    public long f4934b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4935c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4936d;

    public c(long j, int i7) {
        AbstractC1664a.h(((C1624a) this.f4935c) == null);
        this.f4933a = j;
        this.f4934b = j + i7;
    }

    public void a() {
        synchronized (this.f4936d) {
            try {
                Timer timer = (Timer) this.f4935c;
                if (timer != null) {
                    timer.cancel();
                    ((Timer) this.f4935c).purge();
                    this.f4935c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O1.h
    public long b(F1.h hVar) {
        long j = this.f4934b;
        if (j < 0) {
            return -1L;
        }
        long j3 = -(j + 2);
        this.f4934b = -1L;
        return j3;
    }

    public void c() {
        AbstractC1706i0.o(3, "Clear all ConfigMeta data.");
        a();
        AbstractC1707i1.l("appVersion");
        AbstractC1707i1.l("lastFetch");
        AbstractC1707i1.l("lastETag");
        AbstractC1707i1.l("lastKeyId");
        AbstractC1707i1.l("lastRSA");
        AbstractC1707i1.l("variant_ids");
    }

    @Override // O1.h
    public s e() {
        AbstractC1664a.h(this.f4933a != -1);
        return new n((o) this.f4935c, this.f4933a, 0);
    }

    @Override // O1.h
    public void f(long j) {
        long[] jArr = (long[]) ((P2) this.f4936d).f17508b;
        this.f4934b = jArr[t.f(jArr, j, true)];
    }
}
