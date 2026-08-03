package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class q0 extends com.fyber.inneractive.sdk.protobuf.c implements com.fyber.inneractive.sdk.protobuf.f1, java.util.RandomAccess, com.fyber.inneractive.sdk.protobuf.n2 {
    public static final com.fyber.inneractive.sdk.protobuf.q0 d;
    public float[] b;
    public int c;

    static {
        com.fyber.inneractive.sdk.protobuf.q0 q0Var = new com.fyber.inneractive.sdk.protobuf.q0(new float[0], 0);
        d = q0Var;
        q0Var.f4180a = false;
    }

    public q0() {
        this.b = new float[10];
        this.c = 0;
    }

    public final void a(float f) {
        c();
        int i = this.c;
        float[] fArr = this.b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, i);
            this.b = fArr2;
        }
        float[] fArr3 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        float floatValue = ((java.lang.Float) obj).floatValue();
        c();
        if (i < 0 || i > (i2 = this.c)) {
            java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:");
            a2.append(this.c);
            throw new java.lang.IndexOutOfBoundsException(a2.toString());
        }
        float[] fArr = this.b;
        if (i2 < fArr.length) {
            java.lang.System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, i);
            java.lang.System.arraycopy(this.b, i, fArr2, i + 1, this.c - i);
            this.b = fArr2;
        }
        this.b[i] = floatValue;
        this.c++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        c();
        java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
        collection.getClass();
        if (!(collection instanceof com.fyber.inneractive.sdk.protobuf.q0)) {
            return super.addAll(collection);
        }
        com.fyber.inneractive.sdk.protobuf.q0 q0Var = (com.fyber.inneractive.sdk.protobuf.q0) collection;
        int i = q0Var.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.b;
        if (i3 > fArr.length) {
            this.b = java.util.Arrays.copyOf(fArr, i3);
        }
        java.lang.System.arraycopy(q0Var.b, 0, this.b, this.c, q0Var.c);
        this.c = i3;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final com.fyber.inneractive.sdk.protobuf.q0 b(int i) {
        if (i >= this.c) {
            return new com.fyber.inneractive.sdk.protobuf.q0(java.util.Arrays.copyOf(this.b, i), this.c);
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
        if (!(obj instanceof com.fyber.inneractive.sdk.protobuf.q0)) {
            return super.equals(obj);
        }
        com.fyber.inneractive.sdk.protobuf.q0 q0Var = (com.fyber.inneractive.sdk.protobuf.q0) obj;
        if (this.c != q0Var.c) {
            return false;
        }
        float[] fArr = q0Var.b;
        for (int i = 0; i < this.c; i++) {
            if (java.lang.Float.floatToIntBits(this.b[i]) != java.lang.Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        if (i >= 0 && i < this.c) {
            return java.lang.Float.valueOf(this.b[i]);
        }
        java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:");
        a2.append(this.c);
        throw new java.lang.IndexOutOfBoundsException(a2.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + java.lang.Float.floatToIntBits(this.b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Float)) {
            return -1;
        }
        float floatValue = ((java.lang.Float) obj).floatValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == floatValue) {
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
        float[] fArr = this.b;
        float f = fArr[i];
        if (i < i2 - 1) {
            java.lang.System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        c();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.b;
        java.lang.System.arraycopy(fArr, i2, fArr, i, this.c - i2);
        this.c -= i2 - i;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        float floatValue = ((java.lang.Float) obj).floatValue();
        c();
        if (i < 0 || i >= this.c) {
            java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:");
            a2.append(this.c);
            throw new java.lang.IndexOutOfBoundsException(a2.toString());
        }
        float[] fArr = this.b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return java.lang.Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public q0(float[] fArr, int i) {
        this.b = fArr;
        this.c = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        a(((java.lang.Float) obj).floatValue());
        return true;
    }
}
