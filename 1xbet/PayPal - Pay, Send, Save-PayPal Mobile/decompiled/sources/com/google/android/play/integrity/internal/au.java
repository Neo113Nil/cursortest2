package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
final class au extends com.google.android.play.integrity.internal.as {

    /* renamed from: a, reason: collision with root package name */
    static final com.google.android.play.integrity.internal.au f3851a;
    private static final java.lang.Object[] d;
    final transient java.lang.Object[] b;
    final transient java.lang.Object[] c;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        d = objArr;
        f3851a = new com.google.android.play.integrity.internal.au(objArr, 0, objArr, 0, 0);
    }

    au(java.lang.Object[] objArr, int i, java.lang.Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = objArr2;
    }

    @Override // com.google.android.play.integrity.internal.ao
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.c.length;
        return false;
    }

    @Override // com.google.android.play.integrity.internal.as, com.google.android.play.integrity.internal.ao
    /* renamed from: d */
    public final com.google.android.play.integrity.internal.av iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.play.integrity.internal.as, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.as
    final boolean i() {
        return true;
    }

    @Override // com.google.android.play.integrity.internal.as, com.google.android.play.integrity.internal.ao, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.as
    final com.google.android.play.integrity.internal.ar g() {
        return com.google.android.play.integrity.internal.at.f3850a;
    }

    @Override // com.google.android.play.integrity.internal.ao
    final java.lang.Object[] e() {
        return this.b;
    }
}
