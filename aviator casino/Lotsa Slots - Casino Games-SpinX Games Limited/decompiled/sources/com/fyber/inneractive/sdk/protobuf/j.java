package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class j extends com.fyber.inneractive.sdk.protobuf.c implements com.fyber.inneractive.sdk.protobuf.b1, java.util.RandomAccess, com.fyber.inneractive.sdk.protobuf.n2 {
    public static final com.fyber.inneractive.sdk.protobuf.j d;
    public boolean[] b;
    public int c;

    static {
        com.fyber.inneractive.sdk.protobuf.j jVar = new com.fyber.inneractive.sdk.protobuf.j(new boolean[0], 0);
        d = jVar;
        jVar.f4180a = false;
    }

    public j() {
        this.b = new boolean[10];
        this.c = 0;
    }

    public final void a(boolean z) {
        c();
        int i = this.c;
        boolean[] zArr = this.b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, i);
            this.b = zArr2;
        }
        boolean[] zArr3 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        c();
        if (i < 0 || i > (i2 = this.c)) {
            java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:");
            a2.append(this.c);
            throw new java.lang.IndexOutOfBoundsException(a2.toString());
        }
        boolean[] zArr = this.b;
        if (i2 < zArr.length) {
            java.lang.System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, i);
            java.lang.System.arraycopy(this.b, i, zArr2, i + 1, this.c - i);
            this.b = zArr2;
        }
        this.b[i] = booleanValue;
        this.c++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        c();
        java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
        collection.getClass();
        if (!(collection instanceof com.fyber.inneractive.sdk.protobuf.j)) {
            return super.addAll(collection);
        }
        com.fyber.inneractive.sdk.protobuf.j jVar = (com.fyber.inneractive.sdk.protobuf.j) collection;
        int i = jVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.b;
        if (i3 > zArr.length) {
            this.b = java.util.Arrays.copyOf(zArr, i3);
        }
        java.lang.System.arraycopy(jVar.b, 0, this.b, this.c, jVar.c);
        this.c = i3;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final com.fyber.inneractive.sdk.protobuf.j b(int i) {
        if (i >= this.c) {
            return new com.fyber.inneractive.sdk.protobuf.j(java.util.Arrays.copyOf(this.b, i), this.c);
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
        if (!(obj instanceof com.fyber.inneractive.sdk.protobuf.j)) {
            return super.equals(obj);
        }
        com.fyber.inneractive.sdk.protobuf.j jVar = (com.fyber.inneractive.sdk.protobuf.j) obj;
        if (this.c != jVar.c) {
            return false;
        }
        boolean[] zArr = jVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        if (i >= 0 && i < this.c) {
            return java.lang.Boolean.valueOf(this.b[i]);
        }
        java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:");
        a2.append(this.c);
        throw new java.lang.IndexOutOfBoundsException(a2.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            int i3 = i * 31;
            boolean z = this.b[i2];
            java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Boolean)) {
            return -1;
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == booleanValue) {
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
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        if (i < i2 - 1) {
            java.lang.System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        c();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.b;
        java.lang.System.arraycopy(zArr, i2, zArr, i, this.c - i2);
        this.c -= i2 - i;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        c();
        if (i < 0 || i >= this.c) {
            java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:");
            a2.append(this.c);
            throw new java.lang.IndexOutOfBoundsException(a2.toString());
        }
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public j(boolean[] zArr, int i) {
        this.b = zArr;
        this.c = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        a(((java.lang.Boolean) obj).booleanValue());
        return true;
    }
}
