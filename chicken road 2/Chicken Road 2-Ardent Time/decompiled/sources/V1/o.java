package V1;

/* loaded from: classes.dex */
public final class o extends i1.AbstractC0186e implements java.util.RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final V1.j[] f1780a;

    public o(V1.j[] jVarArr) {
        this.f1780a = jVarArr;
    }

    @Override // i1.AbstractC0186e
    public final int a() {
        return this.f1780a.length;
    }

    @Override // i1.AbstractC0186e, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof V1.j) {
            return super.contains((V1.j) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i2) {
        return this.f1780a[i2];
    }

    @Override // i1.AbstractC0186e, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof V1.j) {
            return super.indexOf((V1.j) obj);
        }
        return -1;
    }

    @Override // i1.AbstractC0186e, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof V1.j) {
            return super.lastIndexOf((V1.j) obj);
        }
        return -1;
    }
}
