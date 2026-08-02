package H3;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* loaded from: classes.dex */
public final class p extends AbstractMap implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    public static final l f2350s = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public final Comparator f2351k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2352l;

    /* renamed from: m, reason: collision with root package name */
    public o f2353m;

    /* renamed from: n, reason: collision with root package name */
    public int f2354n;

    /* renamed from: o, reason: collision with root package name */
    public int f2355o;

    /* renamed from: p, reason: collision with root package name */
    public final o f2356p;

    /* renamed from: q, reason: collision with root package name */
    public n f2357q;

    /* renamed from: r, reason: collision with root package name */
    public n f2358r;

    public p(boolean z3) {
        l lVar = f2350s;
        this.f2354n = 0;
        this.f2355o = 0;
        this.f2351k = lVar;
        this.f2352l = z3;
        this.f2356p = new o(z3);
    }

    public final o a(Object obj, boolean z3) {
        int i;
        o oVar;
        o oVar2 = this.f2353m;
        l lVar = f2350s;
        Comparator comparator = this.f2351k;
        if (oVar2 != null) {
            Comparable comparable = comparator == lVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = oVar2.f2346p;
                i = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i == 0) {
                    return oVar2;
                }
                o oVar3 = i < 0 ? oVar2.f2342l : oVar2.f2343m;
                if (oVar3 == null) {
                    break;
                }
                oVar2 = oVar3;
            }
        } else {
            i = 0;
        }
        o oVar4 = oVar2;
        if (!z3) {
            return null;
        }
        o oVar5 = this.f2356p;
        if (oVar4 != null) {
            oVar = new o(this.f2352l, oVar4, obj, oVar5, oVar5.f2345o);
            if (i < 0) {
                oVar4.f2342l = oVar;
            } else {
                oVar4.f2343m = oVar;
            }
            b(oVar4, true);
        } else {
            if (comparator == lVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            oVar = new o(this.f2352l, oVar4, obj, oVar5, oVar5.f2345o);
            this.f2353m = oVar;
        }
        this.f2354n++;
        this.f2355o++;
        return oVar;
    }

    public final void b(o oVar, boolean z3) {
        while (oVar != null) {
            o oVar2 = oVar.f2342l;
            o oVar3 = oVar.f2343m;
            int i = oVar2 != null ? oVar2.f2349s : 0;
            int i5 = oVar3 != null ? oVar3.f2349s : 0;
            int i6 = i - i5;
            if (i6 == -2) {
                o oVar4 = oVar3.f2342l;
                o oVar5 = oVar3.f2343m;
                int i7 = (oVar4 != null ? oVar4.f2349s : 0) - (oVar5 != null ? oVar5.f2349s : 0);
                if (i7 == -1 || (i7 == 0 && !z3)) {
                    e(oVar);
                } else {
                    f(oVar3);
                    e(oVar);
                }
                if (z3) {
                    return;
                }
            } else if (i6 == 2) {
                o oVar6 = oVar2.f2342l;
                o oVar7 = oVar2.f2343m;
                int i8 = (oVar6 != null ? oVar6.f2349s : 0) - (oVar7 != null ? oVar7.f2349s : 0);
                if (i8 == 1 || (i8 == 0 && !z3)) {
                    f(oVar);
                } else {
                    e(oVar2);
                    f(oVar);
                }
                if (z3) {
                    return;
                }
            } else if (i6 == 0) {
                oVar.f2349s = i + 1;
                if (z3) {
                    return;
                }
            } else {
                oVar.f2349s = Math.max(i, i5) + 1;
                if (!z3) {
                    return;
                }
            }
            oVar = oVar.f2341k;
        }
    }

    public final void c(o oVar, boolean z3) {
        o oVar2;
        o oVar3;
        int i;
        if (z3) {
            o oVar4 = oVar.f2345o;
            oVar4.f2344n = oVar.f2344n;
            oVar.f2344n.f2345o = oVar4;
        }
        o oVar5 = oVar.f2342l;
        o oVar6 = oVar.f2343m;
        o oVar7 = oVar.f2341k;
        int i5 = 0;
        if (oVar5 == null || oVar6 == null) {
            if (oVar5 != null) {
                d(oVar, oVar5);
                oVar.f2342l = null;
            } else if (oVar6 != null) {
                d(oVar, oVar6);
                oVar.f2343m = null;
            } else {
                d(oVar, null);
            }
            b(oVar7, false);
            this.f2354n--;
            this.f2355o++;
            return;
        }
        if (oVar5.f2349s > oVar6.f2349s) {
            o oVar8 = oVar5.f2343m;
            while (true) {
                o oVar9 = oVar8;
                oVar3 = oVar5;
                oVar5 = oVar9;
                if (oVar5 == null) {
                    break;
                } else {
                    oVar8 = oVar5.f2343m;
                }
            }
        } else {
            o oVar10 = oVar6.f2342l;
            while (true) {
                oVar2 = oVar6;
                oVar6 = oVar10;
                if (oVar6 == null) {
                    break;
                } else {
                    oVar10 = oVar6.f2342l;
                }
            }
            oVar3 = oVar2;
        }
        c(oVar3, false);
        o oVar11 = oVar.f2342l;
        if (oVar11 != null) {
            i = oVar11.f2349s;
            oVar3.f2342l = oVar11;
            oVar11.f2341k = oVar3;
            oVar.f2342l = null;
        } else {
            i = 0;
        }
        o oVar12 = oVar.f2343m;
        if (oVar12 != null) {
            i5 = oVar12.f2349s;
            oVar3.f2343m = oVar12;
            oVar12.f2341k = oVar3;
            oVar.f2343m = null;
        }
        oVar3.f2349s = Math.max(i, i5) + 1;
        d(oVar, oVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f2353m = null;
        this.f2354n = 0;
        this.f2355o++;
        o oVar = this.f2356p;
        oVar.f2345o = oVar;
        oVar.f2344n = oVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        o oVar = null;
        if (obj != null) {
            try {
                oVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return oVar != null;
    }

    public final void d(o oVar, o oVar2) {
        o oVar3 = oVar.f2341k;
        oVar.f2341k = null;
        if (oVar2 != null) {
            oVar2.f2341k = oVar3;
        }
        if (oVar3 == null) {
            this.f2353m = oVar2;
        } else if (oVar3.f2342l == oVar) {
            oVar3.f2342l = oVar2;
        } else {
            oVar3.f2343m = oVar2;
        }
    }

    public final void e(o oVar) {
        o oVar2 = oVar.f2342l;
        o oVar3 = oVar.f2343m;
        o oVar4 = oVar3.f2342l;
        o oVar5 = oVar3.f2343m;
        oVar.f2343m = oVar4;
        if (oVar4 != null) {
            oVar4.f2341k = oVar;
        }
        d(oVar, oVar3);
        oVar3.f2342l = oVar;
        oVar.f2341k = oVar3;
        int max = Math.max(oVar2 != null ? oVar2.f2349s : 0, oVar4 != null ? oVar4.f2349s : 0) + 1;
        oVar.f2349s = max;
        oVar3.f2349s = Math.max(max, oVar5 != null ? oVar5.f2349s : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        n nVar = this.f2357q;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(0, this);
        this.f2357q = nVar2;
        return nVar2;
    }

    public final void f(o oVar) {
        o oVar2 = oVar.f2342l;
        o oVar3 = oVar.f2343m;
        o oVar4 = oVar2.f2342l;
        o oVar5 = oVar2.f2343m;
        oVar.f2342l = oVar5;
        if (oVar5 != null) {
            oVar5.f2341k = oVar;
        }
        d(oVar, oVar2);
        oVar2.f2343m = oVar;
        oVar.f2341k = oVar2;
        int max = Math.max(oVar3 != null ? oVar3.f2349s : 0, oVar5 != null ? oVar5.f2349s : 0) + 1;
        oVar.f2349s = max;
        oVar2.f2349s = Math.max(max, oVar4 != null ? oVar4.f2349s : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        o oVar;
        if (obj != null) {
            try {
                oVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (oVar == null) {
                return oVar.f2348r;
            }
            return null;
        }
        oVar = null;
        if (oVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        n nVar = this.f2358r;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(1, this);
        this.f2358r = nVar2;
        return nVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f2352l) {
            throw new NullPointerException("value == null");
        }
        o a5 = a(obj, true);
        Object obj3 = a5.f2348r;
        a5.f2348r = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        o oVar;
        if (obj != null) {
            try {
                oVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (oVar != null) {
                c(oVar, true);
            }
            if (oVar == null) {
                return oVar.f2348r;
            }
            return null;
        }
        oVar = null;
        if (oVar != null) {
        }
        if (oVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2354n;
    }
}
