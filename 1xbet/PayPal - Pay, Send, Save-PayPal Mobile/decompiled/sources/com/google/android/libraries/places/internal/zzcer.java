package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcer extends com.google.android.libraries.places.internal.zzbln {
    private final java.util.List zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb;
    private final int zzc;

    public zzcer(java.util.List list, java.util.concurrent.atomic.AtomicInteger atomicInteger) {
        com.google.common.base.Preconditions.checkArgument(!list.isEmpty(), "empty list");
        this.zza = list;
        this.zzb = (java.util.concurrent.atomic.AtomicInteger) com.google.common.base.Preconditions.checkNotNull(atomicInteger, "index");
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((com.google.android.libraries.places.internal.zzbln) it.next()).hashCode();
        }
        this.zzc = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzcer)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzcer zzcerVar = (com.google.android.libraries.places.internal.zzcer) obj;
        if (zzcerVar == this) {
            return true;
        }
        if (this.zzc == zzcerVar.zzc && this.zzb == zzcerVar.zzb) {
            java.util.List list = this.zza;
            int size = list.size();
            java.util.List list2 = zzcerVar.zza;
            if (size == list2.size() && new java.util.HashSet(list).containsAll(list2)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper((java.lang.Class<?>) com.google.android.libraries.places.internal.zzcer.class).add("subchannelPickers", this.zza).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbln
    public final com.google.android.libraries.places.internal.zzbli zza(com.google.android.libraries.places.internal.zzblj zzbljVar) {
        int andIncrement = this.zzb.getAndIncrement();
        java.util.List list = this.zza;
        return ((com.google.android.libraries.places.internal.zzbln) list.get((andIncrement & Integer.MAX_VALUE) % list.size())).zza(zzbljVar);
    }

    public final int hashCode() {
        return this.zzc;
    }
}
