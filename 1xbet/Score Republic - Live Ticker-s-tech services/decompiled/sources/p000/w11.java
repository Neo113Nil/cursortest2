package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class w11 implements InterfaceC0625qo, InterfaceC0514no {

    /* JADX INFO: renamed from: j */
    public final RunnableC0146dq f8337j;

    /* JADX INFO: renamed from: k */
    public final C0071bq f8338k;

    /* JADX INFO: renamed from: l */
    public int f8339l;

    /* JADX INFO: renamed from: m */
    public int f8340m = -1;

    /* JADX INFO: renamed from: n */
    public xg0 f8341n;

    /* JADX INFO: renamed from: o */
    public List f8342o;

    /* JADX INFO: renamed from: p */
    public int f8343p;

    /* JADX INFO: renamed from: q */
    public volatile gq0 f8344q;

    /* JADX INFO: renamed from: r */
    public File f8345r;

    /* JADX INFO: renamed from: s */
    public x11 f8346s;

    public w11(C0071bq c0071bq, RunnableC0146dq runnableC0146dq) {
        this.f8338k = c0071bq;
        this.f8337j = runnableC0146dq;
    }

    @Override // p000.InterfaceC0625qo
    /* JADX INFO: renamed from: b */
    public final boolean mo903b() {
        List list;
        boolean z;
        List list2;
        boolean z2;
        ArrayList arrayListM1667m;
        ArrayList arrayListM740a = this.f8338k.m740a();
        if (arrayListM740a.isEmpty()) {
            return false;
        }
        C0071bq c0071bq = this.f8338k;
        p01 p01VarM4041a = c0071bq.f944c.m4041a();
        Class<?> cls = c0071bq.f945d.getClass();
        Class cls2 = c0071bq.f948g;
        Class cls3 = c0071bq.f952k;
        f50 f50Var = p01VarM4041a.f5956h;
        sq0 sq0Var = (sq0) ((AtomicReference) f50Var.f2313k).getAndSet(null);
        if (sq0Var == null) {
            sq0Var = new sq0(cls, cls2, cls3);
        } else {
            sq0Var.f7189a = cls;
            sq0Var.f7190b = cls2;
            sq0Var.f7191c = cls3;
        }
        synchronized (((C0089c8) f50Var.f2314l)) {
            list = (List) ((C0089c8) f50Var.f2314l).get(sq0Var);
        }
        ((AtomicReference) f50Var.f2313k).set(sq0Var);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            f50 f50Var2 = p01VarM4041a.f5949a;
            synchronized (f50Var2) {
                arrayListM1667m = ((f71) f50Var2.f2313k).m1667m(cls);
            }
            int size = arrayListM1667m.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListM1667m.get(i);
                i++;
                ArrayList arrayListM1610M = p01VarM4041a.f5951c.m1610M((Class) obj, cls2);
                int size2 = arrayListM1610M.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayListM1610M.get(i2);
                    i2++;
                    Class cls4 = (Class) obj2;
                    if (!p01VarM4041a.f5954f.m4956a(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            z = false;
            f50 f50Var3 = p01VarM4041a.f5956h;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((C0089c8) f50Var3.f2314l)) {
                ((C0089c8) f50Var3.f2314l).put(new sq0(cls, cls2, cls3), listUnmodifiableList);
            }
            list2 = arrayList;
        } else {
            z = false;
            list2 = list;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.f8338k.f952k)) {
                return z;
            }
            StringBuilder sb = new StringBuilder("Failed to find any load path from ");
            sb.append(this.f8338k.f945d.getClass());
            Class cls5 = this.f8338k.f952k;
            sb.append(" to ");
            sb.append(cls5);
            throw new IllegalStateException(sb.toString());
        }
        while (true) {
            List list3 = this.f8342o;
            if (list3 != null && this.f8343p < list3.size()) {
                this.f8344q = null;
                boolean z3 = z;
                while (!z3 && this.f8343p < this.f8342o.size()) {
                    List list4 = this.f8342o;
                    int i3 = this.f8343p;
                    this.f8343p = i3 + 1;
                    hq0 hq0Var = (hq0) list4.get(i3);
                    File file = this.f8345r;
                    C0071bq c0071bq2 = this.f8338k;
                    this.f8344q = hq0Var.mo640b(file, c0071bq2.f946e, c0071bq2.f947f, c0071bq2.f950i);
                    if (this.f8344q != null && this.f8338k.m742c(this.f8344q.f2848c.mo1071a()) != null) {
                        this.f8344q.f2848c.mo1073e(this.f8338k.f956o, this);
                        z3 = true;
                    }
                }
                return z3;
            }
            int i4 = this.f8340m + 1;
            this.f8340m = i4;
            if (i4 >= list2.size()) {
                int i5 = this.f8339l + 1;
                this.f8339l = i5;
                if (i5 >= arrayListM740a.size()) {
                    return z;
                }
                this.f8340m = z ? 1 : 0;
            }
            xg0 xg0Var = (xg0) arrayListM740a.get(this.f8339l);
            Class cls6 = (Class) list2.get(this.f8340m);
            ie1 ie1VarM744e = this.f8338k.m744e(cls6);
            C0071bq c0071bq3 = this.f8338k;
            this.f8346s = new x11(c0071bq3.f944c.f6405a, xg0Var, c0071bq3.f955n, c0071bq3.f946e, c0071bq3.f947f, ie1VarM744e, cls6, c0071bq3.f950i);
            File fileMo2338f = c0071bq3.f949h.m3879a().mo2338f(this.f8346s);
            this.f8345r = fileMo2338f;
            if (fileMo2338f != null) {
                this.f8341n = xg0Var;
                this.f8342o = this.f8338k.f944c.m4041a().m3819f(fileMo2338f);
                z2 = false;
                this.f8343p = 0;
            } else {
                z2 = false;
            }
            z = z2;
        }
    }

    @Override // p000.InterfaceC0625qo
    public final void cancel() {
        gq0 gq0Var = this.f8344q;
        if (gq0Var != null) {
            gq0Var.f2848c.cancel();
        }
    }

    @Override // p000.InterfaceC0514no
    /* JADX INFO: renamed from: f */
    public final void mo82f(Exception exc) {
        this.f8337j.mo902a(this.f8346s, exc, this.f8344q.f2848c, 4);
    }

    @Override // p000.InterfaceC0514no
    /* JADX INFO: renamed from: h */
    public final void mo84h(Object obj) {
        this.f8337j.mo904c(this.f8341n, obj, this.f8344q.f2848c, 4, this.f8346s);
    }
}
