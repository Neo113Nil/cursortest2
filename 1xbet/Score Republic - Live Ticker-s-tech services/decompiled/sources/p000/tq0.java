package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class tq0 implements InterfaceC0551oo, InterfaceC0514no {

    /* JADX INFO: renamed from: j */
    public final ArrayList f7561j;

    /* JADX INFO: renamed from: k */
    public final kw0 f7562k;

    /* JADX INFO: renamed from: l */
    public int f7563l;

    /* JADX INFO: renamed from: m */
    public ex0 f7564m;

    /* JADX INFO: renamed from: n */
    public InterfaceC0514no f7565n;

    /* JADX INFO: renamed from: o */
    public List f7566o;

    /* JADX INFO: renamed from: p */
    public boolean f7567p;

    public tq0(ArrayList arrayList, kw0 kw0Var) {
        this.f7562k = kw0Var;
        if (arrayList.isEmpty()) {
            C0270h1.m2190f("Must not be empty.");
            throw null;
        }
        this.f7561j = arrayList;
        this.f7563l = 0;
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: a */
    public final Class mo1071a() {
        return ((InterfaceC0551oo) this.f7561j.get(0)).mo1071a();
    }

    /* JADX INFO: renamed from: b */
    public final void m4824b() {
        if (this.f7567p) {
            return;
        }
        if (this.f7563l < this.f7561j.size() - 1) {
            this.f7563l++;
            mo1073e(this.f7564m, this.f7565n);
        } else {
            o80.m3646g(this.f7566o);
            this.f7565n.mo82f(new t80("Fetch failed", new ArrayList(this.f7566o)));
        }
    }

    @Override // p000.InterfaceC0551oo
    public final void cancel() {
        this.f7567p = true;
        ArrayList arrayList = this.f7561j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((InterfaceC0551oo) obj).cancel();
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: d */
    public final void mo1072d() {
        List list = this.f7566o;
        if (list != null) {
            this.f7562k.mo1366a(list);
        }
        this.f7566o = null;
        ArrayList arrayList = this.f7561j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((InterfaceC0551oo) obj).mo1072d();
        }
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: e */
    public final void mo1073e(ex0 ex0Var, InterfaceC0514no interfaceC0514no) {
        this.f7564m = ex0Var;
        this.f7565n = interfaceC0514no;
        this.f7566o = (List) this.f7562k.mo1367b();
        ((InterfaceC0551oo) this.f7561j.get(this.f7563l)).mo1073e(ex0Var, this);
        if (this.f7567p) {
            cancel();
        }
    }

    @Override // p000.InterfaceC0514no
    /* JADX INFO: renamed from: f */
    public final void mo82f(Exception exc) {
        List list = this.f7566o;
        o80.m3647h(list, "Argument must not be null");
        list.add(exc);
        m4824b();
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: g */
    public final int mo1074g() {
        return ((InterfaceC0551oo) this.f7561j.get(0)).mo1074g();
    }

    @Override // p000.InterfaceC0514no
    /* JADX INFO: renamed from: h */
    public final void mo84h(Object obj) {
        if (obj != null) {
            this.f7565n.mo84h(obj);
        } else {
            m4824b();
        }
    }
}
