package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaju extends com.google.android.gms.internal.ads.zzajo {
    public final java.lang.String zza;
    public final java.lang.String zzb;

    public zzaju(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzaju zzajuVar = (com.google.android.gms.internal.ads.zzaju) obj;
            if (this.zzf.equals(zzajuVar.zzf) && java.util.Objects.equals(this.zza, zzajuVar.zza) && java.util.Objects.equals(this.zzb, zzajuVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        java.lang.String str = this.zza;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final java.lang.String toString() {
        java.lang.String str = this.zzf;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 6 + str2.length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }
}
