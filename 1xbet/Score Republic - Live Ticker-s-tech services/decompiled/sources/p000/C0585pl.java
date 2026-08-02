package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: pl */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0585pl {

    /* JADX INFO: renamed from: b */
    public int f6193b;

    /* JADX INFO: renamed from: c */
    public boolean f6194c;

    /* JADX INFO: renamed from: d */
    public final C0143dm f6195d;

    /* JADX INFO: renamed from: e */
    public final int f6196e;

    /* JADX INFO: renamed from: f */
    public C0585pl f6197f;

    /* JADX INFO: renamed from: i */
    public a91 f6200i;

    /* JADX INFO: renamed from: a */
    public HashSet f6192a = null;

    /* JADX INFO: renamed from: g */
    public int f6198g = 0;

    /* JADX INFO: renamed from: h */
    public int f6199h = Integer.MIN_VALUE;

    public C0585pl(C0143dm c0143dm, int i) {
        this.f6195d = c0143dm;
        this.f6196e = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m3954a(C0585pl c0585pl, int i, int i2) {
        if (c0585pl == null) {
            m3960g();
            return;
        }
        this.f6197f = c0585pl;
        if (c0585pl.f6192a == null) {
            c0585pl.f6192a = new HashSet();
        }
        HashSet hashSet = this.f6197f.f6192a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f6198g = i;
        this.f6199h = i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m3955b(int i, aj1 aj1Var, ArrayList arrayList) {
        HashSet hashSet = this.f6192a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                p80.m3868m(((C0585pl) it.next()).f6195d, i, arrayList, aj1Var);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m3956c() {
        if (this.f6194c) {
            return this.f6193b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m3957d() {
        C0585pl c0585pl;
        if (this.f6195d.f1718f0 == 8) {
            return 0;
        }
        int i = this.f6199h;
        return (i == Integer.MIN_VALUE || (c0585pl = this.f6197f) == null || c0585pl.f6195d.f1718f0 != 8) ? this.f6198g : i;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3958e() {
        C0585pl c0585pl;
        HashSet<C0585pl> hashSet = this.f6192a;
        if (hashSet == null) {
            return false;
        }
        for (C0585pl c0585pl2 : hashSet) {
            C0143dm c0143dm = c0585pl2.f6195d;
            int i = c0585pl2.f6196e;
            switch (AbstractC0024an.m292o(i)) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    c0585pl = null;
                    break;
                case 1:
                    c0585pl = c0143dm.f1690J;
                    break;
                case 2:
                    c0585pl = c0143dm.f1691K;
                    break;
                case 3:
                    c0585pl = c0143dm.f1688H;
                    break;
                case 4:
                    c0585pl = c0143dm.f1689I;
                    break;
                default:
                    throw new AssertionError(AbstractC0024an.m291n(i));
            }
            if (c0585pl.m3959f()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3959f() {
        return this.f6197f != null;
    }

    /* JADX INFO: renamed from: g */
    public final void m3960g() {
        HashSet hashSet;
        C0585pl c0585pl = this.f6197f;
        if (c0585pl != null && (hashSet = c0585pl.f6192a) != null) {
            hashSet.remove(this);
            if (this.f6197f.f6192a.size() == 0) {
                this.f6197f.f6192a = null;
            }
        }
        this.f6192a = null;
        this.f6197f = null;
        this.f6198g = 0;
        this.f6199h = Integer.MIN_VALUE;
        this.f6194c = false;
        this.f6193b = 0;
    }

    /* JADX INFO: renamed from: h */
    public final void m3961h() {
        a91 a91Var = this.f6200i;
        if (a91Var == null) {
            this.f6200i = new a91(1);
        } else {
            a91Var.m145c();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3962i(int i) {
        this.f6193b = i;
        this.f6194c = true;
    }

    public final String toString() {
        return this.f6195d.f1720g0 + ":" + AbstractC0024an.m291n(this.f6196e);
    }
}
