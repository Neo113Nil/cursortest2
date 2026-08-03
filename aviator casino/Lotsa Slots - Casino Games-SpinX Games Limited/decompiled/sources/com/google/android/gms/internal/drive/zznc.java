package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zznc implements java.util.Iterator<java.lang.String> {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzna zzvw;
    private java.util.Iterator<java.lang.String> zzvx;

    zznc(com.google.android.gms.internal.drive.zzna zznaVar) {
        com.google.android.gms.internal.drive.zzkz zzkzVar;
        this.zzvw = zznaVar;
        zzkzVar = zznaVar.zzvt;
        this.zzvx = zzkzVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzvx.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.String next() {
        return this.zzvx.next();
    }
}
