package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class d0 extends com.fyber.inneractive.sdk.protobuf.c implements com.fyber.inneractive.sdk.protobuf.c1, java.util.RandomAccess, com.fyber.inneractive.sdk.protobuf.n2 {
    public static final com.fyber.inneractive.sdk.protobuf.d0 d;
    public double[] b;
    public int c;

    static {
        com.fyber.inneractive.sdk.protobuf.d0 d0Var = new com.fyber.inneractive.sdk.protobuf.d0(new double[0], 0);
        d = d0Var;
        d0Var.f4180a = false;
    }

    public d0() {
        this.b = new double[10];
        this.c = 0;
    }

    public final void a(double d2) {
        c();
        int i = this.c;
        double[] dArr = this.b;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(dArr, 0, dArr2, 0, i);
            this.b = dArr2;
        }
        double[] dArr3 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        dArr3[i2] = d2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        c();
        if (i < 0 || i > (i2 = this.c)) {
            java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:");
            a2.append(this.c);
            throw new java.lang.IndexOutOfBoundsException(a2.toString());
        }
        double[] dArr = this.b;
        if (i2 < dArr.length) {
            java.lang.System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(dArr, 0, dArr2, 0, i);
            java.lang.System.arraycopy(this.b, i, dArr2, i + 1, this.c - i);
            this.b = dArr2;
        }
        this.b[i] = doubleValue;
        this.c++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        c();
        java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
        collection.getClass();
        if (!(collection instanceof com.fyber.inneractive.sdk.protobuf.d0)) {
            return super.addAll(collection);
        }
        com.fyber.inneractive.sdk.protobuf.d0 d0Var = (com.fyber.inneractive.sdk.protobuf.d0) collection;
        int i = d0Var.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.b;
        if (i3 > dArr.length) {
            this.b = java.util.Arrays.copyOf(dArr, i3);
        }
        java.lang.System.arraycopy(d0Var.b, 0, this.b, this.c, d0Var.c);
        this.c = i3;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final com.fyber.inneractive.sdk.protobuf.d0 b(int i) {
        if (i >= this.c) {
            return new com.fyber.inneractive.sdk.protobuf.d0(java.util.Arrays.copyOf(this.b, i), this.c);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.fyber.inneractive.sdk.protobuf.d0)) {
            return super.equals(obj);
        }
        com.fyber.inneractive.sdk.protobuf.d0 d0Var = (com.fyber.inneractive.sdk.protobuf.d0) obj;
        if (this.c != d0Var.c) {
            return false;
        }
        double[] dArr = d0Var.b;
        for (int i = 0; i < this.c; i++) {
            if (java.lang.Double.doubleToLongBits(this.b[i]) != java.lang.Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        if (i >= 0 && i < this.c) {
            return java.lang.Double.valueOf(this.b[i]);
        }
        java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:");
        a2.append(this.c);
        throw new java.lang.IndexOutOfBoundsException(a2.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            long doubleToLongBits = java.lang.Double.doubleToLongBits(this.b[i2]);
            java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
            i = (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Double)) {
            return -1;
        }
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i) {
        int i2;
        c();
        if (i < 0 || i >= (i2 = this.c)) {
            java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:");
            a2.append(this.c);
            throw new java.lang.IndexOutOfBoundsException(a2.toString());
        }
        double[] dArr = this.b;
        double d2 = dArr[i];
        if (i < i2 - 1) {
            java.lang.System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        c();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.b;
        java.lang.System.arraycopy(dArr, i2, dArr, i, this.c - i2);
        this.c -= i2 - i;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        c();
        if (i < 0 || i >= this.c) {
            java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:");
            a2.append(this.c);
            throw new java.lang.IndexOutOfBoundsException(a2.toString());
        }
        double[] dArr = this.b;
        double d2 = dArr[i];
        dArr[i] = doubleValue;
        return java.lang.Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public d0(double[] dArr, int i) {
        this.b = dArr;
        this.c = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        a(((java.lang.Double) obj).doubleValue());
        return true;
    }
}
