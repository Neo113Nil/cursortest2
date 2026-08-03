package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzak {
    java.lang.Object[] zza = new java.lang.Object[8];
    int zzb = 0;
    com.google.android.gms.internal.play_billing.zzaj zzc;

    public final com.google.android.gms.internal.play_billing.zzak zza(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.zzb + 1;
        java.lang.Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = java.lang.Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.zza = java.util.Arrays.copyOf(objArr, i3);
        }
        com.google.android.gms.internal.play_billing.zzad.zza(obj, obj2);
        java.lang.Object[] objArr2 = this.zza;
        int i4 = this.zzb;
        int i5 = i4 + i4;
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        this.zzb = i4 + 1;
        return this;
    }

    public final com.google.android.gms.internal.play_billing.zzal zzb() {
        com.google.android.gms.internal.play_billing.zzaj zzajVar = this.zzc;
        if (zzajVar != null) {
            throw zzajVar.zza();
        }
        com.google.android.gms.internal.play_billing.zzat zzg = com.google.android.gms.internal.play_billing.zzat.zzg(this.zzb, this.zza, this);
        com.google.android.gms.internal.play_billing.zzaj zzajVar2 = this.zzc;
        if (zzajVar2 == null) {
            return zzg;
        }
        throw zzajVar2.zza();
    }
}
