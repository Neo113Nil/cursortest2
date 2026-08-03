package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class U extends androidx.datastore.preferences.protobuf.AbstractC0066b implements java.util.RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.U f2262d = new androidx.datastore.preferences.protobuf.U(new java.lang.Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f2263b;

    /* renamed from: c, reason: collision with root package name */
    public int f2264c;

    public U(java.lang.Object[] objArr, int i2, boolean z2) {
        this.f2285a = z2;
        this.f2263b = objArr;
        this.f2264c = i2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        a();
        int i2 = this.f2264c;
        java.lang.Object[] objArr = this.f2263b;
        if (i2 == objArr.length) {
            this.f2263b = java.util.Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        java.lang.Object[] objArr2 = this.f2263b;
        int i3 = this.f2264c;
        this.f2264c = i3 + 1;
        objArr2[i3] = obj;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i2) {
        if (i2 < 0 || i2 >= this.f2264c) {
            throw new java.lang.IndexOutOfBoundsException("Index:" + i2 + ", Size:" + this.f2264c);
        }
    }

    public final androidx.datastore.preferences.protobuf.U c(int i2) {
        if (i2 >= this.f2264c) {
            return new androidx.datastore.preferences.protobuf.U(java.util.Arrays.copyOf(this.f2263b, i2), this.f2264c, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i2) {
        b(i2);
        return this.f2263b[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0066b, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i2) {
        a();
        b(i2);
        java.lang.Object[] objArr = this.f2263b;
        java.lang.Object obj = objArr[i2];
        if (i2 < this.f2264c - 1) {
            java.lang.System.arraycopy(objArr, i2 + 1, objArr, i2, (r2 - i2) - 1);
        }
        this.f2264c--;
        ((java.util.AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i2, java.lang.Object obj) {
        a();
        b(i2);
        java.lang.Object[] objArr = this.f2263b;
        java.lang.Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((java.util.AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2264c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, java.lang.Object obj) {
        int i3;
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f2264c)) {
            java.lang.Object[] objArr = this.f2263b;
            if (i3 < objArr.length) {
                java.lang.System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[((i3 * 3) / 2) + 1];
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, i2);
                java.lang.System.arraycopy(this.f2263b, i2, objArr2, i2 + 1, this.f2264c - i2);
                this.f2263b = objArr2;
            }
            this.f2263b[i2] = obj;
            this.f2264c++;
            ((java.util.AbstractList) this).modCount++;
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("Index:" + i2 + ", Size:" + this.f2264c);
    }
}
