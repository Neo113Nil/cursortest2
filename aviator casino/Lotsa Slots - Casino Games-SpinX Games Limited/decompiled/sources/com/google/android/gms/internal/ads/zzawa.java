package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzawa {
    public final java.util.ArrayDeque zza = new java.util.ArrayDeque();

    public zzawa(int i) {
    }

    public final void zza(long j, long j2, long j3) throws com.google.android.gms.internal.ads.zzavy {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        com.google.android.gms.internal.ads.zzavx zzavxVar = new com.google.android.gms.internal.ads.zzavx(j, j2, j3);
        java.util.ArrayDeque arrayDeque = this.zza;
        if (arrayDeque.size() >= ((i8 % 452867621) ^ i9)) {
            throw new com.google.android.gms.internal.ads.zzavy();
        }
        arrayDeque.push(zzavxVar);
    }

    public final com.google.android.gms.internal.ads.zzavx zzb() throws com.google.android.gms.internal.ads.zzavz {
        return (com.google.android.gms.internal.ads.zzavx) java.util.Optional.ofNullable((com.google.android.gms.internal.ads.zzavx) this.zza.peek()).orElseThrow(com.google.android.gms.internal.ads.zzavw.zza);
    }
}
