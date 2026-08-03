package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final class zzgd extends com.google.android.gms.internal.games_v2.zzga {
    public zzgd() {
        super(4);
    }

    public final com.google.android.gms.internal.games_v2.zzgg zzb() {
        this.zzc = true;
        java.lang.Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = com.google.android.gms.internal.games_v2.zzgg.zzd;
        return i == 0 ? com.google.android.gms.internal.games_v2.zzgh.zza : new com.google.android.gms.internal.games_v2.zzgh(objArr, i);
    }

    public final com.google.android.gms.internal.games_v2.zzgd zza(java.lang.Object obj) {
        obj.getClass();
        int i = this.zzb;
        int i2 = i + 1;
        java.lang.Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i2) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = java.lang.Integer.highestOneBit(i);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.zza = java.util.Arrays.copyOf(objArr, i3);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (java.lang.Object[]) objArr.clone();
            this.zzc = false;
        }
        java.lang.Object[] objArr2 = this.zza;
        int i4 = this.zzb;
        this.zzb = i4 + 1;
        objArr2[i4] = obj;
        return this;
    }
}
