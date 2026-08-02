package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzv extends com.google.android.gms.internal.mlkit_vision_common.zzp {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_common.zzw zza;

    zzv(com.google.android.gms.internal.mlkit_vision_common.zzw zzwVar) {
        this.zza = zzwVar;
    }

    @Override // java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        int i2;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        i2 = this.zza.zzc;
        com.google.android.gms.internal.mlkit_vision_common.zzf.zza(i, i2, "index");
        com.google.android.gms.internal.mlkit_vision_common.zzw zzwVar = this.zza;
        objArr = zzwVar.zzb;
        int i3 = i + i;
        java.lang.Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zzwVar.zzb;
        java.lang.Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }
}
