package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzgwb extends com.google.android.gms.internal.ads.zzgwd implements java.util.Collection {
    protected zzgwb() {
    }

    public boolean add(java.lang.Object obj) {
        return zzc().add(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        return zzc().addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        zzc().clear();
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return zzc().contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return zzc().containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return zzc().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return zzc().iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return zzc().remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return zzc().removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        return zzc().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return zzc().size();
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return zzc().toArray();
    }

    @Override // com.google.android.gms.internal.ads.zzgwd
    protected /* bridge */ /* synthetic */ java.lang.Object zzb() {
        throw null;
    }

    protected abstract java.util.Collection zzc();

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return zzc().toArray(objArr);
    }
}
