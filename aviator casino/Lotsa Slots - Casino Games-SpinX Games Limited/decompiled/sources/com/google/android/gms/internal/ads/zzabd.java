package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzabd {
    private final int[] zza;
    private final com.google.android.gms.internal.ads.zzzn[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final com.google.android.gms.internal.ads.zzzn zze;

    zzabd(java.lang.String[] strArr, int[] iArr, com.google.android.gms.internal.ads.zzzn[] zzznVarArr, int[] iArr2, int[][][] iArr3, com.google.android.gms.internal.ads.zzzn zzznVar) {
        this.zza = iArr;
        this.zzb = zzznVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzznVar;
    }

    public final int zza(int i) {
        return this.zza[i];
    }

    public final com.google.android.gms.internal.ads.zzzn zzb(int i) {
        return this.zzb[i];
    }

    public final int zzc(int i, int i2, int i3) {
        return this.zzd[i][i2][i3];
    }

    public final int zzd(int i, int i2, boolean z) {
        com.google.android.gms.internal.ads.zzzn[] zzznVarArr = this.zzb;
        int i3 = zzznVarArr[i].zza(i2).zza;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if ((this.zzd[i][i2][i6] & 7) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] copyOf = java.util.Arrays.copyOf(iArr, i5);
        java.lang.String str = null;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 16;
        while (i4 < copyOf.length) {
            java.lang.String str2 = zzznVarArr[i].zza(i2).zza(copyOf[i4]).zzp;
            int i9 = i7 + 1;
            if (i7 == 0) {
                str = str2;
            } else {
                z2 |= !java.util.Objects.equals(str, str2);
            }
            i8 = java.lang.Math.min(i8, this.zzd[i][i2][i4] & 24);
            i4++;
            i7 = i9;
        }
        return z2 ? java.lang.Math.min(i8, this.zzc[i]) : i8;
    }

    public final com.google.android.gms.internal.ads.zzzn zze() {
        return this.zze;
    }
}
