package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzajh extends com.google.android.gms.internal.ads.zzajo {
    public final java.lang.String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final java.lang.String[] zzd;
    private final com.google.android.gms.internal.ads.zzajo[] zze;

    public zzajh(java.lang.String str, boolean z, boolean z2, java.lang.String[] strArr, com.google.android.gms.internal.ads.zzajo[] zzajoVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzajoVarArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzajh zzajhVar = (com.google.android.gms.internal.ads.zzajh) obj;
            if (this.zzb == zzajhVar.zzb && this.zzc == zzajhVar.zzc && java.util.Objects.equals(this.zza, zzajhVar.zza) && java.util.Arrays.equals(this.zzd, zzajhVar.zzd) && java.util.Arrays.equals(this.zze, zzajhVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zzb ? 1 : 0) + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.zzc ? 1 : 0)) * 31) + this.zza.hashCode();
    }
}
