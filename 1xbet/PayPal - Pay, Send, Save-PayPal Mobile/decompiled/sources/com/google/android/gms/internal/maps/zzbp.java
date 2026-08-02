package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
final class zzbp extends com.google.android.gms.internal.maps.zzbi {
    final /* synthetic */ com.google.android.gms.internal.maps.zzbq zza;

    zzbp(com.google.android.gms.internal.maps.zzbq zzbqVar) {
        java.util.Objects.requireNonNull(zzbqVar);
        this.zza = zzbqVar;
    }

    @Override // java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        int i2;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        com.google.android.gms.internal.maps.zzbq zzbqVar = this.zza;
        i2 = zzbqVar.zzc;
        com.google.android.gms.internal.maps.zzba.zza(i, i2, "index");
        objArr = zzbqVar.zzb;
        int i3 = i + i;
        java.lang.Object requireNonNull = java.util.Objects.requireNonNull(objArr[i3]);
        objArr2 = zzbqVar.zzb;
        return new java.util.AbstractMap.SimpleImmutableEntry(requireNonNull, java.util.Objects.requireNonNull(objArr2[i3 + 1]));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }
}
