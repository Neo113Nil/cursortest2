package I1;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f750a;

    public l(int i2) {
        switch (i2) {
            case 1:
                this.f750a = new java.util.ArrayList();
                new java.util.HashMap();
                new java.util.HashMap();
                break;
            default:
                this.f750a = new java.util.ArrayList(20);
                break;
        }
    }

    public void a(java.lang.String name, java.lang.String value) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        java.util.ArrayList arrayList = this.f750a;
        arrayList.add(name);
        arrayList.add(y1.g.c0(value).toString());
    }

    public I1.m b() {
        java.lang.Object[] array = this.f750a.toArray(new java.lang.String[0]);
        if (array != null) {
            return new I1.m((java.lang.String[]) array);
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public java.util.List c() {
        java.util.ArrayList arrayList;
        if (this.f750a.isEmpty()) {
            return java.util.Collections.emptyList();
        }
        synchronized (this.f750a) {
            arrayList = new java.util.ArrayList(this.f750a);
        }
        return arrayList;
    }

    public void d(java.lang.String str) {
        int i2 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f750a;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((java.lang.String) arrayList.get(i2))) {
                arrayList.remove(i2);
                arrayList.remove(i2);
                i2 -= 2;
            }
            i2 += 2;
        }
    }
}
