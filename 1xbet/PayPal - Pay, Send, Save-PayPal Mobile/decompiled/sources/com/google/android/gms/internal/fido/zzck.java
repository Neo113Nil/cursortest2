package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public abstract class zzck extends com.google.android.gms.internal.fido.zzcf implements java.util.NavigableSet, com.google.android.gms.internal.fido.zzda {
    final transient java.util.Comparator zza;

    @javax.annotation.CheckForNull
    transient com.google.android.gms.internal.fido.zzck zzb;

    zzck(java.util.Comparator comparator) {
        this.zza = comparator;
    }

    static com.google.android.gms.internal.fido.zzcv zzs(java.util.Comparator comparator) {
        if (com.google.android.gms.internal.fido.zzcq.zza.equals(comparator)) {
            return com.google.android.gms.internal.fido.zzcv.zzc;
        }
        int i = com.google.android.gms.internal.fido.zzcc.zzd;
        return new com.google.android.gms.internal.fido.zzcv(com.google.android.gms.internal.fido.zzct.zza, comparator);
    }

    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final void addFirst(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final void addLast(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public java.lang.Object first() {
        return iterator().next();
    }

    public final java.lang.Object getFirst() {
        return first();
    }

    public final java.lang.Object getLast() {
        return last();
    }

    @Override // java.util.SortedSet
    public java.lang.Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final java.lang.Object pollFirst() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    @java.lang.Deprecated
    public final java.lang.Object pollLast() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final java.lang.Object removeFirst() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final java.lang.Object removeLast() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract com.google.android.gms.internal.fido.zzdc iterator();

    abstract com.google.android.gms.internal.fido.zzck zzf();

    @Override // java.util.NavigableSet
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.fido.zzck descendingSet() {
        com.google.android.gms.internal.fido.zzck zzckVar = this.zzb;
        if (zzckVar != null) {
            return zzckVar;
        }
        com.google.android.gms.internal.fido.zzck zzf = zzf();
        this.zzb = zzf;
        zzf.zzb = this;
        return zzf;
    }

    abstract com.google.android.gms.internal.fido.zzck zzo(java.lang.Object obj, boolean z);

    abstract com.google.android.gms.internal.fido.zzck zzq(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2);

    abstract com.google.android.gms.internal.fido.zzck zzr(java.lang.Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public abstract com.google.android.gms.internal.fido.zzdc descendingIterator();

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet headSet(java.lang.Object obj) {
        obj.getClass();
        return zzo(obj, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet tailSet(java.lang.Object obj) {
        obj.getClass();
        return zzr(obj, true);
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public java.lang.Object ceiling(java.lang.Object obj) {
        obj.getClass();
        return com.google.android.gms.internal.fido.zzcl.zza(zzr(obj, true), null);
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public java.lang.Object floor(java.lang.Object obj) {
        obj.getClass();
        return com.google.android.gms.internal.fido.zzcn.zza(zzo(obj, true).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public java.lang.Object higher(java.lang.Object obj) {
        obj.getClass();
        return com.google.android.gms.internal.fido.zzcl.zza(zzr(obj, false), null);
    }

    @Override // java.util.NavigableSet
    @javax.annotation.CheckForNull
    public java.lang.Object lower(java.lang.Object obj) {
        obj.getClass();
        return com.google.android.gms.internal.fido.zzcn.zza(zzo(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ java.util.NavigableSet headSet(java.lang.Object obj, boolean z) {
        obj.getClass();
        return zzo(obj, z);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ java.util.NavigableSet tailSet(java.lang.Object obj, boolean z) {
        obj.getClass();
        return zzr(obj, z);
    }

    @Override // java.util.NavigableSet
    /* renamed from: zzp, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.fido.zzck subSet(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        com.google.android.gms.internal.fido.zzbm.zzc(this.zza.compare(obj, obj2) <= 0);
        return zzq(obj, z, obj2, z2);
    }

    @Override // java.util.SortedSet, com.google.android.gms.internal.fido.zzda
    public final java.util.Comparator comparator() {
        return this.zza;
    }
}
