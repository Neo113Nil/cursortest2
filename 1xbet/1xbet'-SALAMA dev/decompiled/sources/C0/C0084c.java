package C0;

import W5.AbstractC0486a1;
import java.util.ArrayList;

/* JADX INFO: renamed from: C0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0084c extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f1248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f1249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f1250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f1251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f1252i;
    public ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f1253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f1254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f1255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f1256n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f1257o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size >= 0) {
            throw p031e1.k.c(arrayList, size);
        }
    }

    @Override // C0.t
    public final void a() {
        ArrayList arrayList = this.f1250g;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            AbstractC0486a1.n(arrayList.get(size));
            throw null;
        }
        ArrayList arrayList2 = this.f1248e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            if (arrayList2.get(size2) != null) {
                throw new ClassCastException();
            }
            if (this.f1310a != null) {
                throw null;
            }
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f1249f;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            throw p031e1.k.c(arrayList3, size3);
        }
        ArrayList arrayList4 = this.f1251h;
        int size4 = arrayList4.size() - 1;
        if (size4 >= 0) {
            AbstractC0486a1.n(arrayList4.get(size4));
            throw null;
        }
        arrayList4.clear();
        if (b()) {
            ArrayList arrayList5 = this.j;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                int size6 = arrayList6.size() - 1;
                if (size6 >= 0) {
                    AbstractC0486a1.n(arrayList6.get(size6));
                    throw null;
                }
            }
            ArrayList arrayList7 = this.f1252i;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                int size8 = arrayList8.size() - 1;
                if (size8 >= 0) {
                    throw p031e1.k.c(arrayList8, size8);
                }
            }
            ArrayList arrayList9 = this.f1253k;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    AbstractC0486a1.n(arrayList10.get(size10));
                    throw null;
                }
            }
            c(this.f1256n);
            c(this.f1255m);
            c(this.f1254l);
            c(this.f1257o);
            ArrayList arrayList11 = this.f1311b;
            if (arrayList11.size() > 0) {
                throw p031e1.k.c(arrayList11, 0);
            }
            arrayList11.clear();
        }
    }

    @Override // C0.t
    public final boolean b() {
        return (this.f1249f.isEmpty() && this.f1251h.isEmpty() && this.f1250g.isEmpty() && this.f1248e.isEmpty() && this.f1255m.isEmpty() && this.f1256n.isEmpty() && this.f1254l.isEmpty() && this.f1257o.isEmpty() && this.j.isEmpty() && this.f1252i.isEmpty() && this.f1253k.isEmpty()) ? false : true;
    }
}
