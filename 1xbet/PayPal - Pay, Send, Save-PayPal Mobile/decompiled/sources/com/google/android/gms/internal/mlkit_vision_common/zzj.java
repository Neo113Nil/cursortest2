package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
class zzj extends com.google.android.gms.internal.mlkit_vision_common.zzk {
    java.lang.Object[] zza = new java.lang.Object[4];
    int zzb = 0;
    boolean zzc;

    private final void zzb(int i) {
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

    public final com.google.android.gms.internal.mlkit_vision_common.zzj zza(java.lang.Object obj) {
        obj.getClass();
        zzb(this.zzb + 1);
        java.lang.Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }

    zzj(int i) {
    }
}
