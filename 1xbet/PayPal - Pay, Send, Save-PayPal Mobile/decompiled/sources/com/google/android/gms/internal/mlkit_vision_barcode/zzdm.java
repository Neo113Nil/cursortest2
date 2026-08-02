package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzdm extends com.google.android.gms.internal.mlkit_vision_barcode.zzcv {
    private final transient com.google.android.gms.internal.mlkit_vision_barcode.zzcu zza;
    private final transient java.lang.Object[] zzb;
    private final transient int zzc = 1;

    zzdm(com.google.android.gms.internal.mlkit_vision_barcode.zzcu zzcuVar, java.lang.Object[] objArr, int i, int i2) {
        this.zza = zzcuVar;
        this.zzb = objArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        return value != null && value.equals(this.zza.get(key));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcv, com.google.android.gms.internal.mlkit_vision_barcode.zzcn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    final int zza(java.lang.Object[] objArr, int i) {
        return zzf().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcv, com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    /* renamed from: zzd */
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzdu iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcv
    final com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzg() {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzdl(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }
}
