package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzfi implements java.util.ListIterator {
    final java.util.ListIterator zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ com.google.android.gms.internal.play_billing.zzfk zzc;

    zzfi(com.google.android.gms.internal.play_billing.zzfk zzfkVar, int i) {
        com.google.android.gms.internal.play_billing.zzdk zzdkVar;
        this.zzb = i;
        this.zzc = zzfkVar;
        zzdkVar = zzfkVar.zza;
        this.zza = zzdkVar.listIterator(i);
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
