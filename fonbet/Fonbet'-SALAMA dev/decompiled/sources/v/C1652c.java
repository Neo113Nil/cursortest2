package v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1652c {

    /* renamed from: b, reason: collision with root package name */
    public int f16904b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16905c;

    /* renamed from: d, reason: collision with root package name */
    public final C1654e f16906d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16907e;

    /* renamed from: f, reason: collision with root package name */
    public C1652c f16908f;

    /* renamed from: i, reason: collision with root package name */
    public t.f f16911i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f16903a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f16909g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f16910h = Integer.MIN_VALUE;

    public C1652c(C1654e c1654e, int i7) {
        this.f16906d = c1654e;
        this.f16907e = i7;
    }

    public final void a(C1652c c1652c, int i7) {
        b(c1652c, i7, Integer.MIN_VALUE, false);
    }

    public final boolean b(C1652c c1652c, int i7, int i8, boolean z4) {
        if (c1652c == null) {
            j();
            return true;
        }
        if (!z4 && !i(c1652c)) {
            return false;
        }
        this.f16908f = c1652c;
        if (c1652c.f16903a == null) {
            c1652c.f16903a = new HashSet();
        }
        HashSet hashSet = this.f16908f.f16903a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f16909g = i7;
        this.f16910h = i8;
        return true;
    }

    public final void c(int i7, ArrayList arrayList, w.m mVar) {
        HashSet hashSet = this.f16903a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                w.g.b(((C1652c) it.next()).f16906d, i7, arrayList, mVar);
            }
        }
    }

    public final int d() {
        if (this.f16905c) {
            return this.f16904b;
        }
        return 0;
    }

    public final int e() {
        C1652c c1652c;
        if (this.f16906d.f16959i0 == 8) {
            return 0;
        }
        int i7 = this.f16910h;
        return (i7 == Integer.MIN_VALUE || (c1652c = this.f16908f) == null || c1652c.f16906d.f16959i0 != 8) ? this.f16909g : i7;
    }

    public final C1652c f() {
        int i7 = this.f16907e;
        int e7 = t.e.e(i7);
        C1654e c1654e = this.f16906d;
        switch (e7) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c1654e.f16928L;
            case 2:
                return c1654e.f16929M;
            case 3:
                return c1654e.f16926J;
            case 4:
                return c1654e.f16927K;
            default:
                throw new AssertionError(e1.k.q(i7));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f16903a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C1652c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f16908f != null;
    }

    public final boolean i(C1652c c1652c) {
        if (c1652c == null) {
            return false;
        }
        int i7 = this.f16907e;
        C1654e c1654e = c1652c.f16906d;
        int i8 = c1652c.f16907e;
        if (i8 == i7) {
            return i7 != 6 || (c1654e.f16921E && this.f16906d.f16921E);
        }
        switch (t.e.e(i7)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z4 = i8 == 2 || i8 == 4;
                if (c1654e instanceof C1658i) {
                    return z4 || i8 == 8;
                }
                return z4;
            case 2:
            case 4:
                boolean z7 = i8 == 3 || i8 == 5;
                if (c1654e instanceof C1658i) {
                    return z7 || i8 == 9;
                }
                return z7;
            case 5:
                return (i8 == 2 || i8 == 4) ? false : true;
            case 6:
                return (i8 == 6 || i8 == 8 || i8 == 9) ? false : true;
            default:
                throw new AssertionError(e1.k.q(i7));
        }
    }

    public final void j() {
        HashSet hashSet;
        C1652c c1652c = this.f16908f;
        if (c1652c != null && (hashSet = c1652c.f16903a) != null) {
            hashSet.remove(this);
            if (this.f16908f.f16903a.size() == 0) {
                this.f16908f.f16903a = null;
            }
        }
        this.f16903a = null;
        this.f16908f = null;
        this.f16909g = 0;
        this.f16910h = Integer.MIN_VALUE;
        this.f16905c = false;
        this.f16904b = 0;
    }

    public final void k() {
        t.f fVar = this.f16911i;
        if (fVar == null) {
            this.f16911i = new t.f(1);
        } else {
            fVar.c();
        }
    }

    public final void l(int i7) {
        this.f16904b = i7;
        this.f16905c = true;
    }

    public final String toString() {
        return this.f16906d.f16962k0 + ":" + e1.k.q(this.f16907e);
    }
}
