package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgyt extends com.google.android.gms.internal.ads.zzgys implements java.util.SortedSet {
    zzgyt(java.util.SortedSet sortedSet, com.google.android.gms.internal.ads.zzgtk zzgtkVar) {
        super(sortedSet, zzgtkVar);
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return ((java.util.SortedSet) this.zza).comparator();
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        java.util.Iterator it = this.zza.iterator();
        it.getClass();
        com.google.android.gms.internal.ads.zzgtk zzgtkVar = this.zzb;
        zzgtkVar.getClass();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (zzgtkVar.zza(next)) {
                return next;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.zzgyt(((java.util.SortedSet) this.zza).headSet(obj), this.zzb);
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        java.util.SortedSet sortedSet = (java.util.SortedSet) this.zza;
        while (true) {
            com.google.android.gms.internal.ads.zzgtk zzgtkVar = this.zzb;
            java.lang.Object last = sortedSet.last();
            if (zzgtkVar.zza(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return new com.google.android.gms.internal.ads.zzgyt(((java.util.SortedSet) this.zza).subSet(obj, obj2), this.zzb);
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.zzgyt(((java.util.SortedSet) this.zza).tailSet(obj), this.zzb);
    }
}
