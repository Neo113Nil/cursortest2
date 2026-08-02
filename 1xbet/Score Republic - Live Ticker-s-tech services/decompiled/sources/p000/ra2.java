package p000;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ra2 implements qa2, cb2 {

    /* JADX INFO: renamed from: i */
    public static final String f6769i = new String();

    /* JADX INFO: renamed from: a */
    public final Level f6770a;

    /* JADX INFO: renamed from: b */
    public final long f6771b;

    /* JADX INFO: renamed from: c */
    public va2 f6772c;

    /* JADX INFO: renamed from: d */
    public za2 f6773d;

    /* JADX INFO: renamed from: e */
    public hb2 f6774e;

    /* JADX INFO: renamed from: f */
    public vm1 f6775f;

    /* JADX INFO: renamed from: g */
    public Object[] f6776g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ b90 f6777h;

    public ra2(b90 b90Var, Level level) {
        Objects.requireNonNull(b90Var);
        this.f6777h = b90Var;
        sm1.f7153a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.f6772c = null;
        this.f6773d = null;
        this.f6774e = null;
        this.f6775f = null;
        this.f6776g = null;
        p80.m3874s(level, "level");
        this.f6770a = level;
        this.f6771b = nanos;
    }

    @Override // p000.cb2
    /* JADX INFO: renamed from: a */
    public final cb2 mo914a(Throwable th) {
        db2 db2Var = ua2.f7737a;
        p80.m3874s(db2Var, "metadata key");
        if (th != null) {
            m4285e(db2Var, th);
        }
        return this;
    }

    @Override // p000.cb2
    /* JADX INFO: renamed from: b */
    public final cb2 mo915b() {
        ya2 ya2Var = new ya2();
        ya2Var.f9258b = 0;
        if (this.f6773d == null) {
            this.f6773d = ya2Var;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [hb2] */
    /* JADX WARN: Type inference failed for: r10v22, types: [ib2] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r18v0, types: [ra2] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [hb2] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [hb2] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // p000.cb2
    /* JADX INFO: renamed from: c */
    public final void mo916c(String str, Object[] objArr) {
        boolean z;
        va2 va2Var;
        StackTraceElement[] stackTraceElementArr;
        int iM5142z;
        int i;
        na2 na2Var;
        ?? fb2Var;
        ?? r10;
        eb2 eb2Var;
        za2 za2Var = this.f6773d;
        xa2 xa2Var = za2.f9717a;
        if (za2Var == null) {
            ((xm1) sm1.f7153a).getClass();
            xm1.f8994b.getClass();
            this.f6773d = xa2Var;
        }
        ab2 jb2Var = this.f6773d;
        if (jb2Var != xa2Var) {
            va2 va2Var2 = this.f6772c;
            if (va2Var2 != null && va2Var2.f8156f > 0) {
                p80.m3874s(jb2Var, "logSiteKey");
                int i2 = va2Var2.f8156f;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (ua2.f7742f.equals(va2Var2.mo1127u(i3))) {
                        jb2Var = new jb2(jb2Var, va2Var2.mo1128v(i3));
                    }
                }
            }
        } else {
            jb2Var = null;
        }
        d71 d71VarM4284d = m4284d();
        int iMo1126s = d71VarM4284d.mo1126s();
        for (int i4 = 0; i4 < iMo1126s; i4++) {
            if (d71VarM4284d.mo1127u(i4).f1613a == "eye3tag") {
                if (d71VarM4284d.mo1129x(ua2.f7737a) != null) {
                    break;
                }
                db2 db2Var = ua2.f7745i;
                if (d71VarM4284d.mo1129x(db2Var) != null) {
                    break;
                }
                m4285e(db2Var, kb2.f4340k);
                break;
            }
        }
        va2 va2Var3 = this.f6772c;
        int i5 = -1;
        eb2 eb2Var2 = hb2.f3159a;
        if (va2Var3 != null) {
            if (jb2Var != null) {
                int i6 = pa2.f6043d;
                if (va2Var3.mo1129x(ua2.f7740d) != null) {
                    dd0.m1158c();
                    return;
                }
                va2 va2Var4 = this.f6772c;
                ma2 ma2Var = na2.f5353d;
                Integer num = (Integer) va2Var4.mo1129x(ua2.f7738b);
                if (num == null) {
                    fb2Var = 0;
                } else {
                    na2Var = (na2) na2.f5353d.m4578p(jb2Var, va2Var4);
                    if (na2Var.f5354c.incrementAndGet() < num.intValue()) {
                        fb2Var = na2Var;
                        fb2Var = eb2Var2;
                    }
                }
                fb2Var = na2Var;
                va2 va2Var5 = this.f6772c;
                ma2 ma2Var2 = ib2.f3530d;
                Integer num2 = (Integer) va2Var5.mo1129x(ua2.f7739c);
                if (num2 == null || num2.intValue() <= 0) {
                    r10 = 0;
                } else {
                    r10 = (ib2) ib2.f3530d.m4578p(jb2Var, va2Var5);
                    int iNextInt = ((Random) ib2.f3531e.get()).nextInt(num2.intValue());
                    AtomicInteger atomicInteger = r10.f3532c;
                    if ((iNextInt == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) <= 0) {
                        r10 = eb2Var2;
                    }
                }
                if (fb2Var == 0) {
                    fb2Var = r10;
                } else if (r10 != 0 && fb2Var != eb2Var2 && r10 != (eb2Var = hb2.f3160b)) {
                    if (r10 == eb2Var2 || fb2Var == eb2Var) {
                        fb2Var = r10;
                    } else {
                        fb2Var = new fb2(fb2Var, r10);
                    }
                }
                this.f6774e = fb2Var;
                z = fb2Var != eb2Var2;
            }
            va2 va2Var6 = this.f6772c;
            db2 db2Var2 = ua2.f7745i;
            kb2 kb2Var = (kb2) va2Var6.mo1129x(db2Var2);
            if (kb2Var != null) {
                va2 va2Var7 = this.f6772c;
                if (va2Var7 != null && (iM5142z = va2Var7.m5142z(db2Var2)) >= 0) {
                    int i7 = iM5142z + iM5142z;
                    int i8 = i7 + 2;
                    while (true) {
                        i = va2Var7.f8156f;
                        if (i8 >= i + i) {
                            break;
                        }
                        Object obj = va2Var7.f8155e[i8];
                        if (!obj.equals(db2Var2)) {
                            Object[] objArr2 = va2Var7.f8155e;
                            objArr2[i7] = obj;
                            objArr2[i7 + 1] = objArr2[i8 + 1];
                            i7 += 2;
                        }
                        i8 += 2;
                    }
                    va2Var7.f8156f = i - ((i8 - i7) >> 1);
                    while (i7 < i8) {
                        va2Var7.f8155e[i7] = null;
                        i7++;
                    }
                }
                d71 d71VarM4284d2 = m4284d();
                db2 db2Var3 = ua2.f7737a;
                Throwable th = (Throwable) d71VarM4284d2.mo1129x(db2Var3);
                int i9 = kb2Var.f4342j;
                String[] strArr = tn1.f7536a;
                if (i9 <= 0 && i9 != -1) {
                    C0270h1.m2190f("invalid maximum depth: 0");
                    return;
                }
                tn1.f7537b.getClass();
                if (!(i9 == -1 || i9 > 0)) {
                    C0270h1.m2190f("maxDepth must be > 0 or -1");
                    return;
                }
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                String name = ra2.class.getName();
                int i10 = 3;
                boolean z2 = false;
                while (true) {
                    if (i10 >= stackTrace.length) {
                        i10 = -1;
                        break;
                    }
                    if (!stackTrace[i10].getClassName().equals(name)) {
                        if (z2) {
                            break;
                        }
                    } else {
                        z2 = true;
                    }
                    i10++;
                }
                if (i10 == -1) {
                    stackTraceElementArr = new StackTraceElement[0];
                } else {
                    int length = stackTrace.length - i10;
                    if (i9 <= 0 || i9 >= length) {
                        i9 = length;
                    }
                    stackTraceElementArr = new StackTraceElement[i9];
                    System.arraycopy(stackTrace, i10, stackTraceElementArr, 0, i9);
                }
                bb2 bb2Var = new bb2(kb2Var.toString(), th);
                bb2Var.setStackTrace(stackTraceElementArr);
                m4285e(db2Var3, bb2Var);
            }
        }
        hb2 hb2Var = this.f6774e;
        if (hb2Var != null) {
            gb2 gb2Var = (gb2) gb2.f2686c.m4578p(jb2Var, this.f6772c);
            AtomicInteger atomicInteger2 = gb2Var.f2688b;
            AtomicBoolean atomicBoolean = gb2Var.f2687a;
            int iIncrementAndGet = atomicInteger2.incrementAndGet();
            if (hb2Var != eb2Var2 && atomicBoolean.compareAndSet(false, true)) {
                try {
                    hb2Var.mo1399a();
                    atomicBoolean.set(false);
                    atomicInteger2.addAndGet(-iIncrementAndGet);
                    i5 = (-1) + iIncrementAndGet;
                } catch (Throwable th2) {
                    atomicBoolean.set(false);
                    throw th2;
                }
            }
            if (z && i5 > 0 && (va2Var = this.f6772c) != null) {
                va2Var.m5141y(ua2.f7741e, Integer.valueOf(i5));
            }
            z &= i5 >= 0;
        }
        if (z) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            this.f6776g = objArrCopyOf;
            for (Object obj2 : objArrCopyOf) {
            }
            if (str != f6769i) {
                rn1 rn1Var = rn1.f6920b;
                this.f6775f = new vm1(str);
            }
            ((xm1) sm1.f7153a).getClass();
            mn1 mn1VarMo978b = cn1.f1298b.mo978b();
            if (!mn1VarMo978b.f5103a.isEmpty()) {
                d71 d71VarM4284d3 = m4284d();
                ta2 ta2Var = ua2.f7744h;
                mn1 mn1Var = (mn1) d71VarM4284d3.mo1129x(ta2Var);
                if (mn1Var != null) {
                    ln1 ln1Var = mn1Var.f5103a;
                    if (!ln1Var.isEmpty()) {
                        ln1 ln1Var2 = mn1VarMo978b.f5103a;
                        if (!ln1Var2.isEmpty()) {
                            mn1Var = new mn1(new ln1(ln1Var2, ln1Var));
                        }
                        mn1VarMo978b = mn1Var;
                    }
                }
                m4285e(ta2Var, mn1VarMo978b);
            }
            sq1 sq1Var = (sq1) this.f6777h.f793k;
            try {
                un1 un1Var = (un1) un1.f7864k.get();
                int i11 = un1Var.f7865j + 1;
                un1Var.f7865j = i11;
                if (i11 == 0) {
                    throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                }
                try {
                    if (i11 <= 100) {
                        sq1Var.mo728u(this);
                    } else {
                        b90.m607z("unbounded recursion in log statement", this);
                    }
                    un1Var.close();
                } catch (Throwable th3) {
                    try {
                        un1Var.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (RuntimeException e) {
                try {
                    sq1Var.mo729w(e, this);
                } catch (RuntimeException e2) {
                    String name2 = e2.getClass().getName();
                    String message = e2.getMessage();
                    StringBuilder sb = new StringBuilder(name2.length() + 2 + String.valueOf(message).length());
                    sb.append(name2);
                    sb.append(": ");
                    sb.append(message);
                    b90.m607z(sb.toString(), this);
                    try {
                        e2.printStackTrace(System.err);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final d71 m4284d() {
        va2 va2Var = this.f6772c;
        return va2Var != null ? va2Var : sb2.f7093e;
    }

    /* JADX INFO: renamed from: e */
    public final void m4285e(db2 db2Var, Object obj) {
        if (this.f6772c == null) {
            va2 va2Var = new va2();
            va2Var.f8155e = new Object[8];
            va2Var.f8156f = 0;
            this.f6772c = va2Var;
        }
        this.f6772c.m5141y(db2Var, obj);
    }
}
