package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
final class zzdp extends com.google.android.gms.internal.mlkit_vision_barcode.zzcu {
    final transient java.lang.Object[] zza;

    static com.google.android.gms.internal.mlkit_vision_barcode.zzdp zzg(int i, java.lang.Object[] objArr, com.google.android.gms.internal.mlkit_vision_barcode.zzct zzctVar) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzby.zzb(java.util.Objects.requireNonNull(objArr[0]), java.util.Objects.requireNonNull(objArr[1]));
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzdp(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[RETURN] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcu, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj != null) {
            java.lang.Object[] objArr = this.zza;
            if (java.util.Objects.requireNonNull(objArr[0]).equals(obj)) {
                obj2 = java.util.Objects.requireNonNull(objArr[1]);
                if (obj2 != null) {
                    return null;
                }
                return obj2;
            }
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcu
    final com.google.android.gms.internal.mlkit_vision_barcode.zzcn zza() {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzdo(this.zza, 1, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcu
    final com.google.android.gms.internal.mlkit_vision_barcode.zzcv zzd() {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzdm(this, this.zza, 0, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcu
    final com.google.android.gms.internal.mlkit_vision_barcode.zzcv zze() {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzdn(this, new com.google.android.gms.internal.mlkit_vision_barcode.zzdo(this.zza, 0, 1));
    }

    private zzdp(@javax.annotation.CheckForNull java.lang.Object obj, java.lang.Object[] objArr, int i) {
        this.zza = objArr;
    }
}
