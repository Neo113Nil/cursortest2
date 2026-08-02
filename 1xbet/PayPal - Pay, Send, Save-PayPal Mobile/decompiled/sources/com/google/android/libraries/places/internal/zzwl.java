package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzwl extends java.util.AbstractSet {
    final int zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzwm zzb;

    zzwl(com.google.android.libraries.places.internal.zzwm zzwmVar, int i) {
        java.util.Objects.requireNonNull(zzwmVar);
        this.zzb = zzwmVar;
        this.zza = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return java.util.Arrays.binarySearch(this.zzb.zzb(), zzb(), zzc(), obj, this.zza == -1 ? com.google.android.libraries.places.internal.zzwm.zza : com.google.android.libraries.places.internal.zzwo.zzb) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.libraries.places.internal.zzwk(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zzc() - zzb();
    }

    final java.lang.Object zza(int i) {
        return this.zzb.zzb()[zzb() + i];
    }

    final int zzb() {
        int i = this.zza;
        if (i == -1) {
            return 0;
        }
        return this.zzb.zzc()[i];
    }

    final int zzc() {
        return this.zzb.zzc()[this.zza + 1];
    }
}
