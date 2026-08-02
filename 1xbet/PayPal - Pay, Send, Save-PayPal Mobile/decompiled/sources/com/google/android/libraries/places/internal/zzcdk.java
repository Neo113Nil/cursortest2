package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcdk {
    private int zza;
    private final int[] zzb = new int[10];

    public final com.google.android.libraries.places.internal.zzcdk zza(int i, int i2, int i3) {
        if (i >= 10) {
            return this;
        }
        this.zza = (1 << i) | this.zza;
        this.zzb[i] = i3;
        return this;
    }

    public final int zzc(int i) {
        return this.zzb[i];
    }

    final int zzd() {
        return java.lang.Integer.bitCount(this.zza);
    }

    final int zzf(int i) {
        return (this.zza & 32) != 0 ? this.zzb[5] : i;
    }

    final int zze() {
        if ((this.zza & 2) != 0) {
            return this.zzb[1];
        }
        return -1;
    }

    public final boolean zzb(int i) {
        return ((1 << i) & this.zza) != 0;
    }
}
