package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzbp extends com.google.android.gms.internal.mlkit_vision_barcode.zzbn implements java.util.ListIterator {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzbq zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbp(com.google.android.gms.internal.mlkit_vision_barcode.zzbq zzbqVar) {
        super(zzbqVar);
        this.zzd = zzbqVar;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        int i;
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((java.util.ListIterator) this.zza).add(obj);
        com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zzd.zzf;
        i = zzbrVar.zzb;
        zzbrVar.zzb = i + 1;
        if (isEmpty) {
            this.zzd.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((java.util.ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((java.util.ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        zza();
        return ((java.util.ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((java.util.ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        zza();
        ((java.util.ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbp(com.google.android.gms.internal.mlkit_vision_barcode.zzbq zzbqVar, int i) {
        super(zzbqVar, ((java.util.List) zzbqVar.zzb).listIterator(i));
        this.zzd = zzbqVar;
    }
}
