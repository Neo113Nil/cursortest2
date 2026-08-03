package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zznb implements java.util.ListIterator<java.lang.String> {
    private java.util.ListIterator<java.lang.String> zzvu;
    private final /* synthetic */ int zzvv;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzna zzvw;

    zznb(com.google.android.gms.internal.drive.zzna zznaVar, int i) {
        com.google.android.gms.internal.drive.zzkz zzkzVar;
        this.zzvw = zznaVar;
        this.zzvv = i;
        zzkzVar = zznaVar.zzvt;
        this.zzvu = zzkzVar.listIterator(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zzvu.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzvu.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzvu.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzvu.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ java.lang.String previous() {
        return this.zzvu.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return this.zzvu.next();
    }
}
