package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaji extends com.google.android.gms.internal.ads.zzajo {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;

    public zzaji(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzaji zzajiVar = (com.google.android.gms.internal.ads.zzaji) obj;
            if (java.util.Objects.equals(this.zzb, zzajiVar.zzb) && java.util.Objects.equals(this.zza, zzajiVar.zza) && java.util.Objects.equals(this.zzc, zzajiVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.zza.hashCode() + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode();
        java.lang.String str = this.zzc;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final java.lang.String toString() {
        java.lang.String str = this.zzf;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzc;
        int length2 = java.lang.String.valueOf(str2).length();
        java.lang.String str3 = this.zza;
        int length3 = length + 11 + str3.length();
        java.lang.String str4 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length3 + 14 + str4.length() + 7 + length2);
        sb.append(str);
        sb.append(": language=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        sb.append(", text=");
        sb.append(str2);
        return sb.toString();
    }
}
