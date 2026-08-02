package Fc;

import I0.C3173b;
import Kc.C3493a;
import hg.InterfaceC6950c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sc.C9656b;

/* loaded from: classes.dex */
public class f extends AtomicInteger implements InterfaceC6950c {

    /* renamed from: a, reason: collision with root package name */
    InterfaceC6950c f9321a;

    /* renamed from: b, reason: collision with root package name */
    long f9322b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<InterfaceC6950c> f9323c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    final AtomicLong f9324d = new AtomicLong();

    /* renamed from: e, reason: collision with root package name */
    final AtomicLong f9325e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    final boolean f9326f;

    /* renamed from: g, reason: collision with root package name */
    volatile boolean f9327g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f9328h;

    public f(boolean z11) {
        this.f9326f = z11;
    }

    final void a() {
        int i11 = 1;
        long j11 = 0;
        InterfaceC6950c interfaceC6950c = null;
        do {
            InterfaceC6950c interfaceC6950c2 = this.f9323c.get();
            if (interfaceC6950c2 != null) {
                interfaceC6950c2 = this.f9323c.getAndSet(null);
            }
            long j12 = this.f9324d.get();
            if (j12 != 0) {
                j12 = this.f9324d.getAndSet(0L);
            }
            long j13 = this.f9325e.get();
            if (j13 != 0) {
                j13 = this.f9325e.getAndSet(0L);
            }
            InterfaceC6950c interfaceC6950c3 = this.f9321a;
            if (this.f9327g) {
                if (interfaceC6950c3 != null) {
                    interfaceC6950c3.cancel();
                    this.f9321a = null;
                }
                if (interfaceC6950c2 != null) {
                    interfaceC6950c2.cancel();
                }
            } else {
                long j14 = this.f9322b;
                if (j14 != Long.MAX_VALUE) {
                    j14 = Gc.d.b(j14, j12);
                    if (j14 != Long.MAX_VALUE) {
                        j14 -= j13;
                        if (j14 < 0) {
                            C3493a.f(new oc.d(C3173b.b(j14, "More produced than requested: ")));
                            j14 = 0;
                        }
                    }
                    this.f9322b = j14;
                }
                if (interfaceC6950c2 != null) {
                    if (interfaceC6950c3 != null && this.f9326f) {
                        interfaceC6950c3.cancel();
                    }
                    this.f9321a = interfaceC6950c2;
                    if (j14 != 0) {
                        j11 = Gc.d.b(j11, j14);
                        interfaceC6950c = interfaceC6950c2;
                    }
                } else if (interfaceC6950c3 != null && j12 != 0) {
                    j11 = Gc.d.b(j11, j12);
                    interfaceC6950c = interfaceC6950c3;
                }
            }
            i11 = addAndGet(-i11);
        } while (i11 != 0);
        if (j11 != 0) {
            interfaceC6950c.n(j11);
        }
    }

    public final boolean b() {
        return this.f9327g;
    }

    @Override // hg.InterfaceC6950c
    public void cancel() {
        if (this.f9327g) {
            return;
        }
        this.f9327g = true;
        if (getAndIncrement() != 0) {
            return;
        }
        a();
    }

    public void d(InterfaceC6950c interfaceC6950c) {
        h(interfaceC6950c);
    }

    public final boolean e() {
        return this.f9328h;
    }

    public final void f(long j11) {
        if (this.f9328h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            Gc.d.a(this.f9325e, j11);
            if (getAndIncrement() != 0) {
                return;
            }
            a();
            return;
        }
        long j12 = this.f9322b;
        if (j12 != Long.MAX_VALUE) {
            long j13 = j12 - j11;
            if (j13 < 0) {
                C3493a.f(new oc.d(C3173b.b(j13, "More produced than requested: ")));
                j13 = 0;
            }
            this.f9322b = j13;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        a();
    }

    public final void h(InterfaceC6950c interfaceC6950c) {
        if (this.f9327g) {
            interfaceC6950c.cancel();
            return;
        }
        C9656b.c(interfaceC6950c, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            InterfaceC6950c andSet = this.f9323c.getAndSet(interfaceC6950c);
            if (andSet != null && this.f9326f) {
                andSet.cancel();
            }
            if (getAndIncrement() != 0) {
                return;
            }
            a();
            return;
        }
        InterfaceC6950c interfaceC6950c2 = this.f9321a;
        if (interfaceC6950c2 != null && this.f9326f) {
            interfaceC6950c2.cancel();
        }
        this.f9321a = interfaceC6950c;
        long j11 = this.f9322b;
        if (decrementAndGet() != 0) {
            a();
        }
        if (j11 != 0) {
            interfaceC6950c.n(j11);
        }
    }

    @Override // hg.InterfaceC6950c
    public final void n(long j11) {
        if (!g.f(j11) || this.f9328h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            Gc.d.a(this.f9324d, j11);
            if (getAndIncrement() != 0) {
                return;
            }
            a();
            return;
        }
        long j12 = this.f9322b;
        if (j12 != Long.MAX_VALUE) {
            long b11 = Gc.d.b(j12, j11);
            this.f9322b = b11;
            if (b11 == Long.MAX_VALUE) {
                this.f9328h = true;
            }
        }
        InterfaceC6950c interfaceC6950c = this.f9321a;
        if (decrementAndGet() != 0) {
            a();
        }
        if (interfaceC6950c != null) {
            interfaceC6950c.n(j11);
        }
    }
}
