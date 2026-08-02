package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbyu {
    final boolean zza;

    @javax.annotation.Nullable
    final java.util.List zzb;
    final java.util.Collection zzc;
    final java.util.Collection zzd;
    final int zze;

    @javax.annotation.Nullable
    final com.google.android.libraries.places.internal.zzbzd zzf;
    final boolean zzg;
    final boolean zzh;

    zzbyu(@javax.annotation.Nullable java.util.List list, java.util.Collection collection, java.util.Collection collection2, @javax.annotation.Nullable com.google.android.libraries.places.internal.zzbzd zzbzdVar, boolean z, boolean z2, boolean z3, int i) {
        this.zzb = list;
        this.zzc = (java.util.Collection) com.google.common.base.Preconditions.checkNotNull(collection, "drainedSubstreams");
        this.zzf = zzbzdVar;
        this.zzd = collection2;
        this.zzg = z;
        this.zza = z2;
        this.zzh = z3;
        this.zze = i;
        com.google.common.base.Preconditions.checkState(!z2 || list == null, "passThrough should imply buffer is null");
        com.google.common.base.Preconditions.checkState((z2 && zzbzdVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        com.google.common.base.Preconditions.checkState(!z2 || (collection.size() == 1 && collection.contains(zzbzdVar)) || (collection.size() == 0 && zzbzdVar.zzb), "passThrough should imply winningSubstream is drained");
        com.google.common.base.Preconditions.checkState((z && zzbzdVar == null) ? false : true, "cancelled should imply committed");
    }

    final com.google.android.libraries.places.internal.zzbyu zza(com.google.android.libraries.places.internal.zzbzd zzbzdVar) {
        java.util.Collection unmodifiableCollection;
        java.util.List list;
        com.google.common.base.Preconditions.checkState(!this.zza, "Already passThrough");
        if (zzbzdVar.zzb) {
            unmodifiableCollection = this.zzc;
        } else {
            java.util.Collection collection = this.zzc;
            if (collection.isEmpty()) {
                unmodifiableCollection = java.util.Collections.singletonList(zzbzdVar);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(collection);
                arrayList.add(zzbzdVar);
                unmodifiableCollection = java.util.Collections.unmodifiableCollection(arrayList);
            }
        }
        java.util.Collection collection2 = unmodifiableCollection;
        com.google.android.libraries.places.internal.zzbzd zzbzdVar2 = this.zzf;
        boolean z = zzbzdVar2 != null;
        java.util.List list2 = this.zzb;
        if (z) {
            com.google.common.base.Preconditions.checkState(zzbzdVar2 == zzbzdVar, "Another RPC attempt has already committed");
            list = null;
        } else {
            list = list2;
        }
        return new com.google.android.libraries.places.internal.zzbyu(list, collection2, this.zzd, zzbzdVar2, this.zzg, z, this.zzh, this.zze);
    }

    final com.google.android.libraries.places.internal.zzbyu zzb() {
        return this.zzh ? this : new com.google.android.libraries.places.internal.zzbyu(this.zzb, this.zzc, this.zzd, this.zzf, this.zzg, this.zza, true, this.zze);
    }

    final com.google.android.libraries.places.internal.zzbyu zzc(com.google.android.libraries.places.internal.zzbzd zzbzdVar) {
        java.util.Collection unmodifiableCollection;
        boolean z = this.zzh;
        com.google.common.base.Preconditions.checkState(!z, "hedging frozen");
        com.google.android.libraries.places.internal.zzbzd zzbzdVar2 = this.zzf;
        com.google.common.base.Preconditions.checkState(zzbzdVar2 == null, "already committed");
        java.util.Collection collection = this.zzd;
        if (collection == null) {
            unmodifiableCollection = java.util.Collections.singleton(zzbzdVar);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(collection);
            arrayList.add(zzbzdVar);
            unmodifiableCollection = java.util.Collections.unmodifiableCollection(arrayList);
        }
        return new com.google.android.libraries.places.internal.zzbyu(this.zzb, this.zzc, unmodifiableCollection, zzbzdVar2, this.zzg, this.zza, z, this.zze + 1);
    }
}
