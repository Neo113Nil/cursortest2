package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: rc */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0650rc implements InterfaceC0690sf {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicLongFieldUpdater f6802k = AtomicLongFieldUpdater.newUpdater(C0650rc.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicLongFieldUpdater f6803l = AtomicLongFieldUpdater.newUpdater(C0650rc.class, "receivers$volatile");

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicLongFieldUpdater f6804m = AtomicLongFieldUpdater.newUpdater(C0650rc.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ AtomicLongFieldUpdater f6805n = AtomicLongFieldUpdater.newUpdater(C0650rc.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6806o = AtomicReferenceFieldUpdater.newUpdater(C0650rc.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6807p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6808q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6809r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6810s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ long f6811t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ long f6812u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ long f6813v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ long f6814w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ long f6815x;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: j */
    public final int f6816j;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = c62.f1155a;
        f6815x = unsafe.objectFieldOffset(C0650rc.class.getDeclaredField("sendSegment$volatile"));
        f6807p = AtomicReferenceFieldUpdater.newUpdater(C0650rc.class, Object.class, "receiveSegment$volatile");
        f6814w = unsafe.objectFieldOffset(C0650rc.class.getDeclaredField("receiveSegment$volatile"));
        f6808q = AtomicReferenceFieldUpdater.newUpdater(C0650rc.class, Object.class, "bufferEndSegment$volatile");
        f6812u = unsafe.objectFieldOffset(C0650rc.class.getDeclaredField("bufferEndSegment$volatile"));
        f6809r = AtomicReferenceFieldUpdater.newUpdater(C0650rc.class, Object.class, "_closeCause$volatile");
        f6811t = unsafe.objectFieldOffset(C0650rc.class.getDeclaredField("_closeCause$volatile"));
        f6810s = AtomicReferenceFieldUpdater.newUpdater(C0650rc.class, Object.class, "closeHandler$volatile");
        f6813v = unsafe.objectFieldOffset(C0650rc.class.getDeclaredField("closeHandler$volatile"));
    }

    public C0650rc(int i) {
        this.f6816j = i;
        if (i < 0) {
            C0270h1.m2186b(AbstractC0024an.m282e(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        C0061bg c0061bg = AbstractC0724tc.f7411a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f6804m.get(this);
        C0061bg c0061bg2 = new C0061bg(0L, null, this, 3);
        this.sendSegment$volatile = c0061bg2;
        this.receiveSegment$volatile = c0061bg2;
        if (m4335y()) {
            c0061bg2 = AbstractC0724tc.f7411a;
            c0061bg2.getClass();
        }
        this.bufferEndSegment$volatile = c0061bg2;
        this._closeCause$volatile = AbstractC0724tc.f7429s;
    }

    /* JADX INFO: renamed from: B */
    public static Object m4303B(C0650rc c0650rc, C0662ro c0662ro) throws Throwable {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6807p;
        atomicReferenceFieldUpdater.getClass();
        if (c0650rc == null) {
            dd0.m1158c();
            return null;
        }
        C0061bg c0061bg = (C0061bg) c62.f1155a.getObjectVolatile(c0650rc, f6814w);
        while (true) {
            c0650rc.getClass();
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6802k;
            if (c0650rc.m4334w(true, atomicLongFieldUpdater.get(c0650rc))) {
                Throwable thM4329q = c0650rc.m4329q();
                int i = v91.f8139a;
                throw thM4329q;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f6803l;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(c0650rc);
            long j = AbstractC0724tc.f7412b;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (c0061bg.f2635e != j2) {
                C0061bg c0061bgM4326n = c0650rc.m4326n(j2, c0061bg);
                if (c0061bgM4326n == null) {
                    continue;
                } else {
                    c0061bg = c0061bgM4326n;
                }
            }
            Object objM4314I = c0650rc.m4314I(c0061bg, i2, andIncrement, null);
            Object obj = AbstractC0724tc.f7423m;
            if (objM4314I == obj) {
                C0270h1.m2191g("unexpected");
                return null;
            }
            Object obj2 = AbstractC0724tc.f7425o;
            if (objM4314I != obj2) {
                if (objM4314I != AbstractC0724tc.f7424n) {
                    c0061bg.m951a();
                    return objM4314I;
                }
                C0136df c0136dfM3650l = o80.m3650l(d71.m1111f(c0662ro));
                try {
                    Object objM4314I2 = c0650rc.m4314I(c0061bg, i2, andIncrement, c0136dfM3650l);
                    if (objM4314I2 == obj) {
                        c0136dfM3650l.mo474a(c0061bg, i2);
                    } else if (objM4314I2 == obj2) {
                        if (andIncrement < c0650rc.m4331s()) {
                            c0061bg.m951a();
                        }
                        C0061bg c0061bg2 = (C0061bg) atomicReferenceFieldUpdater.get(c0650rc);
                        for (boolean z = true; !c0650rc.m4334w(z, atomicLongFieldUpdater.get(c0650rc)); z = true) {
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(c0650rc);
                            long j3 = AbstractC0724tc.f7412b;
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                            long j4 = andIncrement2 / j3;
                            int i3 = (int) (andIncrement2 % j3);
                            if (c0061bg2.f2635e != j4) {
                                C0061bg c0061bgM4326n2 = c0650rc.m4326n(j4, c0061bg2);
                                if (c0061bgM4326n2 == null) {
                                    continue;
                                } else {
                                    c0061bg2 = c0061bgM4326n2;
                                }
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                            }
                            Object objM4314I3 = c0650rc.m4314I(c0061bg2, i3, andIncrement2, c0136dfM3650l);
                            if (objM4314I3 == AbstractC0724tc.f7423m) {
                                c0136dfM3650l.mo474a(c0061bg2, i3);
                            } else if (objM4314I3 == AbstractC0724tc.f7425o) {
                                if (andIncrement2 < c0650rc.m4331s()) {
                                    c0061bg2.m951a();
                                }
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                            } else {
                                if (objM4314I3 == AbstractC0724tc.f7424n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c0061bg2.m951a();
                                c0136dfM3650l.m1178E(objM4314I3, null);
                            }
                        }
                        c0136dfM3650l.mo476f(new o21(c0650rc.m4329q()));
                    } else {
                        c0061bg.m951a();
                        c0136dfM3650l.m1178E(objM4314I2, null);
                    }
                    return c0136dfM3650l.m1195u();
                } catch (Throwable th) {
                    c0136dfM3650l.m1176C();
                    throw th;
                }
            }
            if (andIncrement < c0650rc.m4331s()) {
                c0061bg.m951a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0155  */
    /* JADX WARN: Code duplicated, block: B:89:0x0158 A[RETURN] */
    /* JADX INFO: renamed from: D */
    public static Object m4304D(C0650rc c0650rc, Object obj, InterfaceC0808vm interfaceC0808vm) throws Throwable {
        kf1 kf1Var;
        Object objM1195u;
        EnumC0513nn enumC0513nn;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6806o;
        atomicReferenceFieldUpdater.getClass();
        C0061bg c0061bg = (C0061bg) c62.f1155a.getObjectVolatile(c0650rc, f6815x);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6802k;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c0650rc);
            long j = andIncrement & 1152921504606846975L;
            boolean zM4334w = c0650rc.m4334w(false, andIncrement);
            int i = AbstractC0724tc.f7412b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = c0061bg.f2635e;
            EnumC0513nn enumC0513nn2 = EnumC0513nn.f5459j;
            kf1Var = kf1.f4365a;
            if (j4 != j3) {
                C0061bg c0061bgM4327o = c0650rc.m4327o(j3, c0061bg);
                if (c0061bgM4327o != null) {
                    c0061bg = c0061bgM4327o;
                } else if (zM4334w) {
                    Object objM4309A = c0650rc.m4309A(interfaceC0808vm, obj);
                    if (objM4309A == enumC0513nn2) {
                        return objM4309A;
                    }
                }
            }
            int iM4307b = m4307b(c0650rc, c0061bg, i2, obj, j, null, zM4334w);
            if (iM4307b == 0) {
                c0061bg.m951a();
                return kf1Var;
            }
            if (iM4307b != 1) {
                if (iM4307b == 2) {
                    if (!zM4334w) {
                        break;
                    }
                    c0061bg.m1990m();
                    Object objM4309A2 = c0650rc.m4309A(interfaceC0808vm, obj);
                    if (objM4309A2 == enumC0513nn2) {
                        return objM4309A2;
                    }
                } else {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = f6803l;
                    if (iM4307b == 3) {
                        C0136df c0136dfM3650l = o80.m3650l(d71.m1111f(interfaceC0808vm));
                        try {
                            int iM4307b2 = m4307b(c0650rc, c0061bg, i2, obj, j, c0136dfM3650l, false);
                            if (iM4307b2 != 0) {
                                if (iM4307b2 == 1) {
                                    enumC0513nn2 = enumC0513nn2;
                                    c0136dfM3650l.mo476f(kf1Var);
                                } else if (iM4307b2 != 2) {
                                    if (iM4307b2 == 4) {
                                        enumC0513nn2 = enumC0513nn2;
                                        if (j < atomicLongFieldUpdater2.get(c0650rc)) {
                                            c0061bg.m951a();
                                        }
                                    } else {
                                        if (iM4307b2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c0061bg.m951a();
                                        C0061bg c0061bg2 = (C0061bg) atomicReferenceFieldUpdater.get(c0650rc);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c0650rc);
                                            long j5 = andIncrement2 & 1152921504606846975L;
                                            boolean zM4334w2 = c0650rc.m4334w(false, andIncrement2);
                                            int i3 = AbstractC0724tc.f7412b;
                                            long j6 = i3;
                                            atomicLongFieldUpdater = atomicLongFieldUpdater;
                                            long j7 = j5 / j6;
                                            int i4 = (int) (j5 % j6);
                                            enumC0513nn2 = enumC0513nn2;
                                            if (c0061bg2.f2635e != j7) {
                                                C0061bg c0061bgM4327o2 = c0650rc.m4327o(j7, c0061bg2);
                                                if (c0061bgM4327o2 != null) {
                                                    c0061bg2 = c0061bgM4327o2;
                                                } else if (zM4334w2) {
                                                }
                                            }
                                            int iM4307b3 = m4307b(c0650rc, c0061bg2, i4, obj, j5, c0136dfM3650l, zM4334w2);
                                            if (iM4307b3 == 0) {
                                                c0061bg2.m951a();
                                            } else if (iM4307b3 != 1) {
                                                if (iM4307b3 == 2) {
                                                    if (!zM4334w2) {
                                                        c0136dfM3650l.mo474a(c0061bg2, i4 + i3);
                                                        break;
                                                    }
                                                    c0061bg2.m1990m();
                                                } else {
                                                    if (iM4307b3 == 3) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    if (iM4307b3 != 4) {
                                                        if (iM4307b3 == 5) {
                                                            c0061bg2.m951a();
                                                        }
                                                    } else if (j5 < atomicLongFieldUpdater2.get(c0650rc)) {
                                                        c0061bg2.m951a();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    m4306a(c0650rc, obj, c0136dfM3650l);
                                    break;
                                } else {
                                    enumC0513nn2 = enumC0513nn2;
                                    c0136dfM3650l.mo474a(c0061bg, i2 + i);
                                }
                                objM1195u = c0136dfM3650l.m1195u();
                                enumC0513nn = enumC0513nn2;
                                if (objM1195u != enumC0513nn) {
                                    objM1195u = kf1Var;
                                }
                                if (objM1195u == enumC0513nn) {
                                    return objM1195u;
                                }
                            } else {
                                enumC0513nn2 = enumC0513nn2;
                                c0061bg.m951a();
                            }
                            c0136dfM3650l.mo476f(kf1Var);
                            objM1195u = c0136dfM3650l.m1195u();
                            enumC0513nn = enumC0513nn2;
                            if (objM1195u != enumC0513nn) {
                                objM1195u = kf1Var;
                            }
                            if (objM1195u == enumC0513nn) {
                                return objM1195u;
                            }
                        } catch (Throwable th) {
                            c0136dfM3650l.m1176C();
                            throw th;
                        }
                    } else if (iM4307b == 4) {
                        if (j < atomicLongFieldUpdater2.get(c0650rc)) {
                            c0061bg.m951a();
                        }
                        Object objM4309A3 = c0650rc.m4309A(interfaceC0808vm, obj);
                        if (objM4309A3 == enumC0513nn2) {
                            return objM4309A3;
                        }
                    } else if (iM4307b == 5) {
                        c0061bg.m951a();
                    }
                }
            } else {
                break;
            }
        }
        return kf1Var;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m4305G(Object obj) {
        if (!(obj instanceof InterfaceC0060bf)) {
            dd0.m1162g(obj, "Unexpected waiter: ");
            return false;
        }
        InterfaceC0060bf interfaceC0060bf = (InterfaceC0060bf) obj;
        C0061bg c0061bg = AbstractC0724tc.f7411a;
        g72 g72VarMo477h = interfaceC0060bf.mo477h(kf1.f4365a, null);
        if (g72VarMo477h == null) {
            return false;
        }
        interfaceC0060bf.mo478n(g72VarMo477h);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static final void m4306a(C0650rc c0650rc, Object obj, C0136df c0136df) {
        c0136df.mo476f(new o21(c0650rc.m4330r()));
    }

    /* JADX INFO: renamed from: b */
    public static final int m4307b(C0650rc c0650rc, C0061bg c0061bg, int i, Object obj, long j, Object obj2, boolean z) {
        c0061bg.m648r(i, obj);
        if (z) {
            return c0650rc.m4315J(c0061bg, i, obj, j, obj2, z);
        }
        Object objM646p = c0061bg.m646p(i);
        if (objM646p == null) {
            if (c0650rc.m4317c(j)) {
                if (c0061bg.m645o(i, null, AbstractC0724tc.f7414d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c0061bg.m645o(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM646p instanceof pi1) {
            c0061bg.m648r(i, null);
            if (c0650rc.m4312F(objM646p, obj)) {
                c0061bg.m649s(i, AbstractC0724tc.f7419i);
                return 0;
            }
            g72 g72Var = AbstractC0724tc.f7421k;
            if (c0061bg.f856h.getAndSet((i * 2) + 1, g72Var) == g72Var) {
                return 5;
            }
            c0061bg.m647q(i, true);
            return 5;
        }
        return c0650rc.m4315J(c0061bg, i, obj, j, obj2, z);
    }

    /* JADX INFO: renamed from: u */
    public static void m4308u(C0650rc c0650rc) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6805n;
        if ((atomicLongFieldUpdater.addAndGet(c0650rc, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c0650rc) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final Object m4309A(InterfaceC0808vm interfaceC0808vm, Object obj) throws Throwable {
        C0136df c0136df = new C0136df(1, d71.m1111f(interfaceC0808vm));
        c0136df.m1197w();
        c0136df.mo476f(new o21(m4330r()));
        Object objM1195u = c0136df.m1195u();
        return objM1195u == EnumC0513nn.f5459j ? objM1195u : kf1.f4365a;
    }

    /* JADX INFO: renamed from: C */
    public final void m4310C(pi1 pi1Var, boolean z) {
        if (pi1Var instanceof InterfaceC0060bf) {
            ((InterfaceC0808vm) pi1Var).mo476f(new o21(z ? m4329q() : m4330r()));
            return;
        }
        if (!(pi1Var instanceof C0613qc)) {
            dd0.m1162g(pi1Var, "Unexpected waiter: ");
            return;
        }
        C0613qc c0613qc = (C0613qc) pi1Var;
        C0136df c0136df = c0613qc.f6462k;
        c0136df.getClass();
        c0613qc.f6462k = null;
        c0613qc.f6461j = AbstractC0724tc.f7422l;
        Throwable thM4328p = c0613qc.f6463l.m4328p();
        if (thM4328p == null) {
            c0136df.mo476f(Boolean.FALSE);
        } else {
            c0136df.mo476f(new o21(thM4328p));
        }
    }

    /* JADX INFO: renamed from: E */
    public final Object m4311E() {
        C0061bg c0061bg;
        C0017ag c0017ag = n80.f5328a;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6803l;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f6802k;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (m4334w(true, j2)) {
            return new C0949zf(m4328p());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return c0017ag;
        }
        Object obj = AbstractC0724tc.f7421k;
        f6807p.getClass();
        C0061bg c0061bg2 = (C0061bg) c62.f1155a.getObjectVolatile(this, f6814w);
        while (!this.m4334w(true, atomicLongFieldUpdater2.get(this))) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = AbstractC0724tc.f7412b;
            long j4 = andIncrement / j3;
            int i = (int) (andIncrement % j3);
            if (c0061bg2.f2635e != j4) {
                C0061bg c0061bgM4326n = this.m4326n(j4, c0061bg2);
                if (c0061bgM4326n == null) {
                    continue;
                } else {
                    c0061bg = c0061bgM4326n;
                }
            } else {
                c0061bg = c0061bg2;
            }
            C0650rc c0650rc = this;
            Object objM4314I = c0650rc.m4314I(c0061bg, i, andIncrement, obj);
            c0061bg2 = c0061bg;
            if (objM4314I == AbstractC0724tc.f7423m) {
                pi1 pi1Var = obj instanceof pi1 ? (pi1) obj : null;
                if (pi1Var != null) {
                    pi1Var.mo474a(c0061bg2, i);
                }
                c0650rc.m4316K(andIncrement);
                c0061bg2.m1990m();
                return c0017ag;
            }
            if (objM4314I != AbstractC0724tc.f7425o) {
                if (objM4314I != AbstractC0724tc.f7424n) {
                    c0061bg2.m951a();
                    return objM4314I;
                }
                C0270h1.m2191g("unexpected");
                return null;
            }
            if (andIncrement < c0650rc.m4331s()) {
                c0061bg2.m951a();
            }
            this = c0650rc;
        }
        return new C0949zf(this.m4328p());
    }

    /* JADX INFO: renamed from: F */
    public final boolean m4312F(Object obj, Object obj2) {
        if (!(obj instanceof C0613qc)) {
            if (!(obj instanceof InterfaceC0060bf)) {
                dd0.m1162g(obj, "Unexpected receiver type: ");
                return false;
            }
            InterfaceC0060bf interfaceC0060bf = (InterfaceC0060bf) obj;
            C0061bg c0061bg = AbstractC0724tc.f7411a;
            g72 g72VarMo477h = interfaceC0060bf.mo477h(obj2, null);
            if (g72VarMo477h == null) {
                return false;
            }
            interfaceC0060bf.mo478n(g72VarMo477h);
            return true;
        }
        C0613qc c0613qc = (C0613qc) obj;
        C0136df c0136df = c0613qc.f6462k;
        c0136df.getClass();
        c0613qc.f6462k = null;
        c0613qc.f6461j = obj2;
        Boolean bool = Boolean.TRUE;
        C0061bg c0061bg2 = AbstractC0724tc.f7411a;
        g72 g72VarMo477h2 = c0136df.mo477h(bool, null);
        if (g72VarMo477h2 == null) {
            return false;
        }
        c0136df.mo478n(g72VarMo477h2);
        return true;
    }

    /* JADX INFO: renamed from: H */
    public final Object m4313H(Object obj) {
        C0061bg c0061bgM4327o;
        nw0 nw0Var = AbstractC0724tc.f7414d;
        f6806o.getClass();
        C0061bg c0061bg = (C0061bg) c62.f1155a.getObjectVolatile(this, f6815x);
        while (true) {
            long andIncrement = f6802k.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zM4334w = this.m4334w(false, andIncrement);
            int i = AbstractC0724tc.f7412b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c0061bg.f2635e != j3) {
                c0061bgM4327o = this.m4327o(j3, c0061bg);
                if (c0061bgM4327o == null) {
                    if (zM4334w) {
                        return new C0949zf(this.m4330r());
                    }
                }
            } else {
                c0061bgM4327o = c0061bg;
            }
            Object obj2 = obj;
            int iM4307b = m4307b(this, c0061bgM4327o, i2, obj2, j, nw0Var, zM4334w);
            C0650rc c0650rc = this;
            c0061bg = c0061bgM4327o;
            kf1 kf1Var = kf1.f4365a;
            if (iM4307b == 0) {
                c0061bg.m951a();
                return kf1Var;
            }
            if (iM4307b != 1) {
                if (iM4307b != 2) {
                    if (iM4307b == 3) {
                        C0270h1.m2191g("unexpected");
                        return null;
                    }
                    if (iM4307b == 4) {
                        if (j < f6803l.get(c0650rc)) {
                            c0061bg.m951a();
                        }
                        return new C0949zf(c0650rc.m4330r());
                    }
                    if (iM4307b == 5) {
                        c0061bg.m951a();
                    }
                    this = c0650rc;
                    obj = obj2;
                } else {
                    if (zM4334w) {
                        c0061bg.m1990m();
                        return new C0949zf(c0650rc.m4330r());
                    }
                    pi1 pi1Var = nw0Var instanceof pi1 ? (pi1) nw0Var : null;
                    if (pi1Var != null) {
                        pi1Var.mo474a(c0061bg, i2 + i);
                    }
                    c0650rc.m4323j((c0061bg.f2635e * j2) + ((long) i2));
                }
            }
            return kf1Var;
        }
    }

    /* JADX INFO: renamed from: I */
    public final Object m4314I(C0061bg c0061bg, int i, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = c0061bg.f856h;
        Object objM646p = c0061bg.m646p(i);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6802k;
        if (objM646p == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC0724tc.f7424n;
                }
                if (c0061bg.m645o(i, objM646p, obj)) {
                    m4324l();
                    return AbstractC0724tc.f7423m;
                }
            }
        } else if (objM646p == AbstractC0724tc.f7414d && c0061bg.m645o(i, objM646p, AbstractC0724tc.f7419i)) {
            m4324l();
            Object obj2 = atomicReferenceArray.get(i * 2);
            c0061bg.m648r(i, null);
            return obj2;
        }
        while (true) {
            Object objM646p2 = c0061bg.m646p(i);
            if (objM646p2 == null || objM646p2 == AbstractC0724tc.f7415e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c0061bg.m645o(i, objM646p2, AbstractC0724tc.f7418h)) {
                        m4324l();
                        return AbstractC0724tc.f7425o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC0724tc.f7424n;
                    }
                    if (c0061bg.m645o(i, objM646p2, obj)) {
                        m4324l();
                        return AbstractC0724tc.f7423m;
                    }
                }
            } else if (objM646p2 != AbstractC0724tc.f7414d) {
                g72 g72Var = AbstractC0724tc.f7420j;
                if (objM646p2 == g72Var) {
                    return AbstractC0724tc.f7425o;
                }
                if (objM646p2 == AbstractC0724tc.f7418h) {
                    return AbstractC0724tc.f7425o;
                }
                if (objM646p2 == AbstractC0724tc.f7422l) {
                    m4324l();
                    return AbstractC0724tc.f7425o;
                }
                if (objM646p2 != AbstractC0724tc.f7417g && c0061bg.m645o(i, objM646p2, AbstractC0724tc.f7416f)) {
                    boolean z = objM646p2 instanceof qi1;
                    if (z) {
                        objM646p2 = ((qi1) objM646p2).f6505a;
                    }
                    if (m4305G(objM646p2)) {
                        c0061bg.m649s(i, AbstractC0724tc.f7419i);
                        m4324l();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        c0061bg.m648r(i, null);
                        return obj3;
                    }
                    c0061bg.m649s(i, g72Var);
                    c0061bg.m1990m();
                    if (z) {
                        m4324l();
                    }
                    return AbstractC0724tc.f7425o;
                }
            } else if (c0061bg.m645o(i, objM646p2, AbstractC0724tc.f7419i)) {
                m4324l();
                Object obj4 = atomicReferenceArray.get(i * 2);
                c0061bg.m648r(i, null);
                return obj4;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final int m4315J(C0061bg c0061bg, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objM646p = c0061bg.m646p(i);
            if (objM646p == null) {
                if (!m4317c(j) || z) {
                    if (z) {
                        if (c0061bg.m645o(i, null, AbstractC0724tc.f7420j)) {
                            c0061bg.m1990m();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c0061bg.m645o(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c0061bg.m645o(i, null, AbstractC0724tc.f7414d)) {
                    break;
                }
            } else {
                if (objM646p != AbstractC0724tc.f7415e) {
                    g72 g72Var = AbstractC0724tc.f7421k;
                    if (objM646p == g72Var) {
                        c0061bg.m648r(i, null);
                        return 5;
                    }
                    if (objM646p == AbstractC0724tc.f7418h) {
                        c0061bg.m648r(i, null);
                        return 5;
                    }
                    if (objM646p == AbstractC0724tc.f7422l) {
                        c0061bg.m648r(i, null);
                        m4322i();
                        return 4;
                    }
                    c0061bg.m648r(i, null);
                    if (objM646p instanceof qi1) {
                        objM646p = ((qi1) objM646p).f6505a;
                    }
                    if (m4312F(objM646p, obj)) {
                        c0061bg.m649s(i, AbstractC0724tc.f7419i);
                        return 0;
                    }
                    if (c0061bg.f856h.getAndSet((i * 2) + 1, g72Var) != g72Var) {
                        c0061bg.m647q(i, true);
                    }
                    return 5;
                }
                if (c0061bg.m645o(i, objM646p, AbstractC0724tc.f7414d)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: K */
    public final void m4316K(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C0650rc c0650rc = this;
        if (c0650rc.m4335y()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f6804m;
            if (atomicLongFieldUpdater.get(c0650rc) > j) {
                break;
            } else {
                c0650rc = this;
            }
        }
        int i = AbstractC0724tc.f7413c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f6805n;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(c0650rc);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(c0650rc)) && j2 == atomicLongFieldUpdater.get(c0650rc)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(c0650rc);
                    if (atomicLongFieldUpdater2.compareAndSet(c0650rc, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        c0650rc = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(c0650rc);
                    long j5 = atomicLongFieldUpdater2.get(c0650rc);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(c0650rc)) {
                        break;
                    }
                    if (z) {
                        c0650rc = this;
                    } else {
                        c0650rc = this;
                        atomicLongFieldUpdater2.compareAndSet(c0650rc, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(c0650rc);
                    if (atomicLongFieldUpdater2.compareAndSet(c0650rc, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        c0650rc = this;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4317c(long j) {
        return j < f6804m.get(this) || j < f6803l.get(this) + ((long) this.f6816j);
    }

    /* JADX INFO: renamed from: d */
    public final C0061bg m4318d() {
        f6808q.getClass();
        Unsafe unsafe = c62.f1155a;
        Object objectVolatile = unsafe.getObjectVolatile(this, f6812u);
        f6806o.getClass();
        C0061bg c0061bg = (C0061bg) unsafe.getObjectVolatile(this, f6815x);
        if (c0061bg.f2635e > ((C0061bg) objectVolatile).f2635e) {
            objectVolatile = c0061bg;
        }
        f6807p.getClass();
        C0061bg c0061bg2 = (C0061bg) unsafe.getObjectVolatile(this, f6814w);
        if (c0061bg2.f2635e > ((C0061bg) objectVolatile).f2635e) {
            objectVolatile = c0061bg2;
        }
        AbstractC0102cl abstractC0102cl = (AbstractC0102cl) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC0102cl.f1281a;
            Object objM954d = abstractC0102cl.m954d();
            if (objM954d == a90.f78a) {
                break;
            }
            AbstractC0102cl abstractC0102cl2 = (AbstractC0102cl) objM954d;
            if (abstractC0102cl2 != null) {
                abstractC0102cl = abstractC0102cl2;
            } else if (abstractC0102cl.m957g()) {
                break;
            }
        }
        return (C0061bg) abstractC0102cl;
    }

    @Override // p000.InterfaceC0690sf
    /* JADX INFO: renamed from: e */
    public final void mo4319e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m4320f(cancellationException, true);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4320f(Throwable th, boolean z) {
        C0650rc c0650rc;
        boolean z2;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6802k;
        if (!z) {
            c0650rc = this;
            break;
        }
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            if (((int) (j4 >> 60)) != 0) {
                c0650rc = this;
                break;
            }
            C0061bg c0061bg = AbstractC0724tc.f7411a;
            c0650rc = this;
            if (atomicLongFieldUpdater.compareAndSet(c0650rc, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                break;
            }
            this = c0650rc;
        }
        g72 g72Var = AbstractC0724tc.f7429s;
        while (true) {
            f6809r.getClass();
            C0650rc c0650rc2 = c0650rc;
            Unsafe unsafe = c62.f1155a;
            long j5 = f6811t;
            Throwable th2 = th;
            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(c0650rc2, j5, g72Var, th2);
            c0650rc = c0650rc2;
            if (zCompareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(c0650rc, j5) != g72Var) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(c0650rc);
            } while (!atomicLongFieldUpdater.compareAndSet(c0650rc, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(c0650rc);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c0650rc, j, j2));
        }
        c0650rc.m4322i();
        if (z2) {
            c0650rc.m4333v();
        }
        return z2;
    }

    @Override // p000.o61
    /* JADX INFO: renamed from: g */
    public Object mo1435g(InterfaceC0808vm interfaceC0808vm, Object obj) {
        return m4304D(this, obj, interfaceC0808vm);
    }

    /* JADX INFO: renamed from: h */
    public final C0061bg m4321h(long j) {
        long j2;
        C0061bg c0061bgM4318d = m4318d();
        if (mo1437x()) {
            C0061bg c0061bg = c0061bgM4318d;
            loop0: while (true) {
                int i = AbstractC0724tc.f7412b - 1;
                while (true) {
                    if (-1 < i) {
                        j2 = (c0061bg.f2635e * ((long) AbstractC0724tc.f7412b)) + ((long) i);
                        if (j2 >= f6803l.get(this)) {
                            while (true) {
                                Object objM646p = c0061bg.m646p(i);
                                if (objM646p != null && objM646p != AbstractC0724tc.f7415e) {
                                    if (objM646p != AbstractC0724tc.f7414d) {
                                        break;
                                    }
                                    break loop0;
                                }
                                if (c0061bg.m645o(i, objM646p, AbstractC0724tc.f7422l)) {
                                    c0061bg.m1990m();
                                    break;
                                }
                            }
                            i--;
                        }
                    } else {
                        c0061bg = (C0061bg) c0061bg.m955e();
                        if (c0061bg == null) {
                        }
                    }
                    j2 = -1;
                    break loop0;
                }
            }
            if (j2 != -1) {
                m4323j(j2);
            }
        }
        Object objM194i = null;
        loop3: for (C0061bg c0061bg2 = c0061bgM4318d; c0061bg2 != null; c0061bg2 = (C0061bg) c0061bg2.m955e()) {
            for (int i2 = AbstractC0724tc.f7412b - 1; -1 < i2; i2--) {
                if ((c0061bg2.f2635e * ((long) AbstractC0724tc.f7412b)) + ((long) i2) < j) {
                    break loop3;
                }
                while (true) {
                    Object objM646p2 = c0061bg2.m646p(i2);
                    if (objM646p2 != null && objM646p2 != AbstractC0724tc.f7415e) {
                        if (!(objM646p2 instanceof qi1)) {
                            if (!(objM646p2 instanceof pi1)) {
                                break;
                            }
                            if (c0061bg2.m645o(i2, objM646p2, AbstractC0724tc.f7422l)) {
                                objM194i = af0.m194i(objM194i, objM646p2);
                                c0061bg2.m647q(i2, true);
                                break;
                            }
                        } else {
                            if (c0061bg2.m645o(i2, objM646p2, AbstractC0724tc.f7422l)) {
                                objM194i = af0.m194i(objM194i, ((qi1) objM646p2).f6505a);
                                c0061bg2.m647q(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (c0061bg2.m645o(i2, objM646p2, AbstractC0724tc.f7422l)) {
                            c0061bg2.m1990m();
                            break;
                        }
                    }
                }
            }
        }
        if (objM194i != null) {
            if (!(objM194i instanceof ArrayList)) {
                m4310C((pi1) objM194i, true);
                return c0061bgM4318d;
            }
            ArrayList arrayList = (ArrayList) objM194i;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m4310C((pi1) arrayList.get(size), true);
            }
        }
        return c0061bgM4318d;
    }

    /* JADX INFO: renamed from: i */
    public final void m4322i() {
        m4334w(false, f6802k.get(this));
    }

    /* JADX INFO: renamed from: j */
    public final void m4323j(long j) {
        f6807p.getClass();
        C0061bg c0061bg = (C0061bg) c62.f1155a.getObjectVolatile(this, f6814w);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6803l;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.f6816j) + j2, f6804m.get(this))) {
                return;
            }
            this = this;
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = AbstractC0724tc.f7412b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c0061bg.f2635e != j4) {
                    C0061bg c0061bgM4326n = this.m4326n(j4, c0061bg);
                    if (c0061bgM4326n != null) {
                        c0061bg = c0061bgM4326n;
                    }
                }
                C0061bg c0061bg2 = c0061bg;
                if (this.m4314I(c0061bg2, i, j2, null) != AbstractC0724tc.f7425o || j2 < this.m4331s()) {
                    c0061bg2.m951a();
                }
                c0061bg = c0061bg2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0072, please report this as an issue */
    @Override // p000.o61
    /* JADX INFO: renamed from: k */
    public Object mo1436k(Object obj) {
        int iM4307b;
        kf1 kf1Var;
        pi1 pi1Var;
        C0017ag c0017ag = n80.f5328a;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6802k;
        long j = atomicLongFieldUpdater.get(this);
        boolean z = false;
        long j2 = 1152921504606846975L;
        if (m4334w(false, j) ? false : !m4317c(j & 1152921504606846975L)) {
            return c0017ag;
        }
        nw0 nw0Var = AbstractC0724tc.f7420j;
        f6806o.getClass();
        C0061bg c0061bg = (C0061bg) c62.f1155a.getObjectVolatile(this, f6815x);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean zM4334w = m4334w(z, andIncrement);
            int i = AbstractC0724tc.f7412b;
            long j4 = i;
            long j5 = j3 / j4;
            int i2 = (int) (j3 % j4);
            if (c0061bg.f2635e == j5) {
                iM4307b = m4307b(this, c0061bg, i2, obj, j3, nw0Var, zM4334w);
                kf1Var = kf1.f4365a;
                if (iM4307b != 0) {
                    c0061bg.m951a();
                    return kf1Var;
                }
                if (iM4307b != 1) {
                    return kf1Var;
                }
                if (iM4307b != 2) {
                    if (zM4334w) {
                        c0061bg.m1990m();
                        return new C0949zf(m4330r());
                    }
                    pi1Var = nw0Var instanceof pi1 ? (pi1) nw0Var : null;
                    if (pi1Var != null) {
                        pi1Var.mo474a(c0061bg, i2 + i);
                    }
                    c0061bg.m1990m();
                    return c0017ag;
                }
                if (iM4307b != 3) {
                    C0270h1.m2191g("unexpected");
                    return null;
                }
                if (iM4307b != 4) {
                    if (j3 < f6803l.get(this)) {
                        c0061bg.m951a();
                    }
                    return new C0949zf(m4330r());
                }
                if (iM4307b == 5) {
                    c0061bg.m951a();
                }
                z = false;
            } else {
                C0061bg c0061bgM4327o = m4327o(j5, c0061bg);
                if (c0061bgM4327o != null) {
                    c0061bg = c0061bgM4327o;
                    iM4307b = m4307b(this, c0061bg, i2, obj, j3, nw0Var, zM4334w);
                    kf1Var = kf1.f4365a;
                    if (iM4307b != 0) {
                        c0061bg.m951a();
                        return kf1Var;
                    }
                    if (iM4307b != 1) {
                        return kf1Var;
                    }
                    if (iM4307b != 2) {
                        if (zM4334w) {
                            c0061bg.m1990m();
                            return new C0949zf(m4330r());
                        }
                        if (nw0Var instanceof pi1) {
                        }
                        if (pi1Var != null) {
                            pi1Var.mo474a(c0061bg, i2 + i);
                        }
                        c0061bg.m1990m();
                        return c0017ag;
                    }
                    if (iM4307b != 3) {
                        C0270h1.m2191g("unexpected");
                        return null;
                    }
                    if (iM4307b != 4) {
                        if (j3 < f6803l.get(this)) {
                            c0061bg.m951a();
                        }
                        return new C0949zf(m4330r());
                    }
                    if (iM4307b == 5) {
                        c0061bg.m951a();
                    }
                    z = false;
                } else {
                    if (zM4334w) {
                        return new C0949zf(m4330r());
                    }
                    z = false;
                }
            }
            j2 = 1152921504606846975L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b3 A[EDGE_INSN: B:43:0x00b3->B:46:0x00c0 BREAK  A[LOOP:1: B:31:0x0080->B:92:0x0080]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00c0 A[EDGE_INSN: B:89:0x00c0->B:46:0x00c0 BREAK  A[LOOP:1: B:31:0x0080->B:92:0x0080], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public final void m4324l() {
        int i;
        boolean z;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        Object objM646p;
        if (m4335y()) {
            return;
        }
        f6808q.getClass();
        C0061bg c0061bg = (C0061bg) c62.f1155a.getObjectVolatile(this, f6812u);
        while (true) {
            long andIncrement = f6804m.getAndIncrement(this);
            long j = AbstractC0724tc.f7412b;
            long j2 = andIncrement / j;
            if (this.m4331s() <= andIncrement) {
                if (c0061bg.f2635e < j2 && c0061bg.m953c() != null) {
                    this.m4336z(j2, c0061bg);
                }
                m4308u(this);
                return;
            }
            C0650rc c0650rc = this;
            if (c0061bg.f2635e == j2) {
                i = (int) (andIncrement % j);
                Object objM646p2 = c0061bg.m646p(i);
                z = objM646p2 instanceof pi1;
                atomicLongFieldUpdater = f6803l;
                if (z || andIncrement < atomicLongFieldUpdater.get(c0650rc) || !c0061bg.m645o(i, objM646p2, AbstractC0724tc.f7417g)) {
                    while (true) {
                        objM646p = c0061bg.m646p(i);
                        if (objM646p instanceof pi1) {
                            if (andIncrement < atomicLongFieldUpdater.get(c0650rc)) {
                                if (c0061bg.m645o(i, objM646p, new qi1((pi1) objM646p))) {
                                    m4308u(c0650rc);
                                    return;
                                }
                            } else if (c0061bg.m645o(i, objM646p, AbstractC0724tc.f7417g)) {
                                if (!m4305G(objM646p)) {
                                    c0061bg.m649s(i, AbstractC0724tc.f7420j);
                                    c0061bg.m1990m();
                                    break;
                                } else {
                                    c0061bg.m649s(i, AbstractC0724tc.f7414d);
                                    m4308u(c0650rc);
                                    return;
                                }
                            }
                        } else {
                            if (objM646p == AbstractC0724tc.f7420j) {
                                break;
                            }
                            if (objM646p == null) {
                                if (c0061bg.m645o(i, objM646p, AbstractC0724tc.f7415e)) {
                                    m4308u(c0650rc);
                                    return;
                                }
                            } else if (objM646p != AbstractC0724tc.f7414d || objM646p == AbstractC0724tc.f7418h || objM646p == AbstractC0724tc.f7419i || objM646p == AbstractC0724tc.f7421k || objM646p == AbstractC0724tc.f7422l) {
                                m4308u(c0650rc);
                                return;
                            } else if (objM646p != AbstractC0724tc.f7416f) {
                                dd0.m1162g(objM646p, "Unexpected cell state: ");
                                return;
                            }
                        }
                    }
                    m4308u(c0650rc);
                } else if (m4305G(objM646p2)) {
                    c0061bg.m649s(i, AbstractC0724tc.f7414d);
                    m4308u(c0650rc);
                    return;
                } else {
                    c0061bg.m649s(i, AbstractC0724tc.f7420j);
                    c0061bg.m1990m();
                    m4308u(c0650rc);
                }
            } else {
                C0061bg c0061bgM4325m = c0650rc.m4325m(j2, c0061bg, andIncrement);
                if (c0061bgM4325m == null) {
                    continue;
                } else {
                    c0061bg = c0061bgM4325m;
                    i = (int) (andIncrement % j);
                    Object objM646p3 = c0061bg.m646p(i);
                    z = objM646p3 instanceof pi1;
                    atomicLongFieldUpdater = f6803l;
                    if (z) {
                        while (true) {
                            objM646p = c0061bg.m646p(i);
                            if (objM646p instanceof pi1) {
                                if (andIncrement < atomicLongFieldUpdater.get(c0650rc)) {
                                    if (c0061bg.m645o(i, objM646p, new qi1((pi1) objM646p))) {
                                        m4308u(c0650rc);
                                        return;
                                    }
                                } else if (c0061bg.m645o(i, objM646p, AbstractC0724tc.f7417g)) {
                                    if (!m4305G(objM646p)) {
                                        c0061bg.m649s(i, AbstractC0724tc.f7420j);
                                        c0061bg.m1990m();
                                        break;
                                    } else {
                                        c0061bg.m649s(i, AbstractC0724tc.f7414d);
                                        m4308u(c0650rc);
                                        return;
                                    }
                                }
                            } else {
                                if (objM646p == AbstractC0724tc.f7420j) {
                                    break;
                                    break;
                                }
                                if (objM646p == null) {
                                    if (objM646p != AbstractC0724tc.f7414d) {
                                        if (objM646p != AbstractC0724tc.f7416f) {
                                            dd0.m1162g(objM646p, "Unexpected cell state: ");
                                            return;
                                        }
                                    }
                                    m4308u(c0650rc);
                                    return;
                                }
                                if (c0061bg.m645o(i, objM646p, AbstractC0724tc.f7415e)) {
                                    m4308u(c0650rc);
                                    return;
                                }
                            }
                        }
                        m4308u(c0650rc);
                    } else {
                        while (true) {
                            objM646p = c0061bg.m646p(i);
                            if (objM646p instanceof pi1) {
                                if (andIncrement < atomicLongFieldUpdater.get(c0650rc)) {
                                    if (c0061bg.m645o(i, objM646p, new qi1((pi1) objM646p))) {
                                        m4308u(c0650rc);
                                        return;
                                    }
                                } else if (c0061bg.m645o(i, objM646p, AbstractC0724tc.f7417g)) {
                                    if (!m4305G(objM646p)) {
                                        c0061bg.m649s(i, AbstractC0724tc.f7420j);
                                        c0061bg.m1990m();
                                        break;
                                    } else {
                                        c0061bg.m649s(i, AbstractC0724tc.f7414d);
                                        m4308u(c0650rc);
                                        return;
                                    }
                                }
                            } else {
                                if (objM646p == AbstractC0724tc.f7420j) {
                                    break;
                                    break;
                                }
                                if (objM646p == null) {
                                    if (objM646p != AbstractC0724tc.f7414d) {
                                        if (objM646p != AbstractC0724tc.f7416f) {
                                            dd0.m1162g(objM646p, "Unexpected cell state: ");
                                            return;
                                        }
                                    }
                                    m4308u(c0650rc);
                                    return;
                                }
                                if (c0061bg.m645o(i, objM646p, AbstractC0724tc.f7415e)) {
                                    m4308u(c0650rc);
                                    return;
                                }
                            }
                        }
                        m4308u(c0650rc);
                    }
                }
            }
            this = c0650rc;
        }
    }

    /* JADX INFO: renamed from: m */
    public final C0061bg m4325m(long j, C0061bg c0061bg, long j2) {
        Object objM135s;
        Unsafe unsafe;
        C0061bg c0061bg2 = AbstractC0724tc.f7411a;
        C0687sc c0687sc = C0687sc.f7094q;
        loop0: while (true) {
            objM135s = a90.m135s(c0061bg, j, c0687sc);
            if (!oa2.m3660g(objM135s)) {
                g61 g61VarM3658e = oa2.m3658e(objM135s);
                while (true) {
                    f6808q.getClass();
                    Unsafe unsafe2 = c62.f1155a;
                    long j3 = f6812u;
                    g61 g61Var = (g61) unsafe2.getObjectVolatile(this, j3);
                    if (g61Var.f2635e >= g61VarM3658e.f2635e) {
                        break loop0;
                    }
                    if (!g61VarM3658e.m1991n()) {
                        break;
                    }
                    do {
                        unsafe = c62.f1155a;
                        if (unsafe.compareAndSwapObject(this, f6812u, g61Var, g61VarM3658e)) {
                            if (!g61Var.m1989j()) {
                                break loop0;
                            }
                            g61Var.m958h();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == g61Var);
                    if (g61VarM3658e.m1989j()) {
                        g61VarM3658e.m958h();
                    }
                }
            } else {
                break;
            }
        }
        if (oa2.m3660g(objM135s)) {
            m4322i();
            m4336z(j, c0061bg);
            m4308u(this);
            return null;
        }
        C0061bg c0061bg3 = (C0061bg) oa2.m3658e(objM135s);
        long j4 = c0061bg3.f2635e;
        if (j4 <= j) {
            return c0061bg3;
        }
        long j5 = j4 * ((long) AbstractC0724tc.f7412b);
        if (!f6804m.compareAndSet(this, j2 + 1, j5)) {
            m4308u(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6805n;
        if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final C0061bg m4326n(long j, C0061bg c0061bg) {
        Object objM135s;
        C0061bg c0061bg2;
        long j2;
        Unsafe unsafe;
        C0061bg c0061bg3 = AbstractC0724tc.f7411a;
        C0687sc c0687sc = C0687sc.f7094q;
        loop0: while (true) {
            objM135s = a90.m135s(c0061bg, j, c0687sc);
            if (!oa2.m3660g(objM135s)) {
                g61 g61VarM3658e = oa2.m3658e(objM135s);
                while (true) {
                    f6807p.getClass();
                    Unsafe unsafe2 = c62.f1155a;
                    long j3 = f6814w;
                    g61 g61Var = (g61) unsafe2.getObjectVolatile(this, j3);
                    if (g61Var.f2635e >= g61VarM3658e.f2635e) {
                        break loop0;
                    }
                    if (!g61VarM3658e.m1991n()) {
                        break;
                    }
                    do {
                        unsafe = c62.f1155a;
                        if (unsafe.compareAndSwapObject(this, f6814w, g61Var, g61VarM3658e)) {
                            if (!g61Var.m1989j()) {
                                break loop0;
                            }
                            g61Var.m958h();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == g61Var);
                    if (g61VarM3658e.m1989j()) {
                        g61VarM3658e.m958h();
                    }
                }
            } else {
                break;
            }
        }
        if (oa2.m3660g(objM135s)) {
            m4322i();
            if (c0061bg.f2635e * ((long) AbstractC0724tc.f7412b) < m4331s()) {
                c0061bg.m951a();
                return null;
            }
        } else {
            C0061bg c0061bg4 = (C0061bg) oa2.m3658e(objM135s);
            long j4 = c0061bg4.f2635e;
            if (m4335y() || j > f6804m.get(this) / ((long) AbstractC0724tc.f7412b)) {
                c0061bg2 = c0061bg4;
                break;
            }
            loop3: while (true) {
                f6808q.getClass();
                Unsafe unsafe3 = c62.f1155a;
                long j5 = f6812u;
                g61 g61Var2 = (g61) unsafe3.getObjectVolatile(this, j5);
                if (g61Var2.f2635e >= j4 || !c0061bg4.m1991n()) {
                    c0061bg2 = c0061bg4;
                    break;
                }
                while (true) {
                    Unsafe unsafe4 = c62.f1155a;
                    c0061bg2 = c0061bg4;
                    if (unsafe4.compareAndSwapObject(this, f6812u, g61Var2, c0061bg4)) {
                        if (!g61Var2.m1989j()) {
                            break loop3;
                        }
                        g61Var2.m958h();
                        break loop3;
                    }
                    if (unsafe4.getObjectVolatile(this, j5) != g61Var2) {
                        break;
                    }
                    c0061bg4 = c0061bg2;
                }
                if (c0061bg2.m1989j()) {
                    c0061bg2.m958h();
                }
                c0061bg4 = c0061bg2;
            }
            if (j4 <= j) {
                return c0061bg2;
            }
            long j6 = j4 * ((long) AbstractC0724tc.f7412b);
            do {
                j2 = f6803l.get(this);
                if (j2 >= j6) {
                    break;
                }
            } while (!f6803l.compareAndSet(this, j2, j6));
            if (j4 * ((long) AbstractC0724tc.f7412b) < m4331s()) {
                c0061bg2.m951a();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final C0061bg m4327o(long j, C0061bg c0061bg) {
        Object objM135s;
        long j2;
        long j3;
        Unsafe unsafe;
        C0061bg c0061bg2 = AbstractC0724tc.f7411a;
        C0687sc c0687sc = C0687sc.f7094q;
        loop0: while (true) {
            objM135s = a90.m135s(c0061bg, j, c0687sc);
            if (!oa2.m3660g(objM135s)) {
                g61 g61VarM3658e = oa2.m3658e(objM135s);
                while (true) {
                    f6806o.getClass();
                    Unsafe unsafe2 = c62.f1155a;
                    long j4 = f6815x;
                    g61 g61Var = (g61) unsafe2.getObjectVolatile(this, j4);
                    if (g61Var.f2635e >= g61VarM3658e.f2635e) {
                        break loop0;
                    }
                    if (!g61VarM3658e.m1991n()) {
                        break;
                    }
                    do {
                        unsafe = c62.f1155a;
                        if (unsafe.compareAndSwapObject(this, f6815x, g61Var, g61VarM3658e)) {
                            if (!g61Var.m1989j()) {
                                break loop0;
                            }
                            g61Var.m958h();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == g61Var);
                    if (g61VarM3658e.m1989j()) {
                        g61VarM3658e.m958h();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM3660g = oa2.m3660g(objM135s);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6803l;
        if (zM3660g) {
            m4322i();
            if (c0061bg.f2635e * ((long) AbstractC0724tc.f7412b) < atomicLongFieldUpdater.get(this)) {
                c0061bg.m951a();
                return null;
            }
        } else {
            C0061bg c0061bg3 = (C0061bg) oa2.m3658e(objM135s);
            long j5 = c0061bg3.f2635e;
            if (j5 <= j) {
                return c0061bg3;
            }
            long j6 = j5 * ((long) AbstractC0724tc.f7412b);
            do {
                j2 = f6802k.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!f6802k.compareAndSet(this, j2, j3 + (((long) ((int) (j2 >> 60))) << 60)));
            if (j5 * ((long) AbstractC0724tc.f7412b) < atomicLongFieldUpdater.get(this)) {
                c0061bg3.m951a();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final Throwable m4328p() {
        f6809r.getClass();
        return (Throwable) c62.f1155a.getObjectVolatile(this, f6811t);
    }

    /* JADX INFO: renamed from: q */
    public final Throwable m4329q() {
        Throwable thM4328p = m4328p();
        return thM4328p == null ? new C0840wh("Channel was closed") : thM4328p;
    }

    /* JADX INFO: renamed from: r */
    public final Throwable m4330r() {
        Throwable thM4328p = m4328p();
        return thM4328p == null ? new C0877xh("Channel was closed") : thM4328p;
    }

    /* JADX INFO: renamed from: s */
    public final long m4331s() {
        return f6802k.get(this) & 1152921504606846975L;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4332t() {
        while (true) {
            f6807p.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f6814w;
            C0061bg c0061bgM4326n = (C0061bg) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6803l;
            long j2 = atomicLongFieldUpdater.get(this);
            if (m4331s() <= j2) {
                return false;
            }
            long j3 = AbstractC0724tc.f7412b;
            long j4 = j2 / j3;
            if (c0061bgM4326n.f2635e == j4 || (c0061bgM4326n = m4326n(j4, c0061bgM4326n)) != null) {
                c0061bgM4326n.m951a();
                int i = (int) (j2 % j3);
                while (true) {
                    Object objM646p = c0061bgM4326n.m646p(i);
                    if (objM646p != null && objM646p != AbstractC0724tc.f7415e) {
                        if (objM646p != AbstractC0724tc.f7414d) {
                            if (objM646p != AbstractC0724tc.f7420j && objM646p != AbstractC0724tc.f7422l && objM646p != AbstractC0724tc.f7419i && objM646p != AbstractC0724tc.f7418h) {
                                if (objM646p != AbstractC0724tc.f7417g) {
                                    if (objM646p == AbstractC0724tc.f7416f || j2 != atomicLongFieldUpdater.get(this)) {
                                        break;
                                        break;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            break;
                            break;
                            break;
                            break;
                        }
                        return true;
                    }
                    if (c0061bgM4326n.m645o(i, objM646p, AbstractC0724tc.f7418h)) {
                        m4324l();
                        break;
                    }
                }
                f6803l.compareAndSet(this, j2, j2 + 1);
            } else if (((C0061bg) unsafe.getObjectVolatile(this, j)).f2635e < j4) {
                return false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        int i;
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f6802k.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f6816j + ',');
        sb.append("data=[");
        f6807p.getClass();
        Unsafe unsafe = c62.f1155a;
        int i3 = 0;
        f6806o.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, f6815x);
        int i4 = 1;
        f6808q.getClass();
        List listM3539q = AbstractC0508ni.m3539q(unsafe.getObjectVolatile(this, f6814w), objectVolatile, unsafe.getObjectVolatile(this, f6812u));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM3539q) {
            if (((C0061bg) obj) != AbstractC0724tc.f7411a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((C0061bg) next).f2635e;
            do {
                Object next2 = it.next();
                long j2 = ((C0061bg) next2).f2635e;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        C0061bg c0061bg = (C0061bg) next;
        long j3 = f6803l.get(this);
        long jM4331s = m4331s();
        loop2: while (true) {
            int i5 = AbstractC0724tc.f7412b;
            int i6 = i3;
            while (i6 < i5) {
                i = i4;
                long j4 = (c0061bg.f2635e * ((long) AbstractC0724tc.f7412b)) + ((long) i6);
                if (j4 >= jM4331s && j4 >= j3) {
                    break loop2;
                }
                Object objM646p = c0061bg.m646p(i6);
                Object obj2 = c0061bg.f856h.get(i6 * 2);
                if (objM646p instanceof InterfaceC0060bf) {
                    string = (j4 >= j3 || j4 < jM4331s) ? (j4 >= jM4331s || j4 < j3) ? "cont" : "send" : "receive";
                } else if (objM646p instanceof qi1) {
                    string = "EB(" + objM646p + ')';
                } else if (af0.m187a(objM646p, AbstractC0724tc.f7416f) || af0.m187a(objM646p, AbstractC0724tc.f7417g)) {
                    string = "resuming_sender";
                } else {
                    if (objM646p != null && !objM646p.equals(AbstractC0724tc.f7415e) && !objM646p.equals(AbstractC0724tc.f7419i) && !objM646p.equals(AbstractC0724tc.f7418h) && !objM646p.equals(AbstractC0724tc.f7421k) && !objM646p.equals(AbstractC0724tc.f7420j) && !objM646p.equals(AbstractC0724tc.f7422l)) {
                        string = objM646p.toString();
                    }
                    i6++;
                    i4 = i;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i6++;
                i4 = i;
            }
            i = i4;
            c0061bg = (C0061bg) c0061bg.m953c();
            if (c0061bg == null) {
                break;
            }
            i4 = i;
            i3 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(sb.length() - i) == ',') {
            sb.deleteCharAt(sb.length() - i).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: v */
    public final void m4333v() {
        Object objectVolatile;
        C0650rc c0650rc;
        loop0: while (true) {
            f6810s.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f6813v;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            g72 g72Var = objectVolatile == null ? AbstractC0724tc.f7427q : AbstractC0724tc.f7428r;
            while (true) {
                Unsafe unsafe2 = c62.f1155a;
                c0650rc = this;
                if (unsafe2.compareAndSwapObject(c0650rc, f6813v, objectVolatile, g72Var)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(c0650rc, j) != objectVolatile) {
                    break;
                } else {
                    this = c0650rc;
                }
            }
            this = c0650rc;
        }
        if (objectVolatile == null) {
            return;
        }
        xe1.m5634a(1, objectVolatile);
        ((h60) objectVolatile).mo170i(c0650rc.m4328p());
    }

    /* JADX INFO: renamed from: w */
    public final boolean m4334w(boolean z, long j) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                m4321h(j & 1152921504606846975L);
                if (!z || !m4332t()) {
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(j11.m2773h("unexpected close status: ", i).toString());
                }
                C0061bg c0061bgM4321h = m4321h(j & 1152921504606846975L);
                Object objM194i = null;
                loop0: do {
                    for (int i2 = AbstractC0724tc.f7412b - 1; -1 < i2; i2--) {
                        long j2 = (c0061bgM4321h.f2635e * ((long) AbstractC0724tc.f7412b)) + ((long) i2);
                        while (true) {
                            Object objM646p = c0061bgM4321h.m646p(i2);
                            if (objM646p == AbstractC0724tc.f7419i) {
                                break loop0;
                            }
                            g72 g72Var = AbstractC0724tc.f7414d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f6803l;
                            if (objM646p != g72Var) {
                                if (objM646p != AbstractC0724tc.f7415e && objM646p != null) {
                                    if (!(objM646p instanceof pi1) && !(objM646p instanceof qi1)) {
                                        g72 g72Var2 = AbstractC0724tc.f7417g;
                                        if (objM646p == g72Var2 || objM646p == AbstractC0724tc.f7416f) {
                                            break loop0;
                                        }
                                        if (objM646p != g72Var2) {
                                            break;
                                        }
                                    } else {
                                        if (j2 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        pi1 pi1Var = objM646p instanceof qi1 ? ((qi1) objM646p).f6505a : (pi1) objM646p;
                                        if (c0061bgM4321h.m645o(i2, objM646p, AbstractC0724tc.f7422l)) {
                                            objM194i = af0.m194i(objM194i, pi1Var);
                                            c0061bgM4321h.m648r(i2, null);
                                            c0061bgM4321h.m1990m();
                                            break;
                                        }
                                    }
                                } else {
                                    if (c0061bgM4321h.m645o(i2, objM646p, AbstractC0724tc.f7422l)) {
                                        c0061bgM4321h.m1990m();
                                        break;
                                    }
                                }
                            } else {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (c0061bgM4321h.m645o(i2, objM646p, AbstractC0724tc.f7422l)) {
                                    c0061bgM4321h.m648r(i2, null);
                                    c0061bgM4321h.m1990m();
                                    break;
                                }
                            }
                        }
                    }
                    c0061bgM4321h = (C0061bg) c0061bgM4321h.m955e();
                } while (c0061bgM4321h != null);
                if (objM194i != null) {
                    if (objM194i instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM194i;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            m4310C((pi1) arrayList.get(size), false);
                        }
                    } else {
                        m4310C((pi1) objM194i, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public boolean mo1437x() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m4335y() {
        long j = f6804m.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: z */
    public final void m4336z(long j, C0061bg c0061bg) {
        C0650rc c0650rc;
        C0061bg c0061bg2;
        C0061bg c0061bg3;
        while (c0061bg.f2635e < j && (c0061bg3 = (C0061bg) c0061bg.m953c()) != null) {
            c0061bg = c0061bg3;
        }
        while (true) {
            C0061bg c0061bg4 = c0061bg;
            while (c0061bg4.mo956f() && (c0061bg2 = (C0061bg) c0061bg4.m953c()) != null) {
                c0061bg4 = c0061bg2;
            }
            while (true) {
                f6808q.getClass();
                Unsafe unsafe = c62.f1155a;
                long j2 = f6812u;
                g61 g61Var = (g61) unsafe.getObjectVolatile(this, j2);
                if (g61Var.f2635e >= c0061bg4.f2635e) {
                    return;
                }
                if (!c0061bg4.m1991n()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = c62.f1155a;
                    c0650rc = this;
                    if (unsafe2.compareAndSwapObject(c0650rc, f6812u, g61Var, c0061bg4)) {
                        if (g61Var.m1989j()) {
                            g61Var.m958h();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(c0650rc, j2) != g61Var) {
                        break;
                    } else {
                        this = c0650rc;
                    }
                }
                if (c0061bg4.m1989j()) {
                    c0061bg4.m958h();
                }
                this = c0650rc;
            }
            c0061bg = c0061bg4;
        }
    }
}
