package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
class zzcl extends com.google.android.gms.internal.mlkit_vision_barcode.zzcm {
    java.lang.Object[] zza = new java.lang.Object[4];
    int zzb = 0;
    boolean zzc;

    private final void zzd(int i) {
        java.lang.Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i) {
            if (this.zzc) {
                this.zza = (java.lang.Object[]) objArr.clone();
                this.zzc = false;
                return;
            }
            return;
        }
        int i2 = length + (length >> 1) + 1;
        if (i2 < i) {
            int highestOneBit = java.lang.Integer.highestOneBit(i - 1);
            i2 = highestOneBit + highestOneBit;
        }
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.zza = java.util.Arrays.copyOf(objArr, i2);
        this.zzc = false;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzcm zzc(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) iterable;
            zzd(this.zzb + collection.size());
            if (collection instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzcn) {
                this.zzb = ((com.google.android.gms.internal.mlkit_vision_barcode.zzcn) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzb(it.next());
        }
        return this;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzcl zza(java.lang.Object obj) {
        obj.getClass();
        zzd(this.zzb + 1);
        java.lang.Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcm
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_barcode.zzcm zzb(java.lang.Object obj) {
        throw null;
    }

    zzcl(int i) {
    }
}
