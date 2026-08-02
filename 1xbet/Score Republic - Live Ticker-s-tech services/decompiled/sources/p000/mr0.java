package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class mr0 {

    /* JADX INFO: renamed from: a */
    public final da1 f5136a = new da1(nr0.f5506j);

    /* JADX INFO: renamed from: b */
    public final da1 f5137b;

    /* JADX INFO: renamed from: c */
    public final e01 f5138c;

    /* JADX INFO: renamed from: d */
    public final C0756u7 f5139d;

    /* JADX INFO: renamed from: e */
    public final C0756u7 f5140e;

    /* JADX INFO: renamed from: f */
    public bu0 f5141f;

    /* JADX INFO: renamed from: g */
    public int f5142g;

    /* JADX INFO: renamed from: h */
    public lr0 f5143h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashSet f5144i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f5145j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashSet f5146k;

    /* JADX INFO: renamed from: l */
    public boolean f5147l;

    /* JADX INFO: renamed from: m */
    public boolean f5148m;

    /* JADX INFO: renamed from: n */
    public boolean f5149n;

    public mr0() {
        da1 da1Var = new da1(new kr0());
        this.f5137b = da1Var;
        this.f5138c = new e01(da1Var);
        this.f5139d = new C0756u7();
        this.f5140e = new C0756u7();
        this.f5144i = new LinkedHashSet();
        this.f5145j = new LinkedHashSet();
        this.f5146k = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: a */
    public final void m3426a(f71 f71Var, lr0 lr0Var, int i) {
        LinkedHashSet linkedHashSet;
        boolean z;
        f71Var.getClass();
        if (lr0Var.f4889a != null) {
            StringBuilder sb = new StringBuilder("Input '");
            sb.append(lr0Var);
            f71 f71Var2 = lr0Var.f4889a;
            sb.append("' is already added to dispatcher ");
            sb.append(f71Var2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i != 0) {
            linkedHashSet = i != 1 ? this.f5144i : this.f5145j;
        } else {
            linkedHashSet = this.f5146k;
        }
        linkedHashSet.add(lr0Var);
        lr0Var.f4889a = f71Var;
        ((kr0) this.f5138c.f1888j.m1142l0()).getClass();
        if (i != 0) {
            z = i != 1 ? this.f5149n : this.f5147l;
        } else {
            z = this.f5148m;
        }
        lr0Var.mo484b(z);
    }

    /* JADX INFO: renamed from: b */
    public final void m3427b() {
        boolean z;
        boolean z2;
        kr0 kr0Var;
        C0756u7 c0756u7 = this.f5139d;
        if (c0756u7 != null && c0756u7.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = c0756u7.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((bu0) it.next()).f988b) {
                z = true;
                break;
            }
        }
        C0756u7 c0756u8 = this.f5140e;
        if (c0756u8 != null && c0756u8.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it2 = c0756u8.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            } else if (((bu0) it2.next()).f988b) {
                z2 = true;
                break;
            }
        }
        boolean z3 = z || z2;
        boolean z4 = this.f5148m != z;
        boolean z5 = this.f5147l != z2;
        boolean z6 = this.f5149n != z3;
        LinkedHashSet linkedHashSet = this.f5146k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((lr0) it3.next()).mo484b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f5145j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((lr0) it4.next()).mo484b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f5144i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((lr0) it5.next()).mo484b(z3);
            }
        }
        this.f5148m = z;
        this.f5147l = z2;
        this.f5149n = z3;
        bu0 bu0VarM3428c = this.f5141f;
        if (bu0VarM3428c == null) {
            bu0VarM3428c = m3428c(0);
        }
        bu0 bu0VarM3428c2 = this.f5141f;
        if (bu0VarM3428c2 == null) {
            bu0VarM3428c2 = m3428c(0);
        }
        if (af0.m187a(bu0VarM3428c2, bu0VarM3428c)) {
            if (bu0VarM3428c2 == null) {
                kr0Var = new kr0();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = c0756u7.iterator();
                while (it6.hasNext()) {
                    ((bu0) it6.next()).getClass();
                }
                Iterator<E> it7 = c0756u8.iterator();
                while (it7.hasNext()) {
                    ((bu0) it7.next()).getClass();
                }
                cu0 cu0Var = bu0VarM3428c2.f987a;
                ki0 ki0Var = new ki0(10);
                AbstractC0693si.m4526s(ki0Var, arrayList);
                ki0Var.add(cu0Var);
                AbstractC0693si.m4526s(ki0Var, C0411kw.f4584j);
                ki0Var.m3040g();
                ki0Var.f4389l = true;
                if (ki0Var.f4388k <= 0) {
                    ki0Var = ki0.f4386m;
                }
                kr0Var = new kr0(arrayList.size(), ki0Var);
            }
            da1 da1Var = this.f5137b;
            if (af0.m187a((kr0) da1Var.m1142l0(), kr0Var)) {
                return;
            }
            da1Var.m1143m0(null, kr0Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((lr0) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((lr0) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((lr0) it10.next()).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final bu0 m3428c(int i) {
        Object next;
        Object next2;
        C0756u7 c0756u7 = this.f5140e;
        C0756u7 c0756u8 = this.f5139d;
        Object obj = null;
        if (i == -1) {
            Iterator it = c0756u8.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((bu0) next).f988b);
            bu0 bu0Var = (bu0) next;
            if (bu0Var != null) {
                return bu0Var;
            }
            for (Object obj2 : c0756u7) {
                if (((bu0) obj2).f988b) {
                    obj = obj2;
                    break;
                }
            }
            return (bu0) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it2 = c0756u8.iterator();
            while (it2.hasNext()) {
                ((bu0) it2.next()).getClass();
            }
            Iterator it3 = c0756u7.iterator();
            while (it3.hasNext()) {
                ((bu0) it3.next()).getClass();
            }
            return null;
        }
        Iterator it4 = c0756u8.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((bu0) next2).f988b);
        bu0 bu0Var2 = (bu0) next2;
        if (bu0Var2 != null) {
            return bu0Var2;
        }
        for (Object obj3 : c0756u7) {
            if (((bu0) obj3).f988b) {
                obj = obj3;
                break;
            }
        }
        return (bu0) obj;
    }
}
