package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzbd {
    public final java.lang.String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbd(java.lang.String str, double d, double d2, double d3, int i) {
        this.zza = str;
        this.zzc = d;
        this.zzb = d2;
        this.zzd = d3;
        this.zze = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.ads.internal.util.zzbd)) {
            return false;
        }
        com.google.android.gms.ads.internal.util.zzbd zzbdVar = (com.google.android.gms.ads.internal.util.zzbd) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, zzbdVar.zza) && this.zzb == zzbdVar.zzb && this.zzc == zzbdVar.zzc && this.zze == zzbdVar.zze && java.lang.Double.compare(this.zzd, zzbdVar.zzd) == 0;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Double.valueOf(this.zzb), java.lang.Double.valueOf(this.zzc), java.lang.Double.valueOf(this.zzd), java.lang.Integer.valueOf(this.zze));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("name", this.zza).add("minBound", java.lang.Double.valueOf(this.zzc)).add("maxBound", java.lang.Double.valueOf(this.zzb)).add("percent", java.lang.Double.valueOf(this.zzd)).add(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, java.lang.Integer.valueOf(this.zze)).toString();
    }
}
