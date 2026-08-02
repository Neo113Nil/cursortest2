package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzhc implements java.util.ListIterator {
    final java.util.ListIterator zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ com.google.android.gms.internal.auth.zzhe zzc;

    zzhc(com.google.android.gms.internal.auth.zzhe zzheVar, int i) {
        com.google.android.gms.internal.auth.zzff zzffVar;
        this.zzc = zzheVar;
        this.zzb = i;
        zzffVar = zzheVar.zza;
        this.zza = zzffVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return (java.lang.String) this.zza.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ java.lang.Object previous() {
        return (java.lang.String) this.zza.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
