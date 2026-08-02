package com.google.android.gms.internal.identity_googleid;

/* loaded from: classes8.dex */
public final class zzg extends com.google.android.gms.internal.identity_googleid.zzd {
    public zzg() {
        super(4);
    }

    public final com.google.android.gms.internal.identity_googleid.zzg zza(java.lang.Object obj) {
        int i;
        int length = this.zza.length;
        int i2 = this.zzb;
        int i3 = i2 + 1;
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i3 <= length) {
            i = length;
        } else {
            i = (length >> 1) + length + 1;
            if (i < i3) {
                int highestOneBit = java.lang.Integer.highestOneBit(i2);
                i = highestOneBit + highestOneBit;
            }
            if (i < 0) {
                i = Integer.MAX_VALUE;
            }
        }
        if (i > length || this.zzc) {
            this.zza = java.util.Arrays.copyOf(this.zza, i);
            this.zzc = false;
        }
        java.lang.Object[] objArr = this.zza;
        int i4 = this.zzb;
        this.zzb = i4 + 1;
        objArr[i4] = obj;
        return this;
    }

    public final com.google.android.gms.internal.identity_googleid.zzj zzb() {
        this.zzc = true;
        java.lang.Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = com.google.android.gms.internal.identity_googleid.zzj.zzd;
        return i == 0 ? com.google.android.gms.internal.identity_googleid.zzk.zza : new com.google.android.gms.internal.identity_googleid.zzk(objArr, i);
    }
}
