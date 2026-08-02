package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: bq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0071bq {

    /* JADX INFO: renamed from: a */
    public final ArrayList f942a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f943b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public q80 f944c;

    /* JADX INFO: renamed from: d */
    public Object f945d;

    /* JADX INFO: renamed from: e */
    public int f946e;

    /* JADX INFO: renamed from: f */
    public int f947f;

    /* JADX INFO: renamed from: g */
    public Class f948g;

    /* JADX INFO: renamed from: h */
    public p90 f949h;

    /* JADX INFO: renamed from: i */
    public uu0 f950i;

    /* JADX INFO: renamed from: j */
    public Map f951j;

    /* JADX INFO: renamed from: k */
    public Class f952k;

    /* JADX INFO: renamed from: l */
    public boolean f953l;

    /* JADX INFO: renamed from: m */
    public boolean f954m;

    /* JADX INFO: renamed from: n */
    public xg0 f955n;

    /* JADX INFO: renamed from: o */
    public ex0 f956o;

    /* JADX INFO: renamed from: p */
    public C0371jt f957p;

    /* JADX INFO: renamed from: q */
    public boolean f958q;

    /* JADX INFO: renamed from: r */
    public boolean f959r;

    /* JADX INFO: renamed from: a */
    public final ArrayList m740a() {
        boolean z = this.f954m;
        ArrayList arrayList = this.f943b;
        if (!z) {
            this.f954m = true;
            arrayList.clear();
            ArrayList arrayListM741b = m741b();
            int size = arrayListM741b.size();
            for (int i = 0; i < size; i++) {
                gq0 gq0Var = (gq0) arrayListM741b.get(i);
                xg0 xg0Var = gq0Var.f2846a;
                List list = gq0Var.f2847b;
                if (!arrayList.contains(xg0Var)) {
                    arrayList.add(gq0Var.f2846a);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add((xg0) list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m741b() {
        boolean z = this.f953l;
        ArrayList arrayList = this.f942a;
        if (!z) {
            this.f953l = true;
            arrayList.clear();
            List listM3819f = this.f944c.m4041a().m3819f(this.f945d);
            int size = listM3819f.size();
            for (int i = 0; i < size; i++) {
                gq0 gq0VarMo640b = ((hq0) listM3819f.get(i)).mo640b(this.f945d, this.f946e, this.f947f, this.f950i);
                if (gq0VarMo640b != null) {
                    arrayList.add(gq0VarMo640b);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final pj0 m742c(Class cls) {
        pj0 pj0Var;
        Class cls2;
        Class cls3;
        Class cls4;
        pj0 pj0Var2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        h21 h21Var;
        Class cls5 = cls;
        p01 p01VarM4041a = this.f944c.m4041a();
        Class cls6 = this.f948g;
        Class cls7 = this.f952k;
        qj0 qj0Var = p01VarM4041a.f5957i;
        sq0 sq0Var = (sq0) qj0Var.f6511b.getAndSet(null);
        if (sq0Var == null) {
            sq0Var = new sq0();
        }
        sq0Var.f7189a = cls5;
        sq0Var.f7190b = cls6;
        sq0Var.f7191c = cls7;
        synchronized (qj0Var.f6510a) {
            pj0Var = (pj0) qj0Var.f6510a.get(sq0Var);
        }
        qj0Var.f6511b.set(sq0Var);
        p01VarM4041a.f5957i.getClass();
        if (qj0.f6509c.equals(pj0Var)) {
            return null;
        }
        if (pj0Var != null) {
            return pj0Var;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayListM1610M = p01VarM4041a.f5951c.m1610M(cls5, cls6);
        int size = arrayListM1610M.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            Class<?> cls8 = (Class) arrayListM1610M.get(i2);
            ArrayList arrayListM4956a = p01VarM4041a.f5954f.m4956a(cls8, cls7);
            int size2 = arrayListM4956a.size();
            int i4 = 0;
            while (i4 < size2) {
                int i5 = i4 + 1;
                Class cls9 = (Class) arrayListM4956a.get(i4);
                f50 f50Var = p01VarM4041a.f5951c;
                synchronized (f50Var) {
                    arrayList = new ArrayList();
                    ArrayList arrayList4 = (ArrayList) f50Var.f2313k;
                    int size3 = arrayList4.size();
                    arrayList2 = arrayListM4956a;
                    int i6 = 0;
                    while (i6 < size3) {
                        Object obj = arrayList4.get(i6);
                        int i7 = i6 + 1;
                        String str = (String) obj;
                        int i8 = size2;
                        List list = (List) ((HashMap) f50Var.f2314l).get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                z11 z11Var = (z11) it.next();
                                Iterator it2 = it;
                                if (z11Var.f9572a.isAssignableFrom(cls5) && cls8.isAssignableFrom(z11Var.f9573b)) {
                                    arrayList.add(z11Var.f9574c);
                                }
                                it = it2;
                            }
                        }
                        size2 = i8;
                        i6 = i7;
                    }
                    i = size2;
                }
                C0781uw c0781uw = p01VarM4041a.f5954f;
                synchronized (c0781uw) {
                    if (cls9.isAssignableFrom(cls8)) {
                        h21Var = nc1.f5377p;
                    } else {
                        ArrayList arrayList5 = c0781uw.f7915j;
                        int size4 = arrayList5.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size4) {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                            }
                            Object obj2 = arrayList5.get(i9);
                            i9++;
                            he1 he1Var = (he1) obj2;
                            ArrayList arrayList6 = arrayList5;
                            if (he1Var.f3188a.isAssignableFrom(cls8) && cls9.isAssignableFrom(he1Var.f3189b)) {
                                h21Var = he1Var.f3190c;
                                break;
                            }
                            cls5 = cls;
                            arrayList5 = arrayList6;
                        }
                    }
                }
                arrayList3.add(new C0183eq(cls5, cls8, cls9, arrayList, h21Var, p01VarM4041a.f5958j));
                cls5 = cls;
                i4 = i5;
                arrayListM4956a = arrayList2;
                size2 = i;
            }
            cls5 = cls;
            i2 = i3;
        }
        if (arrayList3.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            pj0Var2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            pj0Var2 = new pj0(cls2, cls3, cls4, arrayList3, p01VarM4041a.f5958j);
        }
        qj0 qj0Var2 = p01VarM4041a.f5957i;
        synchronized (qj0Var2.f6510a) {
            qj0Var2.f6510a.put(new sq0(cls2, cls3, cls4), pj0Var2 != null ? pj0Var2 : qj0.f6509c);
        }
        return pj0Var2;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0670rw m743d(Object obj) {
        InterfaceC0670rw interfaceC0670rw;
        C0781uw c0781uw = this.f944c.m4041a().f5950b;
        Class<?> cls = obj.getClass();
        synchronized (c0781uw) {
            ArrayList arrayList = c0781uw.f7915j;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    interfaceC0670rw = null;
                    break;
                }
                Object obj2 = arrayList.get(i);
                i++;
                C0744tw c0744tw = (C0744tw) obj2;
                if (c0744tw.f7618a.isAssignableFrom(cls)) {
                    interfaceC0670rw = c0744tw.f7619b;
                    break;
                }
            }
        }
        if (interfaceC0670rw != null) {
            return interfaceC0670rw;
        }
        throw new o01("Failed to find source encoder for data class: " + obj.getClass());
    }

    /* JADX INFO: renamed from: e */
    public final ie1 m744e(Class cls) {
        ie1 ie1Var = (ie1) this.f951j.get(cls);
        if (ie1Var == null) {
            for (Map.Entry entry : this.f951j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    ie1Var = (ie1) entry.getValue();
                    break;
                }
            }
        }
        if (ie1Var != null) {
            return ie1Var;
        }
        if (!this.f951j.isEmpty() || !this.f958q) {
            return mf1.f5040b;
        }
        C0042ay.m529f(cls, ". If you wish to ignore unknown resource types, use the optional transformation methods.", "Missing transformation for ");
        return null;
    }
}
