package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
class zzbq extends com.google.android.gms.internal.mlkit_vision_barcode.zzbo implements java.util.List {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbq(com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar, java.lang.Object obj, @javax.annotation.CheckForNull java.util.List list, com.google.android.gms.internal.mlkit_vision_barcode.zzbo zzboVar) {
        super(zzbrVar, obj, list, zzboVar);
        this.zzf = zzbrVar;
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((java.util.List) this.zzb).add(i, obj);
        com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zzf;
        i2 = zzbrVar.zzb;
        zzbrVar.zzb = i2 + 1;
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        int i2;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((java.util.List) this.zzb).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zzf;
        i2 = zzbrVar.zzb;
        zzbrVar.zzb = i2 + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        zza();
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        zzb();
        return ((java.util.List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
        zzb();
        return ((java.util.List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
        zzb();
        return ((java.util.List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        zzb();
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzbp(this);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        int i2;
        zzb();
        java.lang.Object remove = ((java.util.List) this.zzb).remove(i);
        com.google.android.gms.internal.mlkit_vision_barcode.zzbr zzbrVar = this.zzf;
        i2 = zzbrVar.zzb;
        zzbrVar.zzb = i2 - 1;
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        zzb();
        return ((java.util.List) this.zzb).set(i, obj);
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        zzb();
        java.util.List subList = ((java.util.List) this.zzb).subList(i, i2);
        com.google.android.gms.internal.mlkit_vision_barcode.zzbo zzboVar = this.zzc;
        if (zzboVar == null) {
            zzboVar = this;
        }
        return this.zzf.zzm(this.zza, subList, zzboVar);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        zzb();
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzbp(this, i);
    }
}
