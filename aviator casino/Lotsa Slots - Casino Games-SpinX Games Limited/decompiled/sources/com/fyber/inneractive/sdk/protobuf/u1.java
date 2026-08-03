package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class u1 extends com.fyber.inneractive.sdk.protobuf.c implements com.fyber.inneractive.sdk.protobuf.j1, java.util.RandomAccess, com.fyber.inneractive.sdk.protobuf.n2 {
    public static final com.fyber.inneractive.sdk.protobuf.u1 d;
    public long[] b;
    public int c;

    static {
        com.fyber.inneractive.sdk.protobuf.u1 u1Var = new com.fyber.inneractive.sdk.protobuf.u1(new long[0], 0);
        d = u1Var;
        u1Var.f4180a = false;
    }

    public u1() {
        this.b = new long[10];
        this.c = 0;
    }

    public final void a(long j) {
        c();
        int i = this.c;
        long[] jArr = this.b;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            this.b = jArr2;
        }
        long[] jArr3 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        long longValue = ((java.lang.Long) obj).longValue();
        c();
        if (i < 0 || i > (i2 = this.c)) {
            java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:");
            a2.append(this.c);
            throw new java.lang.IndexOutOfBoundsException(a2.toString());
        }
        long[] jArr = this.b;
        if (i2 < jArr.length) {
            java.lang.System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            java.lang.System.arraycopy(this.b, i, jArr2, i + 1, this.c - i);
            this.b = jArr2;
        }
        this.b[i] = longValue;
        this.c++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        c();
        java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
        collection.getClass();
        if (!(collection instanceof com.fyber.inneractive.sdk.protobuf.u1)) {
            return super.addAll(collection);
        }
        com.fyber.inneractive.sdk.protobuf.u1 u1Var = (com.fyber.inneractive.sdk.protobuf.u1) collection;
        int i = u1Var.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.b;
        if (i3 > jArr.length) {
            this.b = java.util.Arrays.copyOf(jArr, i3);
        }
        java.lang.System.arraycopy(u1Var.b, 0, this.b, this.c, u1Var.c);
        this.c = i3;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.c) {
            java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:");
            a2.append(this.c);
            throw new java.lang.IndexOutOfBoundsException(a2.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final com.fyber.inneractive.sdk.protobuf.u1 b(int i) {
        if (i >= this.c) {
            return new com.fyber.inneractive.sdk.protobuf.u1(java.util.Arrays.copyOf(this.b, i), this.c);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.fyber.inneractive.sdk.protobuf.u1)) {
            return super.equals(obj);
        }
        com.fyber.inneractive.sdk.protobuf.u1 u1Var = (com.fyber.inneractive.sdk.protobuf.u1) obj;
        if (this.c != u1Var.c) {
            return false;
        }
        long[] jArr = u1Var.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        c(i);
        return java.lang.Long.valueOf(this.b[i]);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            long j = this.b[i2];
            java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Long)) {
            return -1;
        }
        long longValue = ((java.lang.Long) obj).longValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i) {
        c();
        c(i);
        long[] jArr = this.b;
        long j = jArr[i];
        if (i < this.c - 1) {
            java.lang.System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.c--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        c();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.b;
        java.lang.System.arraycopy(jArr, i2, jArr, i, this.c - i2);
        this.c -= i2 - i;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        long longValue = ((java.lang.Long) obj).longValue();
        c();
        c(i);
        long[] jArr = this.b;
        long j = jArr[i];
        jArr[i] = longValue;
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public u1(long[] jArr, int i) {
        this.b = jArr;
        this.c = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        a(((java.lang.Long) obj).longValue());
        return true;
    }
}
