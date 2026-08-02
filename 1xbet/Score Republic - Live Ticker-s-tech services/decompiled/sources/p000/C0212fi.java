package p000;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: renamed from: fi */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0212fi {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2408a;

    /* JADX INFO: renamed from: b */
    public int f2409b;

    /* JADX INFO: renamed from: c */
    public int f2410c;

    /* JADX INFO: renamed from: d */
    public int f2411d;

    /* JADX INFO: renamed from: e */
    public Object f2412e;

    public C0212fi(AbstractC0175ei abstractC0175ei) {
        this.f2408a = 1;
        this.f2411d = 0;
        Charset charset = ge0.f2710a;
        this.f2412e = abstractC0175ei;
        abstractC0175ei.f2095b = this;
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m1793p0(int i) throws mp1 {
        if ((i & 3) == 0) {
            return;
        }
        re1.m4350e("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m1794q0(int i) throws mp1 {
        if ((i & 7) == 0) {
            return;
        }
        re1.m4350e("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: A */
    public void m1795A(ee0 ee0Var) throws if0, hf0 {
        int iMo696u;
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                ((hy0) ee0Var).add(Long.valueOf(abstractC0175ei.mo689n()));
                if (abstractC0175ei.mo678c()) {
                    return;
                } else {
                    iMo696u = abstractC0175ei.mo696u();
                }
            } while (iMo696u == this.f2409b);
            this.f2411d = iMo696u;
            return;
        }
        if (i != 2) {
            throw if0.m2597b();
        }
        int iMo677b = abstractC0175ei.mo677b() + abstractC0175ei.mo697v();
        do {
            ((hy0) ee0Var).add(Long.valueOf(abstractC0175ei.mo689n()));
        } while (abstractC0175ei.mo677b() < iMo677b);
        m1812R(iMo677b);
    }

    /* JADX INFO: renamed from: B */
    public void m1796B(List list) throws if0, hf0 {
        int iMo243y;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(abstractC0860x0.mo234q()));
                if (abstractC0860x0.mo218c()) {
                    return;
                } else {
                    iMo243y = abstractC0860x0.mo243y();
                }
            } while (iMo243y == this.f2409b);
            this.f2411d = iMo243y;
            return;
        }
        if (i != 2) {
            throw hf0.m2259b();
        }
        int iMo217b = abstractC0860x0.mo217b() + abstractC0860x0.mo244z();
        do {
            list.add(Long.valueOf(abstractC0860x0.mo234q()));
        } while (abstractC0860x0.mo217b() < iMo217b);
        m1812R(iMo217b);
    }

    /* JADX INFO: renamed from: C */
    public void m1797C(ee0 ee0Var) throws if0 {
        int iMo696u;
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 2) {
            int iMo697v = abstractC0175ei.mo697v();
            if ((iMo697v & 3) != 0) {
                throw new if0("Failed to parse the message.");
            }
            int iMo677b = abstractC0175ei.mo677b() + iMo697v;
            do {
                ((hy0) ee0Var).add(Integer.valueOf(abstractC0175ei.mo690o()));
            } while (abstractC0175ei.mo677b() < iMo677b);
            return;
        }
        if (i != 5) {
            throw if0.m2597b();
        }
        do {
            ((hy0) ee0Var).add(Integer.valueOf(abstractC0175ei.mo690o()));
            if (abstractC0175ei.mo678c()) {
                return;
            } else {
                iMo696u = abstractC0175ei.mo696u();
            }
        } while (iMo696u == this.f2409b);
        this.f2411d = iMo696u;
    }

    /* JADX INFO: renamed from: D */
    public void m1798D(List list) throws hf0 {
        int iMo243y;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 2) {
            int iMo244z = abstractC0860x0.mo244z();
            if ((iMo244z & 3) != 0) {
                throw new hf0("Failed to parse the message.");
            }
            int iMo217b = abstractC0860x0.mo217b() + iMo244z;
            do {
                list.add(Integer.valueOf(abstractC0860x0.mo237s()));
            } while (abstractC0860x0.mo217b() < iMo217b);
            return;
        }
        if (i != 5) {
            throw hf0.m2259b();
        }
        do {
            list.add(Integer.valueOf(abstractC0860x0.mo237s()));
            if (abstractC0860x0.mo218c()) {
                return;
            } else {
                iMo243y = abstractC0860x0.mo243y();
            }
        } while (iMo243y == this.f2409b);
        this.f2411d = iMo243y;
    }

    /* JADX INFO: renamed from: E */
    public void m1799E(ee0 ee0Var) throws if0 {
        int iMo696u;
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 1) {
            do {
                ((hy0) ee0Var).add(Long.valueOf(abstractC0175ei.mo691p()));
                if (abstractC0175ei.mo678c()) {
                    return;
                } else {
                    iMo696u = abstractC0175ei.mo696u();
                }
            } while (iMo696u == this.f2409b);
            this.f2411d = iMo696u;
            return;
        }
        if (i != 2) {
            throw if0.m2597b();
        }
        int iMo697v = abstractC0175ei.mo697v();
        if ((iMo697v & 7) != 0) {
            throw new if0("Failed to parse the message.");
        }
        int iMo677b = abstractC0175ei.mo677b() + iMo697v;
        do {
            ((hy0) ee0Var).add(Long.valueOf(abstractC0175ei.mo691p()));
        } while (abstractC0175ei.mo677b() < iMo677b);
    }

    /* JADX INFO: renamed from: F */
    public void m1800F(List list) throws hf0 {
        int iMo243y;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 1) {
            do {
                list.add(Long.valueOf(abstractC0860x0.mo238t()));
                if (abstractC0860x0.mo218c()) {
                    return;
                } else {
                    iMo243y = abstractC0860x0.mo243y();
                }
            } while (iMo243y == this.f2409b);
            this.f2411d = iMo243y;
            return;
        }
        if (i != 2) {
            throw hf0.m2259b();
        }
        int iMo244z = abstractC0860x0.mo244z();
        if ((iMo244z & 7) != 0) {
            throw new hf0("Failed to parse the message.");
        }
        int iMo217b = abstractC0860x0.mo217b() + iMo244z;
        do {
            list.add(Long.valueOf(abstractC0860x0.mo238t()));
        } while (abstractC0860x0.mo217b() < iMo217b);
    }

    /* JADX INFO: renamed from: G */
    public void m1801G(ee0 ee0Var) throws if0, hf0 {
        int iMo696u;
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                ((hy0) ee0Var).add(Integer.valueOf(abstractC0175ei.mo692q()));
                if (abstractC0175ei.mo678c()) {
                    return;
                } else {
                    iMo696u = abstractC0175ei.mo696u();
                }
            } while (iMo696u == this.f2409b);
            this.f2411d = iMo696u;
            return;
        }
        if (i != 2) {
            throw if0.m2597b();
        }
        int iMo677b = abstractC0175ei.mo677b() + abstractC0175ei.mo697v();
        do {
            ((hy0) ee0Var).add(Integer.valueOf(abstractC0175ei.mo692q()));
        } while (abstractC0175ei.mo677b() < iMo677b);
        m1812R(iMo677b);
    }

    /* JADX INFO: renamed from: H */
    public void m1802H(List list) throws if0, hf0 {
        int iMo243y;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(abstractC0860x0.mo239u()));
                if (abstractC0860x0.mo218c()) {
                    return;
                } else {
                    iMo243y = abstractC0860x0.mo243y();
                }
            } while (iMo243y == this.f2409b);
            this.f2411d = iMo243y;
            return;
        }
        if (i != 2) {
            throw hf0.m2259b();
        }
        int iMo217b = abstractC0860x0.mo217b() + abstractC0860x0.mo244z();
        do {
            list.add(Integer.valueOf(abstractC0860x0.mo239u()));
        } while (abstractC0860x0.mo217b() < iMo217b);
        m1812R(iMo217b);
    }

    /* JADX INFO: renamed from: I */
    public void m1803I(ee0 ee0Var) throws if0, hf0 {
        int iMo696u;
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                ((hy0) ee0Var).add(Long.valueOf(abstractC0175ei.mo693r()));
                if (abstractC0175ei.mo678c()) {
                    return;
                } else {
                    iMo696u = abstractC0175ei.mo696u();
                }
            } while (iMo696u == this.f2409b);
            this.f2411d = iMo696u;
            return;
        }
        if (i != 2) {
            throw if0.m2597b();
        }
        int iMo677b = abstractC0175ei.mo677b() + abstractC0175ei.mo697v();
        do {
            ((hy0) ee0Var).add(Long.valueOf(abstractC0175ei.mo693r()));
        } while (abstractC0175ei.mo677b() < iMo677b);
        m1812R(iMo677b);
    }

    /* JADX INFO: renamed from: J */
    public void m1804J(List list) throws if0, hf0 {
        int iMo243y;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(abstractC0860x0.mo240v()));
                if (abstractC0860x0.mo218c()) {
                    return;
                } else {
                    iMo243y = abstractC0860x0.mo243y();
                }
            } while (iMo243y == this.f2409b);
            this.f2411d = iMo243y;
            return;
        }
        if (i != 2) {
            throw hf0.m2259b();
        }
        int iMo217b = abstractC0860x0.mo217b() + abstractC0860x0.mo244z();
        do {
            list.add(Long.valueOf(abstractC0860x0.mo240v()));
        } while (abstractC0860x0.mo217b() < iMo217b);
        m1812R(iMo217b);
    }

    /* JADX INFO: renamed from: K */
    public void m1805K(ee0 ee0Var, boolean z) throws gf0, ff0 {
        String strMo694s;
        int iMo696u;
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        if ((this.f2409b & 7) != 2) {
            throw if0.m2597b();
        }
        do {
            if (z) {
                m1813S(2);
                strMo694s = abstractC0175ei.mo695t();
            } else {
                m1813S(2);
                strMo694s = abstractC0175ei.mo694s();
            }
            ((hy0) ee0Var).add(strMo694s);
            if (abstractC0175ei.mo678c()) {
                return;
            } else {
                iMo696u = abstractC0175ei.mo696u();
            }
        } while (iMo696u == this.f2409b);
        this.f2411d = iMo696u;
    }

    /* JADX INFO: renamed from: L */
    public void m1806L(List list, boolean z) throws gf0, ff0 {
        String strMo241w;
        int iMo243y;
        int iMo243y2;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        if ((this.f2409b & 7) != 2) {
            throw hf0.m2259b();
        }
        if ((list instanceof jh0) && !z) {
            jh0 jh0Var = (jh0) list;
            do {
                jh0Var.mo2637a(m1837i());
                if (abstractC0860x0.mo218c()) {
                    return;
                } else {
                    iMo243y2 = abstractC0860x0.mo243y();
                }
            } while (iMo243y2 == this.f2409b);
            this.f2411d = iMo243y2;
            return;
        }
        do {
            if (z) {
                m1813S(2);
                strMo241w = abstractC0860x0.mo242x();
            } else {
                m1813S(2);
                strMo241w = abstractC0860x0.mo241w();
            }
            list.add(strMo241w);
            if (abstractC0860x0.mo218c()) {
                return;
            } else {
                iMo243y = abstractC0860x0.mo243y();
            }
        } while (iMo243y == this.f2409b);
        this.f2411d = iMo243y;
    }

    /* JADX INFO: renamed from: M */
    public void m1807M(ee0 ee0Var) throws if0, hf0 {
        int iMo696u;
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                ((hy0) ee0Var).add(Integer.valueOf(abstractC0175ei.mo697v()));
                if (abstractC0175ei.mo678c()) {
                    return;
                } else {
                    iMo696u = abstractC0175ei.mo696u();
                }
            } while (iMo696u == this.f2409b);
            this.f2411d = iMo696u;
            return;
        }
        if (i != 2) {
            throw if0.m2597b();
        }
        int iMo677b = abstractC0175ei.mo677b() + abstractC0175ei.mo697v();
        do {
            ((hy0) ee0Var).add(Integer.valueOf(abstractC0175ei.mo697v()));
        } while (abstractC0175ei.mo677b() < iMo677b);
        m1812R(iMo677b);
    }

    /* JADX INFO: renamed from: N */
    public void m1808N(List list) throws if0, hf0 {
        int iMo243y;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(abstractC0860x0.mo244z()));
                if (abstractC0860x0.mo218c()) {
                    return;
                } else {
                    iMo243y = abstractC0860x0.mo243y();
                }
            } while (iMo243y == this.f2409b);
            this.f2411d = iMo243y;
            return;
        }
        if (i != 2) {
            throw hf0.m2259b();
        }
        int iMo217b = abstractC0860x0.mo217b() + abstractC0860x0.mo244z();
        do {
            list.add(Integer.valueOf(abstractC0860x0.mo244z()));
        } while (abstractC0860x0.mo217b() < iMo217b);
        m1812R(iMo217b);
    }

    /* JADX INFO: renamed from: O */
    public void m1809O(ee0 ee0Var) throws if0, hf0 {
        int iMo696u;
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                ((hy0) ee0Var).add(Long.valueOf(abstractC0175ei.mo698w()));
                if (abstractC0175ei.mo678c()) {
                    return;
                } else {
                    iMo696u = abstractC0175ei.mo696u();
                }
            } while (iMo696u == this.f2409b);
            this.f2411d = iMo696u;
            return;
        }
        if (i != 2) {
            throw if0.m2597b();
        }
        int iMo677b = abstractC0175ei.mo677b() + abstractC0175ei.mo697v();
        do {
            ((hy0) ee0Var).add(Long.valueOf(abstractC0175ei.mo698w()));
        } while (abstractC0175ei.mo677b() < iMo677b);
        m1812R(iMo677b);
    }

    /* JADX INFO: renamed from: P */
    public void m1810P(List list) throws if0, hf0 {
        int iMo243y;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(abstractC0860x0.mo214A()));
                if (abstractC0860x0.mo218c()) {
                    return;
                } else {
                    iMo243y = abstractC0860x0.mo243y();
                }
            } while (iMo243y == this.f2409b);
            this.f2411d = iMo243y;
            return;
        }
        if (i != 2) {
            throw hf0.m2259b();
        }
        int iMo217b = abstractC0860x0.mo217b() + abstractC0860x0.mo244z();
        do {
            list.add(Long.valueOf(abstractC0860x0.mo214A()));
        } while (abstractC0860x0.mo217b() < iMo217b);
        m1812R(iMo217b);
    }

    /* JADX INFO: renamed from: Q */
    public void m1811Q(int i, int i2, Object[] objArr) {
        int i3;
        Object obj;
        this.f2410c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i5 = (iHashCode ^ (iHashCode >>> 16)) & i2;
                    if (i > i3) {
                        if (i >= i5 && i5 > i3) {
                            break;
                        } else {
                            i4 = i3 + 1;
                        }
                    } else if (i >= i5 || i5 > i3) {
                        break;
                    } else {
                        i4 = i3 + 1;
                    }
                } else {
                    objArr[i] = null;
                    return;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }

    /* JADX INFO: renamed from: R */
    public void m1812R(int i) throws if0, hf0 {
        switch (this.f2408a) {
            case 0:
                if (((AbstractC0860x0) this.f2412e).mo217b() != i) {
                    throw hf0.m2262e();
                }
                return;
            default:
                if (((AbstractC0175ei) this.f2412e).mo677b() != i) {
                    throw if0.m2600e();
                }
                return;
        }
    }

    /* JADX INFO: renamed from: S */
    public void m1813S(int i) throws gf0, ff0 {
        switch (this.f2408a) {
            case 0:
                if ((this.f2409b & 7) != i) {
                    throw hf0.m2259b();
                }
                return;
            default:
                if ((this.f2409b & 7) != i) {
                    throw if0.m2597b();
                }
                return;
        }
    }

    /* JADX INFO: renamed from: T */
    public boolean m1814T() {
        int i;
        int i2;
        switch (this.f2408a) {
            case 0:
                AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
                if (abstractC0860x0.mo218c() || (i = this.f2409b) == this.f2410c) {
                    return false;
                }
                return abstractC0860x0.mo215B(i);
            default:
                AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
                if (abstractC0175ei.mo678c() || (i2 = this.f2409b) == this.f2410c) {
                    return false;
                }
                return abstractC0175ei.mo699x(i2);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m1815U(kp1 kp1Var) throws mp1 {
        int iMo3247O;
        int iMo3247O2;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        boolean z = kp1Var instanceof pp1;
        int i = this.f2409b;
        if (z) {
            pp1 pp1Var = (pp1) kp1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3244H = abstractC0860x0.mo3244H() + abstractC0860x0.mo3262d0();
                do {
                    pp1Var.m3974e(abstractC0860x0.mo3253U());
                } while (abstractC0860x0.mo3244H() < iMo3244H);
                m1850o0(iMo3244H);
                return;
            }
            do {
                pp1Var.m3974e(abstractC0860x0.mo3253U());
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O2 = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O2 == this.f2409b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3244H2 = abstractC0860x0.mo3244H() + abstractC0860x0.mo3262d0();
                do {
                    kp1Var.add(Long.valueOf(abstractC0860x0.mo3253U()));
                } while (abstractC0860x0.mo3244H() < iMo3244H2);
                m1850o0(iMo3244H2);
                return;
            }
            do {
                kp1Var.add(Long.valueOf(abstractC0860x0.mo3253U()));
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O == this.f2409b);
            iMo3247O2 = iMo3247O;
        }
        this.f2411d = iMo3247O2;
    }

    /* JADX INFO: renamed from: V */
    public void m1816V(kp1 kp1Var) throws mp1 {
        int iMo3247O;
        int iMo3247O2;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        boolean z = kp1Var instanceof ap1;
        int i = this.f2409b;
        if (z) {
            ap1 ap1Var = (ap1) kp1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3244H = abstractC0860x0.mo3244H() + abstractC0860x0.mo3262d0();
                do {
                    ap1Var.m458e(abstractC0860x0.mo3254V());
                } while (abstractC0860x0.mo3244H() < iMo3244H);
                m1850o0(iMo3244H);
                return;
            }
            do {
                ap1Var.m458e(abstractC0860x0.mo3254V());
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O2 = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O2 == this.f2409b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3244H2 = abstractC0860x0.mo3244H() + abstractC0860x0.mo3262d0();
                do {
                    kp1Var.add(Integer.valueOf(abstractC0860x0.mo3254V()));
                } while (abstractC0860x0.mo3244H() < iMo3244H2);
                m1850o0(iMo3244H2);
                return;
            }
            do {
                kp1Var.add(Integer.valueOf(abstractC0860x0.mo3254V()));
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O == this.f2409b);
            iMo3247O2 = iMo3247O;
        }
        this.f2411d = iMo3247O2;
    }

    /* JADX INFO: renamed from: W */
    public void m1817W(kp1 kp1Var) throws mp1 {
        int iMo3247O;
        int iMo3247O2;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        boolean z = kp1Var instanceof pp1;
        int i = this.f2409b;
        if (z) {
            pp1 pp1Var = (pp1) kp1Var;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3262d0 = abstractC0860x0.mo3262d0();
                m1794q0(iMo3262d0);
                int iMo3244H = abstractC0860x0.mo3244H() + iMo3262d0;
                do {
                    pp1Var.m3974e(abstractC0860x0.mo3255W());
                } while (abstractC0860x0.mo3244H() < iMo3244H);
                return;
            }
            do {
                pp1Var.m3974e(abstractC0860x0.mo3255W());
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O2 = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O2 == this.f2409b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3262d1 = abstractC0860x0.mo3262d0();
                m1794q0(iMo3262d1);
                int iMo3244H2 = abstractC0860x0.mo3244H() + iMo3262d1;
                do {
                    kp1Var.add(Long.valueOf(abstractC0860x0.mo3255W()));
                } while (abstractC0860x0.mo3244H() < iMo3244H2);
                return;
            }
            do {
                kp1Var.add(Long.valueOf(abstractC0860x0.mo3255W()));
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O == this.f2409b);
            iMo3247O2 = iMo3247O;
        }
        this.f2411d = iMo3247O2;
    }

    /* JADX INFO: renamed from: X */
    public void m1818X(kp1 kp1Var) throws mp1 {
        int iMo3247O;
        int iMo3247O2;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        boolean z = kp1Var instanceof ap1;
        int i = this.f2409b;
        if (z) {
            ap1 ap1Var = (ap1) kp1Var;
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo3262d0 = abstractC0860x0.mo3262d0();
                m1793p0(iMo3262d0);
                int iMo3244H = abstractC0860x0.mo3244H() + iMo3262d0;
                do {
                    ap1Var.m458e(abstractC0860x0.mo3256X());
                } while (abstractC0860x0.mo3244H() < iMo3244H);
                return;
            }
            if (i2 != 5) {
                re1.m4347b();
                return;
            }
            do {
                ap1Var.m458e(abstractC0860x0.mo3256X());
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O2 = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O2 == this.f2409b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iMo3262d1 = abstractC0860x0.mo3262d0();
                m1793p0(iMo3262d1);
                int iMo3244H2 = abstractC0860x0.mo3244H() + iMo3262d1;
                do {
                    kp1Var.add(Integer.valueOf(abstractC0860x0.mo3256X()));
                } while (abstractC0860x0.mo3244H() < iMo3244H2);
                return;
            }
            if (i3 != 5) {
                re1.m4347b();
                return;
            }
            do {
                kp1Var.add(Integer.valueOf(abstractC0860x0.mo3256X()));
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O == this.f2409b);
            iMo3247O2 = iMo3247O;
        }
        this.f2411d = iMo3247O2;
    }

    /* JADX INFO: renamed from: Y */
    public void m1819Y(kp1 kp1Var) throws mp1 {
        int iMo3247O;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                kp1Var.add(Boolean.valueOf(abstractC0860x0.mo3257Y()));
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O == this.f2409b);
            this.f2411d = iMo3247O;
            return;
        }
        if (i != 2) {
            re1.m4347b();
            return;
        }
        int iMo3244H = abstractC0860x0.mo3244H() + abstractC0860x0.mo3262d0();
        do {
            kp1Var.add(Boolean.valueOf(abstractC0860x0.mo3257Y()));
        } while (abstractC0860x0.mo3244H() < iMo3244H);
        m1850o0(iMo3244H);
    }

    /* JADX INFO: renamed from: Z */
    public void m1820Z(kp1 kp1Var, boolean z) throws lp1 {
        String strMo3258Z;
        int iMo3247O;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        if ((this.f2409b & 7) != 2) {
            re1.m4347b();
            return;
        }
        do {
            if (z) {
                m1842k0(2);
                strMo3258Z = abstractC0860x0.mo3259a0();
            } else {
                m1842k0(2);
                strMo3258Z = abstractC0860x0.mo3258Z();
            }
            kp1Var.add(strMo3258Z);
            if (abstractC0860x0.mo3243G()) {
                return;
            } else {
                iMo3247O = abstractC0860x0.mo3247O();
            }
        } while (iMo3247O == this.f2409b);
        this.f2411d = iMo3247O;
    }

    /* JADX INFO: renamed from: a */
    public void m1821a(InterfaceC0187eu interfaceC0187eu) {
        Object obj;
        Object obj2;
        Object[] objArr = (Object[]) this.f2412e;
        int i = this.f2409b;
        int iHashCode = interfaceC0187eu.hashCode() * (-1640531527);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
        Object obj3 = objArr[i2];
        if (obj3 != null) {
            if (obj3.equals(interfaceC0187eu)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj2 = objArr[i2];
                if (obj2 == null) {
                }
            } while (!obj2.equals(interfaceC0187eu));
            return;
        }
        objArr[i2] = interfaceC0187eu;
        int i3 = this.f2410c + 1;
        this.f2410c = i3;
        if (i3 < this.f2411d) {
            return;
        }
        Object[] objArr2 = (Object[]) this.f2412e;
        int length = objArr2.length;
        int i4 = length << 1;
        int i5 = i4 - 1;
        Object[] objArr3 = new Object[i4];
        while (true) {
            int i6 = i3 - 1;
            if (i3 == 0) {
                this.f2409b = i5;
                this.f2411d = (int) (i4 * 0.75f);
                this.f2412e = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int iHashCode2 = obj.hashCode() * (-1640531527);
            int i7 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i5;
            if (objArr3[i7] != null) {
                do {
                    i7 = (i7 + 1) & i5;
                } while (objArr3[i7] != null);
            }
            objArr3[i7] = objArr2[length];
            i3 = i6;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m1822a0(kp1 kp1Var, hq1 hq1Var, so1 so1Var) throws mp1 {
        int iMo3247O;
        int i = this.f2409b;
        if ((i & 7) != 2) {
            re1.m4347b();
            return;
        }
        do {
            zo1 zo1VarMo464a = hq1Var.mo464a();
            m1844l0(zo1VarMo464a, hq1Var, so1Var);
            hq1Var.mo472i(zo1VarMo464a);
            kp1Var.add(zo1VarMo464a);
            AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
            if (abstractC0860x0.mo3243G() || this.f2411d != 0) {
                return;
            } else {
                iMo3247O = abstractC0860x0.mo3247O();
            }
        } while (iMo3247O == i);
        this.f2411d = iMo3247O;
    }

    /* JADX INFO: renamed from: b */
    public int m1823b() {
        switch (this.f2408a) {
            case 0:
                int i = this.f2411d;
                if (i != 0) {
                    this.f2409b = i;
                    this.f2411d = 0;
                } else {
                    this.f2409b = ((AbstractC0860x0) this.f2412e).mo243y();
                }
                int i2 = this.f2409b;
                if (i2 == 0 || i2 == this.f2410c) {
                    return Integer.MAX_VALUE;
                }
                return i2 >>> 3;
            default:
                int i3 = this.f2411d;
                if (i3 != 0) {
                    this.f2409b = i3;
                    this.f2411d = 0;
                } else {
                    this.f2409b = ((AbstractC0175ei) this.f2412e).mo696u();
                }
                int i4 = this.f2409b;
                if (i4 == 0 || i4 == this.f2410c) {
                    return Integer.MAX_VALUE;
                }
                return i4 >>> 3;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m1824b0(kp1 kp1Var, hq1 hq1Var, so1 so1Var) throws lp1 {
        int iMo3247O;
        int i = this.f2409b;
        if ((i & 7) != 3) {
            re1.m4347b();
            return;
        }
        do {
            zo1 zo1VarMo464a = hq1Var.mo464a();
            m1846m0(zo1VarMo464a, hq1Var, so1Var);
            hq1Var.mo472i(zo1VarMo464a);
            kp1Var.add(zo1VarMo464a);
            AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
            if (abstractC0860x0.mo3243G() || this.f2411d != 0) {
                return;
            } else {
                iMo3247O = abstractC0860x0.mo3247O();
            }
        } while (iMo3247O == i);
        this.f2411d = iMo3247O;
    }

    /* JADX INFO: renamed from: c */
    public void m1825c(Object obj, r51 r51Var, C0709sy c0709sy) {
        int i = this.f2410c;
        this.f2410c = ((this.f2409b >>> 3) << 3) | 4;
        try {
            r51Var.mo4253f(obj, this, c0709sy);
            if (this.f2409b != this.f2410c) {
                throw new hf0("Failed to parse the message.");
            }
            this.f2410c = i;
        } catch (Throwable th) {
            this.f2410c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m1826c0(kp1 kp1Var) throws lp1 {
        int iMo3247O;
        if ((this.f2409b & 7) != 2) {
            re1.m4347b();
            return;
        }
        do {
            kp1Var.add(m1856s0());
            AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
            if (abstractC0860x0.mo3243G()) {
                return;
            } else {
                iMo3247O = abstractC0860x0.mo3247O();
            }
        } while (iMo3247O == this.f2409b);
        this.f2411d = iMo3247O;
    }

    /* JADX INFO: renamed from: d */
    public void m1827d(Object obj, s51 s51Var, C0746ty c0746ty) {
        int i = this.f2410c;
        this.f2410c = ((this.f2409b >>> 3) << 3) | 4;
        try {
            s51Var.mo4480f(obj, this, c0746ty);
            if (this.f2409b != this.f2410c) {
                throw new if0("Failed to parse the message.");
            }
            this.f2410c = i;
        } catch (Throwable th) {
            this.f2410c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m1828d0(kp1 kp1Var) throws mp1 {
        int iMo3247O;
        int iMo3247O2;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        boolean z = kp1Var instanceof ap1;
        int i = this.f2409b;
        if (z) {
            ap1 ap1Var = (ap1) kp1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3244H = abstractC0860x0.mo3244H() + abstractC0860x0.mo3262d0();
                do {
                    ap1Var.m458e(abstractC0860x0.mo3262d0());
                } while (abstractC0860x0.mo3244H() < iMo3244H);
                m1850o0(iMo3244H);
                return;
            }
            do {
                ap1Var.m458e(abstractC0860x0.mo3262d0());
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O2 = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O2 == this.f2409b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3244H2 = abstractC0860x0.mo3244H() + abstractC0860x0.mo3262d0();
                do {
                    kp1Var.add(Integer.valueOf(abstractC0860x0.mo3262d0()));
                } while (abstractC0860x0.mo3244H() < iMo3244H2);
                m1850o0(iMo3244H2);
                return;
            }
            do {
                kp1Var.add(Integer.valueOf(abstractC0860x0.mo3262d0()));
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O == this.f2409b);
            iMo3247O2 = iMo3247O;
        }
        this.f2411d = iMo3247O2;
    }

    /* JADX INFO: renamed from: e */
    public void m1829e(Object obj, r51 r51Var, C0709sy c0709sy) throws hf0 {
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int iMo244z = abstractC0860x0.mo244z();
        if (abstractC0860x0.f8727j >= abstractC0860x0.f8728k) {
            throw new hf0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iMo220f = abstractC0860x0.mo220f(iMo244z);
        abstractC0860x0.f8727j++;
        r51Var.mo4253f(obj, this, c0709sy);
        abstractC0860x0.mo216a(0);
        abstractC0860x0.f8727j--;
        abstractC0860x0.mo219e(iMo220f);
    }

    /* JADX INFO: renamed from: e0 */
    public void m1830e0(kp1 kp1Var) throws mp1 {
        int iMo3247O;
        int iMo3247O2;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        boolean z = kp1Var instanceof ap1;
        int i = this.f2409b;
        if (z) {
            ap1 ap1Var = (ap1) kp1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3244H = abstractC0860x0.mo3244H() + abstractC0860x0.mo3262d0();
                do {
                    ap1Var.m458e(abstractC0860x0.mo3263e0());
                } while (abstractC0860x0.mo3244H() < iMo3244H);
                m1850o0(iMo3244H);
                return;
            }
            do {
                ap1Var.m458e(abstractC0860x0.mo3263e0());
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O2 = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O2 == this.f2409b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3244H2 = abstractC0860x0.mo3244H() + abstractC0860x0.mo3262d0();
                do {
                    kp1Var.add(Integer.valueOf(abstractC0860x0.mo3263e0()));
                } while (abstractC0860x0.mo3244H() < iMo3244H2);
                m1850o0(iMo3244H2);
                return;
            }
            do {
                kp1Var.add(Integer.valueOf(abstractC0860x0.mo3263e0()));
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O == this.f2409b);
            iMo3247O2 = iMo3247O;
        }
        this.f2411d = iMo3247O2;
    }

    /* JADX INFO: renamed from: f */
    public void m1831f(Object obj, s51 s51Var, C0746ty c0746ty) throws if0 {
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        int iMo697v = abstractC0175ei.mo697v();
        if (abstractC0175ei.f2094a >= 100) {
            throw new if0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iMo680e = abstractC0175ei.mo680e(iMo697v);
        abstractC0175ei.f2094a++;
        s51Var.mo4480f(obj, this, c0746ty);
        abstractC0175ei.mo676a(0);
        abstractC0175ei.f2094a--;
        abstractC0175ei.mo679d(iMo680e);
    }

    /* JADX INFO: renamed from: f0 */
    public void m1832f0(kp1 kp1Var) throws mp1 {
        int iMo3247O;
        int iMo3247O2;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        boolean z = kp1Var instanceof ap1;
        int i = this.f2409b;
        if (z) {
            ap1 ap1Var = (ap1) kp1Var;
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo3262d0 = abstractC0860x0.mo3262d0();
                m1793p0(iMo3262d0);
                int iMo3244H = abstractC0860x0.mo3244H() + iMo3262d0;
                do {
                    ap1Var.m458e(abstractC0860x0.mo3264f0());
                } while (abstractC0860x0.mo3244H() < iMo3244H);
                return;
            }
            if (i2 != 5) {
                re1.m4347b();
                return;
            }
            do {
                ap1Var.m458e(abstractC0860x0.mo3264f0());
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O2 = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O2 == this.f2409b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iMo3262d1 = abstractC0860x0.mo3262d0();
                m1793p0(iMo3262d1);
                int iMo3244H2 = abstractC0860x0.mo3244H() + iMo3262d1;
                do {
                    kp1Var.add(Integer.valueOf(abstractC0860x0.mo3264f0()));
                } while (abstractC0860x0.mo3244H() < iMo3244H2);
                return;
            }
            if (i3 != 5) {
                re1.m4347b();
                return;
            }
            do {
                kp1Var.add(Integer.valueOf(abstractC0860x0.mo3264f0()));
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O == this.f2409b);
            iMo3247O2 = iMo3247O;
        }
        this.f2411d = iMo3247O2;
    }

    /* JADX INFO: renamed from: g */
    public void m1833g(ee0 ee0Var) throws if0, hf0 {
        int iMo696u;
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                ((hy0) ee0Var).add(Boolean.valueOf(abstractC0175ei.mo681f()));
                if (abstractC0175ei.mo678c()) {
                    return;
                } else {
                    iMo696u = abstractC0175ei.mo696u();
                }
            } while (iMo696u == this.f2409b);
            this.f2411d = iMo696u;
            return;
        }
        if (i != 2) {
            throw if0.m2597b();
        }
        int iMo677b = abstractC0175ei.mo677b() + abstractC0175ei.mo697v();
        do {
            ((hy0) ee0Var).add(Boolean.valueOf(abstractC0175ei.mo681f()));
        } while (abstractC0175ei.mo677b() < iMo677b);
        m1812R(iMo677b);
    }

    /* JADX INFO: renamed from: g0 */
    public void m1834g0(kp1 kp1Var) throws mp1 {
        int iMo3247O;
        int iMo3247O2;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        boolean z = kp1Var instanceof pp1;
        int i = this.f2409b;
        if (z) {
            pp1 pp1Var = (pp1) kp1Var;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3262d0 = abstractC0860x0.mo3262d0();
                m1794q0(iMo3262d0);
                int iMo3244H = abstractC0860x0.mo3244H() + iMo3262d0;
                do {
                    pp1Var.m3974e(abstractC0860x0.mo3265g0());
                } while (abstractC0860x0.mo3244H() < iMo3244H);
                return;
            }
            do {
                pp1Var.m3974e(abstractC0860x0.mo3265g0());
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O2 = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O2 == this.f2409b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3262d1 = abstractC0860x0.mo3262d0();
                m1794q0(iMo3262d1);
                int iMo3244H2 = abstractC0860x0.mo3244H() + iMo3262d1;
                do {
                    kp1Var.add(Long.valueOf(abstractC0860x0.mo3265g0()));
                } while (abstractC0860x0.mo3244H() < iMo3244H2);
                return;
            }
            do {
                kp1Var.add(Long.valueOf(abstractC0860x0.mo3265g0()));
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O == this.f2409b);
            iMo3247O2 = iMo3247O;
        }
        this.f2411d = iMo3247O2;
    }

    /* JADX INFO: renamed from: h */
    public void m1835h(List list) throws if0, hf0 {
        int iMo243y;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                list.add(Boolean.valueOf(abstractC0860x0.mo221g()));
                if (abstractC0860x0.mo218c()) {
                    return;
                } else {
                    iMo243y = abstractC0860x0.mo243y();
                }
            } while (iMo243y == this.f2409b);
            this.f2411d = iMo243y;
            return;
        }
        if (i != 2) {
            throw hf0.m2259b();
        }
        int iMo217b = abstractC0860x0.mo217b() + abstractC0860x0.mo244z();
        do {
            list.add(Boolean.valueOf(abstractC0860x0.mo221g()));
        } while (abstractC0860x0.mo217b() < iMo217b);
        m1812R(iMo217b);
    }

    /* JADX INFO: renamed from: h0 */
    public void m1836h0(kp1 kp1Var) throws mp1 {
        int iMo3247O;
        int iMo3247O2;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        boolean z = kp1Var instanceof ap1;
        int i = this.f2409b;
        if (z) {
            ap1 ap1Var = (ap1) kp1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3244H = abstractC0860x0.mo3244H() + abstractC0860x0.mo3262d0();
                do {
                    ap1Var.m458e(abstractC0860x0.mo3266h0());
                } while (abstractC0860x0.mo3244H() < iMo3244H);
                m1850o0(iMo3244H);
                return;
            }
            do {
                ap1Var.m458e(abstractC0860x0.mo3266h0());
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O2 = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O2 == this.f2409b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3244H2 = abstractC0860x0.mo3244H() + abstractC0860x0.mo3262d0();
                do {
                    kp1Var.add(Integer.valueOf(abstractC0860x0.mo3266h0()));
                } while (abstractC0860x0.mo3244H() < iMo3244H2);
                m1850o0(iMo3244H2);
                return;
            }
            do {
                kp1Var.add(Integer.valueOf(abstractC0860x0.mo3266h0()));
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O == this.f2409b);
            iMo3247O2 = iMo3247O;
        }
        this.f2411d = iMo3247O2;
    }

    /* JADX INFO: renamed from: i */
    public C0762ud m1837i() throws gf0, ff0 {
        m1813S(2);
        return ((AbstractC0860x0) this.f2412e).mo222i();
    }

    /* JADX INFO: renamed from: i0 */
    public void m1838i0(kp1 kp1Var) throws mp1 {
        int iMo3247O;
        int iMo3247O2;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        boolean z = kp1Var instanceof pp1;
        int i = this.f2409b;
        if (z) {
            pp1 pp1Var = (pp1) kp1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3244H = abstractC0860x0.mo3244H() + abstractC0860x0.mo3262d0();
                do {
                    pp1Var.m3974e(abstractC0860x0.mo3267i0());
                } while (abstractC0860x0.mo3244H() < iMo3244H);
                m1850o0(iMo3244H);
                return;
            }
            do {
                pp1Var.m3974e(abstractC0860x0.mo3267i0());
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O2 = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O2 == this.f2409b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3244H2 = abstractC0860x0.mo3244H() + abstractC0860x0.mo3262d0();
                do {
                    kp1Var.add(Long.valueOf(abstractC0860x0.mo3267i0()));
                } while (abstractC0860x0.mo3244H() < iMo3244H2);
                m1850o0(iMo3244H2);
                return;
            }
            do {
                kp1Var.add(Long.valueOf(abstractC0860x0.mo3267i0()));
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O == this.f2409b);
            iMo3247O2 = iMo3247O;
        }
        this.f2411d = iMo3247O2;
    }

    /* JADX INFO: renamed from: j */
    public C0799vd m1839j() throws gf0, ff0 {
        m1813S(2);
        return ((AbstractC0175ei) this.f2412e).mo682g();
    }

    /* JADX INFO: renamed from: j0 */
    public void m1840j0(rp1 rp1Var, oq0 oq0Var, so1 so1Var) {
        int i;
        int i2;
        m1842k0(2);
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int iMo3240D = abstractC0860x0.mo3240D(abstractC0860x0.mo3262d0());
        Object obj = oq0Var.f5841l;
        Object objM1848n0 = "";
        Object objM1848n1 = obj;
        while (true) {
            try {
                int iM1854r0 = m1854r0();
                if (iM1854r0 == Integer.MAX_VALUE || abstractC0860x0.mo3243G()) {
                    break;
                }
                boolean zMo3249Q = false;
                if (iM1854r0 == 1) {
                    objM1848n0 = m1848n0((wq1) oq0Var.f5840k, null, null);
                } else if (iM1854r0 != 2) {
                    try {
                        if (!((abstractC0860x0.mo3243G() || (i2 = this.f2409b) == this.f2410c) ? false : abstractC0860x0.mo3249Q(i2))) {
                            throw new mp1("Unable to parse map entry.");
                        }
                    } catch (lp1 e) {
                        if (!abstractC0860x0.mo3243G() && (i = this.f2409b) != this.f2410c) {
                            zMo3249Q = abstractC0860x0.mo3249Q(i);
                        }
                        if (!zMo3249Q) {
                            throw new mp1("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objM1848n1 = m1848n0((wq1) oq0Var.f5842m, obj.getClass(), so1Var);
                }
            } catch (Throwable th) {
                abstractC0860x0.mo3241E(iMo3240D);
                throw th;
            }
        }
        rp1Var.put(objM1848n0, objM1848n1);
        abstractC0860x0.mo3241E(iMo3240D);
    }

    /* JADX INFO: renamed from: k */
    public void m1841k(ee0 ee0Var) throws gf0 {
        int iMo696u;
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        if ((this.f2409b & 7) != 2) {
            throw if0.m2597b();
        }
        do {
            ((hy0) ee0Var).add(m1839j());
            if (abstractC0175ei.mo678c()) {
                return;
            } else {
                iMo696u = abstractC0175ei.mo696u();
            }
        } while (iMo696u == this.f2409b);
        this.f2411d = iMo696u;
    }

    /* JADX INFO: renamed from: k0 */
    public void m1842k0(int i) {
        if ((this.f2409b & 7) == i) {
            return;
        }
        re1.m4347b();
    }

    /* JADX INFO: renamed from: l */
    public void m1843l(List list) throws ff0 {
        int iMo243y;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        if ((this.f2409b & 7) != 2) {
            throw hf0.m2259b();
        }
        do {
            list.add(m1837i());
            if (abstractC0860x0.mo218c()) {
                return;
            } else {
                iMo243y = abstractC0860x0.mo243y();
            }
        } while (iMo243y == this.f2409b);
        this.f2411d = iMo243y;
    }

    /* JADX INFO: renamed from: l0 */
    public void m1844l0(Object obj, hq1 hq1Var, so1 so1Var) throws mp1 {
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int iMo3262d0 = abstractC0860x0.mo3262d0();
        if (abstractC0860x0.f8727j + abstractC0860x0.f8728k >= 100) {
            re1.m4350e("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int iMo3240D = abstractC0860x0.mo3240D(iMo3262d0);
        abstractC0860x0.f8727j++;
        hq1Var.mo470g(obj, this, so1Var);
        abstractC0860x0.mo3248P(0);
        abstractC0860x0.f8727j--;
        abstractC0860x0.mo3241E(iMo3240D);
    }

    /* JADX INFO: renamed from: m */
    public void m1845m(ee0 ee0Var) throws if0 {
        int iMo696u;
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 1) {
            do {
                ((hy0) ee0Var).add(Double.valueOf(abstractC0175ei.mo683h()));
                if (abstractC0175ei.mo678c()) {
                    return;
                } else {
                    iMo696u = abstractC0175ei.mo696u();
                }
            } while (iMo696u == this.f2409b);
            this.f2411d = iMo696u;
            return;
        }
        if (i != 2) {
            throw if0.m2597b();
        }
        int iMo697v = abstractC0175ei.mo697v();
        if ((iMo697v & 7) != 0) {
            throw new if0("Failed to parse the message.");
        }
        int iMo677b = abstractC0175ei.mo677b() + iMo697v;
        do {
            ((hy0) ee0Var).add(Double.valueOf(abstractC0175ei.mo683h()));
        } while (abstractC0175ei.mo677b() < iMo677b);
    }

    /* JADX INFO: renamed from: m0 */
    public void m1846m0(Object obj, hq1 hq1Var, so1 so1Var) {
        int i = this.f2410c;
        this.f2410c = ((this.f2409b >>> 3) << 3) | 4;
        try {
            hq1Var.mo470g(obj, this, so1Var);
            if (this.f2409b != this.f2410c) {
                throw new mp1("Failed to parse the message.");
            }
            this.f2410c = i;
        } catch (Throwable th) {
            this.f2410c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m1847n(List list) throws hf0 {
        int iMo243y;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 1) {
            do {
                list.add(Double.valueOf(abstractC0860x0.mo223k()));
                if (abstractC0860x0.mo218c()) {
                    return;
                } else {
                    iMo243y = abstractC0860x0.mo243y();
                }
            } while (iMo243y == this.f2409b);
            this.f2411d = iMo243y;
            return;
        }
        if (i != 2) {
            throw hf0.m2259b();
        }
        int iMo244z = abstractC0860x0.mo244z();
        if ((iMo244z & 7) != 0) {
            throw new hf0("Failed to parse the message.");
        }
        int iMo217b = abstractC0860x0.mo217b() + iMo244z;
        do {
            list.add(Double.valueOf(abstractC0860x0.mo223k()));
        } while (abstractC0860x0.mo217b() < iMo217b);
    }

    /* JADX INFO: renamed from: n0 */
    public Object m1848n0(wq1 wq1Var, Class cls, so1 so1Var) throws mp1 {
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        wq1 wq1Var2 = wq1.f8639l;
        switch (wq1Var.ordinal()) {
            case 0:
                m1842k0(1);
                return Double.valueOf(abstractC0860x0.mo3250R());
            case 1:
                m1842k0(5);
                return Float.valueOf(abstractC0860x0.mo3251S());
            case 2:
                m1842k0(0);
                return Long.valueOf(abstractC0860x0.mo3253U());
            case 3:
                m1842k0(0);
                return Long.valueOf(abstractC0860x0.mo3252T());
            case 4:
                m1842k0(0);
                return Integer.valueOf(abstractC0860x0.mo3254V());
            case 5:
                m1842k0(1);
                return Long.valueOf(abstractC0860x0.mo3255W());
            case 6:
                m1842k0(5);
                return Integer.valueOf(abstractC0860x0.mo3256X());
            case 7:
                m1842k0(0);
                return Boolean.valueOf(abstractC0860x0.mo3257Y());
            case 8:
                m1842k0(2);
                return abstractC0860x0.mo3259a0();
            case 9:
            default:
                C0270h1.m2190f("unsupported field type.");
                return null;
            case 10:
                m1842k0(2);
                hq1 hq1VarM1495a = eq1.f2165c.m1495a(cls);
                zo1 zo1VarMo464a = hq1VarM1495a.mo464a();
                m1844l0(zo1VarMo464a, hq1VarM1495a, so1Var);
                hq1VarM1495a.mo472i(zo1VarMo464a);
                return zo1VarMo464a;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                return m1856s0();
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                m1842k0(0);
                return Integer.valueOf(abstractC0860x0.mo3262d0());
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                m1842k0(0);
                return Integer.valueOf(abstractC0860x0.mo3263e0());
            case 14:
                m1842k0(5);
                return Integer.valueOf(abstractC0860x0.mo3264f0());
            case 15:
                m1842k0(1);
                return Long.valueOf(abstractC0860x0.mo3265g0());
            case 16:
                m1842k0(0);
                return Integer.valueOf(abstractC0860x0.mo3266h0());
            case 17:
                m1842k0(0);
                return Long.valueOf(abstractC0860x0.mo3267i0());
        }
    }

    /* JADX INFO: renamed from: o */
    public void m1849o(ee0 ee0Var) throws if0, hf0 {
        int iMo696u;
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                ((hy0) ee0Var).add(Integer.valueOf(abstractC0175ei.mo684i()));
                if (abstractC0175ei.mo678c()) {
                    return;
                } else {
                    iMo696u = abstractC0175ei.mo696u();
                }
            } while (iMo696u == this.f2409b);
            this.f2411d = iMo696u;
            return;
        }
        if (i != 2) {
            throw if0.m2597b();
        }
        int iMo677b = abstractC0175ei.mo677b() + abstractC0175ei.mo697v();
        do {
            ((hy0) ee0Var).add(Integer.valueOf(abstractC0175ei.mo684i()));
        } while (abstractC0175ei.mo677b() < iMo677b);
        m1812R(iMo677b);
    }

    /* JADX INFO: renamed from: o0 */
    public void m1850o0(int i) throws mp1 {
        if (((AbstractC0860x0) this.f2412e).mo3244H() == i) {
            return;
        }
        re1.m4350e("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: p */
    public void m1851p(List list) throws if0, hf0 {
        int iMo243y;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(abstractC0860x0.mo224l()));
                if (abstractC0860x0.mo218c()) {
                    return;
                } else {
                    iMo243y = abstractC0860x0.mo243y();
                }
            } while (iMo243y == this.f2409b);
            this.f2411d = iMo243y;
            return;
        }
        if (i != 2) {
            throw hf0.m2259b();
        }
        int iMo217b = abstractC0860x0.mo217b() + abstractC0860x0.mo244z();
        do {
            list.add(Integer.valueOf(abstractC0860x0.mo224l()));
        } while (abstractC0860x0.mo217b() < iMo217b);
        m1812R(iMo217b);
    }

    /* JADX INFO: renamed from: q */
    public Object m1852q(jk1 jk1Var, Class cls, C0709sy c0709sy) throws gf0, hf0 {
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        switch (jk1Var.ordinal()) {
            case 0:
                m1813S(1);
                return Double.valueOf(abstractC0860x0.mo223k());
            case 1:
                m1813S(5);
                return Float.valueOf(abstractC0860x0.mo230o());
            case 2:
                m1813S(0);
                return Long.valueOf(abstractC0860x0.mo234q());
            case 3:
                m1813S(0);
                return Long.valueOf(abstractC0860x0.mo214A());
            case 4:
                m1813S(0);
                return Integer.valueOf(abstractC0860x0.mo232p());
            case 5:
                m1813S(1);
                return Long.valueOf(abstractC0860x0.mo228n());
            case 6:
                m1813S(5);
                return Integer.valueOf(abstractC0860x0.mo226m());
            case 7:
                m1813S(0);
                return Boolean.valueOf(abstractC0860x0.mo221g());
            case 8:
                m1813S(2);
                return abstractC0860x0.mo242x();
            case 9:
            default:
                C0270h1.m2190f("unsupported field type.");
                return null;
            case 10:
                m1813S(2);
                r51 r51VarM1525a = ey0.f2207c.m1525a(cls);
                s70 s70VarMo4251d = r51VarM1525a.mo4251d();
                m1829e(s70VarMo4251d, r51VarM1525a, c0709sy);
                r51VarM1525a.mo4249b(s70VarMo4251d);
                return s70VarMo4251d;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                return m1837i();
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                m1813S(0);
                return Integer.valueOf(abstractC0860x0.mo244z());
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                m1813S(0);
                return Integer.valueOf(abstractC0860x0.mo224l());
            case 14:
                m1813S(5);
                return Integer.valueOf(abstractC0860x0.mo237s());
            case 15:
                m1813S(1);
                return Long.valueOf(abstractC0860x0.mo238t());
            case 16:
                m1813S(0);
                return Integer.valueOf(abstractC0860x0.mo239u());
            case 17:
                m1813S(0);
                return Long.valueOf(abstractC0860x0.mo240v());
        }
    }

    /* JADX INFO: renamed from: r */
    public Object m1853r(kk1 kk1Var, Class cls, C0746ty c0746ty) throws ff0, if0 {
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        switch (kk1Var.ordinal()) {
            case 0:
                m1813S(1);
                return Double.valueOf(abstractC0175ei.mo683h());
            case 1:
                m1813S(5);
                return Float.valueOf(abstractC0175ei.mo687l());
            case 2:
                m1813S(0);
                return Long.valueOf(abstractC0175ei.mo689n());
            case 3:
                m1813S(0);
                return Long.valueOf(abstractC0175ei.mo698w());
            case 4:
                m1813S(0);
                return Integer.valueOf(abstractC0175ei.mo688m());
            case 5:
                m1813S(1);
                return Long.valueOf(abstractC0175ei.mo686k());
            case 6:
                m1813S(5);
                return Integer.valueOf(abstractC0175ei.mo685j());
            case 7:
                m1813S(0);
                return Boolean.valueOf(abstractC0175ei.mo681f());
            case 8:
                m1813S(2);
                return abstractC0175ei.mo695t();
            case 9:
            default:
                C0270h1.m2190f("unsupported field type.");
                return null;
            case 10:
                m1813S(2);
                s51 s51VarM1907a = fy0.f2536c.m1907a(cls);
                t70 t70VarMo4478d = s51VarM1907a.mo4478d();
                m1831f(t70VarMo4478d, s51VarM1907a, c0746ty);
                s51VarM1907a.mo4476b(t70VarMo4478d);
                return t70VarMo4478d;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                return m1839j();
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                m1813S(0);
                return Integer.valueOf(abstractC0175ei.mo697v());
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                m1813S(0);
                return Integer.valueOf(abstractC0175ei.mo684i());
            case 14:
                m1813S(5);
                return Integer.valueOf(abstractC0175ei.mo690o());
            case 15:
                m1813S(1);
                return Long.valueOf(abstractC0175ei.mo691p());
            case 16:
                m1813S(0);
                return Integer.valueOf(abstractC0175ei.mo692q());
            case 17:
                m1813S(0);
                return Long.valueOf(abstractC0175ei.mo693r());
        }
    }

    /* JADX INFO: renamed from: r0 */
    public int m1854r0() {
        int iMo3247O = this.f2411d;
        if (iMo3247O != 0) {
            this.f2409b = iMo3247O;
            this.f2411d = 0;
        } else {
            iMo3247O = ((AbstractC0860x0) this.f2412e).mo3247O();
            this.f2409b = iMo3247O;
        }
        if (iMo3247O == 0 || iMo3247O == this.f2410c) {
            return Integer.MAX_VALUE;
        }
        return iMo3247O >>> 3;
    }

    /* JADX INFO: renamed from: s */
    public void m1855s(ee0 ee0Var) throws if0 {
        int iMo696u;
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 2) {
            int iMo697v = abstractC0175ei.mo697v();
            if ((iMo697v & 3) != 0) {
                throw new if0("Failed to parse the message.");
            }
            int iMo677b = abstractC0175ei.mo677b() + iMo697v;
            do {
                ((hy0) ee0Var).add(Integer.valueOf(abstractC0175ei.mo685j()));
            } while (abstractC0175ei.mo677b() < iMo677b);
            return;
        }
        if (i != 5) {
            throw if0.m2597b();
        }
        do {
            ((hy0) ee0Var).add(Integer.valueOf(abstractC0175ei.mo685j()));
            if (abstractC0175ei.mo678c()) {
                return;
            } else {
                iMo696u = abstractC0175ei.mo696u();
            }
        } while (iMo696u == this.f2409b);
        this.f2411d = iMo696u;
    }

    /* JADX INFO: renamed from: s0 */
    public ko1 m1856s0() {
        m1842k0(2);
        return ((AbstractC0860x0) this.f2412e).mo3260b0();
    }

    /* JADX INFO: renamed from: t */
    public void m1857t(List list) throws hf0 {
        int iMo243y;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 2) {
            int iMo244z = abstractC0860x0.mo244z();
            if ((iMo244z & 3) != 0) {
                throw new hf0("Failed to parse the message.");
            }
            int iMo217b = abstractC0860x0.mo217b() + iMo244z;
            do {
                list.add(Integer.valueOf(abstractC0860x0.mo226m()));
            } while (abstractC0860x0.mo217b() < iMo217b);
            return;
        }
        if (i != 5) {
            throw hf0.m2259b();
        }
        do {
            list.add(Integer.valueOf(abstractC0860x0.mo226m()));
            if (abstractC0860x0.mo218c()) {
                return;
            } else {
                iMo243y = abstractC0860x0.mo243y();
            }
        } while (iMo243y == this.f2409b);
        this.f2411d = iMo243y;
    }

    /* JADX INFO: renamed from: t0 */
    public void m1858t0(kp1 kp1Var) throws mp1 {
        int iMo3247O;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 1) {
            do {
                kp1Var.add(Double.valueOf(abstractC0860x0.mo3250R()));
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O == this.f2409b);
            this.f2411d = iMo3247O;
            return;
        }
        if (i != 2) {
            re1.m4347b();
            return;
        }
        int iMo3262d0 = abstractC0860x0.mo3262d0();
        m1794q0(iMo3262d0);
        int iMo3244H = abstractC0860x0.mo3244H() + iMo3262d0;
        do {
            kp1Var.add(Double.valueOf(abstractC0860x0.mo3250R()));
        } while (abstractC0860x0.mo3244H() < iMo3244H);
    }

    /* JADX INFO: renamed from: u */
    public void m1859u(ee0 ee0Var) throws if0 {
        int iMo696u;
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 1) {
            do {
                ((hy0) ee0Var).add(Long.valueOf(abstractC0175ei.mo686k()));
                if (abstractC0175ei.mo678c()) {
                    return;
                } else {
                    iMo696u = abstractC0175ei.mo696u();
                }
            } while (iMo696u == this.f2409b);
            this.f2411d = iMo696u;
            return;
        }
        if (i != 2) {
            throw if0.m2597b();
        }
        int iMo697v = abstractC0175ei.mo697v();
        if ((iMo697v & 7) != 0) {
            throw new if0("Failed to parse the message.");
        }
        int iMo677b = abstractC0175ei.mo677b() + iMo697v;
        do {
            ((hy0) ee0Var).add(Long.valueOf(abstractC0175ei.mo686k()));
        } while (abstractC0175ei.mo677b() < iMo677b);
    }

    /* JADX INFO: renamed from: u0 */
    public void m1860u0(kp1 kp1Var) throws mp1 {
        int iMo3247O;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 2) {
            int iMo3262d0 = abstractC0860x0.mo3262d0();
            m1793p0(iMo3262d0);
            int iMo3244H = abstractC0860x0.mo3244H() + iMo3262d0;
            do {
                kp1Var.add(Float.valueOf(abstractC0860x0.mo3251S()));
            } while (abstractC0860x0.mo3244H() < iMo3244H);
            return;
        }
        if (i != 5) {
            re1.m4347b();
            return;
        }
        do {
            kp1Var.add(Float.valueOf(abstractC0860x0.mo3251S()));
            if (abstractC0860x0.mo3243G()) {
                return;
            } else {
                iMo3247O = abstractC0860x0.mo3247O();
            }
        } while (iMo3247O == this.f2409b);
        this.f2411d = iMo3247O;
    }

    /* JADX INFO: renamed from: v */
    public void m1861v(List list) throws hf0 {
        int iMo243y;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 1) {
            do {
                list.add(Long.valueOf(abstractC0860x0.mo228n()));
                if (abstractC0860x0.mo218c()) {
                    return;
                } else {
                    iMo243y = abstractC0860x0.mo243y();
                }
            } while (iMo243y == this.f2409b);
            this.f2411d = iMo243y;
            return;
        }
        if (i != 2) {
            throw hf0.m2259b();
        }
        int iMo244z = abstractC0860x0.mo244z();
        if ((iMo244z & 7) != 0) {
            throw new hf0("Failed to parse the message.");
        }
        int iMo217b = abstractC0860x0.mo217b() + iMo244z;
        do {
            list.add(Long.valueOf(abstractC0860x0.mo228n()));
        } while (abstractC0860x0.mo217b() < iMo217b);
    }

    /* JADX INFO: renamed from: v0 */
    public void m1862v0(kp1 kp1Var) throws mp1 {
        int iMo3247O;
        int iMo3247O2;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        boolean z = kp1Var instanceof pp1;
        int i = this.f2409b;
        if (z) {
            pp1 pp1Var = (pp1) kp1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3244H = abstractC0860x0.mo3244H() + abstractC0860x0.mo3262d0();
                do {
                    pp1Var.m3974e(abstractC0860x0.mo3252T());
                } while (abstractC0860x0.mo3244H() < iMo3244H);
                m1850o0(iMo3244H);
                return;
            }
            do {
                pp1Var.m3974e(abstractC0860x0.mo3252T());
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O2 = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O2 == this.f2409b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    re1.m4347b();
                    return;
                }
                int iMo3244H2 = abstractC0860x0.mo3244H() + abstractC0860x0.mo3262d0();
                do {
                    kp1Var.add(Long.valueOf(abstractC0860x0.mo3252T()));
                } while (abstractC0860x0.mo3244H() < iMo3244H2);
                m1850o0(iMo3244H2);
                return;
            }
            do {
                kp1Var.add(Long.valueOf(abstractC0860x0.mo3252T()));
                if (abstractC0860x0.mo3243G()) {
                    return;
                } else {
                    iMo3247O = abstractC0860x0.mo3247O();
                }
            } while (iMo3247O == this.f2409b);
            iMo3247O2 = iMo3247O;
        }
        this.f2411d = iMo3247O2;
    }

    /* JADX INFO: renamed from: w */
    public void m1863w(ee0 ee0Var) throws if0 {
        int iMo696u;
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 2) {
            int iMo697v = abstractC0175ei.mo697v();
            if ((iMo697v & 3) != 0) {
                throw new if0("Failed to parse the message.");
            }
            int iMo677b = abstractC0175ei.mo677b() + iMo697v;
            do {
                ((hy0) ee0Var).add(Float.valueOf(abstractC0175ei.mo687l()));
            } while (abstractC0175ei.mo677b() < iMo677b);
            return;
        }
        if (i != 5) {
            throw if0.m2597b();
        }
        do {
            ((hy0) ee0Var).add(Float.valueOf(abstractC0175ei.mo687l()));
            if (abstractC0175ei.mo678c()) {
                return;
            } else {
                iMo696u = abstractC0175ei.mo696u();
            }
        } while (iMo696u == this.f2409b);
        this.f2411d = iMo696u;
    }

    /* JADX INFO: renamed from: x */
    public void m1864x(List list) throws hf0 {
        int iMo243y;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 2) {
            int iMo244z = abstractC0860x0.mo244z();
            if ((iMo244z & 3) != 0) {
                throw new hf0("Failed to parse the message.");
            }
            int iMo217b = abstractC0860x0.mo217b() + iMo244z;
            do {
                list.add(Float.valueOf(abstractC0860x0.mo230o()));
            } while (abstractC0860x0.mo217b() < iMo217b);
            return;
        }
        if (i != 5) {
            throw hf0.m2259b();
        }
        do {
            list.add(Float.valueOf(abstractC0860x0.mo230o()));
            if (abstractC0860x0.mo218c()) {
                return;
            } else {
                iMo243y = abstractC0860x0.mo243y();
            }
        } while (iMo243y == this.f2409b);
        this.f2411d = iMo243y;
    }

    /* JADX INFO: renamed from: y */
    public void m1865y(ee0 ee0Var) throws if0, hf0 {
        int iMo696u;
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                ((hy0) ee0Var).add(Integer.valueOf(abstractC0175ei.mo688m()));
                if (abstractC0175ei.mo678c()) {
                    return;
                } else {
                    iMo696u = abstractC0175ei.mo696u();
                }
            } while (iMo696u == this.f2409b);
            this.f2411d = iMo696u;
            return;
        }
        if (i != 2) {
            throw if0.m2597b();
        }
        int iMo677b = abstractC0175ei.mo677b() + abstractC0175ei.mo697v();
        do {
            ((hy0) ee0Var).add(Integer.valueOf(abstractC0175ei.mo688m()));
        } while (abstractC0175ei.mo677b() < iMo677b);
        m1812R(iMo677b);
    }

    /* JADX INFO: renamed from: z */
    public void m1866z(List list) throws if0, hf0 {
        int iMo243y;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) this.f2412e;
        int i = this.f2409b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(abstractC0860x0.mo232p()));
                if (abstractC0860x0.mo218c()) {
                    return;
                } else {
                    iMo243y = abstractC0860x0.mo243y();
                }
            } while (iMo243y == this.f2409b);
            this.f2411d = iMo243y;
            return;
        }
        if (i != 2) {
            throw hf0.m2259b();
        }
        int iMo217b = abstractC0860x0.mo217b() + abstractC0860x0.mo244z();
        do {
            list.add(Integer.valueOf(abstractC0860x0.mo232p()));
        } while (abstractC0860x0.mo217b() < iMo217b);
        m1812R(iMo217b);
    }

    public C0212fi(AbstractC0860x0 abstractC0860x0, byte b) {
        this.f2408a = 3;
        this.f2411d = 0;
        this.f2412e = abstractC0860x0;
        abstractC0860x0.f8729l = this;
    }

    public C0212fi(AbstractC0860x0 abstractC0860x0) {
        this.f2408a = 0;
        this.f2411d = 0;
        Charset charset = fe0.f2381a;
        this.f2412e = abstractC0860x0;
        abstractC0860x0.f8729l = this;
    }

    public /* synthetic */ C0212fi() {
        this.f2408a = 2;
    }
}
