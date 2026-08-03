package P;

/* renamed from: P.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029b extends P.t {

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f1232e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f1233f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f1234g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f1235h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f1236i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.ArrayList f1237j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.ArrayList f1238k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.ArrayList f1239l;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f1240m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f1241n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f1242o;

    public static void c(java.util.ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw new java.lang.ClassCastException();
    }

    @Override // P.t
    public final void a() {
        java.util.ArrayList arrayList = this.f1234g;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            B1.a.m(arrayList.get(size));
            throw null;
        }
        java.util.ArrayList arrayList2 = this.f1232e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            if (arrayList2.get(size2) != null) {
                throw new java.lang.ClassCastException();
            }
            if (this.f1296a != null) {
                throw null;
            }
            arrayList2.remove(size2);
        }
        java.util.ArrayList arrayList3 = this.f1233f;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            arrayList3.get(size3).getClass();
            throw new java.lang.ClassCastException();
        }
        java.util.ArrayList arrayList4 = this.f1235h;
        int size4 = arrayList4.size() - 1;
        if (size4 >= 0) {
            B1.a.m(arrayList4.get(size4));
            throw null;
        }
        arrayList4.clear();
        if (b()) {
            java.util.ArrayList arrayList5 = this.f1237j;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                java.util.ArrayList arrayList6 = (java.util.ArrayList) arrayList5.get(size5);
                int size6 = arrayList6.size() - 1;
                if (size6 >= 0) {
                    B1.a.m(arrayList6.get(size6));
                    throw null;
                }
            }
            java.util.ArrayList arrayList7 = this.f1236i;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                java.util.ArrayList arrayList8 = (java.util.ArrayList) arrayList7.get(size7);
                int size8 = arrayList8.size() - 1;
                if (size8 >= 0) {
                    arrayList8.get(size8).getClass();
                    throw new java.lang.ClassCastException();
                }
            }
            java.util.ArrayList arrayList9 = this.f1238k;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                java.util.ArrayList arrayList10 = (java.util.ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    B1.a.m(arrayList10.get(size10));
                    throw null;
                }
            }
            c(this.f1241n);
            c(this.f1240m);
            c(this.f1239l);
            c(this.f1242o);
            java.util.ArrayList arrayList11 = this.f1297b;
            if (arrayList11.size() > 0) {
                B1.a.m(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // P.t
    public final boolean b() {
        return (this.f1233f.isEmpty() && this.f1235h.isEmpty() && this.f1234g.isEmpty() && this.f1232e.isEmpty() && this.f1240m.isEmpty() && this.f1241n.isEmpty() && this.f1239l.isEmpty() && this.f1242o.isEmpty() && this.f1237j.isEmpty() && this.f1236i.isEmpty() && this.f1238k.isEmpty()) ? false : true;
    }
}
