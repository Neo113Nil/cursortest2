package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbm {
    public final int zza;
    private final com.google.android.gms.internal.ads.zzbg zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
    }

    public zzbm(com.google.android.gms.internal.ads.zzbg zzbgVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = zzbgVar.zza;
        this.zza = i;
        com.google.android.gms.internal.ads.zzgtj.zza(i == iArr.length && i == zArr.length);
        this.zzb = zzbgVar;
        this.zzc = z && i > 1;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzbm zzbmVar = (com.google.android.gms.internal.ads.zzbm) obj;
            if (this.zzc == zzbmVar.zzc && this.zzb.equals(zzbmVar.zzb) && java.util.Arrays.equals(this.zzd, zzbmVar.zzd) && java.util.Arrays.equals(this.zze, zzbmVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zzb.hashCode() * 31) + (this.zzc ? 1 : 0)) * 31) + java.util.Arrays.hashCode(this.zzd)) * 31) + java.util.Arrays.hashCode(this.zze);
    }

    public final com.google.android.gms.internal.ads.zzv zza(int i) {
        return this.zzb.zza(i);
    }

    public final boolean zzb() {
        for (boolean z : this.zze) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(int i) {
        return this.zze[i];
    }

    public final int zzd() {
        return this.zzb.zzc;
    }
}
