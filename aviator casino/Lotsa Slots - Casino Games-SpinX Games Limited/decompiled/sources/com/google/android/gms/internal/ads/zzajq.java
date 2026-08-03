package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzajq extends com.google.android.gms.internal.ads.zzajo {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;

    public zzajq(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super("----");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzajq zzajqVar = (com.google.android.gms.internal.ads.zzajq) obj;
            if (java.util.Objects.equals(this.zzb, zzajqVar.zzb) && java.util.Objects.equals(this.zza, zzajqVar.zza) && java.util.Objects.equals(this.zzc, zzajqVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final java.lang.String toString() {
        java.lang.String str = this.zzf;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zza;
        int length2 = length + 9 + str2.length();
        java.lang.String str3 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length2 + 14 + str3.length());
        sb.append(str);
        sb.append(": domain=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }
}
