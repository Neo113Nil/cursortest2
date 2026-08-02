package E4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: l, reason: collision with root package name */
    public static final A f2088l;

    /* renamed from: m, reason: collision with root package name */
    public static final A f2089m;

    /* renamed from: a, reason: collision with root package name */
    public final List f2090a;

    /* renamed from: b, reason: collision with root package name */
    public List f2091b;

    /* renamed from: c, reason: collision with root package name */
    public I f2092c;

    /* renamed from: d, reason: collision with root package name */
    public I f2093d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2094e;

    /* renamed from: f, reason: collision with root package name */
    public final H4.m f2095f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2096g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2097h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2098i;
    public final C0170c j;

    /* renamed from: k, reason: collision with root package name */
    public final C0170c f2099k;

    static {
        H4.j jVar = H4.j.f3321b;
        f2088l = new A(1, jVar);
        f2089m = new A(2, jVar);
    }

    public C(H4.m mVar, String str, List list, List list2, long j, int i7, C0170c c0170c, C0170c c0170c2) {
        this.f2095f = mVar;
        this.f2096g = str;
        this.f2090a = list2;
        this.f2094e = list;
        this.f2097h = j;
        this.f2098i = i7;
        this.j = c0170c;
        this.f2099k = c0170c2;
    }

    public final B a() {
        return new B(d());
    }

    public final C b(AbstractC0178k abstractC0178k) {
        p3.f.O("No filter is allowed for document query", !e(), new Object[0]);
        ArrayList arrayList = new ArrayList(this.f2094e);
        arrayList.add(abstractC0178k);
        return new C(this.f2095f, this.f2096g, arrayList, this.f2090a, this.f2097h, this.f2098i, this.j, this.f2099k);
    }

    public final TreeSet c() {
        TreeSet treeSet = new TreeSet();
        Iterator it = this.f2094e.iterator();
        while (it.hasNext()) {
            for (C0177j c0177j : ((AbstractC0178k) it.next()).c()) {
                if (c0177j.f()) {
                    treeSet.add(c0177j.f2201c);
                }
            }
        }
        return treeSet;
    }

    public final synchronized List d() {
        int i7;
        try {
            if (this.f2091b == null) {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                for (A a2 : this.f2090a) {
                    arrayList.add(a2);
                    hashSet.add(a2.f2085b.c());
                }
                if (this.f2090a.size() > 0) {
                    List list = this.f2090a;
                    i7 = ((A) list.get(list.size() - 1)).f2084a;
                } else {
                    i7 = 1;
                }
                Iterator it = c().iterator();
                while (it.hasNext()) {
                    H4.j jVar = (H4.j) it.next();
                    if (!hashSet.contains(jVar.c()) && !jVar.equals(H4.j.f3321b)) {
                        arrayList.add(new A(i7, jVar));
                    }
                }
                if (!hashSet.contains(H4.j.f3321b.c())) {
                    arrayList.add(t.e.b(i7, 1) ? f2088l : f2089m);
                }
                this.f2091b = Collections.unmodifiableList(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2091b;
    }

    public final boolean e() {
        return H4.h.f(this.f2095f) && this.f2096g == null && this.f2094e.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        C c3 = (C) obj;
        if (this.f2098i != c3.f2098i) {
            return false;
        }
        return i().equals(c3.i());
    }

    public final C f(long j) {
        return new C(this.f2095f, this.f2096g, this.f2094e, this.f2090a, j, 1, this.j, this.f2099k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r3.m(r0) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0056, code lost:
    
        if (r3.f3312a.size() == (r0.f3312a.size() - 1)) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(H4.k kVar) {
        boolean equals;
        boolean z4;
        boolean z7;
        boolean z8;
        if (!kVar.d()) {
            return false;
        }
        H4.m mVar = kVar.f3323a.f3318a;
        H4.m mVar2 = this.f2095f;
        String str = this.f2096g;
        if (str != null) {
            if (mVar.f3312a.size() >= 2) {
                List list = mVar.f3312a;
                if (((String) list.get(list.size() - 2)).equals(str)) {
                }
            }
            equals = false;
        } else if (H4.h.f(mVar2)) {
            equals = mVar2.equals(mVar);
        } else {
            if (mVar2.m(mVar)) {
            }
            equals = false;
        }
        if (!equals) {
            return false;
        }
        Iterator it = d().iterator();
        while (true) {
            if (!it.hasNext()) {
                z4 = true;
                break;
            }
            A a2 = (A) it.next();
            if (!a2.f2085b.equals(H4.j.f3321b) && kVar.f3327e.f(a2.f2085b) == null) {
                z4 = false;
                break;
            }
        }
        if (!z4) {
            return false;
        }
        Iterator it2 = this.f2094e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z7 = true;
                break;
            }
            if (!((AbstractC0178k) it2.next()).d(kVar)) {
                z7 = false;
                break;
            }
        }
        if (!z7) {
            return false;
        }
        C0170c c0170c = this.j;
        if (c0170c != null) {
            int a4 = c0170c.a(d(), kVar);
            if (!c0170c.f2169a) {
                return !z8;
            }
            if (!z8) {
            }
        }
        C0170c c0170c2 = this.f2099k;
        if (c0170c2 != null) {
            int a7 = c0170c2.a(d(), kVar);
            z8 = !c0170c2.f2169a ? false : false;
            if (!z8) {
            }
        }
        z8 = true;
        if (!z8) {
        }
    }

    public final boolean h() {
        if (!this.f2094e.isEmpty() || this.f2097h != -1 || this.j != null || this.f2099k != null) {
            return false;
        }
        List list = this.f2090a;
        return list.isEmpty() || (list.size() == 1 && ((A) list.get(0)).f2085b.equals(H4.j.f3321b));
    }

    public final int hashCode() {
        return t.e.e(this.f2098i) + (i().hashCode() * 31);
    }

    public final synchronized I i() {
        try {
            if (this.f2092c == null) {
                this.f2092c = j(d());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2092c;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final synchronized I j(List list) {
        if (this.f2098i == 1) {
            return new I(this.f2095f, this.f2096g, this.f2094e, list, this.f2097h, this.j, this.f2099k);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A a2 = (A) it.next();
            int i7 = 2;
            if (a2.f2084a == 2) {
                i7 = 1;
            }
            arrayList.add(new A(i7, a2.f2085b));
        }
        C0170c c0170c = this.f2099k;
        C0170c c0170c2 = c0170c != null ? new C0170c(c0170c.f2170b, c0170c.f2169a) : null;
        C0170c c0170c3 = this.j;
        return new I(this.f2095f, this.f2096g, this.f2094e, arrayList, this.f2097h, c0170c2, c0170c3 != null ? new C0170c(c0170c3.f2170b, c0170c3.f2169a) : null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Query(target=");
        sb.append(i().toString());
        sb.append(";limitType=");
        int i7 = this.f2098i;
        if (i7 == 1) {
            str = "LIMIT_TO_FIRST";
        } else {
            if (i7 != 2) {
                throw null;
            }
            str = "LIMIT_TO_LAST";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public C(H4.m mVar, String str) {
        this(mVar, str, Collections.emptyList(), Collections.emptyList(), -1L, 1, null, null);
    }
}
