package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public final class zzac extends com.google.android.gms.internal.mlkit_common.zzz {
    public zzac() {
        super(4);
    }

    public final com.google.android.gms.internal.mlkit_common.zzaf zzc() {
        this.zzc = true;
        return com.google.android.gms.internal.mlkit_common.zzaf.zzg(this.zza, this.zzb);
    }

    public final com.google.android.gms.internal.mlkit_common.zzac zzb(java.lang.Object obj) {
        obj.getClass();
        int i = this.zzb + 1;
        java.lang.Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i) {
            this.zza = java.util.Arrays.copyOf(objArr, com.google.android.gms.internal.mlkit_common.zzz.zza(length, i));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (java.lang.Object[]) objArr.clone();
            this.zzc = false;
        }
        java.lang.Object[] objArr2 = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        objArr2[i2] = obj;
        return this;
    }
}
