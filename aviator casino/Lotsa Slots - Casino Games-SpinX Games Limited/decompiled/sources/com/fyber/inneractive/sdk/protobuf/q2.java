package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class q2 extends com.fyber.inneractive.sdk.protobuf.c implements java.util.RandomAccess {
    public static final com.fyber.inneractive.sdk.protobuf.q2 d;
    public java.lang.Object[] b;
    public int c;

    static {
        com.fyber.inneractive.sdk.protobuf.q2 q2Var = new com.fyber.inneractive.sdk.protobuf.q2(new java.lang.Object[0], 0);
        d = q2Var;
        q2Var.f4180a = false;
    }

    public q2(java.lang.Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        c();
        int i = this.c;
        java.lang.Object[] objArr = this.b;
        if (i == objArr.length) {
            this.b = java.util.Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        java.lang.Object[] objArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        objArr2[i2] = obj;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public final com.fyber.inneractive.sdk.protobuf.k1 b(int i) {
        if (i >= this.c) {
            return new com.fyber.inneractive.sdk.protobuf.q2(java.util.Arrays.copyOf(this.b, i), this.c);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        if (i >= 0 && i < this.c) {
            return this.b[i];
        }
        java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:");
        a2.append(this.c);
        throw new java.lang.IndexOutOfBoundsException(a2.toString());
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
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj = objArr[i];
        if (i < i2 - 1) {
            java.lang.System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((java.util.AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        c();
        if (i < 0 || i >= this.c) {
            java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:");
            a2.append(this.c);
            throw new java.lang.IndexOutOfBoundsException(a2.toString());
        }
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        ((java.util.AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        c();
        if (i >= 0 && i <= (i2 = this.c)) {
            java.lang.Object[] objArr = this.b;
            if (i2 < objArr.length) {
                java.lang.System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[((i2 * 3) / 2) + 1];
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, i);
                java.lang.System.arraycopy(this.b, i, objArr2, i + 1, this.c - i);
                this.b = objArr2;
            }
            this.b[i] = obj;
            this.c++;
            ((java.util.AbstractList) this).modCount++;
            return;
        }
        java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:");
        a2.append(this.c);
        throw new java.lang.IndexOutOfBoundsException(a2.toString());
    }
}
