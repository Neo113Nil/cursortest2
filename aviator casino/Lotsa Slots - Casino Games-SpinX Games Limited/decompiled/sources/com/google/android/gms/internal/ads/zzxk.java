package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzxk {
    public final java.lang.Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzxk(java.lang.Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private zzxk(java.lang.Object obj, int i, int i2, long j, int i3) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = i3;
    }

    public zzxk(java.lang.Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzxk)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzxk zzxkVar = (com.google.android.gms.internal.ads.zzxk) obj;
        return this.zza.equals(zzxkVar.zza) && this.zzb == zzxkVar.zzb && this.zzc == zzxkVar.zzc && this.zzd == zzxkVar.zzd && this.zze == zzxkVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final com.google.android.gms.internal.ads.zzxk zza(java.lang.Object obj) {
        return this.zza.equals(obj) ? this : new com.google.android.gms.internal.ads.zzxk(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzxk(java.lang.Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
