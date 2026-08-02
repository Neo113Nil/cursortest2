package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzdn extends com.google.android.gms.internal.mlkit_vision_barcode.zzcv {
    private final transient com.google.android.gms.internal.mlkit_vision_barcode.zzcu zza;
    private final transient com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzb;

    zzdn(com.google.android.gms.internal.mlkit_vision_barcode.zzcu zzcuVar, com.google.android.gms.internal.mlkit_vision_barcode.zzcs zzcsVar) {
        this.zza = zzcuVar;
        this.zzb = zzcsVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcv, com.google.android.gms.internal.mlkit_vision_barcode.zzcn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    final int zza(java.lang.Object[] objArr, int i) {
        return this.zzb.zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcv, com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    /* renamed from: zzd */
    public final com.google.android.gms.internal.mlkit_vision_barcode.zzdu iterator() {
        return this.zzb.listIterator(0);
    }
}
