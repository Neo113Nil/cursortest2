package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public final class zzah {
    java.lang.Object[] zza = new java.lang.Object[8];
    int zzb = 0;
    com.google.android.gms.internal.mlkit_common.zzag zzc;

    public final com.google.android.gms.internal.mlkit_common.zzah zza(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.zzb + 1;
        java.lang.Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = java.util.Arrays.copyOf(objArr, com.google.android.gms.internal.mlkit_common.zzaa.zza(length, i2));
        }
        com.google.android.gms.internal.mlkit_common.zzw.zza(obj, obj2);
        java.lang.Object[] objArr2 = this.zza;
        int i3 = this.zzb;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.zzb = i3 + 1;
        return this;
    }

    public final com.google.android.gms.internal.mlkit_common.zzai zzb() {
        com.google.android.gms.internal.mlkit_common.zzag zzagVar = this.zzc;
        if (zzagVar != null) {
            throw zzagVar.zza();
        }
        com.google.android.gms.internal.mlkit_common.zzaq zzg = com.google.android.gms.internal.mlkit_common.zzaq.zzg(this.zzb, this.zza, this);
        com.google.android.gms.internal.mlkit_common.zzag zzagVar2 = this.zzc;
        if (zzagVar2 == null) {
            return zzg;
        }
        throw zzagVar2.zza();
    }
}
