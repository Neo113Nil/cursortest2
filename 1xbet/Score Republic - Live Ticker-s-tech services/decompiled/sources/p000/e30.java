package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class e30 extends AtomicInteger implements y30, ib1 {

    /* JADX INFO: renamed from: j */
    public final y30 f1915j;

    /* JADX INFO: renamed from: k */
    public final r60 f1916k;

    /* JADX INFO: renamed from: l */
    public final int f1917l;

    /* JADX INFO: renamed from: m */
    public final int f1918m;

    /* JADX INFO: renamed from: n */
    public volatile x71 f1919n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f1920o;

    /* JADX INFO: renamed from: p */
    public final C0757u8 f1921p = new C0757u8();

    /* JADX INFO: renamed from: q */
    public volatile boolean f1922q;

    /* JADX INFO: renamed from: r */
    public final AtomicReference f1923r;

    /* JADX INFO: renamed from: s */
    public final AtomicLong f1924s;

    /* JADX INFO: renamed from: t */
    public ib1 f1925t;

    /* JADX INFO: renamed from: u */
    public long f1926u;

    /* JADX INFO: renamed from: v */
    public long f1927v;

    /* JADX INFO: renamed from: w */
    public int f1928w;

    /* JADX INFO: renamed from: x */
    public int f1929x;

    /* JADX INFO: renamed from: y */
    public final int f1930y;

    /* JADX INFO: renamed from: z */
    public static final d30[] f1914z = new d30[0];

    /* JADX INFO: renamed from: A */
    public static final d30[] f1913A = new d30[0];

    public e30(y30 y30Var, wa0 wa0Var, int i, int i2) {
        AtomicReference atomicReference = new AtomicReference();
        this.f1923r = atomicReference;
        this.f1924s = new AtomicLong();
        this.f1915j = y30Var;
        this.f1916k = wa0Var;
        this.f1917l = i;
        this.f1918m = i2;
        this.f1930y = Math.max(1, i >> 1);
        atomicReference.lazySet(f1914z);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1350a() {
        if (this.f1922q) {
            x71 x71Var = this.f1919n;
            if (x71Var != null) {
                x71Var.clear();
                return true;
            }
        } else {
            if (this.f1921p.get() == null) {
                return false;
            }
            x71 x71Var2 = this.f1919n;
            if (x71Var2 != null) {
                x71Var2.clear();
            }
            C0757u8 c0757u8 = this.f1921p;
            c0757u8.getClass();
            Throwable thM4416b = AbstractC0671rx.m4416b(c0757u8);
            if (thM4416b != AbstractC0671rx.f6987a) {
                this.f1915j.onError(thM4416b);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m1351b() {
        if (getAndIncrement() == 0) {
            m1352c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0179  */
    /* JADX WARN: Code duplicated, block: B:115:0x0183  */
    /* JADX WARN: Code duplicated, block: B:117:0x0187  */
    /* JADX WARN: Code duplicated, block: B:133:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0181 A[EDGE_INSN: B:153:0x0181->B:114:0x0181 BREAK  A[LOOP:3: B:65:0x00dc->B:118:0x0188], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x013c A[EDGE_INSN: B:160:0x013c->B:91:0x013c BREAK  A[LOOP:5: B:77:0x00fc->B:85:0x0112], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00de  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:82:0x0107  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112 A[LOOP:5: B:77:0x00fc->B:85:0x0112, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0142  */
    /* JADX WARN: Code duplicated, block: B:95:0x014b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0155  */
    /* JADX INFO: renamed from: c */
    public final void m1352c() {
        boolean z;
        long j;
        long j2;
        boolean z2;
        long j3;
        int i;
        boolean z3;
        int i2;
        d30 d30Var;
        Object objPoll;
        y71 y71Var;
        boolean z4;
        Object obj;
        y30 y30Var = this.f1915j;
        int iAddAndGet = 1;
        while (!m1350a()) {
            x71 x71Var = this.f1919n;
            long jAddAndGet = this.f1924s.get();
            boolean z5 = jAddAndGet == Long.MAX_VALUE;
            long j4 = 0;
            if (x71Var != null) {
                j = 0;
                do {
                    long j5 = 0;
                    obj = null;
                    while (true) {
                        if (jAddAndGet == 0) {
                            z = true;
                            break;
                        }
                        z = true;
                        Object objPoll2 = x71Var.poll();
                        if (m1350a()) {
                            return;
                        }
                        if (objPoll2 == null) {
                            obj = objPoll2;
                            break;
                        }
                        y30Var.onNext(objPoll2);
                        j++;
                        j5++;
                        jAddAndGet--;
                        obj = objPoll2;
                    }
                    if (j5 != 0) {
                        jAddAndGet = z5 ? Long.MAX_VALUE : this.f1924s.addAndGet(-j5);
                    }
                    if (jAddAndGet == 0) {
                        break;
                    }
                } while (obj != null);
            } else {
                z = true;
                j = 0;
            }
            boolean z6 = this.f1920o;
            x71 x71Var2 = this.f1919n;
            d30[] d30VarArr = (d30[]) this.f1923r.get();
            int length = d30VarArr.length;
            if (z6 && ((x71Var2 == null || x71Var2.isEmpty()) && length == 0)) {
                C0757u8 c0757u8 = this.f1921p;
                c0757u8.getClass();
                Throwable thM4416b = AbstractC0671rx.m4416b(c0757u8);
                if (thM4416b != AbstractC0671rx.f6987a) {
                    if (thM4416b == null) {
                        y30Var.onComplete();
                        return;
                    } else {
                        y30Var.onError(thM4416b);
                        return;
                    }
                }
                return;
            }
            if (length != 0) {
                long j6 = this.f1927v;
                int i3 = this.f1928w;
                if (length > i3) {
                    j3 = 1;
                    if (d30VarArr[i3].f1532j != j6) {
                    }
                    i = i3;
                    z3 = false;
                    i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            d30VarArr = d30VarArr;
                            j2 = j4;
                            break;
                        }
                        if (m1350a()) {
                            return;
                        }
                        d30Var = d30VarArr[i];
                        objPoll = null;
                        while (!m1350a()) {
                            y71Var = d30Var.f1537o;
                            if (y71Var == null) {
                                d30VarArr = d30VarArr;
                                j2 = j4;
                            } else {
                                j2 = j4;
                                while (jAddAndGet != j2) {
                                    try {
                                        objPoll = y71Var.poll();
                                        if (objPoll == null) {
                                            break;
                                        }
                                        y30Var.onNext(objPoll);
                                        if (m1350a()) {
                                            return;
                                        }
                                        jAddAndGet -= j3;
                                        j4 += j3;
                                    } catch (Throwable th) {
                                        wo1.m5394u(th);
                                        jb1.m2843a(d30Var);
                                        C0757u8 c0757u9 = this.f1921p;
                                        c0757u9.getClass();
                                        AbstractC0671rx.m4415a(c0757u9, th);
                                        this.f1925t.cancel();
                                        if (m1350a()) {
                                            return;
                                        }
                                        m1354g(d30Var);
                                        i2++;
                                        d30VarArr = d30VarArr;
                                        z3 = z;
                                    }
                                }
                                if (j4 != j2) {
                                    if (z5) {
                                        jAddAndGet = Long.MAX_VALUE;
                                    } else {
                                        jAddAndGet = this.f1924s.addAndGet(-j4);
                                    }
                                    d30Var.m1084a(j4);
                                } else {
                                    d30VarArr = d30VarArr;
                                }
                                if (jAddAndGet == j2 && objPoll != null) {
                                    d30VarArr = d30VarArr;
                                    j4 = j2;
                                }
                            }
                            z4 = d30Var.f1536n;
                            y71 y71Var2 = d30Var.f1537o;
                            if (z4 && (y71Var2 == null || y71Var2.isEmpty())) {
                                m1354g(d30Var);
                                if (m1350a()) {
                                    return;
                                }
                                j += j3;
                                z3 = z;
                            }
                            if (jAddAndGet == j2) {
                                break;
                            }
                            i++;
                            if (i == length) {
                                i = 0;
                            }
                            i2++;
                            d30VarArr = d30VarArr;
                            j4 = j2;
                        }
                        return;
                    }
                    z2 = z3;
                    this.f1928w = i;
                    this.f1927v = d30VarArr[i].f1532j;
                } else {
                    j3 = 1;
                }
                if (length <= i3) {
                    i3 = 0;
                }
                for (int i4 = 0; i4 < length && d30VarArr[i3].f1532j != j6; i4++) {
                    i3++;
                    if (i3 == length) {
                        i3 = 0;
                    }
                }
                this.f1928w = i3;
                this.f1927v = d30VarArr[i3].f1532j;
                i = i3;
                z3 = false;
                i2 = 0;
                while (true) {
                    if (i2 < length) {
                        d30VarArr = d30VarArr;
                        j2 = j4;
                        break;
                    }
                    if (m1350a()) {
                        return;
                    }
                    d30Var = d30VarArr[i];
                    objPoll = null;
                    while (!m1350a()) {
                        y71Var = d30Var.f1537o;
                        if (y71Var == null) {
                            d30VarArr = d30VarArr;
                            j2 = j4;
                        } else {
                            j2 = j4;
                            while (jAddAndGet != j2) {
                                objPoll = y71Var.poll();
                                if (objPoll == null) {
                                    break;
                                    break;
                                }
                                y30Var.onNext(objPoll);
                                if (m1350a()) {
                                    return;
                                }
                                jAddAndGet -= j3;
                                j4 += j3;
                            }
                            if (j4 != j2) {
                                if (z5) {
                                    jAddAndGet = this.f1924s.addAndGet(-j4);
                                } else {
                                    jAddAndGet = Long.MAX_VALUE;
                                }
                                d30Var.m1084a(j4);
                            } else {
                                d30VarArr = d30VarArr;
                            }
                            if (jAddAndGet == j2) {
                            }
                        }
                        z4 = d30Var.f1536n;
                        y71 y71Var3 = d30Var.f1537o;
                        if (z4) {
                            m1354g(d30Var);
                            if (m1350a()) {
                                return;
                            }
                            j += j3;
                            z3 = z;
                        }
                        if (jAddAndGet == j2) {
                            break;
                            break;
                        }
                        i++;
                        if (i == length) {
                            i = 0;
                        }
                        i2++;
                        d30VarArr = d30VarArr;
                        j4 = j2;
                    }
                    return;
                }
                z2 = z3;
                this.f1928w = i;
                this.f1927v = d30VarArr[i].f1532j;
            } else {
                j2 = 0;
                z2 = false;
            }
            long j7 = j;
            if (j7 != j2 && !this.f1922q) {
                this.f1925t.request(j7);
            }
            if (!z2 && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                return;
            }
        }
    }

    @Override // p000.ib1
    public final void cancel() {
        x71 x71Var;
        d30[] d30VarArr;
        if (this.f1922q) {
            return;
        }
        this.f1922q = true;
        this.f1925t.cancel();
        AtomicReference atomicReference = this.f1923r;
        d30[] d30VarArr2 = (d30[]) atomicReference.get();
        d30[] d30VarArr3 = f1913A;
        if (d30VarArr2 != d30VarArr3 && (d30VarArr = (d30[]) atomicReference.getAndSet(d30VarArr3)) != d30VarArr3) {
            for (d30 d30Var : d30VarArr) {
                d30Var.getClass();
                jb1.m2843a(d30Var);
            }
            C0757u8 c0757u8 = this.f1921p;
            c0757u8.getClass();
            Throwable thM4416b = AbstractC0671rx.m4416b(c0757u8);
            if (thM4416b != null && thM4416b != AbstractC0671rx.f6987a) {
                vt1.m5196h(thM4416b);
            }
        }
        if (getAndIncrement() != 0 || (x71Var = this.f1919n) == null) {
            return;
        }
        x71Var.clear();
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: e */
    public final void mo933e(ib1 ib1Var) {
        if (jb1.m2846d(this.f1925t, ib1Var)) {
            this.f1925t = ib1Var;
            this.f1915j.mo933e(this);
            if (this.f1922q) {
                return;
            }
            int i = this.f1917l;
            if (i == Integer.MAX_VALUE) {
                ib1Var.request(Long.MAX_VALUE);
            } else {
                ib1Var.request(i);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final x71 m1353f() {
        x71 t91Var = this.f1919n;
        if (t91Var == null) {
            t91Var = this.f1917l == Integer.MAX_VALUE ? new t91(this.f1918m) : new s91(this.f1917l);
            this.f1919n = t91Var;
        }
        return t91Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m1354g(d30 d30Var) {
        d30[] d30VarArr;
        while (true) {
            AtomicReference atomicReference = this.f1923r;
            d30[] d30VarArr2 = (d30[]) atomicReference.get();
            int length = d30VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (d30VarArr2[i] == d30Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                d30VarArr = f1914z;
            } else {
                d30[] d30VarArr3 = new d30[length - 1];
                System.arraycopy(d30VarArr2, 0, d30VarArr3, 0, i);
                System.arraycopy(d30VarArr2, i + 1, d30VarArr3, i, (length - i) - 1);
                d30VarArr = d30VarArr3;
            }
            while (!atomicReference.compareAndSet(d30VarArr2, d30VarArr)) {
                if (atomicReference.get() != d30VarArr2) {
                }
            }
            return;
        }
    }

    @Override // p000.y30
    public final void onComplete() {
        if (this.f1920o) {
            return;
        }
        this.f1920o = true;
        m1351b();
    }

    @Override // p000.y30
    public final void onError(Throwable th) {
        if (this.f1920o) {
            vt1.m5196h(th);
            return;
        }
        C0757u8 c0757u8 = this.f1921p;
        c0757u8.getClass();
        if (!AbstractC0671rx.m4415a(c0757u8, th)) {
            vt1.m5196h(th);
            return;
        }
        this.f1920o = true;
        for (d30 d30Var : (d30[]) this.f1923r.getAndSet(f1913A)) {
            d30Var.getClass();
            jb1.m2843a(d30Var);
        }
        m1351b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.y30
    public final void onNext(Object obj) {
        if (this.f1920o) {
            return;
        }
        try {
            Object objApply = this.f1916k.apply(obj);
            zg1.m5905p(objApply, "The mapper returned a null Publisher");
            vy0 vy0Var = (vy0) objApply;
            if (vy0Var instanceof Callable) {
                try {
                    Object objCall = ((Callable) vy0Var).call();
                    if (objCall == null) {
                        if (this.f1917l == Integer.MAX_VALUE || this.f1922q) {
                            return;
                        }
                        int i = this.f1929x + 1;
                        this.f1929x = i;
                        int i2 = this.f1930y;
                        if (i == i2) {
                            this.f1929x = 0;
                            this.f1925t.request(i2);
                            return;
                        }
                        return;
                    }
                    if (get() == 0 && compareAndSet(0, 1)) {
                        long j = this.f1924s.get();
                        x71 x71VarM1353f = this.f1919n;
                        if (j == 0 || !(x71VarM1353f == null || x71VarM1353f.isEmpty())) {
                            if (x71VarM1353f == null) {
                                x71VarM1353f = m1353f();
                            }
                            if (!x71VarM1353f.offer(objCall)) {
                                onError(new IllegalStateException("Scalar queue full?!"));
                                return;
                            }
                        } else {
                            this.f1915j.onNext(objCall);
                            if (j != Long.MAX_VALUE) {
                                this.f1924s.decrementAndGet();
                            }
                            if (this.f1917l != Integer.MAX_VALUE && !this.f1922q) {
                                int i3 = this.f1929x + 1;
                                this.f1929x = i3;
                                int i4 = this.f1930y;
                                if (i3 == i4) {
                                    this.f1929x = 0;
                                    this.f1925t.request(i4);
                                }
                            }
                        }
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } else if (!m1353f().offer(objCall)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    } else if (getAndIncrement() != 0) {
                        return;
                    }
                    m1352c();
                    return;
                } catch (Throwable th) {
                    wo1.m5394u(th);
                    C0757u8 c0757u8 = this.f1921p;
                    c0757u8.getClass();
                    AbstractC0671rx.m4415a(c0757u8, th);
                    m1351b();
                    return;
                }
            }
            long j2 = this.f1926u;
            this.f1926u = 1 + j2;
            d30 d30Var = new d30(this, j2);
            AtomicReference atomicReference = this.f1923r;
            while (true) {
                d30[] d30VarArr = (d30[]) atomicReference.get();
                if (d30VarArr == f1913A) {
                    jb1.m2843a(d30Var);
                    return;
                }
                int length = d30VarArr.length;
                d30[] d30VarArr2 = new d30[length + 1];
                System.arraycopy(d30VarArr, 0, d30VarArr2, 0, length);
                d30VarArr2[length] = d30Var;
                do {
                    if (atomicReference.compareAndSet(d30VarArr, d30VarArr2)) {
                        vy0Var.mo1970a(d30Var);
                        return;
                    }
                } while (atomicReference.get() == d30VarArr);
            }
        } catch (Throwable th2) {
            wo1.m5394u(th2);
            this.f1925t.cancel();
            onError(th2);
        }
    }

    @Override // p000.ib1
    public final void request(long j) {
        if (jb1.m2845c(j)) {
            AbstractC0875xf.m5647b(this.f1924s, j);
            m1351b();
        }
    }
}
