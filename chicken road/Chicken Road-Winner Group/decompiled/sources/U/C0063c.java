package U;

import java.util.ArrayList;

/* renamed from: U.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063c extends t {

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1523e;
    public ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1524g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f1525h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f1526i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f1527j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f1528k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f1529l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1530m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1531n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f1532o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    @Override // U.t
    public final void a() {
        ArrayList arrayList = this.f1524g;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            B0.c.n(arrayList.get(size));
            throw null;
        }
        ArrayList arrayList2 = this.f1523e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            if (arrayList2.get(size2) != null) {
                throw new ClassCastException();
            }
            if (this.f1581a != null) {
                throw null;
            }
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            arrayList3.get(size3).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList4 = this.f1525h;
        int size4 = arrayList4.size() - 1;
        if (size4 >= 0) {
            B0.c.n(arrayList4.get(size4));
            throw null;
        }
        arrayList4.clear();
        if (b()) {
            ArrayList arrayList5 = this.f1527j;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                int size6 = arrayList6.size() - 1;
                if (size6 >= 0) {
                    B0.c.n(arrayList6.get(size6));
                    throw null;
                }
            }
            ArrayList arrayList7 = this.f1526i;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                int size8 = arrayList8.size() - 1;
                if (size8 >= 0) {
                    arrayList8.get(size8).getClass();
                    throw new ClassCastException();
                }
            }
            ArrayList arrayList9 = this.f1528k;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    B0.c.n(arrayList10.get(size10));
                    throw null;
                }
            }
            c(this.f1531n);
            c(this.f1530m);
            c(this.f1529l);
            c(this.f1532o);
            ArrayList arrayList11 = this.f1582b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // U.t
    public final boolean b() {
        return (this.f.isEmpty() && this.f1525h.isEmpty() && this.f1524g.isEmpty() && this.f1523e.isEmpty() && this.f1530m.isEmpty() && this.f1531n.isEmpty() && this.f1529l.isEmpty() && this.f1532o.isEmpty() && this.f1527j.isEmpty() && this.f1526i.isEmpty() && this.f1528k.isEmpty()) ? false : true;
    }
}
