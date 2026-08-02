package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
final class at extends com.google.android.play.integrity.internal.ar {

    /* renamed from: a, reason: collision with root package name */
    static final com.google.android.play.integrity.internal.ar f3850a = new com.google.android.play.integrity.internal.at(new java.lang.Object[0], 0);
    final transient java.lang.Object[] b;

    at(java.lang.Object[] objArr, int i) {
        this.b = objArr;
    }

    @Override // com.google.android.play.integrity.internal.ar, com.google.android.play.integrity.internal.ao
    final int a(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.b, 0, objArr, 0, 0);
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final int b() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final int c() {
        return 0;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.play.integrity.internal.al.a(i, 0, "index");
        return java.util.Objects.requireNonNull(this.b[i]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final java.lang.Object[] e() {
        return this.b;
    }
}
