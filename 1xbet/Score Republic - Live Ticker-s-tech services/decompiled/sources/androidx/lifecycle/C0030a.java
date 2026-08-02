package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC0024an;
import p000.C0270h1;
import p000.C0304hz;
import p000.C0719t7;
import p000.InterfaceC0738tq;
import p000.bi0;
import p000.dd0;
import p000.l41;
import p000.l70;
import p000.m41;
import p000.n41;
import p000.nh0;
import p000.ph0;
import p000.qh0;
import p000.uh0;
import p000.xh0;
import p000.yh0;
import p000.zh0;

/* JADX INFO: renamed from: androidx.lifecycle.a */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0030a {

    /* JADX INFO: renamed from: a */
    public final boolean f549a;

    /* JADX INFO: renamed from: b */
    public C0304hz f550b;

    /* JADX INFO: renamed from: c */
    public qh0 f551c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f552d;

    /* JADX INFO: renamed from: e */
    public int f553e;

    /* JADX INFO: renamed from: f */
    public boolean f554f;

    /* JADX INFO: renamed from: g */
    public boolean f555g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f556h;

    public C0030a(yh0 yh0Var) {
        new AtomicReference();
        this.f549a = true;
        this.f550b = new C0304hz();
        this.f551c = qh0.f6498k;
        this.f556h = new ArrayList();
        this.f552d = new WeakReference(yh0Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m437a(xh0 xh0Var) {
        uh0 reflectiveGenericLifecycleObserver;
        Object obj;
        yh0 yh0Var;
        ph0 ph0Var;
        m439c("addObserver");
        qh0 qh0Var = this.f551c;
        qh0 qh0Var2 = qh0.f6497j;
        if (qh0Var != qh0Var2) {
            qh0Var2 = qh0.f6498k;
        }
        zh0 zh0Var = new zh0();
        HashMap map = bi0.f884a;
        boolean z = xh0Var instanceof uh0;
        boolean z2 = xh0Var instanceof InterfaceC0738tq;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0738tq) xh0Var, (uh0) xh0Var);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0738tq) xh0Var, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (uh0) xh0Var;
        } else {
            Class<?> cls = xh0Var.getClass();
            if (bi0.m701b(cls) == 2) {
                Object obj2 = bi0.f885b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    bi0.m700a((Constructor) list.get(0), xh0Var);
                    throw null;
                }
                int size = list.size();
                l70[] l70VarArr = new l70[size];
                if (size > 0) {
                    bi0.m700a((Constructor) list.get(0), xh0Var);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(l70VarArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(xh0Var);
            }
        }
        zh0Var.f9770b = reflectiveGenericLifecycleObserver;
        zh0Var.f9769a = qh0Var2;
        C0304hz c0304hz = this.f550b;
        m41 m41VarMo2353b = c0304hz.mo2353b(xh0Var);
        if (m41VarMo2353b != null) {
            obj = m41VarMo2353b.f4973k;
        } else {
            HashMap map2 = c0304hz.f3362n;
            m41 m41Var = new m41(xh0Var, zh0Var);
            c0304hz.f5985m++;
            m41 m41Var2 = c0304hz.f5983k;
            if (m41Var2 == null) {
                c0304hz.f5982j = m41Var;
                c0304hz.f5983k = m41Var;
            } else {
                m41Var2.f4974l = m41Var;
                m41Var.f4975m = m41Var2;
                c0304hz.f5983k = m41Var;
            }
            map2.put(xh0Var, m41Var);
            obj = null;
        }
        if (((zh0) obj) == null && (yh0Var = (yh0) this.f552d.get()) != null) {
            boolean z3 = this.f553e != 0 || this.f554f;
            qh0 qh0VarM438b = m438b(xh0Var);
            this.f553e++;
            while (zh0Var.f9769a.compareTo(qh0VarM438b) < 0 && this.f550b.f3362n.containsKey(xh0Var)) {
                qh0 qh0Var3 = zh0Var.f9769a;
                ArrayList arrayList = this.f556h;
                arrayList.add(qh0Var3);
                nh0 nh0Var = ph0.Companion;
                qh0 qh0Var4 = zh0Var.f9769a;
                nh0Var.getClass();
                qh0Var4.getClass();
                int iOrdinal = qh0Var4.ordinal();
                if (iOrdinal == 1) {
                    ph0Var = ph0.ON_CREATE;
                } else if (iOrdinal != 2) {
                    ph0Var = iOrdinal != 3 ? null : ph0.ON_RESUME;
                } else {
                    ph0Var = ph0.ON_START;
                }
                if (ph0Var == null) {
                    dd0.m1166l(zh0Var.f9769a, "no event up from ");
                    return;
                } else {
                    zh0Var.m5908a(yh0Var, ph0Var);
                    arrayList.remove(arrayList.size() - 1);
                    qh0VarM438b = m438b(xh0Var);
                }
            }
            if (!z3) {
                m443g();
            }
            this.f553e--;
        }
    }

    /* JADX INFO: renamed from: b */
    public final qh0 m438b(xh0 xh0Var) {
        zh0 zh0Var;
        HashMap map = this.f550b.f3362n;
        m41 m41Var = map.containsKey(xh0Var) ? ((m41) map.get(xh0Var)).f4975m : null;
        qh0 qh0Var = (m41Var == null || (zh0Var = (zh0) m41Var.f4973k) == null) ? null : zh0Var.f9769a;
        ArrayList arrayList = this.f556h;
        qh0 qh0Var2 = arrayList.isEmpty() ? null : (qh0) arrayList.get(arrayList.size() - 1);
        qh0 qh0Var3 = this.f551c;
        qh0Var3.getClass();
        if (qh0Var == null || qh0Var.compareTo(qh0Var3) >= 0) {
            qh0Var = qh0Var3;
        }
        return (qh0Var2 == null || qh0Var2.compareTo(qh0Var) >= 0) ? qh0Var : qh0Var2;
    }

    /* JADX INFO: renamed from: c */
    public final void m439c(String str) {
        if (this.f549a) {
            ((C0719t7) C0719t7.m4750G().f7328p).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0024an.m284g("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m440d(ph0 ph0Var) {
        ph0Var.getClass();
        m439c("handleLifecycleEvent");
        m441e(ph0Var.m3918a());
    }

    /* JADX INFO: renamed from: e */
    public final void m441e(qh0 qh0Var) {
        qh0 qh0Var2 = this.f551c;
        if (qh0Var2 == qh0Var) {
            return;
        }
        qh0 qh0Var3 = qh0.f6498k;
        qh0 qh0Var4 = qh0.f6497j;
        if (qh0Var2 == qh0Var3 && qh0Var == qh0Var4) {
            StringBuilder sb = new StringBuilder("no event down from ");
            sb.append(this.f551c);
            Object obj = this.f552d.get();
            sb.append(" in component ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.f551c = qh0Var;
        if (this.f554f || this.f553e != 0) {
            this.f555g = true;
            return;
        }
        this.f554f = true;
        m443g();
        this.f554f = false;
        if (this.f551c == qh0Var4) {
            this.f550b = new C0304hz();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m442f(xh0 xh0Var) {
        xh0Var.getClass();
        m439c("removeObserver");
        this.f550b.mo2354c(xh0Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m443g() {
        ph0 ph0Var;
        ph0 ph0Var2;
        yh0 yh0Var = (yh0) this.f552d.get();
        if (yh0Var == null) {
            C0270h1.m2191g("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            C0304hz c0304hz = this.f550b;
            if (c0304hz.f5985m != 0) {
                m41 m41Var = c0304hz.f5982j;
                m41Var.getClass();
                qh0 qh0Var = ((zh0) m41Var.f4973k).f9769a;
                m41 m41Var2 = this.f550b.f5983k;
                m41Var2.getClass();
                qh0 qh0Var2 = ((zh0) m41Var2.f4973k).f9769a;
                if (qh0Var == qh0Var2 && this.f551c == qh0Var2) {
                    break;
                }
                this.f555g = false;
                qh0 qh0Var3 = this.f551c;
                m41 m41Var3 = this.f550b.f5982j;
                m41Var3.getClass();
                int iCompareTo = qh0Var3.compareTo(((zh0) m41Var3.f4973k).f9769a);
                ArrayList arrayList = this.f556h;
                if (iCompareTo < 0) {
                    C0304hz c0304hz2 = this.f550b;
                    l41 l41Var = new l41(c0304hz2.f5983k, c0304hz2.f5982j, 1);
                    c0304hz2.f5984l.put(l41Var, Boolean.FALSE);
                    while (l41Var.hasNext() && !this.f555g) {
                        Map.Entry entry = (Map.Entry) l41Var.next();
                        entry.getClass();
                        xh0 xh0Var = (xh0) entry.getKey();
                        zh0 zh0Var = (zh0) entry.getValue();
                        while (zh0Var.f9769a.compareTo(this.f551c) > 0 && !this.f555g && this.f550b.f3362n.containsKey(xh0Var)) {
                            nh0 nh0Var = ph0.Companion;
                            qh0 qh0Var4 = zh0Var.f9769a;
                            nh0Var.getClass();
                            qh0Var4.getClass();
                            int iOrdinal = qh0Var4.ordinal();
                            if (iOrdinal == 2) {
                                ph0Var2 = ph0.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                ph0Var2 = iOrdinal != 4 ? null : ph0.ON_PAUSE;
                            } else {
                                ph0Var2 = ph0.ON_STOP;
                            }
                            if (ph0Var2 == null) {
                                dd0.m1166l(zh0Var.f9769a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(ph0Var2.m3918a());
                                zh0Var.m5908a(yh0Var, ph0Var2);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                m41 m41Var4 = this.f550b.f5983k;
                if (!this.f555g && m41Var4 != null && this.f551c.compareTo(((zh0) m41Var4.f4973k).f9769a) > 0) {
                    C0304hz c0304hz3 = this.f550b;
                    c0304hz3.getClass();
                    n41 n41Var = new n41(c0304hz3);
                    c0304hz3.f5984l.put(n41Var, Boolean.FALSE);
                    while (n41Var.hasNext() && !this.f555g) {
                        Map.Entry entry2 = (Map.Entry) n41Var.next();
                        xh0 xh0Var2 = (xh0) entry2.getKey();
                        zh0 zh0Var2 = (zh0) entry2.getValue();
                        while (zh0Var2.f9769a.compareTo(this.f551c) < 0 && !this.f555g && this.f550b.f3362n.containsKey(xh0Var2)) {
                            arrayList.add(zh0Var2.f9769a);
                            nh0 nh0Var2 = ph0.Companion;
                            qh0 qh0Var5 = zh0Var2.f9769a;
                            nh0Var2.getClass();
                            qh0Var5.getClass();
                            int iOrdinal2 = qh0Var5.ordinal();
                            if (iOrdinal2 == 1) {
                                ph0Var = ph0.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                ph0Var = iOrdinal2 != 3 ? null : ph0.ON_RESUME;
                            } else {
                                ph0Var = ph0.ON_START;
                            }
                            if (ph0Var == null) {
                                dd0.m1166l(zh0Var2.f9769a, "no event up from ");
                                return;
                            } else {
                                zh0Var2.m5908a(yh0Var, ph0Var);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f555g = false;
    }
}
