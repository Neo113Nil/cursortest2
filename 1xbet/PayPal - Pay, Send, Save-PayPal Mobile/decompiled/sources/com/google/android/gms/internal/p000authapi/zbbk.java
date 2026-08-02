package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
final class zbbk extends com.google.android.gms.internal.p000authapi.zbbj {
    static final com.google.android.gms.internal.p000authapi.zbbj zba = new com.google.android.gms.internal.p000authapi.zbbk(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zbb;
    private final transient int zbc;

    zbbk(java.lang.Object[] objArr, int i) {
        this.zbb = objArr;
        this.zbc = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.p000authapi.zbbd.zba(i, this.zbc, "index");
        return java.util.Objects.requireNonNull(this.zbb[i]);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbg
    final int zbc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbg
    final boolean zbf() {
        return false;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbj, com.google.android.gms.internal.p000authapi.zbbg
    final int zbg(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = this.zbb;
        int i2 = this.zbc;
        java.lang.System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbg
    final int zbd() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbg
    final java.lang.Object[] zbb() {
        return this.zbb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }
}
