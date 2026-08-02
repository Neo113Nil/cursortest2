package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzff extends java.util.AbstractSet {
    final int zza = -1;
    final /* synthetic */ com.google.android.gms.internal.fido.zzfg zzb;

    zzff(com.google.android.gms.internal.fido.zzfg zzfgVar, int i) {
        this.zzb = zzfgVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        java.lang.Object[] objArr;
        int i = this.zza;
        objArr = this.zzb.zzb;
        return java.util.Arrays.binarySearch(objArr, zzb(), zza(), obj, i == -1 ? com.google.android.gms.internal.fido.zzfg.zza : com.google.android.gms.internal.fido.zzfi.zza) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zza() - zzb();
    }

    final int zza() {
        int[] iArr;
        int i = this.zza;
        iArr = this.zzb.zzc;
        return iArr[i + 1];
    }

    final int zzb() {
        int[] iArr;
        if (this.zza == -1) {
            return 0;
        }
        iArr = this.zzb.zzc;
        return iArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.fido.zzfe(this);
    }
}
