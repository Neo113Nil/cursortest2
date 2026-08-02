package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzdl extends com.google.android.gms.internal.mlkit_vision_barcode.zzcs {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzdm zza;

    zzdl(com.google.android.gms.internal.mlkit_vision_barcode.zzdm zzdmVar) {
        this.zza = zzdmVar;
    }

    @Override // java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        int i2;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        i2 = this.zza.zzc;
        com.google.android.gms.internal.mlkit_vision_barcode.zzaz.zza(i, i2, "index");
        objArr = this.zza.zzb;
        int i3 = i + i;
        java.lang.Object requireNonNull = java.util.Objects.requireNonNull(objArr[i3]);
        objArr2 = this.zza.zzb;
        return new java.util.AbstractMap.SimpleImmutableEntry(requireNonNull, java.util.Objects.requireNonNull(objArr2[i3 + 1]));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }
}
