package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zza {
    public final long zza;
    public final int zzb;

    @java.lang.Deprecated
    public final android.net.Uri[] zzc;
    public final com.google.android.gms.internal.ads.zzak[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final java.lang.String[] zzg;
    public final com.google.android.gms.internal.ads.zzb[] zzh;
    public final long zzi;
    public final boolean zzj;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
        java.lang.Integer.toString(6, 36);
        java.lang.Integer.toString(7, 36);
        java.lang.Integer.toString(8, 36);
        java.lang.Integer.toString(9, 36);
        java.lang.Integer.toString(10, 36);
        java.lang.Integer.toString(11, 36);
    }

    public zza(long j) {
        this(0L, -1, -1, new int[0], new com.google.android.gms.internal.ads.zzak[0], new long[0], 0L, false, new java.lang.String[0], new com.google.android.gms.internal.ads.zzb[0], false);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zza zzaVar = (com.google.android.gms.internal.ads.zza) obj;
            if (this.zzb == zzaVar.zzb && java.util.Arrays.equals(this.zzd, zzaVar.zzd) && java.util.Arrays.equals(this.zze, zzaVar.zze) && java.util.Arrays.equals(this.zzf, zzaVar.zzf) && java.util.Arrays.equals(this.zzg, zzaVar.zzg) && java.util.Arrays.equals(this.zzh, zzaVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zzb * 31) - 1) * 961) + java.util.Arrays.hashCode(this.zzd)) * 31) + java.util.Arrays.hashCode(this.zze)) * 31) + java.util.Arrays.hashCode(this.zzf)) * 29791) + java.util.Arrays.hashCode(this.zzg)) * 31) + java.util.Arrays.hashCode(this.zzh)) * 31;
    }

    public final int zza(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final com.google.android.gms.internal.ads.zza zzb(int i) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int max = java.lang.Math.max(0, length);
        int[] copyOf = java.util.Arrays.copyOf(iArr, max);
        java.util.Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int max2 = java.lang.Math.max(0, length2);
        long[] copyOf2 = java.util.Arrays.copyOf(jArr, max2);
        java.util.Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        com.google.android.gms.internal.ads.zzak[] zzakVarArr = (com.google.android.gms.internal.ads.zzak[]) java.util.Arrays.copyOf(this.zzd, 0);
        java.lang.String[] strArr = (java.lang.String[]) java.util.Arrays.copyOf(this.zzg, 0);
        com.google.android.gms.internal.ads.zzb[] zzbVarArr = this.zzh;
        return new com.google.android.gms.internal.ads.zza(0L, 0, -1, copyOf, zzakVarArr, copyOf2, 0L, false, strArr, (com.google.android.gms.internal.ads.zzb[]) java.util.Arrays.copyOf(zzbVarArr, java.lang.Math.max(0, zzbVarArr.length)), false);
    }

    private zza(long j, int i, int i2, int[] iArr, com.google.android.gms.internal.ads.zzak[] zzakVarArr, long[] jArr, long j2, boolean z, java.lang.String[] strArr, com.google.android.gms.internal.ads.zzb[] zzbVarArr, boolean z2) {
        android.net.Uri uri;
        int length = iArr.length;
        int length2 = zzakVarArr.length;
        int i3 = 0;
        com.google.android.gms.internal.ads.zzgtj.zza(length == length2);
        com.google.android.gms.internal.ads.zzgtj.zza(length == zzbVarArr.length);
        this.zza = 0L;
        this.zzb = i;
        this.zze = iArr;
        this.zzd = zzakVarArr;
        this.zzf = jArr;
        this.zzi = 0L;
        this.zzj = false;
        this.zzc = new android.net.Uri[length2];
        while (true) {
            android.net.Uri[] uriArr = this.zzc;
            if (i3 >= uriArr.length) {
                this.zzg = strArr;
                this.zzh = zzbVarArr;
                return;
            }
            com.google.android.gms.internal.ads.zzak zzakVar = zzakVarArr[i3];
            if (zzakVar == null) {
                uri = null;
            } else {
                com.google.android.gms.internal.ads.zzag zzagVar = zzakVar.zzb;
                zzagVar.getClass();
                uri = zzagVar.zza;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }
}
