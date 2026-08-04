package p098n4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p063i4.d;
import p120q4.k;
import v4.c;

/* JADX INFO: renamed from: n4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0934g implements Iterable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0934g f15421d = new C0934g("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f15422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15424c;

    public C0934g(c... cVarArr) {
        this.f15422a = (c[]) Arrays.copyOf(cVarArr, cVarArr.length);
        this.f15423b = 0;
        this.f15424c = cVarArr.length;
        for (c cVar : cVarArr) {
            k.b("Can't construct a path with a null value!", cVar != null);
        }
    }

    public static C0934g D(C0934g c0934g, C0934g c0934g2) {
        c cVarB = c0934g.B();
        c cVarB2 = c0934g2.B();
        if (cVarB == null) {
            return c0934g2;
        }
        if (cVarB.equals(cVarB2)) {
            return D(c0934g.E(), c0934g2.E());
        }
        throw new d("INTERNAL ERROR: " + c0934g2 + " is not contained in " + c0934g);
    }

    public final c A() {
        if (isEmpty()) {
            return null;
        }
        return this.f15422a[this.f15424c - 1];
    }

    public final c B() {
        if (isEmpty()) {
            return null;
        }
        return this.f15422a[this.f15423b];
    }

    public final C0934g C() {
        if (isEmpty()) {
            return null;
        }
        return new C0934g(this.f15422a, this.f15423b, this.f15424c - 1);
    }

    public final C0934g E() {
        boolean zIsEmpty = isEmpty();
        int i7 = this.f15423b;
        if (!zIsEmpty) {
            i7++;
        }
        return new C0934g(this.f15422a, i7, this.f15424c);
    }

    public final String F() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        int i7 = this.f15423b;
        for (int i8 = i7; i8 < this.f15424c; i8++) {
            if (i8 > i7) {
                sb.append("/");
            }
            sb.append(this.f15422a[i8].f17179a);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0934g)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0934g c0934g = (C0934g) obj;
        if (size() != c0934g.size()) {
            return false;
        }
        int i7 = this.f15423b;
        for (int i8 = c0934g.f15423b; i7 < this.f15424c && i8 < c0934g.f15424c; i8++) {
            if (!this.f15422a[i7].equals(c0934g.f15422a[i8])) {
                return false;
            }
            i7++;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (int i7 = this.f15423b; i7 < this.f15424c; i7++) {
            iHashCode = (iHashCode * 37) + this.f15422a[i7].f17179a.hashCode();
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f15423b >= this.f15424c;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p075k4.k(this);
    }

    public final ArrayList l() {
        ArrayList arrayList = new ArrayList(size());
        p075k4.k kVar = new p075k4.k(this);
        while (kVar.hasNext()) {
            arrayList.add(((c) kVar.next()).f17179a);
        }
        return arrayList;
    }

    public final C0934g m(C0934g c0934g) {
        int size = c0934g.size() + size();
        c[] cVarArr = new c[size];
        System.arraycopy(this.f15422a, this.f15423b, cVarArr, 0, size());
        System.arraycopy(c0934g.f15422a, c0934g.f15423b, cVarArr, size(), c0934g.size());
        return new C0934g(cVarArr, 0, size);
    }

    public final int size() {
        return this.f15424c - this.f15423b;
    }

    public final C0934g t(c cVar) {
        int size = size();
        int i7 = size + 1;
        c[] cVarArr = new c[i7];
        System.arraycopy(this.f15422a, this.f15423b, cVarArr, 0, size);
        cVarArr[size] = cVar;
        return new C0934g(cVarArr, 0, i7);
    }

    public final String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i7 = this.f15423b; i7 < this.f15424c; i7++) {
            sb.append("/");
            sb.append(this.f15422a[i7].f17179a);
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0934g c0934g) {
        int i7;
        int i8;
        int i9 = c0934g.f15423b;
        int i10 = this.f15423b;
        while (true) {
            i7 = c0934g.f15424c;
            i8 = this.f15424c;
            if (i10 >= i8 || i9 >= i7) {
                break;
            }
            int iCompareTo = this.f15422a[i10].compareTo(c0934g.f15422a[i9]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i10++;
            i9++;
        }
        if (i10 == i8 && i9 == i7) {
            return 0;
        }
        return i10 == i8 ? -1 : 1;
    }

    public final boolean z(C0934g c0934g) {
        if (size() > c0934g.size()) {
            return false;
        }
        int i7 = this.f15423b;
        int i8 = c0934g.f15423b;
        while (i7 < this.f15424c) {
            if (!this.f15422a[i7].equals(c0934g.f15422a[i8])) {
                return false;
            }
            i7++;
            i8++;
        }
        return true;
    }

    public C0934g(ArrayList arrayList) {
        this.f15422a = new c[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            this.f15422a[i7] = c.b((String) it.next());
            i7++;
        }
        this.f15423b = 0;
        this.f15424c = arrayList.size();
    }

    public C0934g(String str) {
        String[] strArrSplit = str.split("/", -1);
        int i7 = 0;
        for (String str2 : strArrSplit) {
            if (str2.length() > 0) {
                i7++;
            }
        }
        this.f15422a = new c[i7];
        int i8 = 0;
        for (String str3 : strArrSplit) {
            if (str3.length() > 0) {
                this.f15422a[i8] = c.b(str3);
                i8++;
            }
        }
        this.f15423b = 0;
        this.f15424c = this.f15422a.length;
    }

    public C0934g(c[] cVarArr, int i7, int i8) {
        this.f15422a = cVarArr;
        this.f15423b = i7;
        this.f15424c = i8;
    }
}
