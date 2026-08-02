package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzz extends com.google.android.gms.internal.mlkit_vision_common.zzr {
    static final com.google.android.gms.internal.mlkit_vision_common.zzr zza = new com.google.android.gms.internal.mlkit_vision_common.zzz(null, new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    static com.google.android.gms.internal.mlkit_vision_common.zzz zzg(int i, java.lang.Object[] objArr, com.google.android.gms.internal.mlkit_vision_common.zzq zzqVar) {
        java.lang.Object obj = objArr[0];
        obj.getClass();
        java.lang.Object obj2 = objArr[1];
        obj2.getClass();
        com.google.android.gms.internal.mlkit_vision_common.zzi.zza(obj, obj2);
        return new com.google.android.gms.internal.mlkit_vision_common.zzz(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[RETURN] */
    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object[] objArr = this.zzb;
        int i = this.zzc;
        if (obj != null && i == 1) {
            java.lang.Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
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

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    final com.google.android.gms.internal.mlkit_vision_common.zzl zza() {
        return new com.google.android.gms.internal.mlkit_vision_common.zzy(this.zzb, 1, this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    final com.google.android.gms.internal.mlkit_vision_common.zzs zzd() {
        return new com.google.android.gms.internal.mlkit_vision_common.zzw(this, this.zzb, 0, this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    final com.google.android.gms.internal.mlkit_vision_common.zzs zze() {
        return new com.google.android.gms.internal.mlkit_vision_common.zzx(this, new com.google.android.gms.internal.mlkit_vision_common.zzy(this.zzb, 0, this.zzc));
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzc;
    }

    private zzz(@javax.annotation.CheckForNull java.lang.Object obj, java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }
}
