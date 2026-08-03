package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzzw implements com.google.android.gms.internal.ads.zzaba {
    protected final com.google.android.gms.internal.ads.zzbg zza;
    protected final int zzb;
    protected final int[] zzc;
    private final com.google.android.gms.internal.ads.zzv[] zzd;
    private int zze;

    public zzzw(com.google.android.gms.internal.ads.zzbg zzbgVar, int[] iArr, int i) {
        int length = iArr.length;
        com.google.android.gms.internal.ads.zzgtj.zzi(length > 0);
        zzbgVar.getClass();
        this.zza = zzbgVar;
        this.zzb = length;
        this.zzd = new com.google.android.gms.internal.ads.zzv[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzbgVar.zza(iArr[i2]);
        }
        java.util.Arrays.sort(this.zzd, com.google.android.gms.internal.ads.zzzv.zza);
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzbgVar.zzb(this.zzd[i3]);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzzw zzzwVar = (com.google.android.gms.internal.ads.zzzw) obj;
            if (this.zza.equals(zzzwVar.zza) && java.util.Arrays.equals(this.zzc, zzzwVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (java.lang.System.identityHashCode(this.zza) * 31) + java.util.Arrays.hashCode(this.zzc);
        this.zze = identityHashCode;
        return identityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public final com.google.android.gms.internal.ads.zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public final com.google.android.gms.internal.ads.zzv zzb(int i) {
        return this.zzd[i];
    }

    @Override // com.google.android.gms.internal.ads.zzaba
    public final com.google.android.gms.internal.ads.zzv zzc() {
        return this.zzd[0];
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public final int zze() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public final int zzf(int i) {
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public final int zzg(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaba
    public final int zzh() {
        return this.zzc[0];
    }
}
