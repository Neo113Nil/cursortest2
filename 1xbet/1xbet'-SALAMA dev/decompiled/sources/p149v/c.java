package p149v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p031e1.k;
import p136t.e;
import p136t.f;
import p154w.g;
import p154w.m;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f16912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f16914f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f16917i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f16909a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16915g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16916h = Integer.MIN_VALUE;

    public c(e eVar, int i7) {
        this.f16912d = eVar;
        this.f16913e = i7;
    }

    public final void a(c cVar, int i7) {
        b(cVar, i7, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i7, int i8, boolean z4) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z4 && !i(cVar)) {
            return false;
        }
        this.f16914f = cVar;
        if (cVar.f16909a == null) {
            cVar.f16909a = new HashSet();
        }
        HashSet hashSet = this.f16914f.f16909a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f16915g = i7;
        this.f16916h = i8;
        return true;
    }

    public final void c(int i7, ArrayList arrayList, m mVar) {
        HashSet hashSet = this.f16909a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                g.b(((c) it.next()).f16912d, i7, arrayList, mVar);
            }
        }
    }

    public final int d() {
        if (this.f16911c) {
            return this.f16910b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f16912d.f16965i0 == 8) {
            return 0;
        }
        int i7 = this.f16916h;
        return (i7 == Integer.MIN_VALUE || (cVar = this.f16914f) == null || cVar.f16912d.f16965i0 != 8) ? this.f16915g : i7;
    }

    public final c f() {
        int i7 = this.f16913e;
        int iE = e.e(i7);
        e eVar = this.f16912d;
        switch (iE) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return eVar.f16934L;
            case 2:
                return eVar.f16935M;
            case 3:
                return eVar.f16932J;
            case 4:
                return eVar.f16933K;
            default:
                throw new AssertionError(k.q(i7));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f16909a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f16914f != null;
    }

    public final boolean i(c cVar) {
        if (cVar == null) {
            return false;
        }
        int i7 = this.f16913e;
        e eVar = cVar.f16912d;
        int i8 = cVar.f16913e;
        if (i8 == i7) {
            return i7 != 6 || (eVar.f16927E && this.f16912d.f16927E);
        }
        switch (e.e(i7)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z4 = i8 == 2 || i8 == 4;
                if (eVar instanceof i) {
                    return z4 || i8 == 8;
                }
                return z4;
            case 2:
            case 4:
                boolean z7 = i8 == 3 || i8 == 5;
                if (eVar instanceof i) {
                    return z7 || i8 == 9;
                }
                return z7;
            case 5:
                return (i8 == 2 || i8 == 4) ? false : true;
            case 6:
                return (i8 == 6 || i8 == 8 || i8 == 9) ? false : true;
            default:
                throw new AssertionError(k.q(i7));
        }
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f16914f;
        if (cVar != null && (hashSet = cVar.f16909a) != null) {
            hashSet.remove(this);
            if (this.f16914f.f16909a.size() == 0) {
                this.f16914f.f16909a = null;
            }
        }
        this.f16909a = null;
        this.f16914f = null;
        this.f16915g = 0;
        this.f16916h = Integer.MIN_VALUE;
        this.f16911c = false;
        this.f16910b = 0;
    }

    public final void k() {
        f fVar = this.f16917i;
        if (fVar == null) {
            this.f16917i = new f(1);
        } else {
            fVar.c();
        }
    }

    public final void l(int i7) {
        this.f16910b = i7;
        this.f16911c = true;
    }

    public final String toString() {
        return this.f16912d.f16968k0 + ":" + k.q(this.f16913e);
    }
}
