package n4;

import i4.C1267d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import k4.C1349k;

/* renamed from: n4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1473g implements Iterable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final C1473g f15415d = new C1473g("");

    /* renamed from: a, reason: collision with root package name */
    public final v4.c[] f15416a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15417b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15418c;

    public C1473g(v4.c... cVarArr) {
        this.f15416a = (v4.c[]) Arrays.copyOf(cVarArr, cVarArr.length);
        this.f15417b = 0;
        this.f15418c = cVarArr.length;
        for (v4.c cVar : cVarArr) {
            q4.k.b("Can't construct a path with a null value!", cVar != null);
        }
    }

    public static C1473g D(C1473g c1473g, C1473g c1473g2) {
        v4.c B7 = c1473g.B();
        v4.c B8 = c1473g2.B();
        if (B7 == null) {
            return c1473g2;
        }
        if (B7.equals(B8)) {
            return D(c1473g.E(), c1473g2.E());
        }
        throw new C1267d("INTERNAL ERROR: " + c1473g2 + " is not contained in " + c1473g);
    }

    public final v4.c A() {
        if (isEmpty()) {
            return null;
        }
        return this.f15416a[this.f15418c - 1];
    }

    public final v4.c B() {
        if (isEmpty()) {
            return null;
        }
        return this.f15416a[this.f15417b];
    }

    public final C1473g C() {
        if (isEmpty()) {
            return null;
        }
        return new C1473g(this.f15416a, this.f15417b, this.f15418c - 1);
    }

    public final C1473g E() {
        boolean isEmpty = isEmpty();
        int i7 = this.f15417b;
        if (!isEmpty) {
            i7++;
        }
        return new C1473g(this.f15416a, i7, this.f15418c);
    }

    public final String F() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        int i7 = this.f15417b;
        for (int i8 = i7; i8 < this.f15418c; i8++) {
            if (i8 > i7) {
                sb.append("/");
            }
            sb.append(this.f15416a[i8].f17173a);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1473g)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C1473g c1473g = (C1473g) obj;
        if (size() != c1473g.size()) {
            return false;
        }
        int i7 = this.f15417b;
        for (int i8 = c1473g.f15417b; i7 < this.f15418c && i8 < c1473g.f15418c; i8++) {
            if (!this.f15416a[i7].equals(c1473g.f15416a[i8])) {
                return false;
            }
            i7++;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = 0;
        for (int i8 = this.f15417b; i8 < this.f15418c; i8++) {
            i7 = (i7 * 37) + this.f15416a[i8].f17173a.hashCode();
        }
        return i7;
    }

    public final boolean isEmpty() {
        return this.f15417b >= this.f15418c;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1349k(this);
    }

    public final ArrayList l() {
        ArrayList arrayList = new ArrayList(size());
        C1349k c1349k = new C1349k(this);
        while (c1349k.hasNext()) {
            arrayList.add(((v4.c) c1349k.next()).f17173a);
        }
        return arrayList;
    }

    public final C1473g m(C1473g c1473g) {
        int size = c1473g.size() + size();
        v4.c[] cVarArr = new v4.c[size];
        System.arraycopy(this.f15416a, this.f15417b, cVarArr, 0, size());
        System.arraycopy(c1473g.f15416a, c1473g.f15417b, cVarArr, size(), c1473g.size());
        return new C1473g(cVarArr, 0, size);
    }

    public final int size() {
        return this.f15418c - this.f15417b;
    }

    public final C1473g t(v4.c cVar) {
        int size = size();
        int i7 = size + 1;
        v4.c[] cVarArr = new v4.c[i7];
        System.arraycopy(this.f15416a, this.f15417b, cVarArr, 0, size);
        cVarArr[size] = cVar;
        return new C1473g(cVarArr, 0, i7);
    }

    public final String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i7 = this.f15417b; i7 < this.f15418c; i7++) {
            sb.append("/");
            sb.append(this.f15416a[i7].f17173a);
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1473g c1473g) {
        int i7;
        int i8;
        int i9 = c1473g.f15417b;
        int i10 = this.f15417b;
        while (true) {
            i7 = c1473g.f15418c;
            i8 = this.f15418c;
            if (i10 >= i8 || i9 >= i7) {
                break;
            }
            int compareTo = this.f15416a[i10].compareTo(c1473g.f15416a[i9]);
            if (compareTo != 0) {
                return compareTo;
            }
            i10++;
            i9++;
        }
        if (i10 == i8 && i9 == i7) {
            return 0;
        }
        return i10 == i8 ? -1 : 1;
    }

    public final boolean z(C1473g c1473g) {
        if (size() > c1473g.size()) {
            return false;
        }
        int i7 = this.f15417b;
        int i8 = c1473g.f15417b;
        while (i7 < this.f15418c) {
            if (!this.f15416a[i7].equals(c1473g.f15416a[i8])) {
                return false;
            }
            i7++;
            i8++;
        }
        return true;
    }

    public C1473g(ArrayList arrayList) {
        this.f15416a = new v4.c[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            this.f15416a[i7] = v4.c.b((String) it.next());
            i7++;
        }
        this.f15417b = 0;
        this.f15418c = arrayList.size();
    }

    public C1473g(String str) {
        String[] split = str.split("/", -1);
        int i7 = 0;
        for (String str2 : split) {
            if (str2.length() > 0) {
                i7++;
            }
        }
        this.f15416a = new v4.c[i7];
        int i8 = 0;
        for (String str3 : split) {
            if (str3.length() > 0) {
                this.f15416a[i8] = v4.c.b(str3);
                i8++;
            }
        }
        this.f15417b = 0;
        this.f15418c = this.f15416a.length;
    }

    public C1473g(v4.c[] cVarArr, int i7, int i8) {
        this.f15416a = cVarArr;
        this.f15417b = i7;
        this.f15418c = i8;
    }
}
